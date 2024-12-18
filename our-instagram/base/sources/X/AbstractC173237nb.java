package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.7nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173237nb implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(AbstractC173237nb.class);
    public static final String __redex_internal_original_name = "FxIsUpsellEligibilityFetcher";

    public static void A00(UserSession userSession, final InterfaceC173277nf interfaceC173277nf, C173247nc c173247nc, String[] strArr, boolean z) {
        if (!(!AbstractC49092Nc.A00(userSession).A03(A00, "fx_growth_ig4a_is_eligibility_linkage_check"))) {
            final C173287ng c173287ng = new C173287ng(userSession);
            C006802i c006802i = c173287ng.A00;
            c006802i.markerStart(857806587);
            c006802i.markerAnnotate(857806587, "flows", strArr);
            c006802i.markerAnnotate(857806587, "use_server_impressions", z);
            AbstractC40691uc.A01(userSession).ATV(new InterfaceC48212Jk() { // from class: X.7nj
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.7oe] */
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    c173287ng.A00.markerEnd(857806587, (short) 3);
                    interfaceC173277nf.DGd(new Object());
                }
            }, new InterfaceC48192Ji() { // from class: X.7ni
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.7oe] */
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    Object Bos;
                    C173297nh c173297nh;
                    c173287ng.A00.markerEnd(857806587, (short) 2);
                    ?? obj = new Object();
                    if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null && (c173297nh = (C173297nh) Bos) != null && c173297nh.A0E() != null) {
                        C173857od A0E = c173297nh.A0E();
                        if (A0E != null) {
                            if (A0E.hasFieldValue("can_user_see_is_upsell(flow:\"CP_UPSELL_IG_STORY_CROSS_POSTING\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                C173857od A0E2 = c173297nh.A0E();
                                if (A0E2 != null) {
                                    obj.A05 = A0E2.getCoercedBooleanField(0, "can_user_see_is_upsell(flow:\"CP_UPSELL_IG_STORY_CROSS_POSTING\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            C173857od A0E3 = c173297nh.A0E();
                            if (A0E3 != null) {
                                if (A0E3.hasFieldValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                    C173857od A0E4 = c173297nh.A0E();
                                    if (A0E4 != null) {
                                        obj.A03 = A0E4.getCoercedBooleanField(1, "can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                C173857od A0E5 = c173297nh.A0E();
                                if (A0E5 != null) {
                                    if (A0E5.hasFieldValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                        C173857od A0E6 = c173297nh.A0E();
                                        if (A0E6 != null) {
                                            obj.A04 = A0E6.getCoercedBooleanField(2, "can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                    C173857od A0E7 = c173297nh.A0E();
                                    if (A0E7 != null) {
                                        if (A0E7.hasFieldValue("can_user_see_is_upsell(flow:\"IG_FEED_CROSS_POSTING_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                            C173857od A0E8 = c173297nh.A0E();
                                            if (A0E8 != null) {
                                                obj.A01 = A0E8.getCoercedBooleanField(3, "can_user_see_is_upsell(flow:\"IG_FEED_CROSS_POSTING_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                        C173857od A0E9 = c173297nh.A0E();
                                        if (A0E9 != null) {
                                            if (A0E9.hasFieldValue("can_user_see_is_upsell(flow:\"IG_DISCOVER_PEOPLE_HOME_UPSELL\")")) {
                                                C173857od A0E10 = c173297nh.A0E();
                                                if (A0E10 != null) {
                                                    obj.A00 = A0E10.getCoercedBooleanField(4, "can_user_see_is_upsell(flow:\"IG_DISCOVER_PEOPLE_HOME_UPSELL\")");
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            C173857od A0E11 = c173297nh.A0E();
                                            if (A0E11 != null) {
                                                if (A0E11.hasFieldValue("can_user_see_is_upsell(flow:\"IG_IMPORT_FROM_FB_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                                    C173857od A0E12 = c173297nh.A0E();
                                                    if (A0E12 != null) {
                                                        obj.A02 = A0E12.getCoercedBooleanField(5, "can_user_see_is_upsell(flow:\"IG_IMPORT_FROM_FB_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    interfaceC173277nf.DGd(obj);
                }
            }, c173247nc.A01.A00().setMaxToleratedCacheAgeMs(0L));
        }
    }
}
