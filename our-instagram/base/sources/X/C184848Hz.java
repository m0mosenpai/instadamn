package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.VibrationEffect;
import android.view.ViewConfiguration;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184848Hz implements C8I0 {
    public float A00;
    public float A01;
    public C174757qB A02;
    public final Rect A03;
    public final VibrationEffect A04;
    public final ViewConfiguration A05;
    public final AbstractC184688Hj A06;
    public final C1815383g A07;
    public final C1820485o A08;
    public final AtomicReference A09;
    public final C12T A0A;
    public final C19L A0B;
    public final UserSession A0C;

    public C184848Hz(Rect rect, ViewConfiguration viewConfiguration, C07X c07x, C1815383g c1815383g, UserSession userSession, C1820485o c1820485o) {
        VibrationEffect vibrationEffect;
        C14360o3.A0B(viewConfiguration, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1815383g, 5);
        C14360o3.A0B(c07x, 6);
        this.A05 = viewConfiguration;
        this.A0C = userSession;
        this.A03 = rect;
        this.A08 = c1820485o;
        this.A07 = c1815383g;
        this.A0A = C12L.A00.A04;
        this.A09 = new AtomicReference(C8I1.A03);
        if (Build.VERSION.SDK_INT >= 29) {
            vibrationEffect = VibrationEffect.createPredefined(5);
        } else {
            vibrationEffect = null;
        }
        this.A04 = vibrationEffect;
        this.A06 = new C8I2(this);
        this.A0B = AbstractC57302k5.A00(c07x.getLifecycle());
    }

    public static final void A01(C174757qB c174757qB, C184848Hz c184848Hz, float f) {
        if (c184848Hz.A09.get() != C8I1.A04) {
            c174757qB.A0S(false);
            float f2 = (-0.0075f) + f;
            AbstractC23641Du.A05(c184848Hz.A0A, new B5Z(c184848Hz, c174757qB, null, f2, 1), c184848Hz.A0B);
            AbstractC13670mt.A06("Easing from %f to %f smooth zoom", Float.valueOf(f), Float.valueOf(f2));
        }
    }

    public static final void A02(C174757qB c174757qB, C184848Hz c184848Hz, long j) {
        if (!c174757qB.A0V()) {
            AbstractC23641Du.A05(c184848Hz.A0A, new C50121MBv(c174757qB, c184848Hz, null, 5, j), c184848Hz.A0B);
        }
    }

    public static final C174757qB A00(C184848Hz c184848Hz, String str) {
        if (c184848Hz.A02 == null) {
            AbstractC12120kG.A0I(AnonymousClass001.A0R("CameraZoomController - cameraController is unexpectedly null at ", str), null, AbstractC06930Yk.A0E());
        }
        return c184848Hz.A02;
    }

    @Override // X.C8I0
    public final void DCD(float f) {
        if (this.A09.get() == C8I1.A03) {
            IgCameraEffectsController igCameraEffectsController = this.A07.A05;
            CameraAREffect cameraAREffect = igCameraEffectsController.A09;
            if (cameraAREffect != null && cameraAREffect.A0Z.get("worldTracker") != null) {
                float f2 = f + 1.0f;
                InterfaceC149876og interfaceC149876og = igCameraEffectsController.A02;
                if (interfaceC149876og != null) {
                    interfaceC149876og.setZoomFactor(f2);
                    return;
                }
                return;
            }
            C174757qB A00 = A00(this, "onDragZoomPercent()");
            if (A00 == null) {
                return;
            }
            float f3 = this.A00;
            C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(A00)).A04;
            if (c175007qa != null) {
                c175007qa.A0N.EhX(f3, f);
            }
            this.A01 = f;
        }
    }
}
