package X;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes5.dex */
public final class DIF extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIF(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A07 = z;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        if (this.A00 != 0) {
            boolean A1a = AbstractC166987dD.A1a(obj);
            Dialog dialog = (Dialog) this.A04;
            if (dialog != null) {
                dialog.dismiss();
            }
            C37607Gh2 c37607Gh2 = (C37607Gh2) this.A06;
            if (c37607Gh2.A07.mView != null) {
                C37607Gh2.A00((View) this.A05, (C120985dq) this.A01, (C37644Ghd) this.A02, (C38321qM) this.A03, c37607Gh2, this.A07, A1a);
            }
        } else {
            C6Nu c6Nu = (C6Nu) obj;
            C14360o3.A0B(c6Nu, 0);
            C51748MtX c51748MtX = (C51748MtX) this.A06;
            if (c51748MtX.A03 && (z = this.A07)) {
                c6Nu.CgH(null, AbstractC27758CLz.A00);
            } else {
                z = this.A07;
                AbstractC25227BEk.A13(c6Nu, new C30527DcA(1, this.A03, z), -1132185594);
                AbstractC25227BEk.A13(c6Nu, new C30518Dc1(z, 1), -5994947);
            }
            AbstractC25227BEk.A13(c6Nu, new C30568Dcp(0, this.A02, this.A05, this.A01, c51748MtX, this.A04, z), -348014750);
        }
        return C0eB.A00;
    }
}
