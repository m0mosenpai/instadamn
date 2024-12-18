package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class GOX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ G0M A01;

    public GOX(G0M g0m, int i) {
        this.A01 = g0m;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FN0 fn0 = (FN0) this.A01.A01;
        int i = this.A00;
        View view = fn0.A03;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float height = iArr[1] + view.getHeight();
        Context context = view.getContext();
        float A00 = height + AbstractC13880nE.A00(context, 8.0f) + fn0.A02;
        float A09 = AbstractC13880nE.A09(context) - i;
        if (A00 > A09) {
            fn0.A04.smoothScrollBy(0, (int) (A00 - A09));
        }
    }
}
