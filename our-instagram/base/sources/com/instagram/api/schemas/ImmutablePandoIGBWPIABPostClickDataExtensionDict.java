package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39973Ho8;
import X.C17T;
import X.C39306HXx;
import X.C43242J9n;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGBWPIABPostClickDataExtensionDict extends C17T implements IGBWPIABPostClickDataExtensionDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(95);

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final IGBWPExperienceTypes AjK() {
        return (IGBWPExperienceTypes) A0N(-1717005289, C43242J9n.A00);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39973Ho8.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final Integer AXu() {
        return getOptionalIntValueByHashCode(-345502239);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final Integer AXv() {
        return getOptionalIntValueByHashCode(-1553100105);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String AcA() {
        return A0i(-1411301915);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String Afl() {
        return A0i(608983734);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String Anw() {
        return A0i(908408358);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String Bb3() {
        return A0i(859271610);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final IGBWPIABPostClickDataExtensionDictImpl EuT() {
        String A0i = A0i(-1042689291);
        return new IGBWPIABPostClickDataExtensionDictImpl(AjK(), getOptionalIntValueByHashCode(-345502239), getOptionalIntValueByHashCode(-1553100105), A0i, A0i(-1411301915), A0i(608983734), A0i(908408358), A0i(859271610));
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String getAccessToken() {
        return A0i(-1042689291);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
