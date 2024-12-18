package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.Czw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29544Czw implements MPP {
    public final UserSession A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public C29544Czw(C51762Yz c51762Yz, UserSession userSession, C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 2);
        this.A00 = userSession;
        this.A02 = AbstractC25225BEi.A16(c51762Yz);
        this.A01 = AbstractC25225BEi.A16(c75113Zb);
    }

    @Override // X.MPP
    public final void CwX() {
        C51762Yz c51762Yz = (C51762Yz) this.A02.get();
        if (c51762Yz != null) {
            c51762Yz.A01(null);
        }
        C75113Zb c75113Zb = (C75113Zb) this.A01.get();
        if (c75113Zb != null) {
            c75113Zb.A1X = null;
            C75113Zb.A00(c75113Zb, 42);
        }
    }
}
