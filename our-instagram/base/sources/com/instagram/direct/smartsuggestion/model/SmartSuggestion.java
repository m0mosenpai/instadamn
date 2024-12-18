package com.instagram.direct.smartsuggestion.model;

import X.AbstractC82353lx;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.EnumC82333lv;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SmartSuggestion extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(87);
    public SmartSuggestionCTA A00;
    public SmartSuggestionCTA A01;
    public EnumC82333lv A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public HashMap A07;

    public SmartSuggestion() {
        Integer num = C05F.A00;
        EnumC82333lv enumC82333lv = EnumC82333lv.A09;
        HashMap hashMap = new HashMap();
        C14360o3.A0B(num, 1);
        C14360o3.A0B(enumC82333lv, 2);
        this.A03 = num;
        this.A02 = enumC82333lv;
        this.A04 = null;
        this.A06 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A07 = hashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmartSuggestion) {
                SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
                if (this.A03 != smartSuggestion.A03 || this.A02 != smartSuggestion.A02 || !C14360o3.A0K(this.A04, smartSuggestion.A04) || !C14360o3.A0K(this.A06, smartSuggestion.A06) || !C14360o3.A0K(this.A05, smartSuggestion.A05) || !C14360o3.A0K(this.A00, smartSuggestion.A00) || !C14360o3.A0K(this.A01, smartSuggestion.A01) || !C14360o3.A0K(this.A07, smartSuggestion.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(AbstractC82353lx.A01(this.A03));
        parcel.writeString(this.A02.name());
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        SmartSuggestionCTA smartSuggestionCTA = this.A00;
        if (smartSuggestionCTA == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartSuggestionCTA.writeToParcel(parcel, i);
        }
        SmartSuggestionCTA smartSuggestionCTA2 = this.A01;
        if (smartSuggestionCTA2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartSuggestionCTA2.writeToParcel(parcel, i);
        }
        HashMap hashMap = this.A07;
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Integer num = this.A03;
        int hashCode5 = (((AbstractC82353lx.A01(num).hashCode() + num.intValue()) * 31) + this.A02.hashCode()) * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A05;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SmartSuggestionCTA smartSuggestionCTA = this.A00;
        if (smartSuggestionCTA == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = smartSuggestionCTA.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        SmartSuggestionCTA smartSuggestionCTA2 = this.A01;
        if (smartSuggestionCTA2 != null) {
            i = smartSuggestionCTA2.hashCode();
        }
        return ((i5 + i) * 31) + this.A07.hashCode();
    }
}
