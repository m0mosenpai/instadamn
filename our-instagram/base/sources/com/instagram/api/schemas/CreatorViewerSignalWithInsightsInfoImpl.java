package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC39887Hma;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalWithInsightsInfoImpl extends C0T6 implements Parcelable, CreatorViewerSignalWithInsightsInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(56);
    public final CreatorViewerSignalInfo A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public CreatorViewerSignalWithInsightsInfoImpl(CreatorViewerSignalInfo creatorViewerSignalInfo, String str, String str2, List list) {
        C14360o3.A0B(creatorViewerSignalInfo, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = creatorViewerSignalInfo;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final CreatorViewerSignalWithInsightsInfoImpl Et0() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalWithInsightsInfoImpl) {
                CreatorViewerSignalWithInsightsInfoImpl creatorViewerSignalWithInsightsInfoImpl = (CreatorViewerSignalWithInsightsInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, creatorViewerSignalWithInsightsInfoImpl.A01) || !C14360o3.A0K(this.A02, creatorViewerSignalWithInsightsInfoImpl.A02) || !C14360o3.A0K(this.A03, creatorViewerSignalWithInsightsInfoImpl.A03) || !C14360o3.A0K(this.A00, creatorViewerSignalWithInsightsInfoImpl.A00)) {
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
        parcel.writeString(this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final String BEi() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final String BGW() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final List BIJ() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final CreatorViewerSignalInfo BxE() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalWithInsightsInfo", AbstractC39887Hma.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }
}
