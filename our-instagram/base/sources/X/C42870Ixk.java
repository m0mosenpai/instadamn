package X;

import com.instagram.user.model.Product;

/* renamed from: X.Ixk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42870Ixk implements JHR {
    public final /* synthetic */ C38328GtN A00;

    @Override // X.JHR
    public final void DFn(C41643IbZ c41643IbZ, Product product, Throwable th, long j, long j2) {
        String str;
        C38328GtN c38328GtN = this.A00;
        C39325HYq c39325HYq = c38328GtN.A02;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        c39325HYq.A03(c41643IbZ, product, str, j, j2, false);
        c38328GtN.A00.remove(c41643IbZ.A02());
        C38328GtN.A00(c38328GtN, C43361JEc.A01(c41643IbZ, 21));
        C43172J6r.A03(c38328GtN, AbstractC141776au.A00(c38328GtN), 30);
    }

    @Override // X.JHR
    public final void DqQ(InterfaceC40821up interfaceC40821up, C41643IbZ c41643IbZ, Product product, long j, long j2) {
        C38328GtN c38328GtN = this.A00;
        c38328GtN.A02.A03(c41643IbZ, product, null, j, j2, true);
        c38328GtN.A00.remove(c41643IbZ.A02());
        C38328GtN.A00(c38328GtN, C43361JEc.A01(c41643IbZ, 22));
    }

    public C42870Ixk(C38328GtN c38328GtN) {
        this.A00 = c38328GtN;
    }
}