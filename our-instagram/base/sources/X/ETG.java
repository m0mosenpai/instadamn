package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ETG extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC110564yT A01;
    public final /* synthetic */ User A02;

    public ETG(UserSession userSession, ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT, User user) {
        this.A01 = viewOnAttachStateChangeListenerC110564yT;
        this.A02 = user;
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -684262836);
        super.onFail(abstractC115105If);
        ViewOnAttachStateChangeListenerC110564yT.A03(this.A00, this.A01, this.A02);
        C0f9.A0A(-1512029069, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-444467012);
        int A0N = AbstractC167017dG.A0N(obj, 918476378);
        super.onSuccess(obj);
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = this.A01;
        String A00 = AbstractC76433bn.A00(viewOnAttachStateChangeListenerC110564yT.A0D);
        User user = this.A02;
        if (!C14360o3.A0K(A00, AbstractC76433bn.A00(user))) {
            i = 470381604;
        } else {
            ViewOnAttachStateChangeListenerC110564yT.A03(this.A00, viewOnAttachStateChangeListenerC110564yT, user);
            i = -1033427885;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(1531911615, A03);
    }
}
