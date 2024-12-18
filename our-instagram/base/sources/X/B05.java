package X;

import android.os.RemoteException;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import java.util.List;

/* loaded from: classes4.dex */
public final class B05 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AbstractServiceC201348vN A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public B05(AbstractServiceC201348vN abstractServiceC201348vN, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        this.A02 = abstractServiceC201348vN;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A08 = str5;
        this.A01 = i;
        this.A04 = str6;
        this.A0A = z;
        this.A09 = list;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        AbstractServiceC201348vN abstractServiceC201348vN = this.A02;
        Integer num = abstractServiceC201348vN.A0K;
        Integer num2 = C05F.A01;
        if (num == num2) {
            try {
                AREngineController aREngineController = abstractServiceC201348vN.A0C;
                if (aREngineController != null) {
                    String str = this.A05;
                    String str2 = this.A06;
                    String str3 = this.A07;
                    String str4 = this.A03;
                    String str5 = this.A08;
                    int i = this.A01;
                    String str6 = this.A04;
                    boolean z = this.A0A;
                    C16930sl c16930sl = C16930sl.A00;
                    ABC abc = abstractServiceC201348vN.A0I;
                    if (abc != null) {
                        list = abc.A00(this.A09);
                    } else {
                        list = c16930sl;
                    }
                    aREngineController.setEffect(str, str2, str3, str4, str5, i, str6, z, c16930sl, list, null, null, null, this.A00);
                }
                abstractServiceC201348vN.A0K = C05F.A0C;
            } catch (EffectsFrameworkException e) {
                C0K8.A05(AbstractServiceC201348vN.class, "setEffect() failed: ", e);
                EffectServiceHost effectServiceHost = abstractServiceC201348vN.A0a;
                if (effectServiceHost != null) {
                    effectServiceHost.stopEffect();
                }
                EffectServiceHost effectServiceHost2 = abstractServiceC201348vN.A0a;
                if (effectServiceHost2 != null) {
                    effectServiceHost2.cleanupServices();
                }
                AREngineController aREngineController2 = abstractServiceC201348vN.A0C;
                if (aREngineController2 != null) {
                    aREngineController2.onEffectStopped();
                }
                abstractServiceC201348vN.A0K = num2;
                try {
                    IAREngineServiceCallback iAREngineServiceCallback = abstractServiceC201348vN.A0J;
                    if (iAREngineServiceCallback != null) {
                        iAREngineServiceCallback.Ct9(e.getMessage());
                    }
                } catch (RemoteException e2) {
                    C0K8.A05(AbstractServiceC201348vN.class, "Callback notifyException failed: ", e2);
                    abstractServiceC201348vN.stopSelf();
                }
            }
        }
    }
}
