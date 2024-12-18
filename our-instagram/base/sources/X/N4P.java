package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public final class N4P extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoReplyLikesListFragment";
    public final String A00;
    public final InterfaceC09390do A01 = C1XM.A00(new GSw(this, 4));
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25231BEo.A0g(this.A02).A00().A02(requireActivity(), this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 13), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public N4P() {
        GSw gSw = new GSw(this, 8);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSw(new GSw(this, 5), 6));
        this.A03 = AbstractC25225BEi.A0a(new GSw(A00, 7), gSw, new C57255Pbd(40, null, A00), AbstractC25225BEi.A1D(C50944MfD.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A00 = "potato_reply_likes_list_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1583505277);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 13), 1758636598);
        C0f9.A09(-1188318739, A02);
        return A00;
    }
}
