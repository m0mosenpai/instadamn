package X;

import android.animation.ValueAnimator;

/* renamed from: X.D8m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29716D8m extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29716D8m(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i3;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = obj2;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C27963CUj c27963CUj = (C27963CUj) this.A04;
                int A01 = AbstractC167027dH.A01((InterfaceC09390do) this.A03);
                int i = this.A01;
                int i2 = this.A02;
                InterfaceC30910DiN interfaceC30910DiN = (InterfaceC30910DiN) this.A05;
                boolean z = ((C28787CnJ) interfaceC30910DiN).A02;
                boolean A1X = AbstractC167007dF.A1X(interfaceC30910DiN.AtN(), C05F.A00);
                int i3 = A01;
                C127055oj c127055oj = c27963CUj.A03;
                long A04 = c127055oj.A04(i);
                int A06 = AbstractC25225BEi.A06(A04);
                C127035oh c127035oh = c127055oj.A03;
                if (c127035oh.A06(A06) != A01) {
                    int i4 = c127035oh.A02;
                    if (A01 >= i4) {
                        A06 = c127055oj.A03(i4 - 1);
                    } else {
                        A06 = c127055oj.A03(A01);
                    }
                }
                int A02 = AbstractC25228BEl.A02(A04);
                if (c127035oh.A06(A02) != A01) {
                    int i5 = c127035oh.A02;
                    if (A01 >= i5) {
                        i3 = i5 - 1;
                    }
                    A02 = c127035oh.A07(i3, false);
                }
                if (A06 == i2) {
                    return c27963CUj.A00(A02);
                }
                if (A02 != i2 && (!(z ^ A1X) ? i >= A06 : i > A02)) {
                    A06 = A02;
                }
                return c27963CUj.A00(A06);
            case 1:
                AbstractC65392xb abstractC65392xb = (AbstractC65392xb) this.A04;
                int i6 = this.A02;
                int i7 = this.A01;
                abstractC65392xb.onItemRangeChanged(i6, i7);
                C152816u9 c152816u9 = (C152816u9) this.A05;
                C152816u9.A03(c152816u9, i6, i7);
                C152816u9.A01(c152816u9);
                return C0eB.A00;
            default:
                C26589Bom c26589Bom = (C26589Bom) this.A05;
                if (c26589Bom.A06) {
                    if (!C18U.A06(C06090Tz.A06, c26589Bom.A03, 36315112425393172L)) {
                        C77123cy c77123cy = (C77123cy) this.A04;
                        AbstractC25233BEq.A1C(c77123cy);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        Object obj = this.A03;
                        int i8 = this.A02;
                        int i9 = this.A01;
                        ofFloat.setDuration(300L);
                        AbstractC25231BEo.A0w(new C55237Of9(obj, i8, i9, 1), ofFloat, c77123cy);
                        return null;
                    }
                    return null;
                }
                return null;
        }
    }
}
