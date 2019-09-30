package lemubit.academy.springmicroserviceeurekaclient;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}
