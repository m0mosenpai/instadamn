package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC38851rI;
import X.AbstractC40109Hqc;
import X.C14360o3;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C206129Au;
import X.JAN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes3.dex */
public final class ImmutablePandoNoteEmojiReactionInfo extends C17T implements NoteEmojiReactionInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C206129Au(2);
    public User A00;

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteEmojiReactionInfo ExL(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return ExK(new C1DY(c1dv, 6, false));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteReactionType Bkj() {
        return (NoteReactionType) A0N(-1646960752, JAN.A00);
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final User CDj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteEmojiReactionInfoIntf E9S(C1DY c1dy) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC40109Hqc.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final Boolean Cf9() {
        return getOptionalBooleanValueByHashCode(-376203959);
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteEmojiReactionInfo ExK(C1DY c1dy) {
        User user;
        String A0i = A0i(96632902);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-376203959);
        NoteReactionType Bkj = Bkj();
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
                return new NoteEmojiReactionInfo(Bkj, user, optionalBooleanValueByHashCode, A0i);
            }
        }
        user = null;
        return new NoteEmojiReactionInfo(Bkj, user, optionalBooleanValueByHashCode, A0i);
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final String getEmoji() {
        return A0i(96632902);
    }
}
