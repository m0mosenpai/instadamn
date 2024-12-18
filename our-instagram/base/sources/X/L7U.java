package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class L7U {
    public final C66362zD A00;
    public final UserSession A01;
    public final LAG A02;
    public final InterfaceC159877Ez A03;

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0E.A00(new K01(AbstractC43592JPx.A0Y(it), EnumC150226pU.A09, MK5.A00));
        }
        this.A00.A05(A0E);
    }

    public L7U(Context context, UserSession userSession, LAG lag, InterfaceC159877Ez interfaceC159877Ez) {
        this.A01 = userSession;
        this.A03 = interfaceC159877Ez;
        this.A02 = lag;
        C66392zG A00 = C66362zD.A00(context);
        UserSession userSession2 = this.A01;
        InterfaceC159877Ez interfaceC159877Ez2 = this.A03;
        A00.A01(new KJT(userSession2, interfaceC159877Ez2));
        A00.A01(new KJU(userSession2, interfaceC159877Ez2));
        this.A00 = AbstractC31173DnH.A0R(A00, new KIM(userSession2, this.A02, interfaceC159877Ez2));
    }
}
