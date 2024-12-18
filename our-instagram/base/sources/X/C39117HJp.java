package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;

/* renamed from: X.HJp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39117HJp extends AbstractC64162vb {
    public final C41702IdW A00;
    public final C41727Idy A01;
    public final AdsProductPageFragment A02;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C41702IdW c41702IdW;
        String str;
        C41044IFn c41044IFn = (C41044IFn) obj;
        C14360o3.A0B(c41044IFn, 0);
        if (c41044IFn.A00.A01 != C05F.A04 && (c41702IdW = this.A00) != null) {
            String str2 = c41044IFn.A01;
            C4SX c4sx = null;
            C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, C41726Idx.A00(c41702IdW.A04));
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_section_impression");
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
                AbstractC37300Gc1.A0m(A0f, str2);
                A0f.Cht();
            }
        }
    }

    public C39117HJp(UserSession userSession, C41702IdW c41702IdW, C41727Idy c41727Idy, AdsProductPageFragment adsProductPageFragment) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A01 = c41727Idy;
        this.A00 = c41702IdW;
        this.A02 = adsProductPageFragment;
    }
}
