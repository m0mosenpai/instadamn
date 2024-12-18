package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC39971Ho3;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGAdScreenshotURLDataDictImpl extends C0T6 implements Parcelable, IGAdScreenshotURLDataDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(19);
    public final IGProjectPortalInfoDict A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final IGAdScreenshotURLDataDictImpl EuL() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdScreenshotURLDataDictImpl) {
                IGAdScreenshotURLDataDictImpl iGAdScreenshotURLDataDictImpl = (IGAdScreenshotURLDataDictImpl) obj;
                if (!C14360o3.A0K(this.A03, iGAdScreenshotURLDataDictImpl.A03) || !C14360o3.A0K(this.A01, iGAdScreenshotURLDataDictImpl.A01) || !C14360o3.A0K(this.A00, iGAdScreenshotURLDataDictImpl.A00) || !C14360o3.A0K(this.A04, iGAdScreenshotURLDataDictImpl.A04) || !C14360o3.A0K(this.A02, iGAdScreenshotURLDataDictImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final Integer BDS() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final IGProjectPortalInfoDict BQS() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final Integer CHg() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGAdScreenshotURLDataDict", AbstractC39971Ho3.A00(this));
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final String getDominantColor() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final String getUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public IGAdScreenshotURLDataDictImpl(IGProjectPortalInfoDict iGProjectPortalInfoDict, Integer num, Integer num2, String str, String str2) {
        this.A03 = str;
        this.A01 = num;
        this.A00 = iGProjectPortalInfoDict;
        this.A04 = str2;
        this.A02 = num2;
    }
}
