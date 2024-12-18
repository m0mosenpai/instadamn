package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIN implements C7K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public GIN(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = str;
    }

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
        C6FQ c6fq;
        Object obj;
        if (this.A00 != 0) {
            c6fq = (C6FQ) this.A01;
            obj = this.A02;
        } else {
            c6fq = (C6FQ) this.A02;
            obj = this.A03;
        }
        AbstractC31171DnF.A1K(c6fq, (InterfaceC103384lE) obj);
    }

    @Override // X.C7K9
    public final void onSuccess(User user) {
        if (this.A00 != 0) {
            UserSession userSession = (UserSession) this.A04;
            C6FQ c6fq = (C6FQ) this.A01;
            FragmentActivity A04 = C6BQ.A04(c6fq);
            EnumC33371Ep4 enumC33371Ep4 = EnumC33371Ep4.A07;
            AbstractC35261Fgv.A05(A04, c6fq, (InterfaceC103384lE) this.A03, (InterfaceC103384lE) this.A02, userSession, AbstractC70200WGp.A06(C6BQ.A09(c6fq)), user, enumC33371Ep4, this.A05);
            return;
        }
        C14360o3.A0B(user, 0);
        UserSession userSession2 = (UserSession) this.A04;
        C6FQ c6fq2 = (C6FQ) this.A02;
        FragmentActivity A042 = C6BQ.A04(c6fq2);
        String str = this.A05;
        AbstractC35261Fgv.A06(A042, userSession2, AbstractC70200WGp.A06(C6BQ.A09(c6fq2)), user, (GIX) this.A01, str);
    }
}
