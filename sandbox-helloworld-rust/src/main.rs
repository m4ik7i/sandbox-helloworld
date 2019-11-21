use std::{error::Error, result};
type Result<T> = result::Result<T, Box<dyn Error>>;

fn main() -> Result<()> {
    println!("Hello, world!");

    Ok(())
}
