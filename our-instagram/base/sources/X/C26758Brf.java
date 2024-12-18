package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.aistudio.editor.AiSettingsRepository;

/* renamed from: X.Brf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26758Brf extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiApprovedLandingPageFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(DGW.A00(this, 14), DGW.A00(this, 15), new C29898DGm(10, null, this), AbstractC25235BEs.A0x());

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_approved_landing_page_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_x_pano_filled_24;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-349882773);
        super.onCreate(bundle);
        String A01 = AbstractC153636vY.A01(requireArguments(), "persona_id");
        this.A00 = AbstractC153636vY.A01(requireArguments(), "bot_id");
        C25878Bcd A0o = AbstractC25226BEj.A0o(this.A02);
        C14360o3.A0B(A01, 0);
        AiSettingsRepository aiSettingsRepository = A0o.A00;
        AbstractC166997dE.A1Y(aiSettingsRepository.A0R, true);
        AbstractC166987dD.A1Z(new MC9(aiSettingsRepository, A01, (InterfaceC23621Ds) null, 2), ((C4A7) aiSettingsRepository).A01);
        C0f9.A09(555990067, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(353533870);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 21), 944231104);
        C0f9.A09(712655582, A02);
        return A00;
    }
}
