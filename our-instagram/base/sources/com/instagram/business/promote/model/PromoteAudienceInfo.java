package com.instagram.business.promote.model;

import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.C14360o3;
import X.C40781ul;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class PromoteAudienceInfo extends C40781ul implements Parcelable {
    public static final PromoteAudienceInfo A09;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public int A01;
    public AdvantageAudienceData A02;
    public TargetingRelaxationConstants A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public List A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && AbstractC167017dG.A1Z(this, obj) && hashCode() == obj.hashCode();
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        if (this.A06 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.A06);
        }
        if (this.A07 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.A07);
        }
        if (this.A08 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.A08);
        }
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Vsq, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A06 = AbstractC16960so.A1N(AudienceGender.A04, AudienceGender.A03);
        obj.A00 = 65;
        obj.A01 = 13;
        obj.A03 = TargetingRelaxationConstants.A05;
        A09 = obj.A00();
        CREATOR = new C70220WId(61);
    }

    public final boolean A00() {
        List list;
        List list2;
        if (this.A00 > 0 && this.A01 > 0 && (list = this.A06) != null && !list.isEmpty() && (list2 = this.A07) != null && !list2.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A06, this.A07, this.A08, this.A03, this.A02});
    }
}
