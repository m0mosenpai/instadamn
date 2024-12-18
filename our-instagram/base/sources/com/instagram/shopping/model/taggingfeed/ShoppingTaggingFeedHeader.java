package com.instagram.shopping.model.taggingfeed;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ShoppingTaggingFeedHeader extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(90);
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public ShoppingTaggingFeedHeader(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = str3;
        this.A05 = z3;
        this.A06 = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingTaggingFeedHeader) {
                ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = (ShoppingTaggingFeedHeader) obj;
                if (!C14360o3.A0K(this.A01, shoppingTaggingFeedHeader.A01) || !C14360o3.A0K(this.A02, shoppingTaggingFeedHeader.A02) || this.A03 != shoppingTaggingFeedHeader.A03 || this.A04 != shoppingTaggingFeedHeader.A04 || !C14360o3.A0K(this.A00, shoppingTaggingFeedHeader.A00) || this.A05 != shoppingTaggingFeedHeader.A05 || this.A06 != shoppingTaggingFeedHeader.A06) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A05, (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31)) + AbstractC25227BEk.A07(this.A00)) * 31));
    }

    public ShoppingTaggingFeedHeader() {
        this("", null, null, false, false, false, false);
    }
}
