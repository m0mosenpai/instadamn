package X;

import android.content.Intent;

/* renamed from: X.PFa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56708PFa implements InterfaceC30999Djy {
    public final /* synthetic */ C189478aR A00;
    public final /* synthetic */ C26802BsQ A01;

    public C56708PFa(C189478aR c189478aR, C26802BsQ c26802BsQ) {
        this.A01 = c26802BsQ;
        this.A00 = c189478aR;
    }

    @Override // X.InterfaceC30999Djy
    public final void DAI() {
        this.A00.A0L(null);
    }

    @Override // X.InterfaceC30999Djy
    public final void DiT() {
        Intent A04 = AbstractC31171DnF.A04();
        A04.putExtra("ARGUMENT_SCHOOL_REMOVED", true);
        C26802BsQ c26802BsQ = this.A01;
        AbstractC31176DnK.A18(A04, c26802BsQ);
        AbstractC25227BEk.A1B(c26802BsQ);
    }
}
