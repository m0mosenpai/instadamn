package com.instagram.common.clips.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25236BEt;
import X.AbstractC46668Kkl;
import X.C05F;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class LayoutTransform implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(14);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Integer A06;
    public final boolean A07;

    public LayoutTransform() {
        this(C05F.A00, 1.0f, 0.0f, 0.0f, 0.0f, 0, 0, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LayoutTransform) {
                LayoutTransform layoutTransform = (LayoutTransform) obj;
                if (this.A07 != layoutTransform.A07 || Float.compare(this.A02, layoutTransform.A02) != 0 || Float.compare(this.A00, layoutTransform.A00) != 0 || Float.compare(this.A03, layoutTransform.A03) != 0 || Float.compare(this.A01, layoutTransform.A01) != 0 || this.A06 != layoutTransform.A06 || this.A04 != layoutTransform.A04 || this.A05 != layoutTransform.A05) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A01);
        parcel.writeString(AbstractC46668Kkl.A00(this.A06));
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
    }

    public final int hashCode() {
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25225BEi.A08(this.A07), this.A02), this.A00), this.A03), this.A01);
        Integer num = this.A06;
        return ((AbstractC167017dG.A0L(num, AbstractC46668Kkl.A00(num), A00) + this.A04) * 31) + this.A05;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LayoutTransform(hflip=");
        A1C.append(this.A07);
        A1C.append(", scale=");
        A1C.append(this.A02);
        A1C.append(", leftPercentage=");
        A1C.append(this.A00);
        A1C.append(", topPercentage=");
        A1C.append(this.A03);
        A1C.append(", rotationDegrees=");
        A1C.append(this.A01);
        A1C.append(", cropType=");
        A1C.append(AbstractC46668Kkl.A00(this.A06));
        A1C.append(", underlayGradientBottomColor=");
        A1C.append(this.A04);
        A1C.append(", underlayGradientTopColor=");
        return AbstractC25236BEt.A0Z(A1C, this.A05);
    }

    public LayoutTransform(Integer num, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        C14360o3.A0B(num, 6);
        this.A07 = z;
        this.A02 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A01 = f4;
        this.A06 = num;
        this.A04 = i;
        this.A05 = i2;
    }
}
