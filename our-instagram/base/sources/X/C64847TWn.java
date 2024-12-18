package X;

import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: X.TWn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64847TWn implements InterfaceC65677Tr7 {
    public int A00 = 0;
    public final CRC32 A01 = new CRC32();
    public final Inflater A02;
    public final InterfaceC65701TsN A03;
    public final C64840TWg A04;

    public static void A00(String str, int i, int i2) {
        if (i2 == i) {
        } else {
            throw MSW.A0y(String.format("%s: actual 0x%08x != expected 0x%08x", AbstractC58320PtC.A1a(str, i2, i)));
        }
    }

    private void A01(TWX twx, long j, long j2) {
        C63304ShA c63304ShA = twx.A01;
        while (j >= C63304ShA.A00(c63304ShA)) {
            j -= C63304ShA.A00(c63304ShA);
            c63304ShA = c63304ShA.A02;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c63304ShA.A00 - r4, j2);
            this.A01.update(c63304ShA.A06, (int) (c63304ShA.A01 + j), min);
            j2 -= min;
            c63304ShA = c63304ShA.A02;
            j = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        if (r0 == 2) goto L46;
     */
    @Override // X.InterfaceC65677Tr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E7q(X.TWX r24, long r25) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64847TWn.E7q(X.TWX, long):long");
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A03.Eq9();
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.A04.close();
    }

    public C64847TWn(InterfaceC65677Tr7 interfaceC65677Tr7) {
        if (interfaceC65677Tr7 != null) {
            Inflater inflater = new Inflater(true);
            this.A02 = inflater;
            TWW tww = new TWW(interfaceC65677Tr7);
            this.A03 = tww;
            this.A04 = new C64840TWg(inflater, tww);
            return;
        }
        throw AbstractC166987dD.A12("source == null");
    }
}
