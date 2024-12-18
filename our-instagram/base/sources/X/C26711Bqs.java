package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.Bqs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26711Bqs extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsUserDetailRightPanelFragment";
    public LithoView A00;
    public final String A01 = "producer_user_name";
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new J8Z(this, 4));
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2072);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-704259402);
        C75713ac c75713ac = new C75713ac(new C2XE(requireContext()));
        c75713ac.A07 = AbstractC166997dE.A0a();
        c75713ac.A03 = new C89273yT(this);
        ComponentTree A00 = c75713ac.A00();
        this.A00 = LithoView.A01(requireContext(), A00);
        A00.A0N(new C26304BkB(AbstractC25225BEi.A15(this.A03)));
        LithoView lithoView = this.A00;
        C0f9.A09(698939405, A02);
        return lithoView;
    }
}
