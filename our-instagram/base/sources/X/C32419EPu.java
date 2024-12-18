package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32419EPu extends C2US {
    public final UserSession A00;
    public final ERK A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32419EPu(UserSession userSession, User user, List list) {
        super(false);
        AbstractC167007dF.A1F(list, 3, userSession);
        this.A00 = userSession;
        ERK erk = new ERK(userSession, user);
        this.A01 = erk;
        AbstractC31173DnH.A1R(this, erk);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addModel(it.next(), this.A01);
        }
    }
}
