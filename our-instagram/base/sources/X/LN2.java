package X;

import android.media.MediaPlayer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LN2 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ C4F5 A00;
    public final /* synthetic */ C106144qU A01;

    public LN2(C4F5 c4f5, C106144qU c106144qU) {
        this.A01 = c106144qU;
        this.A00 = c4f5;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C0w9.A03("CFHubPogItemDefinition:bindVideoInNote", AbstractC166997dE.A0z("Media player error what: %d, extra: %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)));
        C106144qU c106144qU = this.A01;
        C106144qU.A04(c106144qU);
        C106144qU.A02(this.A00, c106144qU);
        return true;
    }
}
