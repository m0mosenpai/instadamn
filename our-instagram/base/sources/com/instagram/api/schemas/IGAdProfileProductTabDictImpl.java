package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC31179DnN;
import X.AbstractC33698Eum;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class IGAdProfileProductTabDictImpl extends C0T6 implements Parcelable, IGAdProfileProductTabDict {
    public static final Parcelable.Creator CREATOR = new C41858IgC(17);
    public final IGAdProfileProductTabFeatureModeEnum A00;
    public final Boolean A01;
    public final Boolean A02;
    public final List A03;

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabDictImpl EuJ(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabDictImpl EuK(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdProfileProductTabDictImpl) {
                IGAdProfileProductTabDictImpl iGAdProfileProductTabDictImpl = (IGAdProfileProductTabDictImpl) obj;
                if (this.A00 != iGAdProfileProductTabDictImpl.A00 || !C14360o3.A0K(this.A01, iGAdProfileProductTabDictImpl.A01) || !C14360o3.A0K(this.A02, iGAdProfileProductTabDictImpl.A02) || !C14360o3.A0K(this.A03, iGAdProfileProductTabDictImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        AbstractC31179DnN.A0p(parcel, this.A01);
        AbstractC31179DnN.A0p(parcel, this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdProfileProductTabDict", AbstractC33698Eum.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public IGAdProfileProductTabDictImpl(IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum, Boolean bool, Boolean bool2, List list) {
        this.A00 = iGAdProfileProductTabFeatureModeEnum;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = list;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabFeatureModeEnum B5K() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final Boolean BUz() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final List BhR() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final Boolean Cay() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabDict E9A(C1DY c1dy) {
        return this;
    }
}
