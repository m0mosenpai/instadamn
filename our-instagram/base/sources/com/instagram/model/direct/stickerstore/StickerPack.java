package com.instagram.model.direct.stickerstore;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class StickerPack extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(73);
    public final String A00;
    public final List A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StickerPack) {
                StickerPack stickerPack = (StickerPack) obj;
                if (!C14360o3.A0K(this.A04, stickerPack.A04) || !C14360o3.A0K(this.A00, stickerPack.A00) || !C14360o3.A0K(this.A02, stickerPack.A02) || !C14360o3.A0K(this.A03, stickerPack.A03) || !C14360o3.A0K(this.A01, stickerPack.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            ((DirectStoreSticker) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (((AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A04)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31);
    }

    public StickerPack(String str, String str2, String str3, String str4, List list) {
        AbstractC167017dG.A1P(str, str2);
        this.A04 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A01 = list;
    }
}
