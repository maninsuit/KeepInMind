package com.hcg.keepinmind.util

import android.content.Context
import android.content.Intent

/**
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
░ Created By Hüseyin Cahit GÜRLEK ░
▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
░░░░░░░░░░░░░░░░░░░░░
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
░     20.2.2020       00:05       ░
▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄
 */

infix fun <ClassName> Context.extStartActivity(cls: Class<ClassName>) {
    startActivity(Intent(this, cls))
}