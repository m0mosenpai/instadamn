package com.facebook.common.util;

import X.AbstractC50102Ry;
import X.AbstractC58322PtE;
import X.C63475SlG;
import X.InterfaceC216113n;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: classes10.dex */
public class Either implements InterfaceC216113n, Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(81);
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Either)) {
            return false;
        }
        return AbstractC50102Ry.A00(get(), ((Either) obj).get());
    }

    @Override // X.InterfaceC216113n
    public final Object get() {
        if (this.A02) {
            return this.A00;
        }
        return this.A01;
    }

    public final String toString() {
        String str;
        if (this.A02) {
            str = "left";
        } else {
            str = "right";
        }
        return StringFormatUtil.formatStrLocaleSafe("Either.%s(%s)", str, String.valueOf(get()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public Either(Object obj, Object obj2, boolean z) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(get());
    }
}
