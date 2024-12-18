package X;

import android.util.SparseArray;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.EOFException;

/* loaded from: classes11.dex */
public abstract class WS6 implements XG2 {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public C70130W5r A08;
    public C70130W5r A09;
    public boolean A0B;
    public boolean A0C;
    public C70130W5r A0K;
    public final WFI A0M;
    public final C69033Vga A0O = new Object();
    public int A01 = 1000;
    public long[] A0H = new long[1000];
    public long[] A0G = new long[1000];
    public long[] A0I = new long[1000];
    public int[] A0E = new int[1000];
    public int[] A0F = new int[1000];
    public C69702Vtx[] A0J = new C69702Vtx[1000];
    public final W2F A0N = new W2F(new InterfaceC71874X8h() { // from class: X.WR6
        @Override // X.InterfaceC71874X8h
        public final void accept(Object obj) {
        }
    });
    public long A07 = Long.MIN_VALUE;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public boolean A0D = true;
    public boolean A0L = true;
    public boolean A0A = true;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0189, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0109. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c3  */
    @Override // X.XG2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWZ(X.C70130W5r r13) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WS6.AWZ(X.W5r):void");
    }

    @Override // X.XG2
    public final /* synthetic */ int ELK(InterfaceC71873X8g interfaceC71873X8g, int i, boolean z) {
        return ELQ(interfaceC71873X8g, i, 0, z);
    }

    @Override // X.XG2
    public final /* synthetic */ void ELL(WFa wFa, int i) {
        ELM(wFa, i, 0);
    }

    @Override // X.XG2
    public void ELS(C69702Vtx c69702Vtx, int i, int i2, int i3, long j) {
        int i4 = i & 1;
        boolean A1M = AbstractC167007dF.A1M(i4);
        if (this.A0L) {
            if (A1M) {
                this.A0L = false;
            } else {
                return;
            }
        }
        if (this.A0A) {
            if (j >= Long.MIN_VALUE) {
                if (i4 == 0) {
                    if (!this.A0C) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AbstractC111324zv.A00(1705));
                        AbstractC63374Sil.A04(AbstractC111324zv.A00(1791), AbstractC166997dE.A0v(this.A09, sb));
                        this.A0C = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        long j2 = (this.A0M.A00 - i2) - i3;
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                WDn.A01(AbstractC31175DnJ.A1S(((this.A0G[i6] + this.A0F[i6]) > j2 ? 1 : ((this.A0G[i6] + this.A0F[i6]) == j2 ? 0 : -1))));
            }
            this.A0B = AbstractC167007dF.A1M(536870912 & i);
            this.A06 = Math.max(this.A06, j);
            int i8 = this.A04 + this.A02;
            int i9 = this.A01;
            if (i8 >= i9) {
                i8 -= i9;
            }
            this.A0I[i8] = j;
            this.A0G[i8] = j2;
            this.A0F[i8] = i2;
            this.A0E[i8] = i;
            this.A0J[i8] = c69702Vtx;
            this.A0H[i8] = 0;
            W2F w2f = this.A0N;
            SparseArray sparseArray = w2f.A01;
            if (sparseArray.size() == 0 || !((C68877VdZ) sparseArray.valueAt(sparseArray.size() - 1)).A00.equals(this.A09)) {
                C70130W5r c70130W5r = this.A09;
                c70130W5r.getClass();
                XF0 xf0 = XF0.A00;
                int i10 = this.A00 + this.A02;
                C68877VdZ c68877VdZ = new C68877VdZ(c70130W5r, xf0);
                boolean z = false;
                if (w2f.A00 == -1) {
                    WDn.A02(AbstractC167007dF.A1N(sparseArray.size()));
                    w2f.A00 = 0;
                }
                if (sparseArray.size() > 0) {
                    int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i10 >= keyAt) {
                        z = true;
                    }
                    WDn.A01(z);
                    if (keyAt == i10) {
                        w2f.A02.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, c68877VdZ);
            }
            int i11 = this.A02 + 1;
            this.A02 = i11;
            int i12 = this.A01;
            if (i11 == i12) {
                int i13 = i12 + 1000;
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                long[] jArr3 = new long[i13];
                int[] iArr = new int[i13];
                int[] iArr2 = new int[i13];
                C69702Vtx[] c69702VtxArr = new C69702Vtx[i13];
                int i14 = this.A04;
                int i15 = i12 - i14;
                System.arraycopy(this.A0G, i14, jArr2, 0, i15);
                System.arraycopy(this.A0I, this.A04, jArr3, 0, i15);
                System.arraycopy(this.A0E, this.A04, iArr, 0, i15);
                System.arraycopy(this.A0F, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0J, this.A04, c69702VtxArr, 0, i15);
                System.arraycopy(this.A0H, this.A04, jArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0G, 0, jArr2, i15, i16);
                System.arraycopy(this.A0I, 0, jArr3, i15, i16);
                System.arraycopy(this.A0E, 0, iArr, i15, i16);
                System.arraycopy(this.A0F, 0, iArr2, i15, i16);
                System.arraycopy(this.A0J, 0, c69702VtxArr, i15, i16);
                System.arraycopy(this.A0H, 0, jArr, i15, i16);
                this.A0G = jArr2;
                this.A0I = jArr3;
                this.A0E = iArr;
                this.A0F = iArr2;
                this.A0J = c69702VtxArr;
                this.A0H = jArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r8 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(X.C66397UFi r10, X.C69514Vqd r11, int r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WS6.A00(X.UFi, X.Vqd, int):int");
    }

    public final void A01(boolean z) {
        SparseArray sparseArray;
        WFI wfi = this.A0M;
        VJY vjy = wfi.A01;
        if (vjy.A03 != null) {
            VJY vjy2 = vjy;
            WRB wrb = (WRB) wfi.A05;
            synchronized (wrb) {
                do {
                    C68650VZi[] c68650VZiArr = wrb.A02;
                    int i = wrb.A01;
                    wrb.A01 = i + 1;
                    C68650VZi c68650VZi = vjy2.A03;
                    c68650VZi.getClass();
                    c68650VZiArr[i] = c68650VZi;
                    wrb.A00--;
                    vjy2 = vjy2.A02;
                    if (vjy2 == null) {
                        break;
                    }
                } while (vjy2.A03 != null);
                wrb.notifyAll();
            }
            vjy.A03 = null;
            vjy.A02 = null;
        }
        VJY vjy3 = wfi.A01;
        WDn.A02(AbstractC25229BEm.A1Z(vjy3.A03));
        vjy3.A01 = 0L;
        vjy3.A00 = OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
        wfi.A02 = vjy3;
        wfi.A03 = vjy3;
        wfi.A00 = 0L;
        wfi.A05.F8c();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0L = true;
        this.A07 = Long.MIN_VALUE;
        this.A05 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A0B = false;
        W2F w2f = this.A0N;
        int i2 = 0;
        while (true) {
            sparseArray = w2f.A01;
            if (i2 >= sparseArray.size()) {
                break;
            }
            w2f.A02.accept(sparseArray.valueAt(i2));
            i2++;
        }
        w2f.A00 = -1;
        sparseArray.clear();
        if (z) {
            this.A0K = null;
            this.A09 = null;
            this.A0D = true;
            this.A0A = true;
        }
    }

    @Override // X.XG2
    public final void ELM(WFa wFa, int i, int i2) {
        WFI wfi = this.A0M;
        while (i > 0) {
            int A00 = WFI.A00(wfi, i);
            VJY vjy = wfi.A03;
            wFa.A0R(vjy.A03.A00, (int) (wfi.A00 - vjy.A01), A00);
            i -= A00;
            long j = wfi.A00 + A00;
            wfi.A00 = j;
            VJY vjy2 = wfi.A03;
            if (j == vjy2.A00) {
                wfi.A03 = vjy2.A02;
            }
        }
    }

    @Override // X.XG2
    public final int ELQ(InterfaceC71873X8g interfaceC71873X8g, int i, int i2, boolean z) {
        WFI wfi = this.A0M;
        int A00 = WFI.A00(wfi, i);
        VJY vjy = wfi.A03;
        int read = interfaceC71873X8g.read(vjy.A03.A00, (int) (wfi.A00 - vjy.A01), A00);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = wfi.A00 + read;
        wfi.A00 = j;
        VJY vjy2 = wfi.A03;
        if (j != vjy2.A00) {
            return read;
        }
        wfi.A03 = vjy2.A02;
        return read;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Vga, java.lang.Object] */
    public WS6(InterfaceC71875X8i interfaceC71875X8i) {
        this.A0M = new WFI(interfaceC71875X8i);
    }
}
