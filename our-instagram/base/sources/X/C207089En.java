package X;

/* renamed from: X.9En, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207089En extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207089En(Object obj, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl c5Tl = (C5Tl) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(-730946946, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
                    }
                    C136986Ib c136986Ib = (C136986Ib) this.A02;
                    C138156Nt c138156Nt = c136986Ib.A01;
                    int i = this.A01;
                    C6Nx AXC = c138156Nt.A01.AXC(i);
                    ((C136976Ia) AXC.A02).A00.invoke(c136986Ib.A00, Integer.valueOf(i - AXC.A01), c5Tl, 0);
                    if (C0fH.A02()) {
                        C0fH.A00(-1252003122);
                    }
                }
                return C0eB.A00;
            case 1:
                ((Number) obj2).intValue();
                ((C5TM) this.A02).A06((C5Tl) obj, AbstractC128295qy.A00(this.A01 | 1));
                return C0eB.A00;
            case 2:
                ((Number) obj2).intValue();
                ((AbstractC1127657i) this.A02).A06((C5Tl) obj, AbstractC128295qy.A00(this.A01 | 1));
                return C0eB.A00;
            case 3:
                C3h2 c3h2 = (C3h2) obj2;
                C14360o3.A0B(c3h2, 1);
                return C3h3.A00((C38321qM) this.A02, null, c3h2, this.A01, false);
            default:
                ((Number) obj2).intValue();
                AbstractC117955Vf.A00((C5Tl) obj, (InterfaceC16620sF) this.A02, AbstractC128295qy.A00(this.A01 | 1));
                return C0eB.A00;
        }
    }
}
