package X;

import com.instagram.user.model.Product;

/* renamed from: X.Ixj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42869Ixj implements JHR {
    public final /* synthetic */ C38323GtI A00;

    @Override // X.JHR
    public final void DFn(C41643IbZ c41643IbZ, Product product, Throwable th, long j, long j2) {
        String str;
        C38323GtI c38323GtI = this.A00;
        C39324HYp c39324HYp = c38323GtI.A04;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        c39324HYp.A03(c41643IbZ, product, str, j, j2, false);
        c38323GtI.A00.remove(c41643IbZ.A02());
        C43361JEc A01 = C43361JEc.A01(c41643IbZ, 17);
        AbstractC37304Gc5.A0x(c38323GtI.A01, c38323GtI.A02, A01);
        C43172J6r.A03(c38323GtI, AbstractC141776au.A00(c38323GtI), 29);
    }

    @Override // X.JHR
    public final void DqQ(InterfaceC40821up interfaceC40821up, C41643IbZ c41643IbZ, Product product, long j, long j2) {
        C38323GtI c38323GtI = this.A00;
        c38323GtI.A04.A03(c41643IbZ, product, null, j, j2, true);
        c38323GtI.A00.remove(c41643IbZ.A02());
        C43361JEc A01 = C43361JEc.A01(c41643IbZ, 18);
        AbstractC37304Gc5.A0x(c38323GtI.A01, c38323GtI.A02, A01);
    }

    public C42869Ixj(C38323GtI c38323GtI) {
        this.A00 = c38323GtI;
    }
}
