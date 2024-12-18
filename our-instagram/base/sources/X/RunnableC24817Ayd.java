package X;

import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.common.AREngineService$binder$1;
import java.nio.ByteBuffer;

/* renamed from: X.Ayd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24817Ayd implements Runnable {
    public final /* synthetic */ VersionedSharedMemory A00;
    public final /* synthetic */ AREngineService$binder$1 A01;
    public final /* synthetic */ AbstractServiceC201348vN A02;

    public RunnableC24817Ayd(VersionedSharedMemory versionedSharedMemory, AREngineService$binder$1 aREngineService$binder$1, AbstractServiceC201348vN abstractServiceC201348vN) {
        this.A01 = aREngineService$binder$1;
        this.A02 = abstractServiceC201348vN;
        this.A00 = versionedSharedMemory;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBuffer;
        AREngineService$binder$1.A00(this.A01);
        AbstractServiceC201348vN abstractServiceC201348vN = this.A02;
        if (abstractServiceC201348vN.A0G == null) {
            VersionedSharedMemory versionedSharedMemory = this.A00;
            abstractServiceC201348vN.A0G = versionedSharedMemory;
            if (versionedSharedMemory != null) {
                byteBuffer = versionedSharedMemory.mapReadOnly();
            } else {
                byteBuffer = null;
            }
            abstractServiceC201348vN.A0L = byteBuffer;
        }
    }
}
