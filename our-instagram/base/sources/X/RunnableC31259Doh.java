package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Doh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31259Doh implements Runnable {
    public final /* synthetic */ C31255Dod A00;

    public RunnableC31259Doh(C31255Dod c31255Dod) {
        this.A00 = c31255Dod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31255Dod c31255Dod = this.A00;
        UserSession userSession = c31255Dod.A03;
        C31514Dsy.A04(userSession, "direct_inbox", "native");
        Fragment fragment = c31255Dod.A02;
        FragmentActivity requireActivity = fragment.requireActivity();
        Context requireContext = fragment.requireContext();
        String str = userSession.token;
        C14360o3.A0B(str, 0);
        Bundle A09 = AbstractC31176DnK.A09(str);
        AbstractC31171DnF.A13(A09, "direct_inbox");
        A09.putBoolean(AbstractC111324zv.A00(268), true);
        A09.putParcelable(AbstractC111324zv.A00(444), AbstractC34770FTt.A00(requireContext, "all", "direct_inbox_account_switch", null, 0));
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0V = new C64506TGu(c31255Dod, 3);
        C189478aR A00 = A0y.A00();
        ENI eni = new ENI();
        eni.setArguments(A09);
        A00.A02(requireActivity, eni);
        C31514Dsy.A06(userSession);
    }
}
