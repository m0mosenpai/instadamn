package X;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TLm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64601TLm implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;

    public RunnableC64601TLm(IgReactNavigatorModule igReactNavigatorModule) {
        this.A00 = igReactNavigatorModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentActivity componentActivity;
        Activity A01 = AbstractC58321PtD.A0b(this.A00).A01();
        if ((A01 instanceof FragmentActivity) && (componentActivity = (ComponentActivity) A01) != null) {
            componentActivity.onBackPressed();
        }
    }
}
