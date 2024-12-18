package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: X.AaZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23462AaZ implements InterfaceC175497rP {
    public WeakReference A00 = new WeakReference(null);
    public WeakReference A01;

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void D1a(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void DA4(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dib(int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Die(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dif(Surface surface) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EES(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EbO(boolean z) {
    }

    @Override // X.InterfaceC175497rP
    public final boolean FE6() {
        return false;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty Bcs() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty BkW() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final SurfaceTexture C4L(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (SurfaceTexture) this.A01.get();
    }

    @Override // X.InterfaceC175497rP
    public final Surface C4M() {
        return (Surface) this.A00.get();
    }

    @Override // X.InterfaceC175497rP
    public final SurfaceTexture C4N() {
        return (SurfaceTexture) this.A01.get();
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC176297sm CFN() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty CIg() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final void Dic(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A01 = new WeakReference(surfaceTexture);
    }

    @Override // X.InterfaceC175497rP
    public final void Did(Surface surface, int i, int i2) {
        this.A00 = new WeakReference(surface);
    }

    public C23462AaZ(SurfaceTexture surfaceTexture) {
        this.A01 = new WeakReference(surfaceTexture);
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Object BZG(C176377su c176377su) {
        return null;
    }
}
