package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AUz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23314AUz implements C85T {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicReference A01;

    public C23314AUz(CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = countDownLatch;
    }

    @Override // X.C85T
    public final void DTk(C150156pL c150156pL) {
        C14360o3.A0B(c150156pL, 0);
        c150156pL.A03(new C23312AUx(1, this.A01, this.A00), AbstractC166987dD.A1J(VersionedCapability.IiFaceTracker), false);
    }
}
