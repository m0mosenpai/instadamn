package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.filters.intf.FilterConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IeN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41749IeN {
    public Fragment A00;
    public RankingInfo A01;
    public FilterConfig A02;
    public C38321qM A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public ArrayList A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public SellerShoppableFeedType A0O;
    public final FragmentActivity A0P;
    public final UserSession A0Q;
    public final InterfaceC60442pS A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.IJW A01() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41749IeN.A01():X.IJW");
    }

    private final void A02() {
        UserSession userSession = this.A0Q;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36329337355649310L)) {
            c06090Tz = C06090Tz.A05;
        }
        if (AbstractC31172DnG.A1b(Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36329337355518237L)))) {
            C12L c12l = C12L.A00;
            C1339263a A00 = AnonymousClass638.A00(AnonymousClass636.A00(userSession));
            AbstractC23641Du.A05(c12l.CPG(1759633843, 3), new JXO(A00, this, "com.bloks.www.storefront.template.general", null, 23), C07Y.A00(this.A0P));
        }
    }

    private final void A03(String str, InterfaceC11380iw interfaceC11380iw) {
        UserSession userSession = this.A0Q;
        String moduleName = this.A0R.getModuleName();
        String str2 = this.A0G;
        String str3 = this.A0T;
        String str4 = this.A08;
        String A0s = AbstractC25231BEo.A0s(this.A03);
        String str5 = this.A0C;
        boolean A1V = AbstractC167007dF.A1V(moduleName);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "shops_mini_shop_storefront_entry");
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, A0s);
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1I(A0f, "shops_mini_shop_storefront");
            C38B A04 = AbstractC37303Gc4.A04(moduleName, str2);
            AbstractC37303Gc4.A0z(A04, "shopping_session_id", str);
            AbstractC37300Gc1.A0f(A0f, A04);
            AbstractC37301Gc2.A18(A0f, str3);
            String str6 = null;
            A0f.A9K("link_id", AbstractC37302Gc3.A0W(str4));
            A0f.AAK(null, "marketer_igid");
            if (A0h != null) {
                if (A0h.A5N() == A1V) {
                    str6 = A0h.A1g(userSession).CAR();
                } else {
                    str6 = A0h.CAR();
                }
            }
            A0f.AAP("ads_tracking_token", str6);
            if (str5 != null) {
                A0f.AAK(C4SX.A00(str5), "shop_linked_creator_id");
            }
            if (A0s != null) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("m_pk", A0s);
                c0Zx.A06("tracking_token", AbstractC41071vF.A0I(userSession, A0s));
                A0f.AAQ(c0Zx, "ig_media_info");
            }
            A0f.Cht();
        }
    }

    public final void A04() {
        long seconds = TimeUnit.MINUTES.toSeconds(10L);
        C12L c12l = C12L.A00;
        IJW A01 = A01();
        AbstractC23641Du.A05(c12l.CPG(1759633843, 3), new C43164J6c(A01, this, null, 2, seconds), C07Y.A00(this.A0P));
        A02();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0362  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41749IeN.A05():void");
    }

    public final void A06(String str, String str2, String str3, String str4, String str5) {
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A0A = str5;
    }

    public C41749IeN(FragmentActivity fragmentActivity, SellerShoppableFeedType sellerShoppableFeedType, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
        this.A0P = fragmentActivity;
        this.A0Q = userSession;
        this.A0R = interfaceC60442pS;
        this.A0W = str;
        this.A0V = str2;
        this.A0T = str4;
        this.A0U = str5;
        this.A0S = str3;
        this.A0G = str3;
        this.A0O = sellerShoppableFeedType == null ? SellerShoppableFeedType.A06 : sellerShoppableFeedType;
    }

    private final Bundle A00() {
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = this.A0Q;
        AbstractC31173DnH.A1C(A0b, userSession);
        AbstractC37300Gc1.A0c(A0b, this.A0R.getModuleName());
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A0S);
        A0b.putString("displayed_user_id", this.A0T);
        A0b.putString("displayed_username", this.A0U);
        A0b.putString("attribution_username", null);
        A0b.putStringArrayList("pinned_product_ids", this.A0H);
        A0b.putString("shopping_session_id", this.A0W);
        A0b.putParcelable("filter_config", this.A02);
        A0b.putString(AbstractC111324zv.A00(263), this.A0C);
        A0b.putBoolean("merchant_verified", false);
        A0b.putBoolean("merchant_follow_status", false);
        A0b.putString("merchant_profile_pic_url", null);
        A0b.putString("merchant_follower_count", null);
        A0b.putBoolean("preempt_empty_state_filter_button", false);
        C38321qM c38321qM = this.A03;
        if (c38321qM != null && c38321qM.A1g(userSession).CdW()) {
            AbstractC37301Gc2.A0u(A0b, c38321qM);
        }
        return A0b;
    }
}
