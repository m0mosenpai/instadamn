package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64042vP {
    public InterfaceC65282xQ A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C1M1 A04;
    public final InterfaceC11380iw A05;

    public C64042vP(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c1m1, 2);
        this.A02 = userSession;
        this.A04 = c1m1;
        this.A05 = interfaceC11380iw;
        this.A03 = interfaceC60442pS;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = interfaceC11380iw;
        this.A01 = c12210kP.A00();
    }

    public final void A09(C38321qM c38321qM, HBC hbc, Integer num, String str) {
        long j;
        Integer num2;
        int A00;
        Long l;
        Long l2;
        User A2E;
        String A2u;
        String A07;
        C14360o3.A0B(str, 2);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(1017));
        if (A002.isSampled()) {
            boolean z = false;
            if (c38321qM != null && !c38321qM.CdW()) {
                z = true;
            }
            if (num != null) {
                j = num.intValue();
            } else {
                j = -1;
            }
            A002.A9K("hscroll_seed_ad_position", Long.valueOf(j));
            A002.AAP("client_session_id", this.A04.getSessionId());
            A002.AAP("contextual_ads_category", "");
            A002.A9K("chaining_position", 0L);
            A002.AAP("chaining_session_id", "");
            A002.AAP("invalidation_reason", str);
            if (hbc != null) {
                A00 = hbc.A00;
            } else {
                if (c38321qM != null && !c38321qM.CdW()) {
                    num2 = C05F.A0j;
                } else {
                    num2 = C05F.A0N;
                }
                A00 = C5MB.A00(num2);
            }
            A002.A9K("multi_ads_type_number", Long.valueOf(A00));
            Long l3 = null;
            if (!z && c38321qM != null && (A07 = AbstractC41071vF.A07(this.A02, c38321qM)) != null) {
                l = AbstractC003100w.A0k(10, A07);
            } else {
                l = null;
            }
            A002.A9K("hscroll_seed_ad_id", l);
            if (z && c38321qM != null && (A2u = c38321qM.A2u()) != null) {
                l2 = AbstractC003100w.A0k(10, A2u);
            } else {
                l2 = null;
            }
            A002.A9K("hscroll_seed_media_id", l2);
            if (z && c38321qM != null && (A2E = c38321qM.A2E(this.A02)) != null) {
                l3 = AbstractC003100w.A0k(10, A2E.getId());
            }
            A002.A9K("hscroll_seed_media_author_igid", l3);
            UserSession userSession = this.A02;
            A002.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, c38321qM));
            A002.AAP("hscroll_seed_ad_tracking_token", A05(userSession, c38321qM));
            A002.Cht();
        }
    }

    public final void A0A(C38321qM c38321qM, Integer num, String str, int i) {
        Integer num2;
        Long valueOf;
        Long l;
        Long l2;
        User A2E;
        String A2u;
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2552));
        if (A00.isSampled()) {
            boolean z = !c38321qM.CdW();
            A00.A9K("chaining_position", 0L);
            A00.AAP("chaining_session_id", "");
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAP("contextual_ads_category", "");
            A00.AAP("container_module", "feed_timeline");
            A00.AAP("trigger_type", str);
            if (!c38321qM.CdW()) {
                num2 = C05F.A0j;
            } else {
                num2 = C05F.A0N;
            }
            A00.A9K("multi_ads_type_number", Long.valueOf(C5MB.A00(num2)));
            Long l3 = null;
            if (z) {
                valueOf = null;
            } else {
                String A07 = AbstractC41071vF.A07(this.A02, c38321qM);
                if (A07 != null) {
                    valueOf = Long.valueOf(Long.parseLong(A07));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            A00.A9K("hscroll_seed_ad_id", valueOf);
            if (z && (A2u = c38321qM.A2u()) != null) {
                l = AbstractC003100w.A0k(10, A2u);
            } else {
                l = null;
            }
            A00.A9K("hscroll_seed_media_id", l);
            if (z && (A2E = c38321qM.A2E(this.A02)) != null) {
                l2 = AbstractC003100w.A0k(10, A2E.getId());
            } else {
                l2 = null;
            }
            A00.A9K("hscroll_seed_media_author_igid", l2);
            A00.AAP("inventory_source", C74493Wh.A02(c38321qM.A0C.BJN()));
            UserSession userSession = this.A02;
            A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, c38321qM));
            A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, c38321qM));
            A00.A9K("num_multi_ads_inserted", Long.valueOf(i));
            if (num != null) {
                l3 = Long.valueOf(num.intValue());
            }
            A00.A9K("num_items_consumed_after_eof", l3);
            A00.Cht();
        }
    }

    public final void A0B(C38321qM c38321qM, Long l, Long l2, String str, String str2) {
        Integer num;
        Long l3;
        Long l4;
        User A2E;
        String A2u;
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2551));
        if (A00.isSampled()) {
            boolean z = true;
            if (c38321qM.CdW()) {
                z = false;
            }
            A00.A9K("chaining_position", 0L);
            A00.AAP("chaining_session_id", "");
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAP("contextual_ads_category", "");
            A00.AAP("container_module", "feed_timeline");
            A00.AAP("trigger_type", str);
            if (!c38321qM.CdW()) {
                num = C05F.A0j;
            } else {
                num = C05F.A0N;
            }
            A00.A9K("multi_ads_type_number", Long.valueOf(C5MB.A00(num)));
            Long l5 = null;
            A00.AAP("inventory_source", C74493Wh.A02(c38321qM.A0C.BJN()));
            A00.AAP("invalidation_reason", str2);
            if (!z) {
                String A07 = AbstractC41071vF.A07(this.A02, c38321qM);
                if (A07 != null) {
                    l3 = Long.valueOf(Long.parseLong(A07));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                l3 = null;
            }
            A00.A9K("hscroll_seed_ad_id", l3);
            if (z && (A2u = c38321qM.A2u()) != null) {
                l4 = AbstractC003100w.A0k(10, A2u);
            } else {
                l4 = null;
            }
            A00.A9K("hscroll_seed_media_id", l4);
            if (z && (A2E = c38321qM.A2E(this.A02)) != null) {
                l5 = AbstractC003100w.A0k(10, A2E.getId());
            }
            A00.A9K("hscroll_seed_media_author_igid", l5);
            UserSession userSession = this.A02;
            A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, c38321qM));
            A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, c38321qM));
            A00.A9K("num_items_consumed_in_session", l);
            A00.A9K("num_items_consumed_after_eof", l2);
            A00.Cht();
        }
    }

    public final void A0F(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, Integer num, int i) {
        String str;
        String str2;
        C14360o3.A0B(hbc, 0);
        C14360o3.A0B(intentAwareAdPivotState, 1);
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2548));
        if (A00.isSampled()) {
            C38321qM A002 = ((IL5) hbc.A0B.get(i)).A00();
            UserSession userSession = this.A02;
            String A07 = AbstractC41071vF.A07(userSession, A002);
            if (A07 != null) {
                A00.A9K("ad_id", Long.valueOf(Long.parseLong(A07)));
                A00.A9K("chaining_position", Long.valueOf(A00(hbc, this)));
                A00.AAP("chaining_session_id", intentAwareAdPivotState.A0E);
                A00.AAP("client_session_id", this.A04.getSessionId());
                A00.AAP("contextual_ads_category", hbc.A09);
                A00.AAk("position", AbstractC16960so.A1N(0L, Long.valueOf(i)));
                A00.AAP("trigger_type", hbc.A00().A03);
                switch (num.intValue()) {
                    case 0:
                        str = "card";
                        break;
                    case 1:
                        str = "cta";
                        break;
                    case 2:
                        str = AbstractC111324zv.A00(1190);
                        break;
                    case 3:
                        str = AbstractC111324zv.A00(261);
                        break;
                    case 4:
                        str = "caption";
                        break;
                    case 5:
                        str = "card_long_press";
                        break;
                    case 6:
                        str = "media_options";
                        break;
                    case 7:
                        str = "detached_profile";
                        break;
                    case 8:
                        str = "detached_username";
                        break;
                    case 9:
                        str = "detached_caption";
                        break;
                    default:
                        str = "detached_social_context";
                        break;
                }
                A00.AAP(AbstractC111324zv.A00(799), str);
                A00.AAP("container_module", "feed_timeline");
                A00.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
                A00.AAP("multi_ads_unit_id", hbc.getId());
                String A0F = AbstractC41071vF.A0F(userSession, A002);
                if (A0F != null) {
                    A00.AAP("tracking_token", A0F);
                    A00.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
                    Integer A02 = hbc.A02();
                    String str3 = null;
                    if (A02 != null) {
                        str2 = AbstractC40675I1h.A00(A02);
                    } else {
                        str2 = null;
                    }
                    A00.AAP("insertion_mechanism", str2);
                    A00.A9K("hscroll_seed_ad_id", A08(hbc));
                    A00.A9K("hscroll_seed_media_id", A04(hbc));
                    A00.A9K("hscroll_seed_media_author_igid", A03(hbc));
                    A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, hbc.A04));
                    A00.AAP("ad_request_id", hbc.A08);
                    Integer A2T = A002.A2T();
                    if (A2T != null) {
                        str3 = A2T.toString();
                    }
                    A00.AAP("imp_signature", str3);
                    A00.Cht();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0G(HBC hbc) {
        C14360o3.A0B(hbc, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2550));
        String str = null;
        if (A00.isSampled()) {
            A00.A9K("chaining_position", -1L);
            A00.AAP("chaining_session_id", "");
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAP("contextual_ads_category", hbc.A09);
            A00.AAP("container_module", "feed_timeline");
            A00.AAP("trigger_type", hbc.A00().A03);
            A00.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
            A00.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
            Integer A02 = hbc.A02();
            if (A02 != null) {
                str = AbstractC40675I1h.A00(A02);
            }
            A00.AAP("insertion_mechanism", str);
            A00.A9K("hscroll_seed_ad_id", A08(hbc));
            A00.A9K("hscroll_seed_ad_position", -1L);
            UserSession userSession = this.A02;
            A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, hbc.A04));
            A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, hbc.A04));
            A00.Cht();
        }
    }

    public final void A0H(HBC hbc, Integer num, Long l, String str, int i) {
        long j;
        String str2;
        C14360o3.A0B(hbc, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_ad_pivots_insertion_success");
        if (A00.isSampled()) {
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            A00.A9K("chaining_position", Long.valueOf(j));
            A00.AAP("chaining_session_id", "");
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAP("contextual_ads_category", hbc.A09);
            A00.A9K("hscroll_seed_ad_position", Long.valueOf(i));
            A00.AAP("container_module", "feed_timeline");
            A00.AAP("trigger_type", hbc.A00().A03);
            A00.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
            A00.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
            Integer A02 = hbc.A02();
            Long l2 = null;
            if (A02 != null) {
                str2 = AbstractC40675I1h.A00(A02);
            } else {
                str2 = null;
            }
            A00.AAP("insertion_mechanism", str2);
            A00.AAP("client_insertion_source", str);
            A00.A9K("hscroll_seed_ad_id", A08(hbc));
            A00.A9K("hscroll_seed_media_id", A04(hbc));
            A00.A9K("hscroll_seed_media_author_igid", A03(hbc));
            UserSession userSession = this.A02;
            A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, hbc.A04));
            A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, hbc.A04));
            if (num != null) {
                l2 = Long.valueOf(num.intValue());
            }
            A00.A9K("num_multi_ads_inserted", l2);
            A00.AAk("ad_ids", A06(hbc, this));
            A00.Cht();
        }
    }

    public static final long A00(HBC hbc, C64042vP c64042vP) {
        String id;
        InterfaceC65282xQ interfaceC65282xQ;
        if (C5MB.A00.A02(Integer.valueOf(hbc.A00))) {
            C38321qM c38321qM = hbc.A05;
            if (c38321qM != null) {
                id = c38321qM.getId();
            } else {
                id = null;
            }
        } else {
            id = hbc.getId();
        }
        if (id == null || (interfaceC65282xQ = c64042vP.A00) == null) {
            return -1L;
        }
        return interfaceC65282xQ.BK6(id);
    }

    public static final Boolean A02(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM != null && c38321qM.CdW()) {
            return Boolean.valueOf(AbstractC41071vF.A0O(userSession, c38321qM));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2 != 7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long A03(X.HBC r3) {
        /*
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 7
            if (r1 == 0) goto Lc
            r1 = 1
            if (r2 == r0) goto Ld
        Lc:
            r1 = 0
        Ld:
            r0 = 0
            if (r1 == 0) goto L1e
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r1 = r3.A02
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L1e
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64042vP.A03(X.HBC):java.lang.Long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2 != 7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long A04(X.HBC r3) {
        /*
            int r2 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 7
            if (r1 == 0) goto Lc
            r1 = 1
            if (r2 == r0) goto Ld
        Lc:
            r1 = 0
        Ld:
            r0 = 0
            if (r1 == 0) goto L1e
            com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl r1 = r3.A02
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L1e
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64042vP.A04(X.HBC):java.lang.Long");
    }

    public static final String A05(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM != null && c38321qM.CdW()) {
            return AbstractC41071vF.A0F(userSession, c38321qM);
        }
        return null;
    }

    public static final List A06(HBC hbc, C64042vP c64042vP) {
        List list = hbc.A0B;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A07 = AbstractC41071vF.A07(c64042vP.A02, ((IL5) it.next()).A00());
            if (A07 != null) {
                arrayList.add(Long.valueOf(Long.parseLong(A07)));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r2 != 7) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(com.instagram.feed.ui.state.IntentAwareAdPivotState r19, X.HBC r20, X.C64042vP r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64042vP.A07(com.instagram.feed.ui.state.IntentAwareAdPivotState, X.HBC, X.2vP, java.lang.String, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2 != 7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long A08(X.HBC r4) {
        /*
            r3 = this;
            int r2 = r4.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 7
            if (r1 == 0) goto Lc
            r1 = 1
            if (r2 == r0) goto Ld
        Lc:
            r1 = 0
        Ld:
            r0 = 0
            if (r1 != 0) goto L24
            com.instagram.api.schemas.ContextualAdResponseExtrasImpl r1 = r4.A00()
            java.lang.String r2 = r1.A02
            if (r2 == 0) goto L24
            int r1 = r2.length()
            if (r1 == 0) goto L24
            r0 = 10
            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r2)
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64042vP.A08(X.HBC):java.lang.Long");
    }

    public final void A0C(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc) {
        String str;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2554));
        if (A00.isSampled()) {
            A00.A9K("chaining_position", Long.valueOf(A00(hbc, this)));
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAP("contextual_ads_category", hbc.A09);
            A00.AAP("chaining_session_id", intentAwareAdPivotState.A0E);
            UserSession userSession = this.A02;
            String A07 = AbstractC41071vF.A07(userSession, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00());
            if (A07 != null) {
                A00.A9K("first_hscroll_item_ad_id", AbstractC003100w.A0k(10, A07));
                A00.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
                A00.AAP("multi_ads_unit_id", hbc.getId());
                A00.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
                Integer A02 = hbc.A02();
                if (A02 != null) {
                    str = AbstractC40675I1h.A00(A02);
                } else {
                    str = null;
                }
                A00.AAP("insertion_mechanism", str);
                A00.A9K("hscroll_seed_ad_id", A08(hbc));
                A00.A9K("hscroll_seed_media_id", A04(hbc));
                A00.A9K("hscroll_seed_media_author_igid", A03(hbc));
                A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, hbc.A04));
                A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, hbc.A04));
                A00.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0D(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc) {
        String str;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(4678));
        if (A00.isSampled()) {
            A00.A9K("chaining_position", Long.valueOf(A00(hbc, this)));
            A00.AAP("chaining_session_id", intentAwareAdPivotState.A0E);
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAP("contextual_ads_category", hbc.A09);
            A00.AAk("ad_ids", A06(hbc, this));
            UserSession userSession = this.A02;
            String A07 = AbstractC41071vF.A07(userSession, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00());
            if (A07 != null) {
                A00.A9K("first_hscroll_item_ad_id", AbstractC003100w.A0k(10, A07));
                A00.AAP("trigger_type", hbc.A00().A03);
                A00.AAP("container_module", "feed_timeline");
                A00.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
                A00.AAP("multi_ads_unit_id", hbc.getId());
                A00.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
                Integer A02 = hbc.A02();
                if (A02 != null) {
                    str = AbstractC40675I1h.A00(A02);
                } else {
                    str = null;
                }
                A00.AAP("insertion_mechanism", str);
                A00.A9K("hscroll_seed_ad_id", A08(hbc));
                A00.A9K("hscroll_seed_media_id", A04(hbc));
                A00.A9K("hscroll_seed_media_author_igid", A03(hbc));
                A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, hbc.A04));
                A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, hbc.A04));
                A00.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0E(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc) {
        String str;
        Long l;
        boolean z;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(4679));
        if (A00.isSampled()) {
            A00.A9K("chaining_position", Long.valueOf(A00(hbc, this)));
            A00.AAP("chaining_session_id", intentAwareAdPivotState.A0E);
            A00.AAP("client_session_id", this.A04.getSessionId());
            A00.AAk("ad_ids", A06(hbc, this));
            UserSession userSession = this.A02;
            String A07 = AbstractC41071vF.A07(userSession, ((IL5) AbstractC001800i.A0I(hbc.A0B)).A00());
            if (A07 != null) {
                A00.A9K("first_hscroll_item_ad_id", AbstractC003100w.A0k(10, A07));
                A00.AAP("container_module", "feed_timeline");
                A00.A9K("multi_ads_type_number", Long.valueOf(hbc.A00));
                A00.AAP("multi_ads_unit_id", hbc.getId());
                A00.AAP("inventory_source", C74493Wh.A02(hbc.A0A));
                Integer A02 = hbc.A02();
                Long l2 = null;
                if (A02 != null) {
                    str = AbstractC40675I1h.A00(A02);
                } else {
                    str = null;
                }
                A00.AAP("insertion_mechanism", str);
                if (intentAwareAdPivotState.A04 != null) {
                    l = 0L;
                } else {
                    l = null;
                }
                A00.A9K(AbstractC111324zv.A00(4485), l);
                C38606Gy9 c38606Gy9 = intentAwareAdPivotState.A04;
                if (c38606Gy9 != null) {
                    l2 = Long.valueOf(c38606Gy9.A00);
                }
                A00.A9K(AbstractC111324zv.A00(5501), l2);
                A00.A9K("hscroll_seed_ad_id", A08(hbc));
                A00.A9K("hscroll_seed_media_id", A04(hbc));
                A00.A9K("hscroll_seed_media_author_igid", A03(hbc));
                A00.A7v("is_seed_ad_multi_ads_eligible", A02(userSession, hbc.A04));
                C38606Gy9 c38606Gy92 = intentAwareAdPivotState.A04;
                if (c38606Gy92 != null) {
                    z = c38606Gy92.A01;
                } else {
                    z = false;
                }
                A00.A7v(AbstractC111324zv.A00(4722), Boolean.valueOf(z));
                A00.AAP("hscroll_seed_ad_tracking_token", A05(userSession, hbc.A04));
                A00.Cht();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final InterfaceC104864nt A01(C38321qM c38321qM) {
        C38321qM c38321qM2;
        InterfaceC104864nt BFI;
        if (c38321qM.A5M()) {
            List AmB = c38321qM.A0C.AmB();
            if (AmB != null) {
                c38321qM2 = (C38321qM) AbstractC001800i.A0J(AmB);
            } else {
                c38321qM2 = null;
            }
        } else {
            c38321qM2 = c38321qM;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected == null || (BFI = injected.BFI()) == null || c38321qM2 == null || !c38321qM2.A5x() || c38321qM2.A0m() <= 0.9f || c38321qM2.A0m() >= 1.1f) {
            return null;
        }
        return BFI;
    }
}
