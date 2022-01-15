package com.example.memorygame

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.BLACK
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet
import androidx.annotation.ColorInt as ColorInt1

class MainActivity : AppCompatActivity() {
    private var arrayRang = ArrayList<Int>()
    var arrayRandom = ArrayList<Int>()
    var arrayRandom2 = ArrayList<Int>()
    private val arrayJavob = ArrayList<TextView>()

    var tekshirish = HashSet<View>()

    val black = R.color.black
    val white = R.color.white
    val teal_700 = R.color.teal_700
    val teal_200 = R.color.teal_200
    val purple_700 = R.color.purple_700
    val purple_200 = R.color.purple_200
    val red = android.R.color.holo_red_dark
    val green = android.R.color.holo_green_light


    var togriJavoblar = 0
    var moves = 0
    var second = 60
    var int = 0
    var booleanButtonBosilishiUchun = false
    var booleanStartButton = true

    lateinit var dialog: AlertDialog

    private val timer = object : CountDownTimer(60000, 1000) {
        @SuppressLint("SetTextI18n")
        override fun onTick(millisUntilFinished: Long) {
            second--
            tv_second.text = "$second Second"
        }

        override fun onFinish() {
            booleanStartButton = true
            second = 60
            booleanButtonBosilishiUchun = false
            DialogBulder()
            dialog.show()
        }

    }
    private val timerSelect = object : CountDownTimer(500, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            booleanButtonBosilishiUchun = false
        }

