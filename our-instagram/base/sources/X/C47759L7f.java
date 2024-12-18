package X;

import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.L7f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47759L7f {
    public final C46016KYe A02;
    public final UserSession A03;
    public final InterfaceC08830cm A04;
    public final C13400mQ A01 = JX1.A00(AbstractC167007dF.A0J(), this, 5);
    public LGU A00 = LGU.A03;

    public final void A00(LGU lgu) {
        LGU lgu2 = this.A00;
        if (lgu2 != LGU.A03 && lgu.equals(lgu2)) {
            return;
        }
        this.A00 = lgu;
        UserSession userSession = this.A03;
        List list = lgu.A02;
        C1ON A00 = AbstractC47110Ks5.A00((GiphyRequestSurface) this.A04.get(), userSession, lgu.A00, list);
        C44093JeI.A00(A00, this, 7);
        C1GJ.A03(A00);
    }

    public C47759L7f(UserSession userSession, C46016KYe c46016KYe, InterfaceC08830cm interfaceC08830cm) {
        this.A03 = userSession;
        this.A02 = c46016KYe;
        this.A04 = interfaceC08830cm;
    }
}
