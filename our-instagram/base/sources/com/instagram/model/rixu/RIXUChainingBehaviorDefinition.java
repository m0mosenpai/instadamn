package com.instagram.model.rixu;

import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import java.util.List;

/* loaded from: classes3.dex */
public final class RIXUChainingBehaviorDefinition extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(30);
    public RIXUChainingSourceType A00;
    public RIXUCoverChainingType A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public List A05;

    public RIXUChainingBehaviorDefinition() {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 6);
        this.A01 = null;
        this.A00 = null;
        this.A03 = false;
        this.A04 = null;
        this.A02 = false;
        this.A05 = c16930sl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }
}