        override fun onFinish() {
            arrayJavob[0].visibility = View.GONE
            arrayJavob[1].visibility = View.GONE
            tekshirish.clear()
            arrayJavob.clear()
            int = 0
            booleanButtonBosilishiUchun = true
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation = AnimationUtils.loadAnimation(this, R.anim.anim)

        tv_game.setOnClickListener {

        }
        btn_tv_start.setOnClickListener {
            if (booleanStartButton) {
                RangniArraygaJoylash()
                Random_rang()
                Random_rang2()
                RangniImagelargaJoylash()
                booleanButtonBosilishiUchun = true
                booleanStartButton = false
                timer.start()
            }
        }

        btn_restart.setOnClickListener {
            Restart()
        }

        card_image_1.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_1.text != "off") {
                    Oyin(btn_image_1, card_image_1)
                }
            }
        }

        card_image_2.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_2.text != "off") {
                    Oyin(btn_image_2, card_image_2)
                }
            }
        }

        card_image_3.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_3.text != "off") {
                    Oyin(btn_image_3, card_image_3)
                }
            }
        }

        card_image_4.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_4.text != "off") {
                    Oyin(btn_image_4, card_image_4)
                }
            }
        }

        card_image_5.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_5.text != "off") {
                    Oyin(btn_image_5, card_image_5)
                }
            }
        }

        card_image_6.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_6.text != "off") {
                    Oyin(btn_image_6, card_image_6)
                }
            }
        }

        card_image_7.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_7.text != "off") {
                    Oyin(btn_image_7, card_image_7)
                }
            }
        }

        card_image_8.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_8.text != "off") {
                    Oyin(btn_image_8, card_image_8)
                }
            }
        }

        card_image_9.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_9.text != "off") {
                    Oyin(btn_image_9, card_image_9)
                }
            }
        }

        card_image_10.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_10.text != "off") {
                    Oyin(btn_image_10, card_image_10)
                }
            }
        }

        card_image_11.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_11.text != "off") {
                    Oyin(btn_image_11, card_image_11)
                }
            }
        }

        card_image_12.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_12.text != "off") {
                    Oyin(btn_image_12, card_image_12)
                }
            }
        }

        card_image_13.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_13.text != "off") {
                    Oyin(btn_image_13, card_image_13)
                }
            }
        }

        card_image_14.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_14.text != "off") {
                    Oyin(btn_image_14, card_image_14)
                }
            }
        }

        card_image_15.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_15.text != "off") {
                    Oyin(btn_image_15, card_image_15)
                }
            }
        }

        card_image_16.setOnClickListener {
            if (booleanButtonBosilishiUchun) {
                if (btn_image_16.text != "off") {
                    Oyin(btn_image_16, card_image_16)
                }
            }
        }
    }

    fun Random_rang() {
        var hashSet = HashSet<Int>()
        var a = 0
        while (true) {
            fun Random_numbers() {
                a = (Math.random() * arrayRang.size).toInt()
            }
            Random_numbers()
            var boolean = hashSet.add(a)
            if (!boolean) {
                Random_numbers()
            } else {
                arrayRandom.add(a)
            }
            if (arrayRandom.size == arrayRang.size) {
                break
            }
        }
    }

    fun Random_rang2() {
        var hashSet = HashSet<Int>()
        var a = 0
        while (true) {
            fun Random_numbers() {
                a = (Math.random() * arrayRang.size).toInt()
            }
            Random_numbers()
            var boolean = hashSet.add(a)
            if (!boolean) {
                Random_numbers()
            } else {
                arrayRandom2.add(a)
            }
            if (arrayRandom2.size == arrayRang.size) {
                break
            }
        }
    }

    fun RangniArraygaJoylash() {
        arrayRang.add(black)
        arrayRang.add(teal_200)
        arrayRang.add(teal_700)
        arrayRang.add(white)
        arrayRang.add(purple_200)
        arrayRang.add(purple_700)
        arrayRang.add(green)
        arrayRang.add(red)
    }

    fun RangniImagelargaJoylash() {

        btn_image_1.setBackgroundResource(arrayRang[arrayRandom[0]])
        btn_image_2.setBackgroundResource(arrayRang[arrayRandom[1]])
        btn_image_3.setBackgroundResource(arrayRang[arrayRandom[2]])
        btn_image_4.setBackgroundResource(arrayRang[arrayRandom[3]])
        btn_image_5.setBackgroundResource(arrayRang[arrayRandom[4]])
        btn_image_6.setBackgroundResource(arrayRang[arrayRandom[5]])
        btn_image_7.setBackgroundResource(arrayRang[arrayRandom[6]])
        btn_image_8.setBackgroundResource(arrayRang[arrayRandom[7]])
        btn_image_9.setBackgroundResource(arrayRang[arrayRandom2[0]])
        btn_image_10.setBackgroundResource(arrayRang[arrayRandom2[1]])
        btn_image_11.setBackgroundResource(arrayRang[arrayRandom2[2]])
        btn_image_12.setBackgroundResource(arrayRang[arrayRandom2[3]])
        btn_image_13.setBackgroundResource(arrayRang[arrayRandom2[4]])
        btn_image_14.setBackgroundResource(arrayRang[arrayRandom2[5]])
        btn_image_15.setBackgroundResource(arrayRang[arrayRandom2[6]])
        btn_image_16.setBackgroundResource(arrayRang[arrayRandom2[7]])


        btn_image_1.text = (arrayRang[arrayRandom[0]]).toString()
        btn_image_2.text = (arrayRang[arrayRandom[1]]).toString()
        btn_image_3.text = (arrayRang[arrayRandom[2]]).toString()
        btn_image_4.text = (arrayRang[arrayRandom[3]]).toString()
        btn_image_5.text = (arrayRang[arrayRandom[4]]).toString()
        btn_image_6.text = (arrayRang[arrayRandom[5]]).toString()
        btn_image_7.text = (arrayRang[arrayRandom[6]]).toString()
        btn_image_8.text = (arrayRang[arrayRandom[7]]).toString()
        btn_image_9.text = (arrayRang[arrayRandom2[0]]).toString()
        btn_image_10.text = (arrayRang[arrayRandom2[1]]).toString()
        btn_image_11.text = (arrayRang[arrayRandom2[2]]).toString()
        btn_image_12.text = (arrayRang[arrayRandom2[3]]).toString()
        btn_image_13.text = (arrayRang[arrayRandom2[4]]).toString()
        btn_image_14.text = (arrayRang[arrayRandom2[5]]).toString()
        btn_image_15.text = (arrayRang[arrayRandom2[6]]).toString()
        btn_image_16.text = (arrayRang[arrayRandom2[7]]).toString()

    }

    @SuppressLint("SetTextI18n")
    fun Oyin(viewImage: TextView, viewCard: View) {
        val animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        var boolean = tekshirish.add(viewImage)
        if (boolean) {
            arrayJavob.add(viewImage)
            int++
        }

        fun onAnimationEnd(animation: Animation?) {
            if (boolean) {
                viewCard.startAnimation(animation)
                viewImage.visibility = View.VISIBLE
            }
        }
        onAnimationEnd(animation)


        if (int == 2) {
            if (arrayJavob[0].text == arrayJavob[1].text) {
                moves++
                tv_moves.text = "$moves Moves"
                togriJavoblar++
                arrayJavob[0].text = "off"
                arrayJavob[1].text = "off"
                tekshirish.clear()
                arrayJavob.clear()
                int = 0

                if (togriJavoblar == 8) {
                    timer.cancel()
                    DialogBulder()
                    dialog.show()
                    togriJavoblar = 0
                }
            }
        }
        if (int == 2) {
            moves++
            tv_moves.text = "$moves Moves"
            timerSelect.start()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun Restart() {
        timer.cancel()
        btn_image_1.visibility = View.GONE
        btn_image_2.visibility = View.GONE
        btn_image_3.visibility = View.GONE
        btn_image_4.visibility = View.GONE
        btn_image_5.visibility = View.GONE
        btn_image_6.visibility = View.GONE
        btn_image_7.visibility = View.GONE
        btn_image_8.visibility = View.GONE
        btn_image_9.visibility = View.GONE
        btn_image_10.visibility = View.GONE
        btn_image_11.visibility = View.GONE
        btn_image_12.visibility = View.GONE
        btn_image_13.visibility = View.GONE
        btn_image_14.visibility = View.GONE
        btn_image_15.visibility = View.GONE
        btn_image_16.visibility = View.GONE
        arrayJavob.clear()
        arrayRandom.clear()
        arrayRandom2.clear()
        arrayRang.clear()
        tekshirish.clear()
        booleanButtonBosilishiUchun = true
        booleanStartButton = false
        int = 0
        second = 60
        moves = 0
        RangniArraygaJoylash()
        Random_rang()
        Random_rang2()
        RangniImagelargaJoylash()
        timer.start()
        tv_moves.text = "$moves Moves"
    }

    @SuppressLint("InflateParams", "SetTextI18n")
    fun DialogBulder() {
        val alertDialog = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.dialog, null)

        val dialog_moves = view.findViewById<TextView>(R.id.tv_dialog_moves)
        val dialog_second = view.findViewById<TextView>(R.id.tv_dialog_second)
        val dialog_congratulations = view.findViewById<TextView>(R.id.congratulations)
        val dialog_seccessfully = view.findViewById<TextView>(R.id.seccessfully)
        val dialog_btn_play_again = view.findViewById<TextView>(R.id.btn_dialog_play_again)

        if (togriJavoblar == 8) {
            dialog_moves.visibility = View.VISIBLE
            dialog_second.visibility = View.VISIBLE
            dialog_moves.text = "It took you $moves moves"
            dialog_second.text = "and a time of ${60 - second} second"
            dialog_congratulations.text = "Congratulations!"
            dialog_congratulations.setTextColor(Color.parseColor("#4CAF50"))
            dialog_seccessfully.text = "You've seccessfully matched all the cards."
        } else {
            dialog_moves.visibility = View.GONE
            dialog_second.visibility = View.GONE
            dialog_congratulations.text = "Game Over"
            dialog_congratulations.setTextColor(Color.RED)
            dialog_seccessfully.text = "You have not been able to successfully match all the cards"
        }
        dialog_btn_play_again.setOnClickListener {
            arrayRang.clear()
            arrayRandom2.clear()
            arrayRandom.clear()
            arrayJavob.clear()
            tekshirish.clear()
            second = 0
            moves = 0
            togriJavoblar = 0
            tv_moves.text = "$moves Moves"
            tv_second.text = "$second Second"
            second = 60
            btn_image_1.visibility = View.GONE
            btn_image_2.visibility = View.GONE
            btn_image_3.visibility = View.GONE
            btn_image_4.visibility = View.GONE
            btn_image_5.visibility = View.GONE
            btn_image_6.visibility = View.GONE
            btn_image_7.visibility = View.GONE
            btn_image_8.visibility = View.GONE
            btn_image_9.visibility = View.GONE
            btn_image_10.visibility = View.GONE
            btn_image_11.visibility = View.GONE
            btn_image_12.visibility = View.GONE
            btn_image_13.visibility = View.GONE
            btn_image_14.visibility = View.GONE
            btn_image_15.visibility = View.GONE
            btn_image_16.visibility = View.GONE
            booleanButtonBosilishiUchun = false
            booleanStartButton = true
            int = 0
            dialog.cancel()
        }

        alertDialog.setView(view)

        dialog = alertDialog.create()
        dialog.window!!.attributes.windowAnimations = R.style.MyAnimation
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }
}