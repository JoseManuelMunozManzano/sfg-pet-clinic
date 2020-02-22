package com.neimerc.sfgpetclinic.services;

import com.neimerc.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
