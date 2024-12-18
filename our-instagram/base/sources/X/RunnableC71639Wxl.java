package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Wxl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71639Wxl implements Runnable {
    public static final RunnableC71639Wxl A00 = new RunnableC71639Wxl();

    @Override // java.lang.Runnable
    public final void run() {
        float andSet = W1F.A05.getAndSet(0);
        float andSet2 = W1F.A04.getAndSet(0);
        float andSet3 = W1F.A03.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f <= 0.25f && f3 <= 0.1f) {
                if (f2 > 0.98f) {
                    Iterator A14 = AbstractC166997dE.A14(W1F.A02);
                    while (A14.hasNext()) {
                        Map.Entry entry = (Map.Entry) A14.next();
                        W1F.A00((C68903Ve2) entry.getKey(), AbstractC43593JPy.A04(entry));
                    }
                }
            } else {
                Iterator A142 = AbstractC166997dE.A14(W1F.A02);
                while (A142.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) A142.next();
                    W1F.A00((C68903Ve2) entry2.getKey(), -AbstractC43593JPy.A04(entry2));
                }
            }
            W1F.A02.clear();
        }
        ((Handler) W1F.A06.getValue()).postDelayed(W1F.A00, 2000L);
    }
}
