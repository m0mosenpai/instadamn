package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC37300Gc1;
import X.AbstractC40113Hqg;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class NotePogVideoDict extends C0T6 implements Parcelable, NotePogVideoDictIntf {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(19);
    public final ImageInfo A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public NotePogVideoDict(ImageInfo imageInfo, String str, String str2, List list) {
        AbstractC167027dH.A0a(1, str, imageInfo, str2, list);
        this.A01 = str;
        this.A00 = imageInfo;
        this.A02 = str2;
        this.A03 = list;
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final NotePogVideoDict ExO() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotePogVideoDict) {
                NotePogVideoDict notePogVideoDict = (NotePogVideoDict) obj;
                if (!C14360o3.A0K(this.A01, notePogVideoDict.A01) || !C14360o3.A0K(this.A00, notePogVideoDict.A00) || !C14360o3.A0K(this.A02, notePogVideoDict.A02) || !C14360o3.A0K(this.A03, notePogVideoDict.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A03);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final ImageInfo BGx() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final List CFe() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTNotePogVideoDict", AbstractC40113Hqg.A00(this));
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final String getId() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.NotePogVideoDictIntf
    public final String getPk() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01))));
    }
}
