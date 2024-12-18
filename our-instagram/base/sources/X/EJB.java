package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

/* loaded from: classes6.dex */
public final class EJB extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectManageFoldersAddChatsFragment";
    public C6MK A00;
    public C34924FaA A01;
    public List A02;
    public InterfaceC16660sJ A03;
    public C5Hc A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A06 = "direct_manage_folders_add_chats";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131959801);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A02(C05F.A1F);
        A0B.A03 = AbstractC53242c7.A0C(getContext());
        AbstractC31176DnK.A1B(new ViewOnClickListenerC28667ClF(this, 63), A0B, interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1508626697);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        this.A01 = new C34924FaA(AbstractC166987dD.A0r(interfaceC09390do));
        this.A04 = AbstractC133095zb.A00(AbstractC001800i.A0d(((C2DU) AbstractC31180DnO.A0O(interfaceC09390do)).A0C.A0F(C4I1.A00), 40));
        C6MK c6mk = new C6MK();
        List list = this.A02;
        if (list == null) {
            C14360o3.A0F("initialSelectedThreads");
            throw C00O.createAndThrow();
        }
        c6mk.addAll(list);
        this.A00 = c6mk;
        C0f9.A09(-344839742, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1812793001);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 25), 1788329066);
        C0f9.A09(-424421110, A02);
        return A00;
    }
}
