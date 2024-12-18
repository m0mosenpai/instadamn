package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40111Hqe;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoNotePogImageDict extends C17T implements NotePogImageDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(27);

    @Override // com.instagram.api.schemas.NotePogImageDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40111Hqe.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.NotePogImageDictIntf
    public final String getPk() {
        return A0k(3579);
    }

    @Override // com.instagram.api.schemas.NotePogImageDictIntf
    public final String BGu() {
        return A0h(-877823861);
    }

    @Override // com.instagram.api.schemas.NotePogImageDictIntf
    public final NotePogImageDict ExN() {
        return new NotePogImageDict(A0g(), A0h(-877823861), A0k(3579));
    }

    @Override // com.instagram.api.schemas.NotePogImageDictIntf
    public final String getId() {
        return A0g();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
