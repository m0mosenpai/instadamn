package X;

import android.os.Handler;
import android.text.TextUtils;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.TNy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64642TNy implements Runnable {
    public C63302Sh6 A00;
    public final /* synthetic */ C64148T0z A01;

    public RunnableC64642TNy(C63302Sh6 c63302Sh6, C64148T0z c64148T0z) {
        this.A01 = c64148T0z;
        this.A00 = c63302Sh6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64148T0z c64148T0z = this.A01;
        C63302Sh6 c63302Sh6 = this.A00;
        ExecutorC64806TUu executorC64806TUu = C64148T0z.A0E;
        AtomicReference atomicReference = new AtomicReference("");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        atomicReference.set(((C4N7) c64148T0z.A03).getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, ""));
        countDownLatch.countDown();
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C0K8.A0G("DefaultAnalyticsLogger", "Waiting for user id interrupted", e);
        }
        String str = (String) atomicReference.get();
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        if (!(c63302Sh6 instanceof C60543R6g) && !(c63302Sh6 instanceof C60544R6h) && !(c63302Sh6 instanceof C60545R6i)) {
            c63302Sh6.A06.put("pk", str);
        }
        List list = c64148T0z.A00.A07;
        list.add(c63302Sh6);
        Handler handler = c64148T0z.A01;
        handler.removeMessages(1);
        if (list.size() >= 50) {
            C64148T0z.A00(c64148T0z);
        } else {
            handler.sendEmptyMessageDelayed(1, 300000L);
        }
    }
}
