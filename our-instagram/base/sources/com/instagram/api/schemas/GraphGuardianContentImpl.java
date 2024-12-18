package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class GraphGuardianContentImpl extends C0T6 implements Parcelable, GraphGuardianContent {
    public static final Parcelable.Creator CREATOR = new C41858IgC(0);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphGuardianContentImpl) {
                GraphGuardianContentImpl graphGuardianContentImpl = (GraphGuardianContentImpl) obj;
                if (!C14360o3.A0K(this.A00, graphGuardianContentImpl.A00) || !C14360o3.A0K(this.A01, graphGuardianContentImpl.A01) || !C14360o3.A0K(this.A02, graphGuardianContentImpl.A02) || !C14360o3.A0K(this.A03, graphGuardianContentImpl.A03) || !C14360o3.A0K(this.A04, graphGuardianContentImpl.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A03;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A04;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String Agr() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String Aj5() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String AjA() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String getTitle() {
        return this.A04;
    }

    public GraphGuardianContentImpl(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
