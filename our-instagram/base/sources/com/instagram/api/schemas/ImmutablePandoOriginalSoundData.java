package com.instagram.api.schemas;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC37371GdD;
import X.AbstractC38851rI;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C37983GnS;
import X.C39307HXy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoOriginalSoundData extends C17T implements OriginalSoundDataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(35);
    public User A00;
    public List A01;
    public List A02;

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final List Ado() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final List Adv() {
        List list = this.A01;
        if (list == null) {
            return A0o(781672759, ImmutablePandoOriginalAudioPartMetadata.class);
        }
        return list;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final List Adw() {
        List list = this.A02;
        if (list == null) {
            return A08(-1693515944, ImmutablePandoOriginalAudioPartMetadata.class);
        }
        return list;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundConsumptionInfoIntf AqX() {
        return (OriginalSoundConsumptionInfoIntf) A04(-1464257838, ImmutablePandoOriginalSoundConsumptionInfo.class);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final User BFU() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'igArtist' field.");
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalAudioSubtype BZj() {
        return (OriginalAudioSubtype) A0M(-768306141, C37983GnS.A00);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final XpostOriginalSoundFBCreatorInfo CIV() {
        return (XpostOriginalSoundFBCreatorInfo) A05(1647938141, ImmutablePandoXpostOriginalSoundFBCreatorInfo.class);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37371GdD.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer Adg() {
        return getOptionalIntValueByHashCode(-615307517);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean Akf() {
        return getOptionalBooleanValueByHashCode(-118927619);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean Akg() {
        return getOptionalBooleanValueByHashCode(645283325);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer Azi() {
        return getOptionalIntValueByHashCode(55068821);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean BYR() {
        return getOptionalBooleanValueByHashCode(724501341);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer BaR() {
        return getOptionalIntValueByHashCode(-1532724339);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer Bg7() {
        return getOptionalIntValueByHashCode(-267229226);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer C8O() {
        return getOptionalIntValueByHashCode(-630236298);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer CAx() {
        return getOptionalIntValueByHashCode(513375630);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CT1() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CTb() {
        return getOptionalBooleanValueByHashCode(-512645821);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CZr() {
        return getOptionalBooleanValueByHashCode(-1683806324);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean Cc7() {
        return getOptionalBooleanValueByHashCode(1317433244);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CgF() {
        return getOptionalBooleanValueByHashCode(-1021150475);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundDataIntf E9V(C1DY c1dy) {
        ArrayList arrayList;
        List<OriginalAudioPartMetadataIntf> Adv = Adv();
        ArrayList A0i = AbstractC167007dF.A0i(Adv);
        for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf : Adv) {
            originalAudioPartMetadataIntf.E9U(c1dy);
            A0i.add(originalAudioPartMetadataIntf);
        }
        this.A01 = A0i;
        List<OriginalAudioPartMetadataIntf> Adw = Adw();
        if (Adw != null) {
            arrayList = AbstractC167007dF.A0i(Adw);
            for (OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 : Adw) {
                originalAudioPartMetadataIntf2.E9U(c1dy);
                arrayList.add(originalAudioPartMetadataIntf2);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, -383946360);
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundData Exi(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-664939079);
        String A0k = A0k(-2061768941);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-615307517);
        List Ado = Ado();
        XpostOriginalSoundFBCreatorInfoImpl xpostOriginalSoundFBCreatorInfoImpl = null;
        if (Ado != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(Ado, 10));
            Iterator it = Ado.iterator();
            while (it.hasNext()) {
                arrayList.add(((AudioFilterInfoIntf) it.next()).Er1());
            }
        } else {
            arrayList = null;
        }
        List Adv = Adv();
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(Adv, 10));
        Iterator it2 = Adv.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((OriginalAudioPartMetadataIntf) it2.next()).Exg(c1dy));
        }
        List Adw = Adw();
        if (Adw != null) {
            arrayList2 = new ArrayList(AbstractC06950Ym.A1E(Adw, 10));
            Iterator it3 = Adw.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((OriginalAudioPartMetadataIntf) it3.next()).Exg(c1dy));
            }
        } else {
            arrayList2 = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-118927619);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(645283325);
        OriginalSoundConsumptionInfo Exh = AqX().Exh();
        String A0h = A0h(1128191036);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(55068821);
        String A0i = A0i(1181455637);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(2112323158);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A04(-383946360, ImmutablePandoUserDict.class);
        Parcelable.Creator creator = User.CREATOR;
        User user = (User) c1dy.A00(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
        boolean booleanValueByHashCode3 = getBooleanValueByHashCode(-782500510);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1470663792);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(-512645821);
        boolean booleanValueByHashCode4 = getBooleanValueByHashCode(1630845353);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(-1683806324);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(1317433244);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(-1021150475);
        String A0j = A0j(1139251232);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(724501341);
        OriginalAudioSubtype BZj = BZj();
        String A0h2 = A0h(2019893057);
        String A0k2 = A0k(-1824429564);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-1532724339);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(-267229226);
        String A0h3 = A0h(1436807532);
        boolean booleanValueByHashCode5 = getBooleanValueByHashCode(1353604156);
        Integer optionalIntValueByHashCode5 = getOptionalIntValueByHashCode(-630236298);
        Integer optionalIntValueByHashCode6 = getOptionalIntValueByHashCode(513375630);
        XpostOriginalSoundFBCreatorInfo CIV = CIV();
        if (CIV != null) {
            xpostOriginalSoundFBCreatorInfoImpl = CIV.F46();
        }
        return new OriginalSoundData(BZj, Exh, xpostOriginalSoundFBCreatorInfoImpl, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, optionalIntValueByHashCode5, optionalIntValueByHashCode6, A0k, A0h, A0i, A0j, A0h2, A0k2, A0h3, arrayList, arrayList3, arrayList2, booleanValueByHashCode, booleanValueByHashCode2, booleanValueByHashCode3, booleanValueByHashCode4, booleanValueByHashCode5);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundData Exj(C1DV c1dv) {
        return Exi(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean getAllowCreatorToRename() {
        return getBooleanValueByHashCode(-664939079);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getAudioAssetId() {
        return A0k(-2061768941);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getDashManifest() {
        return A0h(1128191036);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean getHideRemixing() {
        return getBooleanValueByHashCode(2112323158);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getMusicCanonicalId() {
        return A0j(1139251232);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getOriginalAudioTitle() {
        return A0h(2019893057);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getOriginalMediaId() {
        return A0k(-1824429564);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getProgressiveDownloadUrl() {
        return A0h(1436807532);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean getShouldMuteAudio() {
        return getBooleanValueByHashCode(1353604156);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean isAudioAutomaticallyAttributed() {
        return getBooleanValueByHashCode(-782500510);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
