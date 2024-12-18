package com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.education;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC25234BEr;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class NudityReceiverEducationSafetyTipsViewModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(49);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NudityReceiverEducationSafetyTipsViewModel) {
                NudityReceiverEducationSafetyTipsViewModel nudityReceiverEducationSafetyTipsViewModel = (NudityReceiverEducationSafetyTipsViewModel) obj;
                if (this.A00 != nudityReceiverEducationSafetyTipsViewModel.A00 || !C14360o3.A0K(this.A01, nudityReceiverEducationSafetyTipsViewModel.A01) || !C14360o3.A0K(this.A02, nudityReceiverEducationSafetyTipsViewModel.A02) || !C14360o3.A0K(this.A03, nudityReceiverEducationSafetyTipsViewModel.A03) || !C14360o3.A0K(this.A04, nudityReceiverEducationSafetyTipsViewModel.A04) || !C14360o3.A0K(this.A05, nudityReceiverEducationSafetyTipsViewModel.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31)))));
    }

    public NudityReceiverEducationSafetyTipsViewModel(String str, String str2, String str3, String str4, String str5, int i) {
        AbstractC25234BEr.A1R(str, str2, str3, str4, str5);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NudityReceiverEducationSafetyTipsViewModel(headlineImageDrawable=");
        A1C.append(this.A00);
        A1C.append(", headlineTitle=");
        A1C.append(this.A01);
        A1C.append(", safetyTipsBullet1=");
        A1C.append(this.A02);
        A1C.append(", safetyTipsBullet2=");
        A1C.append(this.A03);
        A1C.append(", safetyTipsBullet3=");
        A1C.append(this.A04);
        A1C.append(", safetyTipsBullet3Link=");
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
