public interface Relatable {
        
    // this (object calling isLargerThan)
    // and other must be instances of 
    // the same class 
    // returns 1 is this is greater than other
    // returns -1 is this is less than other
    // returns 0 is this is equal to than other
    public int isLargerThan(Relatable other);
}
