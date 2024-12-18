package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2T extends AbstractC65902yS {
    public final InterfaceC09390do A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2T(Context context, C07X c07x, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(context, c07x, userSession, null, null, null, 248);
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = DGY.A00(context, 18);
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return new C26350Bkv(this.A01, this.A02, interfaceC16820sZ);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC25227BEk.A02(AbstractC167027dH.A01(this.A00));
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "POTATO_MEDIA";
    }
}
