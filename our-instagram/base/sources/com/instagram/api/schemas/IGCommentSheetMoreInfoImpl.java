package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class IGCommentSheetMoreInfoImpl extends C0T6 implements Parcelable, IGCommentSheetMoreInfo {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(30);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final IGCommentSheetMoreInfoImpl Euc() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGCommentSheetMoreInfoImpl) {
                IGCommentSheetMoreInfoImpl iGCommentSheetMoreInfoImpl = (IGCommentSheetMoreInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, iGCommentSheetMoreInfoImpl.A00) || !C14360o3.A0K(this.A01, iGCommentSheetMoreInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final String C6l() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getText() != null) {
            AbstractC37300Gc1.A15(getText(), A1I);
        }
        if (C6l() != null) {
            A1I.put("text_source", C6l());
        }
        return AbstractC37300Gc1.A05("XDTIGCommentSheetMoreInfo", AbstractC06930Yk.A0B(A1I));
    }

    @Override // com.instagram.api.schemas.IGCommentSheetMoreInfo
    public final String getText() {
        return this.A00;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public IGCommentSheetMoreInfoImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
