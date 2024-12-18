package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KVj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45956KVj extends AbstractC49191Lp8 {
    public final AnonymousClass988 A00;
    public final C7IM A01;
    public final C2EY A02;
    public final UserSession A03;

    @Override // X.AbstractC49191Lp8, X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (super.AFd(c99e, interfaceC50520MRx, i)) {
            Integer BSq = interfaceC50520MRx.BSq(i);
            if (BSq == null || BSq.intValue() != 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C45956KVj(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(context, userSession, anonymousClass988, c7im);
        this.A03 = userSession;
        this.A01 = c7im;
        this.A00 = anonymousClass988;
        this.A02 = C2EY.A1l;
    }
}
