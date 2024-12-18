package com.facebook.msys.dasm;

import X.AbstractC09780fb;
import X.C09170dP;
import X.C61D;
import android.content.Context;
import android.content.res.AssetManager;

/* loaded from: classes3.dex */
public class DasmSupportHelper {
    public static volatile Context sContext;

    static {
        synchronized (C61D.class) {
            if (!C61D.A00) {
                C09170dP.A0C("msysjnidasm");
                C61D.A00 = true;
            }
        }
    }

    public static AssetManager assets() {
        if (sContext != null) {
            return sContext.getAssets();
        }
        return null;
    }

    public static synchronized void initialize(Context context) {
        synchronized (DasmSupportHelper.class) {
            AbstractC09780fb.A01("DasmSupportHelper.initialize", 1443598349);
            try {
                if (sContext == null) {
                    sContext = context.getApplicationContext();
                }
                AbstractC09780fb.A00(-1838310010);
            } catch (Throwable th) {
                AbstractC09780fb.A00(-1535965724);
                throw th;
            }
        }
    }
}
