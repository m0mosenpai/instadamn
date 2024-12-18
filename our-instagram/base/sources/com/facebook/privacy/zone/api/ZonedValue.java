package com.facebook.privacy.zone.api;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C63473SlE;
import X.MSY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.zone.policy.ZonePolicy;
import kotlin.Deprecated;

/* loaded from: classes10.dex */
public class ZonedValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(50);
    public final ZonePolicy A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Please use the constructor with Annotation Site ID")
    public ZonedValue(ZonePolicy zonePolicy, Object obj) {
        this(zonePolicy, obj, "UNKNOWN");
        C14360o3.A0B(zonePolicy, 2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String A0h;
        C14360o3.A0B(parcel, 0);
        Object obj = this.A01;
        if (obj == null) {
            A0h = "NULL";
        } else {
            A0h = MSY.A0h(obj);
        }
        parcel.writeString(A0h);
        parcel.writeValue(obj);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public ZonedValue(ZonePolicy zonePolicy, Object obj, String str) {
        AbstractC167017dG.A1R(zonePolicy, str);
        this.A01 = obj;
        this.A00 = zonePolicy;
        this.A02 = str;
    }
}
