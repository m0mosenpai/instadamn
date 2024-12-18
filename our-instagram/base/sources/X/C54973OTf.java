package X;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: X.OTf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54973OTf {
    public C56352iT A00;
    public final View.OnClickListener A01 = ViewOnClickListenerC55455Ok9.A00(this, 16);
    public final AppCompatActivity A02;

    public static final void A00(C54973OTf c54973OTf) {
        C56352iT c56352iT;
        InterfaceC60122ou interfaceC60122ou;
        AppCompatActivity appCompatActivity = c54973OTf.A02;
        InterfaceC08430c6 A0I = AbstractC31177DnL.A0I(appCompatActivity);
        if (A0I instanceof InterfaceC60122ou) {
            C3DN A0r = AbstractC31172DnG.A0r(appCompatActivity);
            if (A0r != null && !((C3DP) A0r).A0h) {
                c56352iT = c54973OTf.A00;
                if (c56352iT != null) {
                    interfaceC60122ou = (InterfaceC60122ou) A0I;
                    c56352iT.A0X(interfaceC60122ou);
                    return;
                }
                C14360o3.A0F("actionBarService");
                throw C00O.createAndThrow();
            }
            return;
        }
        boolean z = A0I instanceof C2d4;
        c56352iT = c54973OTf.A00;
        if (c56352iT != null) {
            if (z) {
                c56352iT.A0P.setVisibility(8);
                return;
            } else {
                interfaceC60122ou = null;
                c56352iT.A0X(interfaceC60122ou);
                return;
            }
        }
        C14360o3.A0F("actionBarService");
        throw C00O.createAndThrow();
    }

    public C54973OTf(AppCompatActivity appCompatActivity) {
        this.A02 = appCompatActivity;
    }
}
