object FirstClassFunction {
    def main(args: Array[String]){
        val add = (x:Int) => {
            val _add = (y:Int) => y + 5
            _add(x)
        }

        val func = add
        printf("add=%s\n", add(1))
        printf("add=%s\n", add(2))
        printf("func=%s\n", func(1))
    }
}
