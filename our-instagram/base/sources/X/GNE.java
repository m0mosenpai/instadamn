package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GNE implements Runnable {
    public final /* synthetic */ C32272EJh A00;

    public GNE(C32272EJh c32272EJh) {
        this.A00 = c32272EJh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A00.A00;
        if (fragmentActivity == null) {
            C14360o3.A0F("activity");
            throw C00O.createAndThrow();
        }
        fragmentActivity.onBackPressed();
    }
}
