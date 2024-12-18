package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class M44 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C162307Os A01;

    public M44(View view, C162307Os c162307Os) {
        this.A01 = c162307Os;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A01.A01;
        if (viewGroup != null) {
            View view = this.A00;
            viewGroup.removeAllViews();
            viewGroup.addView(view);
            viewGroup.setVisibility(0);
        }
    }
}
