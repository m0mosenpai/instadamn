package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class EI2 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectMoveThreadActionBottomSheet";
    public InterfaceC74953Yl A00;
    public C34924FaA A01;
    public AbstractC46972Dl A02;
    public InterfaceC16660sJ A03;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A06 = "direct_ui_professional_move_thread_action_bottom_sheet";
    public final InterfaceC09390do A04 = C37054GUk.A00(this, 19);

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
        int A02 = C0f9.A02(871906425);
        super.onCreate(bundle);
        C34924FaA c34924FaA = new C34924FaA(AbstractC166987dD.A0r(this.A05));
        this.A01 = c34924FaA;
        Object value = this.A04.getValue();
        C14360o3.A0B(value, 0);
        C34924FaA.A00(c34924FaA, "inbox_folders_move_thread_sheet_impression", AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value));
        C0f9.A09(534888516, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-687146578);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30495Dbe(this, 32), -1871338697);
        C0f9.A09(-1589235892, A02);
        return A00;
    }
}
