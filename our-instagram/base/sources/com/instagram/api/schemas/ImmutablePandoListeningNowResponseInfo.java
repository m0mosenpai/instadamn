package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC40043HpV;
import X.C14360o3;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import X.JA5;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class ImmutablePandoListeningNowResponseInfo extends C17T implements ListeningNowResponseInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(11);
    public MusicInfo A00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final ListeningNowState BNq() {
        return (ListeningNowState) A0M(134891364, JA5.A00);
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final MusicInfo BVc() {
        MusicInfo musicInfo = this.A00;
        if (musicInfo == null) {
            return (MusicInfo) A05(-780321144, ImmutablePandoMusicInfo.class);
        }
        return musicInfo;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40043HpV.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final Integer BY2() {
        return getOptionalIntValueByHashCode(1956716504);
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final Boolean Cdb() {
        return getOptionalBooleanValueByHashCode(936256575);
    }

    @Override // com.instagram.api.schemas.ListeningNowResponseInfoIntf
    public final ListeningNowResponseInfo Evy(C1DY c1dy) {
        MusicInfoImpl musicInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(936256575);
        ListeningNowState BNq = BNq();
        MusicInfo BVc = BVc();
        if (BVc != null) {
            musicInfoImpl = BVc.Ewy(c1dy);
        } else {
            musicInfoImpl = null;
        }
        return new ListeningNowResponseInfo(BNq, musicInfoImpl, optionalBooleanValueByHashCode, getOptionalIntValueByHashCode(1956716504));
    }
}
