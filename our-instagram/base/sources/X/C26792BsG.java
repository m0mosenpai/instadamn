package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BsG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26792BsG extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCrossAppDiscoverabilityFragment";
    public final InterfaceC09390do A01 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 27), C29909DGx.A01(this, 25), new C29898DGm(28, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 28), C29909DGx.A01(this, 26), new C29898DGm(29, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A00 = C29909DGx.A00(this, 24);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_cross_app_discoverability_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952712);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        List list;
        String string = requireArguments().getString("arg_entry_point");
        if (string != null && string.hashCode() == 395261206 && string.equals("AI_CREATION")) {
            list = ((C26048Bfb) AbstractC25226BEj.A0n(this.A01).A0H.getValue()).A0A;
        } else {
            list = ((C26050Bfd) AbstractC25226BEj.A0o(this.A03).A0K.getValue()).A0E;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((C51741MtQ) obj).A04) {
                A1E.add(obj);
            }
        }
        String A1H = AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E, DKK.A00);
        C25531Mh A02 = C28484Chc.A02(this.A00);
        if (AbstractC25226BEj.A1Z(A02)) {
            A02.A0k("settings_main_screen_discoverability_clicked");
            AbstractC25233BEq.A18(A02, "discoverability_apps", A1H);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-462986154);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 41), 1817446944);
        C0f9.A09(1165518710, A02);
        return A00;
    }
}
