public interface Prototype {
    public Prototype clone();
} 

public class PrimaryStrategy implements Prototype{
    public int version;

    public PrimaryStrategy(int version) {
        this.version = version;
    }
    // copy all fields from source to new object
    public PrimaryStrategy(PrimaryStrategy source){
        this.version = source.getVersion();
    }

    public int getVersion(){
        return this.version;
    }

    //deep copy 
    @Override
    public Prototype clone(){
        return new PrimaryStrategy(this); 
    }
}

public class ComplexObject {
    private PrimaryStrategy primaryStrategy; 
    private SecondaryStrategy secondaryStrategy;
    // The strategies are created by calling a network
    // socket that takes on average 1.7 seconds to respond 
    public ComplexObject(primaryStrategy, secondaryStrategy) {
    this.primaryStrategy = primaryStrategy;
    this.secondaryStrategy = secondaryStrategy; }
        // A lot of operations, accessors, and mutators
        public ComplexObject copy() {
            return new ComplexObject(primaryStrategy, secondaryStrategy);
        }

        //PrimaryStrategy without Prototype implemented
        public ComplexObject cloneWithPrototype() { 
            return new ComplexObject(new PrimaryStrategy(this.primaryStrategy.version),
                                     secondaryStrategy);
        }

        //PrimaryStrategy with Prototype implemented
        public ComplexObject clone() {
            return new ComplexObject( this.primaryStrategy.copy(), //asking PrimaryStrategy to give a deep clone
                                        this.secondaryStrategy);
        }       
}