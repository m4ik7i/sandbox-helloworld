use wasmer_runtime::{error, func, imports, instantiate, Array, Ctx, WasmPtr};

static WASM: &'static [u8] =
    include_bytes!("../wasm/target/wasm32-unknown-unknown/release/hello_world_wasm.wasm");

fn main() -> error::Result<()> {
    let import_object = imports! {
        "env" => {
            "print_str" => func!(print_str),
        },
    };

    let instance = instantiate(WASM, &import_object)?;

    instance.call("hello", &[])?;

    Ok(())
}

fn print_str(ctx: &mut Ctx, ptr: WasmPtr<u8, Array>, len: u32) {
    let memory = ctx.memory(0);
    let string = ptr.get_utf8_string(memory, len).unwrap();
    println!("{}", string);
}
