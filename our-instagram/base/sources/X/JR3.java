package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.igds.components.actionbar.IgdsActionBar;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JR3 extends AbstractC59962oe implements InterfaceC12870lZ, InterfaceC60072op, C2d4, C2fe, MR8, InterfaceC60092or, InterfaceC11480j6, InterfaceC60102os, InterfaceC1119353f, InterfaceC59832oQ, MPF, InterfaceC53912dV, InterfaceC72513My {
    public static final String __redex_internal_original_name = "DirectInboxFragment";
    public C25671My A00;
    public TouchInterceptorFrameLayout A01;
    public C31261Doj A02;
    public C43991Jce A03;
    public C31256Doe A04;
    public JR2 A05;
    public C31665DvV A06;
    public C3EQ A07;
    public C31600DuS A08;
    public C61582rL A09;
    public C64842wi A0A;
    public C64752wZ A0B;
    public InterfaceC53892dT A0C;
    public boolean A0F;
    public long A0G;
    public JYW A0H;
    public C43647JSf A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final JR8 A0M;
    public final C43935Jbk A0N;
    public final InterfaceC09390do A0O;
    public final long A0P;
    public final InterfaceC09390do A0R = AbstractC60492pY.A02(this);
    public String A0E = "all";
    public Integer A0D = C05F.A00;
    public final AnonymousClass987 A0Q = new AnonymousClass987();

    public static final C31665DvV A02(JR3 jr3) {
        if (jr3.A06 == null) {
            FragmentActivity requireActivity = jr3.requireActivity();
            UserSession A01 = A01(jr3);
            C31660DvQ c31660DvQ = new C31660DvQ(jr3);
            C14360o3.A0B(A01, 1);
            C31663DvT c31663DvT = new C31663DvT(requireActivity, A01, new C31661DvR(requireActivity, jr3, A01), new C31662DvS(requireActivity, jr3, A01));
            C31665DvV c31665DvV = new C31665DvV(requireActivity, jr3, A01, c31663DvT, new C31664DvU(requireActivity, jr3, A01, c31663DvT), c31660DvQ, AbstractC31171DnF.A0I(requireActivity));
            jr3.A06 = c31665DvV;
            View view = jr3.mView;
            if (view != null) {
                c31665DvV.A09(view);
            }
            JR2 jr2 = jr3.A05;
            if (jr2 != null) {
                jr2.A16(jr3.A06);
            }
        }
        return jr3.A06;
    }

    @Override // X.C2fe
    public final /* synthetic */ void CKS(MotionEvent motionEvent, Long l, boolean z) {
    }

    @Override // X.C2fe
    public final /* synthetic */ void DVb() {
    }

    @Override // X.MR8
    public final void DjM(View view, Integer num) {
        DirectShareTarget directShareTarget;
        DirectShareTarget directShareTarget2;
        C65911TwI c65911TwI;
        DirectShareTarget A00;
        String str;
        C65911TwI c65911TwI2;
        C14360o3.A0B(view, 0);
        if (num == C05F.A0j) {
            if (System.currentTimeMillis() - this.A0G >= this.A0P && getActivity() != null) {
                this.A0G = System.currentTimeMillis();
                UserSession A01 = A01(this);
                C06090Tz c06090Tz = C06090Tz.A05;
                String A04 = C18U.A04(c06090Tz, A01, 36882318691992000L);
                AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(A01(this));
                FragmentActivity requireActivity = requireActivity();
                JR2 jr2 = this.A05;
                DirectShareTarget directShareTarget3 = null;
                if (jr2 != null) {
                    C65911TwI c65911TwI3 = jr2.A0J;
                    if (c65911TwI3 != null) {
                        directShareTarget2 = c65911TwI3.A00();
                    } else {
                        directShareTarget2 = null;
                    }
                } else {
                    directShareTarget2 = null;
                }
                UserSession A012 = A01(this);
                C14360o3.A0B(A012, 0);
                if (!aiAgentThreadLauncher.A0B(requireActivity, null, this, null, directShareTarget2, null, "igd_universal_search:ai_nullstate_donut", null, C18U.A06(c06090Tz, A012, 36324767510311358L), false, false, false, false)) {
                    String A0b = AbstractC31178DnM.A0b();
                    C18920wW A013 = AbstractC12220kQ.A01(this, A01(this));
                    String stackTraceString = android.util.Log.getStackTraceString(new Exception());
                    C14360o3.A07(stackTraceString);
                    JR2 jr22 = this.A05;
                    if (jr22 != null && (c65911TwI2 = jr22.A0J) != null) {
                        directShareTarget3 = c65911TwI2.A00();
                    }
                    F1W.A00(A013, directShareTarget3, A0b, "igd_universal_search:ai_nullstate_donut", stackTraceString, __redex_internal_original_name, A04, "", "");
                }
                UserSession A014 = A01(this);
                C14360o3.A0B(A014, 0);
                if (AbstractC31268Doq.A03(A014) && C18U.A06(c06090Tz, A014, 36320382350533040L)) {
                    C7F3 c7f3 = new C7F3(A01(this));
                    JR2 jr23 = this.A05;
                    if (jr23 != null && (c65911TwI = jr23.A0J) != null && (A00 = c65911TwI.A00()) != null && (str = (String) A00.A0B().get(0)) != null) {
                        A04 = str;
                    }
                    C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
                    if (AbstractC25226BEj.A1Z(A0H)) {
                        A0H.A0Z(14);
                        A0H.A0X(0);
                        A0H.A0R("selected_item", "meta_ai");
                        A0H.A0R("agent_id", A04);
                        A0H.Cht();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (num == C05F.A0u) {
            if (System.currentTimeMillis() - this.A0G < this.A0P || getActivity() == null) {
                return;
            }
            this.A0G = System.currentTimeMillis();
            JR2 jr24 = this.A05;
            if (jr24 == null) {
                return;
            }
            C18920wW A0C = AbstractC37300Gc1.A0C(jr24.A2t);
            C14360o3.A0B(A0C, 0);
            F1U.A00(A0C, new C25512BQa(0, 13));
            AbstractC59962oe abstractC59962oe = jr24.A1L;
            Context requireContext = abstractC59962oe.requireContext();
            UserSession A0p = jr24.A0p();
            FragmentActivity requireActivity2 = abstractC59962oe.requireActivity();
            C65911TwI c65911TwI4 = jr24.A0J;
            if (c65911TwI4 != null) {
                directShareTarget = c65911TwI4.A00();
            } else {
                directShareTarget = null;
            }
            AbstractC35257Fgr.A03(requireContext, requireActivity2, abstractC59962oe, A0p, EnumC33346Eof.A04, directShareTarget);
            return;
        }
        JR2 jr25 = this.A05;
        if (jr25 == null) {
            return;
        }
        UserSession A0p2 = jr25.A0p();
        AbstractC59962oe abstractC59962oe2 = jr25.A1L;
        C14360o3.A0B(A0p2, 0);
        AbstractC31175DnJ.A15(AbstractC31181DnP.A07(A0p2), "filters_button");
        C7P0 c7p0 = new C7P0(abstractC59962oe2, A0p2);
        String str2 = A0p2.userId;
        C14360o3.A0B(str2, 0);
        C7P0.A01(null, C7P1.CLICK, C7P2.FILTER_ENTRYPOINT, c7p0, null, str2);
        C44117Jeh c44117Jeh = jr25.A0c;
        if (c44117Jeh == null) {
            return;
        }
        UserSession userSession = c44117Jeh.A03;
        C14360o3.A0B(userSession, 0);
        if (C2E7.A01(AbstractC166997dE.A0Y(userSession))) {
            C18U.A06(C06090Tz.A05, userSession, 36322237775030350L);
        }
        c44117Jeh.A01 = C44117Jeh.A00(c44117Jeh);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        Context context = c44117Jeh.A02;
        A0y.A0d = context.getString(2131962571);
        List list = E05.A00;
        list.clear();
        C189478aR A002 = A0y.A00();
        if (C2E8.A01(userSession)) {
            List asList = Arrays.asList(EnumC43799JYm.A0M, EnumC43799JYm.A07, EnumC43799JYm.A09);
            list.add(new C31335Dq0(2131962562));
            for (EnumC43799JYm enumC43799JYm : c44117Jeh.A01) {
                if (!asList.contains(enumC43799JYm)) {
                    C44117Jeh.A01(c44117Jeh, enumC43799JYm, A002);
                }
            }
            list.add(new Object());
            list.add(new C31335Dq0(2131962563));
            for (EnumC43799JYm enumC43799JYm2 : c44117Jeh.A01) {
                if (asList.contains(enumC43799JYm2)) {
                    C44117Jeh.A01(c44117Jeh, enumC43799JYm2, A002);
                }
            }
        } else {
            Iterator it = c44117Jeh.A01.iterator();
            while (it.hasNext()) {
                C44117Jeh.A01(c44117Jeh, (EnumC43799JYm) it.next(), A002);
            }
        }
        A002.A03(context, new AbstractC59962oe());
        C189458aP c189458aP = new C189458aP();
        c189458aP.A06 = context.getString(2131962570);
        c189458aP.A0A = true;
        c189458aP.A05 = new ViewOnClickListenerC48066LPr(56, c44117Jeh, A002);
        A002.A0K(c189458aP.A00(), true);
    }

    @Override // X.MR8
    public final void DjO(View view, JYW jyw) {
        ArrayList arrayList;
        DirectShareTarget A00;
        this.A0H = jyw;
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            ((C64742wY) jr2.A2X.getValue()).A00(view, QPTooltipAnchor.A0b, (AbstractC55352ga) jr2.A2W.getValue());
            C65911TwI c65911TwI = jr2.A0J;
            if (c65911TwI != null && (A00 = c65911TwI.A00()) != null) {
                arrayList = A00.A0B();
            } else {
                arrayList = null;
            }
            if (AbstractC31268Doq.A03(jr2.A0p())) {
                UserSession A0p = jr2.A0p();
                C14360o3.A0B(A0p, 0);
                if (AbstractC31268Doq.A03(A0p) && C18U.A06(C06090Tz.A05, A0p, 36320382350533040L) && arrayList != null && !arrayList.isEmpty()) {
                    C7F3 c7f3 = new C7F3(jr2.A0p());
                    String str = (String) AbstractC31173DnH.A0i(arrayList, 0);
                    C14360o3.A0B(str, 0);
                    C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
                    if (AbstractC25226BEj.A1Z(A0H)) {
                        A0H.A0Z(14);
                        A0H.A0X(1);
                        A0H.A0R("selected_item", "meta_ai");
                        A0H.A0R("agent_id", str);
                        A0H.Cht();
                    }
                }
            }
            UserSession A0p2 = jr2.A0p();
            if (C18U.A06(AbstractC166997dE.A0U(A0p2), A0p2, 36324767511163335L)) {
                C14120nc.A00().ATO(new KLT(jr2));
            }
        }
    }

    @Override // X.InterfaceC1119353f
    public final void EK1() {
    }

    @Override // X.C2fe
    public final void F84(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_inbox";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            UserSession A01 = A01(this);
            int i = configuration.screenWidthDp;
            C14360o3.A0B(A01, 1);
            C43687JTw.A01(rootActivity, null, A01, AbstractC52892bV.A00(i), AbstractC166987dD.A0C(rootActivity, i));
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            bundle.putStringArrayList("DirectInboxController.STATE_SEEN_THREAD_ID_LIST", AbstractC166987dD.A1F(jr2.A1d));
            C44117Jeh c44117Jeh = jr2.A0c;
            if (c44117Jeh != null) {
                bundle.putString("DirectInboxController.STATE_FILTER_TYPE", c44117Jeh.A00.A01.A00);
            }
            C43945Jbu A0W = AbstractC43593JPy.A0W(jr2);
            bundle.putString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID", A0W.A01);
            bundle.putParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY", A0W.A00);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        JR2 jr2;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        C47646L2f c47646L2f;
        String string;
        View findViewById;
        TextView textView;
        int i;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2;
        C64842wi c64842wi;
        C43939Jbo A0v;
        C69613Av c69613Av;
        C31665DvV c31665DvV;
        String str;
        C43939Jbo A0v2;
        C69613Av c69613Av2;
        C14360o3.A0B(view, 0);
        JR2 jr22 = this.A05;
        if (jr22 != null && (A0v2 = jr22.A0v()) != null && (c69613Av2 = ((C98O) A0v2).A06) != null) {
            c69613Av2.A08(null);
        }
        super.onViewCreated(view, bundle);
        C31261Doj c31261Doj = this.A02;
        if (c31261Doj == null) {
            str = "actionBarController";
        } else {
            if (!AbstractC43806JYt.A01(c31261Doj.A07)) {
                C41451vu.A01.A02(c31261Doj.A06, C71923Kp.class);
            }
            C31256Doe c31256Doe = this.A04;
            if (c31256Doe == null) {
                str = "actionBarRepository";
            } else {
                if (AbstractC43806JYt.A01(c31256Doe.A06)) {
                    C41451vu.A01.A02(c31256Doe.A05, C71923Kp.class);
                }
                JR2 jr23 = this.A05;
                if (jr23 != null) {
                    C69613Av c69613Av3 = AbstractC43593JPy.A0c(jr23).A0A;
                    if (c69613Av3 != null) {
                        c69613Av3.A08(null);
                    }
                    C69613Av c69613Av4 = AbstractC43593JPy.A0c(jr23).A0A;
                    if (c69613Av4 != null) {
                        c69613Av4.A05();
                    }
                }
                UserSession A01 = A01(this);
                if (!C18U.A06(AbstractC166997dE.A0U(A01), A01, 36328332333694422L) && (c31665DvV = this.A06) != null) {
                    c31665DvV.A09(view);
                }
                if (this.A0F && !this.A0J) {
                    this.A0J = true;
                    JR2 jr24 = this.A05;
                    if (jr24 != null) {
                        jr24.A13();
                    }
                }
                JR2 jr25 = this.A05;
                if (jr25 != null && (A0v = jr25.A0v()) != null && (c69613Av = ((C98O) A0v).A06) != null) {
                    c69613Av.A05();
                }
                UserSession A012 = A01(this);
                C06090Tz A0j = AbstractC25225BEi.A0j(A012, 0);
                if (!C18U.A06(A0j, A012, 36328186304281902L) && (c64842wi = this.A0A) != null) {
                    c64842wi.DiZ();
                }
                Activity rootActivity = getRootActivity();
                if (rootActivity != null) {
                    C43687JTw.A00(rootActivity, view, A01(this));
                }
                if (AbstractC70443Ed.A00(A01(this))) {
                    JR2 jr26 = this.A05;
                    if (jr26 != null && (touchInterceptorFrameLayout2 = this.A01) != null) {
                        View inflate = AbstractC167007dF.A0M(touchInterceptorFrameLayout2, R.id.direct_inbox_quick_snap_container_stub).inflate();
                        View A0S = AbstractC166997dE.A0S(inflate, R.id.direct_quick_snap_creation_button);
                        C0fQ.A00(new ViewOnClickListenerC35680FpF(jr26, 57), A0S);
                        if (C2E9.A05(jr26.A0p())) {
                            ViewGroup.LayoutParams layoutParams = A0S.getLayoutParams();
                            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            Context context = touchInterceptorFrameLayout2.getContext();
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC25235BEs.A04(context) + AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                        }
                        View A0S2 = AbstractC166997dE.A0S(inflate, R.id.direct_quick_snap_consumption_preview);
                        AbstractC59962oe abstractC59962oe = jr26.A1L;
                        jr26.A0r = new C140356Wo(new ViewOnClickListenerC35680FpF(jr26, 58), A0S2, abstractC59962oe, jr26.A0p());
                        C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                        C3CY c3cy = (C3CY) new C52942bb(new C215729go(abstractC59962oe.requireContext(), jr26.A0p()), abstractC59962oe.getViewModelStore(), C52962bd.A00).A00(C3CY.class);
                        jr26.A0s = c3cy;
                        if (c3cy != null) {
                            c3cy.A01.A06(abstractC59962oe, new C44145JfA(jr26, 6));
                        }
                        JR2.A0c(jr26, true);
                    }
                } else if (this.A01 != null && this.A05 != null && C18U.A06(A0j, A01(this), 36325360215798802L)) {
                    FrameLayout frameLayout = new FrameLayout(requireContext());
                    AbstractC43593JPy.A1B(frameLayout, -1);
                    boolean A06 = C18U.A06(A0j, A01(this), 36325360215995413L);
                    C31261Doj c31261Doj2 = this.A02;
                    if (c31261Doj2 == null) {
                        C14360o3.A0F("actionBarController");
                        throw C00O.createAndThrow();
                    }
                    C35019Fbs c35019Fbs = (C35019Fbs) c31261Doj2.A08.A04.getValue();
                    ViewOnClickListenerC35669Fp4 viewOnClickListenerC35669Fp4 = new ViewOnClickListenerC35669Fp4(3, c35019Fbs, A06);
                    boolean z = !A06;
                    C15370ps A1F = AbstractC25225BEi.A1F();
                    AbstractC59962oe abstractC59962oe2 = c35019Fbs.A00;
                    ComposeView A02 = AbstractC25319BIo.A02(abstractC59962oe2, C5UA.A04(new BQ5(3, A1F, viewOnClickListenerC35669Fp4, z), -796365061, true), false, false);
                    A1F.A00 = A02;
                    A02.setTag("conversation_starter_floating_action_button");
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 85);
                    int A0C = AbstractC166987dD.A0C(abstractC59962oe2.requireContext(), 12);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = A0C;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = A0C;
                    ((View) A1F.A00).setLayoutParams(layoutParams2);
                    frameLayout.addView((View) A1F.A00);
                    frameLayout.bringToFront();
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = this.A01;
                    if (touchInterceptorFrameLayout3 != null) {
                        touchInterceptorFrameLayout3.addView(frameLayout);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                if (C2E9.A05(A01(this)) && (jr2 = this.A05) != null && (touchInterceptorFrameLayout = this.A01) != null) {
                    View inflate2 = AbstractC167007dF.A0M(touchInterceptorFrameLayout, R.id.direct_inbox_folder_pill_selector_stub).inflate();
                    jr2.A0D = inflate2;
                    if (inflate2 != null) {
                        jr2.A0H = (TabLayout) inflate2.requireViewById(R.id.tab_layout);
                    }
                    TabLayout tabLayout = jr2.A0H;
                    if (tabLayout != null && (c47646L2f = jr2.A0f) != null) {
                        Context requireContext = jr2.A1L.requireContext();
                        C47361KwA c47361KwA = new C47361KwA(jr2);
                        Map A0M = AbstractC16850sd.A0M(AbstractC167007dF.A0o(EnumC44049Jda.A07, jr2.A0o()));
                        for (EnumC44049Jda enumC44049Jda : c47646L2f.A03) {
                            C154306wf A062 = tabLayout.A06();
                            int ordinal = enumC44049Jda.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1 && ordinal != 4) {
                                    if (ordinal != 2) {
                                        if (ordinal == 3) {
                                            i = 2131964473;
                                        } else {
                                            throw AbstractC37303Gc4.A0M(enumC44049Jda, "Unrecognized twinbox mode: ", AbstractC166987dD.A1C());
                                        }
                                    } else {
                                        i = 2131959913;
                                    }
                                } else {
                                    i = 2131964409;
                                }
                                string = requireContext.getString(i);
                                C14360o3.A07(string);
                            } else {
                                int i2 = 2131964432;
                                if (C2E9.A0F(c47646L2f.A02)) {
                                    i2 = 2131964476;
                                }
                                string = requireContext.getString(i2);
                                C14360o3.A0A(string);
                            }
                            A062.A04(string);
                            A062.A03(LayoutInflater.from(requireContext).inflate(R.layout.pill_tab_title, (ViewGroup) null));
                            if (A0M.containsKey(enumC44049Jda)) {
                                Object obj = A0M.get(enumC44049Jda);
                                if (obj != null) {
                                    if (((Number) obj).intValue() > 0 && C2E9.A04(c47646L2f.A02)) {
                                        View view2 = A062.A03;
                                        if (view2 != null && (textView = (TextView) view2.findViewById(R.id.tab_badge_count)) != null) {
                                            textView.setText(String.valueOf(A0M.get(enumC44049Jda)));
                                            textView.setVisibility(0);
                                        }
                                        View view3 = A062.A03;
                                        if (view3 != null && (findViewById = view3.findViewById(R.id.tab_unread_dot)) != null) {
                                            findViewById.setVisibility(0);
                                        }
                                    }
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                            tabLayout.A0E(A062, tabLayout.A0c.isEmpty());
                        }
                        C154306wf A07 = tabLayout.A07(c47646L2f.A00);
                        if (A07 != null) {
                            A07.A01();
                        }
                        tabLayout.A0D(new LW9(c47361KwA, c47646L2f));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final float A00() {
        InterfaceC53892dT interfaceC53892dT = this.A0C;
        if (interfaceC53892dT != null) {
            float f = interfaceC53892dT.C4b().A01;
            InterfaceC53892dT interfaceC53892dT2 = this.A0C;
            if (interfaceC53892dT2 != null) {
                return interfaceC53892dT2.Aq9().A00(f);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final UserSession A01(JR3 jr3) {
        return (UserSession) jr3.A0R.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0421, code lost:
    
        if (X.AbstractC37300Gc1.A00(r16) < X.C18U.A01(r7, r5, 36609639806539718L)) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0bc0, code lost:
    
        if (X.C18U.A06(r3, r2, 36320403825107406L) != false) goto L347;
     */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, X.L7d] */
    /* JADX WARN: Type inference failed for: r2v20, types: [X.98s, X.KPL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 3121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR3.A03():void");
    }

    private final void A04() {
        C13080lu A00;
        View view;
        Runnable runnable;
        View view2;
        Runnable runnable2;
        ArrayList arrayList;
        C2EY c2ey;
        String str;
        if (this.A0L) {
            JR2 jr2 = this.A05;
            if (jr2 != null) {
                try {
                    A00 = AbstractC13090lv.A00("DirectInboxController.onPause");
                    try {
                        jr2.A0v().A07.A08(null);
                        InterfaceC09390do interfaceC09390do = jr2.A2M;
                        ((C98O) AbstractC43592JPx.A0f(interfaceC09390do)).A04.A08(null);
                        UserSession A0p = jr2.A0p();
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, A0p, 36318033005123418L)) {
                            jr2.A0v().A08();
                            AbstractC43592JPx.A0f(interfaceC09390do).A08();
                        }
                        if (jr2.A0r().Cnw()) {
                            ((InterfaceC70513Em) jr2.A10.getValue()).setIsLoading(false);
                        }
                        InterfaceC09390do interfaceC09390do2 = jr2.A1j;
                        ((InterfaceC50519MRw) interfaceC09390do2.getValue()).BOD().pause();
                        InterfaceC50519MRw.A01(interfaceC09390do2).EWh(false);
                        C25671My A0O = AbstractC43592JPx.A0O(jr2.A24);
                        A06(A0O, C48022Ip.class, jr2.A29);
                        A06(A0O, LYA.class, jr2.A2R);
                        A0O.A02(jr2.A1N, C129285sq.class);
                        A0O.A02((C31650DvG) jr2.A27.getValue(), C36085FwL.class);
                        A06(A0O, LY1.class, jr2.A2q);
                        ((C43915JbQ) jr2.A2c.getValue()).A00();
                        ((C43782JXv) jr2.A1u.getValue()).A04("LEAVE_SURFACE");
                        C93814Jp c93814Jp = (C93814Jp) jr2.A2p.getValue();
                        InterfaceC50441MOv interfaceC50441MOv = jr2.A0i;
                        if (interfaceC50441MOv == null) {
                            C14360o3.A0F("threadActivityUpdateListener");
                            throw C00O.createAndThrow();
                        }
                        c93814Jp.A04.remove(interfaceC50441MOv);
                        C43766JXf c43766JXf = (C43766JXf) jr2.A2P.getValue();
                        if (c43766JXf != null) {
                            C0eR c0eR = c43766JXf.A01;
                            if (c0eR.A00 != C07S.DESTROYED) {
                                c0eR.A0C(C07S.STARTED);
                            }
                            UserSession userSession = c43766JXf.A06;
                            if (C18U.A06(C06090Tz.A06, userSession, 36324505517568212L)) {
                                C41711wL.A01(userSession).A0C(3);
                            }
                            if (C18U.A06(c06090Tz, userSession, 36327254296377774L) || C4AC.A0E(userSession)) {
                                C92904Eg A002 = AbstractC92894Ef.A00(userSession);
                                C10190gb A003 = C10190gb.A00();
                                InterfaceC10180ga interfaceC10180ga = (InterfaceC10180ga) A002.A0D.getValue();
                                if (interfaceC10180ga != null) {
                                    A003.A00.remove(interfaceC10180ga);
                                }
                            }
                        }
                        ((C64742wY) jr2.A2X.getValue()).onPause();
                        C31445Drp c31445Drp = jr2.A0q;
                        if (c31445Drp != null) {
                            c31445Drp.onPause();
                            if (AbstractC167007dF.A1Z(jr2.A2F)) {
                                C44099JeO A004 = AbstractC43912JbN.A00(jr2.A0p());
                                ((KPS) A004.A06.getValue()).A0C("INBOX_NOT_VISIBLE", C05F.A0C);
                                A004.A00 = false;
                            }
                            C43626JRj A0q = jr2.A0q();
                            C43970JcJ c43970JcJ = A0q.A0E;
                            C48301LZa c48301LZa = c43970JcJ.A05;
                            if (c48301LZa != null) {
                                KPM A005 = AbstractC46740Klx.A00(A0q.A0B);
                                int ordinal = c48301LZa.A01.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                if (ordinal == 4) {
                                                    str = "MEX_EB_LOW_DISK_SPACE_BANNER_NAVIGATED_AWAY";
                                                } else {
                                                    throw B4Z.A00();
                                                }
                                            } else {
                                                str = "MEX_EB_UPSELL_BANNER_NAVIGATED_AWAY";
                                            }
                                        } else {
                                            str = "WARN_BANNER_NAVIGATED_AWAY";
                                        }
                                    } else {
                                        str = "SELL_BANNER_NAVIGATED_AWAY";
                                    }
                                } else {
                                    str = "INTRODUCE_BANNER_NAVIGATED_AWAY";
                                }
                                A005.A05(str);
                                A005.A01();
                            }
                            if (null != c43970JcJ.A05) {
                                c43970JcJ.A05 = null;
                                C43626JRj.A04(A0q);
                            }
                            jr2.A0q().A07((C44096JeL) jr2.A2K.getValue(), false, false);
                            if (C14360o3.A0K(jr2.A0t(), C47062Du.A00)) {
                                F3T.A00(jr2.A0p()).A08();
                            }
                            if (JR2.A0l(jr2)) {
                                C44158JfN c44158JfN = jr2.A0l;
                                if (c44158JfN != null) {
                                    c44158JfN.A01.A05(jr2.A1L);
                                }
                                C44158JfN c44158JfN2 = jr2.A0l;
                                if (c44158JfN2 != null) {
                                    c44158JfN2.A00.A05(jr2.A1L);
                                }
                            } else {
                                ((C2056598p) jr2.A2i.getValue()).A00();
                            }
                            jr2.A1M.A01();
                            jr2.A18 = false;
                            if (AbstractC167007dF.A1Z(jr2.A2D)) {
                                Iterator it = jr2.A0w().Bkz().iterator();
                                while (it.hasNext()) {
                                    DirectThreadKey directThreadKey = (DirectThreadKey) it.next();
                                    C2DU c2du = (C2DU) jr2.A0w();
                                    synchronized (c2du) {
                                        try {
                                            C14360o3.A0B(directThreadKey, 0);
                                            arrayList = new ArrayList();
                                            for (C83403nh c83403nh : c2du.Bkx(directThreadKey, true)) {
                                                if (c83403nh.A0h() != null && ((c2ey = c83403nh.A10) == C2EY.A0W || c2ey == C2EY.A1r)) {
                                                    arrayList.add(c83403nh);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    HashSet hashSet = jr2.A1Z;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        String A0h = ((C83403nh) it2.next()).A0h();
                                        if (A0h != null) {
                                            arrayList2.add(A0h);
                                        }
                                    }
                                    hashSet.addAll(arrayList2);
                                }
                                HashMap hashMap = jr2.A1X;
                                ArrayList A1F = AbstractC166987dD.A1F(hashMap.keySet());
                                int size = A1F.size();
                                for (int i = 0; i < size; i++) {
                                    if (!jr2.A1Z.contains(A1F.get(i))) {
                                        hashMap.remove(A1F.get(i));
                                    }
                                }
                                java.util.Set A0j = AbstractC001800i.A0j(AbstractC166987dD.A0x(jr2.A0p()).C2v("direct_reels_watched_set"));
                                List A0a = AbstractC001800i.A0a(A0j);
                                int size2 = A0a.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (!AbstractC001800i.A0u(jr2.A1Z, A0a.get(i2))) {
                                        A0j.remove(A0a.get(i2));
                                    }
                                }
                                C23031Ai.A05(AbstractC23021Ah.A00(jr2.A0p()), "direct_reels_impression_map", hashMap);
                                AbstractC23021Ah.A00(jr2.A0p()).A19(A0j);
                                hashMap.clear();
                                jr2.A1Z.clear();
                            }
                            A00.close();
                            jr2.A0v().A07.A05();
                            ((C98O) interfaceC09390do.getValue()).A04.A05();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    jr2.A0v().A07.A05();
                    ((C98O) jr2.A2M.getValue()).A04.A05();
                    throw th2;
                }
            }
            C3EQ c3eq = this.A07;
            if (c3eq != null) {
                c3eq.A01();
            }
            this.A0L = false;
        }
        if (AbstractC1570673l.A01(A01(this))) {
            AbstractC1570673l.A00(A01(this)).A00();
        }
        JR2 jr22 = this.A05;
        if (jr22 != null) {
            A00 = AbstractC13090lv.A00("DirectInboxController.onViewExitFromScreen");
            try {
                if (jr22.A17) {
                    C2DM A006 = C2DL.A00(jr22.A0p());
                    InterfaceC09390do interfaceC09390do3 = jr22.A2Q;
                    C44076Je1 c44076Je1 = (C44076Je1) interfaceC09390do3.getValue();
                    C14360o3.A0B(c44076Je1, 0);
                    A006.A00.remove(c44076Je1);
                    AbstractC43592JPx.A0O(jr22.A24).A02((C44076Je1) interfaceC09390do3.getValue(), C3IL.class);
                    L01 l01 = jr22.A0j;
                    if (l01 != null && (view2 = l01.A00) != null && (runnable2 = l01.A01) != null) {
                        view2.removeCallbacks(runnable2);
                        l01.A00 = null;
                        l01.A01 = null;
                    }
                    L02 l02 = jr22.A0k;
                    if (l02 != null && (view = l02.A00) != null && (runnable = l02.A01) != null) {
                        view.removeCallbacks(runnable);
                        l02.A00 = null;
                        l02.A01 = null;
                    }
                }
                jr22.A0z();
                C23031Ai A007 = AbstractC23021Ah.A00(jr22.A0p());
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A007);
                A0w.E7G("direct_tab_tooltip_timestamp_ms", currentTimeMillis);
                A0w.apply();
                C31349DqE c31349DqE = jr22.A0n;
                if (c31349DqE != null) {
                    AbstractC31177DnL.A1L(c31349DqE);
                }
                jr22.A0n = null;
                jr22.A17 = false;
                A00.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } finally {
                }
            }
        }
    }

    public static final void A07(JR3 jr3) {
        C1VN c1vn = C1VN.A00;
        C43647JSf c43647JSf = jr3.A0I;
        if (c43647JSf != null) {
            c43647JSf.A00();
        }
        jr3.A0I = null;
        if (c1vn != null) {
            c1vn.A02(A01(jr3), jr3.getActivity(), "1170372060962789");
        }
    }

    private final boolean A08() {
        if (this.A0C == null || A00() == 1.0f) {
            return true;
        }
        return false;
    }

    public static final boolean A09(JR3 jr3) {
        JR2 jr2 = jr3.A05;
        if (jr2 != null) {
            AbstractC46972Dl A0u = jr2.A0u();
            if (!(A0u instanceof C2E6) && !C14360o3.A0K(A0u, C47032Dr.A00) && !C14360o3.A0K(A0u, C46962Dk.A00) && !C14360o3.A0K(A0u, C47062Du.A00) && !C14360o3.A0K(A0u, C47092Dx.A00) && !C14360o3.A0K(A0u, C47072Dv.A00) && !C14360o3.A0K(A0u, C132695ys.A00) && !C14360o3.A0K(A0u, C132705yt.A00)) {
                return false;
            }
            return true;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        C31261Doj c31261Doj = this.A02;
        if (c31261Doj == null) {
            return null;
        }
        return c31261Doj.A00;
    }

    @Override // X.C2fe
    public final C25548BRk AvQ() {
        return null;
    }

    @Override // X.InterfaceC1119353f
    public final InterfaceC59992oh B8R() {
        return this;
    }

    @Override // X.C2fe
    public final /* synthetic */ double BbC() {
        return 0.0d;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean BvL() {
        return false;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean Ce6() {
        return false;
    }

    @Override // X.C2fe
    public final boolean Ce8(MotionEvent motionEvent) {
        return "direct_inbox".equals(C26771Rh.A00().A00);
    }

    @Override // X.MR8
    public final void DH0(View view) {
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            jr2.A0A = view;
            ((C64742wY) jr2.A2X.getValue()).A00(view, QPTooltipAnchor.A0X, (AbstractC55352ga) jr2.A2W.getValue());
            JR2.A0O(jr2);
        }
    }

    @Override // X.MR8
    public final void DTU() {
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            C18920wW A0C = AbstractC37300Gc1.A0C(jr2.A2t);
            C14360o3.A0B(A0C, 0);
            F1U.A00(A0C, new C25512BQa(1, 13));
        }
    }

    @Override // X.InterfaceC59832oQ
    public final void DTf() {
        if (this.mView != null) {
            if (!AbstractC43917JbS.A00(A01(this))) {
                A03();
                return;
            }
            return;
        }
        C0w9.A03("ModalListener#DirectInboxController", "Modal fragment closed while view does not exist");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r1 == X.C05F.A0C) goto L11;
     */
    @Override // X.MR8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DjN() {
        /*
            r9 = this;
            X.JR2 r1 = r9.A05
            if (r1 == 0) goto L14
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.JR2.A0Y(r1, r0)
            X.JR2.A0X(r1, r0)
            X.0nk r0 = r1.A0Z
            X.AbstractC43594JPz.A1R(r0)
        L14:
            com.instagram.common.session.UserSession r6 = A01(r9)
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            X.JR2 r2 = r9.A05
            if (r2 == 0) goto L6d
            java.lang.Integer r1 = r9.A0D
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L29
            java.lang.Integer r0 = X.C05F.A0C
            r7 = 0
            if (r1 != r0) goto L2a
        L29:
            r7 = 1
        L2a:
            r8 = 0
            X.0do r1 = r2.A1v
            java.lang.Object r0 = r1.getValue()
            X.Jbu r0 = (X.C43945Jbu) r0
            java.lang.String r4 = r0.A01
            java.lang.Object r0 = r1.getValue()
            X.Jbu r0 = (X.C43945Jbu) r0
            com.instagram.model.direct.DirectThreadKey r3 = r0.A00
            r1 = 0
            android.os.Bundle r2 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID"
            r2.putString(r0, r4)
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = X.C0B1.A00(r3)
            java.lang.String r0 = "DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "DirectInboxSearchFragment.DIRECT_CONTAINER_MARGIN_BOTTOM_PX"
            r2.putInt(r0, r8)
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_MSYS_ENABLED"
            r2.putBoolean(r0, r7)
        L5f:
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            java.lang.String r0 = "direct_search_inbox_fragment"
            X.6XJ r0 = X.AbstractC31176DnK.A0d(r1, r2, r6, r5, r0)
            X.AbstractC31173DnH.A1I(r9, r0)
            return
        L6d:
            r2 = 0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR3.DjN():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r4.equals("direct_tab_bar") != false) goto L19;
     */
    @Override // X.InterfaceC11480j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11520jB E6b() {
        /*
            r6 = this;
            X.0jB r5 = new X.0jB
            r5.<init>()
            X.2dT r0 = r6.A0C
            if (r0 == 0) goto L2c
            X.2fg r0 = r0.C4b()
            java.lang.String r4 = r0.A02
            int r3 = r4.hashCode()
            r0 = -399252132(0xffffffffe833e55c, float:-3.398138E24)
            java.lang.String r2 = "direct_tab_bar"
            java.lang.String r1 = "swipe"
            if (r3 == r0) goto L35
            r0 = 109854522(0x68c3f3a, float:5.275505E-35)
            if (r3 == r0) goto L2d
            r0 = 286908947(0x1119e213, float:1.2139236E-28)
            if (r3 != r0) goto L2c
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L3f
        L2c:
            return r5
        L2d:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L2c
            r2 = r1
            goto L3f
        L35:
            java.lang.String r0 = "on_launch_direct_inbox"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "feed_timeline_tap_to_direct_inbox"
        L3f:
            java.lang.String r0 = "click_point"
            r5.A0A(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR3.E6b():X.0jB");
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        C3FR c3fr;
        JR2 jr2 = this.A05;
        if (jr2 != null && (c3fr = jr2.A0o) != null) {
            c3fr.EMU(jr2.A1L);
        }
    }

    @Override // X.InterfaceC60102os
    public final void EU2(Bundle bundle) {
        C4I3 c4i3;
        this.A0E = bundle.getString("filter_type", "all");
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            String string = bundle.getString("DirectFragment.INBOX_MODE");
            if (string != null) {
                AbstractC46972Dl A00 = AbstractC43928Jbd.A00(string);
                C44113Jed c44113Jed = jr2.A0d;
                if (c44113Jed != null && A00 != null && JR2.A06(jr2).contains(A00)) {
                    c44113Jed.A00(A00);
                }
            }
            String str = this.A0E;
            C44117Jeh c44117Jeh = jr2.A0c;
            if (c44117Jeh != null) {
                C4I3[] values = C4I3.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        c4i3 = values[i];
                        if (AbstractC002300n.A0g(c4i3.A00, str, true)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        c4i3 = C4I3.A03;
                        break;
                    }
                }
                c44117Jeh.A02(AbstractC44116Jeg.A00(c4i3));
            }
            String string2 = bundle.getString("DIRECT_SOURCE_MODULE_NAME", null);
            if (string2 != null) {
                ((AbstractC69603Au) jr2.A2M.getValue()).A0J("source_module", string2);
            }
        }
    }

    @Override // X.MPF
    public final void EfG(InterfaceC53892dT interfaceC53892dT) {
        this.A0C = interfaceC53892dT;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean Ei8() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        X.C2DU.A0A(r11, r6);
     */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.3jU, java.lang.Object, X.3jT] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR3.onActivityResult(int, int, android.content.Intent):void");
    }

    public JR3() {
        C37013GSs c37013GSs = new C37013GSs(this, 45);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37013GSs(new C37013GSs(this, 42), 43));
        this.A0O = AbstractC25225BEi.A0a(new C37013GSs(A00, 44), c37013GSs, new C50170MDx(26, null, A00), AbstractC25225BEi.A1D(C31789Dy8.class));
        this.A0P = 2000L;
        this.A0M = new JR8(this, 1);
        this.A0N = new C43935Jbk(this);
    }

    public static void A05(C25671My c25671My, Class cls, InterfaceC09390do interfaceC09390do) {
        c25671My.A01((InterfaceC41501vz) interfaceC09390do.getValue(), cls);
    }

    public static void A06(C25671My c25671My, Class cls, InterfaceC09390do interfaceC09390do) {
        c25671My.A02((InterfaceC41501vz) interfaceC09390do.getValue(), cls);
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        return (TouchInterceptorFrameLayout) AbstractC166997dE.A0R(requireView(), R.id.container);
    }

    @Override // X.InterfaceC59832oQ
    public final void DTg() {
        if (!AbstractC43917JbS.A00(A01(this))) {
            A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (((X.InterfaceC60172oz) r1).Cen() == false) goto L52;
     */
    @Override // X.InterfaceC53912dV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DWU(X.C54822fg r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR3.DWU(X.2fg):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A01(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(189549689);
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            UserSession A0p = jr2.A0p();
            C14360o3.A0B(A0p, 0);
            ((FJG) A0p.A01(FJG.class, new C57248PbW(A0p, 3))).A00 = AbstractC167007dF.A1O(InterfaceC50519MRw.A01(jr2.A1j).CCs());
        }
        C0f9.A0A(180313075, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1213796274, C0f9.A03(17317601));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Bundle bundle;
        UserSession A01 = A01(this);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, A01, 36317740943808005L);
        if (this.A0I != null) {
            A07(this);
        }
        if (A08()) {
            JR2 jr2 = this.A05;
            if (jr2 != null) {
                if (!C2E9.A07(jr2.A0p())) {
                    AbstractC43594JPz.A1J(jr2);
                }
                C47757L7d c47757L7d = jr2.A0I;
                if (c47757L7d != null) {
                    c47757L7d.A00();
                }
                C61582rL c61582rL = jr2.A1T;
                if (c61582rL != null) {
                    c61582rL.onPause();
                }
            }
            C31665DvV c31665DvV = this.A06;
            if (c31665DvV != null && A06) {
                C31665DvV.A07(c31665DvV, false);
            }
        }
        C31665DvV c31665DvV2 = this.A06;
        if (c31665DvV2 != null && !A06) {
            C31665DvV.A07(c31665DvV2, false);
        }
        AbstractC54332en.A00(A01(this)).A00().A00.AHj();
        UserSession A012 = A01(this);
        C14360o3.A0B(A012, 0);
        if (C18U.A06(c06090Tz, A012, 36320382349484451L) && (bundle = this.mArguments) != null && bundle.getString("jl_hash") != null && bundle.getString("di_id") != null && bundle.getBoolean("back_stack") && getParentFragmentManager().A0L() == 0) {
            C12260kU.A0C(requireContext(), C14H.A00().A02(requireContext(), 335544320));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
    
        if (X.C2E8.A0B(A01(r33), false) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r10.getBoolean("direct_inbox_fragment_is_main_tab") != true) goto L28;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.2wZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JR3.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        IllegalStateException A14;
        int i;
        C43939Jbo A0v;
        C69613Av c69613Av;
        String str;
        String str2;
        C43939Jbo A0v2;
        C69613Av c69613Av2;
        int A02 = C0f9.A02(1154742223);
        C14360o3.A0B(layoutInflater, 0);
        JR2 jr2 = this.A05;
        if (jr2 != null && (A0v2 = jr2.A0v()) != null && (c69613Av2 = ((C98O) A0v2).A03) != null) {
            c69613Av2.A08(null);
        }
        this.A0Q.A02(viewGroup);
        if (AbstractC43917JbS.A00(A01(this))) {
            View A01 = C50802Vb.A01(layoutInflater, viewGroup, R.layout.fragment_direct_inbox_ls);
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
            touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) A01;
            C7N9.A00 = true;
        } else {
            View A012 = C50802Vb.A01(layoutInflater, viewGroup, R.layout.fragment_direct_inbox);
            C14360o3.A0C(A012, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
            touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) A012;
        }
        this.A01 = touchInterceptorFrameLayout;
        JR2 jr22 = this.A05;
        if (jr22 != null) {
            C14360o3.A0B(touchInterceptorFrameLayout, 0);
            try {
                AbstractC09800fd.A01("DirectInboxController.onCreateView", -384707604);
                InterfaceC09390do interfaceC09390do = jr22.A2M;
                ((C98O) AbstractC43592JPx.A0f(interfaceC09390do)).A03.A08(null);
                if (LockedChatKillSwitch.isLockedChatEnabled(jr22.A0p(), false) && C14360o3.A0K(jr22.A0t(), C44037JdO.A00)) {
                    UserSession A0p = jr22.A0p();
                    C14360o3.A0B(A0p, 0);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(A0p, AbstractC111324zv.A00(4637)), AbstractC111324zv.A00(4638));
                    if (A0f.isSampled()) {
                        AbstractC31171DnF.A1C(A0f, "show_locked_thread_list");
                        AbstractC31175DnJ.A17(A0f, "inbox");
                    }
                    touchInterceptorFrameLayout.getViewTreeObserver().addOnWindowFocusChangeListener(new LR5(jr22, 1));
                }
                C43626JRj A0q = jr22.A0q();
                if (C2E8.A02(A0q.A0B)) {
                    C41761wQ c41761wQ = A0q.A0A;
                    C42221xC c42221xC = A0q.A08;
                    if (A0q.A0L) {
                        c42221xC = AbstractC43592JPx.A0R(c42221xC);
                        C14360o3.A0A(c42221xC);
                    }
                    c41761wQ.A02(c42221xC, A0q.A0H);
                }
                C41761wQ c41761wQ2 = A0q.A0A;
                C42221xC c42221xC2 = A0q.A09;
                boolean z = A0q.A0L;
                if (z) {
                    c42221xC2 = AbstractC43592JPx.A0R(c42221xC2);
                    C14360o3.A0A(c42221xC2);
                }
                if (!A0q.A0K) {
                    c42221xC2 = c42221xC2.A0H(new C43923JbY(C44034JdL.A00, 0));
                    C14360o3.A0A(c42221xC2);
                }
                c41761wQ2.A02(c42221xC2, A0q.A0I);
                C42221xC c42221xC3 = A0q.A07;
                if (z) {
                    c42221xC3 = AbstractC43592JPx.A0R(c42221xC3);
                    C14360o3.A0A(c42221xC3);
                }
                c41761wQ2.A02(c42221xC3, A0q.A0G);
                if (AbstractC43593JPy.A1a(jr22)) {
                    InterfaceC50519MRw.A00(jr22).start();
                }
                InterfaceC09390do interfaceC09390do2 = jr22.A1j;
                InterfaceC50519MRw.A01(interfaceC09390do2).start();
                UserSession A0p2 = jr22.A0p();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A0p2, 36325819777365397L)) {
                    InterfaceC50519MRw.A01(interfaceC09390do2).EWh(true);
                }
                ((InterfaceC50519MRw) interfaceC09390do2.getValue()).BOD().start();
                ((InterfaceC50519MRw) interfaceC09390do2.getValue()).B5I().start();
                ((InterfaceC50519MRw) interfaceC09390do2.getValue()).BcG().start();
                jr22.A0C = touchInterceptorFrameLayout;
                if (jr22.A10.CWa()) {
                    jr22.A10 = C44193Jfw.A00(jr22, 45);
                }
                UserSession A0p3 = jr22.A0p();
                Integer num = C05F.A01;
                View A00 = C33L.A00(touchInterceptorFrameLayout, A0p3, num);
                jr22.A0E = new LinearLayoutManager(touchInterceptorFrameLayout.getContext());
                RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(A00, R.id.inbox_refreshable_thread_list_recyclerview);
                recyclerView.setItemAnimator(null);
                recyclerView.A0S = true;
                int A07 = AbstractC25225BEi.A07(c06090Tz, jr22.A0p(), 36605443623818500L);
                if (A07 >= 0) {
                    recyclerView.setItemViewCacheSize(A07);
                }
                AbstractC59962oe abstractC59962oe = jr22.A1L;
                Context context = abstractC59962oe.getContext();
                if (context != null) {
                    if (C2E9.A05(jr22.A0p())) {
                        recyclerView.setClipToPadding(false);
                        recyclerView.setPadding(0, 0, 0, AbstractC25235BEs.A04(context));
                    }
                    AbstractC31172DnG.A1B(context, recyclerView, AbstractC53242c7.A0D(context));
                    InterfaceC09390do interfaceC09390do3 = jr22.A1e;
                    C66362zD c66362zD = ((JXU) interfaceC09390do3.getValue()).A00;
                    C70783Fq recycledViewPool = recyclerView.getRecycledViewPool();
                    C14360o3.A07(recycledViewPool);
                    int A013 = c66362zD.A01(JRL.class);
                    recycledViewPool.A02(A013, 20);
                    recycledViewPool.A02(c66362zD.A01(C31459Ds3.class), 10);
                    Looper.myQueue().addIdleHandler(new JY3(recycledViewPool, recyclerView, c66362zD, jr22, A013));
                    jr22.A0F = recyclerView;
                    C57112jm c57112jm = (C57112jm) jr22.A2w.getValue();
                    if (c57112jm != null) {
                        AbstractC37301Gc2.A0v(recyclerView, c57112jm, abstractC59962oe);
                    }
                    C3FQ A002 = C3FN.A00(recyclerView);
                    C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<com.instagram.direct.inbox.DirectInboxAdapter>");
                    jr22.A0o = (C3FR) A002;
                    LinearLayoutManager linearLayoutManager = jr22.A0E;
                    if (linearLayoutManager == null) {
                        str2 = "layoutManager";
                    } else {
                        recyclerView.setLayoutManager(linearLayoutManager);
                        ((InterfaceC70513Em) jr22.A10.getValue()).Eg0(0);
                        C3FR c3fr = jr22.A0o;
                        str2 = "inboxViewProxy";
                        if (c3fr != null) {
                            c3fr.ETT(0);
                            C3FR c3fr2 = jr22.A0o;
                            if (c3fr2 != null) {
                                c3fr2.Egn(true);
                                C3FR c3fr3 = jr22.A0o;
                                if (c3fr3 != null) {
                                    c3fr3.EPJ((InterfaceC65242xM) interfaceC09390do3.getValue());
                                    C3FR c3fr4 = jr22.A0o;
                                    if (c3fr4 != null) {
                                        c3fr4.Ehc(new RunnableC43779JXs(jr22));
                                        if (AbstractC70443Ed.A00(jr22.A0p())) {
                                            C3FR c3fr5 = jr22.A0o;
                                            if (c3fr5 != null) {
                                                c3fr5.AAJ((C1I2) jr22.A2Y.getValue());
                                            }
                                        }
                                        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                        C31445Drp A003 = AbstractC31589DuH.A00(abstractC59962oe.requireActivity(), abstractC59962oe, jr22.A0p(), 23592969);
                                        jr22.A0q = A003;
                                        C3FR c3fr6 = jr22.A0o;
                                        if (c3fr6 != null) {
                                            c3fr6.AAJ(A003);
                                            C3FR c3fr7 = jr22.A0o;
                                            if (c3fr7 != null) {
                                                C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type com.instagram.actionbar.ActionBarServiceProvider");
                                                c3fr7.AAJ(new C71373Hy((C2d4) abstractC59962oe, 1));
                                                if (LockedChatKillSwitch.isLockedChatEnabled(jr22.A0p(), false) && ((C58655PzS) jr22.A2I.getValue()).A02()) {
                                                    C3FR c3fr8 = jr22.A0o;
                                                    if (c3fr8 != null) {
                                                        c3fr8.Ebv(new C46017KYf(new C50359MLl(jr22, 43), jr22.A0p()));
                                                        C3FR c3fr9 = jr22.A0o;
                                                        if (c3fr9 != null) {
                                                            c3fr9.AAJ(new C46017KYf(new C50359MLl(jr22, 44), jr22.A0p()));
                                                        }
                                                    }
                                                }
                                                C65784Tu2 A004 = AbstractC65908TwF.A00(jr22.A0p(), (InterfaceC62612t0) jr22.A1g.getValue(), (InterfaceC65242xM) interfaceC09390do3.getValue(), null, num, (int) C18U.A01(c06090Tz, jr22.A0p(), 36592309613494711L), true);
                                                jr22.A0p = A004;
                                                C3FR c3fr10 = jr22.A0o;
                                                if (c3fr10 != null) {
                                                    c3fr10.AAJ(A004);
                                                    C3FR c3fr11 = jr22.A0o;
                                                    if (c3fr11 != null) {
                                                        c3fr11.AAJ((C1I2) jr22.A2A.getValue());
                                                        FragmentActivity activity = abstractC59962oe.getActivity();
                                                        if (activity != null && C18U.A06(c06090Tz, jr22.A0p(), 36317534785639767L)) {
                                                            C57982lB.A0B.A04(activity, new C65860TvN(touchInterceptorFrameLayout, 0), false);
                                                        }
                                                        JR2.A0H(jr22);
                                                        ((C98O) AbstractC43592JPx.A0f(interfaceC09390do)).A03.A05();
                                                        C43766JXf c43766JXf = (C43766JXf) jr22.A2P.getValue();
                                                        if (c43766JXf != null && C18U.A06(c06090Tz, c43766JXf.A06, 36326378123048791L)) {
                                                            C0eR c0eR = new C0eR(c43766JXf);
                                                            c43766JXf.A01 = c0eR;
                                                            c43766JXf.A00 = c0eR;
                                                        }
                                                        AbstractC09800fd.A00(311414009);
                                                        C61582rL c61582rL = jr22.A1T;
                                                        if (c61582rL != null) {
                                                            C3FR c3fr12 = jr22.A0o;
                                                            if (c3fr12 != null) {
                                                                c3fr12.AAJ(c61582rL);
                                                            } else {
                                                                C14360o3.A0F("inboxViewProxy");
                                                                throw C00O.createAndThrow();
                                                            }
                                                        }
                                                        if (JR2.A0l(jr22)) {
                                                            C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                                                            C44158JfN c44158JfN = (C44158JfN) new C52942bb(new C44157JfM(jr22.A0p()), abstractC59962oe.getViewModelStore(), C52962bd.A00).A00(C44158JfN.class);
                                                            jr22.A0l = c44158JfN;
                                                            if (c44158JfN != null) {
                                                                MCO.A04(c44158JfN, AbstractC141776au.A00(c44158JfN), 46);
                                                            }
                                                            C44158JfN c44158JfN2 = jr22.A0l;
                                                            if (c44158JfN2 != null) {
                                                                C164387Xb c164387Xb = c44158JfN2.A03;
                                                                Integer num2 = C05F.A00;
                                                                if (c164387Xb.A01()) {
                                                                    C164467Xl c164467Xl = c164387Xb.A02;
                                                                    if (!c164467Xl.A02.getAndSet(true)) {
                                                                        AbstractC23641Du.A03(num2, AnonymousClass191.A00, new C206709Db(c164467Xl, num2, null, null, 4), c164467Xl.A03);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                throw AbstractC166997dE.A0g();
            } catch (Throwable th) {
                AbstractC09800fd.A00(1832104892);
                throw th;
            }
        }
        UserSession A014 = A01(this);
        if (C18U.A06(AbstractC25225BEi.A0j(A014, 0), A014, 36323294337117331L)) {
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new MCI(viewLifecycleOwner, c07s, this, null, 24), C07Y.A00(viewLifecycleOwner));
        }
        C31261Doj c31261Doj = this.A02;
        if (c31261Doj == null) {
            str = "actionBarController";
        } else {
            C14360o3.A0B(touchInterceptorFrameLayout, 0);
            if (!AbstractC43806JYt.A01(c31261Doj.A07)) {
                AbstractC31173DnH.A0G(touchInterceptorFrameLayout, R.id.action_bar_container).inflate();
                C56352iT A015 = C56342iS.A01(ViewOnClickListenerC48072LPx.A00(c31261Doj, 51), AbstractC31176DnK.A0C(touchInterceptorFrameLayout, R.id.action_bar_container));
                c31261Doj.A00 = A015;
                A015.A0X(c31261Doj.A03);
            }
            C43991Jce c43991Jce = this.A03;
            if (c43991Jce == null) {
                str = "actionBarHost";
            } else {
                if (AbstractC43806JYt.A01(c43991Jce.A01)) {
                    View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(touchInterceptorFrameLayout, R.id.action_bar_container), R.layout.igds_action_bar);
                    C14360o3.A0C(A0E, "null cannot be cast to non-null type com.instagram.igds.components.actionbar.IgdsActionBar");
                    IgdsActionBar igdsActionBar = (IgdsActionBar) A0E;
                    TextView textView = igdsActionBar.A03;
                    Resources resources = igdsActionBar.getResources();
                    textView.setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R.dimen.auth_credential_title_text_size), resources.getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size), resources.getDimensionPixelSize(R.dimen.group_mention_sticker_title_text_size_step), 0);
                    C31615Duh c31615Duh = c43991Jce.A02;
                    C31257Dof c31257Dof = (C31257Dof) c31615Duh.A02.A07.getValue();
                    if (c31257Dof != null) {
                        C51760Mtj A005 = C31615Duh.A00(c31257Dof, c31615Duh);
                        if (Systrace.A0E(1L)) {
                            C0fO.A01("PrebindActionBar", -1665963419);
                        }
                        try {
                            igdsActionBar.A01(A005);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(773806610);
                            }
                        } finally {
                        }
                    }
                    Fragment fragment = c43991Jce.A00;
                    C07S c07s2 = C07S.STARTED;
                    C07X viewLifecycleOwner2 = fragment.getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(new MCM(viewLifecycleOwner2, c07s2, igdsActionBar, c43991Jce, null, 24), C07Y.A00(viewLifecycleOwner2));
                }
                C3EG.A00();
                Integer num3 = C05F.A01;
                Context requireContext = requireContext();
                UserSession A016 = A01(this);
                FragmentActivity requireActivity = requireActivity();
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A01;
                if (touchInterceptorFrameLayout2 != null) {
                    View A0S = AbstractC166997dE.A0S(touchInterceptorFrameLayout2, R.id.list_container);
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = this.A01;
                    if (touchInterceptorFrameLayout3 != null) {
                        ViewStub viewStub = (ViewStub) AbstractC166997dE.A0S(touchInterceptorFrameLayout3, R.id.ongoing_call_notification_bar_stub);
                        C50170MDx c50170MDx = new C50170MDx(24, touchInterceptorFrameLayout, this);
                        C50170MDx c50170MDx2 = new C50170MDx(25, touchInterceptorFrameLayout, this);
                        AbstractC167007dF.A1G(A016, 2, viewStub);
                        this.A07 = new C3EQ(requireContext, this, A016, new C3EJ(requireActivity, A0S, viewStub, A016, num3, c50170MDx, c50170MDx2), num3);
                        JR2 jr23 = this.A05;
                        if (jr23 != null && (A0v = jr23.A0v()) != null && (c69613Av = ((C98O) A0v).A03) != null) {
                            c69613Av.A05();
                        }
                        TouchInterceptorFrameLayout touchInterceptorFrameLayout4 = this.A01;
                        C0f9.A09(-1300987733, A02);
                        return touchInterceptorFrameLayout4;
                    }
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = 1809754336;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -1943088613;
                }
                C0f9.A09(i, A02);
                throw A14;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C44137Jf2 c44137Jf2;
        C43787JYa c43787JYa;
        int A02 = C0f9.A02(813233226);
        super.onDestroy();
        C25671My c25671My = this.A00;
        if (c25671My != null) {
            c25671My.A02(this.A0M, C2AS.class);
        }
        C218914p.A06(this);
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.onDestroy");
            try {
                InterfaceC09390do interfaceC09390do = jr2.A24;
                C25671My A0O = AbstractC43592JPx.A0O(interfaceC09390do);
                A06(A0O, C23607Ad1.class, jr2.A1y);
                InterfaceC41501vz interfaceC41501vz = jr2.A0V;
                if (interfaceC41501vz == null) {
                    C14360o3.A0F("userUpdatedListener");
                } else {
                    A0O.A02(interfaceC41501vz, C2AS.class);
                    InterfaceC41501vz interfaceC41501vz2 = jr2.A0U;
                    if (interfaceC41501vz2 == null) {
                        C14360o3.A0F("userFollowStatusUpdatedListener");
                    } else {
                        A0O.A02(interfaceC41501vz2, C70073Cr.class);
                        InterfaceC41501vz interfaceC41501vz3 = jr2.A0L;
                        if (interfaceC41501vz3 == null) {
                            C14360o3.A0F("awaitingIrisDeltasUpdatedEventListener");
                        } else {
                            A0O.A02(interfaceC41501vz3, C5EW.class);
                            A0O.A02(jr2.A0P, C43686JTv.class);
                            InterfaceC41501vz interfaceC41501vz4 = jr2.A0O;
                            if (interfaceC41501vz4 == null) {
                                C14360o3.A0F("irisErrorStatusUpdatedListener");
                            } else {
                                A0O.A02(interfaceC41501vz4, LYI.class);
                                InterfaceC41501vz interfaceC41501vz5 = jr2.A0Q;
                                if (interfaceC41501vz5 == null) {
                                    C14360o3.A0F("latestReelMediaUpdatedEventListener");
                                } else {
                                    A0O.A02(interfaceC41501vz5, JYS.class);
                                    InterfaceC41501vz interfaceC41501vz6 = jr2.A0M;
                                    if (interfaceC41501vz6 == null) {
                                        C14360o3.A0F("generalFolderStatusUpdatedListener");
                                    } else {
                                        A0O.A02(interfaceC41501vz6, LY2.class);
                                        A06(A0O, C48062It.class, jr2.A1i);
                                        A06(A0O, C121285eR.class, jr2.A2h);
                                        C25671My A0O2 = AbstractC43592JPx.A0O(interfaceC09390do);
                                        InterfaceC41501vz interfaceC41501vz7 = jr2.A0T;
                                        if (interfaceC41501vz7 == null) {
                                            C14360o3.A0F("subIrisUpdateEventListener");
                                        } else {
                                            A0O2.A02(interfaceC41501vz7, C5EX.class);
                                            C25671My A0O3 = AbstractC43592JPx.A0O(interfaceC09390do);
                                            InterfaceC41501vz interfaceC41501vz8 = jr2.A0N;
                                            if (interfaceC41501vz8 == null) {
                                                C14360o3.A0F("initialSnapshotUpdateEvent");
                                            } else {
                                                A0O3.A02(interfaceC41501vz8, C132725yv.class);
                                                if (jr2.A0S != null) {
                                                    C25671My A0O4 = AbstractC43592JPx.A0O(interfaceC09390do);
                                                    InterfaceC41501vz interfaceC41501vz9 = jr2.A0S;
                                                    if (interfaceC41501vz9 == null) {
                                                        C14360o3.A0F("secureThreadsInitialLoadingStartedEventListener");
                                                    } else {
                                                        A0O4.A02(interfaceC41501vz9, C132905zF.class);
                                                    }
                                                }
                                                if (jr2.A0R != null) {
                                                    C25671My A0O5 = AbstractC43592JPx.A0O(interfaceC09390do);
                                                    InterfaceC41501vz interfaceC41501vz10 = jr2.A0R;
                                                    if (interfaceC41501vz10 == null) {
                                                        C14360o3.A0F("secureThreadsInitialLoadingEndedEventListener");
                                                    } else {
                                                        A0O5.A02(interfaceC41501vz10, C133035zS.class);
                                                    }
                                                }
                                                C2KW.A02(jr2.A0p(), (C2KV) jr2.A23.getValue());
                                                AbstractC43592JPx.A0g(jr2).A00 = null;
                                                jr2.A2X.getValue();
                                                AbstractC59962oe abstractC59962oe = jr2.A1L;
                                                C31613Duf c31613Duf = jr2.A0a;
                                                if (c31613Duf == null) {
                                                    C14360o3.A0F("directIceBreakerSettingFragmentLifecycleListener");
                                                } else {
                                                    abstractC59962oe.unregisterLifecycleListener(c31613Duf);
                                                    JXU jxu = (JXU) jr2.A1e.getValue();
                                                    if (jxu != null) {
                                                        jxu.A01.A00 = null;
                                                    }
                                                    AbstractC75493aG.A00(jr2.A0p()).A00(jr2);
                                                    MRN C0B = AbstractC43593JPy.A0V(jr2).C0B();
                                                    if ((C0B instanceof C43787JYa) && (c43787JYa = (C43787JYa) C0B) != null) {
                                                        JS8 js8 = c43787JYa.A07;
                                                        js8.A01 = null;
                                                        js8.A03 = null;
                                                        js8.A00 = null;
                                                    }
                                                    if (jr2.A0G != null) {
                                                        C61A.A02(jr2.A0p(), true).getSessionedNotificationCenter().removeObserver(jr2.A0G, "MEMOfflineHandlingCompletionNotification", null);
                                                    }
                                                    if (C2E9.A09(jr2.A0p())) {
                                                        C10190gb A002 = C10190gb.A00();
                                                        InterfaceC10180ga interfaceC10180ga = (InterfaceC10180ga) jr2.A2L.getValue();
                                                        if (interfaceC10180ga != null) {
                                                            A002.A00.remove(interfaceC10180ga);
                                                        }
                                                    }
                                                    A00.close();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw C00O.createAndThrow();
            } finally {
            }
        }
        C31261Doj c31261Doj = this.A02;
        if (c31261Doj == null) {
            C14360o3.A0F("actionBarController");
            throw C00O.createAndThrow();
        }
        c31261Doj.A01 = null;
        C31665DvV c31665DvV = this.A06;
        if (c31665DvV != null && (c44137Jf2 = c31665DvV.A01) != null) {
            C7GN c7gn = c44137Jf2.A01;
            if (c7gn != null) {
                c7gn.A0E();
            }
            c44137Jf2.A01 = null;
        }
        C0f9.A09(-384274733, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        C44158JfN c44158JfN;
        int A02 = C0f9.A02(-41206224);
        this.A0Q.A01();
        C3EQ c3eq = this.A07;
        if (c3eq != null) {
            c3eq.A01();
            this.A07 = null;
        }
        super.onDestroyView();
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.onDestroyView");
            try {
                C3FR c3fr = jr2.A0o;
                if (c3fr != null) {
                    c3fr.AI0();
                    C3FR c3fr2 = jr2.A0o;
                    if (c3fr2 != null) {
                        c3fr2.EPJ(null);
                        C5G2 c5g2 = (C5G2) jr2.A2J.getValue();
                        c5g2.A00 = false;
                        c5g2.A01 = false;
                        if (AbstractC167007dF.A1Z(jr2.A2D)) {
                            jr2.A1b.clear();
                        }
                        jr2.A1W.clear();
                        jr2.A1Y.clear();
                        jr2.A0z();
                        Pair pair = jr2.A08;
                        if (pair != null) {
                            Object obj = pair.second;
                            if (obj != null) {
                                ((C55982hj) obj).A0D.clear();
                                jr2.A08 = null;
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        if (AbstractC43593JPy.A1a(jr2)) {
                            InterfaceC50519MRw.A00(jr2).cancel();
                        }
                        InterfaceC09390do interfaceC09390do = jr2.A1j;
                        InterfaceC50519MRw.A01(interfaceC09390do).cancel();
                        jr2.A0q().A0A.A01();
                        ((C64742wY) jr2.A2X.getValue()).onDestroyView();
                        jr2.A1K.removeCallbacksAndMessages(null);
                        C69433Ad c69433Ad = (C69433Ad) jr2.A1x.getValue();
                        if (c69433Ad != null) {
                            c69433Ad.A02.clear();
                        }
                        jr2.A0q = null;
                        jr2.A0A = null;
                        jr2.A09 = null;
                        InterfaceC169517hR interfaceC169517hR = jr2.A0t;
                        if (interfaceC169517hR != null) {
                            interfaceC169517hR.DEw();
                        }
                        jr2.A0t = null;
                        ((InterfaceC50519MRw) interfaceC09390do.getValue()).BOD().stop();
                        ((InterfaceC50519MRw) interfaceC09390do.getValue()).B5I().stop();
                        ((InterfaceC50519MRw) interfaceC09390do.getValue()).BcG().stop();
                        if (AbstractC167007dF.A1Z(jr2.A2F)) {
                            C44099JeO A002 = AbstractC43912JbN.A00(jr2.A0p());
                            ((C41761wQ) AbstractC166987dD.A17(((LF1) A002.A08.getValue()).A08)).A01();
                            C47816L9y c47816L9y = (C47816L9y) A002.A04.getValue();
                            ((C41761wQ) AbstractC166987dD.A17(c47816L9y.A05.A07)).A01();
                            ((C41761wQ) AbstractC166987dD.A17(c47816L9y.A04.A07)).A01();
                            ((C47553KzO) A002.A05.getValue()).A00.A01();
                        }
                        C43766JXf c43766JXf = (C43766JXf) jr2.A2P.getValue();
                        if (c43766JXf != null) {
                            UserSession userSession = c43766JXf.A06;
                            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36326378123048791L)) {
                                C0eR c0eR = c43766JXf.A01;
                                if (c0eR.A00 != C07S.INITIALIZED) {
                                    c0eR.A0C(C07S.DESTROYED);
                                }
                            }
                        }
                        AbstractRunnableC14200nk abstractRunnableC14200nk = jr2.A0Z;
                        if (abstractRunnableC14200nk != null) {
                            C14270nr.A00().A02(abstractRunnableC14200nk);
                        }
                        AbstractRunnableC14200nk abstractRunnableC14200nk2 = jr2.A0W;
                        if (abstractRunnableC14200nk2 != null) {
                            C14270nr.A00().A02(abstractRunnableC14200nk2);
                        }
                        A00.close();
                        if (JR2.A0l(jr2) && (c44158JfN = jr2.A0l) != null) {
                            C164387Xb c164387Xb = c44158JfN.A03;
                            if (c164387Xb.A01()) {
                                C164467Xl c164467Xl = c164387Xb.A02;
                                if (c164467Xl.A02.getAndSet(false)) {
                                    C57Z.A02(c164467Xl.A03.Arv());
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("inboxViewProxy");
                throw C00O.createAndThrow();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C20I.A00(A00, th);
                    throw th2;
                }
            }
        }
        C31261Doj c31261Doj = this.A02;
        if (c31261Doj == null) {
            str = "actionBarController";
        } else {
            if (!AbstractC43806JYt.A01(c31261Doj.A07)) {
                C41451vu.A01.A03(c31261Doj.A06, C71923Kp.class);
            }
            C31256Doe c31256Doe = this.A04;
            if (c31256Doe == null) {
                str = "actionBarRepository";
            } else {
                if (AbstractC43806JYt.A01(c31256Doe.A06)) {
                    C41451vu.A01.A03(c31256Doe.A05, C71923Kp.class);
                }
                C58652mO c58652mO = JY5.A01;
                if (c58652mO != null && JY5.A00 != null) {
                    c58652mO.stop();
                    C58652mO c58652mO2 = JY5.A01;
                    if (c58652mO2 != null) {
                        Animator.AnimatorListener animatorListener = JY5.A00;
                        if (animatorListener != null) {
                            c58652mO2.EFV(animatorListener);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                JY5.A01 = null;
                JY5.A00 = null;
                this.A0H = null;
                C0f9.A09(1244280756, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        JR2 jr2;
        C61582rL c61582rL;
        int A02 = C0f9.A02(1533671550);
        super.onPause();
        InterfaceC53892dT interfaceC53892dT = this.A0C;
        if (interfaceC53892dT != null) {
            interfaceC53892dT.C4b().A01(this);
        }
        if (A08() && (jr2 = this.A05) != null && (c61582rL = jr2.A1T) != null) {
            c61582rL.onPause();
        }
        A04();
        JR2 jr22 = this.A05;
        if (jr22 != null) {
            jr22.A1D = false;
        }
        C43647JSf c43647JSf = this.A0I;
        if (c43647JSf != null) {
            c43647JSf.A00();
        }
        C0f9.A09(-1152062616, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        View findViewById;
        C43939Jbo A0v;
        C69613Av c69613Av;
        C43939Jbo A0v2;
        C69613Av c69613Av2;
        int A02 = C0f9.A02(-1748124861);
        JR2 jr2 = this.A05;
        if (jr2 != null && (A0v2 = jr2.A0v()) != null && (c69613Av2 = ((C98O) A0v2).A05) != null) {
            c69613Av2.A04();
        }
        super.onResume();
        if (A08()) {
            A03();
        }
        InterfaceC53892dT interfaceC53892dT = this.A0C;
        if (interfaceC53892dT != null) {
            interfaceC53892dT.C4b().A00(this);
        }
        JR2 jr22 = this.A05;
        if (jr22 != null && (A0v = jr22.A0v()) != null && (c69613Av = ((C98O) A0v).A05) != null) {
            c69613Av.A05();
        }
        C43647JSf c43647JSf = this.A0I;
        if (c43647JSf != null) {
            c43647JSf.A01();
        }
        if (C18U.A06(C06090Tz.A06, A01(this), 36329298700812539L) && (view = this.mView) != null && (findViewById = view.findViewById(R.id.header_notification_settings_icon)) != null) {
            findViewById.setVisibility(AbstractC167007dF.A05(!AbstractC14480oK.A01(requireContext()) ? 1 : 0));
        }
        C0f9.A09(-1591779454, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-800340148);
        super.onStart();
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.onStart");
            try {
                if (jr2.A03 > 0) {
                    C226218q.A01(AbstractC12960li.A00).A0T((C43940Jbp) jr2.A2k.getValue());
                }
                View view = jr2.A1L.mView;
                if (view != null) {
                    view.post(new JZR(jr2));
                }
                A00.close();
            } finally {
            }
        }
        if (AbstractC1570673l.A01(A01(this))) {
            AbstractC1570673l.A00(A01(this)).A02.A02();
        }
        C0f9.A09(-393626338, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-925312385);
        super.onStop();
        JR2 jr2 = this.A05;
        if (jr2 != null) {
            C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.onStop");
            try {
                if (C18U.A06(C06090Tz.A05, jr2.A0p(), 36325227071943578L)) {
                    JR2.A0N(jr2);
                }
                jr2.A03++;
                A00.close();
            } finally {
            }
        }
        if (AbstractC1570673l.A01(A01(this))) {
            AbstractC1570673l.A00(A01(this)).A00();
        }
        C0f9.A09(2145725732, A02);
    }
}
