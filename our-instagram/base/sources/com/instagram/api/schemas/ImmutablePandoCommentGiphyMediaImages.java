package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoCommentGiphyMediaImages extends C17T implements CommentGiphyMediaImagesIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(39);

    @Override // com.instagram.api.schemas.CommentGiphyMediaImagesIntf
    public final CommentGiphyMediaFixedHeightImages B6v() {
        return (CommentGiphyMediaFixedHeightImages) A05(278928466, ImmutablePandoCommentGiphyMediaFixedHeightImages.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaImagesIntf
    public final CommentGiphyMediaImages EsO() {
        CommentGiphyMediaFixedHeightImagesImpl commentGiphyMediaFixedHeightImagesImpl;
        CommentGiphyMediaFixedHeightImages B6v = B6v();
        if (B6v != null) {
            commentGiphyMediaFixedHeightImagesImpl = B6v.EsN();
        } else {
            commentGiphyMediaFixedHeightImagesImpl = null;
        }
        return new CommentGiphyMediaImages(commentGiphyMediaFixedHeightImagesImpl);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaImagesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (B6v() != null) {
            CommentGiphyMediaFixedHeightImages B6v = B6v();
            if (B6v != null) {
                treeUpdaterJNI = B6v.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("fixed_height", treeUpdaterJNI);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
