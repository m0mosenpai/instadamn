package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EVP extends AbstractC60592pi implements CallerContextable {
    public static final String __redex_internal_original_name = "FacebookConnectHelper";
    public final Fragment A00;
    public final UserSession A01;
    public final FWI A02;
    public final EVB A03;
    public final C64592wI A04;
    public final C36705GGa A05;

    public EVP(Fragment fragment, InterfaceC59992oh interfaceC59992oh, UserSession userSession, FWI fwi, C64592wI c64592wI) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A04 = c64592wI;
        this.A02 = fwi;
        this.A05 = new C36705GGa(this);
        interfaceC59992oh.registerLifecycleListener(this);
        this.A03 = new EVB(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            CallerContext callerContext = C1L2.A00;
            if (i == 64206) {
                C1L2.A01(intent, this.A01, this.A05);
            }
        }
    }
}
