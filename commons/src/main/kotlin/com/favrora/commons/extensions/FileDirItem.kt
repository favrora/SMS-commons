package com.favrora.commons.extensions

import android.content.Context
import com.favrora.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
