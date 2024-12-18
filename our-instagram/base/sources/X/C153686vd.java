package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153686vd {
    public final C153696ve A00;
    public final List A01 = new ArrayList();
    public final java.util.Set A02 = new LinkedHashSet();
    public final UserSession A03;

    public final C37762Gjb A00(InterfaceC116925Qy interfaceC116925Qy, UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(userSession, 0);
        java.util.Set set = this.A02;
        return new C37762Gjb(interfaceC116925Qy, null, userSession, C05F.A0C, str, this.A01, set, C9IN.A00, z, z2, false, z3, z4, z6, z5);
    }

    public C153686vd(C153696ve c153696ve, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = c153696ve;
        C14360o3.A0B(userSession, 0);
        this.A01.add(new C153706vf(C3YS.A00(userSession)));
    }
}
