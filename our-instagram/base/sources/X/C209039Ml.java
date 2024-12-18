package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.9Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209039Ml implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public int A02;
    public Camera A03;
    public final C208989Mg A05;
    public final C175227qw A07;
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public final C1814082s A06 = new C1814082s();
    public final Handler A04 = new Handler(Looper.getMainLooper(), new Y89(this, 2));
    public final Callable A08 = new CallableC209549Op(this, 10);

    public final void A00(int i) {
        if (this.A0B && i != this.A09 && i <= this.A01 && i >= 0) {
            if (!C176567tE.A02()) {
                if (this.A0E) {
                    synchronized (this) {
                        this.A02 = i;
                        if (this.A0C) {
                            if (!this.A0D) {
                                this.A0D = true;
                                Camera camera = this.A03;
                                camera.getClass();
                                camera.stopSmoothZoom();
                            }
                        } else {
                            this.A0C = true;
                            Camera camera2 = this.A03;
                            camera2.getClass();
                            camera2.startSmoothZoom(i);
                        }
                    }
                    return;
                }
                try {
                    C208999Mh A00 = this.A05.A00(this.A00);
                    AbstractC176827te.A00(AbstractC176797tb.A11, A00, i);
                    A00.A03();
                    Camera camera3 = this.A03;
                    camera3.getClass();
                    onZoomChange(i, true, camera3);
                    return;
                } catch (Exception e) {
                    RuntimeException runtimeException = new RuntimeException(AnonymousClass001.A0O("Failed to set zoom level to: ", i), e);
                    synchronized (this) {
                        AbstractC166997dE.A1H(this.A04, runtimeException, 2);
                    }
                }
                return;
            }
            throw AbstractC166987dD.A18("Attempting to zoom on the UI thread!");
        }
    }

    @Override // android.hardware.Camera.OnZoomChangeListener
    public final synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        int i2 = 0;
        if (this.A0E) {
            this.A0C = AbstractC167007dF.A1N(z ? 1 : 0);
            if (z) {
                this.A0D = false;
                if (this.A0B && this.A02 != i) {
                    this.A07.A07("update_zoom_level", this.A08);
                }
            }
        }
        Handler handler = this.A04;
        if (z) {
            i2 = 1;
        }
        handler.sendMessage(handler.obtainMessage(1, i, i2));
    }

    public C209039Ml(C208989Mg c208989Mg, C175227qw c175227qw) {
        this.A05 = c208989Mg;
        this.A07 = c175227qw;
    }
}
