package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes6.dex */
public final class GQ0 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C4NL A01;
    public final /* synthetic */ C50685MZd A02;

    public GQ0(Context context, C4NL c4nl, C50685MZd c50685MZd) {
        this.A02 = c50685MZd;
        this.A00 = context;
        this.A01 = c4nl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC10360h2 supportFragmentManager;
        C50685MZd c50685MZd = this.A02;
        FragmentActivity activity = c50685MZd.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && !supportFragmentManager.A0G) {
            AbstractC54912fq.A00();
            Context context = this.A00;
            UserSession A0r = AbstractC166987dD.A0r(c50685MZd.A06);
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A03;
            C4NL c4nl = this.A01;
            AbstractC167017dG.A1P(A0r, quickPromotionSlot);
            AbstractC69976Vys.A01(context, A0r, c4nl, quickPromotionSlot, null);
        }
    }
}
