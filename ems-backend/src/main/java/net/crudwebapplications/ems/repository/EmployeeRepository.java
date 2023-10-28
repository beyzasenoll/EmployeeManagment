package net.crudwebapplications.ems.repository;

import net.crudwebapplications.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
//JpaRepository, Spring Data JPA tarafından sağlanan bir interface'dir ve birçok yaygın veritabanı işlemi için hazır metotları içerir. JpaRepository, temel CRUD (Create, Read, Update, Delete) işlemleri için hazır metotlara sahiptir.

//Employee: Bu, repository'nin yönettiği entity sınıfını temsil eder. Yani, bu repository üzerinden Employee entity sınıfındaki kayıtlarla etkileşimde bulunulacak.
//
//Long: Bu, entity sınıfının birincil anahtarının türünü temsil eder. Bu durumda, Employee sınıfının id alanı bir Long türündedir.
//
//Repository Katmanı ve Interface:
//Repository katmanı, genellikle veritabanı işlemleriyle ilgili mantığı içerir. EmployeeRepository interface'i, bu katmanda kullanılan metotların imzalarını tanımlar. Interface kullanılmasının nedeni, Spring Data JPA'nın otomatik olarak bu metotları implemente etmesine olanak tanımasıdır. Bu sayede geliştirici, temel CRUD işlemleri için özel bir uygulama yazma zorunluluğundan kurtulur.
//
//Örneğin, bu interface şu gibi hazır metotlara sahip olabilir: findById, findAll, save, delete, vb. Bu metotlar, entity sınıfındaki kayıtlarla ilgili sık kullanılan işlemleri gerçekleştirmek için kullanılır.