package X;

import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import org.chromium.IsReadyToPayServiceCallback;

/* loaded from: classes10.dex */
public final class TOS implements Runnable {
    public final /* synthetic */ IsReadyToPayServiceImpl A00;
    public final /* synthetic */ IsReadyToPayServiceCallback A01;

    public TOS(IsReadyToPayServiceImpl isReadyToPayServiceImpl, IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        this.A00 = isReadyToPayServiceImpl;
        this.A01 = isReadyToPayServiceCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IsReadyToPayServiceImpl isReadyToPayServiceImpl = this.A00;
        IsReadyToPayServiceCallback isReadyToPayServiceCallback = this.A01;
        C58252li A00 = C2J8.A04.A02().A00();
        A00.A06(isReadyToPayServiceImpl, new C63625SqX(25, A00, isReadyToPayServiceCallback));
    }
}
