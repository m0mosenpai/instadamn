package com.facebook.common.callercontext;

import X.AbstractC03870Jc;
import X.C206149Aw;
import X.C44122Jem;
import X.C6VP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CallerContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(17);
    public final ContextChain A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerContext)) {
            return false;
        }
        CallerContext callerContext = (CallerContext) obj;
        return C6VP.A00(this.A02, callerContext.A02) && C6VP.A00(this.A01, callerContext.A01) && C6VP.A00(this.A03, callerContext.A03) && C6VP.A00(this.A04, callerContext.A04) && C6VP.A00(this.A00, callerContext.A00) && C6VP.A00(this.A05, callerContext.A05);
    }

    public static CallerContext A00(Class cls) {
        return new CallerContext(cls);
    }

    public static void A02(String str) {
        if (str != null && !str.isEmpty()) {
        } else {
            throw new IllegalArgumentException("callingClassName for the CallerContext cannot be null nor empty.");
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.A01;
        int i7 = i * 31;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i7 + i2;
        String str3 = this.A03;
        int i9 = i8 * 31;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = i9 + i3;
        String str4 = this.A04;
        int i11 = i10 * 31;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = i11 + i4;
        ContextChain contextChain = this.A00;
        int i13 = i12 * 31;
        if (contextChain != null) {
            i5 = contextChain.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = i13 + i5;
        Map map = this.A05;
        int i15 = i14 * 31;
        if (map != null) {
            i6 = map.hashCode();
        } else {
            i6 = 0;
        }
        return i15 + i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeMap(this.A05);
    }

    public CallerContext(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
        this.A05 = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public static CallerContext A01(String str) {
        A02(str);
        return new CallerContext(null, str);
    }

    public final String toString() {
        C44122Jem c44122Jem = new C44122Jem(getClass().getSimpleName());
        C44122Jem.A00(c44122Jem, this.A02, "Calling Class Name");
        C44122Jem.A00(c44122Jem, this.A01, "Analytics Tag");
        C44122Jem.A00(c44122Jem, this.A03, "Feature tag");
        C44122Jem.A00(c44122Jem, this.A04, "Module Analytics Tag");
        C44122Jem.A00(c44122Jem, this.A00, "Context Chain");
        C44122Jem.A00(c44122Jem, this.A05, "Request Tags");
        return c44122Jem.toString();
    }

    public CallerContext(ContextChain contextChain, String str) {
        this.A02 = str;
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = contextChain;
        this.A05 = null;
    }

    public CallerContext(Class cls) {
        cls.getClass();
        this.A02 = AbstractC03870Jc.A00(cls);
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public CallerContext() {
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        this.A05 = null;
    }
}
