package io.quarkus.it.panache.reactive.kotlin

import io.quarkus.hibernate.reactive.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
class PageItem : PanacheEntity() {
    companion object : PanacheCompanion<PageItem>
}
