package com.example.toy.storage.book

import com.example.toy.storage.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Table


// Base Entity 외에는 constructor에 column들 생성해줌
// Base Entity 는 db에 들어가면 생기기 때문에 생성자에 있을 필요 없음
// Entity 는 data class를 사용하지 않는 것이 좋음. data class 는 toString, toEqual 등이 생성되는데,
// 연관관계가 있는 경우 재귀적으로 호출될 가능성이 있음.
// 변경 될 수 있는 애들은 var 로 선언해서 dirty checking 가능하도록
@Entity
@Table(name="book")
class BookEntity(
        @Column
        var name: String
) :BaseEntity() {

}