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
public final class GIFNoteResponseInfoImpl extends C0T6 implements Parcelable, GIFNoteResponseInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(89);
    public final CommentGiphyMediaInfo A00;

    @Override // com.instagram.api.schemas.GIFNoteResponseInfo
    public final GIFNoteResponseInfoImpl Etk() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GIFNoteResponseInfoImpl) && C14360o3.A0K(this.A00, ((GIFNoteResponseInfoImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.GIFNoteResponseInfo
    public final /* bridge */ /* synthetic */ CommentGiphyMediaInfoIntf B9m() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public GIFNoteResponseInfoImpl(CommentGiphyMediaInfo commentGiphyMediaInfo) {
        this.A00 = commentGiphyMediaInfo;
    }

    @Override // com.instagram.api.schemas.GIFNoteResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (B9m() != null) {
            CommentGiphyMediaInfoIntf B9m = B9m();
            if (B9m != null) {
                treeUpdaterJNI = B9m.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("gif_info", treeUpdaterJNI);
        }
        return AbstractC37300Gc1.A05("XDTGIFNoteResponseInfo", AbstractC06930Yk.A0B(A0X));
    }
}
