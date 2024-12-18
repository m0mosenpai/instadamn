package com.instagram.model.shopping.reels;

import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C41856IgA;
import X.I4B;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ReelMultiProductLink extends C0T6 implements Parcelable, ReelMultiProductLinkIntf {
    public static final Parcelable.Creator CREATOR = new C41856IgA(61);
    public final List A00;

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final ReelMultiProductLink F6Q(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ReelMultiProductLink) && C14360o3.A0K(this.A00, ((ReelMultiProductLink) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final List BhR() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryCTAMultipleProductLinks", I4B.A00(this));
    }

    public ReelMultiProductLink(List list) {
        this.A00 = list;
    }

    @Override // com.instagram.model.shopping.reels.ReelMultiProductLinkIntf
    public final ReelMultiProductLinkIntf EBu(C1DY c1dy) {
        return this;
    }
}
