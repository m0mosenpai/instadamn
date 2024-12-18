package com.instagram.music.common.model;

import X.AbstractC06950Ym;
import X.AbstractC136426Fv;
import X.AbstractC38851rI;
import X.AbstractC65736TtB;
import X.C14360o3;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C206129Au;
import X.C68M;
import X.C68N;
import X.C69486Vo9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.ImmutablePandoAudioFilterInfo;
import com.instagram.api.schemas.ImmutablePandoAudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ImmutablePandoMusicConsumptionModel extends C17T implements MusicConsumptionModel {
    public static final AbstractC136426Fv CREATOR = new C206129Au(4);
    public User A00;

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicConsumptionModelImpl F6i(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return F6h(new C1DY(c1dv, 6, false));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final /* synthetic */ C69486Vo9 AKo() {
        return new C69486Vo9(this);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final List Ado() {
        return A08(1437867975, ImmutablePandoAudioFilterInfo.class);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final AudioMutingInfoIntf Adu() {
        return (AudioMutingInfoIntf) A05(-254007346, ImmutablePandoAudioMutingInfo.class);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final List AyW() {
        return A0p(1557415452, C68M.A00);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final User BFU() {
        return this.A00;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicMuteAudioReason BvC() {
        return (MusicMuteAudioReason) A0N(-880361262, C68N.A00);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicConsumptionModel EBx(C1DY c1dy) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-383946360, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC65736TtB.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean AbG() {
        return getOptionalBooleanValueByHashCode(1120317563);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer Adg() {
        return getOptionalIntValueByHashCode(-615307517);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean Aql() {
        return getOptionalBooleanValueByHashCode(79699476);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer BaR() {
        return getOptionalIntValueByHashCode(-1532724339);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer Bg7() {
        return getOptionalIntValueByHashCode(-267229226);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean Buu() {
        return getOptionalBooleanValueByHashCode(930407036);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean BvQ() {
        return getOptionalBooleanValueByHashCode(2063793707);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer CAx() {
        return getOptionalIntValueByHashCode(513375630);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean CQj() {
        return getOptionalBooleanValueByHashCode(1033668234);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean Cer() {
        return getOptionalBooleanValueByHashCode(1915067790);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicConsumptionModelImpl F6h(C1DY c1dy) {
        ArrayList arrayList;
        AudioMutingInfo audioMutingInfo;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1120317563);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-615307517);
        List Ado = Ado();
        User user = null;
        if (Ado != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(Ado, 10));
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
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(79699476);
        String A0j = A0j(1911060995);
        List AyW = AyW();
        String A0i = A0i(1181455637);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-383946360, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
            }
        }
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1033668234);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(1915067790);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1532724339);
        String A0h = A0h(1873272280);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-267229226);
        return new MusicConsumptionModelImpl(audioMutingInfo, BvC(), user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, getOptionalBooleanValueByHashCode(930407036), getOptionalBooleanValueByHashCode(2063793707), optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, getOptionalIntValueByHashCode(513375630), A0j, A0i, A0h, A0h(-567396441), arrayList, AyW, getBooleanValueByHashCode(1353604156));
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getDerivedContentId() {
        return A0j(1911060995);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getPlaceholderProfilePicUrl() {
        return A0h(1873272280);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final boolean getShouldMuteAudio() {
        return getBooleanValueByHashCode(1353604156);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getShouldMuteAudioReason() {
        return A0h(-567396441);
    }
}
