package X;

import android.graphics.HardwareBufferRenderer;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;

/* loaded from: classes10.dex */
public final class TVL implements Consumer {
    public final /* synthetic */ CountDownLatch A00;

    public TVL(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        HardwareBufferRenderer.RenderResult renderResult = (HardwareBufferRenderer.RenderResult) obj;
        C14360o3.A0B(renderResult, 0);
        renderResult.getFence().awaitForever();
        this.A00.countDown();
    }
}
