package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40219Hsi;
import X.C14360o3;
import X.C16930sl;
import X.C17T;
import X.C39307HXy;
import X.C57249PbX;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoRingSpec extends C17T implements RingSpec {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(72);

    @Override // com.instagram.api.schemas.RingSpec
    public final RingSpecPoint B1y() {
        return (RingSpecPoint) A04(1948971308, ImmutablePandoRingSpecPoint.class);
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final RingSpecPoint Bzg() {
        return (RingSpecPoint) A04(-1526387853, ImmutablePandoRingSpecPoint.class);
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40219Hsi.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final List ApQ() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1354842768);
        C14360o3.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final List BOR() {
        List list = (List) C17T.A00(this, new C57249PbX(-1197189282, 34, this), -1197189282);
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final RingSpecImpl EzF() {
        List ApQ = ApQ();
        RingSpecPointImpl EzG = B1y().EzG();
        List BOR = BOR();
        return new RingSpecImpl(EzG, Bzg().EzG(), A0Q(), ApQ, BOR);
    }

    @Override // com.instagram.api.schemas.RingSpec
    public final String getName() {
        return A0Q();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
