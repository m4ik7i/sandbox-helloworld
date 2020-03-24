extern "C" {
    fn print_str(ptr: *const u8, len: usize);
}

static HELLO: &'static str = "Hello, world!";

#[no_mangle]
pub fn hello() {
    unsafe {
        print_str(HELLO.as_ptr(), HELLO.len());
    }
}
