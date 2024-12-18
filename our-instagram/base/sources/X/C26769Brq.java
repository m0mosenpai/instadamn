package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

/* renamed from: X.Brq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26769Brq extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AvoidedTopicsFragment";
    public InterfaceC16820sZ A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final String A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953581);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C26769Brq() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH6.A01(this, "creator_ai_creator_fbid", enumC09460dv, 37);
        this.A05 = "avoided_topics_fragment";
        this.A03 = AbstractC60492pY.A02(this);
        this.A01 = C29908DGw.A00(this, 10);
        C29908DGw c29908DGw = new C29908DGw(this, 15);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C29908DGw(new C29908DGw(this, 12), 13));
        this.A04 = AbstractC25225BEi.A0a(new C29908DGw(A00, 14), c29908DGw, new C29894DGi(36, A00, null), AbstractC25225BEi.A1D(C25823Bbe.class));
        this.A00 = new C29908DGw(this, 16);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1201814005);
        super.onCreate(bundle);
        C0f9.A09(-283169544, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(26779938);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 41), 1433518345);
        C0f9.A09(1553819151, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Object value;
        C6R c6r;
        List list;
        int A02 = C0f9.A02(-1557897729);
        super.onResume();
        C25823Bbe c25823Bbe = (C25823Bbe) this.A04.getValue();
        if (((List) ((C50627MWo) c25823Bbe.A02.getValue()).A01).isEmpty()) {
            C05A c05a = c25823Bbe.A01;
            do {
                value = c05a.getValue();
                c6r = C6R.A03;
                list = (List) ((C50627MWo) value).A01;
                AbstractC167017dG.A1N(list, c6r);
            } while (!c05a.AIi(value, new C50627MWo(c6r, list, 47)));
        }
        AbstractC166987dD.A1Z(D4z.A02(c25823Bbe, null, 43), AbstractC141776au.A00(c25823Bbe));
        C0f9.A09(1854488772, A02);
    }
}
