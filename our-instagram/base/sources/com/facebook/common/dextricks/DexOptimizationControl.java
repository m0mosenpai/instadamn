package com.facebook.common.dextricks;

import X.C0b3;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class DexOptimizationControl {
    public static void pauseOptimization(Context context, int i) {
        Intent intent = new Intent(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
        intent.putExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, System.nanoTime() + (i * DexStore.MS_IN_NS));
        C0b3.A00().A07().A0C(context, intent);
    }
}
