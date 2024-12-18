package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2X extends AbstractC65902yS {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final C07X A02;
    public final UserSession A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2X(Context context, C07X c07x, UserSession userSession) {
        super(context, c07x, userSession, null, DP2.A00, null, 216);
        AbstractC167017dG.A1P(context, userSession);
        this.A03 = userSession;
        this.A02 = c07x;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C57557PgV(context, 46));
        this.A00 = AbstractC09440dt.A00(enumC09460dv, new C57557PgV(context, 45));
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return new C26318BkP(this.A03, interfaceC16820sZ);
    }

    @Override // X.AbstractC65902yS
    public final int A00() {
        return AbstractC167027dH.A01(this.A00);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC167027dH.A01(this.A01);
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "LITHO_STORY_AD";
    }
}
