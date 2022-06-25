/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.customers.access;
import co.unicauca.customers.domain.entity.Customer;
import java.util.List;
/**
 * Interface de los servicios del repositorio
 *
 * @author Libardo, Julio
 */
public interface ICustomerRepository {

 Customer findById(Integer id);
 boolean create(Customer newCustomer);
 boolean update(Customer newCustomer);
 boolean delete(Integer id);
 public List<Customer> findAll();
}