package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class OneTapLinkedProfileInfoImpl extends C0T6 implements Parcelable, OneTapLinkedProfileInfo {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(21);
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
            if (obj instanceof OneTapLinkedProfileInfoImpl) {
                OneTapLinkedProfileInfoImpl oneTapLinkedProfileInfoImpl = (OneTapLinkedProfileInfoImpl) obj;
                if (!C14360o3.A0K(this.A04, oneTapLinkedProfileInfoImpl.A04) || !C14360o3.A0K(this.A00, oneTapLinkedProfileInfoImpl.A00) || !C14360o3.A0K(this.A01, oneTapLinkedProfileInfoImpl.A01) || !C14360o3.A0K(this.A02, oneTapLinkedProfileInfoImpl.A02) || !C14360o3.A0K(this.A03, oneTapLinkedProfileInfoImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public OneTapLinkedProfileInfoImpl(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }
}
