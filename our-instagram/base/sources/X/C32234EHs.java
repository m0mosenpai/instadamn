package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.EHs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32234EHs extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectManageFoldersEducationSheet";
    public C34924FaA A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A02 = "direct_manage_folders_education_sheet";

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(981010173);
        super.onCreate(bundle);
        C34924FaA c34924FaA = new C34924FaA(AbstractC166987dD.A0r(this.A01));
        this.A00 = c34924FaA;
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string == null) {
            string = "unknown";
        }
        C34924FaA.A00(c34924FaA, "inbox_folders_manage_screen_impression", AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string));
        C0f9.A09(1648502601, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1594590279);
        ComposeView A01 = AbstractC25319BIo.A01(this, AbstractC27764CMf.A00);
        C0f9.A09(-1719840023, A02);
        return A01;
    }
}
