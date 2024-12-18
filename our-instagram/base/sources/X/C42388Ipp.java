package X;

import com.instagram.user.model.Product;

/* renamed from: X.Ipp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42388Ipp implements InterfaceC43071ya {
    public Product A00;
    public boolean A01;
    public final C41702IdW A02;
    public final C41727Idy A03;

    public C42388Ipp(C41702IdW c41702IdW, C41727Idy c41727Idy) {
        this.A03 = c41727Idy;
        this.A02 = c41702IdW;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        C14360o3.A0A(c59062n7);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        C41044IFn c41044IFn = (C41044IFn) obj;
        if (!this.A01 && this.A00 != null && c41044IFn.A00.A01 != C05F.A04) {
            C14360o3.A0A(interfaceC57162jr);
            if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                C41702IdW c41702IdW = this.A02;
                if (c41702IdW != null) {
                    C4SX c4sx = null;
                    C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, this.A00);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_impression");
                    if (A0f.isSampled()) {
                        C38642Gyj c38642Gyj = c41702IdW.A01;
                        if (c38642Gyj == null || (str = c38642Gyj.A05) == null) {
                            str = "";
                        }
                        AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str));
                        if (A0M != null) {
                            c4sx = A0M.A01;
                        }
                        C41702IdW.A01(A0f, c41702IdW, AbstractC37304Gc5.A0b(c4sx, A0f, A0M));
                        A0f.Cht();
                    }
                }
                this.A01 = true;
            }
        }
    }
}
