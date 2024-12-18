package com.instagram.api.schemas;

import X.AbstractC39843Hlr;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class CommentGiphyMediaInfo extends C0T6 implements CommentGiphyMediaInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(74);
    public final CommentGiphyMediaImages A00;
    public final CommentGiphyMediaImages A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final CommentGiphyMediaInfo EsP() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentGiphyMediaInfo) {
                CommentGiphyMediaInfo commentGiphyMediaInfo = (CommentGiphyMediaInfo) obj;
                if (!C14360o3.A0K(this.A00, commentGiphyMediaInfo.A00) || !C14360o3.A0K(this.A03, commentGiphyMediaInfo.A03) || !C14360o3.A0K(this.A01, commentGiphyMediaInfo.A01) || !C14360o3.A0K(this.A02, commentGiphyMediaInfo.A02) || !C14360o3.A0K(this.A04, commentGiphyMediaInfo.A04) || !C14360o3.A0K(this.A05, commentGiphyMediaInfo.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CommentGiphyMediaImages commentGiphyMediaImages = this.A00;
        int hashCode = (commentGiphyMediaImages == null ? 0 : commentGiphyMediaImages.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommentGiphyMediaImages commentGiphyMediaImages2 = this.A01;
        int hashCode3 = (hashCode2 + (commentGiphyMediaImages2 == null ? 0 : commentGiphyMediaImages2.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        Boolean bool = this.A02;
        if (bool == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final /* bridge */ /* synthetic */ CommentGiphyMediaImagesIntf B6d() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final String B9n() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final /* bridge */ /* synthetic */ CommentGiphyMediaImagesIntf BH0() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final Boolean Cdg() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommentGiphyMediaInfo", AbstractC39843Hlr.A00(this));
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final String getTitle() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.CommentGiphyMediaInfoIntf
    public final String getUsername() {
        return this.A05;
    }

    public CommentGiphyMediaInfo(CommentGiphyMediaImages commentGiphyMediaImages, CommentGiphyMediaImages commentGiphyMediaImages2, Boolean bool, String str, String str2, String str3) {
        this.A00 = commentGiphyMediaImages;
        this.A03 = str;
        this.A01 = commentGiphyMediaImages2;
        this.A02 = bool;
        this.A04 = str2;
        this.A05 = str3;
    }
}
