package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.14R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14R extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;
    public final C211211o A02;

    public C14R(Context context, C211211o c211211o, C211211o c211211o2) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
        this.A02 = c211211o2;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "ReelRequestInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        UserSession A01 = AbstractC03270Dk.A01(((AnonymousClass122) this.A02.A00()).A08());
        if (A01 != null) {
            ((C13N) this.A01.A00()).A08();
            if (C08750cd.A04.A02() && C18U.A06(C06090Tz.A05, A01, 36316989325775629L)) {
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new HJM(this, A01));
            }
        }
    }
}
