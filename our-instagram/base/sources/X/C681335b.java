package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.List;

/* renamed from: X.35b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C681335b extends AbstractC64162vb {
    public static final InterfaceC08100bW A03 = new C1QF("IgSecureUriParser").A00;
    public static final String A04;
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    static {
        String name = C681335b.class.getName();
        C14360o3.A07(name);
        A04 = name;
    }

    public C681335b(FragmentActivity fragmentActivity, C1BX c1bx, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(c1bx, new InterfaceC62702t9() { // from class: X.35c
            @Override // X.InterfaceC62702t9
            public final String BKe(C59062n7 c59062n7) {
                String id;
                C14360o3.A0B(c59062n7, 0);
                C38321qM c38321qM = (C38321qM) c59062n7.A03;
                C38321qM A1e = c38321qM.A1e(((C42C) c59062n7.A04).A00);
                StringBuilder sb = new StringBuilder();
                if (A1e == null) {
                    sb.append("feed_carousel_bloks_prefetch_");
                    id = c38321qM.getId();
                } else {
                    sb.append("feed_carousel_bloks_prefetch_");
                    id = A1e.getId();
                }
                sb.append(id);
                return sb.toString();
            }
        });
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }

    public static final void A00(C38321qM c38321qM, C681335b c681335b) {
        List AmB;
        AndroidLink androidLink;
        String Aw8;
        android.net.Uri A00;
        UserSession userSession = c681335b.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36330741809824771L) && (AmB = c38321qM.A0C.AmB()) != null && !AmB.isEmpty() && (androidLink = (AndroidLink) AbstractC001800i.A0J(((C38321qM) AmB.get(0)).A3Y())) != null && (Aw8 = androidLink.Aw8()) != null && (A00 = AbstractC08820cl.A00(A03, Aw8)) != null && A00.isHierarchical()) {
            String queryParameter = A00.getQueryParameter("app_id");
            String queryParameter2 = A00.getQueryParameter("merchant_id");
            String queryParameter3 = A00.getQueryParameter("ad_id");
            String queryParameter4 = A00.getQueryParameter("ad_tracking_token");
            if (C14360o3.A0K(queryParameter, "com.bloks.www.bloks.commerce.cart.singlemerchantcart") && queryParameter2 != null && queryParameter3 != null && queryParameter4 != null) {
                C1XJ c1xj = C1XJ.A00;
                FragmentActivity fragmentActivity = c681335b.A00;
                C14360o3.A0C(fragmentActivity, MSV.A00(11));
                c1xj.A0d(fragmentActivity, fragmentActivity, userSession, queryParameter2, queryParameter3, queryParameter4, c681335b.A02.getModuleName());
            }
        }
    }

    public static final void A01(C38321qM c38321qM, C681335b c681335b) {
        EnumC906041v enumC906041v;
        String queryParameter;
        List AmB = c38321qM.A0C.AmB();
        if (AmB != null && !AmB.isEmpty()) {
            AndroidLink androidLink = (AndroidLink) AbstractC001800i.A0J(((C38321qM) AmB.get(0)).A3Y());
            C1XJ c1xj = C1XJ.A00;
            C14360o3.A07(c1xj);
            String str = null;
            if (androidLink != null) {
                str = androidLink.Aw8();
                enumC906041v = AbstractC114965Hm.A01(androidLink);
            } else {
                enumC906041v = null;
            }
            if (enumC906041v == EnumC906041v.AD_DESTINATION_ORGANIC_COLLECTION && str != null) {
                InterfaceC08100bW interfaceC08100bW = A03;
                android.net.Uri A00 = AbstractC08820cl.A00(interfaceC08100bW, str);
                String A0Z = c1xj.A0Z(A00, interfaceC08100bW, A04);
                if (A00 != null && C14360o3.A0K(A0Z, AbstractC111324zv.A00(365))) {
                    UserSession userSession = c681335b.A01;
                    if (C18U.A06(C06090Tz.A05, userSession, 36316765986296454L) && (queryParameter = A00.getQueryParameter(AbstractC111324zv.A00(209))) != null) {
                        String queryParameter2 = A00.getQueryParameter(DialogModule.KEY_TITLE);
                        INB A0S = c1xj.A0S(c681335b.A00, userSession, queryParameter);
                        A0S.A00 = A00.getQueryParameter("ad_id");
                        A0S.A01 = A00.getQueryParameter("first_entry_point");
                        A0S.A02 = c38321qM.getId();
                        A0S.A01(A00.getQueryParameter("pinned_product_ids"));
                        A0S.A03 = c681335b.A02.getModuleName();
                        A0S.A04 = A00.getQueryParameter("shopping_session_id");
                        A0S.A05 = queryParameter2;
                        A0S.A06 = A00.getQueryParameter("tracking_token");
                        A0S.A00();
                    }
                }
            }
        }
    }
}
