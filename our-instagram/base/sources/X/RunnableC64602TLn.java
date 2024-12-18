package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TLn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64602TLn implements Runnable {
    public final /* synthetic */ IgReactNavigatorModule A00;

    public RunnableC64602TLn(IgReactNavigatorModule igReactNavigatorModule) {
        this.A00 = igReactNavigatorModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity A01 = AbstractC58321PtD.A0b(this.A00).A01();
        if ((A01 instanceof FragmentActivity) && A01 != null) {
            A01.finish();
        }
    }
}
