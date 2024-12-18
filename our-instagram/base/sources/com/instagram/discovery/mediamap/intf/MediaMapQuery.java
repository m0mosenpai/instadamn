package com.instagram.discovery.mediamap.intf;

import X.AbstractC50102Ry;
import X.AnonymousClass001;
import X.LNL;
import X.VEZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class MediaMapQuery implements Parcelable {
    public static final MediaMapQuery A08 = new MediaMapQuery(VEZ.A06, "17843767138059124", "popular");
    public static final MediaMapQuery A09 = new MediaMapQuery(VEZ.A07, "saved", "saved");
    public static final Parcelable.Creator CREATOR = new LNL(60);
    public String A00;
    public String A01;
    public String A02;
    public List A03 = new ArrayList();
    public boolean A04;
    public boolean A05;
    public final VEZ A06;
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MediaMapQuery)) {
            return false;
        }
        MediaMapQuery mediaMapQuery = (MediaMapQuery) obj;
        return AbstractC50102Ry.A00(this.A07, mediaMapQuery.A07) && AbstractC50102Ry.A00(this.A06, mediaMapQuery.A06);
    }

    public final String A00() {
        String str;
        String str2;
        int ordinal = this.A06.ordinal();
        if (ordinal != 3) {
            if (ordinal != 1) {
                if (ordinal != 0) {
                    return this.A01;
                }
                String str3 = this.A01;
                str = String.valueOf(str3.charAt(0)).toUpperCase();
                str2 = str3.substring(1);
            } else {
                str = "#";
                str2 = this.A01;
            }
            return AnonymousClass001.A0R(str, str2);
        }
        return "";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A06, this.A01});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06.ordinal());
    }

    public MediaMapQuery(VEZ vez, String str, String str2) {
        this.A06 = vez;
        this.A07 = str;
        this.A01 = str2;
    }

    public MediaMapQuery(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A07 = readString;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A01 = readString2;
        this.A06 = VEZ.values()[parcel.readInt()];
    }
}
