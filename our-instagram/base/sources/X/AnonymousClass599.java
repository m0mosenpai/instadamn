package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.599, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass599 implements C59A, C59B, C59C, C59D, C59E {
    public int A00;
    public int A01;
    public C59R A02;
    public C57S A03;
    public Modifier A04;
    public Modifier A05;
    public C6NM A06;
    public InterfaceC1127857k A07;
    public AnonymousClass599 A08;
    public C59U A09;
    public InterfaceC1128457r A0A;
    public C59J A0B;
    public InterfaceC1128957x A0C;
    public AnonymousClass583 A0D;
    public BT9 A0E;
    public Integer A0F;
    public InterfaceC16660sJ A0G;
    public InterfaceC16660sJ A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A0O;
    public C25283BGz A0P;
    public AnonymousClass599 A0Q;
    public C113505An A0R;
    public Integer A0S;
    public boolean A0T;
    public final C5AZ A0U;
    public final C59L A0V;
    public final C59S A0W;
    public final boolean A0X;
    public final C57S A0Y;
    public static final C59G A0b = new C59G() { // from class: X.59F
        @Override // X.InterfaceC1127857k
        public final /* bridge */ /* synthetic */ InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };
    public static final InterfaceC16820sZ A0a = C59H.A00;
    public static final C59J A0c = new C59J() { // from class: X.59I
        @Override // X.C59J
        public final long Az7() {
            return 40L;
        }

        @Override // X.C59J
        public final long Az8() {
            return 300L;
        }

        @Override // X.C59J
        public final long BPB() {
            return 400L;
        }

        @Override // X.C59J
        public final float CA3() {
            return 16.0f;
        }

        @Override // X.C59J
        public final /* synthetic */ float BAw() {
            return 16.0f;
        }

        @Override // X.C59J
        public final /* synthetic */ float BAx() {
            return 2.0f;
        }

        @Override // X.C59J
        public final long BUC() {
            return 0L;
        }

        @Override // X.C59J
        public final /* synthetic */ float BQG() {
            return Float.MAX_VALUE;
        }
    };
    public static final Comparator A0Z = new Comparator() { // from class: X.59K
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C113385Aa c113385Aa = ((AnonymousClass599) obj).A0U.A0J;
            float f = c113385Aa.A02;
            C113385Aa c113385Aa2 = ((AnonymousClass599) obj2).A0U.A0J;
            float f2 = c113385Aa2.A02;
            if (f == f2) {
                return C14360o3.A00(c113385Aa.A03, c113385Aa2.A03);
            }
            return Float.compare(f, f2);
        }
    };

    public final void A0M() {
        this.A0R = null;
        C59M.A00(this).DkU();
    }

    public final void A0T(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i > i3) {
                return;
            }
            while (true) {
                C59L c59l = this.A0V;
                C57S c57s = c59l.A00;
                A05((AnonymousClass599) c57s.A02[i3]);
                c57s.A00(i3);
                c59l.A01.invoke();
                if (i3 != i) {
                    i3--;
                } else {
                    return;
                }
            }
        } else {
            AbstractC28290Cdc.A00(AnonymousClass001.A0c("count (", ") must be greater than 0", i2));
            throw C00O.createAndThrow();
        }
    }

    public static final C25283BGz A00(AnonymousClass599 anonymousClass599) {
        C25283BGz c25283BGz = anonymousClass599.A0P;
        if (c25283BGz == null) {
            C25283BGz c25283BGz2 = new C25283BGz(anonymousClass599.A07, anonymousClass599);
            anonymousClass599.A0P = c25283BGz2;
            return c25283BGz2;
        }
        return c25283BGz;
    }

    private final String A01(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        C57S A0A = A0A();
        int i3 = A0A.A00;
        if (i3 > 0) {
            Object[] objArr = A0A.A02;
            int i4 = 0;
            do {
                sb.append(((AnonymousClass599) objArr[i4]).A01(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String obj = sb.toString();
        if (i == 0) {
            String substring = obj.substring(0, obj.length() - 1);
            C14360o3.A07(substring);
            return substring;
        }
        return obj;
    }

    private final void A02() {
        AnonymousClass599 anonymousClass599;
        if (this.A0O > 0) {
            this.A0N = true;
        }
        if (this.A0X && (anonymousClass599 = this.A0Q) != null) {
            anonymousClass599.A02();
        }
    }

    private final void A03() {
        C58J c58j = this.A0W.A05;
        C58J c58j2 = c58j;
        while (c58j != null) {
            if (c58j.A08) {
                c58j.A0B();
            }
            c58j = c58j.A04;
        }
        for (C58J c58j3 = c58j2; c58j3 != null; c58j3 = c58j3.A04) {
            if (c58j3.A08) {
                c58j3.A0D();
            }
        }
        while (c58j2 != null) {
            if (c58j2.A08) {
                c58j2.A09();
            }
            c58j2 = c58j2.A04;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r15 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if (r11 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r13 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        if (r14.A07.A05 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        r16 = !r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        r9 = "structuralUpdate requires a non-null tail";
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(androidx.compose.ui.Modifier r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass599.A04(androidx.compose.ui.Modifier):void");
    }

    private final void A05(AnonymousClass599 anonymousClass599) {
        if (anonymousClass599.A0U.A00 > 0) {
            this.A0U.A01(r1.A00 - 1);
        }
        if (this.A0A != null) {
            anonymousClass599.A0I();
        }
        anonymousClass599.A0Q = null;
        anonymousClass599.A0W.A04.A07 = null;
        if (anonymousClass599.A0X) {
            this.A0O--;
            C57S c57s = anonymousClass599.A0V.A00;
            int i = c57s.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = c57s.A02;
                do {
                    ((AnonymousClass599) objArr[i2]).A0W.A04.A07 = null;
                    i2++;
                } while (i2 < i);
            }
        }
        A02();
        A0O();
    }

    private final void A06(AnonymousClass599 anonymousClass599) {
        if (!C14360o3.A0K(anonymousClass599, this.A08)) {
            this.A08 = anonymousClass599;
            if (anonymousClass599 != null) {
                C5AZ c5az = this.A0U;
                if (c5az.A05 == null) {
                    c5az.A05 = new C121665fI(c5az);
                }
                C59S c59s = this.A0W;
                C59U c59u = c59s.A06.A06;
                for (C59U c59u2 = c59s.A04; !C14360o3.A0K(c59u2, c59u) && c59u2 != null; c59u2 = c59u2.A06) {
                    if (c59u2 instanceof C118815Zd) {
                        C118815Zd c118815Zd = (C118815Zd) c59u2;
                        if (c118815Zd.A02 == null) {
                            c118815Zd.A02 = new C25781BaK(c118815Zd);
                        }
                    } else {
                        C59T c59t = (C59T) c59u2;
                        if (c59t.A00 == null) {
                            c59t.A00 = new C25780BaJ(c59t);
                        }
                    }
                }
            }
            A0L();
        }
    }

    public static final void A07(AnonymousClass599 anonymousClass599) {
        anonymousClass599.A0S = anonymousClass599.A0F;
        anonymousClass599.A0F = C05F.A0C;
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (anonymousClass5992.A0F == C05F.A01) {
                    A07(anonymousClass5992);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A08(AnonymousClass599 anonymousClass599) {
        C5AZ c5az = anonymousClass599.A0U;
        Integer num = c5az.A06;
        if (num.intValue() == 4) {
            if (c5az.A0G) {
                anonymousClass599.A0Z(true, true, true);
                return;
            }
            if (c5az.A0E) {
                anonymousClass599.A0X(true);
            }
            if (c5az.A0H) {
                anonymousClass599.A0a(true, true, true);
                return;
            } else {
                if (!c5az.A0A) {
                    return;
                }
                anonymousClass599.A0Y(true);
                return;
            }
        }
        throw new IllegalStateException(AnonymousClass001.A0R("Unexpected state ", AbstractC33633Etj.A00(num)));
    }

    public final C57S A09() {
        if (this.A0T) {
            C57S c57s = this.A0Y;
            c57s.A01();
            c57s.A06(A0A(), c57s.A00);
            c57s.A07(A0Z);
            this.A0T = false;
        }
        return this.A0Y;
    }

    public final AnonymousClass599 A0B() {
        AnonymousClass599 anonymousClass599 = this.A0Q;
        while (anonymousClass599 != null && anonymousClass599.A0X) {
            anonymousClass599 = anonymousClass599.A0Q;
        }
        return anonymousClass599;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    public final C113505An A0C() {
        if (this.A0A != null && !this.A0L) {
            if ((this.A0W.A02.A00 & 8) != 0 && this.A0R == null) {
                ?? obj = new Object();
                obj.A00 = new C113505An();
                C5BV c5bv = ((AndroidComposeView) C59M.A00(this)).A0b;
                c5bv.A00(this, new C9F8(3, obj, this), c5bv.A07);
                C113505An c113505An = (C113505An) obj.A00;
                this.A0R = c113505An;
                return c113505An;
            }
            return this.A0R;
        }
        return null;
    }

    public final Boolean A0D() {
        C121665fI c121665fI = this.A0U.A05;
        if (c121665fI != null) {
            return Boolean.valueOf(c121665fI.A09);
        }
        return null;
    }

    public final List A0E() {
        C121665fI c121665fI = this.A0U.A05;
        C14360o3.A0A(c121665fI);
        AnonymousClass599 anonymousClass599 = c121665fI.A0J.A0I;
        anonymousClass599.A0F();
        boolean z = c121665fI.A08;
        C57S c57s = c121665fI.A0H;
        if (z) {
            C57S A0A = anonymousClass599.A0A();
            int i = A0A.A00;
            if (i > 0) {
                Object[] objArr = A0A.A02;
                int i2 = 0;
                do {
                    AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                    int i3 = c57s.A00;
                    C121665fI c121665fI2 = anonymousClass5992.A0U.A05;
                    if (i3 <= i2) {
                        C14360o3.A0A(c121665fI2);
                        c57s.A09(c121665fI2);
                    } else {
                        C14360o3.A0A(c121665fI2);
                        c57s.A02[i2] = c121665fI2;
                    }
                    i2++;
                } while (i2 < i);
            }
            c57s.A03(anonymousClass599.A0F().size(), c57s.A00);
            c121665fI.A08 = false;
        }
        List list = c57s.A01;
        if (list == null) {
            C119075aP c119075aP = new C119075aP(c57s);
            c57s.A01 = c119075aP;
            return c119075aP;
        }
        return list;
    }

    public final List A0G() {
        C57S c57s = this.A0V.A00;
        List list = c57s.A01;
        if (list == null) {
            C119075aP c119075aP = new C119075aP(c57s);
            c57s.A01 = c119075aP;
            return c119075aP;
        }
        return list;
    }

    public final void A0H() {
        this.A0S = this.A0F;
        Integer num = C05F.A0C;
        this.A0F = num;
        C57S A0A = A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass599 = (AnonymousClass599) objArr[i2];
                if (anonymousClass599.A0F != num) {
                    anonymousClass599.A0H();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void A0I() {
        AbstractC113415Ad abstractC113415Ad;
        InterfaceC1128457r interfaceC1128457r = this.A0A;
        String str = null;
        if (interfaceC1128457r == null) {
            AnonymousClass599 A0B = A0B();
            if (A0B != null) {
                str = A0B.A01(0);
            }
            AbstractC28290Cdc.A02(AnonymousClass001.A0R("Cannot detach node that is already detached!  Tree: ", str));
            throw C00O.createAndThrow();
        }
        AnonymousClass599 A0B2 = A0B();
        if (A0B2 != null) {
            A0B2.A0J();
            A0B2.A0L();
            C5AZ c5az = this.A0U;
            C113385Aa c113385Aa = c5az.A0J;
            Integer num = C05F.A0C;
            c113385Aa.A09 = num;
            C121665fI c121665fI = c5az.A05;
            if (c121665fI != null) {
                c121665fI.A05 = num;
            }
        }
        C5AZ c5az2 = this.A0U;
        C113385Aa c113385Aa2 = c5az2.A0J;
        AbstractC113415Ad abstractC113415Ad2 = c113385Aa2.A0O;
        abstractC113415Ad2.A01 = true;
        abstractC113415Ad2.A06 = false;
        abstractC113415Ad2.A02 = false;
        abstractC113415Ad2.A05 = false;
        abstractC113415Ad2.A04 = false;
        abstractC113415Ad2.A03 = false;
        abstractC113415Ad2.A00 = null;
        C121665fI c121665fI2 = c5az2.A05;
        if (c121665fI2 != null && (abstractC113415Ad = c121665fI2.A0I) != null) {
            abstractC113415Ad.A01 = true;
            abstractC113415Ad.A06 = false;
            abstractC113415Ad.A02 = false;
            abstractC113415Ad.A05 = false;
            abstractC113415Ad.A04 = false;
            abstractC113415Ad.A03 = false;
            abstractC113415Ad.A00 = null;
        }
        InterfaceC16660sJ interfaceC16660sJ = this.A0H;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(interfaceC1128457r);
        }
        C59S c59s = this.A0W;
        if ((c59s.A02.A00 & 8) != 0) {
            A0M();
        }
        C58J c58j = c59s.A05;
        while (c58j != null) {
            if (c58j.A08) {
                c58j.A0D();
            }
            c58j = c58j.A04;
        }
        this.A0J = true;
        C57S c57s = this.A0V.A00;
        int i = c57s.A00;
        if (i > 0) {
            Object[] objArr = c57s.A02;
            int i2 = 0;
            do {
                ((AnonymousClass599) objArr[i2]).A0I();
                i2++;
            } while (i2 < i);
        }
        this.A0J = false;
        for (C58J c58j2 = c58j; c58j2 != null; c58j2 = c58j2.A04) {
            if (c58j2.A08) {
                c58j2.A09();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1128457r;
        C113675Bf c113675Bf = androidComposeView.A0a;
        C113685Bg c113685Bg = c113675Bf.A04;
        c113685Bg.A00.A00(this);
        c113685Bg.A01.A00(this);
        c113675Bf.A06.A01.A0B(this);
        androidComposeView.A09 = true;
        this.A0A = null;
        A06(null);
        this.A00 = 0;
        c113385Aa2.A03 = Integer.MAX_VALUE;
        c113385Aa2.A04 = Integer.MAX_VALUE;
        c113385Aa2.A0F = false;
        C121665fI c121665fI3 = c5az2.A05;
        if (c121665fI3 != null) {
            c121665fI3.A00 = Integer.MAX_VALUE;
            c121665fI3.A01 = Integer.MAX_VALUE;
            c121665fI3.A09 = false;
        }
    }

    public final void A0J() {
        if (this.A0K) {
            C59S c59s = this.A0W;
            C59U c59u = c59s.A06;
            C59U c59u2 = c59s.A04.A07;
            this.A09 = null;
            while (true) {
                if (C14360o3.A0K(c59u, c59u2)) {
                    break;
                }
                if (c59u != null) {
                    if (c59u.A08 != null) {
                        this.A09 = c59u;
                        break;
                    }
                    c59u = c59u.A07;
                } else {
                    c59u = null;
                }
            }
        }
        C59U c59u3 = this.A09;
        if (c59u3 != null) {
            if (c59u3.A08 != null) {
                c59u3.A0X();
                return;
            } else {
                AbstractC28290Cdc.A02("layer was not set");
                throw C00O.createAndThrow();
            }
        }
        AnonymousClass599 A0B = A0B();
        if (A0B == null) {
            return;
        }
        A0B.A0J();
    }

    public final void A0K() {
        C59S c59s = this.A0W;
        C59T c59t = c59s.A06;
        for (C59U c59u = c59s.A04; c59u != c59t; c59u = c59u.A06) {
            C14360o3.A0C(c59u, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            InterfaceC119265ai interfaceC119265ai = c59u.A08;
            if (interfaceC119265ai != null) {
                interfaceC119265ai.invalidate();
            }
        }
        InterfaceC119265ai interfaceC119265ai2 = c59t.A08;
        if (interfaceC119265ai2 != null) {
            interfaceC119265ai2.invalidate();
        }
    }

    public final void A0L() {
        if (this.A08 != null) {
            A0Z(false, true, true);
        } else {
            A0a(false, true, true);
        }
    }

    public final void A0N() {
        AnonymousClass599 A0B;
        if (this.A0F == C05F.A0C) {
            A07(this);
        }
        C121665fI c121665fI = this.A0U.A05;
        C14360o3.A0A(c121665fI);
        try {
            c121665fI.A0E = true;
            if (!c121665fI.A0D) {
                AbstractC28290Cdc.A01("replace() called on item that was not placed");
                throw C00O.createAndThrow();
            }
            c121665fI.A0B = false;
            boolean z = c121665fI.A09;
            C121665fI.A02(c121665fI.A03, c121665fI, c121665fI.A07, c121665fI.A02);
            if (z && !c121665fI.A0B && (A0B = c121665fI.A0J.A0I.A0B()) != null) {
                A0B.A0X(false);
            }
        } finally {
            c121665fI.A0E = false;
        }
    }

    public final void A0O() {
        if (this.A0X) {
            AnonymousClass599 A0B = A0B();
            if (A0B != null) {
                A0B.A0O();
                return;
            }
            return;
        }
        this.A0T = true;
    }

    public final void A0P() {
        C59L c59l = this.A0V;
        C57S c57s = c59l.A00;
        int i = c57s.A00;
        while (true) {
            i--;
            if (-1 < i) {
                A05((AnonymousClass599) c57s.A02[i]);
            } else {
                c57s.A01();
                c59l.A01.invoke();
                return;
            }
        }
    }

    public final void A0Q() {
        AnonymousClass599 A0B;
        if (this.A0F == C05F.A0C) {
            A07(this);
        }
        C113385Aa c113385Aa = this.A0U.A0J;
        try {
            c113385Aa.A0M = true;
            if (!c113385Aa.A0L) {
                AbstractC28290Cdc.A01("replace called on unplaced item");
                throw C00O.createAndThrow();
            }
            boolean z = c113385Aa.A0F;
            long j = c113385Aa.A05;
            C113385Aa.A02(c113385Aa.A07, c113385Aa, c113385Aa.A0B, c113385Aa.A00, j);
            if (z && !c113385Aa.A0J && (A0B = c113385Aa.A0S.A0I.A0B()) != null) {
                A0B.A0Y(false);
            }
        } finally {
            c113385Aa.A0M = false;
        }
    }

    public final void A0S() {
        if (this.A0O > 0 && this.A0N) {
            int i = 0;
            this.A0N = false;
            C57S c57s = this.A03;
            if (c57s == null) {
                c57s = new C57S(new AnonymousClass599[16]);
                this.A03 = c57s;
            }
            c57s.A01();
            C57S c57s2 = this.A0V.A00;
            int i2 = c57s2.A00;
            if (i2 > 0) {
                Object[] objArr = c57s2.A02;
                do {
                    AnonymousClass599 anonymousClass599 = (AnonymousClass599) objArr[i];
                    if (anonymousClass599.A0X) {
                        c57s.A06(anonymousClass599.A0A(), c57s.A00);
                    } else {
                        c57s.A09(anonymousClass599);
                    }
                    i++;
                } while (i < i2);
            }
            C5AZ c5az = this.A0U;
            c5az.A0J.A0D = true;
            C121665fI c121665fI = c5az.A05;
            if (c121665fI != null) {
                c121665fI.A08 = true;
            }
        }
    }

    public final void A0U(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i;
                if (i > i2) {
                    i5 = i + i4;
                }
                int i6 = i2 + i4;
                if (i <= i2) {
                    i6 = (i2 + i3) - 2;
                }
                C59L c59l = this.A0V;
                C57S c57s = c59l.A00;
                Object A00 = c57s.A00(i5);
                InterfaceC16820sZ interfaceC16820sZ = c59l.A01;
                interfaceC16820sZ.invoke();
                c57s.A04(i6, A00);
                interfaceC16820sZ.invoke();
            }
            A0O();
            A02();
            A0L();
        }
    }

    public final void A0V(AnonymousClass599 anonymousClass599, int i) {
        StringBuilder sb;
        boolean z = false;
        if (anonymousClass599.A0Q == null) {
            z = true;
        }
        String str = null;
        if (!z) {
            sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(anonymousClass599);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(A01(0));
            sb.append(" Other tree: ");
            AnonymousClass599 anonymousClass5992 = anonymousClass599.A0Q;
            if (anonymousClass5992 != null) {
                str = anonymousClass5992.A01(0);
            }
        } else {
            if (anonymousClass599.A0A == null) {
                anonymousClass599.A0Q = this;
                C59L c59l = this.A0V;
                c59l.A00.A04(i, anonymousClass599);
                c59l.A01.invoke();
                A0O();
                if (anonymousClass599.A0X) {
                    this.A0O++;
                }
                A02();
                InterfaceC1128457r interfaceC1128457r = this.A0A;
                if (interfaceC1128457r != null) {
                    anonymousClass599.A0W(interfaceC1128457r);
                }
                if (anonymousClass599.A0U.A00 > 0) {
                    C5AZ c5az = this.A0U;
                    c5az.A01(c5az.A00 + 1);
                    return;
                }
                return;
            }
            sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(anonymousClass599);
            sb.append(" because it already has an owner. This tree: ");
            sb.append(A01(0));
            sb.append(" Other tree: ");
            str = anonymousClass599.A01(0);
        }
        sb.append(str);
        AbstractC28290Cdc.A01(sb.toString());
        throw C00O.createAndThrow();
    }

    public final void A0W(InterfaceC1128457r interfaceC1128457r) {
        StringBuilder sb;
        String A01;
        C59T c59t;
        int i;
        AnonymousClass599 anonymousClass599;
        InterfaceC1128457r interfaceC1128457r2;
        int i2 = 0;
        if (this.A0A == null) {
            A01 = null;
            AnonymousClass599 anonymousClass5992 = this.A0Q;
            if (anonymousClass5992 != null && !C14360o3.A0K(anonymousClass5992.A0A, interfaceC1128457r)) {
                sb = new StringBuilder();
                sb.append("Attaching to a different owner(");
                sb.append(interfaceC1128457r);
                sb.append(") than the parent's owner(");
                AnonymousClass599 A0B = A0B();
                if (A0B != null) {
                    interfaceC1128457r2 = A0B.A0A;
                } else {
                    interfaceC1128457r2 = null;
                }
                sb.append(interfaceC1128457r2);
                sb.append("). This tree: ");
                sb.append(A01(0));
                sb.append(" Parent tree: ");
                AnonymousClass599 anonymousClass5993 = this.A0Q;
                if (anonymousClass5993 != null) {
                    A01 = anonymousClass5993.A01(0);
                }
            } else {
                AnonymousClass599 A0B2 = A0B();
                if (A0B2 == null) {
                    C5AZ c5az = this.A0U;
                    c5az.A0J.A0F = true;
                    C121665fI c121665fI = c5az.A05;
                    if (c121665fI != null) {
                        c121665fI.A09 = true;
                    }
                }
                C59S c59s = this.A0W;
                C59U c59u = c59s.A04;
                if (A0B2 != null) {
                    c59t = A0B2.A0W.A06;
                } else {
                    c59t = null;
                }
                c59u.A07 = c59t;
                this.A0A = interfaceC1128457r;
                if (A0B2 != null) {
                    i = A0B2.A00;
                } else {
                    i = -1;
                }
                this.A00 = i + 1;
                Modifier modifier = this.A05;
                if (modifier != null) {
                    A04(modifier);
                }
                this.A05 = null;
                if ((c59s.A02.A00 & 8) != 0) {
                    A0M();
                }
                AnonymousClass599 anonymousClass5994 = this.A0Q;
                if (anonymousClass5994 == null || (anonymousClass599 = anonymousClass5994.A08) == null) {
                    anonymousClass599 = this.A08;
                }
                A06(anonymousClass599);
                if (this.A08 == null && (512 & c59s.A02.A00) != 0) {
                    A06(this);
                }
                if (!this.A0L) {
                    for (C58J c58j = c59s.A02; c58j != null; c58j = c58j.A02) {
                        c58j.A08();
                    }
                }
                C57S c57s = this.A0V.A00;
                int i3 = c57s.A00;
                if (i3 > 0) {
                    Object[] objArr = c57s.A02;
                    do {
                        ((AnonymousClass599) objArr[i2]).A0W(interfaceC1128457r);
                        i2++;
                    } while (i2 < i3);
                }
                if (!this.A0L) {
                    c59s.A05();
                }
                A0L();
                if (A0B2 != null) {
                    A0B2.A0L();
                }
                C59U c59u2 = c59s.A06.A06;
                for (C59U c59u3 = c59s.A04; !C14360o3.A0K(c59u3, c59u2) && c59u3 != null; c59u3 = c59u3.A06) {
                    c59u3.A0i(c59u3.A0A, true);
                    InterfaceC119265ai interfaceC119265ai = c59u3.A08;
                    if (interfaceC119265ai != null) {
                        interfaceC119265ai.invalidate();
                    }
                }
                InterfaceC16660sJ interfaceC16660sJ = this.A0G;
                if (interfaceC16660sJ != null) {
                    interfaceC16660sJ.invoke(interfaceC1128457r);
                }
                this.A0U.A00();
                if (!this.A0L) {
                    C58J c58j2 = c59s.A02;
                    if ((7168 & c58j2.A00) == 0) {
                        return;
                    }
                    do {
                        boolean z = true;
                        boolean z2 = false;
                        if ((1024 & c58j2.A01) != 0) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if ((2048 & c58j2.A01) != 0) {
                            z3 = true;
                        }
                        boolean z4 = z2 | z3;
                        if ((4096 & c58j2.A01) == 0) {
                            z = false;
                        }
                        if (z4 | z) {
                            AbstractC114275Dr.A03(c58j2);
                        }
                        c58j2 = c58j2.A02;
                    } while (c58j2 != null);
                    return;
                }
                return;
            }
        } else {
            sb = new StringBuilder();
            sb.append("Cannot attach ");
            sb.append(this);
            sb.append(" as it already is attached.  Tree: ");
            A01 = A01(0);
        }
        sb.append(A01);
        AbstractC28290Cdc.A01(sb.toString());
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r1.A0E != true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        if (r1.A0H != true) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0X
            if (r0 != 0) goto L34
            X.57r r4 = r9.A0A
            if (r4 == 0) goto L34
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r3 = 0
            X.5Bf r5 = r4.A0a
            X.5AZ r8 = r9.A0U
            java.lang.Integer r0 = r8.A06
            int r1 = r0.intValue()
            r6 = 1
            r2 = 0
            if (r1 == r6) goto L34
            if (r1 == r2) goto L2a
            r0 = 3
            if (r1 == r0) goto L34
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 4
            if (r1 == r0) goto L2a
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L2a:
            boolean r0 = r8.A0G
            if (r0 != 0) goto L32
            boolean r0 = r8.A0E
            if (r0 == 0) goto L35
        L32:
            if (r10 != 0) goto L35
        L34:
            return
        L35:
            r8.A0E = r6
            r8.A0F = r6
            r8.A0A = r6
            r8.A0B = r6
            boolean r0 = r9.A0L
            if (r0 != 0) goto L34
            X.599 r7 = r9.A0B()
            java.lang.Boolean r1 = r9.A0D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5f
            if (r7 == 0) goto L7f
            X.5AZ r1 = r7.A0U
            boolean r0 = r1.A0G
            if (r0 == r6) goto L5f
            boolean r0 = r1.A0E
            if (r0 != r6) goto L7f
        L5f:
            X.5Aa r0 = r8.A0J
            boolean r0 = r0.A0F
            if (r0 == 0) goto L71
            if (r7 == 0) goto L79
            X.5AZ r1 = r7.A0U
            boolean r0 = r1.A0A
            if (r0 == r6) goto L71
            boolean r0 = r1.A0H
            if (r0 != r6) goto L79
        L71:
            boolean r0 = r5.A01
            if (r0 != 0) goto L34
            androidx.compose.ui.platform.AndroidComposeView.A0A(r3, r4)
            return
        L79:
            X.5Bg r0 = r5.A04
            r0.A00(r9, r2)
            goto L71
        L7f:
            X.5Bg r0 = r5.A04
            r0.A00(r9, r6)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass599.A0X(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r1.A0H != true) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0X
            if (r0 != 0) goto L36
            X.57r r4 = r8.A0A
            if (r4 == 0) goto L36
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r3 = 0
            X.5Bf r5 = r4.A0a
            X.5AZ r7 = r8.A0U
            java.lang.Integer r0 = r7.A06
            int r1 = r0.intValue()
            r6 = 1
            r2 = 0
            if (r1 == r6) goto L36
            if (r1 == r2) goto L36
            r0 = 3
            if (r1 == r0) goto L36
            r0 = 2
            if (r1 == r0) goto L36
            r0 = 4
            if (r1 != r0) goto L63
            if (r9 != 0) goto L37
            X.5Aa r0 = r7.A0J
            boolean r1 = r0.A0F
            boolean r0 = r0.A0G
            if (r1 != r0) goto L37
            boolean r0 = r7.A0H
            if (r0 != 0) goto L36
            boolean r0 = r7.A0A
            if (r0 == 0) goto L37
        L36:
            return
        L37:
            r7.A0A = r6
            r7.A0B = r6
            boolean r0 = r8.A0L
            if (r0 != 0) goto L36
            X.5Aa r0 = r7.A0J
            boolean r0 = r0.A0G
            if (r0 == 0) goto L36
            X.599 r0 = r8.A0B()
            if (r0 == 0) goto L5d
            X.5AZ r1 = r0.A0U
            boolean r0 = r1.A0A
            if (r0 == r6) goto L55
            boolean r0 = r1.A0H
            if (r0 != r6) goto L5d
        L55:
            boolean r0 = r5.A01
            if (r0 != 0) goto L36
            androidx.compose.ui.platform.AndroidComposeView.A0A(r3, r4)
            return
        L5d:
            X.5Bg r0 = r5.A04
            r0.A00(r8, r2)
            goto L55
        L63:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass599.A0Y(boolean):void");
    }

    public final void A0Z(boolean z, boolean z2, boolean z3) {
        AnonymousClass599 anonymousClass599;
        AnonymousClass599 A0B;
        AnonymousClass599 A0B2;
        if (this.A08 != null) {
            InterfaceC1128457r interfaceC1128457r = this.A0A;
            if (interfaceC1128457r != null && !this.A0J && !this.A0X) {
                AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1128457r;
                C113675Bf c113675Bf = androidComposeView.A0a;
                C5AZ c5az = this.A0U;
                int intValue = c5az.A06.intValue();
                if (intValue != 1) {
                    if (intValue != 0 && intValue != 3 && intValue != 2) {
                        if (intValue == 4) {
                            if (!c5az.A0G || z) {
                                c5az.A0G = true;
                                c5az.A0H = true;
                                if (!this.A0L) {
                                    if ((!C14360o3.A0K(A0D(), true) && (!c5az.A0G || !C113675Bf.A07(this))) || ((A0B = A0B()) != null && A0B.A0U.A0G)) {
                                        if ((c5az.A0J.A0F || (c5az.A0H && C113675Bf.A06(this))) && ((A0B2 = A0B()) == null || !A0B2.A0U.A0H)) {
                                            c113675Bf.A04.A00(this, false);
                                        }
                                    } else {
                                        c113675Bf.A04.A00(this, true);
                                    }
                                    if (!c113675Bf.A01 && z2) {
                                        AndroidComposeView.A0A(this, androidComposeView);
                                    }
                                }
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        c113675Bf.A03.A09(new C113745Bm(this, true, z));
                    }
                }
                if (z3) {
                    C121665fI c121665fI = c5az.A05;
                    C14360o3.A0A(c121665fI);
                    AnonymousClass599 anonymousClass5992 = c121665fI.A0J.A0I;
                    AnonymousClass599 A0B3 = anonymousClass5992.A0B();
                    Integer num = anonymousClass5992.A0F;
                    if (A0B3 == null || num == C05F.A0C) {
                        return;
                    }
                    do {
                        anonymousClass599 = A0B3;
                        if (A0B3.A0F != num) {
                            break;
                        } else {
                            A0B3 = A0B3.A0B();
                        }
                    } while (A0B3 != null);
                    int intValue2 = num.intValue();
                    if (intValue2 != 0) {
                        if (intValue2 == 1) {
                            if (anonymousClass599.A08 != null) {
                                anonymousClass599.A0X(z);
                                return;
                            } else {
                                anonymousClass599.A0Y(z);
                                return;
                            }
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    }
                    if (anonymousClass599.A08 != null) {
                        anonymousClass599.A0Z(z, true, true);
                        return;
                    } else {
                        anonymousClass599.A0a(z, true, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        AbstractC28290Cdc.A01("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        throw C00O.createAndThrow();
    }

    public final void A0a(boolean z, boolean z2, boolean z3) {
        InterfaceC1128457r interfaceC1128457r;
        AnonymousClass599 anonymousClass599;
        if (!this.A0J && !this.A0X && (interfaceC1128457r = this.A0A) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1128457r;
            if (androidComposeView.A0a.A0C(this, z) && z2) {
                AndroidComposeView.A0A(this, androidComposeView);
            }
            if (z3) {
                AnonymousClass599 anonymousClass5992 = this.A0U.A0J.A0S.A0I;
                AnonymousClass599 A0B = anonymousClass5992.A0B();
                Integer num = anonymousClass5992.A0F;
                if (A0B == null || num == C05F.A0C) {
                    return;
                }
                do {
                    anonymousClass599 = A0B;
                    if (A0B.A0F != num) {
                        break;
                    } else {
                        A0B = A0B.A0B();
                    }
                } while (A0B != null);
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        anonymousClass599.A0Y(z);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                anonymousClass599.A0a(z, true, true);
            }
        }
    }

    @Override // X.C59A
    public final void AWW() {
        boolean z;
        if (this.A08 != null) {
            z = true;
            A0Z(false, false, true);
        } else {
            z = true;
            A0a(false, false, true);
        }
        C113385Aa c113385Aa = this.A0U.A0J;
        if (c113385Aa.A0I) {
            long j = ((C59W) c113385Aa).A04;
            InterfaceC1128457r interfaceC1128457r = this.A0A;
            if (interfaceC1128457r != null) {
                interfaceC1128457r.CpH(this, j);
                return;
            }
            return;
        }
        InterfaceC1128457r interfaceC1128457r2 = this.A0A;
        if (interfaceC1128457r2 == null) {
            return;
        }
        interfaceC1128457r2.CpG(z);
    }

    @Override // X.C59D
    public final boolean CfU() {
        if (this.A0A == null) {
            return false;
        }
        return true;
    }

    @Override // X.C59C
    public final void D9L() {
        BT9 bt9 = this.A0E;
        if (bt9 != null) {
            bt9.D9L();
        }
        C6NM c6nm = this.A06;
        if (c6nm != null) {
            C6NM.A03(c6nm, true);
        }
        this.A0L = true;
        A03();
        if (this.A0A != null) {
            A0M();
        }
    }

    @Override // X.C59C
    public final void DeW() {
        BT9 bt9 = this.A0E;
        if (bt9 != null) {
            bt9.DeW();
        }
        C6NM c6nm = this.A06;
        if (c6nm != null) {
            c6nm.DeW();
        }
        C59S c59s = this.A0W;
        C59U c59u = c59s.A06.A06;
        for (C59U c59u2 = c59s.A04; !C14360o3.A0K(c59u2, c59u) && c59u2 != null; c59u2 = c59u2.A06) {
            c59u2.A0D = true;
            c59u2.A0I.invoke();
            c59u2.A0b();
        }
    }

    @Override // X.C59C
    public final void DhJ() {
        if (this.A0A != null) {
            BT9 bt9 = this.A0E;
            if (bt9 != null) {
                bt9.DhJ();
            }
            C6NM c6nm = this.A06;
            if (c6nm != null) {
                C6NM.A03(c6nm, false);
            }
            if (this.A0L) {
                this.A0L = false;
                A0M();
            } else {
                A03();
            }
            this.A01 = AnonymousClass598.A00.addAndGet(1);
            C59S c59s = this.A0W;
            for (C58J c58j = c59s.A02; c58j != null; c58j = c58j.A02) {
                c58j.A08();
            }
            c59s.A05();
            A08(this);
            return;
        }
        AbstractC28290Cdc.A00("onReuse is only expected on attached node");
        throw C00O.createAndThrow();
    }

    @Override // X.C59B
    public final void ETE(InterfaceC1128957x interfaceC1128957x) {
        if (!C14360o3.A0K(this.A0C, interfaceC1128957x)) {
            this.A0C = interfaceC1128957x;
            A0L();
            AnonymousClass599 A0B = A0B();
            if (A0B != null) {
                A0B.A0J();
            }
            A0K();
            for (C58J c58j = this.A0W.A02; c58j != null; c58j = c58j.A02) {
                if ((c58j.A01 & 16) != 0) {
                    ((C5DX) c58j).E0S();
                } else if (c58j instanceof InterfaceC113435Af) {
                    ((InterfaceC113435Af) c58j).COw();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.58J] */
    @Override // X.C59B
    public final void EY4(AnonymousClass583 anonymousClass583) {
        if (this.A0D != anonymousClass583) {
            this.A0D = anonymousClass583;
            A0L();
            AnonymousClass599 A0B = A0B();
            if (A0B != null) {
                A0B.A0J();
            }
            A0K();
            C58J c58j = this.A0W.A02;
            if ((c58j.A00 & 4) == 0) {
                return;
            }
            do {
                if ((c58j.A01 & 4) != 0) {
                    C5AY c5ay = c58j;
                    ?? r0 = 0;
                    do {
                        if (c5ay instanceof InterfaceC113445Ag) {
                            InterfaceC113445Ag interfaceC113445Ag = (InterfaceC113445Ag) c5ay;
                            if (interfaceC113445Ag instanceof InterfaceC113435Af) {
                                ((InterfaceC113435Af) interfaceC113445Ag).COw();
                            }
                        } else if ((c5ay.A01 & 4) != 0 && (c5ay instanceof C5AY)) {
                            C58J c58j2 = c5ay.A00;
                            int i = 0;
                            r0 = r0;
                            c5ay = c5ay;
                            while (c58j2 != null) {
                                if ((c58j2.A01 & 4) != 0) {
                                    i++;
                                    r0 = r0;
                                    if (i == 1) {
                                        c5ay = c58j2;
                                    } else {
                                        if (r0 == 0) {
                                            r0 = new C57S(new C58J[16]);
                                        }
                                        if (c5ay != 0) {
                                            r0.A09(c5ay);
                                            c5ay = 0;
                                        }
                                        r0.A09(c58j2);
                                    }
                                }
                                c58j2 = c58j2.A02;
                                r0 = r0;
                                c5ay = c5ay;
                            }
                            if (i == 1) {
                            }
                        }
                        c5ay = AbstractC114335Dx.A00(r0);
                    } while (c5ay != 0);
                }
                if ((c58j.A00 & 4) != 0) {
                    c58j = c58j.A02;
                } else {
                    return;
                }
            } while (c58j != null);
        }
    }

    @Override // X.C59B
    public final void EYi(InterfaceC1127857k interfaceC1127857k) {
        if (!C14360o3.A0K(this.A07, interfaceC1127857k)) {
            this.A07 = interfaceC1127857k;
            C25283BGz c25283BGz = this.A0P;
            if (c25283BGz != null) {
                c25283BGz.A00.Egh(interfaceC1127857k);
            }
            A0L();
        }
    }

    @Override // X.C59B
    public final void EZG(Modifier modifier) {
        String str;
        if (this.A0X && this.A04 != Modifier.A00) {
            str = "Modifiers are not supported on virtual LayoutNodes";
        } else if (!(!this.A0L)) {
            str = "modifier is updated when deactivated";
        } else if (this.A0A != null) {
            A04(modifier);
            return;
        } else {
            this.A05 = modifier;
            return;
        }
        AbstractC28290Cdc.A00(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.58J] */
    @Override // X.C59B
    public final void Eh2(C59J c59j) {
        if (!C14360o3.A0K(this.A0B, c59j)) {
            this.A0B = c59j;
            C58J c58j = this.A0W.A02;
            if ((c58j.A00 & 16) == 0) {
                return;
            }
            do {
                if ((c58j.A01 & 16) != 0) {
                    C5AY c5ay = c58j;
                    ?? r6 = 0;
                    do {
                        if (c5ay instanceof C5DX) {
                            ((C5DX) c5ay).E0S();
                        } else if ((c5ay.A01 & 16) != 0 && (c5ay instanceof C5AY)) {
                            C58J c58j2 = c5ay.A00;
                            int i = 0;
                            r6 = r6;
                            c5ay = c5ay;
                            while (c58j2 != null) {
                                if ((c58j2.A01 & 16) != 0) {
                                    i++;
                                    r6 = r6;
                                    if (i == 1) {
                                        c5ay = c58j2;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new C57S(new C58J[16]);
                                        }
                                        if (c5ay != 0) {
                                            r6.A09(c5ay);
                                            c5ay = 0;
                                        }
                                        r6.A09(c58j2);
                                    }
                                }
                                c58j2 = c58j2.A02;
                                r6 = r6;
                                c5ay = c5ay;
                            }
                            if (i == 1) {
                            }
                        }
                        c5ay = AbstractC114335Dx.A00(r6);
                    } while (c5ay != 0);
                }
                if ((c58j.A00 & 16) != 0) {
                    c58j = c58j.A02;
                } else {
                    return;
                }
            } while (c58j != null);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC61621Rql.A00(this));
        sb.append(" children: ");
        C57S A0A = A0A();
        List list = A0A.A01;
        if (list == null) {
            list = new C119075aP(A0A);
            A0A.A01 = list;
        }
        sb.append(list.size());
        sb.append(" measurePolicy: ");
        sb.append(this.A07);
        return sb.toString();
    }

    public AnonymousClass599(boolean z, int i) {
        this.A0X = z;
        this.A01 = i;
        this.A0V = new C59L(new C57S(new AnonymousClass599[16]), new C9EV(this, 25));
        this.A0Y = new C57S(new AnonymousClass599[16]);
        this.A0T = true;
        this.A07 = A0b;
        this.A0C = C59M.A00;
        this.A0D = AnonymousClass583.Ltr;
        this.A0B = A0c;
        this.A02 = C59N.A00;
        Integer num = C05F.A0C;
        this.A0F = num;
        this.A0S = num;
        this.A0W = new C59S(this);
        this.A0U = new C5AZ(this);
        this.A0K = true;
        this.A04 = Modifier.A00;
    }

    public final C57S A0A() {
        A0S();
        if (this.A0O == 0) {
            return this.A0V.A00;
        }
        C57S c57s = this.A03;
        C14360o3.A0A(c57s);
        return c57s;
    }

    public final List A0F() {
        C57S A0A = A0A();
        List list = A0A.A01;
        if (list == null) {
            C119075aP c119075aP = new C119075aP(A0A);
            A0A.A01 = c119075aP;
            return c119075aP;
        }
        return list;
    }

    public final void A0R() {
        C57S A0A = A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass599 = (AnonymousClass599) objArr[i2];
                Integer num = anonymousClass599.A0S;
                anonymousClass599.A0F = num;
                if (num != C05F.A0C) {
                    anonymousClass599.A0R();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public AnonymousClass599() {
        this(false, AnonymousClass598.A00.addAndGet(1));
    }
}
