package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes8.dex */
public final class KBF extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FriendMapAudienceListFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new C50158MDl(this, 44));
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "FriendMapCustomAudienceFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 40), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public KBF() {
        C50158MDl c50158MDl = new C50158MDl(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50158MDl(new C50158MDl(this, 45), 46));
        this.A02 = AbstractC25225BEi.A0a(new C50158MDl(A00, 47), c50158MDl, new ME1(30, null, A00), AbstractC25225BEi.A1D(C45997KXl.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void beforeOnDestroyView() {
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        super.beforeOnDestroyView();
        Fragment fragment = this.mParentFragment;
        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
            c189478aR.A0O(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1694292652);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 25), -1565918644);
        C0f9.A09(1042241672, A02);
        return A00;
    }
}
