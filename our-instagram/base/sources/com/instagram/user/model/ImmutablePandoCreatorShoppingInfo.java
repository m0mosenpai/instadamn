package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC152566tj;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorShoppingInfo extends C17T implements CreatorShoppingInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(91);
    public List A00;

    public static final List A01(C1DY c1dy, ImmutablePandoCreatorShoppingInfo immutablePandoCreatorShoppingInfo) {
        ImmutableList A08 = immutablePandoCreatorShoppingInfo.A08(811810775, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, A0q, it);
            }
            return A0q;
        }
        return null;
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final List BNf() {
        return this.A00;
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC152566tj.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final CreatorShoppingInfoImpl F7L(C1DY c1dy) {
        ArrayList arrayList;
        List A01 = A01(c1dy, this);
        if (A01 != null) {
            arrayList = AbstractC167017dG.A0q(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A18(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new CreatorShoppingInfoImpl(arrayList);
    }

    @Override // com.instagram.user.model.CreatorShoppingInfo
    public final CreatorShoppingInfoImpl F7M(C1DV c1dv) {
        return F7L(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
