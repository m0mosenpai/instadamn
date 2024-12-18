package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XRg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72172XRg extends AbstractC185778Lx implements InterfaceC197918p2, InterfaceC197928p3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public RectF A04;
    public SurfaceTexture A05;
    public Xkr A06;
    public AnonymousClass810 A07;
    public Surface A0A;
    public final XiF A0B;
    public final ThreadPoolExecutor A0C;
    public boolean A09 = false;
    public WeakReference A08 = AbstractC25225BEi.A16(null);

    public C72172XRg(XiF xiF) {
        this.A0B = xiF;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.A0C = threadPoolExecutor;
        threadPoolExecutor.prestartCoreThread();
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return null;
    }

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return "DefaultPhotoOutput";
    }

    @Override // X.InterfaceC197918p2
    public final int BqV() {
        return 1;
    }

    @Override // X.InterfaceC197928p3
    public final InterfaceC179247xa Bml() {
        return new C23494AbA();
    }

    @Override // X.InterfaceC197928p3
    public final InterfaceC179247xa Bmm() {
        return new C23495AbB();
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        int i;
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(new AnonymousClass811("DefaultPhotoOutput"));
        this.A07 = anonymousClass810;
        SurfaceTexture surfaceTexture = new SurfaceTexture(anonymousClass810.A00);
        this.A05 = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.A0A = surface;
        interfaceC197958p6.EpX(surface, this);
        int i2 = this.A02;
        if (i2 > 0 && (i = this.A01) > 0) {
            this.A03 = i2;
            this.A00 = i;
            SurfaceTexture surfaceTexture2 = this.A05;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setDefaultBufferSize(i2, i);
            }
            AnonymousClass810 anonymousClass8102 = this.A07;
            if (anonymousClass8102 != null) {
                anonymousClass8102.A00(this.A03, this.A00);
            }
            this.A09 = true;
        }
        this.A05.setDefaultBufferSize(this.A03, this.A00);
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void DrC() {
        int i;
        int i2;
        if (!this.A09 && (i = this.A02) > 0 && (i2 = this.A01) > 0) {
            this.A03 = i;
            this.A00 = i2;
            SurfaceTexture surfaceTexture = this.A05;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            AnonymousClass810 anonymousClass810 = this.A07;
            if (anonymousClass810 != null) {
                anonymousClass810.A00(this.A03, this.A00);
            }
            this.A09 = true;
            return;
        }
        Xkr xkr = this.A06;
        if (xkr == null) {
            return;
        }
        this.A06 = null;
        RectF rectF = this.A04;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
            this.A04 = rectF;
        }
        float f = rectF.left;
        float f2 = this.A03;
        int i3 = (int) (f * f2);
        float f3 = rectF.top;
        float f4 = this.A00;
        Rect rect = new Rect(i3, (int) (f3 * f4), (int) (rectF.right * f2), (int) (rectF.bottom * f4));
        int width = rect.width();
        int height = rect.height();
        try {
            Buffer buffer = (Buffer) this.A08.get();
            if (buffer == null) {
                buffer = ByteBuffer.allocateDirect(rect.width() * rect.height() * 4);
                this.A08 = AbstractC25225BEi.A16(buffer);
            }
            buffer.rewind();
            GLES20.glReadPixels(rect.left, rect.top, rect.width(), rect.height(), 6408, 5121, buffer);
            AbstractC180237zD.A02("glReadPixels", new Object[0]);
            this.A0C.execute(new RunnableC73535YIg(xkr, this, buffer, width, height));
        } catch (Throwable th) {
            C0K8.A0F("PhotoOutput", "Unable to create ByteBuffer", th);
            xkr.A00.A00(AbstractC166987dD.A15("Failed to get pixels from Surface"));
        }
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void release() {
        Surface surface = this.A0A;
        if (surface != null) {
            surface.release();
            this.A0A = null;
        }
        SurfaceTexture surfaceTexture = this.A05;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A05 = null;
        }
        AnonymousClass810 anonymousClass810 = this.A07;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
            this.A07 = null;
        }
        super.release();
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return EnumC185798Lz.CAPTURE_IMAGE;
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        release();
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getWidth() {
        return this.A03;
    }
}
