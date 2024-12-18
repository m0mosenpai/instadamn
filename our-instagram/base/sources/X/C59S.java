package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashSet;

/* renamed from: X.59S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59S {
    public C57S A00;
    public C57S A01;
    public C58J A02;
    public BI6 A03;
    public C59U A04;
    public final C58J A05;
    public final C59T A06;
    public final AnonymousClass599 A07;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.58J, X.5DU] */
    public static final C58J A00(C58O c58o, C58J c58j) {
        C58J c58j2;
        if (c58o instanceof C58N) {
            C58J A00 = ((C58N) c58o).A00();
            A00.A01 = AbstractC114275Dr.A02(A00);
            c58j2 = A00;
        } else {
            ?? c58j3 = new C58J();
            c58j3.A01 = AbstractC114275Dr.A00(c58o);
            c58j3.A00 = c58o;
            c58j3.A02 = new HashSet();
            c58j2 = c58j3;
        }
        if (!(!c58j2.A08)) {
            AbstractC28290Cdc.A01("A ModifierNodeElement cannot return an already attached node from create() ");
            throw C00O.createAndThrow();
        }
        c58j2.A07 = true;
        C58J c58j4 = c58j.A02;
        if (c58j4 != null) {
            c58j4.A04 = c58j2;
            c58j2.A02 = c58j4;
        }
        c58j.A02 = c58j2;
        c58j2.A04 = c58j;
        return c58j2;
    }

    public static final C58J A01(C58J c58j) {
        if (c58j.A08) {
            AbstractC114275Dr.A05(c58j, -1, 2);
            c58j.A0D();
            c58j.A09();
        }
        C58J c58j2 = c58j.A02;
        C58J c58j3 = c58j.A04;
        if (c58j2 != null) {
            c58j2.A04 = c58j3;
            c58j.A02 = null;
        }
        if (c58j3 != null) {
            c58j3.A02 = c58j2;
            c58j.A04 = null;
        }
        C14360o3.A0A(c58j3);
        return c58j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0168, code lost:
    
        if (r15 > r4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x016d, code lost:
    
        if (r10[r15 + r11] < r2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016f, code lost:
    
        r6[0] = r2;
        r6[1] = r1;
        r6[2] = r3;
        r6[3] = r16;
        r6[4] = 1;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ba, code lost:
    
        r14 = r14 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0145, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0134, code lost:
    
        r3 = r8[(r14 + 1) + r11];
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c7, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        if (r2 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if ((r19 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011a, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011c, code lost:
    
        r0 = -r4;
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0120, code lost:
    
        if (r14 > r4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (r14 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        if (r14 == r4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0132, code lost:
    
        if (r8[(r14 + 1) + r11] >= r8[(r14 - 1) + r11]) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
    
        r3 = r8[(r14 - 1) + r11];
        r2 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
    
        r1 = r25 - ((r23 - r2) - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013f, code lost:
    
        if (r4 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0141, code lost:
    
        r16 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r2 == r3) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        if (r2 <= r12) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014b, code lost:
    
        if (r1 <= r24) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
    
        if (r5.A00(r2 - 1, r1 - 1) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0157, code lost:
    
        r2 = r2 - 1;
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015c, code lost:
    
        r8[r14 + r11] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0160, code lost:
    
        if (r17 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0162, code lost:
    
        r15 = r19 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0166, code lost:
    
        if (r15 < r0) goto L156;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.Pw7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.Pw7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C57S r27, X.C57S r28, X.C58J r29, X.C59S r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59S.A02(X.57S, X.57S, X.58J, X.59S, int, boolean):void");
    }

    public static final void A03(C58O c58o, C58O c58o2, C58J c58j) {
        if ((c58o instanceof C58N) && (c58o2 instanceof C58N)) {
            C114265Dp c114265Dp = AbstractC114255Do.A00;
            C14360o3.A0C(c58j, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((C58N) c58o2).A01(c58j);
        } else if (c58j instanceof C5DU) {
            C5DU c5du = (C5DU) c58j;
            if (c5du.A08) {
                C5DU.A00(c5du);
            }
            c5du.A00 = c58o2;
            ((C58J) c5du).A01 = AbstractC114275Dr.A00(c58o2);
            if (c5du.A08) {
                C5DU.A01(c5du, false);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        if (c58j.A08) {
            AbstractC114275Dr.A04(c58j);
        } else {
            c58j.A09 = true;
        }
    }

    public static final void A04(C58J c58j, C59S c59s, C59U c59u) {
        C59T c59t;
        while (true) {
            c58j = c58j.A04;
            if (c58j != null) {
                if (c58j == AbstractC114255Do.A00) {
                    AnonymousClass599 A0B = c59s.A07.A0B();
                    if (A0B != null) {
                        c59t = A0B.A0W.A06;
                    } else {
                        c59t = null;
                    }
                    c59u.A07 = c59t;
                    c59s.A04 = c59u;
                    return;
                }
                if ((c58j.A01 & 2) != 0) {
                    return;
                } else {
                    c58j.A07(c59u);
                }
            } else {
                return;
            }
        }
    }

    public final void A05() {
        for (C58J c58j = this.A02; c58j != null; c58j = c58j.A02) {
            c58j.A0C();
            if (c58j.A07) {
                AbstractC114275Dr.A03(c58j);
            }
            if (c58j.A09) {
                AbstractC114275Dr.A04(c58j);
            }
            c58j.A07 = false;
            c58j.A09 = false;
        }
    }

    public final void A06() {
        C59T c59t;
        C59U c59u;
        C59U c59u2 = this.A06;
        C58J c58j = this.A05;
        while (true) {
            c58j = c58j.A04;
            if (c58j == null) {
                break;
            }
            C5DW A01 = AbstractC114335Dx.A01(c58j);
            if (A01 != null) {
                C59U c59u3 = c58j.A05;
                if (c59u3 != null) {
                    C118815Zd c118815Zd = (C118815Zd) c59u3;
                    C5DW c5dw = c118815Zd.A01;
                    c118815Zd.A0k(A01);
                    c59u = c118815Zd;
                    if (c5dw != c58j) {
                        InterfaceC119265ai interfaceC119265ai = c118815Zd.A08;
                        c59u = c118815Zd;
                        if (interfaceC119265ai != null) {
                            interfaceC119265ai.invalidate();
                            c59u = c118815Zd;
                        }
                    }
                } else {
                    C59U c118815Zd2 = new C118815Zd(A01, this.A07);
                    c58j.A07(c118815Zd2);
                    c59u = c118815Zd2;
                }
                c59u2.A07 = c59u;
                c59u.A06 = c59u2;
                c59u2 = c59u;
            } else {
                c58j.A07(c59u2);
            }
        }
        AnonymousClass599 A0B = this.A07.A0B();
        if (A0B != null) {
            c59t = A0B.A0W.A06;
        } else {
            c59t = null;
        }
        c59u2.A07 = c59t;
        this.A04 = c59u2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        C58J c58j = this.A02;
        C58J c58j2 = this.A05;
        if (c58j != c58j2) {
            while (c58j != null && c58j != c58j2) {
                sb.append(String.valueOf(c58j));
                if (c58j.A02 != c58j2) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    c58j = c58j.A02;
                }
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            return obj;
        }
        sb.append("]");
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public C59S(AnonymousClass599 anonymousClass599) {
        this.A07 = anonymousClass599;
        C59T c59t = new C59T(anonymousClass599);
        this.A06 = c59t;
        this.A04 = c59t;
        C5AX c5ax = c59t.A01;
        this.A05 = c5ax;
        this.A02 = c5ax;
    }
}
