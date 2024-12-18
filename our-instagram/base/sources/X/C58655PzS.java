package X;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;

/* renamed from: X.PzS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58655PzS {
    public static C58655PzS A03;
    public C62922SXe A00;
    public Boolean A01;
    public final C58656PzT A02;

    public final boolean A01() {
        return AbstractC167007dF.A1N(this.A02.A03(255));
    }

    public final boolean A02() {
        Boolean bool = this.A01;
        if (bool == null) {
            C58656PzT c58656PzT = this.A02;
            bool = Boolean.valueOf(MSY.A1S(c58656PzT.A03(255), 12));
            this.A01 = bool;
            if (bool == null) {
                if (c58656PzT.A03(255) != 12) {
                    return true;
                }
                return false;
            }
        }
        return bool.booleanValue();
    }

    public C58655PzS(Context context) {
        this.A02 = new C58656PzT(new C58657PzU(context));
    }

    public final void A00(Fragment fragment, InterfaceC65529Tlz interfaceC65529Tlz, boolean z) {
        KeyguardManager keyguardManager;
        SM8 sm8;
        Context requireContext = fragment.requireContext();
        Executor mainExecutor = requireContext.getMainExecutor();
        C14360o3.A07(mainExecutor);
        this.A00 = new C62922SXe(new Q5g(interfaceC65529Tlz, this), fragment, mainExecutor);
        Object systemService = requireContext.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            keyguardManager = (KeyguardManager) systemService;
        } else {
            keyguardManager = null;
        }
        int i = 2131963953;
        int i2 = 2131963951;
        if (z) {
            i = 2131963952;
            i2 = 2131963950;
        }
        if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
            sm8 = new SM8();
            sm8.A03 = requireContext.getString(i);
            sm8.A01 = requireContext.getString(i2);
            sm8.A00 = 33023;
        } else {
            sm8 = new SM8();
            sm8.A03 = requireContext.getString(i);
            sm8.A01 = requireContext.getString(i2);
        }
        SH3 A00 = sm8.A00();
        C14360o3.A0A(A00);
        C62922SXe c62922SXe = this.A00;
        if (c62922SXe != null) {
            C62922SXe.A00(null, A00, c62922SXe);
        }
    }
}
