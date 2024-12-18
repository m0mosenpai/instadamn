package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GeJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37439GeJ {
    public void A0H(C11520jB c11520jB) {
    }

    public static boolean A01(AbstractC12990ll abstractC12990ll) {
        return C18U.A06(C06090Tz.A05, abstractC12990ll, 36319596370140725L);
    }

    public int A04(Context context) {
        if (this instanceof C37434GeE) {
            if (A0Y()) {
                return C3HB.A00(context);
            }
            return 0;
        }
        if (this instanceof HL3) {
            return C3HB.A00(context);
        }
        if (this instanceof HL4) {
            return A00(context);
        }
        if (this instanceof C38285GsU) {
            return A00(context);
        }
        if (this instanceof HL1) {
            return A00(context);
        }
        if (this instanceof C39145HKy) {
            return A00(context);
        }
        if (this instanceof HL0) {
            return A00(context);
        }
        if (this instanceof C38281GsQ) {
            return A00(context);
        }
        if (this instanceof HL2) {
            return A00(context);
        }
        if (this instanceof C39146HKz) {
            return A00(context);
        }
        if (this instanceof C38286GsV) {
            return A00(context);
        }
        return A00(context);
    }

    public Hd8 A05() {
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && !(this instanceof HL4)) {
            if (this instanceof C38285GsU) {
                String str = ((C38285GsU) this).A0J;
                if (C14360o3.A0K(str, "feed_timeline_favorites")) {
                    return Hd8.A03;
                }
                if (C14360o3.A0K(str, "feed_timeline_fan_club")) {
                    return Hd8.A02;
                }
                return null;
            }
            if (!(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2)) {
                boolean z = this instanceof C39146HKz;
                return null;
            }
            return null;
        }
        return null;
    }

    public AnonymousClass341 A06() {
        if (!(this instanceof C37434GeE)) {
            if (this instanceof HL3) {
                return AnonymousClass341.A0Q;
            }
            if (this instanceof HL4) {
                return AnonymousClass341.A0M;
            }
            if (!(this instanceof C38285GsU)) {
                if (!(this instanceof HL1)) {
                    if (this instanceof C39145HKy) {
                        return AnonymousClass341.A06;
                    }
                    if (!(this instanceof HL0)) {
                        if (this instanceof C38281GsQ) {
                            return AnonymousClass341.A0S;
                        }
                        if (this instanceof HL2) {
                            return AnonymousClass341.A0F;
                        }
                        if (this instanceof C39146HKz) {
                            return AnonymousClass341.A0L;
                        }
                        if (this instanceof C38286GsV) {
                            return AnonymousClass341.A0E;
                        }
                        if (!(this instanceof HL5)) {
                            return AnonymousClass341.A02;
                        }
                    }
                }
            }
            return AnonymousClass341.A0H;
        }
        return AnonymousClass341.A0I;
    }

    public Integer A07() {
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && ((this instanceof HL4) || (this instanceof C38285GsU) || (this instanceof HL1) || (!(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2) && (this instanceof C39146HKz)))) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    public List A08() {
        String str;
        C110434yF c110434yF;
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && !(this instanceof HL4)) {
            if (this instanceof C38285GsU) {
                C38285GsU c38285GsU = (C38285GsU) this;
                C41577IaQ A00 = C41577IaQ.A01.A00(c38285GsU.A0D);
                String str2 = c38285GsU.A03;
                if (str2 != null && (c110434yF = (C110434yF) A00.A00.get(str2)) != null) {
                    List A0a = AbstractC001800i.A0a(c110434yF.A06);
                    if ("feed_timeline_older".equals(c38285GsU.A0J)) {
                        Iterator it = A0a.iterator();
                        while (it.hasNext()) {
                            C3XG A0D = AbstractC37300Gc1.A0D(it);
                            if (AbstractC37300Gc1.A0E(A0D) != null) {
                                C75113Zb BRa = c38285GsU.A0E.BRa(A0D);
                                C14360o3.A07(BRa);
                                BRa.A2a = AbstractC167007dF.A1X(A0D.A06, C1XV.A0H);
                            }
                        }
                        return A0a;
                    }
                    return A0a;
                }
            } else if (this instanceof HL1) {
                HL1 hl1 = (HL1) this;
                if (hl1 instanceof C39492HcK) {
                    C39492HcK c39492HcK = (C39492HcK) hl1;
                    List list = c39492HcK.A02;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C38321qM A0h = AbstractC25229BEm.A0h(c39492HcK.A00, AbstractC166987dD.A1B(it2));
                        if (A0h != null) {
                            A1E.add(C39492HcK.A02(A0h, c39492HcK));
                        }
                    }
                    if (list.isEmpty() || A1E.size() < list.size()) {
                        return null;
                    }
                    return A1E;
                }
            } else {
                if (!(this instanceof C39145HKy) && !(this instanceof HL0)) {
                    if (this instanceof C38281GsQ) {
                        return AbstractC166987dD.A1E();
                    }
                    if (!(this instanceof HL2) && !(this instanceof C39146HKz)) {
                        if (this instanceof C38286GsV) {
                            C38286GsV c38286GsV = (C38286GsV) this;
                            ArrayList A1E2 = AbstractC166987dD.A1E();
                            C1DX A002 = C1DW.A00(c38286GsV.A0E);
                            str = "intentAwareAdPivotState";
                            if (C38286GsV.A03(c38286GsV)) {
                                String str3 = c38286GsV.A05;
                                if (str3 != null) {
                                    IntentAwareAdPivotState intentAwareAdPivotState = c38286GsV.A02;
                                    if (intentAwareAdPivotState != null) {
                                        intentAwareAdPivotState.A00(str3).add(str3);
                                    }
                                }
                                IntentAwareAdPivotState intentAwareAdPivotState2 = c38286GsV.A02;
                                if (intentAwareAdPivotState2 != null) {
                                    Iterator it3 = intentAwareAdPivotState2.A00(c38286GsV.A05).iterator();
                                    while (it3.hasNext()) {
                                        C38286GsV.A02(A002, c38286GsV, AbstractC166987dD.A1B(it3), A1E2);
                                    }
                                    return A1E2;
                                }
                            } else {
                                IntentAwareAdPivotState intentAwareAdPivotState3 = c38286GsV.A02;
                                if (intentAwareAdPivotState3 != null) {
                                    Iterator it4 = intentAwareAdPivotState3.A0F.iterator();
                                    while (it4.hasNext()) {
                                        C38286GsV.A02(A002, c38286GsV, AbstractC166987dD.A1B(it4), A1E2);
                                    }
                                    return A1E2;
                                }
                            }
                        } else {
                            if (this instanceof HL5) {
                                return AbstractC166987dD.A1E();
                            }
                            HL6 hl6 = (HL6) this;
                            UserSession userSession = hl6.A08;
                            C06090Tz c06090Tz = C06090Tz.A06;
                            boolean A06 = C18U.A06(c06090Tz, userSession, 36321408846079379L);
                            ArrayList A1E3 = AbstractC166987dD.A1E();
                            if (A06) {
                                C1DX A003 = C1DW.A00(userSession);
                                C38801rC c38801rC = C38321qM.A0h;
                                String str4 = hl6.A03;
                                if (str4 == null) {
                                    str = "seedMediaId";
                                } else {
                                    String str5 = hl6.A02;
                                    if (str5 == null) {
                                        str = "seedMediaAuthorId";
                                    } else {
                                        C38321qM A02 = A003.A02(AbstractC37301Gc2.A0p(str4, str5));
                                        if (A02 != null && !AbstractC166997dE.A1Z(Boolean.valueOf(A02.CdW()), C18U.A06(c06090Tz, userSession, 36321408846144916L))) {
                                            A1E3.add(A02);
                                            return A1E3;
                                        }
                                        return A1E3;
                                    }
                                }
                            } else {
                                return A1E3;
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void A09() {
        if (this instanceof C37434GeE) {
            AbstractC37452GeW.A00(((C37434GeE) this).A07.A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0A() {
        C154796xU c154796xU;
        String str;
        HL2 hl2;
        HL2 hl22;
        if (this instanceof C38285GsU) {
            C38285GsU.A02(C1EN.A0H, (C38285GsU) this, false);
            return;
        }
        if (this instanceof C37434GeE) {
            C37434GeE c37434GeE = (C37434GeE) this;
            c37434GeE.A08.A00(null, new AnonymousClass500(c37434GeE.A07.A04), false, false, false, false);
            return;
        }
        if (this instanceof C38281GsQ) {
            C51017MgP c51017MgP = ((C38281GsQ) this).A00;
            if (c51017MgP == null) {
                str = "viewModel";
            } else {
                c51017MgP.A01();
                return;
            }
        } else {
            if (this instanceof HL3) {
                HL3 hl3 = (HL3) this;
                c154796xU = hl3.A00;
                hl22 = hl3;
            } else {
                if (this instanceof C38286GsV) {
                    C38286GsV c38286GsV = (C38286GsV) this;
                    boolean A03 = C38286GsV.A03(c38286GsV);
                    boolean z = true;
                    str = "intentAwareAdPivotState";
                    IntentAwareAdPivotState intentAwareAdPivotState = c38286GsV.A02;
                    if (A03) {
                        if (intentAwareAdPivotState != null) {
                            boolean containsKey = intentAwareAdPivotState.A07.containsKey(c38286GsV.A05);
                            String str2 = c38286GsV.A05;
                            if (containsKey) {
                                if (str2 != null) {
                                    IntentAwareAdPivotState intentAwareAdPivotState2 = c38286GsV.A02;
                                    if (intentAwareAdPivotState2 != null) {
                                        Boolean bool = (Boolean) intentAwareAdPivotState2.A07.get(str2);
                                        z = bool != null ? bool.booleanValue() : false;
                                    }
                                }
                                c38286GsV.A0R(z, false);
                                return;
                            }
                            if (str2 != null) {
                                IntentAwareAdPivotState intentAwareAdPivotState3 = c38286GsV.A02;
                                if (intentAwareAdPivotState3 != null) {
                                    intentAwareAdPivotState3.A07.put(str2, true);
                                }
                            }
                            c38286GsV.A0R(z, false);
                            return;
                        }
                    } else if (intentAwareAdPivotState != null) {
                        z = intentAwareAdPivotState.A0C;
                        c38286GsV.A0R(z, false);
                        return;
                    }
                    throw C00O.createAndThrow();
                }
                if (this instanceof HL4) {
                    HL4.A02((HL4) this, false);
                    return;
                }
                if (this instanceof HL1) {
                    return;
                }
                if (this instanceof C39145HKy) {
                    C39145HKy c39145HKy = (C39145HKy) this;
                    c154796xU = c39145HKy.A02;
                    hl22 = c39145HKy;
                } else {
                    if (this instanceof HL0) {
                        HL0 hl0 = (HL0) this;
                        if (hl0.A03.A00.A03.A03 == C05F.A00) {
                            return;
                        }
                        boolean A0T = hl0.A0T();
                        hl2 = hl0;
                        if (!A0T) {
                            return;
                        }
                        hl2.A0R(false, false);
                        return;
                    }
                    if (this instanceof HL2) {
                        HL2 hl23 = (HL2) this;
                        c154796xU = hl23.A00;
                        hl22 = hl23;
                        if (c154796xU == null) {
                            AbstractC37300Gc1.A0b();
                            throw C00O.createAndThrow();
                        }
                    } else {
                        if ((this instanceof C39146HKz) || (this instanceof HL5)) {
                            return;
                        }
                        A0R(false, false);
                        return;
                    }
                }
            }
            hl2 = hl22;
            if (c154796xU.A03.A03 == C05F.A00) {
                return;
            }
            hl2.A0R(false, false);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void A0B() {
        if (this instanceof C37434GeE) {
            C37434GeE c37434GeE = (C37434GeE) this;
            List list = c37434GeE.A0A;
            if (AbstractC166987dD.A1b(list)) {
                UserSession userSession = c37434GeE.A05;
                if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36319978623213448L)) {
                    Bundle bundle = c37434GeE.A02;
                    bundle.putInt("arg_user_feed_source", AbstractC37452GeW.A00(c37434GeE.A07.A00).A00);
                    bundle.putString("arg_user_feed_source_next_max_id", c37434GeE.A08.A03.A03.A07);
                    bundle.putStringArray("arg_user_feed_pending_media_ids", (String[]) list.toArray(new String[0]));
                    c37434GeE.A03.getParentFragmentManager().A0y(AbstractC111324zv.A00(5221), bundle);
                    return;
                }
                return;
            }
            return;
        }
        if ((this instanceof C38281GsQ) || (this instanceof HL3) || (this instanceof C38286GsV) || (this instanceof HL4)) {
            return;
        }
        if (this instanceof C38285GsU) {
            C38285GsU c38285GsU = (C38285GsU) this;
            C127085om A00 = AbstractC127075ol.A00(c38285GsU.A0D);
            String str = c38285GsU.A0J;
            String str2 = c38285GsU.A0I.A00;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(A00.A00, str), "instagram_feed_older_exit");
            if (!A0f.isSampled()) {
                return;
            }
            A0f.AAP("module", str);
            A0f.A9K("ig_media_id", Long.MIN_VALUE);
            A0f.AAP("inventory_source", "");
            A0f.AAP("ranking_info_token", str2);
            A0f.AAP("detail", str);
            A0f.Cht();
            return;
        }
        if (!(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof HL2)) {
        }
    }

    public void A0C() {
        java.util.Set set;
        List list;
        String str;
        if (this instanceof C37434GeE) {
            C37434GeE c37434GeE = (C37434GeE) this;
            String str2 = c37434GeE.A07.A04;
            UserSession userSession = c37434GeE.A05;
            User A0k = AbstractC31174DnI.A0k(userSession, str2);
            c37434GeE.A01 = A0k;
            if (A0k == null) {
                C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                A0M.A0R(C2045893s.class, C2046093u.class);
                A0M.A0B(MSV.A00(277));
                A0M.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
                C1ON A0T = AbstractC31172DnG.A0T(A0M, "from_module", c37434GeE.A09);
                C39030HGg.A00(A0T, c37434GeE, 37);
                Fragment fragment = c37434GeE.A03;
                C1GJ.A00(fragment.requireContext(), AbstractC018607g.A00(fragment), A0T);
                return;
            }
            return;
        }
        if (this instanceof HL3) {
            return;
        }
        if (this instanceof HL4) {
            HL4 hl4 = (HL4) this;
            Fragment fragment2 = hl4.A07;
            hl4.A00 = AbstractC37302Gc3.A0L(fragment2.requireContext(), fragment2, hl4.A08);
            return;
        }
        if (this instanceof C38285GsU) {
            C38285GsU c38285GsU = (C38285GsU) this;
            Fragment fragment3 = c38285GsU.A0A;
            Context context = fragment3.getContext();
            if (context != null) {
                c38285GsU.A01 = new C154796xU(context, AbstractC018607g.A00(fragment3), c38285GsU.A0D, c38285GsU.A05);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (this instanceof HL1) {
            HL1 hl1 = (HL1) this;
            Fragment fragment4 = hl1.A01;
            hl1.A00 = AbstractC37302Gc3.A0L(fragment4.requireContext(), fragment4, hl1.A02);
            return;
        }
        if ((this instanceof C39145HKy) || (this instanceof HL0)) {
            return;
        }
        if (this instanceof C38281GsQ) {
            C38281GsQ c38281GsQ = (C38281GsQ) this;
            String str3 = c38281GsQ.A07;
            String str4 = c38281GsQ.A08;
            String str5 = c38281GsQ.A06;
            UserSession userSession2 = c38281GsQ.A02;
            Fragment fragment5 = c38281GsQ.A01;
            Context requireContext = fragment5.requireContext();
            C14360o3.A0B(userSession2, 0);
            C51017MgP c51017MgP = (C51017MgP) new C52942bb(new C39055HHf(userSession2, new AbstractC41190ILd(AbstractC111324zv.A00(2353), "top_serp", new JEZ(userSession2, 0)), c38281GsQ.A04, (C55168OdW) userSession2.A01(C55168OdW.class, new X2z(requireContext.getApplicationContext(), 24)), str3, str4, str5), fragment5).A00(C51017MgP.class);
            c38281GsQ.A00 = c51017MgP;
            str = "viewModel";
            if (c51017MgP != null) {
                AbstractC37301Gc2.A0w(fragment5, c51017MgP.A00, new JEZ(c38281GsQ, 11), 5);
                C51017MgP c51017MgP2 = c38281GsQ.A00;
                if (c51017MgP2 != null) {
                    AbstractC37301Gc2.A0w(fragment5, c51017MgP2.A01, new JEZ(c38281GsQ, 12), 5);
                    return;
                }
            }
        } else {
            if (this instanceof HL2) {
                HL2 hl2 = (HL2) this;
                hl2.A00 = new C154796xU(hl2.A01, hl2.A02, hl2.A03, hl2.A05.A01);
                return;
            }
            if (this instanceof C39146HKz) {
                C39146HKz c39146HKz = (C39146HKz) this;
                Fragment fragment6 = c39146HKz.A01;
                c39146HKz.A00 = AbstractC37302Gc3.A0L(fragment6.requireContext(), fragment6, c39146HKz.A02);
                return;
            }
            if (this instanceof C38286GsV) {
                C38286GsV c38286GsV = (C38286GsV) this;
                Bundle bundle = c38286GsV.A0C;
                c38286GsV.A0B = bundle.getString(AbstractC111324zv.A00(196), "");
                c38286GsV.A09 = bundle.getString("contextual_feed_seed_ad_tracking_token", "");
                c38286GsV.A0A = bundle.getString(AbstractC111324zv.A00(379), "");
                c38286GsV.A01 = bundle.getInt("contextual_feed_ad_pivot_type", -1);
                IntentAwareAdPivotState intentAwareAdPivotState = (IntentAwareAdPivotState) bundle.getParcelable(AbstractC111324zv.A00(378));
                if (intentAwareAdPivotState != null) {
                    c38286GsV.A02 = intentAwareAdPivotState;
                    c38286GsV.A03 = bundle.getString("contextual_feed_category_hash_id", "");
                    c38286GsV.A08 = bundle.getString("contextual_feed_multi_ad_unit_id", "");
                    c38286GsV.A00 = bundle.getInt("contextual_feed_multi_ad_unit_chaining_position", -1);
                    c38286GsV.A07 = bundle.getString("contextual_feed_inventory_source");
                    c38286GsV.A05 = bundle.getString("contextual_feed_individual_ad_media_id");
                    c38286GsV.A06 = bundle.getString("contextual_feed_individual_ad_tracking_token");
                    c38286GsV.A04 = bundle.getString("contextual_feed_individual_ad_ad_id");
                    C669430l c669430l = c38286GsV.A0H;
                    if (c669430l != null) {
                        C39030HGg c39030HGg = c38286GsV.A0D;
                        C14360o3.A0B(c39030HGg, 0);
                        c669430l.A0J.A01 = c39030HGg;
                    }
                    boolean A03 = C38286GsV.A03(c38286GsV);
                    str = "intentAwareAdPivotState";
                    set = c38286GsV.A0J;
                    IntentAwareAdPivotState intentAwareAdPivotState2 = c38286GsV.A02;
                    if (A03) {
                        if (intentAwareAdPivotState2 != null) {
                            list = intentAwareAdPivotState2.A00(c38286GsV.A05);
                            set.addAll(list);
                            return;
                        }
                    } else if (intentAwareAdPivotState2 != null) {
                        list = intentAwareAdPivotState2.A0F;
                        set.addAll(list);
                        return;
                    }
                } else {
                    throw AbstractC166987dD.A14("Unexpected state");
                }
            } else {
                if (this instanceof HL5) {
                    return;
                }
                HL6 hl6 = (HL6) this;
                Bundle bundle2 = hl6.A05;
                hl6.A03 = bundle2.getString(AbstractC111324zv.A00(196), "");
                hl6.A02 = bundle2.getString(AbstractC111324zv.A00(379), "");
                hl6.A01 = bundle2.getString(AbstractC111324zv.A00(849), "");
                IntentAwareAdPivotState intentAwareAdPivotState3 = (IntentAwareAdPivotState) bundle2.getParcelable(AbstractC111324zv.A00(378));
                if (intentAwareAdPivotState3 != null) {
                    hl6.A00 = intentAwareAdPivotState3;
                    C42948Iz0 c42948Iz0 = hl6.A07;
                    if (c42948Iz0 != null) {
                        IBV ibv = hl6.A06;
                        C14360o3.A0B(ibv, 0);
                        c42948Iz0.A07.A01 = ibv;
                    }
                    set = hl6.A0C;
                    IntentAwareAdPivotState intentAwareAdPivotState4 = hl6.A00;
                    if (intentAwareAdPivotState4 == null) {
                        str = "intentAwareAdPivotState";
                    } else {
                        list = intentAwareAdPivotState4.A0F;
                        set.addAll(list);
                        return;
                    }
                } else {
                    throw AbstractC166987dD.A14("Unexpected state");
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public void A0D() {
        C42948Iz0 c42948Iz0;
        if (this instanceof C37434GeE) {
            C37434GeE c37434GeE = (C37434GeE) this;
            AbstractC25651Mw.A00(c37434GeE.A05).A02(c37434GeE.A04, C154976xm.class);
            return;
        }
        if (this instanceof HL3) {
            return;
        }
        if (this instanceof C38285GsU) {
            ((C38285GsU) this).A0G.onStop();
            return;
        }
        if (this instanceof C38281GsQ) {
            return;
        }
        if (this instanceof C38286GsV) {
            C669430l c669430l = ((C38286GsV) this).A0H;
            if (c669430l == null) {
                return;
            }
            c669430l.A04();
            return;
        }
        if ((this instanceof HL4) || (this instanceof HL1) || (this instanceof C39145HKy) || (this instanceof HL0) || (this instanceof HL2) || (this instanceof C39146HKz) || (this instanceof HL5) || (c42948Iz0 = ((HL6) this).A07) == null || c42948Iz0.A02 != C05F.A01) {
            return;
        }
        c42948Iz0.A07.A02 = false;
        c42948Iz0.A08.A00();
        c42948Iz0.A02 = C05F.A00;
    }

    public void A0E() {
        String str;
        String id;
        if (!(this instanceof C37434GeE) && !(this instanceof C38285GsU)) {
            if (this instanceof C38281GsQ) {
                C38281GsQ c38281GsQ = (C38281GsQ) this;
                c38281GsQ.A04.A01();
                C51017MgP c51017MgP = c38281GsQ.A00;
                if (c51017MgP == null) {
                    str = "viewModel";
                } else {
                    ContextualFeedFragment contextualFeedFragment = c38281GsQ.A05.A00;
                    if (contextualFeedFragment.mView != null) {
                        C3FQ scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
                        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = contextualFeedFragment.A06;
                        if (viewOnTouchListenerC60632pm == null) {
                            str = "_helper";
                        } else {
                            int B6q = scrollingViewProxy.B6q();
                            if (scrollingViewProxy.AnZ() > 0 && scrollingViewProxy.AnU(0).getBottom() <= viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01) {
                                B6q++;
                            }
                            if (B6q >= 0) {
                                HY4 hy4 = contextualFeedFragment.A0N;
                                str = "adapter";
                                if (hy4 != null) {
                                    if (B6q < hy4.getItemCount()) {
                                        HY4 hy42 = contextualFeedFragment.A0N;
                                        if (hy42 != null) {
                                            Object item = hy42.getItem(B6q);
                                            if (item instanceof C38321qM) {
                                                C38321qM c38321qM = (C38321qM) item;
                                                if (c38321qM.CdW() && c38321qM.getId() != contextualFeedFragment.A0S) {
                                                    int BM3 = contextualFeedFragment.getScrollingViewProxy().BM3();
                                                    if (BM3 >= 0) {
                                                        HY4 hy43 = contextualFeedFragment.A0N;
                                                        if (hy43 != null) {
                                                            if (BM3 < hy43.getItemCount()) {
                                                                HY4 hy44 = contextualFeedFragment.A0N;
                                                                if (hy44 != null) {
                                                                    Object item2 = hy44.getItem(BM3);
                                                                    if (item2 instanceof C38321qM) {
                                                                        id = AbstractC37300Gc1.A0V(item2);
                                                                    } else {
                                                                        return;
                                                                    }
                                                                }
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        return;
                                                    }
                                                } else {
                                                    id = c38321qM.getId();
                                                }
                                                if (id != null) {
                                                    c51017MgP.A05.A04(c51017MgP.A07, c51017MgP.A08, id);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (!(this instanceof HL3) && !(this instanceof C38286GsV) && !(this instanceof HL4) && !(this instanceof HL1) && !(this instanceof C39145HKy) && (this instanceof HL0)) {
                HL0 hl0 = (HL0) this;
                String A00 = hl0.A05.A00();
                if (A00 != null && A00.length() != 0) {
                    UserSession userSession = hl0.A00;
                    C14360o3.A0B(userSession, 0);
                    AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) userSession.A01(HKI.class, J85.A00);
                    String str2 = hl0.A04.A04;
                    if (str2 != null) {
                        abstractC69735VuV.A01(str2).A02 = A00;
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    public final void A0F() {
        if (this instanceof C38285GsU) {
            C38285GsU c38285GsU = (C38285GsU) this;
            if (c38285GsU.A08) {
                C38285GsU.A02(C1EN.A0F, c38285GsU, true);
                c38285GsU.A08 = false;
            }
        }
    }

    public void A0G(InterfaceC56362iU interfaceC56362iU) {
        String str;
        FollowStatus followStatus;
        User user;
        if (this instanceof C37434GeE) {
            C37434GeE c37434GeE = (C37434GeE) this;
            int i = c37434GeE.A07.A00;
            if ((AbstractC37452GeW.A00(i) == EnumC125775mS.A09 || AbstractC37452GeW.A00(i) == EnumC125775mS.A08) && C17060sy.A01.A01(c37434GeE.A05).equals(c37434GeE.A01) && c37434GeE.A0B) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A0K = c37434GeE.A03.getString(2131952198);
                AbstractC31176DnK.A1B(new ViewOnClickListenerC37847Gl1(c37434GeE, 21), A0B, interfaceC56362iU);
            }
            UserSession userSession = c37434GeE.A05;
            if (!C2TN.A05(userSession, AbstractC25231BEo.A0t(c37434GeE.A01)) && (user = c37434GeE.A01) != null) {
                followStatus = user.B7L();
            } else {
                followStatus = FollowStatus.A08;
            }
            if (followStatus == FollowStatus.A06 && C18U.A06(C06090Tz.A05, userSession, 36312475313898624L)) {
                User user2 = c37434GeE.A01;
                ViewOnClickListenerC42027Ijw viewOnClickListenerC42027Ijw = new ViewOnClickListenerC42027Ijw(10, user2, c37434GeE);
                C3LO A0B2 = AbstractC31171DnF.A0B();
                A0B2.A0A = R.layout.fade_in_follow_overflow_switcher;
                A0B2.A05 = 2131962676;
                A0B2.A0G = viewOnClickListenerC42027Ijw;
                View AAB = interfaceC56362iU.AAB(new C3LY(A0B2));
                C14360o3.A0C(AAB, "null cannot be cast to non-null type com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton");
                FadeInFollowButton fadeInFollowButton = (FadeInFollowButton) AAB;
                fadeInFollowButton.A04(true, userSession);
                if (user2 != null) {
                    AbstractC99834e5.A02(fadeInFollowButton, userSession, user2.getId());
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof C38285GsU) {
            C38285GsU c38285GsU = (C38285GsU) this;
            if (!"feed_timeline_favorites".equals(c38285GsU.A0J)) {
                return;
            }
            C3LO A0B3 = AbstractC31171DnF.A0B();
            A0B3.A06 = R.drawable.instagram_star_list_pano_outline_24;
            A0B3.A05 = 2131966006;
            A0B3.A0G = new ViewOnClickListenerC37847Gl1(c38285GsU, 22);
            A0B3.A0N = true;
            interfaceC56362iU.AA9(new C3LY(A0B3));
            return;
        }
        if (this instanceof HL3) {
            HL3 hl3 = (HL3) this;
            str = hl3.A03;
            if (str != null) {
                String str2 = hl3.A02;
                if (str2 != null) {
                    interfaceC56362iU.EaW(str, str2);
                    return;
                }
            } else {
                str = hl3.A06.A0G;
            }
        } else if (this instanceof HL4) {
            str = ((HL4) this).A07.getString(2131969182);
        } else {
            if (this instanceof HL1) {
                return;
            }
            if (this instanceof C39145HKy) {
                str = "Posts";
            } else {
                if (this instanceof HL0) {
                    return;
                }
                if (this instanceof C38281GsQ) {
                    str = ((C38281GsQ) this).A09;
                } else {
                    if (this instanceof HL2) {
                        HL2 hl2 = (HL2) this;
                        AbstractC25235BEs.A1H(interfaceC56362iU);
                        String str3 = hl2.A06;
                        if (str3 != null) {
                            interfaceC56362iU.EaW(hl2.A01.getString(2131965122), str3);
                            return;
                        } else {
                            interfaceC56362iU.Efu(2131965122);
                            return;
                        }
                    }
                    if (!(this instanceof C39146HKz)) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        interfaceC56362iU.setTitle(str);
    }

    public void A0I(InterfaceC41141vN interfaceC41141vN) {
        C75113Zb BRb;
        if (this instanceof HL4) {
            HL4 hl4 = (HL4) this;
            C14360o3.A0B(interfaceC41141vN, 0);
            if ((interfaceC41141vN instanceof C42258Ini) && hl4.A0B != null) {
                C6WQ c6wq = hl4.A0A;
                if (c6wq.isShowing()) {
                    c6wq.dismiss();
                }
                C42258Ini c42258Ini = (C42258Ini) interfaceC41141vN;
                String str = c42258Ini.A01;
                Fragment fragment = hl4.A07;
                Context requireContext = fragment.requireContext();
                if (!hl4.A05 && str != null && str.equals("cannot accept more than max number of subposts")) {
                    hl4.A05 = true;
                    FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        new IL2(activity).A00(DialogInterfaceOnClickListenerC41836Ifq.A00(hl4, 38), hl4.A08, null, C05F.A0C);
                    }
                } else if (!hl4.A06 && str != null && !str.equals("cannot accept more than max number of subposts")) {
                    hl4.A06 = true;
                    int i = 2131969148;
                    if (c42258Ini.A04) {
                        i = 2131969147;
                    }
                    IQU.A00(requireContext, i);
                } else {
                    if (c42258Ini.A00 != null && fragment.mView != null) {
                        if (c42258Ini.A04) {
                            IQU.A01(requireContext, new C42690Iul(hl4, 4), AbstractC166997dE.A0p(requireContext, 2131969167), c42258Ini.A02);
                        } else {
                            C9GR.A01(requireContext, null, 2131969168, 0);
                        }
                        if (!AbstractC167007dF.A1Z(hl4.A0C)) {
                            hl4.A0R(true, true);
                        }
                    }
                    if (str == null) {
                        return;
                    }
                }
                if (AbstractC167007dF.A1Z(hl4.A0C)) {
                    String str2 = c42258Ini.A03;
                    if (str2 != null && (BRb = hl4.A09.BRb(str2)) != null) {
                        BRb.A2l = false;
                    }
                    hl4.A0R(true, false);
                    return;
                }
                return;
            }
            return;
        }
        if (!(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C37434GeE) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL3) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
        }
    }

    public void A0J(InterfaceC41141vN interfaceC41141vN) {
        C6WQ c6wq;
        int i;
        JIJ jij;
        List AZV;
        if (this instanceof HL4) {
            HL4 hl4 = (HL4) this;
            C14360o3.A0B(interfaceC41141vN, 0);
            if ((interfaceC41141vN instanceof C42254Ine) && hl4.A0B != null) {
                C42254Ine c42254Ine = (C42254Ine) interfaceC41141vN;
                String str = c42254Ine.A01;
                hl4.A02 = str;
                hl4.A06 = false;
                Context requireContext = hl4.A07.requireContext();
                boolean A1Z = AbstractC167007dF.A1Z(hl4.A0C);
                boolean z = c42254Ine.A02;
                if (A1Z) {
                    int i2 = 2131969142;
                    if (z) {
                        i2 = 2131969105;
                    }
                    IQU.A01(requireContext, new C42690Iul(hl4, 4), AbstractC166997dE.A0p(requireContext, i2), c42254Ine.A00);
                    if (str != null && (AZV = (jij = hl4.A09).AZV()) != null) {
                        Iterator it = AZV.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C3XG A0D = AbstractC37300Gc1.A0D(it);
                            C38321qM A0E = AbstractC37300Gc1.A0E(A0D);
                            if (A0E != null && C14360o3.A0K(A0E.A2u(), str)) {
                                jij.BRa(A0D).A2l = true;
                                jij.EFT(A0D);
                                break;
                            }
                        }
                    }
                    JIJ jij2 = hl4.A09;
                    List AZV2 = jij2.AZV();
                    if (AZV2 != null) {
                        Iterator it2 = AZV2.iterator();
                        while (it2.hasNext()) {
                            C3XG A0D2 = AbstractC37300Gc1.A0D(it2);
                            if (AbstractC37300Gc1.A0E(A0D2) != null && !jij2.BRa(A0D2).A2l) {
                                return;
                            }
                        }
                        if (hl4.A04) {
                            return;
                        }
                        HL4.A03(hl4, true);
                        return;
                    }
                    return;
                }
                if (z) {
                    hl4.A05 = false;
                    c6wq = hl4.A0A;
                    i = 2131969104;
                } else {
                    c6wq = hl4.A0A;
                    i = 2131969142;
                }
                c6wq.A00(requireContext.getString(i));
                C0fJ.A00(c6wq);
                return;
            }
            return;
        }
        if (!(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C37434GeE) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL3) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
        }
    }

    public final void A0K(C25671My c25671My) {
        if (this instanceof C38285GsU) {
            C38285GsU c38285GsU = (C38285GsU) this;
            c25671My.A01(c38285GsU.A0B, C70123Cw.class);
            c25671My.A01(c38285GsU.A0C, C70143Cy.class);
        }
    }

    public final void A0L(C25671My c25671My) {
        if (this instanceof C38285GsU) {
            C38285GsU c38285GsU = (C38285GsU) this;
            c25671My.A02(c38285GsU.A0B, C70123Cw.class);
            c25671My.A02(c38285GsU.A0C, C70143Cy.class);
        }
    }

    public void A0M(AnonymousClass391 anonymousClass391) {
        if (this instanceof C37434GeE) {
            C37434GeE c37434GeE = (C37434GeE) this;
            C14360o3.A0B(anonymousClass391, 0);
            String str = c37434GeE.A09;
            if ((C14360o3.A0K(str, "feed_contextual_self_profile") || C14360o3.A0K(str, AbstractC111324zv.A00(4444))) && AbstractC37452GeW.A00(c37434GeE.A07.A00) == EnumC125775mS.A06) {
                anonymousClass391.A0c = true;
                anonymousClass391.A0L = new C42761Ivz(c37434GeE);
                AbstractC25651Mw.A00(c37434GeE.A05).A01(c37434GeE.A04, C154976xm.class);
                return;
            }
            return;
        }
        if (this instanceof HL3) {
            HL3 hl3 = (HL3) this;
            anonymousClass391.A0M = hl3.A01;
            anonymousClass391.A0N = hl3.A07;
        } else if (!(this instanceof HL4) && !(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
        }
    }

    public void A0N(User user) {
        if (!(this instanceof HL4)) {
            if (this instanceof C38285GsU) {
                ((C38285GsU) this).A0E.AVM(user);
                return;
            }
            if (!(this instanceof HL1) && !(this instanceof C37434GeE) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL3) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
            }
        }
    }

    public void A0O(User user) {
        if (!(this instanceof HL4)) {
            if (this instanceof C38285GsU) {
                ((C38285GsU) this).A0E.AVM(user);
                return;
            }
            if (!(this instanceof HL1) && !(this instanceof C37434GeE) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL3) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
            }
        }
    }

    public void A0P(String str) {
        if (!(this instanceof HL4)) {
            if (this instanceof C38285GsU) {
                ((C38285GsU) this).A0E.F9B(str);
                return;
            }
            if (!(this instanceof HL1) && !(this instanceof C37434GeE) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL3) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
            }
        }
    }

    public void A0Q(List list) {
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && !(this instanceof HL4) && !(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2)) {
            boolean z = this instanceof C39146HKz;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0R(boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37439GeJ.A0R(boolean, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0S() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.HL4
            if (r0 != 0) goto L31
            boolean r0 = r3 instanceof X.C38285GsU
            if (r0 == 0) goto L1f
            r0 = r3
            X.GsU r0 = (X.C38285GsU) r0
            java.lang.String r1 = r0.A0J
            int r0 = r1.hashCode()
            r2 = 0
            switch(r0) {
                case 227128404: goto L25;
                case 1970940954: goto L16;
                default: goto L15;
            }
        L15:
            return r2
        L16:
            java.lang.String r0 = "feed_timeline_favorites"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            return r2
        L1f:
            boolean r0 = r3 instanceof X.C39146HKz
            if (r0 != 0) goto L31
            r2 = 0
            return r2
        L25:
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
        L31:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37439GeJ.A0S():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0T() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37439GeJ.A0T():boolean");
    }

    public boolean A0U() {
        if (this instanceof C37434GeE) {
            return C18U.A06(C06090Tz.A05, ((C37434GeE) this).A05, 36319596370075188L);
        }
        if (this instanceof HL3) {
            return A01(((HL3) this).A04);
        }
        if (this instanceof HL4) {
            return A01(((HL4) this).A08);
        }
        if (!(this instanceof C38285GsU)) {
            if (this instanceof HL1) {
                return A01(((HL1) this).A02);
            }
            if (this instanceof C39145HKy) {
                return A01(((C39145HKy) this).A00);
            }
            if (this instanceof HL0) {
                return A01(((HL0) this).A00);
            }
            if (this instanceof C38281GsQ) {
                return A01(((C38281GsQ) this).A02);
            }
            if (this instanceof HL2) {
                return A01(((HL2) this).A03);
            }
            if (this instanceof C39146HKz) {
                return A01(((C39146HKz) this).A02);
            }
            return false;
        }
        return false;
    }

    public boolean A0V() {
        Integer num;
        if (this instanceof C37434GeE) {
            return ((C37434GeE) this).A08.A01();
        }
        if (!(this instanceof C38286GsV)) {
            if (this instanceof HL3) {
                return AbstractC37303Gc4.A1b(((HL3) this).A00);
            }
            if (this instanceof HL1) {
                C154796xU c154796xU = ((HL1) this).A00;
                if (c154796xU == null) {
                    AbstractC37300Gc1.A0b();
                    throw C00O.createAndThrow();
                }
                return AbstractC37303Gc4.A1b(c154796xU);
            }
            if (this instanceof C38281GsQ) {
                C51017MgP c51017MgP = ((C38281GsQ) this).A00;
                if (c51017MgP == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                return C14360o3.A0K(c51017MgP.A00.A02(), NUd.A00);
            }
            if (this instanceof C38285GsU) {
                C154796xU c154796xU2 = ((C38285GsU) this).A01;
                if (c154796xU2 != null) {
                    num = c154796xU2.A03.A03;
                } else {
                    num = null;
                }
                return AbstractC167007dF.A1X(num, C05F.A01);
            }
            if (this instanceof HL4) {
                C154796xU c154796xU3 = ((HL4) this).A00;
                if (c154796xU3 == null) {
                    AbstractC37300Gc1.A0b();
                    throw C00O.createAndThrow();
                }
                return AbstractC37303Gc4.A1b(c154796xU3);
            }
            if (this instanceof C39145HKy) {
                return AbstractC37303Gc4.A1b(((C39145HKy) this).A02);
            }
            if (this instanceof HL0) {
                return AbstractC37303Gc4.A1b(((HL0) this).A03.A00);
            }
            if (this instanceof HL2) {
                C154796xU c154796xU4 = ((HL2) this).A00;
                if (c154796xU4 == null) {
                    AbstractC37300Gc1.A0b();
                    throw C00O.createAndThrow();
                }
                return AbstractC37303Gc4.A1b(c154796xU4);
            }
            if (this instanceof C39146HKz) {
                C154796xU c154796xU5 = ((C39146HKz) this).A00;
                if (c154796xU5 == null) {
                    AbstractC37300Gc1.A0b();
                    throw C00O.createAndThrow();
                }
                return AbstractC37303Gc4.A1b(c154796xU5);
            }
            return false;
        }
        return false;
    }

    public final boolean A0W() {
        if (this instanceof HL6) {
            return ((HL6) this).A04;
        }
        return false;
    }

    public boolean A0X() {
        C42948Iz0 c42948Iz0;
        Integer num;
        if (this instanceof C37434GeE) {
            return ((C37434GeE) this).A08.A02();
        }
        if (this instanceof HL3) {
            return AbstractC37303Gc4.A1a(((HL3) this).A00);
        }
        if (this instanceof C38285GsU) {
            C154796xU c154796xU = ((C38285GsU) this).A01;
            if (c154796xU != null) {
                num = c154796xU.A03.A03;
            } else {
                num = null;
            }
            return AbstractC167007dF.A1X(num, C05F.A00);
        }
        if (this instanceof C38281GsQ) {
            C51017MgP c51017MgP = ((C38281GsQ) this).A00;
            if (c51017MgP == null) {
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
            return C14360o3.A0K(c51017MgP.A00.A02(), NUe.A00);
        }
        if (this instanceof C38286GsV) {
            C669430l c669430l = ((C38286GsV) this).A0H;
            if (c669430l != null) {
                return c669430l.CUl();
            }
            return false;
        }
        if (this instanceof HL1) {
            C154796xU c154796xU2 = ((HL1) this).A00;
            if (c154796xU2 == null) {
                AbstractC37300Gc1.A0b();
                throw C00O.createAndThrow();
            }
            return AbstractC37303Gc4.A1a(c154796xU2);
        }
        if (this instanceof HL4) {
            C154796xU c154796xU3 = ((HL4) this).A00;
            if (c154796xU3 == null) {
                AbstractC37300Gc1.A0b();
                throw C00O.createAndThrow();
            }
            return AbstractC37303Gc4.A1a(c154796xU3);
        }
        if (this instanceof C39145HKy) {
            return AbstractC37303Gc4.A1a(((C39145HKy) this).A02);
        }
        if (this instanceof HL0) {
            return AbstractC37303Gc4.A1a(((HL0) this).A03.A00);
        }
        if (this instanceof HL2) {
            C154796xU c154796xU4 = ((HL2) this).A00;
            if (c154796xU4 == null) {
                AbstractC37300Gc1.A0b();
                throw C00O.createAndThrow();
            }
            return AbstractC37303Gc4.A1a(c154796xU4);
        }
        if (this instanceof C39146HKz) {
            C154796xU c154796xU5 = ((C39146HKz) this).A00;
            if (c154796xU5 == null) {
                AbstractC37300Gc1.A0b();
                throw C00O.createAndThrow();
            }
            return AbstractC37303Gc4.A1a(c154796xU5);
        }
        if (!(this instanceof HL5) && (c42948Iz0 = ((HL6) this).A07) != null) {
            return c42948Iz0.CUl();
        }
        return false;
    }

    public boolean A0Y() {
        if (this instanceof C37434GeE) {
            UserSession userSession = ((C37434GeE) this).A05;
            return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36317534786032986L);
        }
        if (!(this instanceof HL3) && !(this instanceof C38285GsU) && !(this instanceof HL4) && !(this instanceof HL1)) {
            if (this instanceof C39145HKy) {
                return false;
            }
            if (!(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2)) {
                boolean z = this instanceof C39146HKz;
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean A0Z() {
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && !(this instanceof HL4)) {
            if (!(this instanceof C38285GsU)) {
                if (!(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2) && !(this instanceof C39146HKz)) {
                    if (this instanceof C38286GsV) {
                        C38286GsV c38286GsV = (C38286GsV) this;
                        if (!C38286GsV.A03(c38286GsV)) {
                            List AZV = c38286GsV.A0F.AZV();
                            C14360o3.A07(AZV);
                            if (!C14360o3.A0K(AbstractC25231BEo.A0s((C38321qM) AbstractC001800i.A0L(AZV)), c38286GsV.A05)) {
                                return false;
                            }
                        }
                    } else if (!(this instanceof HL5)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean A0a() {
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && !(this instanceof HL4) && !(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C39145HKy)) {
            if (this instanceof HL0) {
                return true;
            }
            if (!(this instanceof C38281GsQ) && !(this instanceof HL2)) {
                boolean z = this instanceof C39146HKz;
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean A0b() {
        if (!(this instanceof C37434GeE)) {
            if (this instanceof HL3) {
                return ((HL3) this).A00.A06();
            }
            if (!(this instanceof HL4) && !(this instanceof C38285GsU)) {
                if (this instanceof HL1) {
                    return false;
                }
                if (!(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2)) {
                    boolean z = this instanceof C39146HKz;
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean A0c() {
        if (this instanceof C37434GeE) {
            return true;
        }
        if (!(this instanceof HL3) && !(this instanceof HL4)) {
            if (this instanceof C38285GsU) {
                return C18U.A06(C06090Tz.A05, ((C38285GsU) this).A0D, 36314433819052596L);
            }
            if (!(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0) && !(this instanceof C38281GsQ) && !(this instanceof HL2)) {
                boolean z = this instanceof C39146HKz;
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0d() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.HL3
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.C37434GeE
            if (r0 == 0) goto L2a
            r0 = r4
            X.GeE r0 = (X.C37434GeE) r0
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36317534786032986(0x81069b000a155a, double:3.0306934654373314E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L28
            r0 = 36317534786622818(0x81069b00131562, double:3.0306934658103435E-306)
        L21:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L29
        L28:
            r1 = 0
        L29:
            return r1
        L2a:
            boolean r0 = r4 instanceof X.C38285GsU
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.HL4
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.HL1
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.C39145HKy
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.HL0
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.C38281GsQ
            if (r0 == 0) goto L5c
            r0 = r4
            X.GsQ r0 = (X.C38281GsQ) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36317534786164060(0x81069b000c155c, double:3.030693465520223E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L28
            r0 = 36317534786229597(0x81069b000d155d, double:3.030693465561669E-306)
            goto L21
        L5c:
            boolean r0 = r4 instanceof X.HL2
            if (r0 != 0) goto L28
            boolean r0 = r4 instanceof X.C39146HKz
            if (r0 == 0) goto L28
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37439GeJ.A0d():boolean");
    }

    public boolean A0e() {
        if (this instanceof C37434GeE) {
            return AbstractC167007dF.A1X(AbstractC37452GeW.A00(((C37434GeE) this).A07.A00), EnumC125775mS.A09);
        }
        if (!(this instanceof HL3)) {
            if (!(this instanceof HL4) && !(this instanceof C38285GsU)) {
                if (!(this instanceof HL1)) {
                    if (!(this instanceof C39145HKy)) {
                        if (!(this instanceof HL0) && !(this instanceof C38281GsQ)) {
                            if ((this instanceof HL2) || (this instanceof C39146HKz)) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0f() {
        if (!(this instanceof C37434GeE) && !(this instanceof HL3) && !(this instanceof HL4) && !(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C39145HKy)) {
            if (this instanceof HL0) {
                return true;
            }
            if (!(this instanceof C38281GsQ) && !(this instanceof HL2)) {
                boolean z = this instanceof C39146HKz;
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean A0g(C38321qM c38321qM) {
        if (!(this instanceof HL3)) {
            if (this instanceof C37434GeE) {
                C37434GeE c37434GeE = (C37434GeE) this;
                boolean A05 = C2TN.A05(c37434GeE.A05, AbstractC25231BEo.A0t(c37434GeE.A01));
                int i = c37434GeE.A07.A00;
                boolean A1X = AbstractC167007dF.A1X(AbstractC37452GeW.A00(i), EnumC125775mS.A06);
                boolean A1X2 = AbstractC167007dF.A1X(AbstractC37452GeW.A00(i), EnumC125775mS.A0A);
                if (!c38321qM.A5P() || !A05 || !A1X2 || !A1X || c38321qM.A6C()) {
                    return true;
                }
                return false;
            }
            if (!(this instanceof C38281GsQ) && !(this instanceof C38286GsV) && !(this instanceof HL4) && !(this instanceof C38285GsU) && !(this instanceof HL1) && !(this instanceof C39145HKy) && !(this instanceof HL0)) {
                boolean z = this instanceof HL2;
                return true;
            }
            return true;
        }
        return true;
    }

    public static int A00(Context context) {
        return C3HB.A00(context);
    }
}
