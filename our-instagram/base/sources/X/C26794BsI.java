package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BsI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26794BsI extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCapabilitiesFragment";
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A03 = "ai_capabilities_fragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(DGW.A00(this, 26));
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(DGW.A00(this, 27), DGW.A00(this, 28), new C29898DGm(13, null, this), AbstractC25235BEs.A0x());

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        String A02 = C25878Bcd.A02(this.A02);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_capabilities_screen_shown", A02));
            A00.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        List list;
        InterfaceC09390do interfaceC09390do = this.A00;
        C28484Chc A0q = AbstractC25226BEj.A0q(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A02;
        String A02 = C25878Bcd.A02(interfaceC09390do2);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_capabilities_back_button_clicked", A02));
            A00.Cht();
        }
        C51758Mth c51758Mth = (C51758Mth) AbstractC25226BEj.A0o(interfaceC09390do2).A0C.getValue();
        if (c51758Mth != null && (list = (List) c51758Mth.A00) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (AbstractC166997dE.A1Z(((MUW) obj).A00, true)) {
                    A1E.add(obj);
                }
            }
            str = AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E, DKJ.A00);
        } else {
            str = null;
        }
        C28484Chc A0q2 = AbstractC25226BEj.A0q(interfaceC09390do);
        String A022 = C25878Bcd.A02(interfaceC09390do2);
        if (str == null) {
            str = "";
        }
        C25531Mh A002 = C28484Chc.A00(A0q2);
        if (AbstractC25226BEj.A1Z(A002)) {
            A002.A0k("settings_main_screen_capabilities_clicked");
            A002.A0w(AbstractC167007dF.A0n("capability_options", str));
            A002.A0i(AbstractC25233BEq.A0n(A022));
            A002.Cht();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952820);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(152531510);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 24), 1802518904);
        C0f9.A09(-1928734369, A02);
        return A00;
    }
}
