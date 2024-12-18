package X;

/* loaded from: classes9.dex */
public final class PXk extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXk(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = i3;
        this.A04 = obj;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = i;
        this.A02 = i2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A05;
        int i3 = this.A03;
        int i4 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new PXk(obj2, interfaceC23621Ds, i3, i4, i, z, z2);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int i;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC06180Ui interfaceC06180Ui = ((AbstractC50863Mdu) this.A04).A04;
            if (this.A06) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            if (this.A05) {
                i = this.A03;
            } else {
                i = this.A02;
            }
            C51745MtU c51745MtU = new C51745MtU(num, i, 4, false);
            this.A00 = 1;
            if (interfaceC06180Ui.emit(c51745MtU, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXk) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
