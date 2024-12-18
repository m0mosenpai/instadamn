package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.89R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89R extends AbstractC52922bZ {
    public InterfaceC110214xq A00;
    public final C89T A01;
    public final C89Y A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final UserSession A05;

    public C89R(C89T c89t, C89Y c89y, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c89t, 2);
        C14360o3.A0B(c89y, 3);
        this.A05 = userSession;
        this.A01 = c89t;
        this.A02 = c89y;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A03 = c24721Ip;
        this.A04 = AbstractC07080Za.A03(c24721Ip);
    }

    public final void A01() {
        List CAa;
        InterfaceC110214xq interfaceC110214xq = this.A00;
        if (interfaceC110214xq != null && (CAa = interfaceC110214xq.CAa()) != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(CAa, 10));
            for (Object obj : CAa) {
                arrayList.add(AbstractC23641Du.A04(AnonymousClass191.A00, new MCK(obj, this, (InterfaceC23621Ds) null, 18), AbstractC141776au.A00(this)));
            }
        }
    }

    public final void A00() {
        C141796aw A00 = AbstractC141776au.A00(this);
        C206639Cu c206639Cu = new C206639Cu(this, null, 10);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
    }
}
