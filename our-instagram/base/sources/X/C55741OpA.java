package X;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.OpA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55741OpA implements InterfaceC58199Pr5 {
    public MediaPlayer A00;
    public final C54715OEs A01;
    public final C19L A02;
    public final Context A03;
    public final AudioManager A04;
    public final C53738Npq A05;
    public final C55000OUz A06;

    public C55741OpA(Context context, AudioManager audioManager, C53738Npq c53738Npq, C55000OUz c55000OUz, C19L c19l) {
        AbstractC25233BEq.A0x(3, c55000OUz, c19l, c53738Npq);
        this.A03 = context;
        this.A04 = audioManager;
        this.A06 = c55000OUz;
        this.A02 = c19l;
        this.A05 = c53738Npq;
        this.A01 = new C54715OEs(context, audioManager, c55000OUz);
    }

    @Override // X.InterfaceC58199Pr5
    public final void EYb(boolean z) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void EZm(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new C48030LMz(interfaceC16820sZ, 0));
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void EZo(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C55337Oh0(interfaceC16620sF));
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void Emj(C54832OLr c54832OLr) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            return;
        }
        this.A06.A00("MediaPlayer starting", new Object[0]);
        Context context = this.A03;
        if (c54832OLr.A00.toString() == null) {
            try {
                context.getResources().getResourceName(0);
            } catch (Resources.NotFoundException unused) {
            }
        }
        MediaPlayer mediaPlayer2 = this.A00;
        if (mediaPlayer2 == null) {
            return;
        }
        mediaPlayer2.start();
    }

    @Override // X.InterfaceC58199Pr5
    public final void ASm() {
        if (this.A00 != null) {
        } else {
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void COK() {
        if (this.A00 == null) {
            this.A00 = new MediaPlayer();
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void Eeb(C54832OLr c54832OLr, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        int A1Y = AbstractC25229BEm.A1Y(interfaceC16820sZ);
        android.net.Uri uri = c54832OLr.A00;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setDataSource(this.A03, uri);
        }
        MediaPlayer mediaPlayer2 = this.A00;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnPreparedListener(new LNA(interfaceC16820sZ, A1Y));
        }
        try {
            this.A06.A00("Preparing MediaPlayer", new Object[A1Y]);
            MediaPlayer mediaPlayer3 = this.A00;
            if (mediaPlayer3 != null) {
                mediaPlayer3.prepareAsync();
            }
        } catch (IOException e) {
            C0K8.A0L("RingtoneMediaPlayer", "Error finishing media player setup", e, Arrays.copyOf(new Object[A1Y], A1Y));
            interfaceC16820sZ2.invoke();
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void Eez() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setAudioStreamType(0);
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void EhH(float f) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void Eof() {
    }

    @Override // X.InterfaceC58199Pr5
    public final void pause() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.A06.A00("MediaPlayer paused", new Object[0]);
            MediaPlayer mediaPlayer2 = this.A00;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
        }
    }

    @Override // X.InterfaceC58199Pr5
    public final void release() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC58199Pr5
    public final void reset() {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }
}
