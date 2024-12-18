package X;

import android.media.AudioAttributes;
import android.media.SoundPool;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OaI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55062OaI {
    public float A00;
    public O2B A01;
    public SoundPool A02;
    public final OA1 A03;
    public final Map A04;
    public final java.util.Set A05;

    public static final SoundPool A00(C55062OaI c55062OaI) {
        SoundPool soundPool = c55062OaI.A02;
        if (soundPool == null) {
            soundPool = new SoundPool.Builder().setMaxStreams(8).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build()).build();
        }
        c55062OaI.A02 = soundPool;
        if (soundPool != null) {
            return soundPool;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A01() {
        this.A05.clear();
        Map map = this.A04;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            int A0H = AbstractC166987dD.A0H(AbstractC31176DnK.A0j(A15));
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.unload(A0H);
            }
        }
        map.clear();
        SoundPool soundPool2 = this.A02;
        if (soundPool2 != null) {
            soundPool2.release();
        }
        this.A02 = null;
    }

    public C55062OaI(O2B o2b) {
        this.A01 = o2b;
        this.A04 = AbstractC166987dD.A1I();
        this.A03 = new OA1(this);
        this.A05 = AbstractC31171DnF.A0l();
        this.A00 = 1.0f;
    }

    public C55062OaI() {
        this(null);
    }
}
