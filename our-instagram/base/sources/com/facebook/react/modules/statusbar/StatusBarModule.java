package com.facebook.react.modules.statusbar;

import X.AbstractC009003e;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.AbstractC25233BEq;
import X.AbstractC58321PtD;
import X.C011504d;
import X.C0I2;
import X.C62166S0n;
import X.C63255SgD;
import X.C67603UsO;
import X.R36;
import X.R3M;
import X.RunnableC64633TNp;
import X.RunnableC64634TNq;
import X.WF1;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Arrays;
import java.util.Map;

@ReactModule(name = "StatusBarManager")
/* loaded from: classes10.dex */
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final C62166S0n Companion = new Object();
    public static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    public static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d, boolean z) {
        int i = (int) d;
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 == null) {
            C0I2.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C63255SgD.A01(new C67603UsO(A01, AbstractC58321PtD.A0b(this), i, z));
        }
    }

    public StatusBarModule(R3M r3m) {
        super(r3m);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        C011504d A00;
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 != null && (window = A01.getWindow()) != null && (decorView = window.getDecorView()) != null && (A00 = AbstractC009003e.A00(decorView)) != null) {
            return A00.A00.A05(131).A03;
        }
        return 0.0f;
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public Map getTypedExportedConstants() {
        String str;
        Window window;
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 != null && (window = A01.getWindow()) != null) {
            str = AbstractC166997dE.A0z("#%06X", Arrays.copyOf(AbstractC25228BEl.A1Y(window.getStatusBarColor() & 16777215), 1));
        } else {
            str = "black";
        }
        return AbstractC25233BEq.A0p(DEFAULT_BACKGROUND_COLOR_KEY, str, AbstractC166987dD.A1L(HEIGHT_KEY, Float.valueOf(WF1.A00(getStatusBarHeightPx()))));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(boolean z) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 == null) {
            C0I2.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C63255SgD.A01(new RunnableC64633TNp(A01, z));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(String str) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 == null) {
            C0I2.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C63255SgD.A01(new RunnableC64634TNq(A01, str));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 == null) {
            C0I2.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C63255SgD.A01(new R36(A01, AbstractC58321PtD.A0b(this), z));
        }
    }
}
