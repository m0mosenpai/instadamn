package com.facebookpay.apm;

import X.C14360o3;
import X.C2FP;
import X.C63473SlE;
import X.XGq;
import android.os.Parcel;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.facebookpay.expresscheckout.models.APMConfiguration;

/* loaded from: classes11.dex */
public final class APMConfigurationImpl implements APMConfiguration {
    public static final C63473SlE CREATOR = new C63473SlE(86);
    public final XGq A00;

    public APMConfigurationImpl(XGq xGq) {
        C14360o3.A0B(xGq, 1);
        this.A00 = xGq;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        C2FP.A0J();
        TreeParcelable.A01(parcel, (TreeJNI) this.A00);
    }
}
