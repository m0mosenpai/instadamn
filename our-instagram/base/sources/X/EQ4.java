package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EQ4 extends C2US {
    public C34524FJk A00;
    public final EQf A01;
    public final EQV A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.EQV, X.2y0] */
    public EQ4(UserSession userSession) {
        super(false);
        ?? obj = new Object();
        this.A02 = obj;
        EQf eQf = new EQf(userSession);
        this.A01 = eQf;
        init(obj, eQf);
    }

    public final void A00(C34524FJk c34524FJk) {
        this.A00 = c34524FJk;
        clear();
        C34524FJk c34524FJk2 = this.A00;
        if (c34524FJk2 != null) {
            Iterator A0i = AbstractC31177DnL.A0i(c34524FJk2.A01);
            while (A0i.hasNext()) {
                addModel(A0i.next(), this.A02);
            }
            addModel(c34524FJk2.A00, this.A01);
        }
        notifyDataSetChanged();
    }
}
