public class TestStartKanban {
    Kanban kanban;
    Runner runner;
    TestStartKanban(){
        init();
        runner = new Runner(kanban);
    }
    public void start(){
        for(int i = 0 ; i < 100; ++i){
            kanban.addTask(String.valueOf(i), i * 1000);
        }
        runner.run();

    }
    private void init(){
        kanban = new Kanban(4);
    }
}
