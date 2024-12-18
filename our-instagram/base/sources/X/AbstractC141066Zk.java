package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141066Zk extends C6ZL {
    public final C41181vS A00;

    public final List A0A() {
        C141056Zj c141056Zj = (C141056Zj) this;
        List A1R = AbstractC16960so.A1R(c141056Zj.A06, c141056Zj.A05);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A1R, 10));
        Iterator it = A1R.iterator();
        while (it.hasNext()) {
            String string = c141056Zj.A00.getResources().getString(2131962958, ((User) it.next()).getUsername());
            C14360o3.A07(string);
            arrayList.add(string);
        }
        return arrayList;
    }

    public AbstractC141066Zk(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = c41181vS;
    }
}
