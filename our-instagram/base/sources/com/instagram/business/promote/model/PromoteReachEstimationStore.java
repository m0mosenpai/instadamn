package com.instagram.business.promote.model;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.Estimate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class PromoteReachEstimationStore implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(78);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A06;
    public boolean A07;
    public Map A05 = new HashMap();
    public Map A04 = new HashMap();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A05.size());
        Iterator A15 = AbstractC166997dE.A15(this.A05);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            int intValue = ((Number) entry.getKey()).intValue();
            Estimate estimate = (Estimate) entry.getValue();
            parcel.writeInt(intValue);
            parcel.writeParcelable(estimate, i);
        }
        parcel.writeInt(this.A04.size());
        Iterator A152 = AbstractC166997dE.A15(this.A04);
        while (A152.hasNext()) {
            Map.Entry entry2 = (Map.Entry) A152.next();
            int intValue2 = ((Number) entry2.getKey()).intValue();
            Estimate estimate2 = (Estimate) entry2.getValue();
            parcel.writeInt(intValue2);
            parcel.writeParcelable(estimate2, i);
        }
    }
}
