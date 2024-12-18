package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26733BrE extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AddKeywordFragment";
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final String A00 = "add_keyword_fragment";
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26733BrE() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH5.A01(this, "creator_ai_creator_igid", enumC09460dv, 1);
        this.A01 = DH5.A01(this, "creator_ai_creator_fbid", enumC09460dv, 2);
        C29887DGb A00 = C29887DGb.A00(this, 6);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, C29887DGb.A00(C29887DGb.A00(this, 3), 4));
        this.A05 = AbstractC25225BEi.A0a(C29887DGb.A00(A002, 5), A00, new C50169MDw(3, A002, null), AbstractC25225BEi.A1D(C26907BuA.class));
        this.A03 = AbstractC25225BEi.A0a(C29887DGb.A00(this, 2), C29887DGb.A00(this, 1), new C50169MDw(2, this, null), AbstractC25225BEi.A1D(C26909BuC.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1396517991);
        super.onCreate(bundle);
        ((C26907BuA) this.A05.getValue()).A00();
        C0f9.A09(1976030459, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(272468411);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 5), 896246224);
        C0f9.A09(1815521976, A02);
        return A00;
    }
}
