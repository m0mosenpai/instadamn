package X;

import android.opengl.GLES20;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AWb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23332AWb implements InterfaceC185788Ly {
    public int A00;
    public int A01;
    public C200688uB A02;
    public AbstractC180277zH A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicReference A05 = new AtomicReference(null);
    public volatile boolean A06;

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return null;
    }

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return "FrameBufferOutput";
    }

    @Override // X.InterfaceC185788Ly
    public final void CNx(Surface surface, InterfaceC178897x1 interfaceC178897x1) {
        AbstractC180277zH AMg = interfaceC178897x1.AMg(1, 1);
        this.A03 = AMg;
        AMg.A05();
        this.A02 = new C200688uB(this.A01, this.A00);
        this.A04.set(false);
    }

    @Override // X.InterfaceC185788Ly
    public final boolean AFZ() {
        if (this.A02 != null && this.A06) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return EnumC185798Lz.PREVIEW;
    }

    @Override // X.InterfaceC185788Ly
    public final /* synthetic */ boolean Cem() {
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public final boolean Cmi() {
        if (this.A02 == null) {
            return false;
        }
        boolean A05 = this.A03.A05();
        GLES20.glBindFramebuffer(36160, this.A02.A00);
        GLES20.glBindTexture(3553, this.A02.A03.A00);
        GLES20.glViewport(0, 0, this.A01, this.A00);
        return A05;
    }

    @Override // X.InterfaceC185788Ly
    public final void DrC() {
        this.A04.compareAndSet(false, true);
    }

    @Override // X.InterfaceC185788Ly
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC185788Ly
    public final int getWidth() {
        return this.A01;
    }

    @Override // X.InterfaceC185788Ly
    public final void release() {
        C200688uB c200688uB = this.A02;
        if (c200688uB != null) {
            c200688uB.A01();
            this.A02 = null;
        }
        AbstractC180277zH abstractC180277zH = this.A03;
        if (abstractC180277zH != null) {
            abstractC180277zH.A02();
        }
    }

    public C23332AWb(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.A01 = i;
            this.A00 = i2;
            this.A06 = true;
            return;
        }
        throw AbstractC166987dD.A12("Width and height must be > 0");
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        release();
    }

    @Override // X.InterfaceC185788Ly
    public final void setEnabled(boolean z) {
        this.A06 = z;
    }

    @Override // X.InterfaceC185788Ly
    public final void swapBuffers() {
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        interfaceC197958p6.AWg(this);
    }
}
