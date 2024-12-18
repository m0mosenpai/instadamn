package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KVi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45955KVi extends AbstractC49191Lp8 {
    public final Context A00;
    public final C98K A01;
    public final C7IM A02;
    public final C2EY A03;

    @Override // X.AbstractC49191Lp8, X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (!(interfaceC50520MRx instanceof C49204LpL) || ((C49204LpL) interfaceC50520MRx).BnJ(i) == null) {
            return super.AFd(c99e, interfaceC50520MRx, i);
        }
        return false;
    }

    public C45955KVi(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(context, userSession, anonymousClass988, c7im);
        this.A00 = context;
        this.A02 = c7im;
        this.A01 = c98k;
        this.A03 = C2EY.A1i;
    }
}
