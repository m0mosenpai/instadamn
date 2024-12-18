package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGLiveNotificationPreference;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37021nz {
    public static C37021nz A01;
    public C1GL A00;

    public final void A00(Context context, UserSession userSession, String str, String str2, String str3) {
        InterfaceC147726kx interfaceC147726kx;
        C105824pt c105824pt;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C3KX A012 = C3KW.A01(context, userSession);
        UserSession userSession2 = A012.A01;
        if (userSession2 != null && A012.A00 != null && C2OG.A01().A0B() && ((interfaceC147726kx = A012.A02) == null || interfaceC147726kx.Ejd(str))) {
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession2);
            C14360o3.A07(A03);
            Reel A0M = A03.A0M(str);
            if (A0M != null && (c105824pt = A0M.A0H) != null) {
                C2OG A013 = C2OG.A01();
                User A032 = c105824pt.A03();
                String str4 = c105824pt.A0Y;
                if (str4 == null) {
                    str4 = "";
                }
                C3PO c3po = c105824pt.A0A;
                if (c3po == null) {
                    c3po = C3PO.A08;
                }
                boolean z = false;
                if (c3po == C3PO.A0A) {
                    z = true;
                }
                boolean z2 = false;
                if (c3po == C3PO.A04) {
                    z2 = true;
                }
                boolean z3 = false;
                if (c105824pt.A01 != null) {
                    z3 = true;
                }
                A013.A0A(C3KX.A00(A0M, A032, A012, str4, str, str2, str3, z, z2, z3));
            } else {
                C3KX.A05(new PJ9(A012, str, str2, str3), A012, C05F.A01, str, true);
            }
        }
        A04(new N9P(userSession, str, str2, str3), userSession, str, false);
    }

    public final void A01(Fragment fragment, FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2, UserSession userSession, UpcomingEvent upcomingEvent, String str, boolean z) {
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(str, 4);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putParcelable("upcoming_live", upcomingEvent);
        bundle.putBoolean("is_modal", z);
        bundle.putString("prior_module_name", str);
        if (!z && fragmentActivity2 != null) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            N6P n6p = new N6P();
            n6p.setArguments(bundle);
            c140966Yy.A0D(n6p);
            c140966Yy.A04();
            return;
        }
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, TransparentModalActivity.class, "live_scheduling_edit");
        c6xj.A07();
        if (fragment != null) {
            c6xj.A0D(fragment, 0);
        } else {
            c6xj.A0A(fragmentActivity, 0);
        }
    }

    public final void A02(IGLiveNotificationPreference iGLiveNotificationPreference, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0L("live/%s/set_subscription_preference/", str);
        c25621Ms.A9s("preference", iGLiveNotificationPreference.A00);
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, true);
        C1ON A0N = c25621Ms.A0N();
        C1GL c1gl = this.A00;
        if (c1gl == null) {
            c1gl = C1GJ.A01();
        }
        c1gl.schedule(A0N);
        this.A00 = c1gl;
    }

    public final void A03(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(str, 2);
        if (AbstractC171517kh.A00(userSession).A01.isEmpty()) {
            str2 = "live_scheduling_creation";
        } else {
            str2 = "live_scheduling_management";
        }
        boolean equals = str.equals("media_broadcast_share");
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("prior_module_name", str);
        bundle.putBoolean("action_tag_upcoming_live", equals);
        C6XJ c6xj = new C6XJ(abstractC59962oe.requireActivity(), bundle, userSession, TransparentModalActivity.class, str2);
        c6xj.A0J = new int[]{R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit};
        c6xj.A0D(abstractC59962oe, 5152);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0oO, java.lang.Object] */
    public final void A04(C1P1 c1p1, UserSession userSession, String str, boolean z) {
        C105824pt c105824pt;
        ?? obj = new Object();
        Reel A0M = C1OU.A04(userSession).A0M(str);
        if (A0M != null && (c105824pt = A0M.A0H) != null) {
            c1p1.onSuccess(c105824pt);
            obj.A00 = true;
        }
        C1ON A05 = AbstractC55182Odn.A05(userSession, str, z);
        A05.A00 = new HGD(c1p1, userSession, obj);
        C1GJ.A03(A05);
    }

    public final void A05(final UserSession userSession, final C171587ko c171587ko, final InterfaceC171577kn interfaceC171577kn, String str) {
        C14360o3.A0B(userSession, 0);
        if (!((C171637kt) userSession.A01(C171637kt.class, C171627ks.A00)).A00) {
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0B("live/pre_live_tools/");
            c25621Ms.A9s("thread_igid", str);
            c25621Ms.A0P(null, C171647ku.class, C171657kv.class, true);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C1P1() { // from class: X.7kw
                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(-773220655);
                    C171647ku c171647ku = (C171647ku) obj;
                    int A032 = C0f9.A03(-959568012);
                    C14360o3.A0B(c171647ku, 0);
                    InterfaceC171857lG interfaceC171857lG = c171647ku.A01;
                    if (interfaceC171857lG == null) {
                        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                        throw C00O.createAndThrow();
                    }
                    UserSession userSession2 = UserSession.this;
                    C171847lF c171847lF = (C171847lF) interfaceC171857lG;
                    ((C171907lL) userSession2.A01(C171907lL.class, C171897lK.A00)).A00 = c171847lF.A00;
                    AbstractC171917lM.A00(userSession2).A00 = c171847lF.A02;
                    AbstractC171517kh.A00(userSession2).A00 = c171847lF.A01;
                    this.A06(userSession2, interfaceC171577kn);
                    C171587ko c171587ko2 = c171587ko;
                    if (c171587ko2 != null) {
                        final C171177k9 c171177k9 = c171587ko2.A01;
                        Handler handler = c171177k9.A08;
                        final C3PO c3po = c171587ko2.A02;
                        final UserSession userSession3 = c171587ko2.A00;
                        final Boolean bool = c171587ko2.A03;
                        handler.postDelayed(new Runnable() { // from class: X.7lR
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3PO c3po2 = c3po;
                                if (c3po2 != null && c3po2 != C3PO.A08 && AbstractC171917lM.A00(userSession3).A00().contains(c3po2)) {
                                    C171177k9 c171177k92 = c171177k9;
                                    if (c171177k92.A04 != c3po2) {
                                        c171177k92.A04 = c3po2;
                                        c171177k92.A0J.Cxk(c3po2);
                                        if (C14360o3.A0K(bool, true)) {
                                            c171177k92.A0H.A0C(c171177k92.A0B.requireView(), c3po2);
                                        }
                                    }
                                }
                            }
                        }, 200L);
                    }
                    C0f9.A0A(-1521386939, A032);
                    C0f9.A0A(-622088029, A03);
                }
            };
            C1GJ.A03(A0N);
        }
    }

    public final void A06(final UserSession userSession, final InterfaceC171577kn interfaceC171577kn) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC171517kh.A00(userSession).A00 != null) {
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0B("upcoming_events/add_event_list/");
            c25621Ms.A9s("event_category", "broadcast");
            c25621Ms.A0P(null, C171937lO.class, C171947lP.class, false);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C1P1() { // from class: X.7lQ
                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(-86475522);
                    C171937lO c171937lO = (C171937lO) obj;
                    int A032 = C0f9.A03(-1247932285);
                    C14360o3.A0B(c171937lO, 0);
                    List list = AbstractC171517kh.A00(UserSession.this).A01;
                    InterfaceC171577kn interfaceC171577kn2 = interfaceC171577kn;
                    list.clear();
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) c171937lO.A01);
                    C14360o3.A07(copyOf);
                    list.addAll(copyOf);
                    if (interfaceC171577kn2 != null) {
                        interfaceC171577kn2.onSuccess();
                    }
                    C0f9.A0A(335522455, A032);
                    C0f9.A0A(1435223456, A03);
                }
            };
            C1GJ.A03(A0N);
        }
    }
}
