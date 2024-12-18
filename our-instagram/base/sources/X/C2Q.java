package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2Q extends AbstractC65902yS {
    public final Context A00;
    public final InterfaceC09390do A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2Q(Context context, C07X c07x, UserSession userSession) {
        super(context, c07x, userSession, null, null, null, 248);
        AbstractC167017dG.A1Q(context, userSession);
        this.A00 = context;
        this.A01 = DGY.A00(this, 17);
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return new C26298Bk5(interfaceC16820sZ);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC25227BEk.A02(AbstractC167027dH.A01(this.A01));
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "LITHO_OPEN_CAROUSEL_REVIEW_MEDIA_CTA_ROW";
    }
}
