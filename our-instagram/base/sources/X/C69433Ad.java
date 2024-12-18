package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashSet;

/* renamed from: X.3Ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69433Ad {
    public final Runnable A01 = new Runnable() { // from class: X.3Ae
        @Override // java.lang.Runnable
        public final void run() {
            C69433Ad c69433Ad = C69433Ad.this;
            java.util.Set<C43774JXn> set = c69433Ad.A02;
            for (C43774JXn c43774JXn : set) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C43773JXm c43773JXm = c43774JXn.A00;
                if (elapsedRealtime > C43773JXm.A05) {
                    C43773JXm.A00(c43773JXm);
                }
            }
            set.size();
            if (!set.isEmpty()) {
                Handler handler = c69433Ad.A00;
                Runnable runnable = c69433Ad.A01;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
        }
    };
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final java.util.Set A02 = new HashSet();
}
