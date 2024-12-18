package com.instagram.api.schemas;

import X.AbstractC53774NqQ;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class GenAIToolInfoDict extends C0T6 implements GenAIToolInfoDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41854Ig8(95);
    public final CameraTool A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final GenAIToolInfoDict Etq() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIToolInfoDict) {
                GenAIToolInfoDict genAIToolInfoDict = (GenAIToolInfoDict) obj;
                if (!C14360o3.A0K(this.A01, genAIToolInfoDict.A01) || !C14360o3.A0K(this.A02, genAIToolInfoDict.A02) || !C14360o3.A0K(this.A03, genAIToolInfoDict.A03) || !C14360o3.A0K(this.A04, genAIToolInfoDict.A04) || !C14360o3.A0K(this.A05, genAIToolInfoDict.A05) || !C14360o3.A0K(this.A06, genAIToolInfoDict.A06) || !C14360o3.A0K(this.A07, genAIToolInfoDict.A07) || this.A00 != genAIToolInfoDict.A00 || !C14360o3.A0K(this.A08, genAIToolInfoDict.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A06;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A07;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.A00.hashCode()) * 31;
        String str8 = this.A08;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
    }

    public GenAIToolInfoDict(CameraTool cameraTool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C14360o3.A0B(cameraTool, 8);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = cameraTool;
        this.A08 = str8;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Ar1() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Bid() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Bl1() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Bo9() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String Boj() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String C0j() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final CameraTool C9G() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String C9b() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGenAIToolInfoDict", AbstractC53774NqQ.A00(this));
    }

    @Override // com.instagram.api.schemas.GenAIToolInfoDictIntf
    public final String getBackgroundColor() {
        return this.A01;
    }
}
