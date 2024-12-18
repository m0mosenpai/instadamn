package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.G3n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36387G3n implements InterfaceC37160GYx {
    public final int A00;
    public final Object A01;

    public C36387G3n(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37160GYx
    public final void onShareOneTap(DirectShareTarget directShareTarget) {
        Context applicationContext;
        int i;
        String str;
        Context context;
        int i2;
        switch (this.A00) {
            case 0:
                applicationContext = ((Context) this.A01).getApplicationContext();
                i = 2131973315;
                str = "DirectChallengeCardGalleryFragment.openShareSheet";
                break;
            case 1:
                C32284EJv c32284EJv = (C32284EJv) this.A01;
                FPC fpc = (FPC) AbstractC31469DsD.A00(c32284EJv.A0E);
                InterfaceC83733oI A00 = C32284EJv.A00(c32284EJv);
                C14360o3.A0B(A00, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fpc.A00, "link_click_send");
                if (A0f.isSampled()) {
                    AbstractC31181DnP.A0g(A0f, A00);
                    A0f.Cht();
                }
                context = c32284EJv.getContext();
                i2 = 2131963336;
                C9GR.A07(context, i2);
                return;
            case 2:
                applicationContext = AbstractC31172DnG.A06(this.A01);
                i = 2131973315;
                str = "DirectDailyPromptsResponseListFragment.sharePrompt";
                break;
            default:
                if (directShareTarget != null) {
                    Fragment fragment = (Fragment) this.A01;
                    if (fragment.mView != null && fragment.isResumed()) {
                        context = fragment.requireContext();
                        i2 = 2131972818;
                        C9GR.A07(context, i2);
                        return;
                    }
                    return;
                }
                return;
        }
        C9GR.A0F(applicationContext, str, i);
    }

    @Override // X.InterfaceC37160GYx
    public final void onShareTap(List list) {
    }
}
