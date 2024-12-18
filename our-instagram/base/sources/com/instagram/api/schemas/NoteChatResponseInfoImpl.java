package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.AbstractC40107Hqa;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class NoteChatResponseInfoImpl extends C0T6 implements Parcelable, NoteChatResponseInfo {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(15);
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public NoteChatResponseInfoImpl(Integer num, String str, List list, int i, boolean z) {
        AbstractC167007dF.A1G(str, 1, list);
        this.A02 = str;
        this.A04 = z;
        this.A01 = num;
        this.A00 = i;
        this.A03 = list;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final NoteChatResponseInfoImpl ExH(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final NoteChatResponseInfoImpl ExI(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteChatResponseInfoImpl) {
                NoteChatResponseInfoImpl noteChatResponseInfoImpl = (NoteChatResponseInfoImpl) obj;
                if (!C14360o3.A0K(this.A02, noteChatResponseInfoImpl.A02) || this.A04 != noteChatResponseInfoImpl.A04 || !C14360o3.A0K(this.A01, noteChatResponseInfoImpl.A01) || this.A00 != noteChatResponseInfoImpl.A00 || !C14360o3.A0K(this.A03, noteChatResponseInfoImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A01));
        parcel.writeInt(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A03);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final String BAT() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final Integer BLo() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final int BXk() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final List ByV() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final boolean CYL() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.NoteChatResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTNoteChatResponseInfo", AbstractC40107Hqa.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31);
    }
}
