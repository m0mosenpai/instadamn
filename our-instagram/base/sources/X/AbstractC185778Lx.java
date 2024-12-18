package X;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC185778Lx implements InterfaceC185788Ly {
    public AbstractC180277zH A00;
    public Surface A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicReference A04 = new AtomicReference(null);
    public volatile boolean A05 = true;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r2.A05 == false) goto L7;
     */
    @Override // X.InterfaceC185788Ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean AFZ() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.7zH r0 = r2.A00     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            boolean r1 = r2.A05     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r1 != 0) goto Lb
        La:
            r0 = 0
        Lb:
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC185778Lx.AFZ():boolean");
    }

    @Override // X.InterfaceC185788Ly
    public final synchronized void setEnabled(boolean z) {
        this.A05 = z;
    }

    @Override // X.InterfaceC185788Ly
    public final void CNx(Surface surface, InterfaceC178897x1 interfaceC178897x1) {
        if (this.A00 != null) {
            if (this.A01 == surface) {
                C0K8.A0C("BaseVideoOutput", "GLSurface already created, high chance it might cause an issue");
                return;
            }
            release();
        }
        if (surface != null && surface.isValid()) {
            this.A00 = interfaceC178897x1.AMi(surface);
            this.A01 = surface;
            this.A02.set(true);
        }
        this.A03.set(false);
    }

    @Override // X.InterfaceC185788Ly
    public final /* synthetic */ boolean Cem() {
        if (this instanceof C8Lw) {
            return ((C8Lw) this).A01;
        }
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public boolean Cmi() {
        AbstractC180277zH abstractC180277zH = this.A00;
        if (abstractC180277zH != null) {
            return abstractC180277zH.A05();
        }
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public void DrC() {
        this.A03.compareAndSet(false, true);
    }

    @Override // X.InterfaceC185788Ly
    public int getHeight() {
        AbstractC180277zH abstractC180277zH = this.A00;
        if (abstractC180277zH != null) {
            return abstractC180277zH.A00();
        }
        return 0;
    }

    @Override // X.InterfaceC185788Ly
    public int getWidth() {
        AbstractC180277zH abstractC180277zH = this.A00;
        if (abstractC180277zH != null) {
            return abstractC180277zH.A01();
        }
        return 0;
    }

    @Override // X.InterfaceC185788Ly
    public void release() {
        AbstractC180277zH abstractC180277zH = this.A00;
        if (abstractC180277zH != null) {
            abstractC180277zH.A02();
            this.A00 = null;
        }
        this.A02.set(false);
        this.A01 = null;
    }

    @Override // X.InterfaceC185788Ly
    public void swapBuffers() {
        AbstractC180277zH abstractC180277zH = this.A00;
        if (abstractC180277zH != null) {
            abstractC180277zH.A03();
        }
    }
}
