package X;

import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import java.util.Map;

/* renamed from: X.Ipq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42389Ipq implements InterfaceC43071ya {
    public Product A00;
    public Map A01 = AbstractC166987dD.A1G();
    public final C41702IdW A02;
    public final C41727Idy A03;
    public final AdsProductPageFragment A04;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        Map map = this.A01;
        String str2 = c59062n7.A05;
        Object obj = map.get(str2);
        if (obj == null) {
            obj = false;
            map.put(str2, obj);
        }
        if (!AbstractC166987dD.A1a(obj) && interfaceC57162jr.CFq(c59062n7) == C05F.A00 && this.A04.isScrolledToTop()) {
            C41702IdW c41702IdW = this.A02;
            if (c41702IdW != null) {
                C4SX c4sx = null;
                C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, this.A00);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_cta_visible");
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
            map.put(str2, Boolean.valueOf(A1R));
        }
    }

    public C42389Ipq(C41702IdW c41702IdW, C41727Idy c41727Idy, AdsProductPageFragment adsProductPageFragment) {
        this.A03 = c41727Idy;
        this.A02 = c41702IdW;
        this.A04 = adsProductPageFragment;
    }
}
