package com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data;

import X.AbstractC22720A0q;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class PrivacyMediaOverlayViewModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(90);
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PrivacyMediaOverlayViewModel(Integer num, Integer num2, String str, String str2, String str3, String str4, int i, boolean z) {
        C14360o3.A0B(num2, 6);
        this.A06 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A03 = str4;
        this.A02 = num2;
        this.A07 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PrivacyMediaOverlayViewModel) {
                PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = (PrivacyMediaOverlayViewModel) obj;
                if (!C14360o3.A0K(this.A06, privacyMediaOverlayViewModel.A06) || !C14360o3.A0K(this.A04, privacyMediaOverlayViewModel.A04) || !C14360o3.A0K(this.A01, privacyMediaOverlayViewModel.A01) || !C14360o3.A0K(this.A05, privacyMediaOverlayViewModel.A05) || !C14360o3.A0K(this.A03, privacyMediaOverlayViewModel.A03) || this.A02 != privacyMediaOverlayViewModel.A02 || this.A07 != privacyMediaOverlayViewModel.A07 || this.A00 != privacyMediaOverlayViewModel.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        Integer num = this.A01;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(AbstractC22720A0q.A00(this.A02));
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.A01;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.A05;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i6 = (i5 + i) * 31;
        Integer num2 = this.A02;
        int hashCode5 = (i6 + AbstractC22720A0q.A00(num2).hashCode() + num2.intValue()) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        return ((hashCode5 + i7) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyMediaOverlayViewModel(titleConcealedState=");
        sb.append(this.A06);
        sb.append(", subtitleConcealedState=");
        sb.append(this.A04);
        sb.append(", iconBlurredStateResource=");
        sb.append(this.A01);
        sb.append(", titleBlurredState=");
        sb.append(this.A05);
        sb.append(", subtitleBlurredState=");
        sb.append(this.A03);
        sb.append(", inThreadTapBehavior=");
        Integer num = this.A02;
        if (num != null) {
            str = AbstractC22720A0q.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", isInThreadReply=");
        sb.append(this.A07);
        sb.append(", interventionType=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public PrivacyMediaOverlayViewModel() {
        this(null, C05F.A00, null, null, null, null, 0, false);
    }
}
