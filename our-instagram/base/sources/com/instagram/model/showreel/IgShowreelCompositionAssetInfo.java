package com.instagram.model.showreel;

import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import X.I4O;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class IgShowreelCompositionAssetInfo extends C0T6 implements Parcelable, IgShowreelCompositionAssetInfoIntf {
    public static final Parcelable.Creator CREATOR = new C9Ay(37);
    public final IgShowreelCompositionAssetType A00;
    public final String A01;

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final IgShowreelCompositionAssetInfo F6X() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelCompositionAssetInfo) {
                IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo = (IgShowreelCompositionAssetInfo) obj;
                if (this.A00 != igShowreelCompositionAssetInfo.A00 || !C14360o3.A0K(this.A01, igShowreelCompositionAssetInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = this.A00;
        int hashCode = (igShowreelCompositionAssetType == null ? 0 : igShowreelCompositionAssetType.hashCode()) * 31;
        String str = this.A01;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = this.A00;
        if (igShowreelCompositionAssetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igShowreelCompositionAssetType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final IgShowreelCompositionAssetType CBh() {
        return this.A00;
    }

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShowReelBloksAssetInfo", I4O.A00(this));
    }

    @Override // com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf
    public final String getUrl() {
        return this.A01;
    }

    public IgShowreelCompositionAssetInfo(IgShowreelCompositionAssetType igShowreelCompositionAssetType, String str) {
        this.A00 = igShowreelCompositionAssetType;
        this.A01 = str;
    }
}
