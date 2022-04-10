package com.example.kotlinspringpractice.entity

import java.util.*
import javax.persistence.*

@Table(name = "book")
@Entity
class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    var idx: Long = 0,


    @Column(name = "name")
    var name: String,

    @Column(name = "author")
    var author: String,

    @Column(name = "price")
    var price: Long
    ) {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt", insertable = false, updatable = false)
    lateinit var createdAt: Date
}