package X;

import com.facebook.systrace.Systrace;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

/* renamed from: X.2oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59922oZ implements InterfaceC59932oa {
    public CameraConfiguration A00;
    public final C54802fd A01;

    @Override // X.InterfaceC59932oa
    public final void DVc(String str, float f) {
        C81Y c81y;
        C14360o3.A0B(str, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("SwipeNavigationListener.onNewPositionStart", -1349551765);
        }
        try {
            C54802fd c54802fd = this.A01;
            c54802fd.A0S.A02 = str;
            C13080lu A00 = AbstractC13090lv.A00("SwipeNavigationController.onNewPosition");
            if (f == -1.0f && str != "camera_action_bar_button_main_feed") {
                try {
                    C22P A002 = AbstractC189418aK.A00(str);
                    C207549Gh A0A = c54802fd.A0A();
                    if (A0A != null && (c81y = A0A.A06) != null) {
                        c81y.A00.A0x.A00(A002);
                    }
                    AbstractC189688an.A00(A002);
                } finally {
                }
            }
            A00.close();
            if (Systrace.A0E(1L)) {
                C0fO.A00(1671919532);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1020199131);
            }
            throw th;
        }
    }

    public C59922oZ(C54802fd c54802fd) {
        this.A01 = c54802fd;
    }
}
