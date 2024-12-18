package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* renamed from: X.HJu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39122HJu extends AbstractC64162vb {
    public final C18920wW A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        String str;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        User user;
        C38819H7k c38819H7k;
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 0);
        C38321qM c38321qM = (C38321qM) c09530e4.A00;
        C38818H7j c38818H7j = (C38818H7j) c09530e4.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(2574));
        String str2 = null;
        if (c38818H7j == null || (c38819H7k = c38818H7j.A00) == null || (l = c38819H7k.A02) == null) {
            l = null;
        }
        A0f.A9K("permission_id", l);
        ProductDetailsProductItemDict productDetailsProductItemDict = c38818H7j.A01;
        if (productDetailsProductItemDict != null && (user = productDetailsProductItemDict.A0G) != null) {
            str = AbstractC76433bn.A00(user);
        } else {
            str = null;
        }
        AbstractC37301Gc2.A17(A0f, str);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("shopping_session_id", this.A03);
        AbstractC37300Gc1.A0v(c0Zx, this.A01);
        AbstractC37300Gc1.A0w(c0Zx, this.A02);
        C38819H7k c38819H7k2 = c38818H7j.A00;
        if (c38819H7k2 != null && (featuredProductPermissionStatus = c38819H7k2.A00) != null) {
            str2 = featuredProductPermissionStatus.A00;
        }
        AbstractC37301Gc2.A13(A0f, c0Zx, "submodule", AnonymousClass001.A0R(str2, "_featured_product_pivot"));
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A06("m_pk", c38321qM.getId());
        A0f.AAQ(c0Zx2, "pivots_logging_info");
        A0f.Cht();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        Long l;
        String str;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        User user;
        C38819H7k c38819H7k;
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 0);
        C38321qM c38321qM = (C38321qM) c09530e4.A00;
        C38818H7j c38818H7j = (C38818H7j) c09530e4.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(2575));
        String str2 = null;
        if (c38818H7j == null || (c38819H7k = c38818H7j.A00) == null || (l = c38819H7k.A02) == null) {
            l = null;
        }
        A0f.A9K("permission_id", l);
        ProductDetailsProductItemDict productDetailsProductItemDict = c38818H7j.A01;
        if (productDetailsProductItemDict != null && (user = productDetailsProductItemDict.A0G) != null) {
            str = AbstractC76433bn.A00(user);
        } else {
            str = null;
        }
        AbstractC37301Gc2.A17(A0f, str);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("shopping_session_id", this.A03);
        AbstractC37300Gc1.A0v(c0Zx, this.A01);
        AbstractC37300Gc1.A0w(c0Zx, this.A02);
        C38819H7k c38819H7k2 = c38818H7j.A00;
        if (c38819H7k2 != null && (featuredProductPermissionStatus = c38819H7k2.A00) != null) {
            str2 = featuredProductPermissionStatus.A00;
        }
        AbstractC37301Gc2.A13(A0f, c0Zx, "submodule", AnonymousClass001.A0R(str2, "_featured_product_pivot"));
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A06("m_pk", c38321qM.getId());
        A0f.AAQ(c0Zx2, "pivots_logging_info");
        A0f.Cht();
    }

    public C39122HJu(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
