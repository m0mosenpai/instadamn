package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC39843Hlr;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCommentGiphyMediaInfo extends C17T implements CommentGiphyMediaInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(40);

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final CommentGiphyMediaImagesIntf B6d() {
        return (CommentGiphyMediaImagesIntf) A05(1944022132, ImmutablePandoCommentGiphyMediaImages.class);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final CommentGiphyMediaImagesIntf BH0() {
        return (CommentGiphyMediaImagesIntf) A05(-1185250696, ImmutablePandoCommentGiphyMediaImages.class);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39843Hlr.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final String B9n() {
        return A0j(1329489265);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final Boolean Cdg() {
        return getOptionalBooleanValueByHashCode(-389942488);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final CommentGiphyMediaInfo EsP() {
        CommentGiphyMediaImages commentGiphyMediaImages;
        CommentGiphyMediaImagesIntf B6d = B6d();
        CommentGiphyMediaImages commentGiphyMediaImages2 = null;
        if (B6d != null) {
            commentGiphyMediaImages = B6d.EsO();
        } else {
            commentGiphyMediaImages = null;
        }
        String A0j = A0j(1329489265);
        CommentGiphyMediaImagesIntf BH0 = BH0();
        if (BH0 != null) {
            commentGiphyMediaImages2 = BH0.EsO();
        }
        return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages2, getOptionalBooleanValueByHashCode(-389942488), A0j, A0Y(), AbstractC37301Gc2.A0m(this));
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final String getUsername() {
        return AbstractC37301Gc2.A0m(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
