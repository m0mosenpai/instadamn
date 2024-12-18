package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AUx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23312AUx implements C85Q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23312AUx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C85Q
    public final void D6S(C1825788b c1825788b, Exception exc) {
        ModelPathsHolder modelPathsHolder;
        AtomicReference atomicReference;
        C22863A6j c22863A6j;
        if (this.A00 != 0) {
            if (c1825788b != null) {
                try {
                    ModelPathsHolder modelPathsHolder2 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.IiFaceTracker);
                    if (modelPathsHolder2 != null) {
                        atomicReference = (AtomicReference) this.A02;
                        c22863A6j = new C22863A6j(null, AbstractC2041591k.A00(modelPathsHolder2));
                        atomicReference.set(c22863A6j);
                        return;
                    }
                } finally {
                    ((CountDownLatch) this.A01).countDown();
                }
            }
            atomicReference = (AtomicReference) this.A02;
            c22863A6j = new C22863A6j(exc, null);
            atomicReference.set(c22863A6j);
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : ((C23292AUd) this.A02).A00) {
            if (c1825788b != null && (modelPathsHolder = (ModelPathsHolder) c1825788b.A00.get(obj)) != null) {
                String modelPath = modelPathsHolder.getModelPath(EnumC1825988f.A0W);
                int i = modelPathsHolder.mVersion;
                if (modelPath != null) {
                    A1E.add(new C184028Eq(Integer.valueOf(i), modelPath, "", AbstractC06930Yk.A0E()));
                }
            }
        }
        ((C8EF) this.A01).D6b(exc, A1E);
    }
}
