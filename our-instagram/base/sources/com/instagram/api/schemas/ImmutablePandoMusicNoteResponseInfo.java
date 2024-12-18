package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC38851rI;
import X.AbstractC40098HqQ;
import X.C14360o3;
import X.C17T;
import X.C1DY;
import X.C206129Au;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes3.dex */
public final class ImmutablePandoMusicNoteResponseInfo extends C17T implements MusicNoteResponseInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C206129Au(1);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final User BZk() {
        return null;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40098HqQ.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final MusicInfo BVc() {
        return (MusicInfo) A04(-780321144, ImmutablePandoMusicInfo.class);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final Integer BY2() {
        return getOptionalIntValueByHashCode(1956716504);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final String Bsf() {
        return A0i(-608838120);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final Boolean Cby() {
        return getOptionalBooleanValueByHashCode(2120043935);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final Boolean Cdb() {
        return getOptionalBooleanValueByHashCode(936256575);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final MusicNoteResponseInfo Ex2(C1DY c1dy) {
        User user;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(2120043935);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(936256575);
        MusicInfoImpl Ewy = BVc().Ewy(c1dy);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1956716504);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-821815367, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
                return new MusicNoteResponseInfo(Ewy, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, A0i(-608838120));
            }
        }
        user = null;
        return new MusicNoteResponseInfo(Ewy, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, A0i(-608838120));
    }
}
