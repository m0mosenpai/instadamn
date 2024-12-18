package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26729BrA extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "BioSummaryFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A04 = "creators_genai_bio_summary";

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26729BrA() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = DH5.A01(this, "creator_ai_creator_igid", enumC09460dv, 6);
        this.A00 = C1XM.A00(C29887DGb.A00(this, 12));
        C29887DGb A00 = C29887DGb.A00(this, 16);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, C29887DGb.A00(C29887DGb.A00(this, 13), 14));
        this.A03 = AbstractC25225BEi.A0a(C29887DGb.A00(A002, 15), A00, new C50169MDw(7, A002, null), AbstractC25225BEi.A1D(C25835Bbq.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1192009803);
        super.onCreate(bundle);
        C25835Bbq c25835Bbq = (C25835Bbq) this.A03.getValue();
        if (c25835Bbq.A00 == null) {
            AbstractC166987dD.A1Z(new D4v(c25835Bbq, null, 5), AbstractC141776au.A00(c25835Bbq));
        }
        C0f9.A09(-1689119003, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-8638139);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 9), -2067645133);
        C0f9.A09(-1450475945, A02);
        return A00;
    }
}
