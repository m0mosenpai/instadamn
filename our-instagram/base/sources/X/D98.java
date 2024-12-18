package X;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class D98 extends C0YY implements InterfaceC16820sZ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;
    public final Object A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D98(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, float f, int i, int i2, long j, long j2, boolean z) {
        super(0);
        this.A01 = i2;
        this.A07 = obj;
        this.A06 = obj2;
        this.A08 = obj3;
        this.A02 = i;
        this.A0G = z;
        this.A0E = obj4;
        this.A0D = obj5;
        this.A0F = obj6;
        this.A04 = j;
        this.A0A = obj7;
        this.A0C = obj8;
        this.A05 = obj9;
        this.A03 = j2;
        this.A0B = obj10;
        this.A09 = obj11;
        this.A00 = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.0YY] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        boolean z;
        String str;
        Integer A0D;
        long j;
        C120985dq c120985dq;
        Object obj;
        int i2;
        C2XI c2xi;
        Object invoke;
        InterfaceC16820sZ interfaceC16820sZ;
        String str2;
        Integer A0D2;
        long j2;
        C120985dq c120985dq2;
        int i3;
        if (this.A01 != 0) {
            C26590Bon c26590Bon = (C26590Bon) this.A07;
            OvershootInterpolator overshootInterpolator = C26590Bon.A0h;
            Boolean bool = c26590Bon.A05;
            BVO bvo = c26590Bon.A04;
            i = 0;
            z = false;
            if (bvo != null) {
                C75113Zb c75113Zb = c26590Bon.A03;
                if (CKP.A00(c75113Zb, bvo) && bool != null) {
                    C76223bS c76223bS = (C76223bS) this.A08;
                    Double d = bvo.A03;
                    String str3 = bvo.A08;
                    int A03 = AbstractC77623dm.A03(c76223bS, R.color.black_50_transparent);
                    int i4 = this.A02;
                    if (c26590Bon.A0N) {
                        A03 = AbstractC77623dm.A03(c76223bS, R.color.button_background_color);
                    } else if (c26590Bon.A0M) {
                        A03 = AbstractC13950nL.A07(AbstractC56842jH.A03(0.7f, i4, -16777216), 0.4f);
                    } else if (d != null && (str2 = c26590Bon.A06) != null && (A0D2 = AbstractC13950nL.A0D(str2)) != null) {
                        A03 = AbstractC13950nL.A02((float) d.doubleValue(), A0D2.intValue(), -1);
                    } else if (str3 != null && !AbstractC001900j.A0T(str3)) {
                        try {
                            A03 = Color.parseColor(str3);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    DHY dhy = new DHY(c76223bS, c26590Bon, this.A00, 12);
                    boolean booleanValue = bool.booleanValue();
                    if ((!booleanValue || c26590Bon.A0B) && !this.A0G) {
                        if (!booleanValue && !AbstractC166987dD.A1a(AbstractC25225BEi.A12((C77123cy) this.A05))) {
                            AbstractC25227BEk.A1K((C51762Yz) this.A0D, 0);
                            ((C51762Yz) this.A0F).A01(AbstractC25225BEi.A0p(this.A03));
                            ((C2XI) this.A0A).A00(this.A0B);
                            obj = this.A0C;
                            ((C51762Yz) obj).A01(z);
                            interfaceC16820sZ = new C0YY(i);
                        } else {
                            ((C51762Yz) this.A06).A01(bool);
                            C77123cy c77123cy = (C77123cy) this.A09;
                            AbstractC25233BEq.A1C(c77123cy);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            C2XI c2xi2 = (C2XI) this.A0A;
                            Object obj2 = this.A0E;
                            Object obj3 = this.A0D;
                            Object obj4 = this.A0F;
                            long j3 = this.A04;
                            long j4 = this.A03;
                            Object obj5 = this.A0C;
                            Object obj6 = this.A05;
                            if (c26590Bon.A0L) {
                                j2 = 150;
                            } else {
                                j2 = 300;
                            }
                            ofFloat.setDuration(j2);
                            ofFloat.addUpdateListener(new C28521CiF(c76223bS, c2xi2, bool, dhy, A03, 1));
                            if (c26590Bon.A0J && (c120985dq2 = c26590Bon.A02) != null && c120985dq2.CdW()) {
                                c75113Zb.A3a.A00(c75113Zb, true);
                                ofFloat.setStartDelay(500L);
                            }
                            ofFloat.addListener(new C28517CiB(1, j3, j4, obj2, obj3, obj4, c26590Bon, bool));
                            ofFloat.addListener(new C28518CiC(A03, 1, c76223bS, c2xi2, obj6, obj5, c26590Bon, bool, dhy));
                            ofFloat.start();
                            C2XV.A00();
                            c77123cy.A00 = ofFloat;
                            interfaceC16820sZ = new C29903DGr(c77123cy, 25);
                        }
                    } else {
                        ((C51762Yz) this.A0E).A03(DRX.A00(c26590Bon, 33));
                        C51762Yz c51762Yz = (C51762Yz) this.A0D;
                        C09530e4 c09530e4 = c26590Bon.A07;
                        if (c09530e4 != null) {
                            Number number = (Number) c09530e4.A01;
                            if (number.intValue() != 0) {
                                i3 = number.intValue();
                                AbstractC25227BEk.A1K(c51762Yz, i3);
                                ((C51762Yz) this.A0F).A01(AbstractC25225BEi.A0p(this.A04));
                                c2xi = (C2XI) this.A0A;
                                invoke = dhy.invoke(Integer.valueOf(A03));
                                c2xi.A00(invoke);
                                ((C51762Yz) this.A0C).A00();
                                interfaceC16820sZ = new C0YY(i);
                            }
                        }
                        i3 = 12;
                        AbstractC25227BEk.A1K(c51762Yz, i3);
                        ((C51762Yz) this.A0F).A01(AbstractC25225BEi.A0p(this.A04));
                        c2xi = (C2XI) this.A0A;
                        invoke = dhy.invoke(Integer.valueOf(A03));
                        c2xi.A00(invoke);
                        ((C51762Yz) this.A0C).A00();
                        interfaceC16820sZ = new C0YY(i);
                    }
                }
            }
            obj = this.A06;
            ((C51762Yz) obj).A01(z);
            interfaceC16820sZ = new C0YY(i);
        } else {
            BVJ bvj = (BVJ) this.A07;
            OvershootInterpolator overshootInterpolator2 = BVJ.A0w;
            Boolean bool2 = bvj.A05;
            BVO bvo2 = bvj.A04;
            i = 0;
            z = false;
            if (bvo2 != null) {
                C75113Zb c75113Zb2 = bvj.A03;
                if (CKP.A00(c75113Zb2, bvo2) && bool2 != null) {
                    C76223bS c76223bS2 = (C76223bS) this.A08;
                    Double d2 = bvo2.A03;
                    String str4 = bvo2.A08;
                    int A032 = AbstractC77623dm.A03(c76223bS2, R.color.black_50_transparent);
                    int i5 = this.A02;
                    if (bvj.A0O) {
                        A032 = AbstractC77623dm.A03(c76223bS2, R.color.button_background_color);
                    } else if (bvj.A0N) {
                        A032 = AbstractC13950nL.A07(AbstractC56842jH.A03(0.7f, i5, -16777216), 0.4f);
                    } else if (d2 != null && (str = bvj.A07) != null && (A0D = AbstractC13950nL.A0D(str)) != null) {
                        A032 = AbstractC13950nL.A02((float) d2.doubleValue(), A0D.intValue(), -1);
                    } else if (str4 != null && !AbstractC001900j.A0T(str4)) {
                        try {
                            A032 = Color.parseColor(str4);
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    DHY dhy2 = new DHY(c76223bS2, bvj, this.A00, 10);
                    boolean booleanValue2 = bool2.booleanValue();
                    if ((!booleanValue2 || bvj.A0C) && !this.A0G) {
                        if (!booleanValue2 && !AbstractC166987dD.A1a(AbstractC25225BEi.A12((C77123cy) this.A05))) {
                            AbstractC25227BEk.A1K((C51762Yz) this.A0D, 0);
                            ((C51762Yz) this.A0F).A01(AbstractC25225BEi.A0p(this.A03));
                            ((C2XI) this.A0A).A00(this.A0B);
                            obj = this.A0C;
                            ((C51762Yz) obj).A01(z);
                            interfaceC16820sZ = new C0YY(i);
                        } else {
                            ((C51762Yz) this.A06).A01(bool2);
                            C77123cy c77123cy2 = (C77123cy) this.A09;
                            AbstractC25233BEq.A1C(c77123cy2);
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            C2XI c2xi3 = (C2XI) this.A0A;
                            Object obj7 = this.A0E;
                            Object obj8 = this.A0D;
                            Object obj9 = this.A0F;
                            long j5 = this.A04;
                            long j6 = this.A03;
                            Object obj10 = this.A0C;
                            Object obj11 = this.A05;
                            if (bvj.A0M) {
                                j = 150;
                            } else {
                                j = 300;
                            }
                            ofFloat2.setDuration(j);
                            ofFloat2.addUpdateListener(new C28521CiF(c76223bS2, c2xi3, bool2, dhy2, A032, 0));
                            if (bvj.A0K && (c120985dq = bvj.A02) != null && c120985dq.CdW()) {
                                c75113Zb2.A3a.A00(c75113Zb2, true);
                                ofFloat2.setStartDelay(500L);
                            }
                            ofFloat2.addListener(new C28517CiB(0, j5, j6, obj7, obj8, obj9, bvj, bool2));
                            ofFloat2.addListener(new C28518CiC(A032, 0, c76223bS2, c2xi3, obj11, obj10, bvj, bool2, dhy2));
                            ofFloat2.start();
                            C2XV.A00();
                            c77123cy2.A00 = ofFloat2;
                            interfaceC16820sZ = new J8V(c77123cy2, 33);
                        }
                    } else {
                        ((C51762Yz) this.A0E).A03(new C57746PjZ(bvj, 12));
                        C51762Yz c51762Yz2 = (C51762Yz) this.A0D;
                        C09530e4 c09530e42 = bvj.A08;
                        if (c09530e42 != null) {
                            Number number2 = (Number) c09530e42.A01;
                            if (number2.intValue() != 0) {
                                i2 = number2.intValue();
                                AbstractC25227BEk.A1K(c51762Yz2, i2);
                                ((C51762Yz) this.A0F).A01(AbstractC25225BEi.A0p(this.A04));
                                c2xi = (C2XI) this.A0A;
                                invoke = dhy2.invoke(Integer.valueOf(A032));
                                c2xi.A00(invoke);
                                ((C51762Yz) this.A0C).A00();
                                interfaceC16820sZ = new C0YY(i);
                            }
                        }
                        i2 = 12;
                        AbstractC25227BEk.A1K(c51762Yz2, i2);
                        ((C51762Yz) this.A0F).A01(AbstractC25225BEi.A0p(this.A04));
                        c2xi = (C2XI) this.A0A;
                        invoke = dhy2.invoke(Integer.valueOf(A032));
                        c2xi.A00(invoke);
                        ((C51762Yz) this.A0C).A00();
                        interfaceC16820sZ = new C0YY(i);
                    }
                }
            }
            obj = this.A06;
            ((C51762Yz) obj).A01(z);
            interfaceC16820sZ = new C0YY(i);
        }
        return AbstractC25225BEi.A0f(interfaceC16820sZ);
    }
}
