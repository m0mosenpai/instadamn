package X;

import androidx.media3.common.Metadata;
import com.facebook.common.dextricks.Constants;
import java.io.EOFException;

/* renamed from: X.WRd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70323WRd implements XE1 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Metadata A05;
    public InterfaceC72026XFo A06;
    public XG2 A07;
    public XG2 A08;
    public InterfaceC72041XGk A09;
    public final WFa A0A;
    public final SYO A0B;
    public final C69515Vqe A0C;
    public final C69623VsQ A0D;
    public final XG2 A0E;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0L;
        this.A00 = 0;
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        return A01(xGj, true);
    }

    private boolean A00(XGj xGj) {
        InterfaceC72041XGk interfaceC72041XGk = this.A09;
        boolean z = true;
        if (interfaceC72041XGk != null) {
            long Avh = interfaceC72041XGk.Avh();
            if (Avh != -1 && xGj.Bc8() > Avh - 4) {
                return true;
            }
        }
        try {
            z = !xGj.E3t(this.A0A.A02, 0, 4, true);
            return z;
        } catch (EOFException unused) {
            return z;
        }
    }

    private boolean A01(XGj xGj, boolean z) {
        int i;
        int i2;
        int A00;
        int i3 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (z) {
            i3 = Constants.LOAD_RESULT_PGO;
        }
        xGj.EJn();
        if (xGj.BeZ() == 0) {
            Metadata A002 = this.A0C.A00(xGj, null);
            this.A05 = A002;
            if (A002 != null) {
                this.A0B.A00(A002);
            }
            i2 = (int) xGj.Bc8();
            if (!z) {
                xGj.Em8(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (A00(xGj)) {
                if (i4 <= 0) {
                    throw new EOFException();
                }
            } else {
                WFa wFa = this.A0A;
                wFa.A0O(0);
                int A01 = wFa.A01();
                if ((i == 0 || ((-128000) & A01) == (i & (-128000))) && (A00 = W1E.A00(A01)) != -1) {
                    i4++;
                    if (i4 == 1) {
                        this.A0D.A00(A01);
                        i = A01;
                    } else if (i4 == 4) {
                        break;
                    }
                    xGj.AB0(A00 - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw new VCM("Searched too many bytes.", null, 1, true);
                    }
                    if (z) {
                        xGj.EJn();
                        xGj.AB0(i2 + i6);
                    } else {
                        xGj.Em8(1);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            }
        }
        if (z) {
            xGj.Em8(i2 + i5);
        } else {
            xGj.EJn();
        }
        this.A01 = i;
        return true;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A06 = interfaceC72026XFo;
        XG2 F87 = interfaceC72026XFo.F87(0, 1);
        this.A08 = F87;
        this.A07 = F87;
        this.A06.ASd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0235, code lost:
    
        if (r6.A01() == 1447187017) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r5 != 1483304551) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030e  */
    @Override // X.XE1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E7l(X.XGj r41, X.VZk r42) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70323WRd.E7l(X.XGj, X.VZk):int");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.VsQ, java.lang.Object] */
    public C70323WRd(int i) {
        this.A0A = new WFa(10);
        this.A0D = new Object();
        this.A0B = new SYO();
        this.A02 = -9223372036854775807L;
        this.A0C = new C69515Vqe();
        WS4 ws4 = new WS4();
        this.A0E = ws4;
        this.A07 = ws4;
    }

    public C70323WRd() {
        this(0);
    }
}
