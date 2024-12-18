package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.nio.ByteBuffer;

/* renamed from: X.8vQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201378vQ {
    public SurfaceTexture A00;
    public Surface A01;
    public VersionedSharedMemory A02;
    public AbstractC180277zH A03;
    public AnonymousClass810 A04;
    public AnonymousClass810 A05;
    public C180317zL A06;
    public ByteBuffer A07;
    public boolean A08;
    public final AnalyticsLogger A0A;
    public final AM6 A0C;
    public final C22906A8b A0D;
    public final Context A0E;
    public final Intent A0F;
    public final C23342AWm A0G;
    public final C179877yd A0H;
    public final SurfaceTexture.OnFrameAvailableListener A09 = new APB(this);
    public final InterfaceC178897x1 A0B = C178917x3.A00(2);

    public C201378vQ(Context context, Intent intent, InterfaceC150566q9 interfaceC150566q9, C23342AWm c23342AWm, C22906A8b c22906A8b, IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARNetworkClientWorkerHost iARNetworkClientWorkerHost) {
        this.A0E = context;
        this.A0F = intent;
        this.A0D = c22906A8b;
        this.A0G = c23342AWm;
        this.A0H = new C179877yd(context.getResources());
        this.A0C = new AM6(context, intent, c23342AWm, new C22818A4n(this), c22906A8b, iARAnalyticsLoggerHost, iARNetworkClientWorkerHost);
        this.A0A = new AnalyticsLoggerImpl(interfaceC150566q9, null, EnumC150606qD.USE_DEFAULT);
    }

    public static final void A00(AnonymousClass810 anonymousClass810, C201378vQ c201378vQ, float[] fArr, int i, int i2, boolean z) {
        C180317zL c180317zL;
        if (anonymousClass810 != null && (c180317zL = c201378vQ.A06) != null) {
            C179877yd c179877yd = c201378vQ.A0H;
            float[] fArr2 = C180317zL.A05;
            c180317zL.A01(c179877yd, anonymousClass810, null, fArr, fArr2, fArr2, fArr2, 3, 0, i, i2, z, true, false, false, false);
        }
    }

    public static final void A01(C201378vQ c201378vQ) {
        c201378vQ.A0C.A07(null);
        VersionedSharedMemory versionedSharedMemory = c201378vQ.A02;
        if (versionedSharedMemory != null) {
            versionedSharedMemory.unmap(c201378vQ.A07);
        }
        c201378vQ.A07 = null;
        VersionedSharedMemory versionedSharedMemory2 = c201378vQ.A02;
        if (versionedSharedMemory2 != null) {
            versionedSharedMemory2.close();
        }
        c201378vQ.A02 = null;
    }

    public final void A02() {
        AM6 am6 = this.A0C;
        if (am6.A0A != null) {
            C0K8.A02(AM6.class, "Service already running");
            return;
        }
        synchronized (am6.A0b) {
            am6.A0V.bindService(am6.A0W, am6.A0X, 65);
        }
    }

    public final void finalize() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.A00 = null;
        AnonymousClass810 anonymousClass810 = this.A05;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
        }
        this.A05 = null;
        this.A08 = false;
        AbstractC180277zH abstractC180277zH = this.A03;
        if (abstractC180277zH != null) {
            abstractC180277zH.A02();
        }
        this.A03 = null;
        Surface surface = this.A01;
        if (surface != null) {
            surface.release();
        }
        this.A01 = null;
        AnonymousClass810 anonymousClass8102 = this.A04;
        if (anonymousClass8102 != null) {
            anonymousClass8102.A01();
        }
        this.A04 = null;
        C180317zL c180317zL = this.A06;
        if (c180317zL != null) {
            c180317zL.A00();
        }
        AM6 am6 = this.A0C;
        if (am6.A0A != null) {
            synchronized (am6.A0b) {
                Context context = am6.A0V;
                context.stopService(am6.A0W);
                context.unbindService(am6.A0X);
                am6.A0A = null;
            }
        }
        Integer num = C05F.A00;
        am6.A0D = num;
        am6.A0E = num;
        am6.A0F = num;
        am6.A0B = num;
        am6.A0C = num;
        InterfaceC178897x1 interfaceC178897x1 = this.A0B;
        if (interfaceC178897x1 != null) {
            interfaceC178897x1.release();
        }
    }
}
