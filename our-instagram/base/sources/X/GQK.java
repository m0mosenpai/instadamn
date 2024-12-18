package X;

import android.widget.TextSwitcher;
import java.util.List;

/* loaded from: classes6.dex */
public final class GQK implements Runnable {
    public int A00;
    public final /* synthetic */ TextSwitcher A01;
    public final /* synthetic */ C115765Lm A02;
    public final /* synthetic */ List A03;

    public GQK(TextSwitcher textSwitcher, C115765Lm c115765Lm, List list) {
        this.A01 = textSwitcher;
        this.A03 = list;
        this.A02 = c115765Lm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextSwitcher textSwitcher = this.A01;
        List list = this.A03;
        textSwitcher.setText((CharSequence) list.get(this.A00));
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == list.size()) {
            this.A00 = 0;
        }
        this.A02.A02.postDelayed(this, 2500L);
    }
}
