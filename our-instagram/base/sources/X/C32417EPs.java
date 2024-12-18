package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32417EPs extends C2US {
    public final ERJ A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32417EPs(UserSession userSession, C32279EJq c32279EJq, List list) {
        super(false);
        AbstractC167017dG.A1R(list, userSession);
        this.A01 = userSession;
        ERJ erj = new ERJ(userSession, c32279EJq);
        this.A00 = erj;
        AbstractC31173DnH.A1R(this, erj);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addModel(it.next(), this.A00);
        }
    }
}
