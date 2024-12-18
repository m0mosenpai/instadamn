package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40455Hwk;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoWordOffset extends C17T implements WordOffset {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(24);

    @Override // com.instagram.api.schemas.WordOffset
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40455Hwk.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int B1x() {
        return getIntValueByHashCode(-1010839954);
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int Bzc() {
        return getIntValueByHashCode(-1532887371);
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int Bzf() {
        return getIntValueByHashCode(752192821);
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final boolean CAT() {
        return getBooleanValueByHashCode(-32837853);
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final WordOffsetImpl F3z() {
        return new WordOffsetImpl(getIntValueByHashCode(1942471790), getIntValueByHashCode(-1010839954), getIntValueByHashCode(-1532887371), getIntValueByHashCode(752192821), getBooleanValueByHashCode(-32837853));
    }

    @Override // com.instagram.api.schemas.WordOffset
    public final int getEndIndex() {
        return getIntValueByHashCode(1942471790);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
