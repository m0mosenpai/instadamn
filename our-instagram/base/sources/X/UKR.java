package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bloks.foa.screen.tracker.ActivityLifecycleTracker;

/* loaded from: classes11.dex */
public final class UKR extends UF5 {
    public final /* synthetic */ W30 A00;

    @Override // X.C06K
    public final void A08(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        W30 w30 = this.A00;
        if (fragment.equals(w30.A02)) {
            ActivityLifecycleTracker activityLifecycleTracker = w30.A04;
            if (!activityLifecycleTracker.A00) {
                activityLifecycleTracker.A00 = true;
                Application application = activityLifecycleTracker.A01.getApplication();
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleTracker);
                }
            }
            UF5 uf5 = w30.A05;
            if (uf5 != null && !uf5.A00) {
                uf5.A00 = true;
                AbstractC10360h2 abstractC10360h22 = uf5.A03;
                abstractC10360h22.A0q(uf5, false);
                abstractC10360h22.A0r(uf5);
            }
            W30.A00(w30, EnumC68126VCk.A02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UKR(W30 w30) {
        super(w30.A02, w30.A03, new X2o(w30, 0), w30.A01);
        this.A00 = w30;
    }

    @Override // X.C06K
    public final void A03(Bundle bundle, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        W30 w30 = this.A00;
        if (fragment.equals(w30.A02)) {
            bundle.putInt("key_bloks_navigation_tracker_backstack_size", w30.A01);
            Integer num = w30.A07;
            if (num != null) {
                bundle.putInt("key_bloks_navigation_tracker_parent_backstack_size", num.intValue());
            }
        }
    }

    @Override // X.UF5, X.C06K
    public final void A04(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        AbstractC167017dG.A1N(abstractC10360h2, fragment);
        super.A04(fragment, abstractC10360h2);
        W30 w30 = this.A00;
        if (fragment.equals(w30.A02)) {
            UKR ukr = w30.A06;
            if (((UF5) ukr).A00) {
                ((UF5) ukr).A00 = false;
                AbstractC10360h2 abstractC10360h22 = ukr.A03;
                abstractC10360h22.A0p(ukr);
                abstractC10360h22.A0F.remove(ukr);
            }
            ActivityLifecycleTracker activityLifecycleTracker = w30.A04;
            if (activityLifecycleTracker.A00) {
                activityLifecycleTracker.A00 = false;
                Application application = activityLifecycleTracker.A01.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleTracker);
                }
            }
            UF5 uf5 = w30.A05;
            if (uf5 != null && uf5.A00) {
                uf5.A00 = false;
                AbstractC10360h2 abstractC10360h23 = uf5.A03;
                abstractC10360h23.A0p(uf5);
                abstractC10360h23.A0F.remove(uf5);
            }
        }
    }
}
