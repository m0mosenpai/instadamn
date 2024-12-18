package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26770Brr extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiStudioRecipientPickerFragment";
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A02 = "direct_ai_recipient_picker";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26770Brr() {
        C50153MDg c50153MDg = new C50153MDg(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50153MDg(new C50153MDg(this, 15), 16));
        this.A01 = AbstractC25225BEi.A0a(new C50153MDg(A00, 17), c50153MDg, new C50172MDz(48, null, A00), AbstractC25225BEi.A1D(C25824Bbf.class));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131960254);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(494458407);
        super.onCreate(bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
        AbstractC166987dD.A1Z(new GSR(A0Z, null, 14), AbstractC141776au.A00(A0Z));
        C0f9.A09(-81813344, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1046958726);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 28), 2006931643);
        C0f9.A09(-1830610916, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1279761163);
        super.onDestroy();
        C0f9.A09(-2131198887, A02);
    }
}
