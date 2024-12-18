package X;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* loaded from: classes8.dex */
public final class LND implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoView A00;
    public final /* synthetic */ C4F5 A01;
    public final /* synthetic */ C106144qU A02;
    public final /* synthetic */ C4FE A03;

    public LND(VideoView videoView, C4F5 c4f5, C106144qU c106144qU, C4FE c4fe) {
        this.A02 = c106144qU;
        this.A01 = c4f5;
        this.A03 = c4fe;
        this.A00 = videoView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C14360o3.A0B(mediaPlayer, 0);
        C106144qU c106144qU = this.A02;
        if (C106144qU.A06(this.A01, c106144qU)) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
        C4FE c4fe = this.A03;
        if (!C4AC.A0F(c4fe.A02)) {
            mediaPlayer.setLooping(true);
            this.A00.start();
            NoteAvatarView noteAvatarView = c106144qU.A08;
            noteAvatarView.A0C.setVisibility(4);
            noteAvatarView.A06.setVisibility(0);
            return;
        }
        C4F5 c4f5 = c106144qU.A00;
        if (c4f5 != null && c4f5.A0X) {
            VideoView videoView = this.A00;
            videoView.start();
            NoteAvatarView noteAvatarView2 = c106144qU.A08;
            noteAvatarView2.A0C.setVisibility(4);
            noteAvatarView2.A06.setVisibility(0);
            mediaPlayer.setOnCompletionListener(new LN1(1, videoView, c4fe));
            return;
        }
        NoteAvatarView noteAvatarView3 = c106144qU.A08;
        noteAvatarView3.A0C.setVisibility(0);
        noteAvatarView3.A06.setVisibility(4);
    }
}
