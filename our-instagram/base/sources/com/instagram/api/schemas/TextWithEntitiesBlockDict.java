package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import X.Hw3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;

/* loaded from: classes7.dex */
public final class TextWithEntitiesBlockDict extends C0T6 implements Parcelable, TextWithEntitiesBlockDictIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(63);
    public final TextWithEntities A00;
    public final Integer A01;
    public final String A02;

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final TextWithEntitiesBlockDict F3K() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithEntitiesBlockDict) {
                TextWithEntitiesBlockDict textWithEntitiesBlockDict = (TextWithEntitiesBlockDict) obj;
                if (!C14360o3.A0K(this.A02, textWithEntitiesBlockDict.A02) || !C14360o3.A0K(this.A01, textWithEntitiesBlockDict.A01) || !C14360o3.A0K(this.A00, textWithEntitiesBlockDict.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A01));
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final Integer Awn() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final /* bridge */ /* synthetic */ TextWithEntitiesIntf C6r() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextWithEntitiesBlockDict", Hw3.A00(this));
    }

    @Override // com.instagram.api.schemas.TextWithEntitiesBlockDictIntf
    public final String getBlockType() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public TextWithEntitiesBlockDict(TextWithEntities textWithEntities, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = textWithEntities;
    }
}
