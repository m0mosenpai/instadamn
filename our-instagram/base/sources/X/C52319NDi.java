package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NDi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52319NDi extends AbstractC61132qb {
    public final Context A00;
    public final C07T A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final Ng1 A04;
    public final InterfaceC15070pN A05;
    public final boolean A06;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        return new C52618NPn(userSession, this.A04, new C49654Lwl(this.A00, this.A01, this.A02, userSession), this.A05, this.A06);
    }

    public C52319NDi(Context context, C07T c07t, AbstractC018607g abstractC018607g, UserSession userSession, Ng1 ng1, InterfaceC15070pN interfaceC15070pN, boolean z) {
        AbstractC167027dH.A13(userSession, ng1, interfaceC15070pN);
        this.A03 = userSession;
        this.A04 = ng1;
        this.A05 = interfaceC15070pN;
        this.A00 = context;
        this.A02 = abstractC018607g;
        this.A01 = c07t;
        this.A06 = z;
    }
}
