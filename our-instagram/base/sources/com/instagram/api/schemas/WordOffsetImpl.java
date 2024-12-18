package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC37300Gc1;
import X.AbstractC40455Hwk;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class WordOffsetImpl extends C0T6 implements Parcelable, WordOffset {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(86);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    @Override // com.instagram.api.schemas.WordOffset
    public final WordOffsetImpl F3z() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WordOffsetImpl) {
                WordOffsetImpl wordOffsetImpl = (WordOffsetImpl) obj;
                if (this.A00 != wordOffsetImpl.A00 || this.A01 != wordOffsetImpl.A01 || this.A02 != wordOffsetImpl.A02 || this.A03 != wordOffsetImpl.A03 || this.A04 != wordOffsetImpl.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int B1x() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int Bzc() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int Bzf() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final boolean CAT() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTWordOffset", AbstractC40455Hwk.A00(this));
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int getEndIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, ((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31);
    }

    public WordOffsetImpl(int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = z;
    }
}
