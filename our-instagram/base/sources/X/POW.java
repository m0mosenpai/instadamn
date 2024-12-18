package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class POW implements Runnable {
    public final /* synthetic */ C3HC A00;

    public POW(C3HC c3hc) {
        this.A00 = c3hc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C3HC c3hc = this.A00;
        View view = c3hc.A02;
        if (view != null) {
            c3hc.A06.removeView(view);
            C65192xH c65192xH = (C65192xH) c3hc.A07;
            View view2 = c3hc.A02;
            C14360o3.A0B(view2, 0);
            View findViewById = view2.findViewById(R.id.open_older_posts);
            C110424yE c110424yE = c65192xH.A04;
            if (c110424yE != null) {
                z = c110424yE.A02();
            } else {
                z = false;
            }
            if (findViewById != null && z) {
                findViewById.setVisibility(4);
            }
            c3hc.A02 = null;
        }
    }
}
