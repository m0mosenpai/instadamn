package X;

import androidx.media3.common.util.Util;

/* loaded from: classes11.dex */
public final class WRY implements XE1 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public InterfaceC72026XFo A04;
    public WSA A05;
    public C69654Vsv A06;
    public boolean A07;
    public C69654Vsv[] A08;
    public int A09;
    public int A0A;
    public int A0B;
    public final WFa A0C;
    public final C68879Vdb A0D;
    public final InterfaceC72027XFp A0E;
    public final boolean A0F;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A0B = 0;
        if (this.A0F) {
            interfaceC72026XFo = new C70333WRn(interfaceC72026XFo, this.A0E);
        }
        this.A04 = interfaceC72026XFo;
        this.A03 = -1L;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r23, X.VZk r24) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRY.E7l(X.XGj, X.VZk):int");
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A03 = -1L;
        this.A06 = null;
        int i = 0;
        for (C69654Vsv c69654Vsv : this.A08) {
            if (c69654Vsv.A04 == 0) {
                c69654Vsv.A01 = 0;
            } else {
                c69654Vsv.A01 = c69654Vsv.A05[Util.A02(c69654Vsv.A06, j, true)];
            }
        }
        if (j == 0) {
            if (this.A08.length != 0) {
                i = 3;
            }
        } else {
            i = 6;
        }
        this.A0B = i;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        WFa wFa = this.A0C;
        xGj.E3s(wFa.A02, 0, 12);
        wFa.A0O(0);
        if (wFa.A02() != 1179011410) {
            return false;
        }
        wFa.A0P(4);
        if (wFa.A02() != 541677121) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Vdb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.XFo, java.lang.Object] */
    public WRY(InterfaceC72027XFp interfaceC72027XFp, int i) {
        this.A0E = interfaceC72027XFp;
        this.A0F = (i & 1) == 0;
        this.A0C = new WFa(12);
        this.A0D = new Object();
        this.A04 = new Object();
        this.A08 = new C69654Vsv[0];
        this.A02 = -1L;
        this.A01 = -1L;
        this.A09 = -1;
        this.A00 = -9223372036854775807L;
    }

    @Deprecated
    public WRY() {
        this(InterfaceC72027XFp.A00, 1);
    }
}
