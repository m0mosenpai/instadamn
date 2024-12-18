package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.Map;

/* renamed from: X.59V, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C59V extends C59W implements C59Y, InterfaceC1131359b {
    public static final InterfaceC16660sJ A06 = C1131759f.A00;
    public C18640vr A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public C18640vr A04;
    public final C5AW A05 = new C5AV(this);

    @Override // X.C59X
    public final int AX8(AbstractC122975hY abstractC122975hY) {
        InterfaceC119205ac interfaceC119205ac;
        int A0L;
        if (this instanceof C59U) {
            interfaceC119205ac = ((C59U) this).A04;
        } else {
            interfaceC119205ac = ((AbstractC137606Lg) this).A01;
        }
        boolean z = false;
        if (interfaceC119205ac != null) {
            z = true;
        }
        if (!z || (A0L = A0L(abstractC122975hY)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return ((int) (super.A02 & 4294967295L)) + A0L;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.C57y
    public final /* synthetic */ float EqG(long j) {
        return AbstractC122655h0.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqI(int i) {
        return i / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long EqJ(long j) {
        return AbstractC119105aS.A03(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqS(long j) {
        return AbstractC119105aS.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7k(long j) {
        return AbstractC119105aS.A04(this, j);
    }

    @Override // X.C57y
    public final /* synthetic */ long F7l(float f) {
        return AbstractC122655h0.A01(this, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        if (((r22 & ((r22 ^ (-1)) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r18 = X.C18640vr.A00(r7, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (r7.A00 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        r5 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010c, code lost:
    
        if (((r5[r18 >> 3] >> ((r18 & 7) << 3)) & 255) == 254) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        r4 = ((X.AbstractC003901e) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        if (r4 <= 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
    
        if (((r7.A01 * 32) ^ Long.MIN_VALUE) > ((r4 * 25) ^ Long.MIN_VALUE)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        r11 = r7.A04;
        r3 = r7.A02;
        X.AbstractC004701m.A01(r5, r4);
        r2 = 0;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        r37 = r2 >> 3;
        r36 = (r2 & 7) << 3;
        r16 = (r5[r37] >> r36) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        if (r16 != 128) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
    
        r13 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0146, code lost:
    
        if (r2 != r4) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        X.C18640vr.A01(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
    
        r18 = X.C18640vr.A00(r7, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
    
        if (r16 != 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019f, code lost:
    
        r0 = r11[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a1, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a3, code lost:
    
        r35 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a7, code lost:
    
        r35 = r35 * (-862048943);
        r35 = r35 ^ (r35 << 16);
        r0 = r35 >>> 7;
        r26 = X.C18640vr.A00(r7, r0);
        r0 = r0 & r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c5, code lost:
    
        if ((((r26 - r0) & r4) / 8) != (((r2 - r0) & r4) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c7, code lost:
    
        r5[r37] = ((r35 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r36) | (((255 << r36) ^ (-1)) & r5[r37]);
        r5[r5.length - 1] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ea, code lost:
    
        r21 = r26 >> 3;
        r19 = r5[r21];
        r18 = (r26 & 7) << 3;
        r16 = (r19 >> r18) & 255;
        r0 = r35 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fa, code lost:
    
        if (r16 != 128) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fc, code lost:
    
        r5[r21] = (r19 & ((255 << r18) ^ (-1))) | (r0 << r18);
        r5[r37] = (r5[r37] & ((255 << r36) ^ (-1))) | (128 << r36);
        r11[r26] = r11[r2];
        r11[r2] = null;
        r3[r26] = r3[r2];
        r3[r2] = 0.0f;
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0226, code lost:
    
        r5[r5.length - 1] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0235, code lost:
    
        r5[r21] = (r0 << r18) | (r19 & ((255 << r18) ^ (-1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0243, code lost:
    
        if (r13 != (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0245, code lost:
    
        r13 = X.AbstractC004701m.A00(r5, r2 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024b, code lost:
    
        r11[r13] = r11[r26];
        r11[r26] = r11[r2];
        r11[r2] = r11[r13];
        r3[r13] = r3[r26];
        r3[r26] = r3[r2];
        r3[r2] = r3[r13];
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e7, code lost:
    
        r35 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e3, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0266, code lost:
    
        r0 = X.AbstractC004701m.A00;
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0269, code lost:
    
        if (r4 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026b, code lost:
    
        r1 = (r4 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026f, code lost:
    
        r0 = r7.A04;
        r0 = r7.A02;
        X.C18640vr.A02(r7, r1);
        r11 = r7.A03;
        r0 = r7.A04;
        r13 = r7.A02;
        r3 = ((X.AbstractC003901e) r7).A00;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0285, code lost:
    
        if (r2 >= r4) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0295, code lost:
    
        if (((r5[r2 >> 3] >> ((r2 & 7) << 3)) & 255) >= 128) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0297, code lost:
    
        r23 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0299, code lost:
    
        if (r23 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x029b, code lost:
    
        r1 = r23.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x029f, code lost:
    
        r1 = r1 * (-862048943);
        r22 = X.C18640vr.A00(r7, (r1 ^ (r1 << 16)) >>> 7);
        r21 = r22 >> 3;
        r20 = (r22 & 7) << 3;
        r0 = ((r1 & com.facebook.common.dextricks.StringTreeSet.MAX_SYMBOL_COUNT) << r20) | (r11[r21] & ((255 << r20) ^ (-1)));
        r11[r21] = r0;
        r11[(((r22 - 7) & r3) + (r3 & 7)) >> 3] = r0;
        r0[r22] = r23;
        r13[r22] = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d3, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d6, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0151, code lost:
    
        r7.A01++;
        r1 = r7.A00;
        r0 = r7.A03;
        r13 = r18 >> 3;
        r16 = r0[r13];
        r11 = (r18 & 7) << 3;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016a, code lost:
    
        if (((r16 >> r11) & 255) != 128) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016c, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016d, code lost:
    
        r7.A00 = r1 - r2;
        r1 = ((X.AbstractC003901e) r7).A00;
        r33 = (((255 << r11) ^ (-1)) & r16) | (r9 << r11);
        r0[r13] = r33;
        r0[(((r18 - 7) & r1) + (r1 & 7)) >> 3] = r33;
        r2 = r18 ^ (-1);
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.01e, X.0vr] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.01e, X.0vr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(X.C59V r49, X.C119245ag r50) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59V.A0C(X.59V, X.5ag):void");
    }

    public static final void A0D(C59U c59u) {
        AnonymousClass599 anonymousClass599;
        AbstractC113415Ad Aav;
        C59U c59u2 = c59u.A06;
        if (c59u2 != null) {
            anonymousClass599 = c59u2.A0H;
        } else {
            anonymousClass599 = null;
        }
        AnonymousClass599 anonymousClass5992 = c59u.A0H;
        boolean A0K = C14360o3.A0K(anonymousClass599, anonymousClass5992);
        C113385Aa c113385Aa = anonymousClass5992.A0U.A0J;
        if (!A0K) {
            Aav = c113385Aa.A0O;
        } else {
            InterfaceC113395Ab BbG = c113385Aa.BbG();
            if (BbG == null || (Aav = BbG.Aav()) == null) {
                return;
            }
        }
        Aav.A04();
    }

    public int A0L(AbstractC122975hY abstractC122975hY) {
        Map map;
        if (this instanceof C118815Zd) {
            C118815Zd c118815Zd = (C118815Zd) this;
            AbstractC137606Lg abstractC137606Lg = c118815Zd.A02;
            if (abstractC137606Lg != null) {
                map = abstractC137606Lg.A05;
            } else {
                return CBP.A00(abstractC122975hY, c118815Zd);
            }
        } else {
            C59T c59t = (C59T) this;
            AbstractC137606Lg abstractC137606Lg2 = c59t.A00;
            if (abstractC137606Lg2 != null) {
                return abstractC137606Lg2.A0L(abstractC122975hY);
            }
            C113385Aa c113385Aa = c59t.A0H.A0U.A0J;
            if (!c113385Aa.A0E) {
                C5AZ c5az = c113385Aa.A0S;
                Integer num = c5az.A06;
                Integer num2 = C05F.A00;
                AbstractC113415Ad abstractC113415Ad = c113385Aa.A0O;
                if (num == num2) {
                    abstractC113415Ad.A04 = true;
                    if (abstractC113415Ad.A01) {
                        c5az.A0A = true;
                        c5az.A0B = true;
                    }
                } else {
                    abstractC113415Ad.A03 = true;
                }
            }
            C59T BHu = c113385Aa.BHu();
            ((C59V) BHu).A02 = true;
            c113385Aa.Ch0();
            ((C59V) BHu).A02 = false;
            map = c113385Aa.A0O.A08;
        }
        Number number = (Number) map.get(abstractC122975hY);
        if (number != null) {
            return number.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final long A0M() {
        if (this instanceof C59U) {
            return ((C59U) this).A01;
        }
        return ((AbstractC137606Lg) this).A00;
    }

    public final InterfaceC119205ac A0N() {
        InterfaceC119205ac interfaceC119205ac;
        if (this instanceof C59U) {
            interfaceC119205ac = ((C59U) this).A04;
            if (interfaceC119205ac == null) {
                throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
            }
        } else {
            interfaceC119205ac = ((AbstractC137606Lg) this).A01;
            if (interfaceC119205ac == null) {
                throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
            }
        }
        return interfaceC119205ac;
    }

    public final void A0O() {
        if (this instanceof C59U) {
            C59U c59u = (C59U) this;
            GraphicsLayer graphicsLayer = c59u.A03;
            if (graphicsLayer != null) {
                c59u.A0J(graphicsLayer, c59u.A00, c59u.A01);
                return;
            } else {
                long j = c59u.A01;
                c59u.A0K(c59u.A0A, c59u.A00, j);
                return;
            }
        }
        AbstractC137606Lg abstractC137606Lg = (AbstractC137606Lg) this;
        abstractC137606Lg.A0K(null, 0.0f, abstractC137606Lg.A00);
    }

    @Override // X.C59Y
    public final AnonymousClass599 BMY() {
        C59U c59u;
        if (this instanceof C59U) {
            c59u = (C59U) this;
        } else {
            c59u = ((AbstractC137606Lg) this).A04;
        }
        return c59u.A0H;
    }

    @Override // X.InterfaceC1131259a
    public final boolean CXp() {
        if (this instanceof AbstractC137606Lg) {
            return true;
        }
        return false;
    }

    @Override // X.C59Z
    public final /* synthetic */ InterfaceC119205ac Cgx(final Map map, final InterfaceC16660sJ interfaceC16660sJ, final int i, final int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new InterfaceC119205ac(this) { // from class: X.5ab
                public final /* synthetic */ C59V A02;

                {
                    this.A02 = this;
                }

                @Override // X.InterfaceC119205ac
                public final Map Aaw() {
                    return map;
                }

                @Override // X.InterfaceC119205ac
                public final InterfaceC16660sJ Bpq() {
                    return null;
                }

                @Override // X.InterfaceC119205ac
                public final void E4Q() {
                    interfaceC16660sJ.invoke(this.A02.A05);
                }

                @Override // X.InterfaceC119205ac
                public final int getHeight() {
                    return i2;
                }

                @Override // X.InterfaceC119205ac
                public final int getWidth() {
                    return i;
                }
            };
        }
        AbstractC28290Cdc.A01(AnonymousClass001.A0n("Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215.", i, i2));
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }

    @Override // X.InterfaceC1131359b
    public final void Eat(boolean z) {
        this.A01 = z;
    }
}
