package X;

import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes9.dex */
public final class PNJ implements Runnable {
    public final /* synthetic */ C56455P4r A00;

    public PNJ(C56455P4r c56455P4r) {
        this.A00 = c56455P4r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C56455P4r c56455P4r = this.A00;
        AppBarLayout appBarLayout = c56455P4r.A09;
        if (appBarLayout == null) {
            str = "appBarLayout";
        } else {
            ViewGroup viewGroup = c56455P4r.A06;
            if (viewGroup != null) {
                appBarLayout.setMinimumHeight(viewGroup.getHeight() + c56455P4r.A02);
                CollapsingToolbarLayout collapsingToolbarLayout = c56455P4r.A0A;
                if (collapsingToolbarLayout == null) {
                    str = "collapsingToolbar";
                } else {
                    ViewGroup viewGroup2 = c56455P4r.A06;
                    if (viewGroup2 != null) {
                        collapsingToolbarLayout.setMinimumHeight(viewGroup2.getHeight() + c56455P4r.A02);
                        return;
                    }
                }
            }
            C14360o3.A0F("actionBar");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
