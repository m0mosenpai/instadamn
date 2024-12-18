package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.1nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36971nu {
    public static C36971nu A04;
    public boolean A00;
    public final InterfaceC09390do A01;
    public final Context A02;
    public final C36981nv A03;

    public C36971nu(Context context) {
        C14360o3.A0B(context, 1);
        this.A02 = context;
        this.A03 = new C36981nv(context);
        this.A00 = true;
        this.A01 = AbstractC09440dt.A01(C36991nw.A00);
    }

    public final void A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (this.A00) {
            AbstractC58562mF.A00(userSession).A00(this.A02);
        }
    }

    public final AnonymousClass514 A00(InterfaceC1116050z interfaceC1116050z, UserSession userSession, boolean z) {
        Integer num;
        if (!this.A00 && C18U.A06(C06090Tz.A05, userSession, 36318780326025696L)) {
            return null;
        }
        if (z) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        return new AnonymousClass514(interfaceC1116050z, userSession, this.A03, num);
    }

    public C36971nu() {
    }
}
