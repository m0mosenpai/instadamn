package X;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes12.dex */
public final class Y85 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler A00;
    public final /* synthetic */ Y3V A01;

    public Y85(Handler handler, Y3V y3v) {
        this.A01 = y3v;
        this.A00 = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.A00.post(new Runnable() { // from class: X.YH0
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                Y85 y85 = Y85.this;
                int i3 = i;
                Y3V y3v = y85.A01;
                if (i3 != -3) {
                    if (i3 != -2) {
                        i2 = 1;
                        if (i3 != -1) {
                            if (i3 != 1) {
                                AbstractC63374Sil.A04(MSV.A00(315), AnonymousClass001.A0O(AbstractC58317Pt9.A00(640), i3));
                                return;
                            } else {
                                Y3V.A01(y3v, 2);
                                Y3V.A00(y3v, 1);
                                return;
                            }
                        }
                        Y3V.A00(y3v, -1);
                    } else {
                        Y3V.A00(y3v, 0);
                        i2 = 3;
                    }
                } else {
                    i2 = 4;
                }
                Y3V.A01(y3v, i2);
            }
        });
    }
}
