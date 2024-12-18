package com.facebookpay.otc.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC25236BEt;
import X.AbstractC31176DnK;
import X.C14360o3;
import X.C63470SlB;
import X.EnumC129485tD;
import X.EnumC68133VCr;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class OtcOptionState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(17);
    public final EnumC68133VCr A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final boolean A04;

    public OtcOptionState(EnumC68133VCr enumC68133VCr, String str, String str2, Map map) {
        AbstractC25233BEq.A0w(1, str, enumC68133VCr, str2);
        this.A01 = str;
        this.A03 = map;
        this.A00 = enumC68133VCr;
        this.A02 = str2;
        EnumC68133VCr enumC68133VCr2 = EnumC68133VCr.A02;
        boolean z = true;
        if (enumC68133VCr == enumC68133VCr2) {
            if (!map.isEmpty()) {
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    if (AbstractC31176DnK.A0j(A15) != enumC68133VCr2) {
                        break;
                    }
                }
            }
            z = false;
        }
        this.A04 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtcOptionState) {
                OtcOptionState otcOptionState = (OtcOptionState) obj;
                if (!C14360o3.A0K(this.A01, otcOptionState.A01) || !C14360o3.A0K(this.A03, otcOptionState.A03) || this.A00 != otcOptionState.A00 || !C14360o3.A0K(this.A02, otcOptionState.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A03);
        while (A0s.hasNext()) {
            Map.Entry entry = (Map.Entry) A0s.next();
            AbstractC166997dE.A1I(parcel, (EnumC129485tD) entry.getKey());
            AbstractC166997dE.A1I(parcel, (EnumC68133VCr) entry.getValue());
        }
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A03, this.A01.hashCode() * 31)) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OtcOptionState(otcSessionId=");
        sb.append(this.A01);
        sb.append(", componentOtcStates=");
        sb.append(this.A03);
        sb.append(", defaultComponentOtcState=");
        sb.append(this.A00);
        sb.append(", otcType=");
        return AbstractC25236BEt.A0Y(this.A02, sb);
    }
}
