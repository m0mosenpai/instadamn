package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Aaa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23463Aaa implements InterfaceC175497rP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public volatile C176507t8 A06;
    public final /* synthetic */ C180177z7 A07;

    @Override // X.InterfaceC175497rP
    public final SurfaceTexture C4L(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A07.A0B.post(new RunnableC24561AuI(this, countDownLatch));
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C0K8.A0L("RendererSurfacePipeComponent", "Timeout when creating SurfaceNode: %s", e, e.getMessage());
        }
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i6;
        this.A04 = i4;
        this.A00 = i5;
        boolean z = true;
        if (i7 != 1) {
            z = false;
        }
        this.A05 = z;
        A00();
        C176507t8 c176507t8 = this.A06;
        if (c176507t8 != null) {
            return c176507t8.A0B;
        }
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dib(int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dic(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Did(Surface surface, int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Die(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dif(Surface surface) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EbO(boolean z) {
    }

    @Override // X.InterfaceC175497rP
    public final boolean FE6() {
        return true;
    }

    public C23463Aaa(C180177z7 c180177z7) {
        this.A07 = c180177z7;
    }

    private void A00() {
        C176507t8 c176507t8 = this.A06;
        if (c176507t8 != null) {
            C180177z7 c180177z7 = this.A07;
            c180177z7.A0B.post(new RunnableC24898Azx(c180177z7, c176507t8, this.A03, this.A01, this.A02, this.A04, this.A00, this.A05));
        }
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty Bcs() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty BkW() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Surface C4M() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ SurfaceTexture C4N() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC176297sm CFN() {
        return this.A07.A05;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty CIg() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final void D1a(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00();
        }
    }

    @Override // X.InterfaceC175497rP
    public final void DA4(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00();
        }
    }

    @Override // X.InterfaceC175497rP
    public final void EES(SurfaceTexture surfaceTexture) {
        C176507t8 c176507t8 = this.A06;
        this.A06 = null;
        if (c176507t8 != null) {
            c176507t8.A01();
        }
        A00();
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Object BZG(C176377su c176377su) {
        return null;
    }
}
