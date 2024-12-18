package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.model.launcher.AutoSendMessageData;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;

/* renamed from: X.983, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass983 implements InterfaceC60072op, C2d4, InterfaceC1119353f {
    public static boolean A1f;
    public float A00;
    public int A01;
    public Context A02;
    public FrameLayout A03;
    public C56352iT A04;
    public A9L A05;
    public C3I9 A06;
    public TouchInterceptorFrameLayout A07;
    public C22996ABv A08;
    public FR3 A09;
    public C55076OaW A0A;
    public C7DS A0B;
    public AGN A0C;
    public DirectAggregatedMediaViewerController A0D;
    public C7W4 A0E;
    public C51B A0F;
    public C159577Ds A0G;
    public C7DQ A0H;
    public C7DI A0I;
    public C164087Vx A0J;
    public C7VU A0K;
    public KB3 A0L;
    public C159587Dt A0M;
    public AA4 A0N;
    public AA5 A0O;
    public C3EQ A0P;
    public C31600DuS A0Q;
    public C159737El A0R;
    public FM2 A0S;
    public C7DZ A0T;
    public C159547Dp A0U;
    public C7E0 A0V;
    public C7DK A0W;
    public C22976ABa A0X;
    public AAK A0Y;
    public AGM A0Z;
    public C7DX A0a;
    public C3o9 A0b;
    public Integer A0c;
    public String A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public FNO A0m;
    public AGL A0n;
    public C22929A8z A0o;
    public boolean A0p;
    public final int A0q;
    public final Bundle A0r;
    public final C06N A0s;
    public final InterfaceC60122ou A0t;
    public final AbstractC59962oe A0u;
    public final C25671My A0v;
    public final InterfaceC41501vz A0w;
    public final InterfaceC41501vz A0x;
    public final InterfaceC59992oh A0y;
    public final InterfaceC60602pj A0z;
    public final UserSession A10;
    public final C1GL A11;
    public final InterfaceC60152ox A12;
    public final Capabilities A13;
    public final C163917Vf A14;
    public final C163987Vm A15;
    public final C7Vn A16;
    public final C164057Vu A17;
    public final C163997Vo A18;
    public final C163947Vi A19;
    public final C163907Ve A1A;
    public final C163867Va A1B;
    public final C164047Vt A1C;
    public final AnonymousClass982 A1D;
    public final C7VS A1E;
    public final C98K A1F;
    public final InterfaceC163937Vh A1G;
    public final AnonymousClass988 A1H;
    public final C7VQ A1I;
    public final C98N A1J;
    public final InterfaceC93894Jz A1K;
    public final C7VF A1L;
    public final C2055097z A1M;
    public final C27B A1N;
    public final AnonymousClass981 A1O;
    public final InterfaceC163977Vl A1P;
    public final InterfaceC60442pS A1Q = new Object();
    public final DirectThreadKey A1R;
    public final InterfaceC83713oG A1S;
    public final AnonymousClass987 A1T;
    public final String A1U;
    public final String A1V;
    public final String A1W;
    public final InterfaceC08830cm A1X;
    public final InterfaceC09390do A1Y;
    public final InterfaceC09390do A1Z;
    public final InterfaceC09390do A1a;
    public final C006802i A1b;
    public final C7VZ A1c;
    public final InterfaceC164017Vq A1d;
    public final InterfaceC09390do A1e;

    public final void A0I(View view, Bundle bundle) {
        C56352iT c56352iT;
        InterfaceC60442pS interfaceC60442pS;
        C7W4 A01;
        Context context;
        int i;
        AbstractC09800fd.A01("DirectThreadToggleController.onViewCreated", 286541589);
        try {
            C98N c98n = this.A1J;
            C69613Av c69613Av = c98n.A07;
            boolean z = true;
            c69613Av.A08(null);
            C2055097z c2055097z = this.A1M;
            AnonymousClass980 anonymousClass980 = c2055097z.A06;
            anonymousClass980.A01(null);
            this.A07 = (TouchInterceptorFrameLayout) view.requireViewById(R.id.thread_fragment_container);
            View rootView = view.getRootView();
            C14360o3.A0C(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            Context context2 = this.A02;
            String str = "context";
            if (context2 != null) {
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setId(R.id.powerups_foreground_fullscreen);
                frameLayout.setVisibility(8);
                this.A03 = frameLayout;
                viewGroup.addView(frameLayout, -1, -1);
                final UserSession userSession = this.A10;
                if (!C7VR.A00(userSession)) {
                    View requireViewById = view.requireViewById(R.id.direct_thread_toggle_action_bar);
                    C14360o3.A07(requireViewById);
                    c56352iT = C56342iS.A01(new ViewOnClickListenerC23203AQn(this), (ViewGroup) requireViewById);
                } else {
                    c56352iT = null;
                }
                this.A04 = c56352iT;
                InterfaceC09390do interfaceC09390do = this.A1Z;
                C159457Dg c159457Dg = (C159457Dg) interfaceC09390do.getValue();
                if (c159457Dg.A09) {
                    view.requireViewById(R.id.direct_thread_toggle_action_bar).setVisibility(8);
                    View requireViewById2 = view.requireViewById(R.id.intercept_follows_message_header);
                    C14360o3.A07(requireViewById2);
                    ((ViewStub) requireViewById2).inflate();
                    view.requireViewById(R.id.intercept_follows_message_header).setVisibility(0);
                    c159457Dg.A02 = (StackedAvatarView) view.requireViewById(R.id.intercept_follows_message_stacked_avatar_view);
                    c159457Dg.A01 = (IgTextView) view.requireViewById(R.id.title_intercept_follows_message_textview);
                }
                AbstractC59962oe abstractC59962oe = this.A0u;
                this.A0k = abstractC59962oe.requireArguments().getBoolean("bundle_extra_omnipicker_is_chat_preview", false);
                this.A0i = abstractC59962oe.requireArguments().getBoolean("bundle_extra_omnipicker_creating_new_group", false);
                if (this.A0k) {
                    C56352iT c56352iT2 = this.A04;
                    if (c56352iT2 != null) {
                        c56352iT2.EkF(false);
                    }
                    C56352iT c56352iT3 = this.A04;
                    if (c56352iT3 != null) {
                        ViewGroup viewGroup2 = c56352iT3.A0P;
                        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                        layoutParams.height = 0;
                        viewGroup2.setLayoutParams(layoutParams);
                    }
                    View requireViewById3 = view.requireViewById(R.id.direct_thread_content_below_action_bar);
                    C14360o3.A07(requireViewById3);
                    ViewGroup.LayoutParams layoutParams2 = requireViewById3.getLayoutParams();
                    C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
                    requireViewById3.setLayoutParams(layoutParams3);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    C159467Dh A00 = C3I7.A00(view);
                    A00.A9e(this.A12);
                    this.A06 = A00;
                } else {
                    this.A06 = C3I7.A01(this, false, false);
                }
                AbstractC10360h2 childFragmentManager = abstractC59962oe.getChildFragmentManager();
                String A002 = AbstractC111324zv.A00(3576);
                C51B c51b = (C51B) childFragmentManager.A0Q(A002);
                if (c51b != null) {
                    this.A0F = c51b;
                } else {
                    this.A0F = A02(this.A0r, this, false);
                    C14240no c14240no = new C14240no(abstractC59962oe.getChildFragmentManager());
                    C51B c51b2 = this.A0F;
                    C14360o3.A0A(c51b2);
                    c14240no.A0C(c51b2, A002, R.id.thread_toggle_child_fragment_container);
                    c14240no.A00();
                }
                AbstractC09800fd.A01("DirectThreadToggleController.initializeControllers", -1313758372);
                AnonymousClass980 anonymousClass9802 = c2055097z.A03;
                anonymousClass9802.A01(null);
                try {
                    View view2 = AbstractC56372iV.A01(view.findViewById(R.id.direct_thread_command_picker_container), false, false).getView();
                    View requireViewById4 = view.requireViewById(R.id.direct_command_picker_constraint_layout);
                    C14360o3.A07(requireViewById4);
                    View requireViewById5 = view.requireViewById(R.id.commands_list);
                    C14360o3.A07(requireViewById5);
                    interfaceC60442pS = this.A1Q;
                    this.A0U = new C159547Dp(view2, requireViewById4, (RecyclerView) requireViewById5, interfaceC60442pS);
                    A01 = A01(this);
                    context = this.A02;
                } catch (Throwable th) {
                    th = th;
                }
                if (context == null) {
                    C14360o3.A0F("context");
                    throw C00O.createAndThrow();
                }
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A07;
                if (touchInterceptorFrameLayout != null) {
                    Bundle bundle2 = this.A0r;
                    String string = bundle2.getString("DirectFragment.ENTRY_POINT");
                    if (string != null) {
                        String str2 = this.A1U;
                        Capabilities capabilities = this.A13;
                        String string2 = bundle2.getString("direct_story_creator_id");
                        InterfaceC59992oh interfaceC59992oh = this.A0y;
                        InterfaceC163977Vl interfaceC163977Vl = this.A1P;
                        try {
                            this.A0G = new C159577Ds(context, view, requireActivity, interfaceC59992oh, userSession, touchInterceptorFrameLayout, capabilities, new C159567Dr(A01), this.A14, this.A15, this.A16, this.A1O, interfaceC163977Vl, interfaceC60442pS, string, str2, string2, new C9ED(this, 35), new C9ED(this, 36));
                            anonymousClass9802.A02(null);
                            AbstractC09800fd.A00(-944845384);
                            this.A0M = (C159587Dt) userSession.A01(C159587Dt.class, new InterfaceC16820sZ() { // from class: X.7Du
                                @Override // X.InterfaceC16820sZ
                                public final Object invoke() {
                                    UserSession userSession2 = UserSession.this;
                                    return new C159587Dt(AbstractC11060iN.A00(userSession2), userSession2, C13920nI.A00, RealtimeClientManager.getInstance(userSession2));
                                }
                            });
                            final C81663kb A05 = A05(this);
                            FragmentActivity requireActivity2 = abstractC59962oe.requireActivity();
                            C159627Dy c159627Dy = new C159627Dy(interfaceC60442pS, userSession);
                            C159547Dp c159547Dp = this.A0U;
                            C9ED c9ed = new C9ED(this, 40);
                            C14360o3.A0B(interfaceC60442pS, 4);
                            this.A0V = new C159637Dz(requireActivity2, interfaceC60442pS, userSession, c159627Dy, c159547Dp, c9ed);
                            InterfaceC159557Dq interfaceC159557Dq = new InterfaceC159557Dq() { // from class: X.7E5
                                @Override // X.InterfaceC159557Dq
                                public final boolean onBackPressed() {
                                    KB3 kb3 = AnonymousClass983.this.A0L;
                                    if (kb3 == null || !kb3.isVisible() || kb3.A02.A0G) {
                                        return false;
                                    }
                                    return kb3.onBackPressed();
                                }
                            };
                            final C7W4 A012 = A01(this);
                            boolean z2 = abstractC59962oe.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false);
                            View requireViewById6 = view.requireViewById(R.id.thread_fragment_container);
                            C14360o3.A07(requireViewById6);
                            ViewGroup viewGroup3 = (ViewGroup) requireViewById6;
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("DirectAggregatedMediaViewerController.init", 1502284033);
                            }
                            try {
                                DirectAggregatedMediaViewerController directAggregatedMediaViewerController = new DirectAggregatedMediaViewerController(abstractC59962oe.requireActivity(), userSession, this.A06, 96, z, z2);
                                this.A0D = directAggregatedMediaViewerController;
                                interfaceC59992oh.registerLifecycleListener(directAggregatedMediaViewerController);
                                if (Systrace.A0E(1L)) {
                                    C0fO.A00(-81931457);
                                }
                                if (Systrace.A0E(1L)) {
                                    C0fO.A01("DirectThreadComposerController.init", 377885560);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (Systrace.A0E(1L)) {
                                    i = -1715667078;
                                } else {
                                    throw th;
                                }
                            }
                            try {
                                Context context3 = this.A02;
                                if (context3 == null) {
                                    C14360o3.A0F("context");
                                } else {
                                    C7E0 c7e0 = this.A0V;
                                    C7VF c7vf = this.A1L;
                                    C163997Vo c163997Vo = this.A18;
                                    C3I9 c3i9 = this.A06;
                                    DirectAggregatedMediaViewerController directAggregatedMediaViewerController2 = this.A0D;
                                    if (directAggregatedMediaViewerController2 == null) {
                                        C14360o3.A0F("directAggregatedMediaViewerController");
                                    } else {
                                        boolean z3 = false;
                                        if (this.A0q != 0) {
                                            z3 = true;
                                        }
                                        InterfaceC164017Vq interfaceC164017Vq = this.A1d;
                                        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.7EX
                                            @Override // X.InterfaceC08830cm
                                            public final /* bridge */ /* synthetic */ Object get() {
                                                return C2EC.this;
                                            }
                                        };
                                        C159547Dp c159547Dp2 = this.A0U;
                                        boolean z4 = false;
                                        if (A012.A0F != null) {
                                            z4 = true;
                                        }
                                        InterfaceC08830cm interfaceC08830cm2 = new InterfaceC08830cm() { // from class: X.7EY
                                            @Override // X.InterfaceC08830cm
                                            public final /* bridge */ /* synthetic */ Object get() {
                                                C7W4 c7w4 = C7W4.this;
                                                boolean z5 = false;
                                                if ((c7w4.A08 != null && c7w4.A0j.A0O.CYr()) || c7w4.A0F != null) {
                                                    z5 = true;
                                                }
                                                return Boolean.valueOf(z5);
                                            }
                                        };
                                        C7EZ c7ez = C7EZ.A00;
                                        InterfaceC08830cm interfaceC08830cm3 = new InterfaceC08830cm() { // from class: X.7Ea
                                            @Override // X.InterfaceC08830cm
                                            public final /* bridge */ /* synthetic */ Object get() {
                                                return C7W4.this.A0N();
                                            }
                                        };
                                        InterfaceC08830cm interfaceC08830cm4 = new InterfaceC08830cm() { // from class: X.7Eb
                                            @Override // X.InterfaceC08830cm
                                            public final /* bridge */ /* synthetic */ Object get() {
                                                C7W4 c7w4 = C7W4.this;
                                                UserSession userSession2 = c7w4.A0d;
                                                C7U0 c7u0 = c7w4.A08;
                                                if (c7u0 == null) {
                                                    C14360o3.A0F("clientInfra");
                                                    throw C00O.createAndThrow();
                                                }
                                                return Boolean.valueOf(C6X6.A0F(userSession2, c7u0.C7r().C7W().A0G));
                                            }
                                        };
                                        InterfaceC08830cm interfaceC08830cm5 = new InterfaceC08830cm() { // from class: X.7Ec
                                            @Override // X.InterfaceC08830cm
                                            public final /* bridge */ /* synthetic */ Object get() {
                                                return C7W4.this.A0H(true);
                                            }
                                        };
                                        String str3 = this.A1V;
                                        InterfaceC83713oG A003 = AnonymousClass985.A00(bundle2);
                                        Boolean valueOf = Boolean.valueOf(z2);
                                        C7DZ c7dz = this.A0T;
                                        if (c7dz == null) {
                                            C14360o3.A0F("selectedMediaViewModel");
                                        } else {
                                            C98L c98l = (C98L) this.A1a.getValue();
                                            C7VZ c7vz = this.A1c;
                                            UserSession userSession2 = A012.A0d;
                                            C159697Eh c159697Eh = new C159697Eh(userSession2, new C7WM(new AnonymousClass014(A012) { // from class: X.7Eg
                                                @Override // X.InterfaceC016806n
                                                public final Object get() {
                                                    C7U0 c7u0 = ((C7W4) this.receiver).A08;
                                                    if (c7u0 == null) {
                                                        C14360o3.A0F("clientInfra");
                                                        throw C00O.createAndThrow();
                                                    }
                                                    return c7u0;
                                                }
                                            }));
                                            C159727Ek c159727Ek = new C159727Ek(userSession2, new InterfaceC08830cm() { // from class: X.7Ei
                                                @Override // X.InterfaceC08830cm
                                                public final /* bridge */ /* synthetic */ Object get() {
                                                    return C7W4.this.A0U.getActivity();
                                                }
                                            }, new InterfaceC08830cm() { // from class: X.7Ej
                                                @Override // X.InterfaceC08830cm
                                                public final /* bridge */ /* synthetic */ Object get() {
                                                    return C7W4.this.A0L();
                                                }
                                            }, A012.A0L);
                                            C7DK c7dk = this.A0W;
                                            if (c7dk == null) {
                                                C14360o3.A0F("audioPlayer");
                                            } else {
                                                C159737El c159737El = new C159737El(context3, viewGroup3, this, interfaceC60442pS, userSession, c3i9, directAggregatedMediaViewerController2, c7vz, c163997Vo, c159727Ek, c159697Eh, c98l, c98n, c7vf, c7dz, c159547Dp2, c7e0, interfaceC164017Vq, c7dk, A003, interfaceC159557Dq, valueOf, str3, interfaceC08830cm, interfaceC08830cm2, c7ez, interfaceC08830cm3, interfaceC08830cm4, interfaceC08830cm5, z3, z4);
                                                if (Systrace.A0E(1L)) {
                                                    C0fO.A00(-1912284119);
                                                }
                                                this.A0R = c159737El;
                                                c159737El.A18 = this.A0k;
                                                c159737El.A12 = this.A0i;
                                                c159737El.A0x = bundle2.getString("direct_story_creator_id", null);
                                                this.A0d = bundle2.getString(AbstractC111324zv.A00(3564), null);
                                                c159737El.A0O = new C7FW(A012, this);
                                                c159737El.A0P = new C7FX(A012, this);
                                                C7VQ c7vq = this.A1I;
                                                C14360o3.A0B(viewGroup3, 0);
                                                for (C7VI c7vi : c7vq.A00) {
                                                    if (c7vi instanceof C7VH) {
                                                        C7VH c7vh = (C7VH) c7vi;
                                                        c7vh.A00 = viewGroup3;
                                                        if (c7vh.A03 != null && c7vh.A02 != null) {
                                                            C7VH.A01(c7vh);
                                                        }
                                                    }
                                                }
                                                A0J(C7DC.A08.A02(abstractC59962oe.requireContext(), userSession, A03(this).A0G, A05));
                                                if (A05 != null) {
                                                    C159577Ds c159577Ds = this.A0G;
                                                    if (c159577Ds == null) {
                                                        str = "lazyControllers";
                                                    } else {
                                                        ((C7I9) c159577Ds.A0N.getValue()).A02(A05);
                                                    }
                                                }
                                                if (!((C159457Dg) interfaceC09390do.getValue()).A09) {
                                                    C3EG.A00();
                                                    Integer num = C05F.A00;
                                                    Context context4 = this.A02;
                                                    if (context4 != null) {
                                                        FragmentActivity requireActivity3 = abstractC59962oe.requireActivity();
                                                        View requireViewById7 = view.requireViewById(R.id.direct_thread_content_below_action_bar);
                                                        C14360o3.A07(requireViewById7);
                                                        View requireViewById8 = view.requireViewById(R.id.ongoing_call_notification_bar_stub);
                                                        C14360o3.A07(requireViewById8);
                                                        ViewStub viewStub = (ViewStub) requireViewById8;
                                                        C9F5 c9f5 = new C9F5(40, view, this);
                                                        C9F5 c9f52 = new C9F5(41, view, this);
                                                        C14360o3.A0B(viewStub, 5);
                                                        this.A0P = new C3EQ(context4, interfaceC60442pS, userSession, new C3EJ(requireActivity3, requireViewById7, viewStub, userSession, num, c9f5, c9f52), num);
                                                    }
                                                }
                                                C25671My c25671My = this.A0v;
                                                c25671My.A01(this.A0x, C7IB.class);
                                                c25671My.A01(this.A0w, C7IC.class);
                                                if (bundle != null) {
                                                    String string3 = bundle.getString(AbstractC111324zv.A00(3509));
                                                    this.A0e = string3;
                                                    if (string3 != null) {
                                                        C159737El c159737El2 = this.A0R;
                                                        if (c159737El2 != null) {
                                                            c159737El2.A1U((List) AbstractC226339yq.A00(userSession).A00(string3));
                                                        }
                                                        this.A0e = null;
                                                    }
                                                }
                                                c69613Av.A05();
                                                anonymousClass980.A02(null);
                                                AbstractC09800fd.A00(497241201);
                                                return;
                                            }
                                        }
                                    }
                                }
                                throw C00O.createAndThrow();
                            } catch (Throwable th3) {
                                th = th3;
                                if (Systrace.A0E(1L)) {
                                    i = 1193611564;
                                    C0fO.A00(i);
                                    throw th;
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    try {
                        throw new IllegalStateException("Required value was null.");
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                anonymousClass9802.A02(null);
                AbstractC09800fd.A00(1806934905);
                throw th;
            }
            C14360o3.A0F(str);
        } catch (Throwable th6) {
            AbstractC09800fd.A00(326332684);
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r9.C7g() == 1014) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0a19, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36316495403618737L) == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0a2e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36328624391012028L) != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x14ea, code lost:
    
        if (r3.equals(r4.An1()) != false) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0e86, code lost:
    
        if (r6 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x1254, code lost:
    
        if (((X.C9BC) r11.getValue()).A02 != false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x1256, code lost:
    
        r10 = r11.getValue();
        r3 = (X.C9BC) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x126a, code lost:
    
        if (r11.AIi(r10, new X.C9BC(r3.A03, r3.A01, false, 1)) == false) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x1270, code lost:
    
        if (r9.A2A() == false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x1272, code lost:
    
        r3 = X.EnumC223459tc.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x127a, code lost:
    
        if (r13.C7g() != 1003) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x127c, code lost:
    
        r8 = r6.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x1287, code lost:
    
        if (r9.CS0(new X.C150866ql(r8)) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x1289, code lost:
    
        r9 = new X.BP5(r8, r3.toString());
        r8 = r13.BaA();
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x1296, code lost:
    
        if (r8 == null) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x1298, code lost:
    
        r8 = X.AbstractC003100w.A0k(10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x129e, code lost:
    
        X.BP5.A00(r9, r8, "fan_onboarding_chat_unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x132a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x12a3, code lost:
    
        r11 = r6.A00;
        r10 = r13.BaA();
        r8 = r13.BKb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x12af, code lost:
    
        if ((r8 instanceof com.instagram.model.direct.DirectThreadKey) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x12b1, code lost:
    
        r8 = X.JRE.A02(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x12b5, code lost:
    
        if (r8 == null) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x12b7, code lost:
    
        r8 = X.C2DU.A03((X.C2DU) X.C2JD.A00(r11), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x12c1, code lost:
    
        if (r8 == null) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x12c3, code lost:
    
        r9 = r8.Ba5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x12c7, code lost:
    
        if (r9 == null) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x12cd, code lost:
    
        if (r9.A27() == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x12cf, code lost:
    
        r4 = X.EnumC223399tW.FOLLOWED_BY_RECIPIENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x12d1, code lost:
    
        X.AbstractC35215Fg8.A01(r3, r4, r11, r10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x1312, code lost:
    
        r4 = r8.BLs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x1316, code lost:
    
        if (r4 == null) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x1322, code lost:
    
        if (X.C14360o3.A0K(r4.A1u, r9.getId()) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x1324, code lost:
    
        r4 = X.EnumC223399tW.HAS_MESSAGES_FROM_RECIPIENT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x1327, code lost:
    
        r4 = X.EnumC223399tW.NONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x132d, code lost:
    
        r4 = r9.B7L().ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1336, code lost:
    
        if (r4 == 4) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x1339, code lost:
    
        if (r4 == 5) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x133b, code lost:
    
        r3 = X.EnumC223459tc.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x133f, code lost:
    
        r3 = X.EnumC223459tc.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x1343, code lost:
    
        r3 = X.EnumC223459tc.A0N;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x14bb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x14d7  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0e38  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x139f  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x13e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(X.C7DC r30) {
        /*
            Method dump skipped, instructions count: 5514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass983.A0J(X.7DC):void");
    }

    public final void A0K(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A02 = JRE.A02(c3o9);
        if (A02 != null) {
            DirectThreadKey A022 = JRE.A02(this.A0b);
            if (A022 == null || !C14360o3.A0K(A022.A00, A02.A00) || !C14360o3.A0K(A022.A01, A02.A01)) {
                this.A0b = c3o9;
                A0E(C2JD.A00(this.A10).B3U(JRE.A01(this.A0b)));
                return;
            }
            return;
        }
        MsysThreadId A04 = JRE.A04(c3o9);
        if (A04 != null) {
            MsysThreadId A042 = JRE.A04(this.A0b);
            if (A042 == null || A042.A00 != A04.A00) {
                this.A0b = c3o9;
            }
            if (this.A0F == null) {
                return;
            }
            A0J(A01(this).A0I());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC43591JPw.A00(622));
        sb.append(c3o9);
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.InterfaceC1119353f
    public final void EK1() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0147, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r0, 36315125308722207L) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x011a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r21.A10, 36315125308722207L) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0213  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2pS, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass983(android.os.Bundle r22, X.AbstractC59962oe r23, X.InterfaceC59992oh r24, com.instagram.common.session.UserSession r25, X.C1GL r26, com.instagram.direct.capabilities.Capabilities r27, X.AnonymousClass982 r28, X.C2055097z r29, X.AnonymousClass981 r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass983.<init>(android.os.Bundle, X.2oe, X.2oh, com.instagram.common.session.UserSession, X.1GL, com.instagram.direct.capabilities.Capabilities, X.982, X.97z, X.981, boolean):void");
    }

    public static final Activity A00(AnonymousClass983 anonymousClass983) {
        Activity rootActivity = anonymousClass983.A0u.getRootActivity();
        if (rootActivity != null) {
            return rootActivity;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C7W4 A01(AnonymousClass983 anonymousClass983) {
        C51B c51b = anonymousClass983.A0F;
        if (c51b != null) {
            C7W4 c7w4 = c51b.A00;
            if (c7w4 == null) {
                C14360o3.A0F("threadController");
                throw C00O.createAndThrow();
            }
            return c7w4;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C51B A02(Bundle bundle, AnonymousClass983 anonymousClass983, boolean z) {
        C51B c51b = new C51B();
        c51b.setArguments(bundle);
        InterfaceC60442pS interfaceC60442pS = c51b.A03;
        C7W2 c7w2 = c51b.A02;
        C7VF c7vf = anonymousClass983.A1L;
        AnonymousClass988 anonymousClass988 = anonymousClass983.A1H;
        C164087Vx c164087Vx = anonymousClass983.A0J;
        if (c164087Vx == null) {
            C14360o3.A0F("directThreadDataViewModel");
            throw C00O.createAndThrow();
        }
        C163867Va c163867Va = anonymousClass983.A1B;
        C163907Ve c163907Ve = anonymousClass983.A1A;
        C164047Vt c164047Vt = anonymousClass983.A1C;
        C7W3 c7w3 = new C7W3(anonymousClass983);
        InterfaceC163937Vh interfaceC163937Vh = anonymousClass983.A1G;
        C163947Vi c163947Vi = anonymousClass983.A19;
        AnonymousClass982 anonymousClass982 = anonymousClass983.A1D;
        C7VS c7vs = anonymousClass983.A1E;
        C7VU c7vu = anonymousClass983.A0K;
        C98N c98n = anonymousClass983.A1J;
        C2055097z c2055097z = anonymousClass983.A1M;
        C164057Vu c164057Vu = anonymousClass983.A17;
        C3I9 c3i9 = anonymousClass983.A06;
        if (c3i9 == null) {
            c3i9 = C3I7.A01(anonymousClass983, false, false);
        }
        C3I9 c3i92 = c3i9;
        C7W4 c7w4 = new C7W4(anonymousClass983, c51b, c3i92, c7w2, c7w3, c164057Vu, c163947Vi, c163907Ve, c163867Va, c164047Vt, anonymousClass983, anonymousClass983, anonymousClass983, anonymousClass982, c164087Vx, c7vs, c7vu, anonymousClass983.A1F, interfaceC163937Vh, anonymousClass988, c98n, c7vf, c2055097z, interfaceC60442pS, anonymousClass983, anonymousClass983.A1U, z);
        anonymousClass983.A0E = c7w4;
        C14360o3.A0B(c98n, 1);
        c51b.A01 = c98n;
        c51b.A00 = c7w4;
        return c51b;
    }

    public static final C2EC A04(AnonymousClass983 anonymousClass983) {
        C3o9 c3o9 = anonymousClass983.A0b;
        if (c3o9 == null || !(c3o9 instanceof DirectThreadKey)) {
            return null;
        }
        return A05(anonymousClass983);
    }

    public static final C81663kb A05(AnonymousClass983 anonymousClass983) {
        DirectThreadKey A02;
        C3o9 c3o9 = anonymousClass983.A0b;
        if (c3o9 == null || (A02 = JRE.A02(c3o9)) == null) {
            return null;
        }
        return C2DU.A03((C2DU) C2JD.A00(anonymousClass983.A10), A02);
    }

    public static final C159737El A06(AnonymousClass983 anonymousClass983) {
        C159737El c159737El = anonymousClass983.A0R;
        if (c159737El != null) {
            return c159737El;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Deprecated(message = "Please use [mUnifiedThreadKey] instead.")
    public static final String A07(AnonymousClass983 anonymousClass983) {
        C3o9 c3o9 = anonymousClass983.A0b;
        if (c3o9 instanceof DirectThreadKey) {
            return JRE.A01(c3o9).A00;
        }
        if (c3o9 instanceof MsysThreadId) {
            return String.valueOf(JRE.A03(c3o9).A00);
        }
        return null;
    }

    private final void A08() {
        View view;
        View view2;
        AGM agm = this.A0Z;
        if (agm != null && (view2 = agm.A00) != null) {
            view2.setVisibility(8);
        }
        C22976ABa c22976ABa = this.A0X;
        if (c22976ABa != null) {
            InterfaceC09390do interfaceC09390do = c22976ABa.A03;
            if (interfaceC09390do.CWa()) {
                ((View) interfaceC09390do.getValue()).setVisibility(8);
            }
        }
        AAK aak = this.A0Y;
        if (aak != null && (view = aak.A00) != null) {
            view.setVisibility(8);
        }
        AA4 aa4 = this.A0N;
        if (aa4 != null) {
            aa4.A01.setVisibility(8);
        }
        AA5 aa5 = this.A0O;
        if (aa5 != null) {
            aa5.A01.setVisibility(8);
        }
        C22996ABv c22996ABv = this.A08;
        if (c22996ABv != null) {
            c22996ABv.A04.setVisibility(8);
        }
        C55076OaW c55076OaW = this.A0A;
        if (c55076OaW != null) {
            C55076OaW.A01(c55076OaW, EnumC53149Nf4.A05);
        }
        FR3 fr3 = this.A09;
        if (fr3 != null) {
            fr3.A00.setVisibility(8);
        }
        C22929A8z c22929A8z = this.A0o;
        if (c22929A8z != null) {
            c22929A8z.A01.setVisibility(8);
        }
        FM2 fm2 = this.A0S;
        if (fm2 != null) {
            fm2.A01.setVisibility(8);
        }
        A9L a9l = this.A05;
        if (a9l != null) {
            a9l.A01.setVisibility(8);
        }
        AGN agn = this.A0C;
        if (agn != null) {
            agn.A01.setVisibility(8);
        }
        AGL agl = this.A0n;
        if (agl != null) {
            agl.A02.setVisibility(8);
        }
    }

    public static final void A0A(AnonymousClass983 anonymousClass983) {
        if (!anonymousClass983.A0h) {
            UserSession userSession = anonymousClass983.A10;
            C7V4 c7v4 = new C7V4(userSession, anonymousClass983.A1H);
            C81663kb A05 = A05(anonymousClass983);
            if (A05 != null && A05.C7I() != null && A05.C7q() != null) {
                boolean z = c7v4.A00(A05(anonymousClass983), A05.C7I(), false).A0o;
                Bundle bundle = anonymousClass983.A0r;
                AutoSendMessageData autoSendMessageData = (AutoSendMessageData) bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AUTO_SEND_MESSAGE_DATA");
                boolean z2 = bundle.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_META_AI_LAUNCHING_WITH_PRE_SENT_MESSAGE");
                if (autoSendMessageData == null) {
                    boolean z3 = anonymousClass983.A0u.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false);
                    if (z && C18U.A06(C06090Tz.A05, userSession, 36324767510376895L) && z3 && AbstractC162267Oo.A03(userSession) && !A0G(anonymousClass983) && !z2) {
                        A06(anonymousClass983).A1G();
                        return;
                    }
                    return;
                }
                if (z) {
                    if (C18U.A06(C06090Tz.A05, userSession, 36324767510376895L)) {
                        A06(anonymousClass983).A19();
                    }
                    if (!AbstractC162267Oo.A03(userSession)) {
                        return;
                    }
                }
                if (A0G(anonymousClass983)) {
                    return;
                }
                C7IT A0J = A01(anonymousClass983).A0J();
                String str = autoSendMessageData.A02;
                if (str != null) {
                    A0J.A03(null, null, null, null, null, null, null, null, str, null, autoSendMessageData.A01, autoSendMessageData.A00, null, bundle.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_META_AI_SHOULD_SKIP_GENAI_EVAL"));
                    anonymousClass983.A0h = true;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public static final void A0D(AnonymousClass983 anonymousClass983, boolean z) {
        C2EC A04;
        C6C2 c6c2;
        String str;
        C3o9 c3o9 = anonymousClass983.A0b;
        if (c3o9 instanceof MsysThreadId) {
            MsysThreadId A042 = JRE.A04(c3o9);
            if (A042 != null) {
                C14120nc.A00().ATO(new C18320vJ(1567967727, new M5P(anonymousClass983, A042, z)));
                return;
            }
            return;
        }
        DirectThreadKey A02 = JRE.A02(c3o9);
        if (A02 == null || (A04 = A04(anonymousClass983)) == null) {
            return;
        }
        UserSession userSession = anonymousClass983.A10;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36324389553189005L);
        C14360o3.A0A(Boolean.valueOf(A06));
        if (!A06) {
            return;
        }
        boolean A00 = AbstractC31234DoH.A00(userSession, A04.CBz());
        C006802i c006802i = anonymousClass983.A1b;
        c006802i.markerStart(834879413);
        c006802i.markerAnnotate(834879413, UserFlowLoggerImpl.SOURCE_ANNOTATION, "IGDirectTypingStatusService");
        c006802i.markerAnnotate(834879413, "is_typing_indicator_enabled", A00);
        c006802i.markerEnd(834879413, (short) 2);
        if (!A00) {
            return;
        }
        C159587Dt c159587Dt = anonymousClass983.A0M;
        if (c159587Dt == null) {
            C14360o3.A0F("activityIndicatorSender");
            throw C00O.createAndThrow();
        }
        String str2 = A02.A00;
        String str3 = A02.A01;
        if (str2 == null && str3 == null) {
            c6c2 = null;
        } else {
            c6c2 = new C6C2(str2, str3);
        }
        if (z) {
            if (c6c2 == null || (str = c6c2.A01) == null) {
                return;
            }
            C11T.A00();
            if (C2I7.A00(str, c159587Dt.A02) && System.currentTimeMillis() - c159587Dt.A00 <= c159587Dt.A01) {
                c159587Dt.A03.removeMessages(1);
                return;
            }
            C11T.A00();
            RealtimeClientManager realtimeClientManager = c159587Dt.A06;
            if (!realtimeClientManager.isMqttConnected()) {
                return;
            }
            c159587Dt.A02 = str;
            c159587Dt.A00 = System.currentTimeMillis();
            String A002 = AbstractC68470VSb.A00();
            realtimeClientManager.sendCommand(A002, new LGH(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c159587Dt.A04.BdA(), str, "indicate_activity", null, null, null, A002, String.valueOf(1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false).A00(), c159587Dt.A05);
            c159587Dt.A03.removeMessages(1);
            return;
        }
        C11T.A00();
        if (c159587Dt.A02 == null) {
            return;
        }
        c159587Dt.A03.removeMessages(1);
        c159587Dt.A02 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (X.AbstractC31224Do7.A02(r25.BSH(), r25.BT2(), r25.isPending(), r25.CVQ()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        if (((java.lang.Boolean) r0.A0Z.A07.getValue()).booleanValue() == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0E(final X.C2EE r25) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass983.A0E(X.2EE):void");
    }

    public static final boolean A0G(AnonymousClass983 anonymousClass983) {
        String str;
        UserSession userSession = anonymousClass983.A10;
        C7V4 c7v4 = new C7V4(userSession, anonymousClass983.A1H);
        C81663kb A05 = A05(anonymousClass983);
        if (A05 != null) {
            str = A05.C7I();
        } else {
            str = null;
        }
        if (!c7v4.A00(A05(anonymousClass983), str, false).A13 || AbstractC162267Oo.A03(userSession) || !C18U.A06(C06090Tz.A05, userSession, 36320403825893848L)) {
            return false;
        }
        return true;
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        return this.A04;
    }

    @Override // X.InterfaceC1119353f
    public final InterfaceC59992oh B8R() {
        return this.A0y;
    }

    @Override // X.InterfaceC1119353f
    public final TouchInterceptorFrameLayout CA1() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A07;
        if (touchInterceptorFrameLayout != null) {
            return touchInterceptorFrameLayout;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C7G2 c7g2;
        C8QJ c8qj;
        FragmentActivity activity = this.A0u.getActivity();
        String string = this.A0r.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEARCH_QUERY");
        if (string != null && activity != null) {
            int length = string.length();
            UserSession userSession = this.A10;
            if (length >= 2 && C1VN.A00 != null) {
                AbstractC31282Dp4.A00().A01(activity, userSession, AbstractC111324zv.A00(1476), null);
            }
        }
        KB3 kb3 = this.A0L;
        if (kb3 != null && kb3.isVisible()) {
            kb3.onBackPressed();
        } else {
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A0D;
            if (directAggregatedMediaViewerController == null) {
                C14360o3.A0F("directAggregatedMediaViewerController");
                throw C00O.createAndThrow();
            }
            if (!directAggregatedMediaViewerController.A0l()) {
                C159737El c159737El = this.A0R;
                if (c159737El != null && c159737El.A1X()) {
                    c159737El.A19();
                    if (((MRH) c159737El.A0u.A0V.getValue()).isRecording()) {
                        c159737El.A0u.A0D();
                        return true;
                    }
                    C160007Fm c160007Fm = c159737El.A0b;
                    if (c160007Fm != null && (c8qj = (c7g2 = c160007Fm.A0U).A01) != null && c8qj.isShowing()) {
                        C7G2.A01(c7g2, false);
                        C8QJ c8qj2 = c7g2.A01;
                        if (c8qj2 != null) {
                            c8qj2.dismiss();
                        }
                    }
                    L8B l8b = c159737El.A0g;
                    if (l8b != null && l8b.A00()) {
                        c159737El.A18();
                    }
                }
                A0H();
                return false;
            }
        }
        return true;
    }

    public static final C7TT A03(AnonymousClass983 anonymousClass983) {
        String str;
        C81663kb A05 = A05(anonymousClass983);
        C7V4 c7v4 = new C7V4(anonymousClass983.A10, anonymousClass983.A1H);
        if (A05 != null) {
            str = A05.C7I();
        } else {
            str = null;
        }
        return c7v4.A00(A05(anonymousClass983), str, false);
    }

    public static final void A09(AnonymousClass983 anonymousClass983) {
        Integer num;
        String A00;
        InterfaceC83733oI interfaceC83733oI = A03(anonymousClass983).A0P;
        if (A03(anonymousClass983).A13 && interfaceC83733oI != null) {
            InterfaceC09390do interfaceC09390do = anonymousClass983.A1Y;
            A9W a9w = (A9W) interfaceC09390do.getValue();
            String str = anonymousClass983.A1V;
            if (anonymousClass983.A0u.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false)) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            String A07 = AbstractC1345466e.A07(interfaceC83733oI);
            if (str != null && A07 != null && a9w.A00 == C05F.A01) {
                if (a9w.A01 == null) {
                    a9w.A01 = UUID.randomUUID().toString();
                }
                a9w.A03 = false;
                C18920wW c18920wW = a9w.A04;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "meta_ai_direct_enter_thread");
                if (A002.isSampled()) {
                    A002.AAP(AbstractC31422DrR.A02(0, 10, 118), a9w.A02);
                    A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                    if (num.intValue() == 0) {
                        A00 = "bottom_sheet";
                    } else {
                        A00 = AbstractC111324zv.A00(953);
                    }
                    A002.AAP("layout_type", A00);
                    A002.AAP("open_thread_id", A07);
                    A002.AAP("thread_session_id", a9w.A01);
                    A002.A9K("client_event_time", Long.valueOf(System.currentTimeMillis()));
                    A002.Cht();
                }
                a9w.A00 = C05F.A00;
            } else if (a9w.A00 == C05F.A0C) {
                C18950wb.A01.AEp("Either entryPoint or threadId is null for opening the Meta AI thread", 20134884).report();
            }
            String str2 = ((A9W) interfaceC09390do.getValue()).A01;
            if (str != null && str2 != null) {
                ((C22841A5k) anonymousClass983.A1e.getValue()).A00 = new C09530e4(str, str2);
            }
        }
    }

    public static final void A0B(AnonymousClass983 anonymousClass983, int i) {
        if (A00(anonymousClass983) instanceof InterfaceC53712dA) {
            ComponentCallbacks2 A00 = A00(anonymousClass983);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) A00).EfL(i);
        }
    }

    public static final void A0C(AnonymousClass983 anonymousClass983, boolean z) {
        Integer num;
        Integer num2;
        String A00;
        InterfaceC83733oI interfaceC83733oI = A03(anonymousClass983).A0P;
        if (A03(anonymousClass983).A13 && interfaceC83733oI != null) {
            A9W a9w = (A9W) anonymousClass983.A1Y.getValue();
            String str = anonymousClass983.A1V;
            if (anonymousClass983.A0u.requireArguments().getBoolean("DirectThreadFragment.ARGUMENT_IS_BOTTOM_SHEET", false)) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            String A07 = AbstractC1345466e.A07(interfaceC83733oI);
            if (str != null && A07 != null && a9w.A01 != null && a9w.A00 == C05F.A00) {
                C18920wW c18920wW = a9w.A04;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "meta_ai_direct_exit_thread");
                if (A002.isSampled()) {
                    A002.AAP(AbstractC31422DrR.A00(), a9w.A02);
                    A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                    if (num.intValue() == 0) {
                        A00 = "bottom_sheet";
                    } else {
                        A00 = AbstractC111324zv.A00(953);
                    }
                    A002.AAP("layout_type", A00);
                    A002.AAP("open_thread_id", A07);
                    A002.AAP("thread_session_id", a9w.A01);
                    A002.A7v("has_response_before_exit", Boolean.valueOf(a9w.A03));
                    A002.A7v("with_backgrounding", Boolean.valueOf(z));
                    A002.A9K("client_event_time", Long.valueOf(System.currentTimeMillis()));
                    A002.Cht();
                }
                a9w.A02 = UUID.randomUUID().toString();
                if (!z) {
                    a9w.A01 = null;
                    num2 = C05F.A0C;
                } else {
                    num2 = C05F.A01;
                }
                a9w.A00 = num2;
                return;
            }
            if (a9w.A00 != C05F.A00) {
                return;
            }
            C18950wb.A01.AEp("Either entryPoint or threadId is null for exiting the Meta AI thread", 20134884).report();
        }
    }

    private final void A0F(AAT aat) {
        A08();
        A06(this).A1E();
        C159577Ds c159577Ds = this.A0G;
        if (c159577Ds == null) {
            C14360o3.A0F("lazyControllers");
            throw C00O.createAndThrow();
        }
        C22976ABa c22976ABa = (C22976ABa) c159577Ds.A0T.getValue();
        this.A0X = c22976ABa;
        c22976ABa.A00(aat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x025f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0d, 36325879907038678L) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H() {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass983.A0H():void");
    }
}
