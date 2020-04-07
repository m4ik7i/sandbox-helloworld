; ModuleID = 'main'

declare i32 @puts(i8*)

@hello = constant [14 x i8] c"Hello, world!\00"

define i32 @main() {
    %hello_ptr = getelementptr [14 x i8], [14 x i8]* @hello, i32 0, i32 0
    call i32 @puts(i8* %hello_ptr)
    ret i32 0
}
