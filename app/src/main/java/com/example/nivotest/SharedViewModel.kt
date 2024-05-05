package com.example.nivotest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private var _r = MutableLiveData<Int>(-1)
    var r: LiveData<Int> = _r
    private var _r2 = MutableLiveData<Int>(-1)
    var r2: LiveData<Int> = _r2
    private var _r3 = MutableLiveData<Int>(-1)
    var r3: LiveData<Int> = _r3
    private var _r4 = MutableLiveData<Int>(-1)
    var r4: LiveData<Int> = _r4
    private var _r5 = MutableLiveData<Int>(-1)
    var r5: LiveData<Int> = _r5
    private var _r6 = MutableLiveData<Int>(-1)
    var r6: LiveData<Int> = _r6
    private var _r7 = MutableLiveData<Int>(-1)
    var r7: LiveData<Int> = _r7
    private var _r8 = MutableLiveData<Int>(-1)
    var r8: LiveData<Int> = _r8
    private var _r9 = MutableLiveData<Int>(-1)
    var r9: LiveData<Int> = _r9
    private var _r10 = MutableLiveData<Int>(-1)
    var r10: LiveData<Int> = _r10
    private var _r11 = MutableLiveData<Int>(-1)
    var r11: LiveData<Int> = _r11
    private var _r12 = MutableLiveData<Int>(-1)
    var r12: LiveData<Int> = _r12
    private var _r13 = MutableLiveData<Int>(-1)
    var r13: LiveData<Int> = _r13
    private var _r14 = MutableLiveData<Int>(-1)
    var r14: LiveData<Int> = _r14
    private var _r15 = MutableLiveData<Int>(-1)
    var r15: LiveData<Int> = _r15
    private var _r16 = MutableLiveData<Int>(-1)
    var r16: LiveData<Int> = _r16
    private var _r17 = MutableLiveData<Int>(-1)
    var r17: LiveData<Int> = _r17
    private var _r18 = MutableLiveData<Int>(-1)
    var r18: LiveData<Int> = _r18
    private var _r19 = MutableLiveData<Int>(-1)
    var r19: LiveData<Int> = _r19
    private var _r20 = MutableLiveData<Int>(-1)
    var r20: LiveData<Int> = _r20
    private var _r21 = MutableLiveData<Int>(-1)
    var r21: LiveData<Int> = _r21
    private var _r22 = MutableLiveData<Int>(-1)
    var r22: LiveData<Int> = _r22
    private var _r23 = MutableLiveData<Int>(-1)
    var r23: LiveData<Int> = _r23
    private var _r24 = MutableLiveData<Int>(-1)
    var r24: LiveData<Int> = _r24
    private var _r25 = MutableLiveData<Int>(0)
    var r25: LiveData<Int> = _r25
    private var _r26 = MutableLiveData<Int>(1)
    var r26: LiveData<Int> = _r26
    private var _r27 = MutableLiveData<Int>(1)
    var r27: LiveData<Int> = _r27
    private var _r28 = MutableLiveData<Int>(1)
    var r28: LiveData<Int> = _r28
    private var _r29 = MutableLiveData<Int>(1)
    var r29: LiveData<Int> = _r29
    private var _r30 = MutableLiveData<Int>(1)
    var r30: LiveData<Int> = _r30
    private var _r31 = MutableLiveData<Int>(1)
    var r31: LiveData<Int> = _r31
    private var _r32 = MutableLiveData<Int>(1)
    var r32: LiveData<Int> = _r32
    private var _r33 = MutableLiveData<Int>(1)
    var r33: LiveData<Int> = _r33
    private var _r34= MutableLiveData<Int>(1)
    var r34: LiveData<Int> = _r34
    private var _r35 = MutableLiveData<Int>(1)
    var r35: LiveData<Int> = _r35
    private var _r36 = MutableLiveData<Int>(1)
    var r36: LiveData<Int> = _r36
    private var _r37 = MutableLiveData<Int>(1)
    var r37: LiveData<Int> = _r37
    private var _r38 = MutableLiveData<Int>(1)
    var r38: LiveData<Int> = _r38
    private var _r39 = MutableLiveData<Int>(1)
    var r39: LiveData<Int> = _r39
    private var _r40 = MutableLiveData<Int>(0)
    var r40: LiveData<Int> = _r40
    private var _r41 = MutableLiveData<Int>(0)
    var r41: LiveData<Int> = _r41
    private var _r42 = MutableLiveData<Int>(0)
    var r42: LiveData<Int> = _r42
    private var _r43 = MutableLiveData<Int>(-1)
    var r43: LiveData<Int> = _r43



    fun saveNumber(number:Int?, number2:Int?, number3:Int?, number4:Int?, number5:Int?, number6:Int?, number7:Int?, number8:Int?, number9:Int?, number10:Int?, number11:Int?, number12:Int?,
                    number13:Int?, number14:Int?, number15:Int?, number16:Int?, number17:Int?, number18:Int?, number19:Int?, number20:Int?, number21:Int?, number22:Int?, number23:Int?, number24:Int?, number25:Int?){
        _r.value=number
        _r2.value=number2
        _r3.value=number3
        _r4.value=number4
        _r5.value=number5
        _r6.value=number6
        _r7.value=number7
        _r8.value=number8
        _r9.value=number9
        _r10.value=number10
        _r11.value=number11
        _r12.value=number12
        _r13.value=number13
        _r14.value=number14
        _r15.value=number15
        _r16.value=number16
        _r17.value=number17
        _r18.value=number18
        _r19.value=number19
        _r20.value=number20
        _r21.value=number21
        _r22.value=number22
        _r23.value=number23
        _r24.value=number24
        _r43.value=number25
        _r25.value=(_r.value!!.toInt() + _r2.value!!.toInt()+_r3.value!!.toInt()+_r4.value!!.toInt() + _r5.value!!.toInt()+_r6.value!!.toInt()+_r7.value!!.toInt() + _r8.value!!.toInt()+_r9.value!!.toInt()+
                _r10.value!!.toInt() + _r11.value!!.toInt()+_r12.value!!.toInt()+_r13.value!!.toInt() + _r14.value!!.toInt()+_r15.value!!.toInt()+_r16.value!!.toInt() + _r17.value!!.toInt()+
                _r18.value!!.toInt()+_r19.value!!.toInt() + _r20.value!!.toInt()+_r21.value!!.toInt()+_r22.value!!.toInt()+_r23.value!!.toInt()+_r24.value!!.toInt())+_r43.value!!.toInt()

        _r40.value=(_r25.value!!.toInt()+_r39.value!!.toInt())

    }



    fun saveNumber0(number0:Int?, number02:Int?,number03:Int?, number04:Int?, number05:Int?, number06:Int?, number07:Int?, number08:Int?,number09:Int?, number010:Int?,
                    number011:Int?, number012:Int?, number013:Int?){
        _r26.value=number0
        _r27.value=number02
        _r28.value=number03
        _r29.value=number04
        _r30.value=number05
        _r31.value=number06
        _r32.value=number07
        _r33.value=number08
        _r34.value=number09
        _r35.value=number010
        _r36.value=number011
        _r37.value=number012
        _r38.value=number013
        _r39.value=(_r26.value!!.toInt() + _r27.value!!.toInt()+_r28.value!!.toInt()+_r29.value!!.toInt() + _r30.value!!.toInt()+_r31.value!!.toInt()+_r32.value!!.toInt()
                + _r33.value!!.toInt()+_r34.value!!.toInt()+ _r35.value!!.toInt() + _r36.value!!.toInt()+_r37.value!!.toInt()+_r38.value!!.toInt())
        _r40.value=(_r25.value!!.toInt()+_r39.value!!.toInt())
    }
    fun savenumber2(number:Int?){
        _r41.value=number
    }
    fun savenumber3(number:Int?){
        _r42.value=number
    }


}