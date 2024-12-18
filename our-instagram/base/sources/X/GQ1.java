package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GQ1 implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C189448aO A01;
    public final /* synthetic */ C15370ps A02;

    public GQ1(FragmentActivity fragmentActivity, C189448aO c189448aO, C15370ps c15370ps) {
        this.A01 = c189448aO;
        this.A00 = fragmentActivity;
        this.A02 = c15370ps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189478aR A00 = this.A01.A00();
        FragmentActivity fragmentActivity = this.A00;
        Object obj = this.A02.A00;
        if (obj == null) {
            C14360o3.A0F("bottomSheetContentFragment");
            throw C00O.createAndThrow();
        }
        A00.A02(fragmentActivity, (Fragment) obj);
    }
}
