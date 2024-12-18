package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.EnumC39588Hdy;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes7.dex */
public final class ShoppingHomeDestination extends C0T6 implements Parcelable {
    public static final C41856IgA CREATOR = C41856IgA.A00(20);
    public EnumC39588Hdy A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    public ShoppingHomeDestination() {
        EnumC39588Hdy enumC39588Hdy = EnumC39588Hdy.A0S;
        C14360o3.A0B(enumC39588Hdy, 1);
        this.A00 = enumC39588Hdy;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
        this.A07 = null;
        this.A01 = null;
        this.A05 = null;
        this.A06 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingHomeDestination) {
                ShoppingHomeDestination shoppingHomeDestination = (ShoppingHomeDestination) obj;
                if (this.A00 != shoppingHomeDestination.A00 || !C14360o3.A0K(this.A02, shoppingHomeDestination.A02) || !C14360o3.A0K(this.A03, shoppingHomeDestination.A03) || !C14360o3.A0K(this.A04, shoppingHomeDestination.A04) || !C14360o3.A0K(this.A07, shoppingHomeDestination.A07) || !C14360o3.A0K(this.A01, shoppingHomeDestination.A01) || !C14360o3.A0K(this.A05, shoppingHomeDestination.A05) || !C14360o3.A0K(this.A06, shoppingHomeDestination.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        EnumC39588Hdy enumC39588Hdy = this.A00;
        if (enumC39588Hdy != null) {
            str = enumC39588Hdy.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A07);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((((((((((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }
}
