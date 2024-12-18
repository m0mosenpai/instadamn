package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54582fG extends C1P1 {
    public final UserSession A00;

    public C54582fG(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1vw, java.lang.Object] */
    public final void A00(C71483Im c71483Im) {
        Map map;
        int A03 = C0f9.A03(1542579803);
        C14360o3.A0B(c71483Im, 0);
        Iterator it = new ArrayList(C0BQ.A00(this.A00).BOe()).iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            C89463ym c89463ym = (C89463ym) c71483Im.A00.get(user.getId());
            if (c89463ym == null) {
                user.A0a(0);
                map = AbstractC06930Yk.A0E();
            } else {
                user.A0a(c89463ym.A00);
                map = c89463ym.A02;
            }
            user.A05 = map;
        }
        C41451vu.A01.E4s(new Object());
        C0f9.A0A(1193729816, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1302591628);
        A00((C71483Im) obj);
        C0f9.A0A(-2068763176, A03);
    }
}
