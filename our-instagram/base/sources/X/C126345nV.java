package X;

import android.media.AudioTrack;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.5nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126345nV {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C126355nW A05;

    public final void A00() {
        this.A00 = 0;
        this.A03 = 0L;
        this.A01 = -1L;
        this.A02 = System.nanoTime() / 1000;
        this.A04 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
    }

    public C126345nV(AudioTrack audioTrack) {
        this.A05 = new C126355nW(audioTrack);
        A00();
    }
}
