package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Etg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33630Etg {
    public void A01(AbstractC115105If abstractC115105If, UserSession userSession) {
    }

    public void A02(UserSession userSession) {
    }

    public void A03(UserSession userSession) {
    }

    public void A00(C32071E6x c32071E6x, InterfaceC40821up interfaceC40821up, UserSession userSession) {
        InterfaceC37158GYv interfaceC37158GYv;
        if (this instanceof C32900Edh) {
            C32900Edh c32900Edh = (C32900Edh) this;
            C14360o3.A0B(c32071E6x, 2);
            AbstractC28761aE.A00(userSession).A7C(c32900Edh.A01.BKb());
            interfaceC37158GYv = c32900Edh.A00;
        } else if (this instanceof C32902Edj) {
            C32902Edj c32902Edj = (C32902Edj) this;
            C14360o3.A0B(c32071E6x, 2);
            ((C2DS) c32902Edj.A00.A00.invoke(userSession)).A7C(c32902Edj.A02.BKb());
            interfaceC37158GYv = c32902Edj.A01;
        } else {
            C32901Edi c32901Edi = (C32901Edi) this;
            C14360o3.A0B(c32071E6x, 2);
            Iterator it = c32901Edi.A01.keySet().iterator();
            while (it.hasNext()) {
                ((C2DS) c32901Edi.A00.A04.invoke(userSession)).A7C(JRE.A01((C3o9) it.next()));
            }
            c32901Edi.A02.invoke();
            return;
        }
        if (interfaceC37158GYv != null) {
            interfaceC37158GYv.DTE();
        }
    }
}
