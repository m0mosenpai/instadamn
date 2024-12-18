package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Idz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41728Idz {
    public final RankingInfo A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final Product A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C41728Idz c41728Idz, int i, boolean z, boolean z2) {
        interfaceC02590Ai.A9K("item_count", Long.valueOf(i));
        interfaceC02590Ai.A7v("item_is_influencer_media", Boolean.valueOf(z));
        interfaceC02590Ai.A7v("is_loading", Boolean.valueOf(z2));
        interfaceC02590Ai.AAP("checkout_session_id", c41728Idz.A07);
        interfaceC02590Ai.AAP("prior_module", c41728Idz.A0A);
        interfaceC02590Ai.AAP("prior_submodule", c41728Idz.A0B);
    }

    public static final ArrayList A00(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(((ProductDiscountInformationDict) it.next()).getId(), A1E);
            }
            return A1E;
        }
        return null;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C41728Idz c41728Idz) {
        interfaceC02590Ai.AAP("checkout_session_id", c41728Idz.A07);
        interfaceC02590Ai.AAP("prior_module", c41728Idz.A0A);
        interfaceC02590Ai.AAP("prior_submodule", c41728Idz.A0B);
    }

    public final void A03(int i, int i2, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_lightbox_load_success");
        if (A0f.isSampled()) {
            AbstractC37304Gc5.A11(A0f, i);
            A0f.A9K("initial_index", AbstractC31171DnF.A0V(i2));
            A0f.A9K("load_time", Long.valueOf(j));
            Product product = this.A05;
            AbstractC37303Gc4.A0j(A0f, product);
            String A0j = AbstractC37304Gc5.A0j(product);
            if (A0j == null) {
                A0j = "";
            }
            A0f.AAP("merchant_id", A0j);
            AbstractC37302Gc3.A10(A0f, product);
            A01(A0f, this);
            C38321qM c38321qM = this.A04;
            if (c38321qM != null) {
                UserSession userSession = this.A03;
                if (c38321qM.A2E(userSession) != null) {
                    A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM));
                }
            }
            A0f.Cht();
        }
    }

    public final void A04(C38321qM c38321qM, String str, String str2, int i, int i2, boolean z, boolean z2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_lightbox_media_attribution_username_click");
        if (A0f.isSampled()) {
            String id = c38321qM.getId();
            if (id != null) {
                A0f.AAP("item_media_id", id);
                UserSession userSession = this.A03;
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    A0f.AAP("item_media_owner_id", A2E.getId());
                    Product product = this.A05;
                    AbstractC37303Gc4.A0j(A0f, product);
                    String A0j = AbstractC37304Gc5.A0j(product);
                    if (A0j == null) {
                        A0j = "";
                    }
                    A0f.AAP("merchant_id", A0j);
                    AbstractC37302Gc3.A10(A0f, product);
                    AbstractC37304Gc5.A17(A0f, str, str2, i);
                    A02(A0f, this, i2, z, z2);
                    C38321qM c38321qM2 = this.A04;
                    if (c38321qM2 != null && c38321qM2.A2E(userSession) != null) {
                        A0f.AAP("media_owner_id", AbstractC37304Gc5.A0e(A0f, userSession, c38321qM2));
                    }
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public final void A05(Product product, String str) {
        AbstractC41757IeY.A05(this.A01, this.A03, this.A04, null, product, this.A0B, this.A0A, str, this.A07, this.A0D);
    }

    public C41728Idz(RankingInfo rankingInfo, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC25234BEr.A1R(userSession, product, str, str2, str3);
        AbstractC167007dF.A1I(str4, 7, str5);
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A01 = interfaceC11380iw;
        this.A03 = userSession;
        this.A05 = product;
        this.A07 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0D = str5;
        this.A04 = c38321qM;
        this.A06 = str6;
        this.A00 = rankingInfo;
        this.A08 = str7;
        this.A0C = str8;
    }
}
