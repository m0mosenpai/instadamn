package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Adz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23664Adz implements C11R {
    public final /* synthetic */ C124855kq A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ AtomicBoolean A03;

    @Override // X.C11R
    public final String getName() {
        return "EncryptedSharedPrefs_commit_writeToDisk";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 234;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public C23664Adz(C124855kq c124855kq, HashMap hashMap, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean) {
        this.A00 = c124855kq;
        this.A03 = atomicBoolean;
        this.A01 = hashMap;
        this.A02 = countDownLatch;
    }

    @Override // X.C11R
    public final void run() {
        try {
            try {
                AtomicBoolean atomicBoolean = this.A03;
                C1FE c1fe = this.A00.A02;
                Map map = C1FE.A09;
                atomicBoolean.set(c1fe.A00.A00(c1fe.A03, this.A01));
            } catch (IOException e) {
                C0w9.A07("EncryptedSharedPrefs_commit_failed_writeToDisk", e);
            }
        } finally {
            this.A02.countDown();
        }
    }
}
