package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* loaded from: classes8.dex */
public final class LS6 implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;

    public LS6(LK0 lk0) {
        this.A00 = lk0;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C47498KyR parseToJsonResult;
        parseToJsonResult = LockBoxStorageManager.INSTANCE.parseToJsonResult((AbstractC46360Kfi) obj);
        this.A00.A05(parseToJsonResult);
    }
}
