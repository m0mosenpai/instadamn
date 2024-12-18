package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Eyh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33941Eyh {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        User user = ((C34396FEm) c6fw.A03(0)).A00;
        if (user == null) {
            AbstractC25241Le.A02(AbstractC111324zv.A00(985), "Null user in user alien object");
            return null;
        }
        Object obj = c6fw.A00.get(1);
        obj.getClass();
        HashMap A0H = C6BQ.A0H((Map) obj);
        String str = (String) A0H.get("destination_url");
        String A0h = AbstractC31171DnF.A0h("show_autoconf_consent", A0H);
        if (A0h == null) {
            A0h = "-1";
        }
        int parseInt = Integer.parseInt(A0h);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        UserSession A02 = AbstractC31525Dt9.A02(A04, A08, (C07270a1) C6BQ.A0B(c6fq), user, null, false);
        android.net.Uri A03 = AbstractC08820cl.A03(AnonymousClass001.A0R("instagram://", str));
        if (parseInt == 2 || parseInt == 3 || parseInt == 4) {
            String str2 = (String) A0H.get("register_start_message");
            String str3 = (String) A0H.get("nonce_code");
            if (str2 != null && str3 != null) {
                C140966Yy A0N = AbstractC31177DnL.A0N(A04, A02);
                String A00 = AbstractC43591JPw.A00(297);
                Bundle A05 = AbstractC31178DnM.A05(A02);
                A05.putString("REGISTER_START_MESSAGE", str2);
                A05.putString("NONCE", str3);
                A05.putString("SMS_FLOW_TYPE", A00);
                A05.putInt("CONSENT_MODE", parseInt);
                AbstractC31176DnK.A1A(A05, new EJC(), A0N);
                return null;
            }
        }
        AbstractC31525Dt9.A05(A04, A03, A08, A02);
        return null;
    }
}
