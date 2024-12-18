package com.facebook.android.maps;

import X.AnonymousClass001;
import X.C206149Aw;
import X.C2I7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.maps.model.LatLng;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class StaticMapView$StaticMapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(4);
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public List A0C = Collections.EMPTY_LIST;

    public final void A00() {
        this.A0B = null;
        this.A02 = null;
        this.A0A = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0C.clear();
        this.A09 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticMapView$StaticMapOptions)) {
            return false;
        }
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = (StaticMapView$StaticMapOptions) obj;
        return C2I7.A00(this.A04, staticMapView$StaticMapOptions.A04) && C2I7.A00(this.A08, staticMapView$StaticMapOptions.A08) && C2I7.A00(this.A0B, staticMapView$StaticMapOptions.A0B) && C2I7.A00(this.A02, staticMapView$StaticMapOptions.A02) && C2I7.A00(this.A0A, staticMapView$StaticMapOptions.A0A) && C2I7.A00(this.A03, staticMapView$StaticMapOptions.A03) && C2I7.A00(this.A05, staticMapView$StaticMapOptions.A05) && C2I7.A00(this.A06, staticMapView$StaticMapOptions.A06) && C2I7.A00(this.A07, staticMapView$StaticMapOptions.A07) && this.A00 == staticMapView$StaticMapOptions.A00 && this.A01 == staticMapView$StaticMapOptions.A01 && this.A0C.equals(staticMapView$StaticMapOptions.A0C) && C2I7.A00(this.A09, staticMapView$StaticMapOptions.A09);
    }

    public final void A01(double d, double d2) {
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(d2);
        this.A02 = sb.toString();
    }

    public final void A04(LatLng latLng, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("color:0x");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%08X", Integer.valueOf((i >>> 24) | (i << 8))).toUpperCase(locale));
        sb.append('|');
        sb.append(latLng.A00);
        sb.append(',');
        sb.append(latLng.A01);
        sb.append('|');
        sb.append(i2);
        sb.append('m');
        this.A03 = sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        String str2 = this.A08;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A0B;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A02;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.A0A;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.A03;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.A05;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.A06;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str9 = this.A07;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int floatToIntBits = (((((((i9 + hashCode9) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A0C.hashCode()) * 31;
        String str10 = this.A09;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return floatToIntBits + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
    }

    public StaticMapView$StaticMapOptions(String str) {
        this.A08 = str;
    }

    public final void A02(double d, double d2) {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass001.A0g("color:", "red", "|"));
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        this.A06 = sb.toString();
    }

    public final void A03(int i) {
        this.A0B = String.valueOf(i);
    }

    public final void A05(List list) {
        String substring;
        if (list.isEmpty()) {
            substring = null;
        } else {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty("red")) {
                sb.append("|color:");
                sb.append("red");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LatLng latLng = (LatLng) it.next();
                sb.append('|');
                sb.append(latLng.A00);
                sb.append(',');
                sb.append(latLng.A01);
            }
            substring = sb.toString().substring(1);
        }
        this.A06 = substring;
    }
}
