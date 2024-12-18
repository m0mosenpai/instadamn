package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40141HrA;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class Phrase extends C0T6 implements Parcelable, PhraseIntf {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(35);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    @Override // com.instagram.api.schemas.PhraseIntf
    public final Phrase Exz() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Phrase) {
                Phrase phrase = (Phrase) obj;
                if (!C14360o3.A0K(this.A00, phrase.A00) || !C14360o3.A0K(this.A02, phrase.A02) || !C14360o3.A0K(this.A01, phrase.A01) || !C14360o3.A0K(this.A03, phrase.A03)) {
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
        parcel.writeString(this.A02);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0l, i);
        }
    }

    @Override // com.instagram.api.schemas.PhraseIntf
    public final Integer B26() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.PhraseIntf
    public final String Bd1() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.PhraseIntf
    public final Integer Bzl() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.PhraseIntf
    public final List CHp() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.PhraseIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTPhrase", AbstractC40141HrA.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public Phrase(Integer num, Integer num2, String str, List list) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = list;
    }
}
