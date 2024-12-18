package com.facebook.react.bridge;

import X.AbstractC58321PtD;
import X.R3M;
import android.app.Activity;

/* loaded from: classes10.dex */
public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    public ReactContextBaseJavaModule(R3M r3m) {
        super(r3m);
    }

    public final Activity getCurrentActivity() {
        return AbstractC58321PtD.A0b(this).A01();
    }

    public ReactContextBaseJavaModule() {
        super(null);
    }
}
