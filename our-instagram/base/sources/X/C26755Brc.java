package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26755Brc extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FreeformFeedbackFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final String A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957029);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26755Brc() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = DH5.A01(this, AbstractC111324zv.A00(198), enumC09460dv, 0);
        this.A03 = "creator_ai_in_thread_feedback_freeform";
        this.A01 = AbstractC60492pY.A02(this);
        C29908DGw c29908DGw = new C29908DGw(this, 45);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29908DGw(new C29908DGw(this, 42), 43));
        this.A02 = AbstractC25225BEi.A0a(new C29908DGw(A00, 44), c29908DGw, new C50169MDw(0, A00, null), AbstractC25225BEi.A1D(C44488Jlu.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1602566342);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 2), -1979962830);
        C0f9.A09(-1167246554, A02);
        return A00;
    }
}
