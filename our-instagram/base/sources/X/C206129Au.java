package X;

import com.instagram.api.schemas.ImmutablePandoMusicInfo;
import com.instagram.api.schemas.ImmutablePandoMusicNoteResponseInfo;
import com.instagram.api.schemas.ImmutablePandoNoteEmojiReactionInfo;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.music.common.model.ImmutablePandoMusicConsumptionModel;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;

/* renamed from: X.9Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206129Au extends AbstractC136426Fv {
    public final int A00;

    public C206129Au(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ImmutablePandoMusicInfo[i];
            case 1:
                return new ImmutablePandoMusicNoteResponseInfo[i];
            case 2:
                return new ImmutablePandoNoteEmojiReactionInfo[i];
            case 3:
                return new ImmutablePandoTrackData[i];
            case 4:
                return new ImmutablePandoMusicConsumptionModel[i];
            default:
                return new ImmutablePandoFriendshipStatus[i];
        }
    }
}
