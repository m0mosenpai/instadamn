package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.5gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122495gk extends C58J implements C5DW, C58L, InterfaceC113445Ag {
    public int A00;
    public int A01;
    public int A02;
    public C23007ACg A03;
    public C118125Vw A04;
    public C5DD A05;
    public String A06;
    public InterfaceC16660sJ A07;
    public boolean A08;
    public C122505gl A09;
    public Map A0A;

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public static final C122505gl A00(C122495gk c122495gk) {
        C122505gl c122505gl = c122495gk.A09;
        if (c122505gl == null) {
            String str = c122495gk.A06;
            C122505gl c122505gl2 = new C122505gl(c122495gk.A04, c122495gk.A05, str, c122495gk.A02, c122495gk.A00, c122495gk.A01, c122495gk.A08);
            c122495gk.A09 = c122505gl2;
            return c122505gl2;
        }
        return c122505gl;
    }

    private final C122505gl A01(InterfaceC1128957x interfaceC1128957x) {
        C122505gl A00;
        C23007ACg c23007ACg = this.A03;
        if (c23007ACg == null || !c23007ACg.A02 || (A00 = c23007ACg.A00) == null) {
            A00 = A00(this);
        }
        A00.A04(interfaceC1128957x);
        return A00;
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        if (interfaceC16660sJ == null) {
            interfaceC16660sJ = new C206929Dx(this, 30);
            this.A07 = interfaceC16660sJ;
        }
        String str = this.A06;
        C16930sl c16930sl = C16930sl.A00;
        C5C8 c5c8 = new C5C8(c16930sl, c16930sl, str);
        C113565At c113565At = AbstractC113545Ar.A0R;
        List singletonList = Collections.singletonList(c5c8);
        C14360o3.A07(singletonList);
        interfaceC113515Ao.EOx(c113565At, singletonList);
        C23007ACg c23007ACg = this.A03;
        if (c23007ACg != null) {
            interfaceC113515Ao.EOx(AbstractC113545Ar.A0F, Boolean.valueOf(c23007ACg.A02));
            interfaceC113515Ao.EOx(AbstractC113545Ar.A0T, new C5C8(c16930sl, c16930sl, c23007ACg.A01));
        }
        interfaceC113515Ao.EOx(AbstractC120875de.A0P, new C120895dg(null, new C206929Dx(this, 31)));
        interfaceC113515Ao.EOx(AbstractC120875de.A0Q, new C120895dg(null, new C206929Dx(this, 32)));
        interfaceC113515Ao.EOx(AbstractC120875de.A00, new C120895dg(null, new C9EV(this, 13)));
        interfaceC113515Ao.EOx(AbstractC120875de.A08, new C120895dg(null, interfaceC16660sJ));
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        if (super.A08) {
            C122505gl A01 = A01(interfaceC1129057z);
            InterfaceC122825hI interfaceC122825hI = A01.A06;
            if (interfaceC122825hI != null) {
                AnonymousClass585 anonymousClass585 = ((AnonymousClass587) interfaceC1129057z.AzL()).A02.A02.A01;
                boolean z = A01.A0D;
                if (z) {
                    float A00 = C119055aN.A00(A01.A03);
                    anonymousClass585.ELZ();
                    anonymousClass585.AI7(1, 0.0f, 0.0f, (int) (r0 >> 32), A00);
                }
                try {
                    C5W3 c5w3 = this.A04.A02;
                    C122205gG c122205gG = c5w3.A0B;
                    if (c122205gG == null) {
                        c122205gG = C122205gG.A02;
                    }
                    C122215gH c122215gH = c5w3.A03;
                    if (c122215gH == null) {
                        c122215gH = C122215gH.A03;
                    }
                    AbstractC119825bg abstractC119825bg = c5w3.A04;
                    if (abstractC119825bg == null) {
                        abstractC119825bg = C119815bf.A00;
                    }
                    C5W2 c5w2 = c5w3.A0C;
                    C6L5 AiZ = c5w2.AiZ();
                    if (AiZ != null) {
                        interfaceC122825hI.E3G(AiZ, anonymousClass585, c122215gH, abstractC119825bg, c122205gG, c5w2.AbP(), 3);
                    } else {
                        long j = C1132359l.A08;
                        if (j == 16) {
                            if (c5w2.ApK() != 16) {
                                j = c5w2.ApK();
                            } else {
                                j = C1132359l.A01;
                            }
                        }
                        C122815hH c122815hH = (C122815hH) interfaceC122825hI;
                        C122605gv c122605gv = c122815hH.A02.A05;
                        int i = c122605gv.A00;
                        c122605gv.A02(j);
                        c122605gv.A04(c122215gH);
                        c122605gv.A06(c122205gG);
                        c122605gv.A05(abstractC119825bg);
                        c122605gv.A01(3);
                        C122815hH.A00(anonymousClass585, c122815hH);
                        c122605gv.A01(i);
                    }
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (z) {
                        anonymousClass585.EKS();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("no paragraph (layoutCache=");
            sb.append(this.A09);
            sb.append(", textSubstitution=");
            sb.append(this.A03);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // X.C58L
    public final /* synthetic */ boolean Buw() {
        return false;
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    public static final void A02(C122495gk c122495gk) {
        AbstractC114335Dx.A02(c122495gk).A0M();
        AbstractC114335Dx.A02(c122495gk).A0L();
        C5Zx.A00(c122495gk);
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return A01(interfaceC1131259a).A03(interfaceC1131259a.getLayoutDirection(), i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC122805hG.A00(C122505gl.A01(A01(interfaceC1131259a), interfaceC1131259a.getLayoutDirection()).BPq());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    @Override // X.C5DW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpE(X.InterfaceC1131559d r10, X.C59Z r11, long r12) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122495gk.CpE(X.59d, X.59Z, long):X.5ac");
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return A01(interfaceC1131259a).A03(interfaceC1131259a.getLayoutDirection(), i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC122805hG.A00(C122505gl.A01(A01(interfaceC1131259a), interfaceC1131259a.getLayoutDirection()).BTs());
    }
}
