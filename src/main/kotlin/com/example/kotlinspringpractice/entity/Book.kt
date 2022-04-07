package com.example.kotlinspringpractice.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "book")
@Entity
class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    var idx: Long,
    @Column(name = "name")
    var name: String,
    @Column(name = "author")
    var author: String,
    @Column(name = "price")
    var price: Long
    ) {

}