package X;

import android.view.View;
import java.util.List;

/* loaded from: classes5.dex */
public final class DI1 extends C0YY implements InterfaceC16660sJ {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI1(Object obj, Object obj2, Object obj3, Object obj4, long j, boolean z) {
        super(1);
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A05 = z;
        this.A00 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C6Nu A0T = AbstractC25228BEl.A0T(obj);
        List list = (List) this.A01;
        C30084DNs c30084DNs = C30084DNs.A00;
        C30085DNt c30085DNt = C30085DNt.A00;
        C6GN c6gn = (C6GN) this.A02;
        C64770TTe c64770TTe = (C64770TTe) this.A04;
        View view = (View) this.A03;
        boolean z = this.A05;
        long j = this.A00;
        int size = list.size();
        AbstractC25227BEk.A15(A0T, new C30727DfP(view, c6gn, c64770TTe, list, j, z), new C50363MLp(1, list, (InterfaceC16660sJ) c30084DNs), new C50363MLp(2, list, (InterfaceC16660sJ) c30085DNt), size);
        return C0eB.A00;
    }
}
