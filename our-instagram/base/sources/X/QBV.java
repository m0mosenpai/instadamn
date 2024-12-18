package X;

import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public final class QBV extends AbstractC63790Stk implements InterfaceC65321Ti1 {
    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return Q2P.class;
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        C62976SZw c62976SZw = ((Q2P) this.A00).A09.A00;
        SZL szl = c62976SZw.A0E;
        return szl.A09.limit() + szl.A0C.length + (szl.A0G.length * 4) + c62976SZw.A00;
    }

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
        C63361SiK c63361SiK;
        C63361SiK c63361SiK2;
        C63361SiK c63361SiK3;
        Q2P q2p = (Q2P) this.A00;
        q2p.stop();
        q2p.A04 = true;
        C62976SZw c62976SZw = q2p.A09.A00;
        c62976SZw.A0G.clear();
        Bitmap bitmap = c62976SZw.A03;
        if (bitmap != null) {
            c62976SZw.A0F.E6v(bitmap);
            c62976SZw.A03 = null;
        }
        c62976SZw.A09 = false;
        QBY qby = c62976SZw.A05;
        if (qby != null) {
            c62976SZw.A0D.A00(qby);
            c62976SZw.A05 = null;
        }
        QBY qby2 = c62976SZw.A06;
        if (qby2 != null) {
            c62976SZw.A0D.A00(qby2);
            c62976SZw.A06 = null;
        }
        QBY qby3 = c62976SZw.A07;
        if (qby3 != null) {
            c62976SZw.A0D.A00(qby3);
            c62976SZw.A07 = null;
        }
        SZL szl = c62976SZw.A0E;
        szl.A07 = null;
        byte[] bArr = szl.A0C;
        if (bArr != null && (c63361SiK3 = szl.A0I.A01) != null) {
            c63361SiK3.A05(bArr);
        }
        int[] iArr = szl.A0G;
        if (iArr != null && (c63361SiK2 = szl.A0I.A01) != null) {
            c63361SiK2.A05(iArr);
        }
        Bitmap bitmap2 = szl.A06;
        if (bitmap2 != null) {
            szl.A0I.A00.E6v(bitmap2);
        }
        szl.A06 = null;
        szl.A09 = null;
        szl.A08 = null;
        byte[] bArr2 = szl.A0B;
        if (bArr2 != null && (c63361SiK = szl.A0I.A01) != null) {
            c63361SiK.A05(bArr2);
        }
        c62976SZw.A08 = true;
    }
}
