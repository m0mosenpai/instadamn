package com.instagram.phonenumber.model;

import X.AbstractC13670mt;
import X.AnonymousClass001;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class CountryCodeData implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(53);
    public String A00;
    public String A01;
    public String A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryCodeData(int i, String str) {
        this(String.valueOf(i), new Locale("", str).getDisplayCountry(), str);
        C14360o3.A0B(str, 2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public final String A00() {
        return AnonymousClass001.A0D(this.A01, '+');
    }

    public final String A01() {
        return AbstractC13670mt.A06("%s (+%s)", this.A02, this.A01);
    }

    public final String A02() {
        return AbstractC13670mt.A06("%s +%s", this.A00, this.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        CountryCodeData countryCodeData = (CountryCodeData) obj;
        int i = 0;
        C14360o3.A0B(countryCodeData, 0);
        String str = this.A02;
        if (str == null || countryCodeData.A02 == null) {
            String str2 = countryCodeData.A02;
            if (str2 != null && str != null) {
                i = str.compareTo(str2);
                if (Integer.valueOf(i) == null) {
                    return -1;
                }
            } else {
                return -1;
            }
        }
        return i;
    }

    public CountryCodeData(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public CountryCodeData() {
        this.A01 = "";
        this.A00 = "";
    }
}
