package X;

import android.util.SparseArray;

/* loaded from: classes11.dex */
public final class W3F {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A07;
    public byte[] A08;
    public final C70173WEv A0B;
    public final XG2 A0C;
    public final SparseArray A0A = new SparseArray();
    public final SparseArray A09 = new SparseArray();
    public boolean A06 = false;

    public static void A00(W3F w3f, int i) {
        long j = w3f.A04;
        if (j != -9223372036854775807L) {
            boolean z = w3f.A07;
            w3f.A0C.ELS(null, z ? 1 : 0, (int) (w3f.A01 - w3f.A03), i, j);
        }
    }

    public W3F(XG2 xg2) {
        this.A0C = xg2;
        byte[] bArr = new byte[128];
        this.A08 = bArr;
        this.A0B = new C70173WEv(bArr, 0, 0);
    }
}
