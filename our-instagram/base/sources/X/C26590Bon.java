package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.Bon, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26590Bon extends AbstractC51572Yf {
    public static final OvershootInterpolator A0h = new OvershootInterpolator(1.2f);
    public final View.OnClickListener A00;
    public final View.OnClickListener A01;
    public final C120985dq A02;
    public final C75113Zb A03;
    public final BVO A04;
    public final Boolean A05;
    public final String A06;
    public final C09530e4 A07;
    public final InterfaceC16820sZ A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final C51722Yv A0R;
    public final AbstractC51432Xq A0S;
    public final InterfaceC11380iw A0T;
    public final InterfaceC30875Dho A0U;
    public final C26247BjG A0V;
    public final Integer A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.drawable.LayerDrawable A03(float r12, int r13, int r14, int r15, boolean r16, boolean r17) {
        /*
            r11 = 3
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.9Ja r8 = new X.9Ja
            r8.<init>(r5)
            r10 = 7
            r9 = 6
            r7 = 5
            r6 = 4
            r4 = 2
            r0 = 8
            r3 = 1
            r2 = 0
            r1 = 0
            if (r16 == 0) goto L52
            float[] r0 = new float[r0]
            r0[r2] = r12
            r0[r3] = r12
            r0[r4] = r12
            r0[r11] = r12
            r0[r6] = r1
            r0[r7] = r1
            r0[r9] = r1
            r0[r10] = r1
        L26:
            r8.setCornerRadii(r0)
        L29:
            r8.setColor(r13)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r8}
            java.util.ArrayList r1 = X.AbstractC16960so.A1N(r0)
            if (r14 <= 0) goto L44
            X.9Ja r0 = new X.9Ja
            r0.<init>(r5)
            r0.setCornerRadius(r12)
            r0.setStroke(r14, r15)
            r1.add(r0)
        L44:
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r2]
            java.lang.Object[] r1 = r1.toArray(r0)
            android.graphics.drawable.Drawable[] r1 = (android.graphics.drawable.Drawable[]) r1
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r1)
            return r0
        L52:
            if (r17 == 0) goto L67
            float[] r0 = new float[r0]
            r0[r2] = r1
            r0[r3] = r1
            r0[r4] = r1
            r0[r11] = r1
            r0[r6] = r12
            r0[r7] = r12
            r0[r9] = r12
            r0[r10] = r12
            goto L26
        L67:
            r8.setCornerRadius(r12)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26590Bon.A03(float, int, int, int, boolean, boolean):android.graphics.drawable.LayerDrawable");
    }

    private final RippleDrawable A04(C2Z1 c2z1, int i, int i2) {
        float f;
        if (this.A0f) {
            f = AbstractC13690mv.A00(AbstractC25229BEm.A0M(c2z1), 16.0f);
        } else {
            f = 32.0f;
        }
        return new RippleDrawable(ColorStateList.valueOf(i), null, A03(f, i2, 0, 0, false, false));
    }

    private final C2WH A05(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50812Vc abstractC50812Vc3, AbstractC50812Vc abstractC50812Vc4, AbstractC50812Vc abstractC50812Vc5, AbstractC50812Vc abstractC50812Vc6, AbstractC50812Vc abstractC50812Vc7, C2Z1 c2z1, C51722Yv c51722Yv, C51722Yv c51722Yv2) {
        C51722Yv A00 = c51722Yv.A00(this.A0R);
        C3e8 c3e8 = C3e8.SPACE_BETWEEN;
        C51722Yv c51722Yv3 = null;
        C2Z0 A0P = AbstractC167007dF.A0P(c2z1.ArD());
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        C2XE c2xe = A0P.A00;
        C2Z0 A11 = AbstractC25232BEp.A11(abstractC50812Vc, c2xe);
        C2Z0 A13 = AbstractC25232BEp.A13(A11);
        if (this.A0E) {
            A13.A00(new C26549Bo8(false, true, true));
        }
        AbstractC25231BEo.A1A(abstractC50812Vc4, A13, A11, c51722Yv2);
        A0P.A00(AbstractC76963ci.A07(A11, A0P, null, enumC77683ds, null));
        if (abstractC50812Vc2 != null) {
            A0P.A00(abstractC50812Vc3);
            A0P.A00(abstractC50812Vc2);
        }
        A0P.A00(abstractC50812Vc5);
        C3e8 c3e82 = C3e8.FLEX_END;
        if (abstractC50812Vc6 != null) {
            c51722Yv3 = AbstractC25230BEn.A0d(null, C05F.A00, 50.0f, 0);
        }
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
        if (abstractC50812Vc6 != null) {
            A0P2.A00(abstractC50812Vc6);
        }
        AbstractC25231BEo.A1B(abstractC50812Vc7, A0P2, A0P, c51722Yv3, c3e82);
        return AbstractC76963ci.A0L(A0P, c2z1, A00, c3e8);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x096f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x047a  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r125) {
        /*
            Method dump skipped, instructions count: 3458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26590Bon.A0Y(X.3bS):X.2Vc");
    }

    public C26590Bon(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, C51722Yv c51722Yv, AbstractC51432Xq abstractC51432Xq, C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, C75113Zb c75113Zb, BVO bvo, InterfaceC30875Dho interfaceC30875Dho, C26247BjG c26247BjG, Boolean bool, Integer num, String str, C09530e4 c09530e4, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28) {
        AbstractC167017dG.A1P(c26247BjG, interfaceC30875Dho);
        C14360o3.A0B(interfaceC11380iw, 8);
        this.A0V = c26247BjG;
        this.A0U = interfaceC30875Dho;
        this.A09 = z;
        this.A05 = bool;
        this.A00 = onClickListener;
        this.A01 = onClickListener2;
        this.A06 = str;
        this.A0T = interfaceC11380iw;
        this.A03 = c75113Zb;
        this.A0R = c51722Yv;
        this.A0S = abstractC51432Xq;
        this.A0Z = z2;
        this.A0D = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A04 = bvo;
        this.A0W = num;
        this.A0F = z6;
        this.A0I = z7;
        this.A0a = z8;
        this.A0H = z9;
        this.A0E = z10;
        this.A0G = z11;
        this.A0L = z12;
        this.A0A = z13;
        this.A02 = c120985dq;
        this.A08 = interfaceC16820sZ;
        this.A0K = z14;
        this.A0X = z15;
        this.A0e = z16;
        this.A0c = z17;
        this.A0b = z18;
        this.A0f = z19;
        this.A0d = z20;
        this.A0J = z21;
        this.A0O = z22;
        this.A0Q = z23;
        this.A0P = z24;
        this.A0N = z25;
        this.A0M = z26;
        this.A07 = c09530e4;
        this.A0Y = z27;
        this.A0g = z28;
    }
}
