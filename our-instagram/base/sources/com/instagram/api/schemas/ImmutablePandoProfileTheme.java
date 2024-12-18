package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C14360o3;
import X.C17T;
import X.C39307HXy;
import X.C43261JAg;
import X.Hs7;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProfileTheme extends C17T implements ProfileTheme {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(68);

    @Override // com.instagram.api.schemas.ProfileTheme
    public final ProfileThemeType C74() {
        return (ProfileThemeType) A0M(549259248, C43261JAg.A00);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hs7.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String AbT() {
        return A0i(-1358800464);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String AbU() {
        return A0i(-65374582);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String Af8() {
        return A0i(1427833566);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final List BAF() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1476702881);
        C14360o3.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String C71() {
        return A0h(1108949841);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final String C8B() {
        return A0i(1825632156);
    }

    @Override // com.instagram.api.schemas.ProfileTheme
    public final ProfileThemeImpl Eyh() {
        String A0i = A0i(-1358800464);
        String A0i2 = A0i(-65374582);
        String A0i3 = A0i(1427833566);
        List BAF = BAF();
        return new ProfileThemeImpl(C74(), A0i, A0i2, A0i3, A0h(1108949841), A0i(1825632156), BAF);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
