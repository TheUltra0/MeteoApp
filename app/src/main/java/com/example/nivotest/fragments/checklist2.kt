package com.example.nivotest.fragments

import android.os.Build
import android.os.Bundle
import android.view.*
import android.webkit.WebStorage
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.nivotest.R
import com.example.nivotest.SharedViewModel
import kotlinx.android.synthetic.main.fragment_checklist1.*
import kotlinx.android.synthetic.main.fragment_checklist2.*
import kotlinx.android.synthetic.main.restore.view.*

class checklist2 : Fragment() {
    private lateinit var sharedViewModel: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view= inflater.inflate(R.layout.fragment_checklist2, container, false)

        return view
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        var m=1
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                button.isEnabled = true
            } else {
                button.isEnabled = false
            }
        }
        button.setOnClickListener {
            const2.isVisible = false
            const1.isVisible = true
            sharedViewModel.savenumber3(m)
        }
        sharedViewModel.r42.observe(viewLifecycleOwner, {r->
            if(r==1){
                const2.isVisible = false
                const1.isVisible = true
            }
        })

        val param1 = textView01.layoutParams as ViewGroup.MarginLayoutParams
        val param2 = textView02.layoutParams as ViewGroup.MarginLayoutParams
        val param3 = textView03.layoutParams as ViewGroup.MarginLayoutParams
        val param4 = textView04.layoutParams as ViewGroup.MarginLayoutParams
        val param5 = textView05.layoutParams as ViewGroup.MarginLayoutParams
        val param6 = textView06.layoutParams as ViewGroup.MarginLayoutParams
        val param7 = textView07.layoutParams as ViewGroup.MarginLayoutParams
        val param8 = textView08.layoutParams as ViewGroup.MarginLayoutParams
        val param9 = textView09.layoutParams as ViewGroup.MarginLayoutParams
        val param10 = textView010.layoutParams as ViewGroup.MarginLayoutParams
        val param11 = textView011.layoutParams as ViewGroup.MarginLayoutParams
        val param12 = textView012.layoutParams as ViewGroup.MarginLayoutParams
        val param13 = textView013.layoutParams as ViewGroup.MarginLayoutParams


        var m1 = 0
        var m2 = 0
        var m3 = 0
        var m4 = 0
        var m5 = 0
        var m6 = 0
        var m7 = 0
        var m8 = 0
        var m9 = 0
        var m10 = 0
        var m11 = 0
        var m12 = 0
        var m13 = 0


        var list1 = arrayOf(
                textView01,
                textView02,
                textView03,
                textView04,
                textView05,
                textView06,
                textView07,
                textView08,
                textView09,
                textView010,
                textView011,
                textView012,
                textView013
        )
        var list2 = arrayOf(
                cpp01,
                cpp02,
                cpp03,
                cpp04,
                cpp05,
                cpp06,
                cpp07,
                cpp08,
                cpp09,
                cpp010,
                cpp011,
                cpp012,
                cpp013
        )
        var list3 = arrayOf(
                param1,
                param2,
                param3,
                param4,
                param5,
                param6,
                param7,
                param8,
                param9,
                param10,
                param11,
                param12,
                param13
        )
        imageButton2.setOnClickListener{
            val RestoreView = LayoutInflater.from(requireContext()).inflate(R.layout.restore, null)

            val mBuilder = AlertDialog.Builder(requireContext())
                    .setView(RestoreView)
            val RestoreAlert = mBuilder.show()
            RestoreView.nubuton.setOnClickListener {
                RestoreAlert.dismiss()
            }
        }
        fun pentrutoti() {
            radiogroup01.visibility = View.INVISIBLE
            radiogroup02.visibility = View.INVISIBLE
            radiogroup03.visibility = View.INVISIBLE
            radiogroup04.visibility = View.INVISIBLE
            radiogroup05.visibility = View.INVISIBLE
            radiogroup06.visibility = View.INVISIBLE
            radiogroup07.visibility = View.INVISIBLE
            radiogroup08.visibility = View.INVISIBLE
            radiogroup09.visibility = View.INVISIBLE
            radiogroup010.visibility = View.INVISIBLE
            radiogroup011.visibility = View.INVISIBLE
            radiogroup012.visibility = View.INVISIBLE
            radiogroup013.visibility = View.INVISIBLE


            list1[0].textSize = resources.getDimension(R.dimen.font_small)
            list2[0].setState(1, 100, 1000)
            list2[0].background = resources.getDrawable(R.color.white)
            list3[0].setMargins(15, 0, 0, 0)

            list1[1].textSize = resources.getDimension(R.dimen.font_small)
            list2[1].setState(1, 100, 1000)
            list2[1].background = resources.getDrawable(R.color.white)
            list3[1].setMargins(15, 0, 0, 0)

            list1[2].textSize = resources.getDimension(R.dimen.font_small)
            list2[2].setState(1, 100, 1000)
            list2[2].background = resources.getDrawable(R.color.white)
            list3[2].setMargins(15, 0, 0, 0)

            list1[3].textSize = resources.getDimension(R.dimen.font_small)
            list2[3].setState(1, 100, 1000)
            list2[3].background = resources.getDrawable(R.color.white)
            list3[3].setMargins(15, 0, 0, 0)

            list1[4].textSize = resources.getDimension(R.dimen.font_small)
            list2[4].setState(1, 100, 1000)
            list2[4].background = resources.getDrawable(R.color.white)
            list3[4].setMargins(15, 0, 0, 0)

            list1[5].textSize = resources.getDimension(R.dimen.font_small)
            list2[5].setState(1, 100, 1000)
            list2[5].background = resources.getDrawable(R.color.white)
            list3[5].setMargins(15, 0, 0, 0)

            list1[6].textSize = resources.getDimension(R.dimen.font_small)
            list2[6].setState(1, 100, 1000)
            list2[6].background = resources.getDrawable(R.color.white)
            list3[6].setMargins(15, 0, 0, 0)

            list1[7].textSize = resources.getDimension(R.dimen.font_small)
            list2[7].setState(1, 100, 1000)
            list2[7].background = resources.getDrawable(R.color.white)
            list3[7].setMargins(15, 0, 0, 0)

            list1[8].textSize = resources.getDimension(R.dimen.font_small)
            list2[8].setState(1, 100, 1000)
            list2[8].background = resources.getDrawable(R.color.white)
            list3[8].setMargins(15, 0, 0, 0)

            list1[9].textSize = resources.getDimension(R.dimen.font_small)
            list2[9].setState(1, 100, 1000)
            list2[9].background = resources.getDrawable(R.color.white)
            list3[9].setMargins(15, 0, 0, 0)

            list1[10].textSize = resources.getDimension(R.dimen.font_small)
            list2[10].setState(1, 100, 1000)
            list2[10].background = resources.getDrawable(R.color.white)
            list3[10].setMargins(15, 0, 0, 0)

            list1[11].textSize = resources.getDimension(R.dimen.font_small)
            list2[11].setState(1, 100, 1000)
            list2[11].background = resources.getDrawable(R.color.white)
            list3[11].setMargins(15, 0, 0, 0)

            list1[12].textSize = resources.getDimension(R.dimen.font_small)
            list2[12].setState(1, 100, 1000)
            list2[12].background = resources.getDrawable(R.color.white)
            list3[12].setMargins(15, 0, 0, 0)


        }
        cpp01.setOnClickListener {
            pentrutoti()
            radiogroup01.visibility = View.VISIBLE
            textView01.textSize = resources.getDimension(R.dimen.font_medium)
            cpp01.setState(1, 100, 2000)
            cpp01.background = resources.getDrawable(R.color.turcoaz)
            param1.setMargins(20, 20, 15, 20)
        }
        cpp02.setOnClickListener {
            pentrutoti()
            radiogroup02.visibility = View.VISIBLE
            textView02.textSize = resources.getDimension(R.dimen.font_medium)
            cpp02.setState(1, 100, 2000)
            cpp02.background = resources.getDrawable(R.color.turcoaz)
            param2.setMargins(20, 20, 15, 20)
        }
        cpp03.setOnClickListener {
            pentrutoti()
            radiogroup03.visibility = View.VISIBLE
            textView03.textSize = resources.getDimension(R.dimen.font_medium)
            cpp03.setState(1, 100, 2000)
            cpp03.background = resources.getDrawable(R.color.turcoaz)
            param3.setMargins(20, 20, 15, 20)
        }
        cpp04.setOnClickListener {
            pentrutoti()
            radiogroup04.visibility = View.VISIBLE
            textView04.textSize = resources.getDimension(R.dimen.font_medium)
            cpp04.setState(1, 100, 2000)
            cpp04.background = resources.getDrawable(R.color.turcoaz)
            param4.setMargins(20, 20, 15, 20)
        }
        cpp05.setOnClickListener {
            pentrutoti()
            radiogroup05.visibility = View.VISIBLE
            textView05.textSize = resources.getDimension(R.dimen.font_medium)
            cpp05.setState(1, 100, 2000)
            cpp05.background = resources.getDrawable(R.color.turcoaz)
            param5.setMargins(20, 20, 15, 20)
        }
        cpp06.setOnClickListener {
            pentrutoti()
            radiogroup06.visibility = View.VISIBLE
            textView06.textSize = resources.getDimension(R.dimen.font_medium)
            cpp06.setState(1, 100, 2000)
            cpp06.background = resources.getDrawable(R.color.turcoaz)
            param6.setMargins(20, 20, 15, 20)
        }

        cpp07.setOnClickListener {
            pentrutoti()
            radiogroup07.visibility = View.VISIBLE
            textView07.textSize = resources.getDimension(R.dimen.font_medium)
            cpp07.setState(1, 100, 2000)
            cpp07.background = resources.getDrawable(R.color.turcoaz)
            param7.setMargins(20, 20, 15, 20)
        }
        cpp08.setOnClickListener {
            pentrutoti()
            radiogroup08.visibility = View.VISIBLE
            textView08.textSize = resources.getDimension(R.dimen.font_medium)
            cpp08.setState(1, 100, 2000)
            cpp08.background = resources.getDrawable(R.color.turcoaz)
            param8.setMargins(20, 20, 15, 20)
        }
        cpp09.setOnClickListener {
            pentrutoti()
            radiogroup09.visibility = View.VISIBLE
            textView09.textSize = resources.getDimension(R.dimen.font_medium)
            cpp09.setState(1, 100, 2000)
            cpp09.background = resources.getDrawable(R.color.turcoaz)
            param9.setMargins(20, 20, 15, 20)
        }
        cpp010.setOnClickListener {
            pentrutoti()
            radiogroup010.visibility = View.VISIBLE
            textView010.textSize = resources.getDimension(R.dimen.font_medium)
            cpp010.setState(1, 100, 2000)
            cpp010.background = resources.getDrawable(R.color.turcoaz)
            param10.setMargins(20, 20, 15, 20)
        }
        cpp011.setOnClickListener {
            pentrutoti()
            radiogroup011.visibility = View.VISIBLE
            textView011.textSize = resources.getDimension(R.dimen.font_medium)
            cpp011.setState(1, 100, 2000)
            cpp011.background = resources.getDrawable(R.color.turcoaz)
            param11.setMargins(20, 20, 15, 20)
        }
        cpp012.setOnClickListener {
            pentrutoti()
            radiogroup012.visibility = View.VISIBLE
            textView012.textSize = resources.getDimension(R.dimen.font_medium)
            cpp012.setState(1, 100, 2000)
            cpp012.background = resources.getDrawable(R.color.turcoaz)
            param12.setMargins(20, 20, 15, 20)
        }
        cpp013.setOnClickListener {
            pentrutoti()
            radiogroup013.visibility = View.VISIBLE
            textView013.textSize = resources.getDimension(R.dimen.font_medium)
            cpp013.setState(1, 100, 2000)
            cpp013.background = resources.getDrawable(R.color.turcoaz)
            param13.setMargins(20, 20, 15, 20)
        }


        radio01.setOnClickListener {
            m1 = 0
            var string: String = m1.toString()
            sharedViewModel.saveNumber0(
                    m1,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText01.setText(string)
            cpp02.performClick()

        }
        radio02.setOnClickListener {
            m1 = -1
            var string: String = m1.toString()
            sharedViewModel.saveNumber0(
                    m1,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText01.setText(string)
            cpp02.performClick()
        }
        radio021.setOnClickListener {
            m2 = 0
            var string: String = m2.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    m2,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText02.setText(string)
            cpp03.performClick()
        }
        radio022.setOnClickListener {
            m2 = -1
            var string: String = m2.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    m2,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText02.setText(string)
            cpp03.performClick()
        }
        radio031.setOnClickListener {
            m3 = 0
            var string: String = m3.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    m3,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText03.setText(string)
            cpp04.performClick()
        }
        radio032.setOnClickListener {
            m3 = -1
            var string: String = m3.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    m3,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText03.setText(string)
            cpp04.performClick()
        }
        radio033.setOnClickListener {
            m3 = -2
            var string: String = m3.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    m3,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText03.setText(string)
            cpp04.performClick()
        }
        radio041.setOnClickListener {
            m4 = 0
            var string: String = m4.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    m4,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText04.setText(string)
            cpp05.performClick()
        }
        radio042.setOnClickListener {
            m4 = -1
            var string: String = m4.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    m4,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText04.setText(string)
            cpp05.performClick()
        }
        radio043.setOnClickListener {
            m4 = -2
            var string: String = m4.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    m4,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText04.setText(string)
            cpp05.performClick()
        }
        radio044.setOnClickListener {
            m4 = -3
            var string: String = m4.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    m4,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText04.setText(string)
            cpp05.performClick()
        }
        radio051.setOnClickListener {
            m5 = 0
            var string: String = m5.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    m5,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText05.setText(string)
            cpp06.performClick()
        }
        radio052.setOnClickListener {
            m5 = -1
            var string: String = m5.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    m5,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText05.setText(string)
            cpp06.performClick()
        }
        radio053.setOnClickListener {
            m5 = -2
            var string: String = m5.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    m5,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText05.setText(string)
            cpp06.performClick()
        }
        radio054.setOnClickListener {
            m5 = -3
            var string: String = m5.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    m5,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText05.setText(string)
            cpp06.performClick()
        }
        radio061.setOnClickListener {
            m6 = 0
            var string: String = m6.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    m6,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText06.setText(string)
            cpp07.performClick()
        }
        radio062.setOnClickListener {
            m6 = -1
            var string: String = m6.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    m6,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText06.setText(string)
            cpp07.performClick()
        }
        radio063.setOnClickListener {
            m6 = -2
            var string: String = m6.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    m6,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText06.setText(string)
            cpp07.performClick()
        }
        radio071.setOnClickListener {
            m7 = 0
            var string: String = m7.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    m7,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText07.setText(string)
            cpp08.performClick()
        }
        radio072.setOnClickListener {
            m7 = -1
            var string: String = m7.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    m7,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText07.setText(string)
            cpp08.performClick()
        }
        radio081.setOnClickListener {
            m8 = 0
            var string: String = m8.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    m8,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText08.setText(string)
            cpp09.performClick()
        }
        radio082.setOnClickListener {
            m8 = -1
            var string: String = m8.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    m8,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText08.setText(string)
            cpp09.performClick()
        }
        radio083.setOnClickListener {
            m8 = -2
            var string: String = m8.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    m8,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText08.setText(string)
            cpp09.performClick()
        }
        radio084.setOnClickListener {
            m8 = -3
            var string: String = m8.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    m8,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText08.setText(string)
            cpp09.performClick()
        }
        radio091.setOnClickListener {
            m9 = 0
            var string: String = m9.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    m9,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText09.setText(string)
            cpp010.performClick()
        }
        radio092.setOnClickListener {
            m9 = -1
            var string: String = m9.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    m9,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText09.setText(string)
            cpp010.performClick()
        }
        radio093.setOnClickListener {
            m9 = -2
            var string: String = m9.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    m9,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText09.setText(string)
            cpp010.performClick()
        }
        radio094.setOnClickListener {
            m9 = -3
            var string: String = m9.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    m9,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText09.setText(string)
            cpp010.performClick()
        }
        radio0101.setOnClickListener {
            m10 = 0
            var string: String = m10.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    m10,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText010.setText(string)
            cpp011.performClick()
        }
        radio0102.setOnClickListener {
            m10 = -1
            var string: String = m10.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    m10,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText010.setText(string)
            cpp011.performClick()
        }
        radio0111.setOnClickListener {
            m11 = 0
            var string: String = m11.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    m11,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText011.setText(string)
            cpp012.performClick()
        }
        radio0112.setOnClickListener {
            m11 = -1
            var string: String = m11.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    m11,
                    sharedViewModel.r37.value,
                    sharedViewModel.r38.value
            )
            editText011.setText(string)
            cpp012.performClick()
        }
        radio0121.setOnClickListener {
            m12 = 0
            var string: String = m12.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    m12,
                    sharedViewModel.r38.value
            )
            editText012.setText(string)
            cpp013.performClick()
        }
        radio0122.setOnClickListener {
            m12 = -1
            var string: String = m12.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    m12,
                    sharedViewModel.r38.value
            )
            editText012.setText(string)
            cpp013.performClick()
        }
        radio0131.setOnClickListener {
            m13 = 0
            var string: String = m13.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    m13
            )
            editText013.setText(string)
            cpp01.performClick()
        }
        radio0132.setOnClickListener {
            m13 = -1
            var string: String = m13.toString()
            sharedViewModel.saveNumber0(
                    sharedViewModel.r26.value,
                    sharedViewModel.r27.value,
                    sharedViewModel.r28.value,
                    sharedViewModel.r29.value,
                    sharedViewModel.r30.value,
                    sharedViewModel.r31.value,
                    sharedViewModel.r32.value,
                    sharedViewModel.r33.value,
                    sharedViewModel.r34.value,
                    sharedViewModel.r35.value,
                    sharedViewModel.r36.value,
                    sharedViewModel.r37.value,
                    m13
            )
            editText013.setText(string)
            cpp01.performClick()
        }
        sharedViewModel.r26.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText01.setText(r.toString())
            }
        })
        sharedViewModel.r27.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText02.setText(r.toString())
            }
        })
        sharedViewModel.r28.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText03.setText(r.toString())
            }
        })
        sharedViewModel.r29.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText04.setText(r.toString())
            }
        })
        sharedViewModel.r30.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText05.setText(r.toString())
            }
        })
        sharedViewModel.r31.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText06.setText(r.toString())
            }
        })
        sharedViewModel.r32.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText07.setText(r.toString())
            }
        })
        sharedViewModel.r33.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText08.setText(r.toString())
            }
        })
        sharedViewModel.r34.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText09.setText(r.toString())
            }
        })
        sharedViewModel.r35.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText010.setText(r.toString())
            }
        })
        sharedViewModel.r36.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText011.setText(r.toString())
            }
        })
        sharedViewModel.r37.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText012.setText(r.toString())
            }
        })
        sharedViewModel.r38.observe(viewLifecycleOwner, {r->
            if(r<1) {
                editText013.setText(r.toString())
            }
        })
        radiogrouptext011.setOnClickListener {
            radio01.performClick()
        }
        radiogrouptext012.setOnClickListener {
            radio02.performClick()
        }
        radiogrouptext021.setOnClickListener {
            radio021.performClick()
        }
        radiogrouptext022.setOnClickListener {
            radio022.performClick()
        }

        radiogrouptext031.setOnClickListener {
            radio031.performClick()
        }
        radiogrouptext032.setOnClickListener {
            radio032.performClick()
        }
        radiogrouptext033.setOnClickListener {
            radio033.performClick()
        }
        radiogrouptext041.setOnClickListener {
            radio041.performClick()
        }
        radiogrouptext042.setOnClickListener {
            radio042.performClick()
        }
        radiogrouptext043.setOnClickListener {
            radio043.performClick()
        }
        radiogrouptext044.setOnClickListener {
            radio044.performClick()
        }
        radiogrouptext051.setOnClickListener {
            radio051.performClick()
        }
        radiogrouptext052.setOnClickListener {
            radio052.performClick()
        }
        radiogrouptext053.setOnClickListener {
            radio053.performClick()
        }
        radiogrouptext054.setOnClickListener {
            radio054.performClick()
        }
        radiogrouptext061.setOnClickListener {
            radio061.performClick()
        }
        radiogrouptext062.setOnClickListener {
            radio062.performClick()
        }
        radiogrouptext063.setOnClickListener {
            radio063.performClick()
        }
        radiogrouptext071.setOnClickListener {
            radio071.performClick()
        }
        radiogrouptext072.setOnClickListener {
            radio072.performClick()
        }

        radiogrouptext081.setOnClickListener {
            radio081.performClick()
        }

        radiogrouptext082.setOnClickListener {
            radio082.performClick()
        }
        radiogrouptext083.setOnClickListener {
            radio083.performClick()
        }

        radiogrouptext084.setOnClickListener {
            radio084.performClick()
        }
        radiogrouptext091.setOnClickListener {
            radio091.performClick()
        }
        radiogrouptext092.setOnClickListener {
            radio092.performClick()
        }
        radiogrouptext093.setOnClickListener {
            radio093.performClick()
        }
        radiogrouptext094.setOnClickListener {
            radio094.performClick()
        }
        radiogrouptext0101.setOnClickListener {
            radio0101.performClick()
        }
        radiogrouptext0102.setOnClickListener {
            radio0102.performClick()
        }
        radiogrouptext0111.setOnClickListener {
            radio0111.performClick()
        }
        radiogrouptext0112.setOnClickListener {
            radio0112.performClick()
        }

        radiogrouptext0121.setOnClickListener {
            radio0121.performClick()
        }
        radiogrouptext0122.setOnClickListener {
            radio0122.performClick()
        }

        radiogrouptext0131.setOnClickListener {
            radio0131.performClick()
        }
        radiogrouptext0132.setOnClickListener {
            radio0132.performClick()
        }

        cpp01.performClick()



    }

}
