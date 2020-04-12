package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.Role;

import java.util.HashSet;
import java.util.Set;


public interface RoleRepository extends JpaRepository<Role, Long> {
    default Set getAuthorityById(Long id) {
        Set<Role> userRole = new HashSet<>();
        Role role = getOne(id);
        userRole.add(role);

        return userRole;
    }
}