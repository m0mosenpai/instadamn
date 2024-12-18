package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.KCu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45505KCu extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BroadcastChannelRepliesListFullScreenFragment";
    public L47 A00;
    public KB3 A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A02 = C1XM.A00(new C37017GSy(this, 6));
    public final InterfaceC09390do A04 = C1XM.A00(new C37017GSy(this, 7));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        InterfaceC09390do interfaceC09390do = this.A06;
        View ESp = interfaceC56362iU.ESp(AbstractC166987dD.A0r(interfaceC09390do), R.layout.direct_thread_action_bar_left_aligned, 0, 0);
        L47 l47 = this.A00;
        String str = null;
        if (l47 == null) {
            C14360o3.A0F("themeHelper");
            throw C00O.createAndThrow();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(l47.A00.A04.A00);
        interfaceC56362iU.EPD(gradientDrawable);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(ESp, R.id.avatar_container);
        new C7J8(AbstractC37301Gc2.A0D(ESp, R.id.group_photo_faceswarm_stub), gradientSpinnerAvatarView).EkR(this);
        InterfaceC09390do interfaceC09390do2 = this.A02;
        gradientSpinnerAvatarView.A0F(null, this, AbstractC25225BEi.A0t(((L5U) interfaceC09390do2.getValue()).A0B));
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        String str2 = ((L5U) interfaceC09390do2.getValue()).A03;
        if (str2 != null) {
            C0fQ.A00(new LP0(str2, this, 4), gradientSpinnerAvatarView);
        }
        TextView A0N = AbstractC167007dF.A0N(ESp, R.id.thread_title);
        Context context = getContext();
        if (context != null) {
            str = context.getString(2131959448);
        }
        A0N.setText(str);
        TextView textView = (TextView) AbstractC166997dE.A0S(ESp, R.id.reply_message_quote);
        if (((L5U) interfaceC09390do2.getValue()).A08.length() > 0) {
            Context requireContext = requireContext();
            String str3 = ((L5U) interfaceC09390do2.getValue()).A08;
            boolean z = ((L5U) interfaceC09390do2.getValue()).A0G;
            textView.setVisibility(0);
            if (!z) {
                textView.setText(str3);
                return;
            } else {
                textView.post(new M6F(requireContext, textView, this, str3));
                return;
            }
        }
        textView.setVisibility(8);
        if (((L5U) interfaceC09390do2.getValue()).A08.length() != 0) {
            return;
        }
        if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36319377330937186L)) {
            return;
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(viewLifecycleOwner, textView, c07s, this, null, 19), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "BROADCAST_CHANNEL_REPLIES_LIST_FULL_SCREEN_FRAGMENT";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        C56352iT AYT = ((BaseFragmentActivity) requireActivity).AYT();
        if (AYT != null) {
            AYT.EkF(true);
        }
        InterfaceC09390do interfaceC09390do = this.A06;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity2 = requireActivity();
        Context requireContext = requireContext();
        DirectThreadThemeInfo directThreadThemeInfo = ((L5U) this.A02.getValue()).A02;
        View rootView = view.getRootView();
        C14360o3.A07(rootView);
        this.A00 = new L47(requireContext, rootView, requireActivity2, A0r, directThreadThemeInfo);
        View A0c = AbstractC166987dD.A0c(view, R.id.main_list_view);
        FragmentActivity requireActivity3 = requireActivity();
        interfaceC09390do.getValue();
        InterfaceC09390do interfaceC09390do2 = this.A07;
        LRZ lrz = new LRZ(requireActivity3, view, (Jn5) interfaceC09390do2.getValue(), this);
        this.mLifecycleRegistry.A09(lrz);
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        Jn5 jn5 = (Jn5) interfaceC09390do2.getValue();
        L47 l47 = this.A00;
        if (l47 != null) {
            LnT lnT = new LnT(this, A0r2, lrz, jn5, l47.A00.A07);
            C166587cU c166587cU = new C166587cU((C166047bW) ((Jn5) interfaceC09390do2.getValue()).A06.A03.getValue(), AbstractC166987dD.A0r(interfaceC09390do), this);
            c166587cU.A00(A0c, C71163Hc.A00(this));
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new JWL(viewLifecycleOwner, c07s, this, lrz, c166587cU, A0c, this, lnT, null, 10), C07Y.A00(viewLifecycleOwner));
            L47 l472 = this.A00;
            if (l472 != null) {
                FragmentActivity fragmentActivity = l472.A03;
                View findViewById = fragmentActivity.findViewById(R.id.layout_container_parent);
                if (findViewById instanceof CoordinatorLayout) {
                    ((CoordinatorLayout) findViewById).setStatusBarBackground(null);
                }
                DirectThreadThemeInfo directThreadThemeInfo2 = l472.A05;
                if (directThreadThemeInfo2 != null) {
                    boolean A00 = AbstractC72723Nt.A00(l472.A01);
                    if (A00) {
                        str = directThreadThemeInfo2.A0i;
                    } else {
                        str = directThreadThemeInfo2.A0l;
                    }
                    if (str != null) {
                        C14120nc.A00().ATO(new C75X(fragmentActivity, new C48709Lgd(l472, directThreadThemeInfo2, A00), str));
                    }
                }
                super.onViewCreated(view, bundle);
                return;
            }
        }
        C14360o3.A0F("themeHelper");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        KB3 kb3 = this.A01;
        if (kb3 == null || !kb3.isVisible() || kb3.A02.A0G) {
            return false;
        }
        kb3.onBackPressed();
        AbstractC25227BEk.A1B(this);
        return true;
    }

    public C45505KCu() {
        C37017GSy c37017GSy = new C37017GSy(this, 11);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37017GSy(new C37017GSy(this, 8), 9));
        this.A07 = AbstractC25225BEi.A0a(new C37017GSy(A00, 10), c37017GSy, new C50169MDw(35, A00, null), AbstractC25225BEi.A1D(Jn5.class));
        this.A05 = C1XM.A00(MFG.A00);
        this.A03 = C1XM.A00(MFF.A00);
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(807580083);
        super.onCreate(bundle);
        Jn5 jn5 = (Jn5) this.A07.getValue();
        AbstractC166987dD.A1Z(new MBo(jn5, null, 28), AbstractC141776au.A00(jn5));
        C26025BfE c26025BfE = jn5.A03;
        if (c26025BfE.A0f && c26025BfE.A0P) {
            jn5.A05.A0E();
        }
        C166017bT c166017bT = jn5.A04;
        String str = c26025BfE.A0F;
        C14360o3.A0B(str, 0);
        C9CG c9cg = (C9CG) c166017bT.A00.A00.get(str);
        if (c9cg != null) {
            String str2 = c9cg.A02;
            if (str2 != null) {
                jn5.A05.A0X(new MI7(jn5, c9cg, str2, 27));
            }
            jn5.A0C.Egh(new C48663Lfq((CharSequence) c9cg.A01));
        }
        C0f9.A09(560380873, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-670984166);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_replies_list_full_screen_view, viewGroup, false);
        C0f9.A09(-1774119076, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-807422633);
        super.onDestroy();
        if (((L5U) this.A02.getValue()).A00 != null) {
            C06C.A00(AbstractC166987dD.A0b(), this, AbstractC111324zv.A00(5215));
        }
        L47 l47 = this.A00;
        if (l47 == null) {
            C14360o3.A0F("themeHelper");
            throw C00O.createAndThrow();
        }
        AbstractC31174DnI.A1C(l47.A02, AbstractC167007dF.A09(l47.A01, R.attr.backgroundColorPrimary));
        C0f9.A09(826666764, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C81543kP A0g;
        int A02 = C0f9.A02(896611708);
        LKh lKh = (LKh) this.A04.getValue();
        C2EC A00 = LKh.A00(lKh);
        if (A00 != null && (A0g = AbstractC31172DnG.A0g(A00)) != null) {
            AbstractC31172DnG.A0d(lKh.A04).A0W("leave_comments_sheet", "tap", "comments_sheet", "comments_view", A00.C7I(), A00.C7q(), AbstractC06930Yk.A07(LKh.A02(lKh), LKh.A03(lKh, A0g, A00)), A00.AdZ());
        }
        super.onDestroyView();
        C0f9.A09(1460630114, A02);
    }
}
