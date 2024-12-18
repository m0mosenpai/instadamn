package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import com.meta.metaai.components.voice.animation.transrcipt.widget.DisabledHorizontalScrollView;
import com.meta.metaai.components.voice.animation.ui.view.MetaAIListeningIndicatorView;
import com.meta.metaai.components.voice.animation.ui.view.MetaAISpeechIndicatorView;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.EJx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32285EJx extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MetaAiVoiceFragment";
    public View A00;
    public LithoView A01;
    public C56352iT A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgView A06;
    public C189478aR A08;
    public DirectShareTarget A09;
    public C34971Faw A0A;
    public C35153Fev A0B;
    public MetaAIListeningIndicatorView A0C;
    public MetaAISpeechIndicatorView A0D;
    public C55091Ob2 A0E;
    public boolean A0F;
    public boolean A0G;
    public IgImageView A0I;
    public IgImageView A0J;
    public DisabledHorizontalScrollView A0K;
    public UUID A0L;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0T;
    public final ViewTreeObserver.OnGlobalLayoutListener A0W;
    public final String A0X;
    public C34494FIg A07 = new Object();
    public boolean A0M = true;
    public boolean A0H = true;
    public final InterfaceC09390do A0S = C37060GUu.A00(this, 26);
    public final InterfaceC09390do A0R = C37060GUu.A00(this, 25);
    public final InterfaceC09390do A0V = C37060GUu.A00(this, 28);
    public final InterfaceC09390do A0U = C37060GUu.A00(this, 27);
    public final InterfaceC09390do A0O = C37060GUu.A00(this, 20);
    public final C006802i A0N = C006802i.A0p;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        View view;
        C81663kb B3T;
        String C7I;
        MessagingUser A00;
        C14360o3.A0B(interfaceC56362iU, 0);
        C189478aR c189478aR = this.A08;
        if (c189478aR != null) {
            c189478aR.A03.A0T(0);
        }
        InterfaceC09390do interfaceC09390do = this.A0T;
        View ESp = interfaceC56362iU.ESp(AbstractC166987dD.A0r(interfaceC09390do), R.layout.direct_thread_action_bar_left_aligned, 0, 0);
        GradientSpinnerAvatarView A0f = AbstractC31176DnK.A0f(ESp, R.id.avatar_container);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(ESp.requireViewById(R.id.group_photo_faceswarm_stub), false, false);
        AbstractC13880nE.A0e(A0f, AbstractC167017dG.A05(getThemedContext()));
        A02(this);
        DirectShareTarget A02 = A02(this);
        if (A02 != null && (B3T = AbstractC31180DnO.A0O(interfaceC09390do).B3T(A02)) != null && (C7I = B3T.C7I()) != null) {
            G2W g2w = new G2W(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), C2054597s.A00(AbstractC166987dD.A0r(interfaceC09390do), B3T.C7g()), AbstractC31171DnF.A0N(C7I), B3T.C7g(), A0I(this));
            C7J8 c7j8 = new C7J8(A01, A0f);
            List BSH = B3T.BSH();
            c7j8.EkR(this);
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C3AY A002 = C4GQ.A00(AbstractC166987dD.A0r(interfaceC09390do), B3T);
            ArrayList A04 = AbstractC81683kd.A04(AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do), BSH);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Reel A012 = C31226Do9.A01(A0r2, C31226Do9.A00(A0r2, B3T));
            boolean A0C = C4GQ.A0C(B3T);
            int C7g = B3T.C7g();
            if (BSH.isEmpty()) {
                A00 = null;
            } else {
                A00 = MessagingUser.A00((User) B3T.BSH().get(0));
            }
            c7j8.A00(A002, this, A0r, g2w, A00, A012, A04, C7g, 0, A0C, true);
            C35255Fgo.A01(getThemedContext(), interfaceC56362iU, g2w);
            Context themedContext = getThemedContext();
            C14360o3.A0B(themedContext, 0);
            int i = R.drawable.instagram_sliders_pano_outline_24;
            int A0H = AbstractC53242c7.A0H(themedContext, R.attr.voiceSelectionButtonIcon);
            if (A0H != 0) {
                i = A0H;
            }
            C3LP c3lp = new C3LP(themedContext, i);
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A0F = c3lp;
            A0B.A05 = 2131976933;
            C14360o3.A0C(AbstractC31177DnL.A0F(ViewOnClickListenerC35691FpR.A00(g2w, 54), A0B, interfaceC56362iU), "null cannot be cast to non-null type android.widget.ImageView");
        }
        TextView A0N = AbstractC167007dF.A0N(ESp, R.id.thread_title);
        Context context = ESp.getContext();
        AbstractC31326Dpo.A00(A0N, null, AbstractC166997dE.A0p(context, 2131966587), true);
        TextView A0e = AbstractC166987dD.A0e(ESp, R.id.thread_presence_digest);
        if (AbstractC31271Dot.A01(AbstractC166987dD.A0r(interfaceC09390do)) != null) {
            if (A0e != null) {
                A0e.setText(AbstractC31271Dot.A01(AbstractC166987dD.A0r(interfaceC09390do)));
            }
            AbstractC166987dD.A1O(context, A0e, AbstractC53242c7.A09(getThemedContext()));
            A0e.setVisibility(0);
        }
        interfaceC56362iU.EPD(new ColorDrawable(0));
        interfaceC56362iU.EkS(!A0I(this));
        interfaceC56362iU.Ehg(new C114795Gm(null, null, null, null, null, null, C05F.A00, -2, 0, -2, -2, -2, -2, -2, AbstractC53242c7.A0L(getContext(), android.R.attr.windowLightStatusBar, true)));
        C189478aR c189478aR2 = this.A08;
        if (c189478aR2 != null && (view = c189478aR2.A03.mView) != null) {
            view.post(new GLJ(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c6  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32285EJx.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final long A00(C32285EJx c32285EJx) {
        return Long.parseLong(C18U.A04(C06090Tz.A05, AbstractC31178DnM.A0M(c32285EJx.A0T), 36882318691992000L));
    }

    private final EnumC33519Ers A01() {
        EnumC33346Eof enumC33346Eof;
        Bundle bundle = this.mArguments;
        if (bundle == null || (enumC33346Eof = (EnumC33346Eof) AbstractC53062bn.A00(bundle)) == null) {
            enumC33346Eof = EnumC33346Eof.A05;
        }
        int ordinal = enumC33346Eof.ordinal();
        if (ordinal != 2) {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        return EnumC33519Ers.A0J;
                    }
                    throw B4Z.A00();
                }
                return EnumC33519Ers.A04;
            }
            return EnumC33519Ers.A09;
        }
        return EnumC33519Ers.A0I;
    }

    public static final DirectShareTarget A02(C32285EJx c32285EJx) {
        DirectShareTarget directShareTarget = c32285EJx.A09;
        if (directShareTarget == null) {
            Bundle bundle = c32285EJx.mArguments;
            if (bundle != null) {
                return (DirectShareTarget) AbstractC53062bn.A01(bundle, DirectShareTarget.class, AbstractC43591JPw.A00(298));
            }
            return null;
        }
        return directShareTarget;
    }

    public static final Object A04(C32285EJx c32285EJx, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        FragmentActivity activity = c32285EJx.getActivity();
        if (activity == null) {
            c24891Jo.resumeWith(false);
        } else {
            AbstractC23451Ch.A04(activity, new C36162Fxc(c24891Jo, 1), AbstractC43591JPw.A00(8));
        }
        return c24891Jo.A0E();
    }

    private final void A05(int i) {
        String str;
        C18920wW c18920wW = (C18920wW) this.A0P.getValue();
        EnumC33519Ers A01 = A01();
        UUID uuid = this.A0L;
        int i2 = !A0I(this) ? 1 : 0;
        DirectShareTarget A02 = A02(this);
        if (A02 != null) {
            str = A02.A08();
        } else {
            str = null;
        }
        C14360o3.A0B(c18920wW, 0);
        AbstractC167007dF.A1E(A01, 2, uuid);
        F1U.A00(c18920wW, new MIM(uuid, A01, str, i, i2, 2));
    }

    public static final void A07(C32285EJx c32285EJx) {
        View view;
        if (Build.VERSION.SDK_INT >= 30 && (view = c32285EJx.mView) != null) {
            view.performHapticFeedback(16);
        }
        if (c32285EJx.A0G) {
            InterfaceC09390do interfaceC09390do = c32285EJx.A0Q;
            C51029Mgc c51029Mgc = (C51029Mgc) interfaceC09390do.getValue();
            boolean z = A03(interfaceC09390do).A0A;
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = c51029Mgc.A00;
            if (metaAiRsysSdkRealTimeSession != null) {
                metaAiRsysSdkRealTimeSession.A02(z);
                return;
            }
            return;
        }
        c32285EJx.A07.A01 = !r1.A01;
        A0D(c32285EJx);
    }

    public static final void A08(C32285EJx c32285EJx) {
        View view;
        if (Build.VERSION.SDK_INT >= 30 && (view = c32285EJx.mView) != null) {
            view.performHapticFeedback(16);
        }
        if (c32285EJx.A0G) {
            InterfaceC09390do interfaceC09390do = c32285EJx.A0Q;
            C51029Mgc c51029Mgc = (C51029Mgc) interfaceC09390do.getValue();
            boolean z = A03(interfaceC09390do).A08;
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = c51029Mgc.A00;
            if (metaAiRsysSdkRealTimeSession != null) {
                metaAiRsysSdkRealTimeSession.A01(z);
                return;
            }
            return;
        }
        c32285EJx.A07.A00 = !r1.A00;
        A0C(c32285EJx);
    }

    public static final void A09(C32285EJx c32285EJx) {
        View view;
        if (Build.VERSION.SDK_INT >= 30 && (view = c32285EJx.mView) != null) {
            view.performHapticFeedback(16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r4 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0B(X.C32285EJx r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 30
            if (r1 < r0) goto L74
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L74
            android.view.WindowManager r0 = r0.getWindowManager()
            if (r0 == 0) goto L74
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            if (r0 == 0) goto L74
            android.view.WindowInsets r1 = r0.getWindowInsets()
            if (r1 == 0) goto L74
            int r0 = android.view.WindowInsets.Type.systemBars()
            android.graphics.Insets r0 = r1.getInsetsIgnoringVisibility(r0)
            if (r0 == 0) goto L74
            int r2 = r0.top
        L2b:
            android.view.View r1 = r5.mView
            if (r1 == 0) goto L36
            r0 = 2131442770(0x7f0b3c52, float:1.850759E38)
            android.view.View r4 = r1.findViewById(r0)
        L36:
            boolean r0 = A0I(r5)
            r3 = 0
            if (r0 != 0) goto L71
            if (r4 == 0) goto L57
            X.2iT r0 = r5.A02
            if (r0 == 0) goto L6f
            int r0 = r0.AYS()
        L47:
            int r0 = r0 + r2
            int r0 = -r0
            r4.setTop(r0)
        L4c:
            android.content.Context r0 = r5.requireContext()
            int r0 = X.AbstractC13880nE.A06(r0)
            r4.setBottom(r0)
        L57:
            com.meta.metaai.components.voice.animation.ui.view.MetaAIListeningIndicatorView r2 = r5.A0C
            if (r2 == 0) goto L69
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L6d
            int r1 = r0.getBottom()
        L63:
            int r0 = X.C30D.A00
            int r1 = r1 + r0
            r2.setBottom(r1)
        L69:
            r5.A0G(r3)
            return
        L6d:
            r1 = 0
            goto L63
        L6f:
            r0 = 0
            goto L47
        L71:
            if (r4 == 0) goto L57
            goto L4c
        L74:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            int r2 = X.AbstractC56402iY.A01(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32285EJx.A0B(X.EJx):void");
    }

    public static final void A0C(C32285EJx c32285EJx) {
        InterfaceC09390do interfaceC09390do;
        IgImageView igImageView = c32285EJx.A0J;
        if (igImageView != null) {
            if (A0H(c32285EJx)) {
                interfaceC09390do = c32285EJx.A0U;
            } else {
                interfaceC09390do = c32285EJx.A0V;
            }
            igImageView.setImageDrawable((Drawable) interfaceC09390do.getValue());
        }
        IgImageView igImageView2 = c32285EJx.A0J;
        if (igImageView2 != null) {
            Resources A0N = AbstractC166997dE.A0N(c32285EJx);
            int i = 2131968097;
            if (A0H(c32285EJx)) {
                i = 2131976175;
            }
            AbstractC31172DnG.A1E(A0N, igImageView2, i);
        }
    }

    public static final void A0D(C32285EJx c32285EJx) {
        InterfaceC09390do interfaceC09390do;
        IgImageView igImageView = c32285EJx.A0I;
        if (igImageView != null) {
            if (A0J(c32285EJx)) {
                interfaceC09390do = c32285EJx.A0R;
            } else {
                interfaceC09390do = c32285EJx.A0S;
            }
            igImageView.setImageDrawable((Drawable) interfaceC09390do.getValue());
        }
        IgImageView igImageView2 = c32285EJx.A0I;
        if (igImageView2 != null) {
            Resources A0N = AbstractC166997dE.A0N(c32285EJx);
            int i = 2131968094;
            if (A0J(c32285EJx)) {
                i = 2131976174;
            }
            AbstractC31172DnG.A1E(A0N, igImageView2, i);
        }
    }

    public static final void A0E(C32285EJx c32285EJx, Integer num) {
        String str;
        C18920wW c18920wW = (C18920wW) c32285EJx.A0P.getValue();
        EnumC33519Ers A01 = c32285EJx.A01();
        UUID uuid = c32285EJx.A0L;
        int i = !A0I(c32285EJx) ? 1 : 0;
        DirectShareTarget A02 = A02(c32285EJx);
        if (A02 != null) {
            str = A02.A08();
        } else {
            str = null;
        }
        C14360o3.A0B(c18920wW, 0);
        AbstractC167017dG.A1P(A01, uuid);
        F1U.A00(c18920wW, new MIN(num, uuid, A01, str, i, 0));
    }

    public static final void A0F(C32285EJx c32285EJx, boolean z) {
        EnumC33346Eof enumC33346Eof;
        String str;
        String str2;
        Bundle bundle = c32285EJx.mArguments;
        if (bundle == null || (enumC33346Eof = (EnumC33346Eof) AbstractC53062bn.A00(bundle)) == null) {
            enumC33346Eof = EnumC33346Eof.A05;
        }
        int ordinal = enumC33346Eof.ordinal();
        if (ordinal != 2 && ordinal != 0) {
            if (ordinal != 1) {
                str = null;
            } else {
                Bundle bundle2 = c32285EJx.mArguments;
                if (bundle2 != null) {
                    str2 = bundle2.getString("DirectFragment.ENTRY_POINT");
                } else {
                    str2 = null;
                }
                str = AnonymousClass001.A0R("meta_ai_", str2);
            }
        } else {
            str = "meta_ai_inbox_search_bar";
        }
        c32285EJx.A0H = true;
        c32285EJx.A0L = C0HM.A00();
        ((C51029Mgc) c32285EJx.A0Q.getValue()).A02(c32285EJx.requireContext(), c32285EJx.getViewLifecycleOwner(), AbstractC166987dD.A19(c32285EJx.A0L), str, new GSg(c32285EJx, 7), A00(c32285EJx), false, z);
        C006802i c006802i = c32285EJx.A0N;
        c006802i.markerStart(894512288);
        c006802i.markerAnnotate(894512288, "entrypoint", str);
    }

    private final void A0G(boolean z) {
        ViewGroup viewGroup;
        Object obj = this.mView;
        while ((obj instanceof ViewGroup) && (viewGroup = (ViewGroup) obj) != null) {
            viewGroup.setClipChildren(z);
            viewGroup.setClipToPadding(z);
            obj = viewGroup.getParent();
        }
    }

    public static final boolean A0H(C32285EJx c32285EJx) {
        InterfaceC09390do interfaceC09390do = c32285EJx.A0Q;
        boolean A00 = AbstractC34364FDg.A00(A03(interfaceC09390do).A01);
        C34494FIg c34494FIg = c32285EJx.A07;
        if (A00) {
            c34494FIg.A00 = A03(interfaceC09390do).A08;
            return A03(interfaceC09390do).A08;
        }
        return c34494FIg.A00;
    }

    public static final boolean A0I(C32285EJx c32285EJx) {
        Bundle bundle = c32285EJx.mArguments;
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("arg_is_bottom_sheet", true);
    }

    public static final boolean A0J(C32285EJx c32285EJx) {
        InterfaceC09390do interfaceC09390do = c32285EJx.A0Q;
        boolean A00 = AbstractC34364FDg.A00(A03(interfaceC09390do).A01);
        C34494FIg c34494FIg = c32285EJx.A07;
        if (A00) {
            c34494FIg.A01 = A03(interfaceC09390do).A0A;
            return A03(interfaceC09390do).A0A;
        }
        return c34494FIg.A01;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0T);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.FIg, java.lang.Object] */
    public C32285EJx() {
        C37060GUu A01 = C37060GUu.A01(this, 24);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C37060GUu.A01(C37060GUu.A01(this, 29), 30));
        this.A0Q = AbstractC25225BEi.A0a(C37060GUu.A01(A00, 31), A01, new C37018GSz(27, A00, null), AbstractC25225BEi.A1D(C51029Mgc.class));
        this.A0P = C37060GUu.A00(this, 21);
        UUID A002 = C0HM.A00();
        C14360o3.A07(A002);
        this.A0L = A002;
        this.A0W = new ViewTreeObserverOnGlobalLayoutListenerC35714Fpo(this, 0);
        this.A0X = __redex_internal_original_name;
        this.A0T = AbstractC60492pY.A02(this);
    }

    public static C55091Ob2 A03(InterfaceC09390do interfaceC09390do) {
        return (C55091Ob2) ((C51029Mgc) interfaceC09390do.getValue()).A0B.getValue();
    }

    public static final void A06(C32285EJx c32285EJx) {
        if (A0I(c32285EJx)) {
            FragmentActivity activity = c32285EJx.getActivity();
            C3DN c3dn = null;
            if (activity != null) {
                c3dn = AbstractC31172DnG.A0r(activity);
            }
            if ((c3dn instanceof C3DP) && c3dn != null) {
                c3dn.A0U(C05F.A02);
            }
        }
    }

    public static final void A0A(C32285EJx c32285EJx) {
        FragmentActivity activity = c32285EJx.getActivity();
        if (activity != null) {
            if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                A09(c32285EJx);
            } else {
                AbstractC167007dF.A0J().post(new RunnableC36903GNy(activity, c32285EJx));
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0X;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1249627068);
        C14360o3.A0B(layoutInflater, 0);
        this.A08 = AbstractC25228BEl.A0x(getActivity(), C3DN.A00);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InterfaceC09390do interfaceC09390do = this.A0T;
            new L7V(activity, AbstractC166987dD.A0r(interfaceC09390do), new G3Q(this)).A00(C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36887717464638229L));
        }
        if (!A0I(this)) {
            this.A02 = C56352iT.A0t.A05(this);
        }
        this.A0Q.getValue();
        GSR.A02(this, C07Y.A00(this), 24);
        View inflate = layoutInflater.inflate(R.layout.meta_ai_voice_sheet, viewGroup, false);
        C0f9.A09(1927400536, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1800369224);
        super.onDestroy();
        A05(14);
        C0f9.A09(1202625140, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        int A02 = C0f9.A02(186110188);
        super.onDestroyView();
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A0A = null;
        this.A0B = null;
        this.A06 = null;
        this.A0I = null;
        this.A0J = null;
        C56352iT c56352iT = this.A02;
        if (c56352iT != null) {
            c56352iT.setTitle(null);
        }
        C56352iT c56352iT2 = this.A02;
        if (c56352iT2 != null) {
            c56352iT2.Ef5(null);
        }
        this.A0D = null;
        this.A0C = null;
        this.A05 = null;
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
        C0f9.A09(1949745019, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(789616974);
        super.onPause();
        boolean z = true;
        A0G(true);
        View view = this.mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0W);
        }
        A0A(this);
        C006802i c006802i = this.A0N;
        c006802i.markerPoint(894512288, "on_stop");
        c006802i.markerEnd(894512288, (short) 4);
        InterfaceC09390do interfaceC09390do = this.A0Q;
        if (A03(interfaceC09390do).A01 == EnumC53181Nfd.A05 || A03(interfaceC09390do).A01 == EnumC53181Nfd.A04) {
            z = false;
        }
        this.A0H = z;
        ((C51029Mgc) interfaceC09390do.getValue()).A03(requireContext(), getViewLifecycleOwner(), new GSg(this, 8), A00(this));
        ((C51029Mgc) interfaceC09390do.getValue()).A01();
        this.A0G = false;
        C0f9.A09(-1451463298, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(-202112452);
        super.onResume();
        A0G(false);
        View view = this.mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0W);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C30D.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
        }
        C0f9.A09(-1752082552, A02);
    }
}
