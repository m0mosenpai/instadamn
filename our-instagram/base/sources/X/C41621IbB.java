package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.IbB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41621IbB {
    public Boolean A00;
    public final JI6 A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final InterfaceC60442pS A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C41621IbB(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, JI6 ji6, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 1);
        AbstractC167017dG.A1U(str4, userSession);
        this.A06 = str;
        this.A07 = str2;
        this.A02 = fragmentActivity;
        this.A05 = interfaceC60442pS;
        this.A09 = str3;
        this.A0A = str4;
        this.A03 = userSession;
        this.A01 = ji6;
        this.A04 = c38321qM;
        this.A08 = str5;
    }

    public static final void A00(CheckoutLaunchParams checkoutLaunchParams, C41621IbB c41621IbB, Product product) {
        C41585IaY c41585IaY = (C41585IaY) C41585IaY.A04.getValue();
        List A1J = AbstractC166987dD.A1J(product);
        c41585IaY.A03 = A1J;
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = c41585IaY.A01;
        if (igReactPurchaseExperienceBridgeModule != null) {
            igReactPurchaseExperienceBridgeModule.mProducts = A1J;
        }
        C1XE.A01(c41621IbB.A02, c41621IbB.A03, checkoutLaunchParams, "pdp");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41621IbB.A01():void");
    }
}
