package com.facebook.smartcapture.capture;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.C05F;
import X.C14360o3;
import X.C63473SlE;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class DefaultEvidenceRecorderProvider implements SelfieEvidenceRecorderProvider {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(60);
    public long A01;
    public RectF A02;
    public String A04;
    public String A05;
    public final ArrayList A06 = AbstractC166987dD.A1E();
    public int A00 = 224;
    public Integer A03 = C05F.A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeStringList(this.A06);
        parcel.writeInt(this.A00);
        AbstractC58318PtA.A1H(parcel, this.A03);
        parcel.writeParcelable(this.A02, i);
    }
}
