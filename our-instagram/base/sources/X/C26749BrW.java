package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.BrW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26749BrW extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CreatorAISettingsComposableFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final String A07 = "creator_ai_settings_fragment_compose";
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 28), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26749BrW() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 48);
        this.A01 = DH6.A01(this, "creator_ai_creator_igid", enumC09460dv, 49);
        this.A05 = AbstractC25235BEs.A0s(AbstractC166997dE.A0a(), this, "creator_ai_should_open_audience_management", enumC09460dv, 46);
        C29908DGw c29908DGw = new C29908DGw(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29908DGw(new C29908DGw(this, 35), 36));
        this.A06 = AbstractC25225BEi.A0a(new C29908DGw(A00, 37), c29908DGw, new C29894DGi(44, A00, null), AbstractC25225BEi.A1D(C25869BcQ.class));
        this.A00 = C29908DGw.A00(this, 31);
        this.A03 = C29908DGw.A00(this, 34);
    }

    public static final void A00(C26749BrW c26749BrW) {
        C25869BcQ A0g = AbstractC25229BEm.A0g(c26749BrW);
        String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(c26749BrW), 2131957070);
        String A0q2 = AbstractC166997dE.A0q(AbstractC166997dE.A0N(c26749BrW), 2131957077);
        A0g.A09.Egh(new C26209BiZ(A0q));
        AbstractC166987dD.A1Z(new PYc(A0g, A0q2, null, 16), AbstractC141776au.A00(A0g));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002f. Please report as an issue. */
    public static final void A01(C26749BrW c26749BrW, EnumC27403C7g enumC27403C7g, String str) {
        Fragment c26754Brb;
        C09530e4[] A1b;
        C140966Yy A0r;
        Fragment c26873Bta;
        C09530e4[] A1b2;
        Fragment fragment;
        C09530e4 A1L;
        FragmentActivity requireActivity = c26749BrW.requireActivity();
        UserSession A0r2 = AbstractC166987dD.A0r(c26749BrW.A04);
        String A15 = AbstractC25225BEi.A15(c26749BrW.A01);
        String A152 = AbstractC25225BEi.A15(c26749BrW.A02);
        C14360o3.A0B(A0r2, 2);
        AbstractC25233BEq.A0x(3, str, A15, A152);
        BP5 bp5 = new BP5(A0r2, A152);
        switch (enumC27403C7g.ordinal()) {
            case 0:
                C6WQ c6wq = new C6WQ(requireActivity, true);
                C0fJ.A00(c6wq);
                new FR2(requireActivity, A0r2).A00(c26749BrW, new C36327G0w(c6wq, 1), A15);
                return;
            case 1:
                fragment = W6d.A02(new IgBloksScreenConfig(A0r2), C66277U6x.A01("com.instagram.insights.account.creator_ai_breakout.container", AbstractC167017dG.A0r("target_id", A15)));
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                A0r.A0D(fragment);
                A0r.A04();
                return;
            case 2:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return;
            case 3:
                bp5.A01(C8j.CONTENT);
                c26754Brb = new C26754Brb();
                A1b = AbstractC25229BEm.A1b("creator_ai_creator_igid", A15, AbstractC166987dD.A1L("creator_ai_creator_fbid", str));
                AbstractC25227BEk.A1C(c26754Brb, A1b);
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                A0r.A0D(c26754Brb);
                A0r.A04();
                return;
            case 4:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                bp5.A01(C8j.YOUR_INFORMATION);
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                c26873Bta = new C26873Bta();
                A1b2 = AbstractC167007dF.A1b("creator_ai_entry_point_extra", A152, AbstractC166987dD.A1L("creator_ai_creator_fbid", str), AbstractC166987dD.A1L("creator_ai_creator_igid", A15));
                AbstractC25227BEk.A1C(c26873Bta, A1b2);
                fragment = c26873Bta;
                A0r.A0D(fragment);
                A0r.A04();
                return;
            case 5:
            case 14:
                bp5.A01(C8j.TOPICS_TO_AVOID);
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                c26873Bta = new C26769Brq();
                A1b2 = AbstractC25230BEn.A1b("creator_ai_creator_fbid", str);
                AbstractC25227BEk.A1C(c26873Bta, A1b2);
                fragment = c26873Bta;
                A0r.A0D(fragment);
                A0r.A04();
                return;
            case 6:
            case 11:
                bp5.A01(C8j.SUMMARY);
                Bundle A00 = AbstractC61636Rr0.A00(AbstractC25230BEn.A1b("creator_ai_creator_igid", A15));
                fragment = new C26729BrA();
                fragment.setArguments(A00);
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                A0r.A0D(fragment);
                A0r.A04();
                return;
            case 7:
                C6XJ.A02(requireActivity, new Bundle(0), A0r2, ModalActivity.class, "creator_ai_embodiment_capture").A0C(requireActivity);
                return;
            case 8:
                bp5.A01(C8j.LINKS);
                c26754Brb = new C26712Bqt();
                A1b = new C09530e4[3];
                A1b[0] = AbstractC166987dD.A1L("creator_ai_add_fact_content_type", EnumC27380C6j.A04);
                A1L = AbstractC166987dD.A1L("creator_ai_creator_fbid", str);
                A1b[1] = A1L;
                A1b[2] = AbstractC166987dD.A1L("creator_ai_entry_point_extra", A152);
                AbstractC25227BEk.A1C(c26754Brb, A1b);
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                A0r.A0D(c26754Brb);
                A0r.A04();
                return;
            case 9:
                bp5.A01(C8j.KEYWORD_RESPONSES);
                c26754Brb = new C26713Bqu();
                A1b = new C09530e4[3];
                A1b[0] = AbstractC166987dD.A1L("creator_ai_creator_fbid", str);
                A1L = AbstractC166987dD.A1L("creator_ai_creator_igid", A15);
                A1b[1] = A1L;
                A1b[2] = AbstractC166987dD.A1L("creator_ai_entry_point_extra", A152);
                AbstractC25227BEk.A1C(c26754Brb, A1b);
                A0r = AbstractC25225BEi.A0r(requireActivity, A0r2);
                A0r.A0D(c26754Brb);
                A0r.A04();
                return;
            default:
                throw B4Z.A00();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1817577234);
        super.onCreate(bundle);
        if (AbstractC167007dF.A1Z(this.A05)) {
            AbstractC25229BEm.A0g(this).A04 = true;
        }
        C0f9.A09(1614304515, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1312074657);
        ComposeView A01 = AbstractC25319BIo.A01(this, C5UA.A04(new C30190DRv(this, 1), -1774697453, true));
        C0f9.A09(1305706838, A02);
        return A01;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(761606394);
        super.onResume();
        AbstractC25229BEm.A0g(this).A00(AbstractC167027dH.A01(this.A03));
        C0f9.A09(1851999279, A02);
    }
}
