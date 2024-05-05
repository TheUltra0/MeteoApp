package com.example.nivotest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.component1
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.nivotest.R
import com.example.nivotest.SharedViewModel
import com.example.nivotest.SharedViewModel2
import kotlinx.android.synthetic.main.fragment_diagnostic.*


class diagnostic : Fragment() {
    private lateinit var sharedViewModel: SharedViewModel
    private lateinit var sharedViewModel2: SharedViewModel2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view1=inflater.inflate(R.layout.fragment_diagnostic, container, false)
        var messageInput2=view1!!.findViewById<TextView>(R.id.messageInput2)
        var imageview=view1!!.findViewById<ImageView>(R.id.imageview)
        var imageview2=view1!!.findViewById<ImageView>(R.id.imageview2)
        var m=1
        sharedViewModel= ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        sharedViewModel2= ViewModelProvider(requireActivity()).get(SharedViewModel2::class.java)
        sharedViewModel.r40.observe(viewLifecycleOwner, {r->
            messageInput2.setText(r.toString())
            if(r<90){
                imageview.setImageResource(R.drawable.poza1)
                imageview2.setImageResource(R.drawable.poza4)

            }
            if(r<23){
                imageview.setImageResource(R.drawable.poza3)
                imageview2.setImageResource(R.drawable.poza5)
            }
            if(r<8){
                imageview.setImageResource(R.drawable.poza2)
                imageview2.setImageResource(R.drawable.poza6)
            }

        })

        sharedViewModel.r.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(m, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r2.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, m, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r3.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, m, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r4.observe(viewLifecycleOwner, {r->
            if(r>-1){

                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, m,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r5.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        m, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r6.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, m, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r7.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, m, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r8.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, m, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)
            }
        })
        sharedViewModel.r9.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, m, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r10.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, m, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)


            }
        })



        sharedViewModel.r11.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, m, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r12.observe(viewLifecycleOwner, {r->
            if(r>-1) {
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, m,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r13.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        m, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r14.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, m, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r15.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, m, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r16.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, m, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r17.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, m, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r18.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, m, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r19.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, m, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r20.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, m,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r21.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        m, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r22.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, m, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r23.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, m, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r24.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, m, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })

        sharedViewModel.r26.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, m, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r27.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, m, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r28.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, m, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r29.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, m,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r30.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        m, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r31.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, m, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r32.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, m, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r33.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, m, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r34.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, m, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r35.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, m, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r36.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, m, sharedViewModel2.r76.value, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r37.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, m, sharedViewModel2.r77.value, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r38.observe(viewLifecycleOwner, {r->
            if(r<1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, m, sharedViewModel2.r79.value)

            }
        })
        sharedViewModel.r43.observe(viewLifecycleOwner, {r->
            if(r>-1){
                sharedViewModel2.saveNumber41(sharedViewModel2.r41.value, sharedViewModel2.r42.value, sharedViewModel2.r43.value, sharedViewModel2.r44.value,
                        sharedViewModel2.r45.value, sharedViewModel2.r46.value, sharedViewModel2.r47.value, sharedViewModel2.r48.value, sharedViewModel2.r49.value, sharedViewModel2.r50.value, sharedViewModel2.r51.value, sharedViewModel2.r52.value,
                        sharedViewModel2.r53.value, sharedViewModel2.r54.value, sharedViewModel2.r55.value, sharedViewModel2.r56.value, sharedViewModel2.r57.value, sharedViewModel2.r58.value, sharedViewModel2.r59.value, sharedViewModel2.r60.value,
                        sharedViewModel2.r61.value, sharedViewModel2.r62.value, sharedViewModel2.r63.value, sharedViewModel2.r64.value, sharedViewModel2.r65.value, sharedViewModel2.r66.value, sharedViewModel2.r67.value, sharedViewModel2.r68.value,
                        sharedViewModel2.r69.value, sharedViewModel2.r70.value, sharedViewModel2.r71.value, sharedViewModel2.r72.value, sharedViewModel2.r73.value, sharedViewModel2.r74.value, sharedViewModel2.r75.value, sharedViewModel2.r76.value, sharedViewModel2.r77.value, m)

            }
        })
        sharedViewModel2.r78.observe(viewLifecycleOwner, {r->
            if(r==38){
                const4.isVisible=false
                const3.isVisible=true
            }

        })


        return view1

    }


}



