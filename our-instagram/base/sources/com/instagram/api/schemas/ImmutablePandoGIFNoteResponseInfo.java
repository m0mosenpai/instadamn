package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC136426Fv;
import X.AbstractC58317Pt9;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class ImmutablePandoGIFNoteResponseInfo extends C17T implements GIFNoteResponseInfo {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(72);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.GIFNoteResponseInfo
    public final CommentGiphyMediaInfoIntf B9m() {
        return (CommentGiphyMediaInfoIntf) A05(830589001, ImmutablePandoCommentGiphyMediaInfo.class);
    }

    @Override // com.instagram.api.schemas.GIFNoteResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (B9m() != null) {
            CommentGiphyMediaInfoIntf B9m = B9m();
            if (B9m != null) {
                treeUpdaterJNI = B9m.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AbstractC58317Pt9.A00(281), treeUpdaterJNI);
        }
        return new TreeUpdaterJNI(AbstractC06930Yk.A0B(linkedHashMap), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GIFNoteResponseInfo
    public final GIFNoteResponseInfoImpl Etk() {
        CommentGiphyMediaInfo commentGiphyMediaInfo;
        CommentGiphyMediaInfoIntf B9m = B9m();
        if (B9m != null) {
            commentGiphyMediaInfo = B9m.EsP();
        } else {
            commentGiphyMediaInfo = null;
        }
        return new GIFNoteResponseInfoImpl(commentGiphyMediaInfo);
    }
}
