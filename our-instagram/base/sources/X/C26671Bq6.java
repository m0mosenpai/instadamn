package X;

import com.facebook.rsys.callmanager.gen.UnregisterCallback;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Bq6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26671Bq6 extends UnregisterCallback {
    public final /* synthetic */ CountDownLatch A00;

    public C26671Bq6(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    @Override // com.facebook.rsys.callmanager.gen.UnregisterCallback
    public final void onUnregister(String str) {
        this.A00.countDown();
    }
}
