package com.facebook.react.modules.toast;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC25227BEk;
import X.C14360o3;
import X.C62167S0o;
import X.C63255SgD;
import X.R3M;
import X.RunnableC64689TPu;
import X.TQg;
import X.TRI;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "ToastAndroid")
/* loaded from: classes10.dex */
public final class ToastModule extends NativeToastAndroidSpec {
    public static final C62167S0o Companion = new Object();
    public static final String DURATION_LONG_KEY = "LONG";
    public static final String DURATION_SHORT_KEY = "SHORT";
    public static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(String str, double d) {
        C63255SgD.A01(new RunnableC64689TPu(this, str, (int) d));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(String str, double d, double d2) {
        C63255SgD.A01(new TQg(this, str, (int) d, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4) {
        C63255SgD.A01(new TRI(this, str, (int) d, (int) d2, (int) d3, (int) d4));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map getTypedExportedConstants() {
        return AbstractC06930Yk.A07(AbstractC166987dD.A1L(DURATION_SHORT_KEY, AbstractC25227BEk.A0p()), AbstractC166987dD.A1L(DURATION_LONG_KEY, 1), AbstractC166987dD.A1L("TOP", 49), AbstractC166987dD.A1L("BOTTOM", 81), AbstractC166987dD.A1L("CENTER", 17));
    }
}
