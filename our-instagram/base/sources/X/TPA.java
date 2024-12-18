package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* loaded from: classes10.dex */
public final class TPA implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactNavigatorModule A01;

    public TPA(IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.A01 = igReactNavigatorModule;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity;
        IgReactNavigatorModule igReactNavigatorModule = this.A01;
        Activity A01 = AbstractC58321PtD.A0b(igReactNavigatorModule).A01();
        if ((A01 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A01) != null && igReactNavigatorModule.mIsHostResumed) {
            fragmentActivity.getSupportFragmentManager().A18(Integer.toString((int) this.A00), 1);
        }
    }
}
