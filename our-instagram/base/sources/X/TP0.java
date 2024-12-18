package X;

import android.view.View;
import com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity;

/* loaded from: classes10.dex */
public final class TP0 implements Runnable {
    public final /* synthetic */ WaitingForStringsActivity A00;
    public final /* synthetic */ Throwable A01;

    public TP0(WaitingForStringsActivity waitingForStringsActivity, Throwable th) {
        this.A00 = waitingForStringsActivity;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        WaitingForStringsActivity waitingForStringsActivity = this.A00;
        waitingForStringsActivity.A09 = true;
        View view = waitingForStringsActivity.A01;
        if (view == null) {
            str = "progressView";
        } else {
            view.setVisibility(8);
            View view2 = waitingForStringsActivity.A00;
            if (view2 == null) {
                str = "errorView";
            } else {
                view2.setVisibility(0);
                View view3 = waitingForStringsActivity.A02;
                if (view3 == null) {
                    str = "useEnglishButton";
                } else {
                    view3.setVisibility(0);
                    C217313z c217313z = waitingForStringsActivity.A03;
                    if (c217313z == null) {
                        str = "resourcesLogger";
                    } else {
                        C1R9 c1r9 = waitingForStringsActivity.A04;
                        if (c1r9 == null) {
                            str = "stringResourcesDelegate";
                        } else {
                            c217313z.A01(c1r9.A03().toString(), this.A01, true);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
