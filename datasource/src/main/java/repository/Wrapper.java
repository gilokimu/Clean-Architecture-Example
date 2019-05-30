package repository;

import java.util.Optional;

public class Wrapper<T>{
    public T unwrap(Optional<T> optional){
        if (!optional.isPresent())
            return null;

        return optional.get();
    }

}
