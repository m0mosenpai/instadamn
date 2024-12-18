package X;

import android.content.ClipDescription;
import android.view.ActionMode;

/* loaded from: classes5.dex */
public final class BXF {
    public int A00;
    public long A01;
    public long A02;
    public CWQ A03;
    public C25338BJh A04;
    public C5DP A05;
    public C5BU A06;
    public InterfaceC114195Dg A07;
    public InterfaceC31114Dlw A08;
    public C5C3 A09;
    public InterfaceC31101Dlj A0A;
    public Integer A0B;
    public InterfaceC16660sJ A0C;
    public InterfaceC30910DiN A0D;
    public final InterfaceC31064Dl6 A0E;
    public final InterfaceC30782DgJ A0F;
    public final InterfaceC74953Yl A0G;
    public final InterfaceC74953Yl A0H;
    public final InterfaceC74953Yl A0I;
    public final InterfaceC74953Yl A0J;
    public final InterfaceC74953Yl A0K;
    public final CU9 A0L;

    public static void A02(BXF bxf) {
        bxf.A0H.Egh(null);
        bxf.A0G.Egh(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (X.C60Z.A00((int) (r0 & 4294967295L), (int) (r0 >> 32)) != r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        if (X.C5C2.A03(r4) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
    
        if (X.AbstractC28014CWm.A01(r24, true) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        if (X.AbstractC28014CWm.A01(r24, false) == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(X.InterfaceC31099Dlh r23, X.BXF r24, X.C5C3 r25, long r26, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BXF.A00(X.Dlh, X.BXF, X.5C3, long, boolean, boolean, boolean):long");
    }

    public static final void A01(EnumC27357C5m enumC27357C5m, BXF bxf) {
        CWQ cwq = bxf.A03;
        if (cwq != null && cwq.A09.getValue() != enumC27357C5m) {
            cwq.A09.Egh(enumC27357C5m);
        }
    }

    public static void A03(BXF bxf, long j) {
        bxf.A01 = j;
        bxf.A0G.Egh(new C119365at(j));
        bxf.A02 = 0L;
    }

    public static final void A05(BXF bxf, boolean z) {
        CWQ cwq = bxf.A03;
        if (cwq != null) {
            AbstractC25227BEk.A1A(cwq.A0G, z);
        }
        if (z) {
            bxf.A0B();
        } else {
            bxf.A08();
        }
    }

    public final long A06(boolean z) {
        C28262Cd7 A00;
        C5C8 c5c8;
        long j;
        int i;
        CWQ cwq = this.A03;
        if (cwq != null && (A00 = cwq.A00()) != null) {
            C127055oj c127055oj = A00.A02;
            CWQ cwq2 = this.A03;
            if (cwq2 != null && (c5c8 = cwq2.A01.A02) != null) {
                if (C14360o3.A0K(c5c8.A00, c127055oj.A04.A03.A00)) {
                    InterfaceC74953Yl interfaceC74953Yl = this.A0K;
                    long A0G = AbstractC25228BEl.A0G(interfaceC74953Yl);
                    if (z) {
                        j = A0G >> 32;
                    } else {
                        j = A0G & 4294967295L;
                    }
                    int E36 = this.A08.E36((int) j);
                    boolean A04 = C5C2.A04(AbstractC25228BEl.A0G(interfaceC74953Yl));
                    C127035oh c127035oh = c127055oj.A03;
                    int A06 = c127035oh.A06(E36);
                    if (A06 < c127035oh.A02) {
                        boolean z2 = false;
                        if (!z ? !A04 : A04) {
                            i = Math.max(E36 - 1, 0);
                        } else {
                            i = E36;
                        }
                        if (c127055oj.A08(i) == c127055oj.A09(E36)) {
                            z2 = true;
                        }
                        float A02 = c127055oj.A02(E36, z2);
                        long j2 = c127055oj.A02;
                        return AbstractC119395aw.A00(C17s.A02(A02, 0.0f, AbstractC25225BEi.A06(j2)), C17s.A02(c127035oh.A03(A06), 0.0f, C119055aN.A00(j2)));
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final void A07() {
        InterfaceC74953Yl interfaceC74953Yl = this.A0K;
        if (!C5C2.A03(AbstractC25228BEl.A0G(interfaceC74953Yl))) {
            C5BU c5bu = this.A06;
            if (c5bu != null) {
                C5C3 A0i = AbstractC25226BEj.A0i(interfaceC74953Yl);
                C5C8 c5c8 = A0i.A01;
                long j = A0i.A00;
                c5bu.EfV(c5c8.subSequence(C5C2.A01(j), C5C2.A00(j)));
            }
            A04(this, AbstractC28018CWq.A01(AbstractC25226BEj.A0i(interfaceC74953Yl), AbstractC25233BEq.A03(interfaceC74953Yl)).A01(AbstractC28018CWq.A00(AbstractC25226BEj.A0i(interfaceC74953Yl), AbstractC25233BEq.A03(interfaceC74953Yl))), C5C2.A01(AbstractC25228BEl.A0G(interfaceC74953Yl)));
            CU9 cu9 = this.A0L;
            if (cu9 != null) {
                cu9.A04 = true;
            }
        }
    }

    public final void A08() {
        Integer num;
        InterfaceC114195Dg interfaceC114195Dg = this.A07;
        if (interfaceC114195Dg != null) {
            num = ((C114185Df) interfaceC114195Dg).A01;
        } else {
            num = null;
        }
        if (num == C05F.A00 && interfaceC114195Dg != null) {
            C114185Df c114185Df = (C114185Df) interfaceC114195Dg;
            c114185Df.A01 = C05F.A01;
            ActionMode actionMode = c114185Df.A00;
            if (actionMode != null) {
                actionMode.finish();
            }
            c114185Df.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0163, code lost:
    
        if (r0 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0139, code lost:
    
        if (r1 != 1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BXF.A09():void");
    }

    public final void A0A() {
        InterfaceC74953Yl interfaceC74953Yl = this.A0K;
        C5C3 c5c3 = new C5C3(AbstractC25226BEj.A0i(interfaceC74953Yl).A01, null, C60Z.A00(0, AbstractC25233BEq.A03(interfaceC74953Yl)));
        this.A0C.invoke(c5c3);
        C5C3 c5c32 = this.A09;
        this.A09 = new C5C3(c5c32.A01, c5c32.A02, c5c3.A00);
        A0E(true);
    }

    public final void A0B() {
        DGT dgt;
        DGT dgt2;
        DGT dgt3;
        C114205Dh c114205Dh;
        long j;
        long j2;
        float f;
        InterfaceC1131459c A01;
        float f2;
        InterfaceC1131459c A012;
        float f3;
        InterfaceC1131459c A013;
        InterfaceC1131459c A014;
        C5BU c5bu;
        ClipDescription primaryClipDescription;
        if (AbstractC25230BEn.A1X(this.A0J)) {
            CWQ cwq = this.A03;
            if (cwq != null && !AbstractC25230BEn.A1X(cwq.A0B)) {
                return;
            }
            InterfaceC74953Yl interfaceC74953Yl = this.A0K;
            DGT dgt4 = null;
            if (!C5C2.A03(AbstractC25228BEl.A0G(interfaceC74953Yl))) {
                dgt = new DGT(this, 46);
            } else {
                dgt = null;
            }
            if (!C5C2.A03(AbstractC25228BEl.A0G(interfaceC74953Yl)) && AbstractC25230BEn.A1X(this.A0I)) {
                dgt2 = new DGT(this, 47);
            } else {
                dgt2 = null;
            }
            if (AbstractC25230BEn.A1X(this.A0I) && (c5bu = this.A06) != null && (primaryClipDescription = ((C5BT) c5bu).A00.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
                dgt3 = new DGT(this, 48);
            } else {
                dgt3 = null;
            }
            long A0G = AbstractC25228BEl.A0G(interfaceC74953Yl);
            if (C5C2.A00(A0G) - C5C2.A01(A0G) != AbstractC25233BEq.A03(interfaceC74953Yl)) {
                dgt4 = new DGT(this, 49);
            }
            InterfaceC114195Dg interfaceC114195Dg = this.A07;
            if (interfaceC114195Dg == null) {
                return;
            }
            CWQ cwq2 = this.A03;
            if (cwq2 != null && (!cwq2.A06)) {
                int E36 = this.A08.E36(AbstractC25225BEi.A06(AbstractC25228BEl.A0G(interfaceC74953Yl)));
                int E362 = this.A08.E36(AbstractC25228BEl.A02(AbstractC25228BEl.A0G(interfaceC74953Yl)));
                CWQ cwq3 = this.A03;
                if (cwq3 != null && (A014 = cwq3.A01()) != null) {
                    j = A014.Chn(A06(true));
                } else {
                    j = 0;
                }
                CWQ cwq4 = this.A03;
                if (cwq4 != null && (A013 = cwq4.A01()) != null) {
                    j2 = A013.Chn(A06(false));
                } else {
                    j2 = 0;
                }
                CWQ cwq5 = this.A03;
                float f4 = 0.0f;
                if (cwq5 != null && (A012 = cwq5.A01()) != null) {
                    C28262Cd7 A00 = cwq2.A00();
                    if (A00 != null) {
                        f3 = A00.A02.A06(E36).A03;
                    } else {
                        f3 = 0.0f;
                    }
                    f = C119365at.A02(A012.Chn(AbstractC119395aw.A00(0.0f, f3)));
                } else {
                    f = 0.0f;
                }
                CWQ cwq6 = this.A03;
                if (cwq6 != null && (A01 = cwq6.A01()) != null) {
                    C28262Cd7 A002 = cwq2.A00();
                    if (A002 != null) {
                        f2 = A002.A02.A06(E362).A03;
                    } else {
                        f2 = 0.0f;
                    }
                    f4 = C119365at.A02(A01.Chn(AbstractC119395aw.A00(0.0f, f2)));
                }
                float A015 = C119365at.A01(j);
                float A016 = C119365at.A01(j2);
                c114205Dh = new C114205Dh(Math.min(A015, A016), Math.min(f, f4), Math.max(A015, A016), Math.max(C119365at.A02(j), C119365at.A02(j2)) + (25.0f * cwq2.A01.A05.Awk()));
            } else {
                c114205Dh = C114205Dh.A04;
            }
            C114185Df c114185Df = (C114185Df) interfaceC114195Dg;
            C5Di c5Di = c114185Df.A03;
            c5Di.A00 = c114205Dh;
            c5Di.A01 = dgt;
            c5Di.A02 = dgt2;
            c5Di.A03 = dgt3;
            c5Di.A04 = dgt4;
            ActionMode actionMode = c114185Df.A00;
            if (actionMode == null) {
                c114185Df.A01 = C05F.A00;
                c114185Df.A00 = c114185Df.A02.startActionMode(new C25725BYk(c5Di), 1);
            } else {
                actionMode.invalidate();
            }
        }
    }

    public final void A0C(C119365at c119365at) {
        EnumC27357C5m enumC27357C5m;
        C28262Cd7 c28262Cd7;
        int A00;
        InterfaceC74953Yl interfaceC74953Yl = this.A0K;
        if (!C5C2.A03(AbstractC25228BEl.A0G(interfaceC74953Yl))) {
            CWQ cwq = this.A03;
            if (cwq != null) {
                c28262Cd7 = cwq.A00();
            } else {
                c28262Cd7 = null;
            }
            if (c119365at != null && c28262Cd7 != null) {
                A00 = this.A08.F8T(c28262Cd7.A01(c119365at.A00, true));
            } else {
                A00 = C5C2.A00(AbstractC25228BEl.A0G(interfaceC74953Yl));
            }
            C5C3 A0i = AbstractC25226BEj.A0i(interfaceC74953Yl);
            this.A0C.invoke(new C5C3(A0i.A01, A0i.A02, C60Z.A00(A00, A00)));
        }
        if (c119365at != null && AbstractC25233BEq.A03(interfaceC74953Yl) > 0) {
            enumC27357C5m = EnumC27357C5m.Cursor;
        } else {
            enumC27357C5m = EnumC27357C5m.None;
        }
        A01(enumC27357C5m, this);
        A05(this, false);
    }

    public final void A0D(boolean z) {
        InterfaceC74953Yl interfaceC74953Yl = this.A0K;
        if (!C5C2.A03(AbstractC25228BEl.A0G(interfaceC74953Yl))) {
            C5BU c5bu = this.A06;
            if (c5bu != null) {
                C5C3 A0i = AbstractC25226BEj.A0i(interfaceC74953Yl);
                C5C8 c5c8 = A0i.A01;
                long j = A0i.A00;
                c5bu.EfV(c5c8.subSequence(C5C2.A01(j), C5C2.A00(j)));
            }
            if (z) {
                A04(this, AbstractC25226BEj.A0i(interfaceC74953Yl).A01, C5C2.A00(AbstractC25228BEl.A0G(interfaceC74953Yl)));
            }
        }
    }

    public final void A0E(boolean z) {
        C25338BJh c25338BJh;
        CWQ cwq = this.A03;
        if (cwq != null && !AbstractC25230BEn.A1X(cwq.A0A) && (c25338BJh = this.A04) != null) {
            c25338BJh.A01();
        }
        this.A09 = AbstractC25226BEj.A0i(this.A0K);
        A05(this, z);
        A01(EnumC27357C5m.Selection, this);
    }

    public BXF(CU9 cu9) {
        this.A0L = cu9;
        this.A08 = AbstractC28412CgI.A00;
        this.A0C = C29966DJe.A00;
        long j = C5C2.A01;
        this.A0K = AbstractC25230BEn.A0U(new C5C3("", j));
        this.A0A = C28149Caw.A00;
        Boolean A0b = AbstractC166997dE.A0b();
        this.A0I = AbstractC25229BEm.A0R(A0b);
        this.A0J = AbstractC25229BEm.A0R(A0b);
        this.A01 = 0L;
        this.A02 = 0L;
        this.A0H = AbstractC25229BEm.A0R(null);
        this.A0G = AbstractC25229BEm.A0R(null);
        this.A00 = -1;
        this.A09 = new C5C3("", j);
        this.A0E = new C28776Cn8(this);
        this.A0F = new C28783CnF(this);
    }

    public static void A04(BXF bxf, C5C8 c5c8, int i) {
        bxf.A0C.invoke(new C5C3(c5c8, null, C60Z.A00(i, i)));
        A01(EnumC27357C5m.None, bxf);
    }

    public BXF() {
        this(null);
    }
}
