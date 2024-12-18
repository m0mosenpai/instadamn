package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;

/* renamed from: X.BrZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26752BrZ extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorAICreatorNuxFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_x_pano_filled_24;
        interfaceC56362iU.Ehd(ViewOnClickListenerC28667ClF.A00(c3lo, this, 46));
        interfaceC56362iU.setTitle("");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_ai_creator_nux_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26752BrZ() {
        C29911DGz A01 = C29911DGz.A01(this, 24);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29911DGz.A01(C29911DGz.A01(this, 21), 22));
        this.A01 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 23), A01, new C29894DGi(19, A00, null), AbstractC25225BEi.A1D(C26904Bu7.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(604061299);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 29), 772341819);
        C0f9.A09(-299764100, A02);
        return A00;
    }
}
