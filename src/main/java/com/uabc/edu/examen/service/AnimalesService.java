package com.uabc.edu.examen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.uabc.edu.examen.exception.RecordNotFoundException;
import com.uabc.edu.examen.model.AnimalesEntity;
import com.uabc.edu.examen.repository.AnimalesRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AnimalesService {

    @Autowired
    AnimalesRepository repository;

    public List<AnimalesEntity> getAllAnimales()
    {
        List<AnimalesEntity> result = (List<AnimalesEntity>) repository.findAll();

        if(result.size() > 0)
        {
            return result;
        }else{
            return new ArrayList<AnimalesEntity>();
        }
    }
    public AnimalesEntity getAnimalesById(Long id) throws RecordNotFoundException
    {
        Optional<AnimalesEntity> animales = repository.findById(id);

        if(animales.isPresent())
        {
            return animales.get();
        }else{
            throw new RecordNotFoundException("No existe ningun ID");
        }
    }

    public AnimalesEntity createOrUpdateAnimales(AnimalesEntity animalentity)
    {
        if(animalentity.getId() == null)
        {
            animalentity = repository.save(animalentity);

            return animalentity;
        }else{
            Optional<AnimalesEntity> animales = repository.findById(animalentity.getId());

            if(animales.isPresent())
            {
                AnimalesEntity newAnimales = animales.get();
                newAnimales.setNombre(animalentity.getNombre());
                newAnimales.setRaza(animalentity.getRaza());
                newAnimales.setColor(animalentity.getColor());
                newAnimales.setPelaje(animalentity.getPelaje());
                newAnimales.setFechaNacimiento(animalentity.getFechaNacimiento());
                newAnimales.setVacunas(animalentity.getVacunas());
                newAnimales.setAdopcion(animalentity.getAdopcion());
                newAnimales.setNombreAdopcion(animalentity.getNombreAdopcion());
                newAnimales.setTipo(animalentity.getTipo());

                newAnimales = repository.save(newAnimales);

                return newAnimales;
            }else{
                animalentity = repository.save(animalentity);

                return animalentity;
            }
        }
    }

    public void deleteAnimalesById(Long id) throws RecordNotFoundException
    {
        Optional<AnimalesEntity> animales = repository.findById(id);

        if(animales.isPresent())
        {
            repository.deleteById(id);
        }else{
            throw new RecordNotFoundException("No existe la Id");
        }
    }
}
