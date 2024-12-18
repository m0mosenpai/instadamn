package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC40113Hqg;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoNotePogVideoDict extends C17T implements NotePogVideoDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(28);

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final ImageInfo BGx() {
        return (ImageInfo) A04(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final List CFe() {
        return A0o(713258463, ImmutablePandoVideoVersion.class);
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40113Hqg.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final String getPk() {
        return A0k(3579);
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final NotePogVideoDict ExO() {
        String A0g = A0g();
        ImageInfoImpl F5B = BGx().F5B();
        String A0k = A0k(3579);
        List CFe = CFe();
        ArrayList A0q = AbstractC167017dG.A0q(CFe);
        Iterator it = CFe.iterator();
        while (it.hasNext()) {
            AbstractC37303Gc4.A1Y(A0q, it);
        }
        return new NotePogVideoDict(F5B, A0g, A0k, A0q);
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final String getId() {
        return A0g();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
