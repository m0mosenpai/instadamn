package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.PRe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57013PRe implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C3HC A01;

    public RunnableC57013PRe(View view, C3HC c3hc) {
        this.A01 = c3hc;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3HC c3hc = this.A01;
        ViewGroup viewGroup = c3hc.A06;
        View view = this.A00;
        if (viewGroup.indexOfChild(view) < 0) {
            view.setClickable(true);
            view.setVisibility(0);
            viewGroup.addView(view);
            c3hc.A02 = view;
            AbstractC31176DnK.A1E(view, R.id.open_older_posts, 0);
        }
    }
}
