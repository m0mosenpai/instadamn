package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* loaded from: classes10.dex */
public final class TQJ implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ IgReactNavigatorModule A01;
    public final /* synthetic */ String A02;

    public TQJ(IgReactNavigatorModule igReactNavigatorModule, String str, double d) {
        this.A01 = igReactNavigatorModule;
        this.A00 = d;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity A01 = AbstractC58321PtD.A0b(this.A01).A01();
        if ((A01 instanceof FragmentActivity) && A01 != null && AbstractC62820SSs.A01(A01, (int) this.A00)) {
            C56352iT.A0t.A03(A01).setTitle(this.A02);
        }
    }
}
