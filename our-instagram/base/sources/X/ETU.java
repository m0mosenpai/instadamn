package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ETU extends C1P1 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C34649FOh A02;
    public final User A03;
    public final String A04;
    public final String A05;

    public ETU(FragmentActivity fragmentActivity, UserSession userSession, C34649FOh c34649FOh, User user, String str, String str2) {
        AbstractC167017dG.A1P(userSession, user);
        this.A01 = userSession;
        this.A03 = user;
        this.A02 = c34649FOh;
        this.A00 = fragmentActivity;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1849417822);
        C9GR.A0F(this.A00, "fail_send_confirm_email", 2131962076);
        C0f9.A0A(-1447077169, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(1041868783);
        ED3 ed3 = (ED3) obj;
        int A032 = C0f9.A03(-402880623);
        C14360o3.A0B(ed3, 0);
        UserSession userSession = this.A01;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A00.E4s(new Object());
        User user = this.A03;
        user.A0Y();
        AbstractC31172DnG.A1R(userSession, user);
        C34649FOh c34649FOh = this.A02;
        A00.E4s(new C36100Fwa(c34649FOh.A0G, c34649FOh.A0D));
        if (ed3.A03 && (str = this.A04) != null) {
            AbstractC31364DqT.A03();
            String str2 = this.A05;
            AbstractC167007dF.A1D(userSession, 0, str2);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("key_shared_email", str);
            AbstractC31173DnH.A1C(A0b, userSession);
            A0b.putString("send_source", str2);
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            abstractC59962oe.setArguments(A0b);
            AbstractC31177DnL.A16(abstractC59962oe, this.A00, userSession);
        } else {
            AbstractC167007dF.A0J().post(new RunnableC36907GOc(AbstractC31181DnP.A0C(ed3.A01, ed3.A00), this));
        }
        C0f9.A0A(924767411, A032);
        C0f9.A0A(768974159, A03);
    }
}
