package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;

/* renamed from: X.VsS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69625VsS {
    public int A00;
    public MediaCodec A01;
    public boolean A02;
    public final C69052Vgt A05;
    public final String A06;
    public final MediaExtractor A04 = new MediaExtractor();
    public final MediaCodec.BufferInfo A03 = new MediaCodec.BufferInfo();

    public final void A00() {
        this.A04.release();
        MediaCodec mediaCodec = this.A01;
        if (mediaCodec != null) {
            C0fT.A03(mediaCodec, -462309544);
            this.A01 = null;
        }
    }

    public C69625VsS(C69052Vgt c69052Vgt, String str) {
        this.A06 = str;
        this.A05 = c69052Vgt;
    }
}
