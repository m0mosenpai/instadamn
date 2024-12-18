package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EPw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32421EPw extends C2US {
    public final ERZ A00;
    public final List A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32421EPw(UserSession userSession, InterfaceC151446rm interfaceC151446rm, User user, List list, List list2) {
        super(false);
        AbstractC167017dG.A1P(list, list2);
        C14360o3.A0B(userSession, 5);
        this.A01 = list;
        this.A02 = list2;
        ERZ erz = new ERZ(userSession, interfaceC151446rm, user);
        this.A00 = erz;
        AbstractC31173DnH.A1R(this, erz);
    }
}
