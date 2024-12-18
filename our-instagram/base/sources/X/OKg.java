package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public class OKg {
    public C2GT A00;
    public C2GS A01;
    public C54521O6y A02;

    public final C54521O6y A00() {
        C54521O6y c54521O6y;
        if (this instanceof NNF) {
            c54521O6y = ((NNF) this).A00;
        } else {
            c54521O6y = this.A02;
        }
        if (c54521O6y != null) {
            return c54521O6y;
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }

    public void A01(UserSession userSession, C47Z c47z, C40121td c40121td) {
        this.A01.A0B(EnumC53151Nf6.A04);
        c40121td.A0H(new C56487P6c(1, c47z, this));
        if (this instanceof NNF) {
            c40121td.A0E(c47z, ((NNF) this).A01, null);
        } else {
            c40121td.A09(c47z);
        }
        C54521O6y A00 = A00();
        A00.A01.markerPoint(A00.A00, "start");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    public OKg() {
        ?? c2gt = new C2GT(EnumC53151Nf6.A03);
        this.A01 = c2gt;
        this.A00 = c2gt;
    }
}
