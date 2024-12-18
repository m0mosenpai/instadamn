package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137596Lf extends C58J implements C5DW, C58L, InterfaceC113445Ag {
    public int A00;
    public int A01;
    public int A02;
    public C23006ACf A03;
    public C5C8 A04;
    public C118125Vw A05;
    public C5DD A06;
    public List A07;
    public InterfaceC16660sJ A08;
    public InterfaceC16660sJ A09;
    public InterfaceC16660sJ A0A;
    public InterfaceC16660sJ A0B;
    public boolean A0C;
    public C137626Li A0D;
    public Map A0E;

    @Override // X.C58L
    public final boolean Buw() {
        return true;
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [X.6Li, java.lang.Object] */
    public static final C137626Li A00(C137596Lf c137596Lf) {
        C137626Li c137626Li = c137596Lf.A0D;
        if (c137626Li == null) {
            C5C8 c5c8 = c137596Lf.A04;
            C118125Vw c118125Vw = c137596Lf.A05;
            C5DD c5dd = c137596Lf.A06;
            int i = c137596Lf.A02;
            boolean z = c137596Lf.A0C;
            int i2 = c137596Lf.A00;
            int i3 = c137596Lf.A01;
            List list = c137596Lf.A07;
            ?? obj = new Object();
            obj.A07 = c5c8;
            obj.A0A = c118125Vw;
            obj.A0B = c5dd;
            obj.A04 = i;
            obj.A0E = z;
            obj.A02 = i2;
            obj.A03 = i3;
            obj.A0D = list;
            obj.A05 = AbstractC122515gm.A00;
            obj.A01 = -1;
            obj.A00 = -1;
            c137596Lf.A0D = obj;
            return obj;
        }
        return c137626Li;
    }

    private final C137626Li A01(InterfaceC1128957x interfaceC1128957x) {
        C137626Li A00;
        C23006ACf c23006ACf = this.A03;
        if (c23006ACf == null || !c23006ACf.A02 || (A00 = c23006ACf.A00) == null) {
            A00 = A00(this);
        }
        A00.A03(interfaceC1128957x);
        return A00;
    }

    @Override // X.C58L
    public final void ACC(InterfaceC113515Ao interfaceC113515Ao) {
        InterfaceC16660sJ interfaceC16660sJ = this.A0B;
        if (interfaceC16660sJ == null) {
            interfaceC16660sJ = new C206929Dx(this, 26);
            this.A0B = interfaceC16660sJ;
        }
        C5C8 c5c8 = this.A04;
        C113565At c113565At = AbstractC113545Ar.A0R;
        List singletonList = Collections.singletonList(c5c8);
        C14360o3.A07(singletonList);
        interfaceC113515Ao.EOx(c113565At, singletonList);
        C23006ACf c23006ACf = this.A03;
        if (c23006ACf != null) {
            interfaceC113515Ao.EOx(AbstractC113545Ar.A0T, c23006ACf.A01);
            interfaceC113515Ao.EOx(AbstractC113545Ar.A0F, Boolean.valueOf(c23006ACf.A02));
        }
        interfaceC113515Ao.EOx(AbstractC120875de.A0P, new C120895dg(null, new C206929Dx(this, 27)));
        interfaceC113515Ao.EOx(AbstractC120875de.A0Q, new C120895dg(null, new C206929Dx(this, 28)));
        interfaceC113515Ao.EOx(AbstractC120875de.A00, new C120895dg(null, new C9EV(this, 12)));
        interfaceC113515Ao.EOx(AbstractC120875de.A08, new C120895dg(null, interfaceC16660sJ));
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        boolean z;
        List list;
        if (super.A08) {
            AnonymousClass585 anonymousClass585 = ((AnonymousClass587) interfaceC1129057z.AzL()).A02.A02.A01;
            C127055oj c127055oj = A01(interfaceC1129057z).A09;
            if (c127055oj != null) {
                C127035oh c127035oh = c127055oj.A03;
                if (c127055oj.A0A() && this.A02 != 3) {
                    z = true;
                    long j = c127055oj.A02;
                    C114205Dh A01 = AbstractC119355as.A01(0L, C5YB.A00((int) (j >> 32), C119055aN.A00(j)));
                    anonymousClass585.ELZ();
                    anonymousClass585.AI8(A01, 1);
                } else {
                    z = false;
                }
                try {
                    C5W3 c5w3 = this.A05.A02;
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
                        AbstractC27483CBe.A00(AiZ, anonymousClass585, c122215gH, abstractC119825bg, c127035oh, c122205gG, c5w2.AbP());
                    } else {
                        long j2 = C1132359l.A08;
                        if (j2 == 16) {
                            if (c5w2.ApK() != 16) {
                                j2 = c5w2.ApK();
                            } else {
                                j2 = C1132359l.A01;
                            }
                        }
                        c127035oh.A0A(anonymousClass585, c122215gH, abstractC119825bg, c122205gG, j2);
                    }
                    C23006ACf c23006ACf = this.A03;
                    if (((c23006ACf != null && c23006ACf.A02) || !C6LY.A00(this.A04)) && ((list = this.A07) == null || list.isEmpty())) {
                        return;
                    }
                    interfaceC1129057z.AQf();
                    return;
                } finally {
                    if (z) {
                        anonymousClass585.EKS();
                    }
                }
            }
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
    }

    @Override // X.C58L
    public final /* synthetic */ boolean BvB() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    @Override // X.C5DW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC119205ac CpE(X.InterfaceC1131559d r30, X.C59Z r31, long r32) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137596Lf.CpE(X.59d, X.59Z, long):X.5ac");
    }

    public static final void A02(C137596Lf c137596Lf) {
        AbstractC114335Dx.A02(c137596Lf).A0M();
        AbstractC114335Dx.A02(c137596Lf).A0L();
        C5Zx.A00(c137596Lf);
    }

    @Override // X.C5DW
    public final int Cnl(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return A01(interfaceC1131259a).A02(interfaceC1131259a.getLayoutDirection(), i);
    }

    @Override // X.C5DW
    public final int Cno(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC122805hG.A00(C137626Li.A01(A01(interfaceC1131259a), interfaceC1131259a.getLayoutDirection()).BPq());
    }

    @Override // X.C5DW
    public final int Cpg(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return A01(interfaceC1131259a).A02(interfaceC1131259a.getLayoutDirection(), i);
    }

    @Override // X.C5DW
    public final int Cpj(InterfaceC1131659e interfaceC1131659e, InterfaceC1131259a interfaceC1131259a, int i) {
        return AbstractC122805hG.A00(C137626Li.A01(A01(interfaceC1131259a), interfaceC1131259a.getLayoutDirection()).BTs());
    }
}
