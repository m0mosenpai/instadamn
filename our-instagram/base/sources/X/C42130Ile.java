package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Ile, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42130Ile implements C53S {
    public int A00;
    public long A01;
    public DialogInterface.OnDismissListener A02;
    public RankingInfo A03;
    public C38321qM A04;
    public ProductTileMedia A05;
    public C84823qW A06;
    public InterfaceC146006hx A07;
    public JI5 A08;
    public EnumC39572Hdi A09;
    public ShoppingSearchLoggingInfo A0A;
    public C2Fb A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final FragmentActivity A0c;
    public final ProductReviewStatus A0d;
    public final UserSession A0e;
    public final InterfaceC60442pS A0f;
    public final C3DN A0g;
    public final Product A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;

    @Override // X.C53S
    public final void A8Y(C19280xC c19280xC) {
        C14360o3.A0B(c19280xC, 0);
        c19280xC.A0C("entity_id", this.A0k);
        c19280xC.A0C("merchant_id", this.A0j);
        Product product = this.A0h;
        if (product != null) {
            c19280xC.A0C("checkout_style", AbstractC31180DnO.A0k(product.A01.A00));
        }
        C38321qM c38321qM = this.A04;
        if (c38321qM != null) {
            c19280xC.A0C("media_id", c38321qM.A38());
            UserSession userSession = this.A0e;
            C38321qM c38321qM2 = this.A04;
            C14360o3.A0A(c38321qM2);
            c19280xC.A0C("tracking_token", AbstractC41071vF.A0F(userSession, c38321qM2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0274, code lost:
    
        if (r2.intValue() <= 0) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C42130Ile r64) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42130Ile.A00(X.Ile):void");
    }

    public static final void A01(C42130Ile c42130Ile) {
        C84823qW c84823qW;
        Product product;
        Integer num;
        String A0U;
        C38321qM c38321qM = c42130Ile.A04;
        if (c42130Ile.A0b && c38321qM != null && c42130Ile.A0j != null) {
            UserSession userSession = c42130Ile.A0e;
            if (I94.A00(userSession, c38321qM, c42130Ile.A0k) && (product = c42130Ile.A0h) != null) {
                FragmentActivity fragmentActivity = c42130Ile.A0c;
                ViewOnClickListenerC42033Ik2 viewOnClickListenerC42033Ik2 = new ViewOnClickListenerC42033Ik2(c42130Ile, 69);
                JI5 ji5 = c42130Ile.A08;
                C08790ch A00 = AbstractC018607g.A00(fragmentActivity);
                InterfaceC60442pS interfaceC60442pS = c42130Ile.A0f;
                String str = product.A0H;
                User user = product.A0B;
                String A0o = AbstractC37301Gc2.A0o(user);
                String str2 = "";
                if (A0o == null) {
                    A0o = "";
                }
                String str3 = product.A0J;
                if (str3 == null) {
                    str3 = "";
                }
                if (user != null && (A0U = AbstractC37300Gc1.A0U(user)) != null) {
                    str2 = A0U;
                }
                boolean A04 = product.A04();
                AbstractC167007dF.A1E(str, 1, str3);
                if (c38321qM.A63()) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                C41592Iaf c41592Iaf = new C41592Iaf(userSession, c38321qM, interfaceC60442pS, str, A0o, A04);
                C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
                c50674MYs.A07(fragmentActivity.getResources().getString(2131973972, str3, str2));
                ViewOnClickListenerC38053Gog.A04(c50674MYs, c41592Iaf, viewOnClickListenerC42033Ik2, 24, 2131973975);
                int i = 2131973974;
                if (num.intValue() != 0) {
                    i = 2131973973;
                }
                c50674MYs.A01(new ViewOnClickListenerC42015Ijk(fragmentActivity, num, A00, userSession, ji5, c41592Iaf, c38321qM, A0o, str, 0), i);
                if (ji5 != null) {
                    c50674MYs.A03 = new C42685Iug(ji5, 1);
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41592Iaf.A01, "instagram_shopping_merchant_product_action_sheet_opened");
                AbstractC37300Gc1.A0i(A0f, Long.valueOf(c41592Iaf.A00));
                AbstractC37301Gc2.A17(A0f, c41592Iaf.A03);
                AbstractC37301Gc2.A1B(A0f, c41592Iaf.A04);
                AbstractC37303Gc4.A0f(A0f, c41592Iaf.A02);
                A0f.Cht();
                C3DN A01 = C3DN.A00.A01(fragmentActivity);
                if (A01 != null) {
                    C3DP c3dp = (C3DP) A01;
                    if (c3dp.A0h) {
                        A01.A0B();
                        c3dp.A0H = new GHK(12, fragmentActivity, c50674MYs);
                        return;
                    }
                }
                C31727DwY.A01(fragmentActivity, c50674MYs);
                return;
            }
        }
        ProductReviewStatus productReviewStatus = c42130Ile.A0d;
        if (productReviewStatus == ProductReviewStatus.A04 && ((c84823qW = c42130Ile.A06) == null || c84823qW.A07() != TextReviewStatus.A07)) {
            A00(c42130Ile);
            return;
        }
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity fragmentActivity2 = c42130Ile.A0c;
        InterfaceC60442pS interfaceC60442pS2 = c42130Ile.A0f;
        c1xj.A1K(c42130Ile.A02, null, fragmentActivity2, productReviewStatus, c42130Ile.A0e, c38321qM, interfaceC60442pS2, c42130Ile.A07, c42130Ile.A0k, c42130Ile.A0i, c42130Ile.A0Z);
    }

    public final void A02(C38321qM c38321qM, Integer num) {
        this.A04 = c38321qM;
        this.A0E = num;
    }

    public C42130Ile(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2) {
        this.A09 = EnumC39572Hdi.A06;
        this.A0D = -1;
        this.A0C = -1;
        this.A00 = -1;
        this.A0c = fragmentActivity;
        this.A0h = product;
        this.A0k = product.A0H;
        this.A0d = product.A05;
        User user = product.A0B;
        String A0o = AbstractC37301Gc2.A0o(user);
        C14360o3.A0A(A0o);
        this.A0j = A0o;
        this.A0m = user != null ? AbstractC37300Gc1.A0U(user) : null;
        this.A0e = userSession;
        this.A0f = interfaceC60442pS;
        this.A0i = str;
        this.A0l = str2;
        this.A0g = AbstractC31172DnG.A0r(fragmentActivity);
    }

    public C42130Ile(FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
        this.A09 = EnumC39572Hdi.A06;
        this.A0D = -1;
        this.A0C = -1;
        this.A00 = -1;
        this.A0c = fragmentActivity;
        this.A0h = null;
        this.A0k = str;
        this.A0d = productReviewStatus;
        this.A0j = str2;
        this.A0m = str3;
        this.A0e = userSession;
        this.A0f = interfaceC60442pS;
        this.A0i = str4;
        this.A0l = str5;
        this.A0g = AbstractC31172DnG.A0r(fragmentActivity);
    }
}
