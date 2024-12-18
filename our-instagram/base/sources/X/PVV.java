package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class PVV implements InterfaceC19960yQ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C07X A02;
    public final /* synthetic */ C51029Mgc A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;

    public PVV(Context context, C07X c07x, C51029Mgc c51029Mgc, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        this.A03 = c51029Mgc;
        this.A01 = context;
        this.A00 = j;
        this.A02 = c07x;
        this.A04 = interfaceC16660sJ;
        this.A05 = z;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C12T c12t = C12P.A00;
        AnonymousClass137 anonymousClass137 = AnonymousClass131.A00;
        C51029Mgc c51029Mgc = this.A03;
        Context context = this.A01;
        long j = this.A00;
        Object A00 = AbstractC23641Du.A00(interfaceC23621Ds, anonymousClass137, new PYj(context, this.A02, (C54828OLn) obj, c51029Mgc, null, this.A04, j, this.A05));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }
}
