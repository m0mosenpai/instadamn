package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Fbk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35013Fbk {
    public Fragment A00;
    public Fragment A01;
    public Fragment A02;
    public Fragment A03;
    public Fragment A04;
    public Fragment A05;
    public Fragment A06;
    public Fragment A07;
    public Fragment A08;
    public Fragment A09;
    public Fragment A0A;
    public Fragment A0B;
    public Fragment A0C;
    public C34650FOi A0D;
    public PageSelectionOverrideData A0E;
    public String A0F;
    public final FragmentActivity A0G;
    public final InterfaceC37222GaX A0H;
    public final C35788FrQ A0I;
    public final C34404FEu A0J;

    public static Bundle A00(C35013Fbk c35013Fbk) {
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c35013Fbk.A0F);
        return bundle;
    }

    public final void A01(Fragment fragment, String str) {
        FragmentActivity fragmentActivity = this.A0G;
        if (!fragmentActivity.isDestroyed()) {
            this.A0D.A00(fragment, fragmentActivity, this.A0J, str, true);
        }
    }

    public C35013Fbk(FragmentActivity fragmentActivity, InterfaceC37222GaX interfaceC37222GaX, C34650FOi c34650FOi, C34404FEu c34404FEu) {
        this.A0H = interfaceC37222GaX;
        this.A0G = fragmentActivity;
        this.A0J = c34404FEu;
        this.A0D = c34650FOi;
        C35788FrQ A0K = AbstractC31176DnK.A0K(interfaceC37222GaX);
        this.A0I = A0K;
        this.A0F = A0K.A09;
    }
}
