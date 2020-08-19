package com.flix.movie.data.common

interface EntityMapper<Entity, DomainEntity> {
    fun mapFromEntity(entity: Entity): DomainEntity

    fun mapToEntity(domainEntity: DomainEntity): Entity
}