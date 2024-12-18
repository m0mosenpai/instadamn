package X;

import android.os.Handler;
import android.view.View;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.WTz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70397WTz implements InterfaceC72012XFa, X9C {
    public C69271Vkf A00;
    public EnumC68183VFb A01;
    public Integer A02;
    public float A03;
    public boolean A04;
    public final Handler A05;
    public final View A06;
    public final U7n A07;
    public final C68679VaF A08;
    public final C69598Vs1 A09;
    public final VJ6 A0A;

    public final void A00(int i) {
        C69598Vs1 c69598Vs1 = this.A09;
        c69598Vs1.A03.markerEnd(i, c69598Vs1.A02, (short) 2);
    }

    @Override // X.X9C
    public final void D1O(CameraPosition cameraPosition) {
        if (!this.A04) {
            this.A04 = true;
            VJ6 vj6 = this.A0A;
            float f = cameraPosition.A02;
            UserFlowLogger userFlowLogger = vj6.A01;
            if (userFlowLogger != null) {
                userFlowLogger.flowAnnotate(vj6.A00, "initial_zoom", f);
            }
            this.A03 = f;
        }
    }

    @Override // X.InterfaceC72012XFa
    public final void ENZ(String str) {
        float f;
        PointEditor markPointWithEditor;
        String str2;
        if (this.A04) {
            if (str.equals("zoom")) {
                this.A00.getClass();
                f = this.A00.A01.A02().A02;
                if (f != Float.MIN_VALUE) {
                    float f2 = this.A03;
                    if (f != f2) {
                        if (f > f2) {
                            str2 = "zoom_in";
                        } else {
                            str2 = "zoom_out";
                        }
                        VJ6 vj6 = this.A0A;
                        UserFlowLogger userFlowLogger = vj6.A01;
                        if (userFlowLogger != null) {
                            markPointWithEditor = userFlowLogger.markPointWithEditor(vj6.A00, str2);
                            markPointWithEditor.addPointData("is_interactive", true).addPointData("zoom", f).markerEditingCompleted();
                        }
                        this.A03 = f;
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("rotate")) {
                this.A00.getClass();
                f = this.A00.A01.A02().A02;
                if (f == Float.MIN_VALUE) {
                    return;
                }
                VJ6 vj62 = this.A0A;
                UserFlowLogger userFlowLogger2 = vj62.A01;
                if (userFlowLogger2 != null) {
                    markPointWithEditor = userFlowLogger2.markPointWithEditor(vj62.A00, str);
                    markPointWithEditor.addPointData("is_interactive", true).addPointData("zoom", f).markerEditingCompleted();
                }
                this.A03 = f;
                return;
            }
            VJ6 vj63 = this.A0A;
            UserFlowLogger userFlowLogger3 = vj63.A01;
            if (userFlowLogger3 == null) {
                return;
            }
            userFlowLogger3.markPointWithEditor(vj63.A00, str).addPointData("is_interactive", true).markerEditingCompleted();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.VJ6, java.lang.Object] */
    public C70397WTz(View view, C0Gd c0Gd, C69374VmK c69374VmK, QuickPerformanceLogger quickPerformanceLogger, UserFlowLogger userFlowLogger) {
        Handler A0J = AbstractC167007dF.A0J();
        this.A05 = A0J;
        this.A08 = new C68679VaF();
        U7n u7n = new U7n(this);
        this.A07 = u7n;
        this.A02 = C05F.A00;
        MapboxTTRC.initialize(c0Gd, c69374VmK);
        this.A06 = view;
        C14360o3.A0B(c0Gd, 1);
        MapboxTTRC.initialize(c0Gd, c69374VmK);
        VYC.A00.addAll(AbstractC166987dD.A1J("socal_home"));
        this.A09 = new C69598Vs1(quickPerformanceLogger);
        ?? obj = new Object();
        obj.A01 = userFlowLogger;
        this.A0A = obj;
        A0J.postDelayed(u7n, 500L);
    }
}
