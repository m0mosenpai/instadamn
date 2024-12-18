package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC39841Hlp;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCommentGiphyMediaFixedHeightImages extends C17T implements CommentGiphyMediaFixedHeightImages {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(38);

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39841Hlp.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer BDS() {
        return AbstractC37301Gc2.A0U(this);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final String BV4() {
        return A0i(108273);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer BV5() {
        return getOptionalIntValueByHashCode(-1111056241);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer Bxa() {
        return getOptionalIntValueByHashCode(3530753);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final String CHQ() {
        return A0i(3645340);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer CHR() {
        return getOptionalIntValueByHashCode(-329753916);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final Integer CHg() {
        return AbstractC37301Gc2.A0Z(this);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final CommentGiphyMediaFixedHeightImagesImpl EsN() {
        Integer A0U = AbstractC37301Gc2.A0U(this);
        String A0i = A0i(108273);
        return new CommentGiphyMediaFixedHeightImagesImpl(A0U, getOptionalIntValueByHashCode(-1111056241), getOptionalIntValueByHashCode(3530753), getOptionalIntValueByHashCode(-329753916), AbstractC37301Gc2.A0Z(this), A0i, A0V(), A0i(3645340));
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
