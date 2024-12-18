package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2N8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2N8 {
    public final List A00;

    public C2N8(C2ME c2me) {
        C14360o3.A0B(c2me, 1);
        C2MJ c2mj = c2me.A01;
        C14360o3.A0B(c2mj, 1);
        C2NB c2nb = new C2NB(c2mj);
        C2MO c2mo = c2me.A00;
        C14360o3.A0B(c2mo, 1);
        C2NB c2nb2 = new C2NB(c2mo);
        C2MJ c2mj2 = c2me.A03;
        C14360o3.A0B(c2mj2, 1);
        C2NB c2nb3 = new C2NB(c2mj2);
        C2MJ c2mj3 = c2me.A02;
        C14360o3.A0B(c2mj3, 1);
        this.A00 = AbstractC16960so.A1Q(c2nb, c2nb2, c2nb3, new C2NB(c2mj3), new C2NB(c2mj3), new C2NB(c2mj3), new C2NB(c2mj3));
    }

    public final boolean A00(C48412Ki c48412Ki) {
        List list = this.A00;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C2NB c2nb = (C2NB) obj;
            if (c2nb.A01(c48412Ki) && c2nb.A02(c2nb.A00.A00())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            C48442Kl.A00();
            AbstractC001800i.A0P(", ", "", "", arrayList, C25089B8l.A00);
        }
        return arrayList.isEmpty();
    }
}
