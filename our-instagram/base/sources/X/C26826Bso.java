package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Map;

/* renamed from: X.Bso, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26826Bso extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC31032DkW {
    public static final String __redex_internal_original_name = "AiSettingsFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A05 = "ai_settings_fragment";
    public final String A04 = "preference_audience_upsell_shown";
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(C29907DGv.A01(this, 38), C29907DGv.A01(this, 39), new C29898DGm(47, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(C29907DGv.A01(this, 31));

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r1 != 8) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        if (r1 == X.C84.IN_REVIEW) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    @Override // X.InterfaceC31032DkW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cxm(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26826Bso.Cxm(java.lang.String):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A01 = AbstractC153636vY.A01(requireArguments(), "persona_id");
        InterfaceC09390do interfaceC09390do = this.A01;
        C25531Mh A02 = C28484Chc.A02(interfaceC09390do);
        if (AbstractC25226BEj.A1Z(A02)) {
            A02.A0i(AbstractC25233BEq.A0m(A02, "settings_main_screen_shown", A01));
            A02.Cht();
        }
        if (AbstractC28459ChB.A03(AbstractC166987dD.A0r(this.A02))) {
            C25531Mh A022 = C28484Chc.A02(interfaceC09390do);
            if (AbstractC25226BEj.A1Z(A022)) {
                A022.A0k("settings_main_screen_field_regeneration_icon_rendered");
                A022.Cht();
            }
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 1), C07Y.A00(viewLifecycleOwner));
    }

    public static final C25878Bcd A00(C26826Bso c26826Bso) {
        return AbstractC25226BEj.A0o(c26826Bso.A03);
    }

    @Override // X.InterfaceC31032DkW
    public final void D5d() {
        AiSettingsRepository aiSettingsRepository = AbstractC25226BEj.A0o(this.A03).A00;
        aiSettingsRepository.A0H.Egh(Integer.valueOf(AbstractC34041F0u.A00(aiSettingsRepository.A02)));
    }

    @Override // X.InterfaceC31032DkW
    public final void Dm2(boolean z) {
        C26083BgC A00;
        C25531Mh A02 = C28484Chc.A02(this.A01);
        if (AbstractC25226BEj.A1Z(A02)) {
            A02.A0k("settings_main_screen_show_on_profile_clicked");
            A02.Cht();
        }
        AiSettingsRepository aiSettingsRepository = AbstractC25226BEj.A0o(this.A03).A00;
        Object value = aiSettingsRepository.A0W.getValue();
        if (value != null) {
            C26083BgC c26083BgC = (C26083BgC) value;
            if (c26083BgC.A0M != z) {
                C05A c05a = aiSettingsRepository.A08;
                A00 = C26083BgC.A00(null, null, c26083BgC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16646143, false, z);
                c05a.Egh(A00);
                AiSettingsRepository.A04(aiSettingsRepository);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        DirectThreadThemeInfo directThreadThemeInfo;
        C26083BgC c26083BgC;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            if (intent != null && (directThreadThemeInfo = (DirectThreadThemeInfo) intent.getParcelableExtra("theme_info")) != null) {
                AiSettingsRepository aiSettingsRepository = AbstractC25226BEj.A0o(this.A03).A00;
                String str = directThreadThemeInfo.A0l;
                String str2 = directThreadThemeInfo.A0i;
                if (str != null && str2 != null) {
                    String str3 = directThreadThemeInfo.A0o;
                    C26069Bfx c26069Bfx = new C26069Bfx(str3, str, str3, str2, 3);
                    C05A c05a = aiSettingsRepository.A08;
                    C26083BgC A0s = AbstractC25226BEj.A0s(c05a);
                    if (A0s != null) {
                        c26083BgC = C26083BgC.A00(null, c26069Bfx, A0s, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, false, false);
                    } else {
                        c26083BgC = null;
                    }
                    c05a.Egh(c26083BgC);
                    AiSettingsRepository.A03(c26069Bfx, aiSettingsRepository, null, null, null, null, null, null, null, 255);
                }
            }
            AbstractC25233BEq.A14(this);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        String str2;
        boolean z;
        InterfaceC09390do interfaceC09390do = this.A01;
        C28484Chc A0q = AbstractC25226BEj.A0q(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A03;
        boolean A0D = AbstractC25226BEj.A0o(interfaceC09390do2).A00.A0D();
        AiSettingsRepository aiSettingsRepository = AbstractC25226BEj.A0o(interfaceC09390do2).A00;
        C26083BgC A00 = AiSettingsRepository.A00(aiSettingsRepository);
        String str3 = null;
        if (A00 != null) {
            str = A00.A0A;
        } else {
            str = null;
        }
        C26083BgC A0s = AbstractC25226BEj.A0s(aiSettingsRepository.A0G);
        if (A0s != null) {
            str3 = A0s.A0A;
        }
        boolean A1a = AbstractC25225BEi.A1a(str, str3);
        boolean A0D2 = AbstractC25226BEj.A0o(interfaceC09390do2).A00.A0D();
        C26083BgC A002 = AiSettingsRepository.A00(AbstractC25226BEj.A0o(interfaceC09390do2).A00);
        if (A002 == null || (str2 = A002.A09) == null) {
            str2 = "";
        }
        String A01 = C25878Bcd.A01(this);
        C25531Mh A012 = C28484Chc.A01(A0q, str2, 3);
        if (AbstractC25226BEj.A1Z(A012)) {
            A012.A0k("settings_main_screen_back_clicked");
            A012.A0w(AbstractC167017dG.A0u("selected_audience", str2, AbstractC166987dD.A1L("is_description_changed", String.valueOf(A0D)), AbstractC166987dD.A1L("is_tagline_changed", String.valueOf(A1a)), AbstractC166987dD.A1L("is_name_changed", String.valueOf(A0D2))));
            A012.A0i(AbstractC25233BEq.A0n(A01));
            A012.Cht();
        }
        C23031Ai A0l = AbstractC25230BEn.A0l(this.A02);
        C26083BgC A003 = AiSettingsRepository.A00(AbstractC25226BEj.A0o(interfaceC09390do2).A00);
        if (A003 != null) {
            z = A003.A0L;
        } else {
            z = false;
        }
        if (z) {
            C28484Chc A0q2 = AbstractC25226BEj.A0q(interfaceC09390do);
            String A013 = C25878Bcd.A01(this);
            C25531Mh A004 = C28484Chc.A00(A0q2);
            if (AbstractC25226BEj.A1Z(A004)) {
                A004.A0i(AbstractC25233BEq.A0m(A004, "settings_main_screen_exit_confirmation_dialog_shown", A013));
                A004.Cht();
            }
            AbstractC27520CCq.A00(requireContext(), C29907DGv.A01(this, 33), C29907DGv.A01(this, 34), 2131952827, 2131952826);
        } else {
            String str4 = this.A04;
            C14360o3.A0B(str4, 0);
            if (!A0l.A01.getBoolean(str4, false)) {
                A0l.A13(str4, true);
                C26050Bfd c26050Bfd = (C26050Bfd) AbstractC25226BEj.A0o(interfaceC09390do2).A0K.getValue();
                if (((Map) AbstractC25226BEj.A0o(interfaceC09390do2).A0B.getValue()).get(c26050Bfd.A09) == C83.ONLY_ME) {
                    Context requireContext = requireContext();
                    C29898DGm c29898DGm = new C29898DGm(43, c26050Bfd, this);
                    C29907DGv A014 = C29907DGv.A01(this, 32);
                    C193328hC c193328hC = new C193328hC(requireContext);
                    c193328hC.A0A(2131952816);
                    c193328hC.A09(2131952815);
                    c193328hC.A0J(new DialogInterfaceOnClickListenerC28537CiV(c29898DGm, 1), 2131952814);
                    c193328hC.A0H(new DialogInterfaceOnClickListenerC28537CiV(A014, 2), 2131968687);
                    AbstractC166987dD.A1W(c193328hC);
                    return true;
                }
            } else {
                C25878Bcd.A03(this);
                AbstractC25226BEj.A0o(interfaceC09390do2).A07();
                return false;
            }
        }
        return true;
    }

    public static final void A01(C26826Bso c26826Bso) {
        AbstractC33649Etz.A00(c26826Bso.requireActivity(), "ugc_ai_deletion");
        AbstractC25231BEo.A16(c26826Bso);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952835);
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A02, A10 ? 1 : 0), 36324011596525354L)) {
            C3LO c3lo = new C3LO();
            c3lo.A06 = R.drawable.instagram_insights_pano_outline_24;
            c3lo.A05 = 2131952829;
            ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, 10);
            interfaceC56362iU.ARk(A10 ? 1 : 0, !((C26050Bfd) AbstractC25226BEj.A0o(this.A03).A0K.getValue()).A0K);
        }
        this.A00 = interfaceC56362iU;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2135300969);
        super.onCreate(bundle);
        String A01 = AbstractC153636vY.A01(requireArguments(), "persona_id");
        C25878Bcd A0o = AbstractC25226BEj.A0o(this.A03);
        C14360o3.A0B(A01, 0);
        AiSettingsRepository aiSettingsRepository = A0o.A00;
        AbstractC166997dE.A1Y(aiSettingsRepository.A0R, true);
        AbstractC166987dD.A1Z(new MC9(aiSettingsRepository, A01, (InterfaceC23621Ds) null, 2), ((C4A7) aiSettingsRepository).A01);
        AbstractC166987dD.A1Z(new MCD(this, null, 8), AbstractC25229BEm.A0a(this));
        C0f9.A09(-996683705, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2143007801);
        ComposeView A01 = AbstractC25319BIo.A01(this, C5UA.A04(C30480DbP.A00(this, 1), 941438878, true));
        C0f9.A09(439986733, A02);
        return A01;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1288754306);
        super.onDestroy();
        C25878Bcd.A03(this);
        C0f9.A09(899408530, A02);
    }
}
