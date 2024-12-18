package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.igsandbox.IgSandboxARExperimentUtilHost$getBinder$1;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.common.AREngineServiceManager$callback$1;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public final class AM6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Surface A08;
    public VersionedSharedMemory A09;
    public IAREngineServiceController A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public boolean A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public EnumC201298vD A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final Context A0V;
    public final Intent A0W;
    public final ServiceConnection A0X;
    public final C22818A4n A0Y;
    public final C22906A8b A0Z;
    public final IAREngineServiceCallback A0a;
    public final Object A0b;
    public final BlockingQueue A0c;
    public final C23342AWm A0d;
    public final IARAnalyticsLoggerHost A0e;
    public final IARNetworkClientWorkerHost A0f;

    private final boolean A01() {
        if (this.A0F == C05F.A01) {
            A06(this.A0K, this.A0H, this.A0U, this.A0R, this.A0T);
        }
        return AbstractC167007dF.A1X(this.A0F, C05F.A0C);
    }

    public static final boolean A02(AM6 am6) {
        if (am6.A0B == C05F.A01) {
            String str = am6.A0N;
            String str2 = am6.A0O;
            String str3 = am6.A0P;
            String str4 = am6.A0L;
            String str5 = am6.A0Q;
            int i = am6.A0J;
            am6.A08(str, str2, str3, str4, str5, am6.A0M, i, am6.A0I, am6.A0S);
        }
        return AbstractC167007dF.A1X(am6.A0B, C05F.A0C);
    }

    public final void A04(int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A02 = i2;
        this.A07 = i3;
        this.A06 = i4;
        this.A0G = z;
        this.A0D = C05F.A01;
        if (this.A0A != null && A01()) {
            try {
                IAREngineServiceController iAREngineServiceController = this.A0A;
                if (iAREngineServiceController != null) {
                    iAREngineServiceController.Eho(i, i2, i3, i4, z);
                }
            } catch (RemoteException e) {
                C0K8.A05(AM6.class, "setupImageSourceFacet() failed: ", e);
                A00(this);
            }
        }
    }

    public final void A06(EnumC201298vD enumC201298vD, int i, boolean z, boolean z2, boolean z3) {
        this.A0U = z;
        this.A0K = enumC201298vD;
        this.A0H = i;
        this.A0R = z2;
        this.A0T = z3;
        Integer num = C05F.A01;
        this.A0F = num;
        if (this.A0A != null) {
            if (this.A0E == num) {
                A05(this.A08, this.A05, this.A04);
            }
            Integer num2 = this.A0E;
            Integer num3 = C05F.A0C;
            if (num2 == num3) {
                try {
                    IAREngineServiceController iAREngineServiceController = this.A0A;
                    if (iAREngineServiceController != null) {
                        int i2 = enumC201298vD.A00;
                        iAREngineServiceController.EGr(this.A0e, new IgSandboxARExperimentUtilHost$getBinder$1(this.A0d), this.A0f, i2, i, z, z2, z3);
                    }
                    this.A0F = num3;
                } catch (RemoteException e) {
                    C0K8.A05(AM6.class, "renderSessionInit() failed: ", e);
                    A00(this);
                }
            }
        }
    }

    public final void A08(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z) {
        this.A0N = str;
        this.A0O = str2;
        this.A0P = str3;
        this.A0L = str4;
        this.A0Q = str5;
        this.A0J = i;
        this.A0M = str6;
        this.A0S = z;
        this.A0I = i2;
        this.A0B = C05F.A01;
        if (this.A0A != null && A01()) {
            try {
                this.A0c.clear();
                IAREngineServiceController iAREngineServiceController = this.A0A;
                if (iAREngineServiceController != null) {
                    iAREngineServiceController.EQq(this.A00);
                }
                IAREngineServiceController iAREngineServiceController2 = this.A0A;
                if (iAREngineServiceController2 != null) {
                    iAREngineServiceController2.EQv(this.A01);
                }
                IAREngineServiceController iAREngineServiceController3 = this.A0A;
                if (iAREngineServiceController3 != null) {
                    C22906A8b c22906A8b = this.A0Z;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator A16 = AbstractC166997dE.A16(c22906A8b.A02);
                    while (A16.hasNext()) {
                        A1E.add(((BE4) A16.next()).BHd());
                    }
                    A1E.add(AbstractC61636Rr0.A00(AbstractC166987dD.A1L("requiredDownloadableModules", c22906A8b.A01)));
                    iAREngineServiceController3.ETe(str, str2, str3, str4, str5, str6, A1E, i, i2, z);
                }
                this.A0B = C05F.A0C;
            } catch (RemoteException e) {
                C0K8.A05(AM6.class, "setEffect() failed: ", e);
                A00(this);
            }
        }
    }

    public final boolean A09() {
        Integer num = this.A0E;
        Integer num2 = C05F.A01;
        if (num == num2) {
            A05(this.A08, this.A05, this.A04);
        }
        Integer num3 = this.A0E;
        Integer num4 = C05F.A0C;
        if (num3 == num4 && A01()) {
            if (this.A0D == num2) {
                A04(this.A03, this.A02, this.A07, this.A06, this.A0G);
            }
            if (this.A0D == num4 && A02(this)) {
                return true;
            }
        }
        return false;
    }

    public static final void A00(AM6 am6) {
        Integer num = am6.A0D;
        Integer num2 = C05F.A0C;
        if (num == num2) {
            num = C05F.A01;
        }
        am6.A0D = num;
        Integer num3 = am6.A0E;
        if (num3 == num2) {
            num3 = C05F.A01;
        }
        am6.A0E = num3;
        Integer num4 = am6.A0F;
        if (num4 == num2) {
            num4 = C05F.A01;
        }
        am6.A0F = num4;
        Integer num5 = am6.A0B;
        if (num5 == num2) {
            num5 = C05F.A01;
        }
        am6.A0B = num5;
        Integer num6 = am6.A0C;
        if (num6 == num2) {
            num6 = C05F.A01;
        }
        am6.A0C = num6;
    }

    public final void A05(Surface surface, int i, int i2) {
        this.A08 = surface;
        this.A05 = i;
        this.A04 = i2;
        this.A0E = C05F.A01;
        IAREngineServiceController iAREngineServiceController = this.A0A;
        if (iAREngineServiceController != null) {
            try {
                iAREngineServiceController.EfF(surface, i, i2);
                this.A0E = C05F.A0C;
            } catch (RemoteException e) {
                C0K8.A05(AM6.class, "setSurface() failed: ", e);
                A00(this);
            }
        }
    }

    public final void A07(VersionedSharedMemory versionedSharedMemory) {
        this.A09 = versionedSharedMemory;
        this.A0C = C05F.A01;
        IAREngineServiceController iAREngineServiceController = this.A0A;
        if (iAREngineServiceController != null) {
            try {
                iAREngineServiceController.Ehn(versionedSharedMemory);
                this.A0C = C05F.A0C;
            } catch (RemoteException e) {
                C0K8.A05(AM6.class, "setupFrameDataBuffer() failed: ", e);
                A00(this);
            }
        }
    }

    public AM6(Context context, Intent intent, C23342AWm c23342AWm, C22818A4n c22818A4n, C22906A8b c22906A8b, IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARNetworkClientWorkerHost iARNetworkClientWorkerHost) {
        this.A0V = context;
        this.A0Y = c22818A4n;
        this.A0W = intent;
        this.A0Z = c22906A8b;
        this.A0d = c23342AWm;
        this.A0f = iARNetworkClientWorkerHost;
        this.A0e = iARAnalyticsLoggerHost;
        Integer num = C05F.A00;
        this.A0E = num;
        this.A0D = num;
        this.A0F = num;
        this.A0K = EnumC201298vD.A04;
        this.A0B = num;
        this.A0C = num;
        this.A0c = new LinkedBlockingQueue();
        this.A0b = new Object();
        this.A0X = new WIJ(this, 5);
        this.A0a = new AREngineServiceManager$callback$1(this);
    }

    public final void A03() {
        A00(this);
        IAREngineServiceController iAREngineServiceController = this.A0A;
        if (iAREngineServiceController != null) {
            try {
                iAREngineServiceController.EoW();
                IAREngineServiceController iAREngineServiceController2 = this.A0A;
                if (iAREngineServiceController2 != null) {
                    iAREngineServiceController2.EGs();
                }
            } catch (RemoteException e) {
                C0K8.A05(AM6.class, "rebootRenderSession() failed: ", e);
            }
        }
    }
}
