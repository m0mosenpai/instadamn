package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.Ka1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46048Ka1 extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "DirectSuggestedReplyControlBottomSheetFragment";
    public C47929LEy A00;
    public EnumC82333lv A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_suggested_reply_control_bottom_sheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1644114972);
        super.onCreate(bundle);
        requireArguments();
        C0f9.A09(-205769004, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(662698641);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        GHY.A01(requireContext(), ViewOnClickListenerC48072LPx.A00(this, 29), requireContext().getString(2131960363), A1E);
        EnumC82333lv enumC82333lv = this.A01;
        if (enumC82333lv != null) {
            if (enumC82333lv == EnumC82333lv.A08) {
                GHY.A01(requireContext(), ViewOnClickListenerC48072LPx.A00(this, 30), requireContext().getString(2131960365), A1E);
            }
            GHY.A01(requireContext(), ViewOnClickListenerC48072LPx.A00(this, 31), requireContext().getString(2131960364), A1E);
            setItems(A1E);
            C0f9.A09(1604289870, A02);
            return;
        }
        C14360o3.A0F("responseSuggestionSource");
        throw C00O.createAndThrow();
    }
}
