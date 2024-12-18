package com.instagram.music.common.model;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.AbstractC65735TtA;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C25123B9t;
import X.C39305HXw;
import X.JDN;
import X.JDO;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.ImmutablePandoAudioFilterInfo;
import com.instagram.api.schemas.ImmutablePandoAudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoMusicOverlayStickerModel extends C17T implements MusicOverlayStickerModelIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(80);
    public User A00;

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final List Ado() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final AudioMutingInfoIntf Adu() {
        return (AudioMutingInfoIntf) A05(-254007346, ImmutablePandoAudioMutingInfo.class);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final List AyW() {
        return A0p(1557415452, JDN.A00);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final User BFU() {
        return this.A00;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicProduct BVj() {
        return (MusicProduct) A0N(-144020267, C25123B9t.A00);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicMuteAudioReason BvC() {
        return (MusicMuteAudioReason) A0N(-880361262, JDO.A00);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC65735TtA.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getId() {
        return A0h(3355);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String Aal() {
        return A0i(-757853179);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean AbG() {
        return getOptionalBooleanValueByHashCode(1120317563);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Adg() {
        return getOptionalIntValueByHashCode(-615307517);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Adh() {
        return getOptionalIntValueByHashCode(-2041015649);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String AiR() {
        return A0i(437646393);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Aql() {
        return getOptionalBooleanValueByHashCode(79699476);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final ImageUrl AsE() {
        return A0A(-22609914);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final ImageUrl AsF() {
        return A09(-45086183);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String AvV() {
        return A0i(-220872642);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Awp() {
        return getOptionalIntValueByHashCode(-747907597);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Azi() {
        return getOptionalIntValueByHashCode(55068821);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean BC4() {
        return getOptionalBooleanValueByHashCode(1988432185);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean BDn() {
        return getOptionalBooleanValueByHashCode(2112323158);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final List BE6() {
        return getOptionalIntListByHashCode(-1755167329);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String BOF() {
        return A0i(36206347);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer BaR() {
        return getOptionalIntValueByHashCode(-1532724339);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Bd5() {
        return getOptionalBooleanValueByHashCode(1164010946);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String Bkl() {
        return A0i(527639047);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String BqC() {
        return A0i(932670004);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Buu() {
        return getOptionalBooleanValueByHashCode(930407036);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean BvQ() {
        return getOptionalBooleanValueByHashCode(2063793707);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Bvn() {
        return getOptionalBooleanValueByHashCode(1925617355);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer CAx() {
        return getOptionalIntValueByHashCode(513375630);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String CHM() {
        return A0i(-310659645);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CQj() {
        return getOptionalBooleanValueByHashCode(1033668234);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CT1() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CTb() {
        return getOptionalBooleanValueByHashCode(-512645821);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CXk() {
        return getOptionalBooleanValueByHashCode(195518061);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CZu() {
        return getOptionalBooleanValueByHashCode(899841238);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Cer() {
        return getOptionalBooleanValueByHashCode(1915067790);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicOverlayStickerModelIntf EBy(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -383946360);
        return this;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicOverlayStickerModel F6j(C1DY c1dy) {
        ArrayList arrayList;
        AudioMutingInfo audioMutingInfo;
        User A0N;
        String A0i = A0i(-757853179);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1120317563);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1545396879);
        String A0i2 = A0i(574519571);
        String A0i3 = A0i(-2061768941);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-615307517);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-2041015649);
        String A0i4 = A0i(1025801609);
        List Ado = Ado();
        User user = null;
        if (Ado != null) {
            arrayList = AbstractC167017dG.A0q(Ado);
            Iterator it = Ado.iterator();
            while (it.hasNext()) {
                arrayList.add(((AudioFilterInfoIntf) it.next()).Er1());
            }
        } else {
            arrayList = null;
        }
        AudioMutingInfoIntf Adu = Adu();
        if (Adu != null) {
            audioMutingInfo = Adu.Er4();
        } else {
            audioMutingInfo = null;
        }
        String A0i5 = A0i(437646393);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(79699476);
        ImageUrl A0A = A0A(-22609914);
        ImageUrl A09 = A09(-45086183);
        String A0i6 = A0i(-220872642);
        String A0i7 = A0i(1128191036);
        String A0j = A0j(1911060995);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-747907597);
        String A0i8 = A0i(1258734948);
        List AyW = AyW();
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(55068821);
        String A0i9 = A0i(682262252);
        String A0i10 = A0i(1181455637);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1988432185);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(2112323158);
        ImmutableList optionalIntListByHashCode = getOptionalIntListByHashCode(-1755167329);
        String A0h = A0h(3355);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -383946360);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        }
        String A0i11 = A0i(1357418199);
        Boolean optionalBooleanValueByHashCode5 = getOptionalBooleanValueByHashCode(1033668234);
        Boolean optionalBooleanValueByHashCode6 = getOptionalBooleanValueByHashCode(1470663792);
        Boolean optionalBooleanValueByHashCode7 = getOptionalBooleanValueByHashCode(-512645821);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(1630845353);
        Boolean optionalBooleanValueByHashCode8 = getOptionalBooleanValueByHashCode(195518061);
        Boolean optionalBooleanValueByHashCode9 = getOptionalBooleanValueByHashCode(899841238);
        Boolean optionalBooleanValueByHashCode10 = getOptionalBooleanValueByHashCode(1915067790);
        String A0i12 = A0i(36206347);
        MusicProduct BVj = BVj();
        String A0i13 = A0i(-1824429564);
        Integer optionalIntValueByHashCode5 = getOptionalIntValueByHashCode(-1532724339);
        Boolean optionalBooleanValueByHashCode11 = getOptionalBooleanValueByHashCode(1164010946);
        String A0h2 = A0h(1873272280);
        String A0i14 = A0i(1436807532);
        String A0i15 = A0i(527639047);
        String A0i16 = A0i(932670004);
        return new MusicOverlayStickerModel(audioMutingInfo, BvC(), BVj, A0A, A09, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, optionalBooleanValueByHashCode5, optionalBooleanValueByHashCode6, optionalBooleanValueByHashCode7, optionalBooleanValueByHashCode8, optionalBooleanValueByHashCode9, optionalBooleanValueByHashCode10, optionalBooleanValueByHashCode11, getOptionalBooleanValueByHashCode(930407036), getOptionalBooleanValueByHashCode(2063793707), getOptionalBooleanValueByHashCode(1925617355), optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, optionalIntValueByHashCode5, getOptionalIntValueByHashCode(513375630), A0i, A0i2, A0i3, A0i4, A0i5, A0i6, A0i7, A0j, A0i8, A0i9, A0i10, A0h, A0i11, A0i12, A0i13, A0h2, A0i14, A0i15, A0i16, A0h(-567396441), A0U(), A0i(114586), A0Y(), A0i(-310659645), arrayList, AyW, optionalIntListByHashCode, booleanValueByHashCode, booleanValueByHashCode2, getBooleanValueByHashCode(1353604156));
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicOverlayStickerModel F6k(C1DV c1dv) {
        return F6j(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final boolean getAllowsSaving() {
        return getBooleanValueByHashCode(1545396879);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getArtistId() {
        return A0i(574519571);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getAudioAssetId() {
        return A0i(-2061768941);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getAudioClusterId() {
        return A0i(1025801609);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getDashManifest() {
        return A0i(1128191036);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getDerivedContentId() {
        return A0j(1911060995);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getDisplayArtist() {
        return A0i(1258734948);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getFastStartProgressiveDownloadUrl() {
        return A0i(682262252);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getIgUsername() {
        return A0i(1357418199);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getOriginalMediaId() {
        return A0i(-1824429564);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getPlaceholderProfilePicUrl() {
        return A0h(1873272280);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getProgressiveDownloadUrl() {
        return A0i(1436807532);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final boolean getShouldMuteAudio() {
        return getBooleanValueByHashCode(1353604156);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getShouldMuteAudioReason() {
        return A0h(-567396441);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getSubtitle() {
        return A0U();
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getTag() {
        return A0i(114586);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
