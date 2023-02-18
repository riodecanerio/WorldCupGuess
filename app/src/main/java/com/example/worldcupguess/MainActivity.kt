package com.example.worldcupguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.example.worldcupguess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var ceyrek1 =0
        var ceyrek2 =0
        var cey1 =0
        var cey2 =0
        var yari1 =0

        binding.imageHollanda.setOnClickListener {

            ceyrek1 =1
            binding.imageYari.setImageDrawable(getDrawable(R.drawable.nl))

        }

        binding.imageArjantin.setOnClickListener {

            ceyrek1 =2
            binding.imageYari.setImageDrawable(getDrawable(R.drawable.ar))

        }

        binding.imageHirvat.setOnClickListener {

            ceyrek2 =1
            binding.imageYari2.setImageDrawable(getDrawable(R.drawable.hr))

        }

        binding.imageBrezilya.setOnClickListener {

            ceyrek2=2
            binding.imageYari2.setImageDrawable(getDrawable(R.drawable.br))

        }

        binding.imageYari.setOnClickListener {

            if (ceyrek1==1){
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.nl))
                yari1 =1

            } else if (ceyrek1==2){
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.ar))
                yari1 =2

            }

            binding.imageHollanda.setOnClickListener {
                ceyrek1 =1
                binding.imageYari.setImageDrawable(getDrawable(R.drawable.nl))
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.star))
            }

            binding.imageArjantin.setOnClickListener {
                ceyrek1 =2
                binding.imageYari.setImageDrawable(getDrawable(R.drawable.ar))
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.star))
            }

        }

        binding.imageYari2.setOnClickListener {

            if (ceyrek2==1){
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.hr))

            } else if (ceyrek2==2){
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.br))

            }

            binding.imageHirvat.setOnClickListener {
                ceyrek2 = 1
                binding.imageYari2.setImageDrawable(getDrawable(R.drawable.hr))
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.star))
            }

            binding.imageBrezilya.setOnClickListener {
                ceyrek2 =2
                binding.imageYari2.setImageDrawable(getDrawable(R.drawable.br))
                binding.imageFinal.setImageDrawable(getDrawable(R.drawable.star))
            }

        }


        binding.imageIng.setOnClickListener {

            cey1 =1
            binding.imageYari3.setImageDrawable(getDrawable(R.drawable.eng))

        }

        binding.imageFransa.setOnClickListener {

            cey1 =2
            binding.imageYari3.setImageDrawable(getDrawable(R.drawable.fr))

        }

        binding.imageFas.setOnClickListener {

            cey2 =1
            binding.imageYari4.setImageDrawable(getDrawable(R.drawable.ma))

        }

        binding.imagePortekiz.setOnClickListener {

            cey2=2
            binding.imageYari4.setImageDrawable(getDrawable(R.drawable.pt))

        }

        binding.imageYari3.setOnClickListener {

            if (cey1==1){
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.eng))

            } else if (cey1==2){
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.fr))

            }

            binding.imageIng.setOnClickListener {
                cey1 =1
                binding.imageYari3.setImageDrawable(getDrawable(R.drawable.ing))
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.star))
            }

            binding.imageFransa.setOnClickListener {
                cey1 =2
                binding.imageYari3.setImageDrawable(getDrawable(R.drawable.fr))
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.star))
            }

        }

        binding.imageYari4.setOnClickListener {

            if (cey2==1){
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.ma))

            } else if (cey2==2){
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.pt))

            }

            binding.imageFas.setOnClickListener {
                cey2 = 1
                binding.imageYari4.setImageDrawable(getDrawable(R.drawable.ma))
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.star))
            }

            binding.imagePortekiz.setOnClickListener {
                cey2 =2
                binding.imageYari4.setImageDrawable(getDrawable(R.drawable.pt))
                binding.imageFinal2.setImageDrawable(getDrawable(R.drawable.star))
            }

            binding.imageFinal.setOnClickListener {

                if (yari1==1){
                    binding.imageChamp.setImageDrawable(getDrawable(R.drawable.nl))
                }
                if (yari1==2){
                    binding.imageChamp.setImageDrawable(getDrawable(R.drawable.ar))
                }

            }


        }



    }
}


