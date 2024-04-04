package com.app.thehistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEnterAge = findViewById<EditText>(R.id.etEnterAge).text

        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val tvResults = findViewById<TextView>(R.id.tvResults)

        btnClear.setOnClickListener {
            etEnterAge.clear()
        }

        btnGenerate.setOnClickListener {
          var message: String = ""
            when(etEnterAge.toString()) {

                "50" -> message = "You are ${etEnterAge.toString()} : You are the same age as Michael Jackson, Michael was an American Singer and Dancer "
                "75" -> message = "You are ${etEnterAge.toString()} : You are the same age as Oliver Tambo, Oliver was a South African qualified Attorney and Activist "
                "29" -> message = "You are ${etEnterAge.toString()} : You are the same age as Lebo Mathosa, Lebo was a South African Actress and Singer "
                "39" -> message = "You are ${etEnterAge.toString()} : You are the same age as Brenda Fassie, Brenda was a famous Singer "
                "36" -> message = "You are ${etEnterAge.toString()} : You are the same age as Zahara, Zahara was a South African Guitarist "
                "43" -> message = "You are ${etEnterAge.toString()} : You are the same age as Chadwick Boseman, Chadwick was an American Actor "
                "23" -> message = "You are ${etEnterAge.toString()} : You are the same age as Killer Kau, Killer was a South African Record Producer "
                "69" -> message = "You are ${etEnterAge.toString()} : You are the same age as David Bowie, David was an American English Singer and Musician "
                "90" -> message = "You are ${etEnterAge.toString()} : You are the same age as Desmond Tutu, Desmond was an South African Anglican bishop "
                "81" -> message = "You are ${etEnterAge.toString()} : You are the same age as Winnie Mandela, Winnie was a South African anti-apartheid activist "
                else -> message = "The age ${etEnterAge} is invalid. Please re-enter another age"
            }
            tvResults.text = "Hey ${message}"

    }
    }
}