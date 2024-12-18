package com.instagram.direct.messagethread.interaction.longpressaction;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.EnumC46221Kcx;
import X.LC1;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class LongPressActionData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(17);
    public final LongPressActionLabelSpan A00;
    public final EnumC46221Kcx A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LongPressActionData) {
                LongPressActionData longPressActionData = (LongPressActionData) obj;
                if (this.A03 != longPressActionData.A03 || !C14360o3.A0K(this.A04, longPressActionData.A04) || !C14360o3.A0K(this.A02, longPressActionData.A02) || this.A01 != longPressActionData.A01 || !C14360o3.A0K(this.A00, longPressActionData.A00) || !C14360o3.A0K(this.A05, longPressActionData.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(LC1.A01(this.A03));
        parcel.writeString(this.A04);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        AbstractC166997dE.A1I(parcel, this.A01);
        LongPressActionLabelSpan longPressActionLabelSpan = this.A00;
        if (longPressActionLabelSpan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            longPressActionLabelSpan.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        Integer num = this.A03;
        return ((AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0K(this.A04, AbstractC25230BEn.A0C(num, LC1.A01(num)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public LongPressActionData(LongPressActionLabelSpan longPressActionLabelSpan, EnumC46221Kcx enumC46221Kcx, Integer num, Integer num2, String str, String str2) {
        AbstractC25234BEr.A1P(num, str, enumC46221Kcx);
        this.A03 = num;
        this.A04 = str;
        this.A02 = num2;
        this.A01 = enumC46221Kcx;
        this.A00 = longPressActionLabelSpan;
        this.A05 = str2;
    }
}
