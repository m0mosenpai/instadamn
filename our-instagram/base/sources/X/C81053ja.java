package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81053ja {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final C689838k A04;
    public final C33F A05;
    public final C1Y1 A06;
    public final InterfaceC61432r6 A07;
    public final C1M1 A08;
    public final C33P A09;
    public final C81063jb A0A;
    public final String A0B;
    public final boolean A0C;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(View view, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
        Fragment fragment;
        Context context;
        boolean A5l = c38321qM.A5l();
        if (!c38321qM.A5n() && !this.A0C && !c75113Zb.A2F && !c38321qM.A5u()) {
            if (view != null && (context = (fragment = this.A00).getContext()) != null && !AbstractC15820qc.A0E(context)) {
                C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
                if (!((Boolean) A00.A4J.CES(A00, C23031Ai.A8c[71])).booleanValue()) {
                    C33F c33f = this.A05;
                    ViewParent parent = ((InterfaceC60682pr) fragment).getScrollingViewProxy().getParent();
                    C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    String string = context.getString(2131968943);
                    C14360o3.A07(string);
                    c33f.A00((ViewGroup) parent, string, new C207019Eg(view, 33), 500L, false);
                }
            }
            UserSession userSession = this.A01;
            c75113Zb.A0J(c37905Gm2, C57532kS.A00(userSession).A0N(c38321qM), true, true, C18U.A06(C06090Tz.A05, userSession, 36322242069604431L));
            this.A07.DVi(C6T5.A00(), AnonymousClass317.A0D, c38321qM, c75113Zb);
            C172077lc A002 = C172077lc.A00(userSession);
            Integer num = C05F.A00;
            Integer num2 = C05F.A01;
            String A003 = AbstractC111324zv.A00(4337);
            InterfaceC60442pS interfaceC60442pS = this.A03;
            A002.A01(AbstractC123975jB.A02(interfaceC60442pS, c38321qM, num, A003, true));
            Fragment fragment2 = this.A00;
            Context requireContext = fragment2.requireContext();
            int i2 = c75113Zb.A03;
            EnumC77173d3 enumC77173d3 = EnumC77173d3.A02;
            FragmentActivity requireActivity = fragment2.requireActivity();
            C1M1 c1m1 = this.A08;
            AbstractC41706Idc.A01(requireActivity, requireContext, null, userSession, new C42529Is8(this, c38321qM, c75113Zb), enumC77173d3, c38321qM, c37905Gm2, interfaceC60442pS, AnonymousClass729.A00(userSession).A00, c1m1, num2, null, IQ1.A01(c1m1), IQ1.A00(c1m1), null, i, -1, i2, -1, c75113Zb.A2U);
            if (AbstractC75103Za.A0Q(c38321qM, c75113Zb.A03)) {
                if (!A5l && this.A04.A03(c38321qM, c75113Zb) && c38321qM.CdW()) {
                    c75113Zb.A0e(true);
                    c75113Zb.A0m(true, true);
                }
                AbstractC123605iZ.A00(userSession);
                C123625ib.A00(userSession, c38321qM, interfaceC60442pS, c75113Zb);
                c75113Zb.A0m(true, true);
                c75113Zb.A1K = AbstractC111324zv.A00(2663);
            }
        }
    }

    public C81053ja(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, C689838k c689838k, C33F c33f, C33P c33p, C81063jb c81063jb, C1Y1 c1y1, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, String str, boolean z) {
        C14360o3.A0B(c1m1, 8);
        C14360o3.A0B(c689838k, 10);
        this.A02 = interfaceC686136y;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = interfaceC60442pS;
        this.A09 = c33p;
        this.A07 = interfaceC61432r6;
        this.A0C = z;
        this.A08 = c1m1;
        this.A0B = str;
        this.A04 = c689838k;
        this.A05 = c33f;
        this.A06 = c1y1;
        this.A0A = c81063jb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        if (r28 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01de, code lost:
    
        if (r3 != null) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, X.5ST] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.view.View r23, final X.C38321qM r24, X.C37905Gm2 r25, X.C3Y7 r26, final X.C75113Zb r27, X.C3YJ r28, int r29) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81053ja.A00(android.view.View, X.1qM, X.Gm2, X.3Y7, X.3Zb, X.3YJ, int):void");
    }

    public final void A02(C38321qM c38321qM, C37905Gm2 c37905Gm2, String str) {
        long j;
        Long l;
        ArrayList arrayList;
        C4SX c4sx;
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "media_tap");
        A04.A0G(userSession, c38321qM);
        if (c38321qM.CdW()) {
            Boolean bool = null;
            if (c38321qM.Cff()) {
                bool = Boolean.valueOf(c38321qM.A6W(IGPostTriggerExperience.A07));
            }
            A04.A22 = bool;
            XNW.A00(A01, A04, c37905Gm2, str);
            return;
        }
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_organic_media_tap");
        C11520jB A012 = A04.A01();
        if (!A00.isSampled()) {
            return;
        }
        Number number = (Number) A012.A01(C5I8.A0Z);
        if (number != null) {
            j = number.longValue();
        } else {
            j = 0;
        }
        A00.A9K("a_pk", Long.valueOf(j));
        String str2 = (String) A012.A01(C5I8.A2w);
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        A00.AAP("follow_status", str2);
        C11500j9 c11500j9 = C5I8.A5K;
        String str4 = (String) A012.A01(c11500j9);
        if (str4 != null) {
            str3 = str4;
        }
        A00.AAP("m_pk", str3);
        A00.AAP("tracking_token", (String) A012.A01(C5I8.A9R));
        C11500j9 c11500j92 = C5I8.A0C;
        A00.A9K("m_t", (Long) A012.A01(c11500j92));
        A00.AAP("inventory_source", (String) A012.A01(C5I8.A3r));
        A00.AAP("module_name", interfaceC60442pS.getModuleName());
        String str5 = (String) A012.A01(c11500j9);
        Long l2 = null;
        if (str5 != null) {
            l = AbstractC003100w.A0k(10, str5);
        } else {
            l = null;
        }
        A00.A9K("media_id", l);
        A00.A9K("media_author_id", (Long) A012.A01(C5I8.A5G));
        A00.AAP("delivery_flags", (String) A012.A01(C5I8.A27));
        A00.A9K("ad_id", (Long) A012.A01(c11500j92));
        A00.AAP("action", (String) A012.A01(C5I8.A00));
        A00.AAP("carousel_cover_media_id", (String) A012.A01(C5I8.A0x));
        A00.AAP("carousel_media_id", (String) A012.A01(C5I8.A10));
        A00.A9K("carousel_starting_media_id", (Long) A012.A01(C5I8.A16));
        A00.A9K("carousel_index", (Long) A012.A01(C5I8.A0z));
        A00.A9K("carousel_media_id_int", (Long) A012.A01(C5I8.A11));
        A00.A9K("carousel_container_media_id", (Long) A012.A01(C5I8.A0w));
        A00.A9K("carousel_cover_media_id_int", (Long) A012.A01(C5I8.A0y));
        A00.AAP("ranking_session_id", (String) A012.A01(C5I8.A6s));
        A00.A9K("m_ix", (Long) A012.A01(C5I8.A3n));
        A00.AAP("ranking_info_token", (String) A012.A01(C5I8.A6r));
        AbstractCollection abstractCollection = (AbstractCollection) A012.A01(C5I8.A6l);
        if (abstractCollection != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                String str6 = (String) it.next();
                C14360o3.A0B(str6, 0);
                Long A0k = AbstractC003100w.A0k(10, str6);
                if (A0k != null) {
                    arrayList2.add(A0k);
                }
            }
            arrayList = AbstractC001800i.A0U(arrayList2);
        } else {
            arrayList = null;
        }
        A00.AAk("product_ids", arrayList);
        A00.A9K("product_id", (Long) A012.A01(C5I8.A6m));
        String str7 = (String) A012.A01(C5I8.A5g);
        if (str7 != null) {
            c4sx = C4SX.A00(str7);
        } else {
            c4sx = null;
        }
        A00.AAK(c4sx, "merchant_id");
        A00.A7v("is_checkout_enabled", (Boolean) A012.A01(C5I8.A42));
        A00.AAP("shopping_session_id", (String) A012.A01(C5I8.A86));
        A00.AAP("topic_cluster_id", (String) A012.A01(C5I8.A9J));
        A00.AAP("topic_cluster_title", (String) A012.A01(C5I8.A9L));
        A00.AAP("topic_cluster_type", (String) A012.A01(C5I8.A9M));
        A00.AAP("topic_cluster_debug_info", (String) A012.A01(C5I8.A9I));
        A00.AAP("chaining_session_id", (String) A012.A01(C5I8.A1C));
        A00.A9K("chaining_position", (Long) A012.A01(C5I8.A1A));
        A00.A9K("chaining_seed_media_id", (Long) A012.A01(C5I8.A3g));
        A00.A9K("chaining_seed_author_id", (Long) A012.A01(C5I8.A1B));
        A00.AAP("hashtag_name", (String) A012.A01(AbstractC129005sL.A03));
        A00.A9K("hashtag_id", (Long) A012.A01(C5I8.A3P));
        A00.AAP("hashtag_feed_type", (String) A012.A01(C5I8.A3O));
        A00.AAP("hashtag_follow_status", (String) A012.A01(AbstractC129005sL.A01));
        A00.AAP("radio_type", (String) A012.A01(C5I8.A6q));
        A00.AAP("mezql_token", (String) A012.A01(C5I8.A5i));
        A00.AAP("entity_type", (String) A012.A01(C5I8.A2e));
        A00.A9K("entity_id", (Long) A012.A01(C5I8.A2a));
        A00.AAP("entity_name", (String) A012.A01(C5I8.A2b));
        A00.AAP("entity_page_name", (String) A012.A01(C5I8.A2d));
        String str8 = (String) A012.A01(C5I8.A2c);
        if (str8 != null) {
            l2 = AbstractC003100w.A0k(10, str8);
        }
        A00.A9K("entity_page_id", l2);
        A00.AAP("entity_follow_status", (String) A012.A01(C5I8.A2Z));
        A00.AAP("media_thumbnail_section", (String) A012.A01(C5I8.A5Z));
        A00.AAP("collection_id", (String) A012.A01(C5I8.A1L));
        A00.AAP("collection_name", (String) A012.A01(C5I8.A1N));
        A00.A7v("is_eof", (Boolean) A012.A01(C5I8.A4H));
        A00.A9K("is_dark_mode", (Long) A012.A01(C5I8.A4C));
        A00.AAP("rank_token", (String) A012.A01(C5I8.A6t));
        A00.Cht();
    }
}
