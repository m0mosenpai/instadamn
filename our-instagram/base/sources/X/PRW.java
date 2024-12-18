package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PRW implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C52011MzC A01;

    public PRW(FragmentActivity fragmentActivity, C52011MzC c52011MzC) {
        this.A01 = c52011MzC;
        this.A00 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52011MzC c52011MzC = this.A01;
        Context context = c52011MzC.A00;
        UserSession userSession = c52011MzC.A01;
        AbstractC35257Fgr.A03(context, this.A00, AbstractC31171DnF.A0D("DevXAgentAppProxy"), userSession, EnumC33346Eof.A05, null);
    }
}
