// Facade Pattern Code 
class Facade {
    private SubsystemA a = new SubsystemA();
    private SubsystemB b = new SubsystemB();

    public void operation() {
        a.operationA();
        b.operationB();
    }
}