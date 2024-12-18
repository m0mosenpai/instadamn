package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIK implements C7K9 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public GIK(UserSession userSession, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = userSession;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Fvu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Fvv] */
    @Override // X.C7K9
    public final void onSuccess(User user) {
        C25671My c25671My;
        InterfaceC41141vN interfaceC41141vN;
        int i = this.A00;
        C14360o3.A0B(user, 0);
        if (i != 0) {
            int i2 = this.A01;
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
            C14360o3.A0B(abstractC12990ll, 2);
            C25671My A00 = AbstractC25651Mw.A00(abstractC12990ll);
            ?? obj = new Object();
            obj.A01 = user;
            obj.A00 = i2;
            interfaceC41141vN = obj;
            c25671My = A00;
        } else {
            int i3 = this.A01;
            AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A02;
            C14360o3.A0B(abstractC12990ll2, 2);
            C25671My A002 = AbstractC25651Mw.A00(abstractC12990ll2);
            ?? obj2 = new Object();
            obj2.A01 = user;
            obj2.A00 = i3;
            interfaceC41141vN = obj2;
            c25671My = A002;
        }
        c25671My.E4s(interfaceC41141vN);
    }

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
    }
}
