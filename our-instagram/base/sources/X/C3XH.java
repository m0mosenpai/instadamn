package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3XH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XH {
    public static final C3XG A01(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            return new C3XG(c38321qM, c38321qM.B5n(), id);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final List A06(Collection collection) {
        C14360o3.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A01((C38321qM) it.next()));
        }
        return arrayList;
    }

    public static final C3XG A00(C3XG c3xg, boolean z, boolean z2) {
        InterfaceC38381qS interfaceC38381qS;
        C38321qM A02;
        if (C1XV.A0Y == c3xg.A06 && (A02 = A02((interfaceC38381qS = c3xg.A05))) != null && A02.CdW()) {
            if (A02.A2W() == null) {
                C0w9.A03("feed_item_null_ad_id", AnonymousClass001.A0R("null ad id in sponsored media ", A02.getId()));
            } else {
                C40971v4 A00 = AbstractC40881uv.A00(A02);
                if (z) {
                    return new C3XG(interfaceC38381qS, A00, c3xg.A09, z2);
                }
                return new C3XG(A00, A00, A00.A0S, z2);
            }
        }
        return c3xg;
    }

    public static final C38321qM A02(Object obj) {
        InterfaceC38371qR interfaceC38371qR;
        if (!(obj instanceof InterfaceC38371qR) || (interfaceC38371qR = (InterfaceC38371qR) obj) == null) {
            return null;
        }
        return interfaceC38371qR.BQN();
    }

    public static final List A03(Collection collection) {
        InterfaceC38371qR interfaceC38371qR;
        C38321qM BQN;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC38381qS interfaceC38381qS = ((C3XG) it.next()).A05;
            if ((interfaceC38381qS instanceof InterfaceC38371qR) && (interfaceC38371qR = (InterfaceC38371qR) interfaceC38381qS) != null && (BQN = interfaceC38371qR.BQN()) != null) {
                arrayList.add(BQN);
            }
        }
        return arrayList;
    }

    public final C3XG A05(C16L c16l, boolean z) {
        C38321qM A02;
        try {
            try {
                C47J c47j = null;
                if (c16l.A11() != C16R.A0D) {
                    c16l.A0z();
                    throw new IOException(new Exception() { // from class: X.9tw
                    });
                }
                C47J c47j2 = null;
                C47J c47j3 = null;
                C47J c47j4 = null;
                C47J c47j5 = null;
                C47J c47j6 = null;
                C47J c47j7 = null;
                C47J c47j8 = null;
                C47J c47j9 = null;
                E6U e6u = null;
                C103444lK c103444lK = null;
                C38321qM c38321qM = null;
                C38611qr c38611qr = null;
                C37841pN c37841pN = null;
                C88523xA c88523xA = null;
                C38650Gyr c38650Gyr = null;
                C38633Gya c38633Gya = null;
                C101264gi c101264gi = null;
                C101264gi c101264gi2 = null;
                H2U h2u = null;
                H58 h58 = null;
                H58 h582 = null;
                E87 e87 = null;
                H3G h3g = null;
                H3G h3g2 = null;
                H3G h3g3 = null;
                C33704Eus c33704Eus = null;
                C110414yD c110414yD = null;
                C110414yD c110414yD2 = null;
                C110414yD c110414yD3 = null;
                Boolean bool = null;
                C38651Gys c38651Gys = null;
                C110394yB c110394yB = null;
                QIy qIy = null;
                C111094zQ c111094zQ = null;
                C38644Gyl c38644Gyl = null;
                C38321qM c38321qM2 = null;
                QIy qIy2 = null;
                QIy qIy3 = null;
                XVV xvv = null;
                C38634Gyb c38634Gyb = null;
                C26042BfV c26042BfV = null;
                C47J c47j10 = null;
                C38640Gyh c38640Gyh = null;
                C99534dT c99534dT = null;
                C99534dT c99534dT2 = null;
                XVV xvv2 = null;
                while (c16l.A1J() != C16R.A09) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("suggested_businesses".equals(A0q)) {
                        c47j = C47A.parseFromJson(c16l);
                    } else if ("suggested_users".equals(A0q)) {
                        c47j2 = C47A.parseFromJson(c16l);
                    } else if ("suggested_interest_accounts".equals(A0q)) {
                        c47j3 = C47A.parseFromJson(c16l);
                    } else if ("suggested_hashtags".equals(A0q)) {
                        c47j4 = C47A.parseFromJson(c16l);
                    } else if ("suggested_top_accounts".equals(A0q)) {
                        c47j5 = C47A.parseFromJson(c16l);
                    } else if ("suggested_producers".equals(A0q)) {
                        c47j6 = C47A.parseFromJson(c16l);
                    } else if ("suggested_producers_v2".equals(A0q)) {
                        c47j7 = C47A.parseFromJson(c16l);
                    } else if ("suggested_close_friends".equals(A0q)) {
                        c47j8 = C47A.parseFromJson(c16l);
                    } else if ("suggested_shops".equals(A0q)) {
                        c47j9 = C47A.parseFromJson(c16l);
                    } else if ("suggested_igd_channels".equals(A0q)) {
                        e6u = AbstractC33751Evd.parseFromJson(c16l);
                    } else if ("bloks_netego".equals(A0q)) {
                        c103444lK = AbstractC102734kA.parseFromJson(c16l);
                    } else if ("media_or_ad".equals(A0q)) {
                        c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                    } else if ("simple_action".equals(A0q)) {
                        c38611qr = IRW.parseFromJson(c16l);
                    } else if ("ad4ad".equals(A0q)) {
                        c37841pN = AbstractC40712I2s.parseFromJson(c16l);
                    } else if ("explore_story".equals(A0q)) {
                        c88523xA = AbstractC88263wb.parseFromJson(c16l);
                    } else if ("in_feed_survey".equals(A0q)) {
                        c38650Gyr = AbstractC39926HnH.parseFromJson(c16l);
                    } else if ("tagged_edge_story".equals(A0q)) {
                        c38633Gya = AbstractC40377HvP.parseFromJson(c16l);
                    } else if ("stories_netego".equals(A0q)) {
                        c101264gi = AbstractC101254gh.parseFromJson(c16l);
                    } else if ("hifu_blending".equals(A0q)) {
                        c101264gi2 = AbstractC101254gh.parseFromJson(c16l);
                    } else if ("business_conversion_netego".equals(A0q)) {
                        h2u = AbstractC39785Hkv.parseFromJson(c16l);
                    } else if ("separator".equals(A0q)) {
                        h58 = AbstractC40234Hsx.parseFromJson(c16l);
                    } else if ("separator_header".equals(A0q)) {
                        h582 = AbstractC40234Hsx.parseFromJson(c16l);
                    } else if ("simple_banner".equals(A0q)) {
                        e87 = AbstractC33742EvU.parseFromJson(c16l);
                    } else if ("invite_from_fb".equals(A0q)) {
                        h3g = Hn5.parseFromJson(c16l);
                    } else if ("fb_upsell_non_user".equals(A0q)) {
                        h3g2 = Hn5.parseFromJson(c16l);
                    } else if ("fb_upsell_stale_user".equals(A0q)) {
                        h3g3 = Hn5.parseFromJson(c16l);
                    } else if ("immersive_segue_item".equals(A0q)) {
                        c33704Eus = AbstractC33705Eut.parseFromJson(c16l);
                    } else if ("end_of_feed_demarcator".equals(A0q)) {
                        c110414yD = AbstractC110344y5.parseFromJson(c16l);
                    } else if ("end_of_favorites_demarcator".equals(A0q)) {
                        c110414yD2 = AbstractC110344y5.parseFromJson(c16l);
                    } else if ("end_of_exclusive_content_demarcator".equals(A0q)) {
                        c110414yD3 = AbstractC110344y5.parseFromJson(c16l);
                    } else if ("has_feed_preview".equals(A0q)) {
                        bool = Boolean.valueOf(c16l.A0d());
                    } else if ("product_pivots".equals(A0q)) {
                        c38651Gys = AbstractC40176Hro.parseFromJson(c16l);
                    } else if ("group_set".equals(A0q)) {
                        c110394yB = AbstractC110354y7.parseFromJson(c16l);
                    } else if ("follow_requests".equals(A0q)) {
                        qIy = AbstractC39930HnL.parseFromJson(c16l);
                    } else if ("clips_netego".equals(A0q)) {
                        c111094zQ = AbstractC111014zD.parseFromJson(c16l);
                    } else if ("intent_aware_ad_pivot".equals(A0q)) {
                        c38644Gyl = AbstractC40641Hzz.parseFromJson(c16l);
                    } else if ("stand_alone_multi_ad_pivot".equals(A0q)) {
                        c38321qM2 = C38321qM.A0h.A0C(c16l, true, false);
                    } else if ("alternative_topic_nudge".equals(A0q)) {
                        qIy2 = AbstractC39742HkE.parseFromJson(c16l);
                    } else if ("take_a_break_nudge".equals(A0q)) {
                        qIy3 = HvT.parseFromJson(c16l);
                    } else if ("shopping_recommendation_unit".equals(A0q)) {
                        xvv = Ht7.parseFromJson(c16l);
                    } else if ("text_post_app_thread".equals(A0q)) {
                        c38634Gyb = AbstractC40471Hx4.parseFromJson(c16l);
                    } else if ("text_app_trend_unit".equals(A0q)) {
                        c26042BfV = AbstractC33757Evj.parseFromJson(c16l);
                    } else if ("text_app_topical_interest_unit".equals(A0q)) {
                        c47j10 = C47A.parseFromJson(c16l);
                    } else if ("nifu_netego".equals(A0q)) {
                        c38640Gyh = AbstractC40118Hql.parseFromJson(c16l);
                    } else if ("threads_in_feed_unit".equals(A0q)) {
                        c99534dT = AbstractC99224cn.parseFromJson(c16l);
                    } else if ("tifu_in_explore".equals(A0q)) {
                        c99534dT2 = AbstractC99224cn.parseFromJson(c16l);
                    } else if ("memu_in_feed_unit".equals(A0q)) {
                        xvv2 = AbstractC40071Hpx.parseFromJson(c16l);
                    }
                    c16l.A0z();
                }
                C3XG c3xg = new C3XG(xvv, xvv2, qIy, qIy2, qIy3, c26042BfV, c103444lK, h2u, c111094zQ, c88523xA, h3g, h3g2, h3g3, c38650Gyr, c33704Eus, c38640Gyh, c38651Gys, h58, h582, e87, c101264gi, c101264gi2, e6u, c47j, c47j2, c47j3, c47j4, c47j5, c47j6, c47j7, c47j8, c47j9, c47j10, c38633Gya, c99534dT, c99534dT2, c38634Gyb, c38644Gyl, c110414yD, c110414yD2, c110414yD3, c110394yB, c38321qM, c38321qM2, c37841pN, c38611qr, bool);
                if (c3xg.A06 == C1XV.A0Y && (A02 = A02(c3xg.A05)) != null && A02.getId() != null) {
                    if (c16l instanceof C07950bF) {
                        UserSession userSession = ((C07950bF) c16l).A01;
                        C1DW.A00(userSession).A01(A02, true, false);
                        if (z) {
                            return A00(c3xg, true, C18U.A06(C06090Tz.A05, userSession, 36313007889909349L));
                        }
                    } else if (!(c16l instanceof C07500aP)) {
                        C0w9.A03("feed_item_missing_session", "FeedItem JSON needs to be parsed using SessionAwareJsonParser");
                    }
                }
                return c3xg;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException(new Exception() { // from class: X.9tw
            });
        }
    }

    public static final boolean A04(Collection collection) {
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((C3XG) it.next()).A06 == C1XV.A0F) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
