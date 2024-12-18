package com.facebook.fbservice.service;

import X.AbstractC61772RtS;
import X.C05F;
import X.C0JY;
import X.C63475SlG;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class OperationResult implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(93);
    public boolean A05 = true;
    public String A03 = null;
    public Bundle A00 = null;
    public Integer A01 = C05F.A00;
    public String A02 = null;
    public Throwable A04 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String obj;
        String A00;
        Boolean valueOf = Boolean.valueOf(this.A05);
        String str = this.A03;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Bundle bundle = this.A00;
        if (bundle == null) {
            obj = "";
        } else {
            obj = bundle.toString();
        }
        Integer num = this.A01;
        if (num == null) {
            A00 = "";
        } else {
            A00 = AbstractC61772RtS.A00(num);
        }
        String str3 = this.A02;
        if (str3 == null) {
            str3 = "";
        }
        Throwable th = this.A04;
        if (th != null) {
            str2 = C0JY.A00(th);
        }
        return StringFormatUtil.formatStrLocaleSafe("OperationResult success=%s, resultDataString=%s, resultDataBundle=%s, errorCode=%s, errorDescription=%s, exception=%s", valueOf, str, obj, A00, str3, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A00);
        parcel.writeString(AbstractC61772RtS.A00(this.A01));
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A04);
    }
}
