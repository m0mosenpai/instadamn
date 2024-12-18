package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180157z5 extends AbstractC178657wd implements InterfaceC179867yc, InterfaceC180167z6 {
    public final int A00;
    public final int A01;
    public final SurfaceHolder.Callback A02;
    public final TextureView.SurfaceTextureListener A03;
    public final C1814082s A04;
    public volatile int A05;
    public volatile int A06;
    public volatile View A07;
    public volatile C176507t8 A08;

    public static synchronized void A00(C180157z5 c180157z5) {
        synchronized (c180157z5) {
            View view = c180157z5.A07;
            c180157z5.A07 = null;
            if (view instanceof TextureView) {
                ((TextureView) view).setSurfaceTextureListener(null);
            } else if (view instanceof SurfaceView) {
                ((SurfaceView) view).getHolder().removeCallback(c180157z5.A02);
            }
            C176507t8 c176507t8 = c180157z5.A08;
            c180157z5.A08 = null;
            if (c176507t8 != null) {
                A03(c180157z5, c176507t8);
                c176507t8.A01();
            }
        }
    }

    @Override // X.InterfaceC179867yc
    public final synchronized View Bfy() {
        if (this.A07 != null) {
        } else {
            throw new IllegalStateException("Preview view is null when invoking getPreviewView()");
        }
        return this.A07;
    }

    @Override // X.InterfaceC179867yc
    public final synchronized void EbQ(SurfaceTexture surfaceTexture, int i, int i2) {
        C176507t8 c176507t8 = this.A08;
        if (c176507t8 != null) {
            if (c176507t8.A0B != surfaceTexture) {
                this.A07 = null;
                this.A08 = null;
                this.A06 = 0;
                this.A05 = 0;
                A03(this, c176507t8);
                c176507t8.A01();
            }
            this.A06 = i;
            this.A05 = i2;
            A04(this, c176507t8, i, i2);
        }
        if (surfaceTexture != null) {
            c176507t8 = new C176507t8(surfaceTexture, false);
            c176507t8.A08 = this.A01;
            c176507t8.A06 = this.A00;
            this.A08 = c176507t8;
            A01(this, c176507t8);
            this.A06 = i;
            this.A05 = i2;
            A04(this, c176507t8, i, i2);
        }
    }

    @Override // X.InterfaceC179867yc
    public final synchronized void EbT(View view) {
        if (this.A07 != view) {
            A00(this);
            this.A07 = view;
            Iterator it = this.A04.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178677wf) it.next()).Dan(this.A07);
            }
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                SurfaceHolder holder = surfaceView.getHolder();
                SurfaceHolder.Callback callback = this.A02;
                holder.addCallback(callback);
                SurfaceHolder holder2 = surfaceView.getHolder();
                if (holder2.getSurface() != null && holder2.getSurface().isValid()) {
                    callback.surfaceCreated(holder2);
                    Rect surfaceFrame = holder2.getSurfaceFrame();
                    surfaceFrame.getClass();
                    int i = surfaceFrame.right - surfaceFrame.left;
                    int i2 = surfaceFrame.bottom - surfaceFrame.top;
                    if (i > 0 && i2 > 0) {
                        callback.surfaceChanged(holder2, -1, i, i2);
                    }
                }
            } else if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                TextureView.SurfaceTextureListener surfaceTextureListener = this.A03;
                textureView.setSurfaceTextureListener(surfaceTextureListener);
                SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                if (surfaceTexture != null && width > 0 && height > 0) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, width, height);
                }
            }
        }
    }

    public static void A01(C180157z5 c180157z5, C176507t8 c176507t8) {
        List list = c180157z5.A04.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC178677wf) list.get(i)).Dah(c176507t8);
        }
    }

    public static void A03(C180157z5 c180157z5, C176507t8 c176507t8) {
        List list = c180157z5.A04.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC178677wf) list.get(i)).Dai(c176507t8);
        }
    }

    public static void A04(C180157z5 c180157z5, C176507t8 c176507t8, int i, int i2) {
        List list = c180157z5.A04.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC178677wf) list.get(i3)).Daj(c176507t8, i, i2);
        }
    }

    @Override // X.InterfaceC179867yc
    public final void A9y(InterfaceC178677wf interfaceC178677wf) {
        if (this.A04.A01(interfaceC178677wf)) {
            if (this.A07 != null) {
                interfaceC178677wf.Dan(this.A07);
            }
            C176507t8 c176507t8 = this.A08;
            if (c176507t8 != null) {
                interfaceC178677wf.Dah(c176507t8);
                int i = this.A06;
                int i2 = this.A05;
                if (i > 0 && i2 > 0) {
                    interfaceC178677wf.Daj(c176507t8, i, i2);
                }
            }
        }
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179867yc.A00;
    }

    @Override // X.InterfaceC179867yc
    public final void Bfh(final C23318AVd c23318AVd) {
        IllegalStateException illegalStateException;
        Surface A00;
        View view = this.A07;
        if (view instanceof TextureView) {
            try {
                Bitmap bitmap = ((TextureView) view).getBitmap(view.getWidth(), view.getHeight());
                if (bitmap != null) {
                    c23318AVd.A00(bitmap, null);
                    return;
                } else {
                    c23318AVd.D2I(new IllegalStateException("Failed to acquire bitmap"));
                    return;
                }
            } catch (Throwable th) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th);
            }
        } else {
            C176507t8 c176507t8 = this.A08;
            if (c176507t8 != null && (A00 = c176507t8.A00()) != null) {
                try {
                    final Bitmap createBitmap = Bitmap.createBitmap(this.A06, this.A05, Bitmap.Config.ARGB_8888);
                    PixelCopy.request(A00, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.APv
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i) {
                            Bitmap bitmap2 = createBitmap;
                            C23318AVd c23318AVd2 = c23318AVd;
                            if (i != 0) {
                                bitmap2.eraseColor(-12303292);
                            }
                            c23318AVd2.A00(bitmap2, null);
                        }
                    }, ((C178267w0) ((InterfaceC178297w3) ((AbstractC178657wd) this).A00.Aq1(InterfaceC178297w3.A00))).A00);
                    return;
                } catch (Throwable th2) {
                    illegalStateException = new IllegalStateException("Failed to acquire bitmap", th2);
                }
            } else {
                illegalStateException = new IllegalStateException("Preview view or surface is null");
            }
        }
        c23318AVd.D2I(illegalStateException);
    }

    @Override // X.InterfaceC179867yc
    public final boolean CLY() {
        if (this.A07 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC179867yc
    public final void EG8(InterfaceC178677wf interfaceC178677wf) {
        this.A04.A02(interfaceC178677wf);
    }

    public C180157z5(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A03 = new APz(this);
        this.A02 = new APy(this);
        this.A04 = new C1814082s();
        C178037vc c178037vc = InterfaceC180167z6.A01;
        Object obj = r3;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178657wd) this).A00;
        Object AqG = interfaceC178207vu2.AqG(c178037vc);
        this.A01 = ((Number) (AqG != null ? AqG : obj)).intValue();
        Object AqG2 = interfaceC178207vu2.AqG(InterfaceC180167z6.A00);
        this.A00 = ((Number) (AqG2 != null ? AqG2 : 0)).intValue();
        View view = (View) interfaceC178207vu2.AqG(AbstractC174817qH.A03);
        EbT(view == null ? (View) interfaceC178207vu2.AqG(AbstractC174817qH.A02) : view);
    }

    @Override // X.InterfaceC179867yc
    public final View Aqk() {
        return Bfy();
    }
}
