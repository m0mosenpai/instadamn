package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.PMg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56887PMg implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC56887PMg(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        AbstractC31176DnK.A1D(view, R.id.scrubber_spinner);
        MSZ.A14(view, R.id.scrubber_content);
    }
}
