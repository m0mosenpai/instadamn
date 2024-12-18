package X;

import android.media.MediaPlayer;

/* renamed from: X.Oh0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55337Oh0 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ InterfaceC16620sF A00;

    public C55337Oh0(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return AbstractC166987dD.A1a(this.A00.invoke(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
