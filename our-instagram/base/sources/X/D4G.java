package X;

import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes5.dex */
public final class D4G extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final float A01;
    public final int A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4G(Object obj, InterfaceC23621Ds interfaceC23621Ds, float f, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = f;
        this.A04 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        Object obj2;
        float f;
        int i;
        if (this.A02 != 0) {
            obj2 = this.A03;
            f = this.A01;
            z = this.A04;
            i = 1;
        } else {
            z = this.A04;
            obj2 = this.A03;
            f = this.A01;
            i = 0;
        }
        return new D4G(obj2, interfaceC23621Ds, f, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.5Y6] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        ?? r0;
        float f;
        float f2;
        int i = this.A02;
        C1JX c1jx = C1JX.A02;
        if (i != 0) {
            int i2 = this.A00;
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC09560e7.A00(obj);
                } else {
                    throw AbstractC166987dD.A13();
                }
            } else {
                AbstractC09560e7.A00(obj);
                C5E2 c5e2 = (C5E2) this.A03;
                C5Y1 c5y1 = c5e2.A0D;
                c5y1.A07(AbstractC25225BEi.A10(c5e2.A02), c5y1.A00);
                Float A10 = AbstractC25225BEi.A10(this.A01);
                boolean z = this.A04;
                if (z) {
                    f = c5e2.A01;
                } else {
                    f = c5e2.A03;
                }
                C5Y4 A0I = AbstractC25225BEi.A0I(null, 0.5f, f);
                if (!z && !c5e2.A0C) {
                    f2 = c5e2.A00;
                } else {
                    f2 = 0.0f;
                }
                Float A102 = AbstractC25225BEi.A10(f2);
                C30185DRq A02 = C30185DRq.A02(c5e2, 42);
                this.A00 = 1;
                if (c5y1.A04(A0I, A10, A102, this, A02) == c1jx) {
                    return c1jx;
                }
            }
            C5E2.A00((C5E2) this.A03);
        } else if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            boolean z2 = this.A04;
            C5Y1 c5y12 = (C5Y1) this.A03;
            Float A103 = AbstractC25225BEi.A10(this.A01);
            if (z2) {
                C25245BFe A00 = C25245BFe.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 0);
                this.A00 = 1;
                r0 = A00;
            } else {
                Object obj2 = new Object();
                this.A00 = 2;
                r0 = obj2;
            }
            if (AbstractC25228BEl.A14(c5y12, r0, A103, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4G) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
