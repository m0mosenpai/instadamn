package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OKt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54818OKt {
    public C47Z A00;
    public String A01;
    public final UserSession A02;
    public final C40121td A03;
    public final Context A04;

    public C54818OKt(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = context;
        this.A03 = C40121td.A0G.A01(context, userSession);
    }

    public final void A00() {
        C47Z c47z = this.A00;
        if (c47z != null) {
            String str = this.A01;
            if (str != null && str.equals(c47z.A33)) {
                return;
            }
            this.A01 = c47z.A33;
            EnumC915447k enumC915447k = c47z.A1f;
            EnumC915447k enumC915447k2 = EnumC915447k.A09;
            if (enumC915447k == enumC915447k2) {
                c47z.A0Z(EnumC915447k.A0B);
            }
            c47z.A0a(enumC915447k2);
        }
    }

    public final void A01(boolean z) {
        C47Z c47z = this.A00;
        if (c47z != null) {
            c47z.A5g = false;
            this.A03.A0K(c47z.A35, null, z, true, true);
        }
        this.A00 = null;
    }
}
