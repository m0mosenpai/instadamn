package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C16930sl;
import X.C17T;
import X.C39306HXx;
import X.VON;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoGroupMetadata extends C17T implements GroupMetadata {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(80);

    @Override // com.instagram.api.schemas.GroupMetadata
    public final RingSpec BpS() {
        return (RingSpec) A05(301343850, ImmutablePandoRingSpec.class);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final GroupMetadataImpl Etw() {
        RingSpecImpl ringSpecImpl;
        List Aa2 = Aa2();
        List AgL = AgL();
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-126536785);
        String A0j = A0j(-1257300025);
        String A0i = A0i(-367825079);
        String A0k = A0k(1282069655);
        String A0k2 = A0k(506361787);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(1226418291);
        boolean booleanValueByHashCode3 = getBooleanValueByHashCode(1961499686);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1217487446);
        boolean booleanValueByHashCode4 = getBooleanValueByHashCode(113598250);
        boolean booleanValueByHashCode5 = getBooleanValueByHashCode(-707500412);
        boolean booleanValueByHashCode6 = getBooleanValueByHashCode(-508951083);
        boolean booleanValueByHashCode7 = getBooleanValueByHashCode(1873245633);
        boolean booleanValueByHashCode8 = getBooleanValueByHashCode(-256388137);
        boolean booleanValueByHashCode9 = getBooleanValueByHashCode(161196335);
        boolean booleanValueByHashCode10 = getBooleanValueByHashCode(1523810563);
        Long A0L = A0L(1742775550);
        int intValueByHashCode = getIntValueByHashCode(1113576925);
        int intValueByHashCode2 = getIntValueByHashCode(-1339060996);
        int intValueByHashCode3 = getIntValueByHashCode(1422900273);
        int intValueByHashCode4 = getIntValueByHashCode(-540045015);
        int intValueByHashCode5 = getIntValueByHashCode(26429728);
        int intValueByHashCode6 = getIntValueByHashCode(755449499);
        int intValueByHashCode7 = getIntValueByHashCode(28276274);
        int intValueByHashCode8 = getIntValueByHashCode(1705229613);
        List BcA = BcA();
        RingSpec BpS = BpS();
        if (BpS != null) {
            ringSpecImpl = BpS.EzF();
        } else {
            ringSpecImpl = null;
        }
        return new GroupMetadataImpl(ringSpecImpl, optionalBooleanValueByHashCode, A0L, A0j, A0i, A0k, A0k2, Aa2, AgL, BcA, intValueByHashCode, intValueByHashCode2, intValueByHashCode3, intValueByHashCode4, intValueByHashCode5, intValueByHashCode6, intValueByHashCode7, intValueByHashCode8, booleanValueByHashCode, booleanValueByHashCode2, booleanValueByHashCode3, booleanValueByHashCode4, booleanValueByHashCode5, booleanValueByHashCode6, booleanValueByHashCode7, booleanValueByHashCode8, booleanValueByHashCode9, booleanValueByHashCode10);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, VON.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final List Aa2() {
        List A0n = A0n(22186440);
        if (A0n == null) {
            return C16930sl.A00;
        }
        return A0n;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final List AgL() {
        List A0n = A0n(-974090953);
        if (A0n == null) {
            return C16930sl.A00;
        }
        return A0n;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Aka() {
        return getBooleanValueByHashCode(-126536785);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String Amy() {
        return A0j(-1257300025);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String AnK() {
        return A0i(-367825079);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String BAU() {
        return A0k(1282069655);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final String BAf() {
        return A0k(506361787);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean BAh() {
        return getBooleanValueByHashCode(1226418291);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean BCM() {
        return getBooleanValueByHashCode(1961499686);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final Boolean BDc() {
        return getOptionalBooleanValueByHashCode(-1217487446);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final Long BPY() {
        return A0L(1742775550);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXZ() {
        return getIntValueByHashCode(1113576925);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXc() {
        return getIntValueByHashCode(-1339060996);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXp() {
        return getIntValueByHashCode(1422900273);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXq() {
        return getIntValueByHashCode(-540045015);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXr() {
        return getIntValueByHashCode(26429728);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXs() {
        return getIntValueByHashCode(755449499);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXt() {
        return getIntValueByHashCode(28276274);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final int BXu() {
        return getIntValueByHashCode(1705229613);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final List BcA() {
        List A0n = A0n(-764265184);
        if (A0n == null) {
            return C16930sl.A00;
        }
        return A0n;
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean CVQ() {
        return getBooleanValueByHashCode(113598250);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean CVS() {
        return getBooleanValueByHashCode(-707500412);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean CVW() {
        return getBooleanValueByHashCode(-508951083);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cbd() {
        return getBooleanValueByHashCode(1873245633);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cfp() {
        return getBooleanValueByHashCode(-256388137);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cft() {
        return getBooleanValueByHashCode(161196335);
    }

    @Override // com.instagram.api.schemas.GroupMetadata
    public final boolean Cfu() {
        return getBooleanValueByHashCode(1523810563);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
