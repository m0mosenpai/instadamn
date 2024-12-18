package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GQE implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C33090Eip A02;
    public final /* synthetic */ String A03;

    public GQE(FragmentActivity fragmentActivity, UserSession userSession, C33090Eip c33090Eip, String str) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = c33090Eip;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        String str = this.A03;
        C33090Eip c33090Eip = this.A02;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(fragmentActivity, str, c33090Eip);
        C31812DyW c31812DyW = new C31812DyW(userSession, c33090Eip);
        ELF elf = new ELF();
        elf.A05 = c31812DyW;
        AbstractC31174DnI.A1M(AbstractC31174DnI.A0N(elf, fragmentActivity, userSession), str);
    }
}
