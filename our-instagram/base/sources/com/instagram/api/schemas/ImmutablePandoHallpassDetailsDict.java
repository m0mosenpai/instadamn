package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC33694Eui;
import X.C17T;
import X.C1DY;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ImmutablePandoHallpassDetailsDict extends C17T implements HallpassDetailsDict {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(86);
    public List A00;

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final HallpassDetailsDict E99(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-410551881, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33694Eui.A00(this));
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final String BAt() {
        return A0j(1029998000);
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final List ByP() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final HallpassDetailsDictImpl Eu6(C1DY c1dy) {
        ArrayList arrayList;
        String A0i = A0i(94842723);
        String A0j = A0j(1029998000);
        String A0W = A0W();
        ImmutableList A08 = A08(-410551881, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, A0q, it);
            }
            if (A0q != null) {
                arrayList = AbstractC167017dG.A0q(A0q);
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    arrayList.add(c1dy.A00(AbstractC25226BEj.A15(it2)));
                }
                return new HallpassDetailsDictImpl(A0i, A0j, A0W, arrayList);
            }
        }
        arrayList = null;
        return new HallpassDetailsDictImpl(A0i, A0j, A0W, arrayList);
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final String getColor() {
        return A0i(94842723);
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final String getName() {
        return A0W();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
