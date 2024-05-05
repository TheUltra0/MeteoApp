package com.example.nivotest.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.nivotest.R
import com.example.nivotest.SharedViewModel
import kotlinx.android.synthetic.main.firstlayout.view.*
import kotlinx.android.synthetic.main.fragment_checklist1.*
import kotlinx.android.synthetic.main.restore.view.*


class checklist1() : Fragment() {
    private lateinit var sharedViewModel: SharedViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_checklist1, container, false)

    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val param1 = textView1.layoutParams as ViewGroup.MarginLayoutParams
        val param2 = textView2.layoutParams as ViewGroup.MarginLayoutParams
        val param3 = textView3.layoutParams as ViewGroup.MarginLayoutParams
        val param4 = textView4.layoutParams as ViewGroup.MarginLayoutParams
        val param5 = textView5.layoutParams as ViewGroup.MarginLayoutParams
        val param6 = textView6.layoutParams as ViewGroup.MarginLayoutParams
        val param7 = textView7.layoutParams as ViewGroup.MarginLayoutParams
        val param8 = textView8.layoutParams as ViewGroup.MarginLayoutParams
        val param9 = textView9.layoutParams as ViewGroup.MarginLayoutParams
        val param10 = textView10.layoutParams as ViewGroup.MarginLayoutParams
        val param11 = textView11.layoutParams as ViewGroup.MarginLayoutParams
        val param12 = textView12.layoutParams as ViewGroup.MarginLayoutParams
        val param13 = textView13.layoutParams as ViewGroup.MarginLayoutParams
        val param14 = textView14.layoutParams as ViewGroup.MarginLayoutParams
        val param15 = textView15.layoutParams as ViewGroup.MarginLayoutParams
        val param16 = textView16.layoutParams as ViewGroup.MarginLayoutParams
        val param17 = textView17.layoutParams as ViewGroup.MarginLayoutParams
        val param18 = textView18.layoutParams as ViewGroup.MarginLayoutParams
        val param19 = textView19.layoutParams as ViewGroup.MarginLayoutParams
        val param20 = textView20.layoutParams as ViewGroup.MarginLayoutParams
        val param21 = textView21.layoutParams as ViewGroup.MarginLayoutParams
        val param22 = textView22.layoutParams as ViewGroup.MarginLayoutParams
        val param23 = textView23.layoutParams as ViewGroup.MarginLayoutParams
        val param24 = textView24.layoutParams as ViewGroup.MarginLayoutParams
        val param25 = textView25.layoutParams as ViewGroup.MarginLayoutParams



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
        var m14 = 0
        var m15 = 0
        var m16 = 0
        var m17 = 0
        var m18 = 0
        var m19 = 0
        var m20 = 0
        var m21 = 0
        var m22 = 0
        var m23 = 0
        var m24 = 0
        var m25=0

        var list1 = arrayOf(textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14,
                textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25)
        var list2 = arrayOf(cpp1, cpp2, cpp3, cpp4, cpp5, cpp6, cpp7, cpp8, cpp9, cpp10, cpp11, cpp12, cpp13, cpp14, cpp15, cpp16, cpp17, cpp18, cpp19, cpp20, cpp21, cpp22, cpp23, cpp24, cpp25)
        var list3 = arrayOf(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18, param19,
                param20, param21, param22, param23, param24, param25)
        imageButton.setOnClickListener {
            val RestoreView = LayoutInflater.from(requireContext()).inflate(R.layout.restore, null)

            val mBuilder = AlertDialog.Builder(requireContext())
                    .setView(RestoreView)
            val RestoreAlert = mBuilder.show()
            RestoreView.nubuton.setOnClickListener {
                RestoreAlert.dismiss()
            }
        }



        fun pentrutoti() {
            radiogroup1.visibility = View.INVISIBLE
            radiogroup2.visibility = View.INVISIBLE
            radiogroup3.visibility = View.INVISIBLE
            radiogroup4.visibility = View.INVISIBLE
            radiogroup5.visibility = View.INVISIBLE
            radiogroup6.visibility = View.INVISIBLE
            radiogroup7.visibility = View.INVISIBLE
            radiogroup8.visibility = View.INVISIBLE
            radiogroup9.visibility = View.INVISIBLE
            radiogroup10.visibility = View.INVISIBLE
            radiogroup11.visibility = View.INVISIBLE
            radiogroup12.visibility = View.INVISIBLE
            radiogroup13.visibility = View.INVISIBLE
            radiogroup14.visibility = View.INVISIBLE
            radiogroup15.visibility = View.INVISIBLE
            radiogroup16.visibility = View.INVISIBLE
            radiogroup17.visibility = View.INVISIBLE
            radiogroup18.visibility = View.INVISIBLE
            radiogroup19.visibility = View.INVISIBLE
            radiogroup20.visibility = View.INVISIBLE
            radiogroup21.visibility = View.INVISIBLE
            radiogroup22.visibility = View.INVISIBLE
            radiogroup23.visibility = View.INVISIBLE
            radiogroup23.visibility = View.INVISIBLE
            radiogroup24.visibility = View.INVISIBLE
            radiogroup25.visibility = View.INVISIBLE

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

            list1[13].textSize = resources.getDimension(R.dimen.font_small)
            list2[13].setState(1, 100, 1000)
            list2[13].background = resources.getDrawable(R.color.white)
            list3[13].setMargins(15, 0, 0, 0)

            list1[14].textSize = resources.getDimension(R.dimen.font_small)
            list2[14].setState(1, 100, 1000)
            list2[14].background = resources.getDrawable(R.color.white)
            list3[14].setMargins(15, 0, 0, 0)

            list1[15].textSize = resources.getDimension(R.dimen.font_small)
            list2[15].setState(1, 100, 1000)
            list2[15].background = resources.getDrawable(R.color.white)
            list3[15].setMargins(15, 0, 0, 0)

            list1[16].textSize = resources.getDimension(R.dimen.font_small)
            list2[16].setState(1, 100, 1000)
            list2[16].background = resources.getDrawable(R.color.white)
            list3[16].setMargins(15, 0, 0, 0)

            list1[17].textSize = resources.getDimension(R.dimen.font_small)
            list2[17].setState(1, 100, 1000)
            list2[17].background = resources.getDrawable(R.color.white)
            list3[17].setMargins(15, 0, 0, 0)

            list1[18].textSize = resources.getDimension(R.dimen.font_small)
            list2[18].setState(1, 100, 1000)
            list2[18].background = resources.getDrawable(R.color.white)
            list3[18].setMargins(15, 0, 0, 0)

            list1[19].textSize = resources.getDimension(R.dimen.font_small)
            list2[19].setState(1, 100, 1000)
            list2[19].background = resources.getDrawable(R.color.white)
            list3[19].setMargins(15, 0, 0, 0)

            list1[20].textSize = resources.getDimension(R.dimen.font_small)
            list2[20].setState(1, 100, 1000)
            list2[20].background = resources.getDrawable(R.color.white)
            list3[20].setMargins(15, 0, 0, 0)

            list1[21].textSize = resources.getDimension(R.dimen.font_small)
            list2[21].setState(1, 100, 1000)
            list2[21].background = resources.getDrawable(R.color.white)
            list3[21].setMargins(15, 0, 0, 0)

            list1[22].textSize = resources.getDimension(R.dimen.font_small)
            list2[22].setState(1, 100, 1000)
            list2[22].background = resources.getDrawable(R.color.white)
            list3[22].setMargins(15, 0, 0, 0)

            list1[23].textSize = resources.getDimension(R.dimen.font_small)
            list2[23].setState(1, 100, 1000)
            list2[23].background = resources.getDrawable(R.color.white)
            list3[23].setMargins(15, 0, 0, 0)

            list1[24].textSize = resources.getDimension(R.dimen.font_small)
            list2[24].setState(1, 100, 1000)
            list2[24].background = resources.getDrawable(R.color.white)
            list3[24].setMargins(15, 0, 0, 0)
        }
        cpp1.setOnClickListener {
            pentrutoti()
            radiogroup1.visibility = View.VISIBLE
            textView1.textSize = resources.getDimension(R.dimen.font_large)
            cpp1.setState(1, 100, 2000)
            cpp1.background = resources.getDrawable(R.color.turcoaz)
            param1.setMargins(20, 20, 15, 20)
        }
        cpp2.setOnClickListener {
            pentrutoti()
            radiogroup2.visibility = View.VISIBLE
            textView2.textSize = resources.getDimension(R.dimen.font_medium)
            cpp2.setState(1, 100, 2000)
            cpp2.background = resources.getDrawable(R.color.turcoaz)
            param2.setMargins(20, 20, 15, 20)
        }
        cpp3.setOnClickListener {
            pentrutoti()
            radiogroup3.visibility = View.VISIBLE
            textView3.textSize = resources.getDimension(R.dimen.font_medium)
            cpp3.setState(1, 100, 2000)
            cpp3.background = resources.getDrawable(R.color.turcoaz)
            param3.setMargins(20, 20, 15, 20)
        }
        cpp4.setOnClickListener {
            pentrutoti()
            radiogroup4.visibility = View.VISIBLE
            textView4.textSize = resources.getDimension(R.dimen.font_medium)
            cpp4.setState(1, 100, 2000)
            cpp4.background = resources.getDrawable(R.color.turcoaz)
            param4.setMargins(20, 20, 15, 20)
        }
        cpp5.setOnClickListener {
            pentrutoti()
            radiogroup5.visibility = View.VISIBLE
            textView5.textSize = resources.getDimension(R.dimen.font_medium)
            cpp5.setState(1, 100, 2000)
            cpp5.background = resources.getDrawable(R.color.turcoaz)
            param5.setMargins(20, 20, 15, 20)
        }
        cpp6.setOnClickListener {
            pentrutoti()
            radiogroup6.visibility = View.VISIBLE
            textView6.textSize = resources.getDimension(R.dimen.font_medium)
            cpp6.setState(1, 100, 2000)
            cpp6.background = resources.getDrawable(R.color.turcoaz)
            param6.setMargins(20, 20, 15, 20)
        }

        cpp7.setOnClickListener {
            pentrutoti()
            radiogroup7.visibility = View.VISIBLE
            textView7.textSize = resources.getDimension(R.dimen.font_medium)
            cpp7.setState(1, 100, 2000)
            cpp7.background = resources.getDrawable(R.color.turcoaz)
            param7.setMargins(20, 20, 15, 20)
        }
        cpp8.setOnClickListener {
            pentrutoti()
            radiogroup8.visibility = View.VISIBLE
            textView8.textSize = resources.getDimension(R.dimen.font_medium)
            cpp8.setState(1, 100, 2000)
            cpp8.background = resources.getDrawable(R.color.turcoaz)
            param8.setMargins(20, 20, 15, 20)
        }
        cpp9.setOnClickListener {
            pentrutoti()
            radiogroup9.visibility = View.VISIBLE
            textView9.textSize = resources.getDimension(R.dimen.font_medium)
            cpp9.setState(1, 100, 2000)
            cpp9.background = resources.getDrawable(R.color.turcoaz)
            param9.setMargins(20, 20, 15, 20)
        }
        cpp10.setOnClickListener {
            pentrutoti()
            radiogroup10.visibility = View.VISIBLE
            textView10.textSize = resources.getDimension(R.dimen.font_medium)
            cpp10.setState(1, 100, 2000)
            cpp10.background = resources.getDrawable(R.color.turcoaz)
            param10.setMargins(20, 20, 15, 20)
        }
        cpp11.setOnClickListener {
            pentrutoti()
            radiogroup11.visibility = View.VISIBLE
            textView11.textSize = resources.getDimension(R.dimen.font_medium)
            cpp11.setState(1, 100, 2000)
            cpp11.background = resources.getDrawable(R.color.turcoaz)
            param11.setMargins(20, 20, 15, 20)
        }
        cpp12.setOnClickListener {
            pentrutoti()
            radiogroup12.visibility = View.VISIBLE
            textView12.textSize = resources.getDimension(R.dimen.font_medium)
            cpp12.setState(1, 100, 2000)
            cpp12.background = resources.getDrawable(R.color.turcoaz)
            param12.setMargins(20, 20, 15, 20)
        }
        cpp13.setOnClickListener {
            pentrutoti()
            radiogroup13.visibility = View.VISIBLE
            textView13.textSize = resources.getDimension(R.dimen.font_medium)
            cpp13.setState(1, 100, 2000)
            cpp13.background = resources.getDrawable(R.color.turcoaz)
            param13.setMargins(20, 20, 15, 20)
        }
        cpp14.setOnClickListener {
            pentrutoti()
            radiogroup14.visibility = View.VISIBLE
            textView14.textSize = resources.getDimension(R.dimen.font_medium)
            cpp14.setState(1, 100, 2000)
            cpp14.background = resources.getDrawable(R.color.turcoaz)
            param14.setMargins(20, 20, 15, 20)
        }
        cpp15.setOnClickListener {
            pentrutoti()
            radiogroup15.visibility = View.VISIBLE
            textView15.textSize = resources.getDimension(R.dimen.font_medium)
            cpp15.setState(1, 100, 2000)
            cpp15.background = resources.getDrawable(R.color.turcoaz)
            param15.setMargins(20, 20, 15, 20)
        }
        cpp16.setOnClickListener {
            pentrutoti()
            radiogroup16.visibility = View.VISIBLE
            textView16.textSize = resources.getDimension(R.dimen.font_medium)
            cpp16.setState(1, 100, 2000)
            cpp16.background = resources.getDrawable(R.color.turcoaz)
            param16.setMargins(20, 20, 15, 20)
        }
        cpp17.setOnClickListener {
            pentrutoti()
            radiogroup17.visibility = View.VISIBLE
            textView17.textSize = resources.getDimension(R.dimen.font_medium)
            cpp17.setState(1, 100, 2000)
            cpp17.background = resources.getDrawable(R.color.turcoaz)
            param17.setMargins(20, 20, 15, 20)
        }
        cpp18.setOnClickListener {
            pentrutoti()
            radiogroup18.visibility = View.VISIBLE
            textView18.textSize = resources.getDimension(R.dimen.font_medium)
            cpp18.setState(1, 100, 2000)
            cpp18.background = resources.getDrawable(R.color.turcoaz)
            param18.setMargins(20, 20, 15, 20)
        }
        cpp19.setOnClickListener {
            pentrutoti()
            radiogroup19.visibility = View.VISIBLE
            textView19.textSize = resources.getDimension(R.dimen.font_medium)
            cpp19.setState(1, 100, 2000)
            cpp19.background = resources.getDrawable(R.color.turcoaz)
            param19.setMargins(20, 20, 15, 20)
        }
        cpp20.setOnClickListener {
            pentrutoti()
            radiogroup20.visibility = View.VISIBLE
            textView20.textSize = resources.getDimension(R.dimen.font_medium)
            cpp20.setState(1, 100, 2000)
            cpp20.background = resources.getDrawable(R.color.turcoaz)
            param20.setMargins(20, 20, 15, 20)
        }
        cpp21.setOnClickListener {
            pentrutoti()
            radiogroup21.visibility = View.VISIBLE
            textView21.textSize = resources.getDimension(R.dimen.font_medium)
            cpp21.setState(1, 100, 2000)
            cpp21.background = resources.getDrawable(R.color.turcoaz)
            param21.setMargins(20, 20, 15, 20)
        }
        cpp22.setOnClickListener {
            pentrutoti()
            radiogroup22.visibility = View.VISIBLE
            textView22.textSize = resources.getDimension(R.dimen.font_medium)
            cpp22.setState(1, 100, 2000)
            cpp22.background = resources.getDrawable(R.color.turcoaz)
            param22.setMargins(20, 20, 15, 20)
        }
        cpp23.setOnClickListener {
            pentrutoti()
            radiogroup23.visibility = View.VISIBLE
            textView23.textSize = resources.getDimension(R.dimen.font_medium)
            cpp23.setState(1, 100, 2000)
            cpp23.background = resources.getDrawable(R.color.turcoaz)
            param23.setMargins(20, 20, 15, 20)
        }
        cpp24.setOnClickListener {
            pentrutoti()
            radiogroup24.visibility = View.VISIBLE
            textView24.textSize = resources.getDimension(R.dimen.font_medium)
            cpp24.setState(1, 100, 2000)
            cpp24.background = resources.getDrawable(R.color.turcoaz)
            param24.setMargins(20, 20, 15, 20)
        }
        cpp25.setOnClickListener {
            pentrutoti()
            radiogroup25.visibility = View.VISIBLE
            textView25.textSize = resources.getDimension(R.dimen.font_medium)
            cpp25.setState(1, 100, 2000)
            cpp25.background = resources.getDrawable(R.color.turcoaz)
            param25.setMargins(20, 20, 15, 20)
        }

        sharedViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        sharedViewModel.savenumber2(1)
        radio1.setOnClickListener {
            m1 = 0
            var string: String = m1.toString()
            sharedViewModel.saveNumber(m1, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText1.setText(string)
            cpp2.performClick()
        }
        radio2.setOnClickListener {
            m1 = 3
            var string: String = m1.toString()
            sharedViewModel.saveNumber(m1, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText1.setText(string)
            cpp2.performClick()
        }

        radio21.setOnClickListener {
            m2 = 0
            var string: String = m2.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, m2, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText2.setText(string)
            cpp3.performClick()
        }


        radio23.setOnClickListener {
            m2 = 3
            var string: String = m2.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, m2, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText2.setText(string)
            cpp3.performClick()
        }
        radio24.setOnClickListener {
            m2 = 4
            var string: String = m2.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, m2, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText2.setText(string)
            cpp3.performClick()
        }
        radio31.setOnClickListener {
            m3 = 0
            var string: String = m3.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, m3, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText3.setText(string)
            cpp4.performClick()
        }
        radio32.setOnClickListener {
            m3 = 3
            var string: String = m3.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, m3, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText3.setText(string)
            cpp4.performClick()
        }
        radio41.setOnClickListener {
            m4 = 0
            var string: String = m4.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, m4, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText4.setText(string)
            cpp5.performClick()
        }
        radio42.setOnClickListener {
            m4 = 1
            var string: String = m4.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, m4, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText4.setText(string)
            cpp5.performClick()
        }
        radio51.setOnClickListener {
            m5 = 0
            var string: String = m5.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, m5,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText5.setText(string)
            cpp6.performClick()
        }
        radio52.setOnClickListener {
            m5 = 3
            var string: String = m5.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, m5,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText5.setText(string)
            cpp6.performClick()
        }
        radio61.setOnClickListener {
            m6 = 0
            var string: String = m6.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    m6, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText6.setText(string)
            cpp7.performClick()
        }
        radio62.setOnClickListener {
            m6 = 3
            var string: String = m6.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    m6, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText6.setText(string)
            cpp7.performClick()
        }

        radio71.setOnClickListener {
            m7 = 0
            var string: String = m7.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, m7, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText7.setText(string)
            cpp8.performClick()
        }
        radio72.setOnClickListener {
            m7 = 5
            var string: String = m7.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, m7, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText7.setText(string)
            cpp8.performClick()
        }
        radio73.setOnClickListener {
            m7 = 6
            var string: String = m7.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, m7, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText7.setText(string)
            cpp8.performClick()
        }
        radio74.setOnClickListener {
            m7 = 7
            var string: String = m7.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, m7, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText7.setText(string)
            cpp8.performClick()
        }
        radio81.setOnClickListener {
            m8 = 0
            var string: String = m8.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, m8, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText8.setText(string)
            cpp9.performClick()
        }
        radio82.setOnClickListener {
            m8 = 2
            var string: String = m8.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, m8, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText8.setText(string)
            cpp9.performClick()
        }
        radio91.setOnClickListener {
            m9 = 0
            var string: String = m9.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, m9, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText9.setText(string)
            cpp10.performClick()
        }
        radio92.setOnClickListener {
            m9 = 1
            var string: String = m9.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, m9, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText9.setText(string)
            cpp10.performClick()
        }
        radio101.setOnClickListener {
            m10 = 0
            var string: String = m10.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, m10, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText10.setText(string)
            cpp11.performClick()
        }
        radio102.setOnClickListener {
            m10 = 5
            var string: String = m10.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, m10, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText10.setText(string)
            cpp11.performClick()
        }
        radio111.setOnClickListener {
            m11 = 0
            var string: String = m11.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, m11, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText11.setText(string)
            cpp12.performClick()
        }
        radio112.setOnClickListener {
            m11 = 3
            var string: String = m11.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, m11, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText11.setText(string)
            cpp12.performClick()
        }
        radio113.setOnClickListener {
            m11 = 4
            var string: String = m11.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, m11, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText11.setText(string)
            cpp12.performClick()
        }
        radio121.setOnClickListener {
            m12 = 0
            var string: String = m12.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, m12,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText12.setText(string)
            cpp13.performClick()
        }
        radio122.setOnClickListener {
            m12 = 4
            var string: String = m12.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, m12,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText12.setText(string)
            cpp13.performClick()
        }
        radio123.setOnClickListener {
            m12 = 5
            var string: String = m12.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, m12,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText12.setText(string)
            cpp13.performClick()
        }
        radio124.setOnClickListener {
            m12 = 6
            var string: String = m12.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, m12,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText12.setText(string)
            cpp13.performClick()
        }
        radio131.setOnClickListener {
            m13 = 0
            var string: String = m13.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    m13, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText13.setText(string)
            cpp14.performClick()
        }
        radio132.setOnClickListener {
            m13 = 2
            var string: String = m13.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    m13, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText13.setText(string)
            cpp14.performClick()
        }
        radio133.setOnClickListener {
            m13 = 3
            var string: String = m13.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    m13, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText13.setText(string)
            cpp14.performClick()
        }
        radio141.setOnClickListener {
            m14 = 0
            var string: String = m14.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, m14, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText14.setText(string)
            cpp15.performClick()
        }
        radio142.setOnClickListener {
            m14 = 1
            var string: String = m14.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, m14, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText14.setText(string)
            cpp15.performClick()
        }
        radio143.setOnClickListener {
            m14 = 2
            var string: String = m14.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, m14, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText14.setText(string)
            cpp15.performClick()
        }
        radio151.setOnClickListener {
            m15 = 0
            var string: String = m15.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, m15, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText15.setText(string)
            cpp16.performClick()
        }
        radio152.setOnClickListener {
            m15 = 4
            var string: String = m15.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, m15, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText15.setText(string)
            cpp16.performClick()
        }
        radio161.setOnClickListener {
            m16 = 0
            var string: String = m16.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, m16, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText16.setText(string)
            cpp17.performClick()
        }
        radio162.setOnClickListener {
            m16 = 1
            var string: String = m16.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, m16, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText16.setText(string)
            cpp17.performClick()
        }
        radio171.setOnClickListener {
            m17 = 0
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, m17, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            var string: String = m17.toString()
            editText17.setText(string)
            cpp18.performClick()
        }
        radio172.setOnClickListener {
            m17 = 1
            var string: String = m17.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, m17, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText17.setText(string)
            cpp18.performClick()
        }
        radio173.setOnClickListener {
            m17 = 2
            var string: String = m17.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, m17, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText17.setText(string)
            cpp18.performClick()
        }
        radio181.setOnClickListener {
            m18 = 0
            var string: String = m18.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, m18, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText18.setText(string)
            cpp19.performClick()
        }
        radio182.setOnClickListener {
            m18 = 4
            var string: String = m18.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, m18, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText18.setText(string)
            cpp19.performClick()
        }
        radio183.setOnClickListener {
            m18 = 5
            var string: String = m18.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, m18, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText18.setText(string)
            cpp19.performClick()
        }
        radio191.setOnClickListener {
            m19 = 0
            var string: String = m19.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, m19,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText19.setText(string)
            cpp20.performClick()
        }
        radio192.setOnClickListener {
            m19 = 2
            var string: String = m19.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, m19,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText19.setText(string)
            cpp20.performClick()
        }
        radio193.setOnClickListener {
            m19 = 3
            var string: String = m19.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, m19,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText19.setText(string)
            cpp20.performClick()
        }
        radio201.setOnClickListener {
            m20 = 0
            var string: String = m20.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    m20, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText20.setText(string)
            cpp21.performClick()
        }
        radio202.setOnClickListener {
            m20 = 1
            var string: String = m20.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    m20, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText20.setText(string)
            cpp21.performClick()
        }
        radio211.setOnClickListener {
            m21 = 0
            var string: String = m21.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, m21, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText21.setText(string)
            cpp22.performClick()
        }
        radio212.setOnClickListener {
            m21 = 1
            var string: String = m21.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, m21, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText21.setText(string)
            cpp22.performClick()
        }
        radio221.setOnClickListener {
            m22 = 0
            var string: String = m22.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, m22, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText22.setText(string)
            cpp23.performClick()
        }
        radio222.setOnClickListener {
            m22 = 1
            var string: String = m22.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, m22, sharedViewModel.r23.value, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText22.setText(string)
            cpp23.performClick()
        }
        radio231.setOnClickListener {
            m23 = 0
            var string: String = m23.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, m23, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText23.setText(string)
            cpp24.performClick()
        }
        radio232.setOnClickListener {
            m23 = 1
            var string: String = m23.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, m23, sharedViewModel.r24.value,  sharedViewModel.r43.value)
            editText23.setText(string)
            cpp24.performClick()
        }
        radio241.setOnClickListener {
            m24 = 0
            var string: String = m24.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, m24,  sharedViewModel.r43.value)
            editText24.setText(string)
            cpp25.performClick()
        }
        radio242.setOnClickListener {
            m24 = 1
            var string: String = m24.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, m24,  sharedViewModel.r43.value)
            editText24.setText(string)
            cpp25.performClick()
        }
        radio251.setOnClickListener {
            m25 = 0
            var string: String = m25.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  m25)
            editText25.setText(string)
            cpp1.performClick()
        }
        radio252.setOnClickListener {
            m25 = 1
            var string: String = m25.toString()
            sharedViewModel.saveNumber(sharedViewModel.r.value, sharedViewModel.r2.value, sharedViewModel.r3.value, sharedViewModel.r4.value, sharedViewModel.r5.value,
                    sharedViewModel.r6.value, sharedViewModel.r7.value, sharedViewModel.r8.value, sharedViewModel.r9.value, sharedViewModel.r10.value, sharedViewModel.r11.value, sharedViewModel.r12.value,
                    sharedViewModel.r13.value, sharedViewModel.r14.value, sharedViewModel.r15.value, sharedViewModel.r16.value, sharedViewModel.r17.value, sharedViewModel.r18.value, sharedViewModel.r19.value,
                    sharedViewModel.r20.value, sharedViewModel.r21.value, sharedViewModel.r22.value, sharedViewModel.r23.value, sharedViewModel.r24.value,  m25)
            editText25.setText(string)
            cpp1.performClick()
        }
              sharedViewModel.r.observe(viewLifecycleOwner, {r->
                  if(r>-1) {
                      editText1.setText(r.toString())
                  }
              })
                sharedViewModel.r2.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText2.setText(r.toString())
                    }
                    })
                sharedViewModel.r3.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText3.setText(r.toString())
                    }
                    })
                sharedViewModel.r4.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText4.setText(r.toString())
                    }
                    })
                sharedViewModel.r5.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText5.setText(r.toString())
                    }
                    })
                sharedViewModel.r6.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText6.setText(r.toString())
                    }
                    })
                sharedViewModel.r7.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText7.setText(r.toString())
                    }
                    })
                sharedViewModel.r8.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText8.setText(r.toString())
                    }
                    })
                sharedViewModel.r9.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText9.setText(r.toString())
                    }
                    })
                sharedViewModel.r10.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText10.setText(r.toString())
                    }
                    })
                sharedViewModel.r11.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText11.setText(r.toString())
                    }
                    })
                sharedViewModel.r12.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText12.setText(r.toString())
                    }
                    })
                sharedViewModel.r13.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText13.setText(r.toString())
                    }
                    })
                sharedViewModel.r14.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText14.setText(r.toString())
                    }
                    })
                sharedViewModel.r15.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText15.setText(r.toString())
                    }
                    })
                sharedViewModel.r16.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText16.setText(r.toString())
                    }
                    })
                sharedViewModel.r17.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText17.setText(r.toString())
                    }
                    })
                sharedViewModel.r18.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText18.setText(r.toString())
                    }
                    })
                sharedViewModel.r19.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText19.setText(r.toString())
                    }
                    })
                sharedViewModel.r20.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText20.setText(r.toString())
                    }
                    })
                sharedViewModel.r21.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText21.setText(r.toString())
                    }
                    })
                sharedViewModel.r22.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText22.setText(r.toString())
                    }
                    })
                sharedViewModel.r23.observe(viewLifecycleOwner, {r->
                    if(r>-1) {
                        editText23.setText(r.toString())
                    }
                    })
                sharedViewModel.r24.observe(viewLifecycleOwner, { r ->
                    if (r > -1){
                        editText24.setText(r.toString())
                    }
                })
        sharedViewModel.r43.observe(viewLifecycleOwner, { r ->
            if (r > -1){
                editText25.setText(r.toString())
            }
        })

        radiogrouptext11.setOnClickListener {
            radio1.performClick()
        }
        radiogrouptext12.setOnClickListener {
            radio2.performClick()
        }
        radiogrouptext21.setOnClickListener {
            radio21.performClick()
        }

        radiogrouptext23.setOnClickListener {
            radio23.performClick()
        }
        radiogrouptext24.setOnClickListener {
            radio24.performClick()
        }
        radiogrouptext31.setOnClickListener {
            radio31.performClick()
        }
        radiogrouptext32.setOnClickListener {
            radio32.performClick()
        }
        radiogrouptext41.setOnClickListener {
            radio41.performClick()
        }
        radiogrouptext42.setOnClickListener {
            radio42.performClick()
        }
        radiogrouptext51.setOnClickListener {
            radio51.performClick()
        }
        radiogrouptext52.setOnClickListener {
            radio52.performClick()
        }
        radiogrouptext61.setOnClickListener {
            radio61.performClick()
        }
        radiogrouptext62.setOnClickListener {
            radio62.performClick()
        }

        radiogrouptext71.setOnClickListener {
            radio71.performClick()
        }
        radiogrouptext72.setOnClickListener {
            radio72.performClick()
        }
        radiogrouptext73.setOnClickListener {
            radio73.performClick()
        }
        radiogrouptext74.setOnClickListener {
            radio74.performClick()
        }
        radiogrouptext81.setOnClickListener {
            radio81.performClick()
        }

        radiogrouptext82.setOnClickListener {
            radio82.performClick()
        }
        radiogrouptext91.setOnClickListener {
            radio91.performClick()
        }
        radiogrouptext92.setOnClickListener {
            radio92.performClick()
        }
        radiogrouptext101.setOnClickListener {
            radio101.performClick()
        }
        radiogrouptext102.setOnClickListener {
            radio102.performClick()
        }
        radiogrouptext111.setOnClickListener {
            radio111.performClick()
        }
        radiogrouptext112.setOnClickListener {
            radio112.performClick()
        }
        radiogrouptext113.setOnClickListener {
            radio113.performClick()
        }
        radiogrouptext121.setOnClickListener {
            radio121.performClick()
        }
        radiogrouptext122.setOnClickListener {
            radio122.performClick()
        }
        radiogrouptext123.setOnClickListener {
            radio123.performClick()
        }
        radiogrouptext124.setOnClickListener {
            radio124.performClick()
        }
        radiogrouptext131.setOnClickListener {
            radio131.performClick()
        }
        radiogrouptext132.setOnClickListener {
            radio132.performClick()
        }
        radiogrouptext133.setOnClickListener {
            radio133.performClick()
        }
        radiogrouptext141.setOnClickListener {
            radio141.performClick()
        }
        radiogrouptext142.setOnClickListener {
            radio142.performClick()
        }
        radiogrouptext143.setOnClickListener {
            radio143.performClick()
        }
        radiogrouptext151.setOnClickListener {
            radio151.performClick()
        }
        radiogrouptext152.setOnClickListener {
            radio152.performClick()
        }
        radiogrouptext161.setOnClickListener {
            radio161.performClick()
        }
        radiogrouptext162.setOnClickListener {
            radio162.performClick()
        }
        radiogrouptext171.setOnClickListener {
            radio171.performClick()
        }
        radiogrouptext172.setOnClickListener {
            radio172.performClick()
        }
        radiogrouptext173.setOnClickListener {
            radio173.performClick()
        }

        radiogrouptext181.setOnClickListener {
            radio181.performClick()
        }
        radiogrouptext182.setOnClickListener {
            radio182.performClick()
        }
        radiogrouptext183.setOnClickListener {
            radio183.performClick()
        }
        radiogrouptext191.setOnClickListener {
            radio191.performClick()
        }
        radiogrouptext192.setOnClickListener {
            radio192.performClick()
        }
        radiogrouptext193.setOnClickListener {
            radio193.performClick()
        }
        radiogrouptext201.setOnClickListener {
            radio201.performClick()
        }
        radiogrouptext202.setOnClickListener {
            radio202.performClick()
        }
        radiogrouptext211.setOnClickListener {
            radio211.performClick()
        }
        radiogrouptext212.setOnClickListener {
            radio212.performClick()
        }
        radiogrouptext221.setOnClickListener {
            radio221.performClick()
        }
        radiogrouptext222.setOnClickListener {
            radio222.performClick()
        }
        radiogrouptext231.setOnClickListener {
            radio231.performClick()
        }
        radiogrouptext232.setOnClickListener {
            radio232.performClick()
        }
        radiogrouptext241.setOnClickListener {
            radio241.performClick()
        }
        radiogrouptext242.setOnClickListener {
            radio242.performClick()
        }
        radiogrouptext251.setOnClickListener {
            radio251.performClick()
        }
        radiogrouptext252.setOnClickListener {
            radio252.performClick()
        }
        cpp1.performClick()

    }

}