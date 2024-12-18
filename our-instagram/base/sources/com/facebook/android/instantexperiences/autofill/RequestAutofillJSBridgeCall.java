package com.facebook.android.instantexperiences.autofill;

import X.AbstractC58320PtC;
import X.C14360o3;
import X.EnumC61176Rgc;
import X.Py5;
import X.Rk1;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class RequestAutofillJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = Py5.A00(89);
    public volatile LinkedHashSet A00;

    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
    }

    @Override // com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall
    public final void A01() {
        super.A01();
        Bundle bundle = this.A01;
        String valueOf = String.valueOf(AbstractC58320PtC.A0r(bundle, "selectedAutoCompleteTag"));
        if (valueOf != null && valueOf.length() != 0) {
            String valueOf2 = String.valueOf(AbstractC58320PtC.A0r(bundle, "autofillFields"));
            if (valueOf2 != null && valueOf2.length() != 0) {
                return;
            } else {
                throw new Rk1(EnumC61176Rgc.A06, "Autofill fields cannot be empty or null");
            }
        }
        throw new Rk1(EnumC61176Rgc.A06, "Selected auto fill tag cannot be empty or null");
    }
}
