package X;

import android.util.SparseIntArray;

/* renamed from: X.9GD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GD extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GD(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C166137bh c166137bh = (C166137bh) obj;
                C14360o3.A0B(c166137bh, 0);
                return AbstractC166327c1.A07(c166137bh, this.A03, this.A02, new C50368MLv(this.A01, 19));
            case 1:
                long longValue = ((Number) obj).longValue();
                C55312gW c55312gW = (C55312gW) this.A01;
                SparseIntArray sparseIntArray = C55312gW.A02;
                c55312gW.A01.flowAnnotate(longValue, this.A02, this.A03);
                return C0eB.A00;
            default:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                ((C2ZI) this.A01).A0C(str, this.A02, this.A03);
                return C0eB.A00;
        }
    }
}
