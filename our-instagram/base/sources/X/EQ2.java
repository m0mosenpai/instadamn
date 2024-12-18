package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQ2 extends C2US {
    public final InterfaceC11380iw A00;
    public final ESE A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQ2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        super(false);
        C14360o3.A0B(userSession, 1);
        this.A00 = interfaceC11380iw;
        ESE ese = new ESE(interfaceC11380iw, userSession, interfaceC16660sJ, interfaceC16660sJ2);
        this.A01 = ese;
        AbstractC31173DnH.A1R(this, ese);
    }

    public final void A00(List list) {
        clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addModel(it.next(), this.A01);
        }
        notifyDataSetChanged();
    }
}
