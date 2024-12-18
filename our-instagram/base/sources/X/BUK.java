package X;

import android.view.View;

/* loaded from: classes5.dex */
public abstract class BUK {
    public static final C28811Cnh A00 = new C28811Cnh(0);

    public static final void A00(View view, AnonymousClass599 anonymousClass599) {
        long Chn = anonymousClass599.A0W.A06.Chn(0L);
        int round = Math.round(C119365at.A01(Chn));
        int round2 = Math.round(C119365at.A02(Chn));
        view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
    }
}
