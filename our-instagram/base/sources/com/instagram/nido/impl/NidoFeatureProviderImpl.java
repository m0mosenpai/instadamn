package com.instagram.nido.impl;

import X.B4Z;
import X.C49524Lud;
import X.JXJ;
import X.MR7;

/* loaded from: classes8.dex */
public abstract class NidoFeatureProviderImpl {
    public static boolean A00;

    public static final MR7 A00(Integer num) {
        int intValue;
        MR7 jxj;
        if (num != null && (intValue = num.intValue()) != -1) {
            if (intValue != 0) {
                if (intValue == 1) {
                    jxj = new C49524Lud();
                } else {
                    throw B4Z.A00();
                }
            } else {
                jxj = new JXJ();
            }
            return jxj;
        }
        return null;
    }
}
