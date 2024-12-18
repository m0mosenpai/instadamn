package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class CommentGiphyMediaImages extends C0T6 implements Parcelable, CommentGiphyMediaImagesIntf {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(27);
    public final CommentGiphyMediaFixedHeightImages A00;

    @Override // com.instagram.api.schemas.CommentGiphyMediaImagesIntf
    public final CommentGiphyMediaImages EsO() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommentGiphyMediaImages) && C14360o3.A0K(this.A00, ((CommentGiphyMediaImages) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaImagesIntf
    public final CommentGiphyMediaFixedHeightImages B6v() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public CommentGiphyMediaImages(CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages) {
        this.A00 = commentGiphyMediaFixedHeightImages;
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
        return AbstractC37300Gc1.A05("XDTCommentGiphyMediaImages", AbstractC06930Yk.A0B(A0X));
    }
}
