package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.SkX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63454SkX implements AudioManager.OnAudioFocusChangeListener {
    public final Handler A00;
    public final /* synthetic */ T4C A01;

    public C63454SkX(Handler handler, T4C t4c) {
        this.A01 = t4c;
        this.A00 = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.A00.post(new Runnable() { // from class: X.TOU
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                C63454SkX c63454SkX = C63454SkX.this;
                int i3 = i;
                T4C t4c = c63454SkX.A01;
                if (i3 != -3) {
                    if (i3 != -2) {
                        if (i3 != -1) {
                            if (i3 != 1) {
                                AbstractC46512Bo.A04(MSV.A00(315), AnonymousClass001.A0O("Unknown focus change type: ", i3));
                                return;
                            } else {
                                T4C.A01(t4c, 1);
                                T4C.A00(t4c, 1);
                                return;
                            }
                        }
                        T4C.A00(t4c, -1);
                        if (t4c.A00 == 0) {
                            return;
                        } else {
                            i2 = 0;
                        }
                    } else {
                        T4C.A00(t4c, 0);
                        i2 = 2;
                    }
                } else {
                    i2 = 3;
                }
                T4C.A01(t4c, i2);
            }
        });
    }
}
