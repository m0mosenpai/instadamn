package X;

import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* loaded from: classes8.dex */
public final class LSB implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C15370ps A02;

    public LSB(LK0 lk0, String str, C15370ps c15370ps) {
        this.A00 = lk0;
        this.A02 = c15370ps;
        this.A01 = str;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C46560Kiz parseToLockBoxResult;
        LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
        LK0 lk0 = this.A00;
        parseToLockBoxResult = lockBoxStorageManager.parseToLockBoxResult((String) obj, (String) this.A02.A00, this.A01);
        lockBoxStorageManager.nullableComplete(lk0, parseToLockBoxResult);
    }
}
