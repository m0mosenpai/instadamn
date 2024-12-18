package X;

/* loaded from: classes5.dex */
public final class DHA extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHA(boolean z, boolean z2) {
        super(1);
        this.A01 = z;
        this.A00 = z2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C167297di c167297di = (C167297di) obj;
        C14360o3.A0B(c167297di, 0);
        int A0K = AbstractC167017dG.A0K(c167297di.A0G);
        boolean z = this.A01;
        int i = A0K - 1;
        if (z) {
            i = A0K + 1;
        }
        return C167297di.A00(null, c167297di, null, null, null, null, null, null, null, Integer.valueOf(i), null, null, null, null, null, -917505, 65535, false, false, z, this.A00, false, false, false, false);
    }
}
