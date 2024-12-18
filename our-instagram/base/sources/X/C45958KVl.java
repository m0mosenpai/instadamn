package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KVl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45958KVl extends AbstractC49191Lp8 {
    public final Context A00;
    public final C7IM A01;
    public final C2EY A02;
    public final UserSession A03;
    public final AnonymousClass988 A04;

    @Override // X.AbstractC49191Lp8, X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        Integer Ad6;
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (super.AFd(c99e, interfaceC50520MRx, i) || ((Ad6 = interfaceC50520MRx.Ad6(i)) != null && Ad6.intValue() == 1 && C14360o3.A0K(interfaceC50520MRx.Ad3(i), "image/png"))) {
            return true;
        }
        return false;
    }

    public C45958KVl(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(context, userSession, anonymousClass988, c7im);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = c7im;
        this.A04 = anonymousClass988;
        this.A02 = C2EY.A1C;
    }
}
