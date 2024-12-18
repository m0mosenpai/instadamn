package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class WkO implements C74M {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicBoolean A01;
    public final /* synthetic */ AtomicReference A02;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A02.set(str2);
        this.A00.countDown();
    }

    @Override // X.C74M
    public final void DQ4(XEC xec, String str, String str2, String str3) {
        C14360o3.A0B(str2, 2);
        this.A02.set(str2);
        this.A00.countDown();
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    public WkO(CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A00 = countDownLatch;
        this.A01 = atomicBoolean;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }

    @Override // X.C74M
    public final void onError(String str) {
        this.A01.set(true);
        this.A00.countDown();
    }
}
