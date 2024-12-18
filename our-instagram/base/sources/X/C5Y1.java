package X;

import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.animation.core.Animatable$snapTo$2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5Y1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Y1 {
    public Object A00;
    public AbstractC118405Xc A01;
    public AbstractC118405Xc A02;
    public Object A03;
    public final C5Y2 A04;
    public final C5Y3 A05;
    public final C5Y4 A06;
    public final InterfaceC118485Xk A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final AbstractC118405Xc A0A;
    public final AbstractC118405Xc A0B;
    public final Object A0C;

    public final Object A03(C5Y6 c5y6, Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds) {
        return A04(c5y6, obj, obj2, interfaceC23621Ds, null);
    }

    public final Object A04(C5Y6 c5y6, Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        C5Y2 c5y2 = this.A04;
        Object value = c5y2.A05.getValue();
        InterfaceC118485Xk interfaceC118485Xk = this.A07;
        C62C c62c = new C62C(c5y6, (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(obj2), interfaceC118485Xk, value, obj);
        long j = c5y2.A01;
        return AnonymousClass194.A00(interfaceC23621Ds, new C9DV(this.A05, C05F.A00, null, new Animatable$runAnimation$2(this, c62c, obj2, null, interfaceC16660sJ, j)));
    }

    public static final Object A00(C5Y1 c5y1, Object obj) {
        if (!C14360o3.A0K(c5y1.A01, c5y1.A0A) || !C14360o3.A0K(c5y1.A02, c5y1.A0B)) {
            C118475Xj c118475Xj = (C118475Xj) c5y1.A07;
            AbstractC118405Xc abstractC118405Xc = (AbstractC118405Xc) c118475Xj.A01.invoke(obj);
            int A01 = abstractC118405Xc.A01();
            boolean z = false;
            for (int i = 0; i < A01; i++) {
                float A00 = abstractC118405Xc.A00(i);
                AbstractC118405Xc abstractC118405Xc2 = c5y1.A01;
                if (A00 < abstractC118405Xc2.A00(i) || abstractC118405Xc.A00(i) > c5y1.A02.A00(i)) {
                    abstractC118405Xc.A03(i, C17s.A02(abstractC118405Xc.A00(i), abstractC118405Xc2.A00(i), c5y1.A02.A00(i)));
                    z = true;
                }
            }
            if (z) {
                return c118475Xj.A00.invoke(abstractC118405Xc);
            }
        }
        return obj;
    }

    public static final void A01(C5Y1 c5y1) {
        C5Y2 c5y2 = c5y1.A04;
        c5y2.A02.A02();
        c5y2.A01 = Long.MIN_VALUE;
        c5y1.A08.Egh(false);
    }

    public final Object A02() {
        return ((C118475Xj) this.A07).A00.invoke(this.A04.A02);
    }

    public final Object A05(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C9DV(this.A05, C05F.A00, null, new Animatable$snapTo$2(this, obj, null)));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    public final Object A06(InterfaceC23621Ds interfaceC23621Ds) {
        Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C9DV(this.A05, C05F.A00, null, new C29637D3x(this, null, 0)));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    public final void A07(Object obj, Object obj2) {
        AbstractC118405Xc abstractC118405Xc;
        AbstractC118405Xc abstractC118405Xc2;
        if (obj == null || (abstractC118405Xc = (AbstractC118405Xc) ((C118475Xj) this.A07).A01.invoke(obj)) == null) {
            abstractC118405Xc = this.A0A;
        }
        if (obj2 == null || (abstractC118405Xc2 = (AbstractC118405Xc) ((C118475Xj) this.A07).A01.invoke(obj2)) == null) {
            abstractC118405Xc2 = this.A0B;
        }
        int A01 = abstractC118405Xc.A01();
        for (int i = 0; i < A01; i++) {
            if (abstractC118405Xc.A00(i) > abstractC118405Xc2.A00(i)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: ");
                sb.append(abstractC118405Xc);
                sb.append(" is greater than upper bound ");
                sb.append(abstractC118405Xc2);
                sb.append(" on index ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        this.A01 = abstractC118405Xc;
        this.A02 = abstractC118405Xc2;
        this.A00 = obj2;
        this.A03 = obj;
        if (!((Boolean) this.A08.getValue()).booleanValue()) {
            InterfaceC74953Yl interfaceC74953Yl = this.A04.A05;
            Object A00 = A00(this, interfaceC74953Yl.getValue());
            if (!C14360o3.A0K(A00, interfaceC74953Yl.getValue())) {
                interfaceC74953Yl.Egh(A00);
            }
        }
    }

    public C5Y1(InterfaceC118485Xk interfaceC118485Xk, Object obj, Object obj2) {
        AbstractC118405Xc abstractC118405Xc;
        AbstractC118405Xc abstractC118405Xc2;
        this.A07 = interfaceC118485Xk;
        this.A0C = obj2;
        this.A04 = new C5Y2(null, interfaceC118485Xk, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A08 = new ParcelableSnapshotMutableState(A00, false);
        this.A09 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), obj);
        this.A05 = new C5Y3();
        this.A06 = new C5Y4(obj2, 1.0f, 1500.0f);
        AbstractC118405Xc abstractC118405Xc3 = this.A04.A02;
        if (abstractC118405Xc3 instanceof C118395Xb) {
            abstractC118405Xc = AbstractC118385Xa.A00;
        } else if (abstractC118405Xc3 instanceof C118415Xd) {
            abstractC118405Xc = AbstractC118385Xa.A02;
        } else if (abstractC118405Xc3 instanceof C118425Xe) {
            abstractC118405Xc = AbstractC118385Xa.A04;
        } else {
            abstractC118405Xc = AbstractC118385Xa.A06;
        }
        C14360o3.A0C(abstractC118405Xc, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A0A = abstractC118405Xc;
        AbstractC118405Xc abstractC118405Xc4 = this.A04.A02;
        if (abstractC118405Xc4 instanceof C118395Xb) {
            abstractC118405Xc2 = AbstractC118385Xa.A01;
        } else if (abstractC118405Xc4 instanceof C118415Xd) {
            abstractC118405Xc2 = AbstractC118385Xa.A03;
        } else if (abstractC118405Xc4 instanceof C118425Xe) {
            abstractC118405Xc2 = AbstractC118385Xa.A05;
        } else {
            abstractC118405Xc2 = AbstractC118385Xa.A07;
        }
        C14360o3.A0C(abstractC118405Xc2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A0B = abstractC118405Xc2;
        this.A01 = abstractC118405Xc;
        this.A02 = abstractC118405Xc2;
    }
}
