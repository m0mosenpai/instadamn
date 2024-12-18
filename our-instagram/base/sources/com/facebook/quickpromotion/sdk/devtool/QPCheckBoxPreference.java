package com.facebook.quickpromotion.sdk.devtool;

import X.C14360o3;
import X.C69638Vsf;
import X.InterfaceC55722hD;
import android.content.Context;
import androidx.preference.CheckBoxPreference;

/* loaded from: classes11.dex */
public final class QPCheckBoxPreference extends CheckBoxPreference {
    public final InterfaceC55722hD A00;

    public QPCheckBoxPreference(Context context, InterfaceC55722hD interfaceC55722hD) {
        super(context, null);
        this.A00 = interfaceC55722hD;
    }

    @Override // androidx.preference.Preference
    public final void A0C(C69638Vsf c69638Vsf) {
        C14360o3.A0B(c69638Vsf, 0);
        super.A0C(c69638Vsf);
    }
}
