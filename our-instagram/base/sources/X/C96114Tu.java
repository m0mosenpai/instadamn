package X;

import android.media.MediaCodec;

/* renamed from: X.4Tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96114Tu {
    public byte[] A00;
    public byte[] A01;
    public int[] A02;
    public int[] A03;
    public final MediaCodec.CryptoInfo A04;
    public final C96124Tv A05;

    public C96114Tu() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A04 = cryptoInfo;
        this.A05 = new C96124Tv(cryptoInfo);
    }
}
