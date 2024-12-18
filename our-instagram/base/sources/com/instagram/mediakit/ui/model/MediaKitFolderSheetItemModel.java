package com.instagram.mediakit.ui.model;

import X.AbstractC25233BEq;
import X.C14360o3;
import X.C55343Oh9;
import X.InterfaceC16660sJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class MediaKitFolderSheetItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(48);
    public final int A00;
    public final Medium A01;
    public final String A02;
    public final InterfaceC16660sJ A03;

    public MediaKitFolderSheetItemModel(Medium medium, String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        AbstractC25233BEq.A0w(2, str, medium, interfaceC16660sJ);
        this.A00 = i;
        this.A02 = str;
        this.A01 = medium;
        this.A03 = interfaceC16660sJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeSerializable((Serializable) this.A03);
    }
}
