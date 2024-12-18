package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32422EPx extends C2US {
    public final C32448ERa A00;
    public final UserSession A01;
    public final InterfaceC16620sF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32422EPx(UserSession userSession, List list, InterfaceC16620sF interfaceC16620sF) {
        super(false);
        AbstractC167017dG.A1R(list, userSession);
        this.A01 = userSession;
        this.A02 = interfaceC16620sF;
        C32448ERa c32448ERa = new C32448ERa(userSession, interfaceC16620sF, list.size() <= 1);
        this.A00 = c32448ERa;
        AbstractC31173DnH.A1R(this, c32448ERa);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addModel(it.next(), this.A00);
        }
    }
}
