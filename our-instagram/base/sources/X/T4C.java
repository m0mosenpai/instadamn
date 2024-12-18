package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public final class T4C implements C5PV {
    public int A00;
    public float A01 = 1.0f;
    public C5P7 A02;
    public final AudioManager A03;
    public final C63454SkX A04;

    @Override // X.C5PV
    public final int FAH(boolean z, int i) {
        if (this.A00 != 0) {
            A01(this, 0);
        }
        return z ? 1 : -1;
    }

    @Override // X.C5PV
    public final void release() {
        this.A02 = null;
        if (this.A00 != 0) {
            A01(this, 0);
        }
    }

    public static void A00(T4C t4c, int i) {
        C5P7 c5p7 = t4c.A02;
        if (c5p7 != null) {
            C5P4 c5p4 = ((C5P5) c5p7).A00;
            boolean Bdn = c5p4.Bdn();
            int i2 = 1;
            if (Bdn && i != 1) {
                i2 = 2;
            }
            C5P4.A0F(c5p4, i, i2, Bdn);
        }
    }

    public static void A01(T4C t4c, int i) {
        if (t4c.A00 != i) {
            t4c.A00 = i;
            float f = 1.0f;
            if (i == 3) {
                f = 0.2f;
            }
            if (t4c.A01 != f) {
                t4c.A01 = f;
                C5P7 c5p7 = t4c.A02;
                if (c5p7 != null) {
                    C5P4 c5p4 = ((C5P5) c5p7).A00;
                    C5P4 c5p42 = C5P4.$redex_init_class;
                    C5P4.A0I(c5p4, Float.valueOf(c5p4.A00 * c5p4.A0Z.CH2()), 1, 2);
                }
            }
        }
    }

    @Override // X.C5PV
    public final float CH2() {
        return this.A01;
    }

    public T4C(Context context, Handler handler, C5P7 c5p7) {
        Object systemService = context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        systemService.getClass();
        this.A03 = (AudioManager) systemService;
        this.A02 = c5p7;
        this.A04 = new C63454SkX(handler, this);
        this.A00 = 0;
    }
}
