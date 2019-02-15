package com.octo.formation.service;

import com.octo.formation.dto.VirementDto;
import com.octo.formation.exceptions.SoldeDisponibleInsuffisantException;
import com.octo.formation.repository.CompteRepository;
import com.octo.formation.repository.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class VirementService {

    private final CompteRepository compteRepository;
    private final VirementRepository virementRepository;
    private final AutiService autiService;

    @Autowired
    public VirementService(CompteRepository compteRepository,
                           VirementRepository virementRepository,
                           AutiService autiService) {
        this.compteRepository = compteRepository;
        this.virementRepository = virementRepository;
        this.autiService = autiService;
    }

    public void virement(VirementDto virementDto) throws SoldeDisponibleInsuffisantException {

    }
}
