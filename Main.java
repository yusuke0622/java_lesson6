public class Main {
    public static void main(String[] args) {
        Transferable[] parts = {
            new Switch(),
            new Router()
        };

        //上記の配列（parts)の要素がworkに入る
        for(Transferable work : parts) {
            work.transfer();
        }
    }
}