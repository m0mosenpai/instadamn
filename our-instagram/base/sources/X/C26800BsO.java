package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.BsO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26800BsO extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SuggestedRepliesNuxFragment";
    public CQT A00;
    public String A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final String A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.ETp(true);
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_x_pano_outline_24;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString("entrypoint");
        if (string == null) {
            string = "unknown";
        }
        this.A01 = string;
        InterfaceC09390do interfaceC09390do = this.A02;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        CQT cqt = new CQT(A0r, str);
        this.A00 = cqt;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(cqt.A00, "ig_creator_agents_suggested_replies_view_sr_onboard_nux");
        if (A0f.isSampled()) {
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, cqt.A01);
            A0f.Cht();
        }
        boolean z = requireArguments().getBoolean("should_open_settings");
        C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
        InterfaceC16530ry interfaceC16530ry = A0l.A6d;
        C0YR[] c0yrArr = C23031Ai.A8c;
        long A0N = AbstractC166987dD.A0N(interfaceC16530ry.CES(A0l, c0yrArr[389])) + 1;
        interfaceC16530ry.Egi(A0l, Long.valueOf(A0N), c0yrArr[389]);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.suggested_replies_nux_bottom_button_layout);
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50528MSh(viewLifecycleOwner, c07s, this, igdsBottomButtonLayout, null, 0, z), C07Y.A00(viewLifecycleOwner));
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new ViewOnClickListenerC28668ClG(26, igdsBottomButtonLayout, this));
        igdsBottomButtonLayout.setSecondaryActionOnClickListener(new ViewOnClickListenerC28667ClF(this, 54));
        String A0v = AbstractC25227BEk.A0v(this, 2131974908);
        String string2 = getString(2131974907);
        android.net.Uri parse = android.net.Uri.parse(MSV.A00(32));
        C14360o3.A07(parse);
        igdsBottomButtonLayout.setFooterText(AnonymousClass773.A00(parse, A0v, string2));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        CQT cqt = this.A00;
        if (cqt == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(cqt.A00, "ig_creator_agents_suggested_replies_cancel_sr_onboard_nux");
        if (A0f.isSampled()) {
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, cqt.A01);
            A0f.Cht();
            return false;
        }
        return false;
    }

    public C26800BsO() {
        C29887DGb A00 = C29887DGb.A00(this, 24);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C29887DGb.A00(C29887DGb.A00(this, 21), 22));
        this.A03 = AbstractC25225BEi.A0a(C29887DGb.A00(A002, 23), A00, new C50169MDw(10, A002, null), AbstractC25225BEi.A1D(C44510JmG.class));
        this.A04 = "suggested_replies_nux";
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1179069151);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.suggested_replies_nux_layout, false);
        C0f9.A09(723247404, A02);
        return A0R;
    }
}
