package X;

import java.math.BigInteger;

/* renamed from: X.WRr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70337WRr implements InterfaceC71878X8l {
    public final /* synthetic */ WSM A00;

    public C70337WRr(WSM wsm) {
        this.A00 = wsm;
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        WSM wsm = this.A00;
        long j2 = wsm.A09;
        BigInteger valueOf = BigInteger.valueOf((wsm.A0B.A00 * j) / 1000000);
        long j3 = wsm.A08;
        W5N w5n = new W5N(j, Math.max(j2, Math.min((j2 + valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(wsm.A05)).longValue()) - 30000, j3 - 1)));
        return new C69736VuW(w5n, w5n);
    }
}
