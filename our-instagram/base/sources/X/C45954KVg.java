package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KVg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45954KVg extends AbstractC49191Lp8 {
    public final C2EY A00;
    public final UserSession A01;
    public final AnonymousClass988 A02;

    @Override // X.AbstractC49191Lp8, X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (super.AFd(c99e, interfaceC50520MRx, i) && !C14360o3.A0K(interfaceC50520MRx.Ad3(i), "image/png")) {
            return true;
        }
        return false;
    }

    public C45954KVg(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(context, userSession, anonymousClass988, c7im);
        this.A01 = userSession;
        this.A02 = anonymousClass988;
        this.A00 = C2EY.A1d;
    }
}
