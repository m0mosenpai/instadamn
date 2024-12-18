package X;

import android.media.MediaCodec;

/* renamed from: X.VlN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69315VlN {
    public byte[] A00;
    public byte[] A01;
    public int[] A02;
    public int[] A03;
    public final MediaCodec.CryptoInfo A04;
    public final C68876VdY A05;

    public C69315VlN() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A04 = cryptoInfo;
        this.A05 = new C68876VdY(cryptoInfo);
    }
}
