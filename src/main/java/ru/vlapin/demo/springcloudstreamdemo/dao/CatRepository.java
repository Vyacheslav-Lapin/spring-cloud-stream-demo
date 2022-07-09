package ru.vlapin.demo.springcloudstreamdemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.springcloudstreamdemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
