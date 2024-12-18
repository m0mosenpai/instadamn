package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OL4 {
    public View A00;
    public InterfaceC25209BDh A01;
    public BD0 A02;
    public final Context A03;
    public final AbstractC59962oe A04;
    public final C174757qB A05;
    public final UserSession A06;
    public final C8JL A07;

    public OL4(Context context, AbstractC59962oe abstractC59962oe, C174757qB c174757qB, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A04 = abstractC59962oe;
        this.A06 = userSession;
        this.A05 = c174757qB;
        this.A03 = context;
        this.A07 = new PH5(this);
    }

    public final void A00(boolean z) {
        AbstractC55106ObM A00;
        C190298bn A01 = C190298bn.A03.A01(this.A06);
        if (A01 != null && (A00 = A01.A00()) != null) {
            AbstractC55106ObM.A01(A00, 30, z, false, false, false, false);
        }
    }

    public final boolean A01() {
        AbstractC55106ObM A00;
        C190298bn A01 = C190298bn.A03.A01(this.A06);
        if (A01 != null && (A00 = A01.A00()) != null) {
            return A00.A0J();
        }
        return false;
    }
}
