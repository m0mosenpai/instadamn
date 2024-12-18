package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class MiniShopColorCustomization extends C0T6 implements Parcelable, MiniShopColorCustomizationIntf {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(99);
    public final MiniShopColorPaletteCustomization A00;
    public final MiniShopColorPaletteCustomization A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MiniShopColorCustomization) {
                MiniShopColorCustomization miniShopColorCustomization = (MiniShopColorCustomization) obj;
                if (!C14360o3.A0K(this.A00, miniShopColorCustomization.A00) || !C14360o3.A0K(this.A01, miniShopColorCustomization.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public MiniShopColorCustomization(MiniShopColorPaletteCustomization miniShopColorPaletteCustomization, MiniShopColorPaletteCustomization miniShopColorPaletteCustomization2) {
        AbstractC167017dG.A1P(miniShopColorPaletteCustomization, miniShopColorPaletteCustomization2);
        this.A00 = miniShopColorPaletteCustomization;
        this.A01 = miniShopColorPaletteCustomization2;
    }
}
