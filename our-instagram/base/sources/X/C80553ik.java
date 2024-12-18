package X;

import android.content.Context;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.3ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80553ik {
    public final UserSession A00;
    public final C80563il A01;

    public C80553ik(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C80563il(userSession);
    }

    public final boolean A00(Context context, C38321qM c38321qM) {
        Boolean valueOf;
        C14360o3.A0B(context, 0);
        if (c38321qM.Cff()) {
            C75363a3 CFR = c38321qM.CFR();
            return C41711wL.A01(this.A01.A00).A0G(CFR.A0G);
        }
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (A1q == null) {
            return false;
        }
        Looper.myLooper();
        Looper.getMainLooper();
        A1q.AjX();
        C25821No A00 = C25821No.A00();
        String A0L = A00.A0L(A1q);
        InterfaceC24281Gx interfaceC24281Gx = A00.A0G.A00;
        if (interfaceC24281Gx == null || (valueOf = Boolean.valueOf(interfaceC24281Gx.Cb3(A0L))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }
}
