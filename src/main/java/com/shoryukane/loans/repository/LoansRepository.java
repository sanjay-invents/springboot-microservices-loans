

package com.shoryukane.loans.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.shoryukane.loans.model.Loans;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long>
{
    List<Loans> findByCustomerIdOrderByStartDtDesc(final int customerId);
}
