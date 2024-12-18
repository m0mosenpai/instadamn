package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.instagram.business.fragment.SupportLinksFragment;

/* renamed from: X.GKp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36816GKp implements Runnable {
    public final /* synthetic */ C31456Ds0 A00;

    public RunnableC36816GKp(C31456Ds0 c31456Ds0) {
        this.A00 = c31456Ds0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = (Fragment) this.A00.A01;
        String string = fragment.requireContext().getString(2131972175);
        if (!TextUtils.isEmpty(string)) {
            C9GR.A09(fragment.requireContext(), string);
        }
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 != null) {
            abstractC10360h2.A0x(SupportLinksFragment.A06, 1);
        }
    }
}
