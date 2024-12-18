package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC40030HpH;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class InlineStyleAtRangeDict extends C0T6 implements Parcelable, InlineStyleAtRangeDictIntf {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(55);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final InlineStyleAtRangeDict Evh() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineStyleAtRangeDict) {
                InlineStyleAtRangeDict inlineStyleAtRangeDict = (InlineStyleAtRangeDict) obj;
                if (!C14360o3.A0K(this.A00, inlineStyleAtRangeDict.A00) || !C14360o3.A0K(this.A01, inlineStyleAtRangeDict.A01) || !C14360o3.A0K(this.A02, inlineStyleAtRangeDict.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final Integer BHr() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final Integer BN2() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final Integer BYa() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.InlineStyleAtRangeDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTInlineStyleAtRangeDict", AbstractC40030HpH.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public InlineStyleAtRangeDict(Integer num, Integer num2, Integer num3) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = num3;
    }
}
