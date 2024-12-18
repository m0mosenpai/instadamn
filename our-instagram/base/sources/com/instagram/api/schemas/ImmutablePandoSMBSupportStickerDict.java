package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37304Gc5;
import X.AbstractC40222Hsl;
import X.C17T;
import X.C39307HXy;
import X.C43270JAp;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoSMBSupportStickerDict extends C17T implements SMBSupportStickerDictIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(74);

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final BusinessProfileDict Air() {
        return (BusinessProfileDict) A05(-1813565398, ImmutablePandoBusinessProfileDict.class);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final SMBPartnerType Btk() {
        return (SMBPartnerType) A0N(360082052, C43270JAp.A00);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final SMBSupportStickerDict EzH() {
        BusinessProfileDictImpl businessProfileDictImpl;
        BusinessProfileDict Air = Air();
        if (Air != null) {
            businessProfileDictImpl = Air.ErS();
        } else {
            businessProfileDictImpl = null;
        }
        String A0g = AbstractC37304Gc5.A0g(this);
        String A0i = A0i(-2071290626);
        String A0i2 = A0i(476855145);
        String A0i3 = A0i(1082060480);
        String A0i4 = A0i(432371099);
        String A0i5 = A0i(-209971210);
        return new SMBSupportStickerDict(businessProfileDictImpl, Btk(), A0K(752358592), A0g, A0i, A0i2, A0i3, A0i4, A0i5, A0i(161747874), AbstractC37301Gc2.A0k(this), A0i(-132220081), A0i(-1663079300), A0Y(), A0i(844796604));
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40222Hsl.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Aj7() {
        return AbstractC37304Gc5.A0g(this);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Aj8() {
        return A0i(-2071290626);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Att() {
        return A0i(1082060480);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String AyB() {
        return A0i(432371099);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final Float BZz() {
        return A0K(752358592);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String Bba() {
        return A0i(161747874);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String C3f() {
        return A0i(-1663079300);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String C8x() {
        return A0i(844796604);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getCtaTitle() {
        return A0i(476855145);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getPk() {
        return AbstractC37301Gc2.A0k(this);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    @Override // com.instagram.api.schemas.SMBSupportStickerDictIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
