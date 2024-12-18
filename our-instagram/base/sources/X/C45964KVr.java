package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.KVr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45964KVr extends AbstractC49192Lp9 {
    public final AnonymousClass988 A00;
    public final C7FK A01;
    public final C7IM A02;
    public final List A03;
    public final List A04;

    public C45964KVr(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(context, userSession, c98k, anonymousClass988, c7im);
        this.A02 = c7im;
        this.A00 = anonymousClass988;
        this.A01 = new C7FK(userSession);
        this.A04 = C16930sl.A00;
        this.A03 = AbstractC16960so.A1Q(C2EY.A1i, C2EY.A19, C2EY.A0K, C2EY.A1d, C2EY.A1m, C2EY.A1C);
    }

    @Override // X.AbstractC49192Lp9, X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (super.AFd(c99e, interfaceC50520MRx, i)) {
            Integer BnI = interfaceC50520MRx.BnI(i);
            if (BnI == null || BnI.intValue() != 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
