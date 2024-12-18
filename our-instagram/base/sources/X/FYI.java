package X;

import android.content.Context;
import android.content.Intent;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FYI {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Fragment fragment, EnumC33510Erj enumC33510Erj, EnumC33500ErZ enumC33500ErZ, UserSession userSession, Integer num, String str) {
        AbstractC167017dG.A1N(fragment, userSession);
        Context requireContext = fragment.requireContext();
        C33119EjN c33119EjN = new C33119EjN(requireContext, fragment.mFragmentManager, enumC33510Erj, enumC33500ErZ, userSession, num, str, C54P.A01(requireContext, userSession));
        C1ON A00 = AbstractC34303FAx.A00(enumC33510Erj, userSession, num);
        A00.A00 = c33119EjN;
        ((C1GL) fragment).schedule(A00);
    }

    public static final void A00(Context context, Integer num, String str, String str2, String str3) {
        if (num == C05F.A0u) {
            if (str3 == null) {
                str3 = "";
            }
            AbstractC35101FdC.A02(context, str3, str2);
            return;
        }
        if (num == C05F.A0j) {
            Intent A08 = AbstractC31177DnL.A08("android.intent.action.SENDTO");
            LruCache lruCache = AbstractC08820cl.A00;
            A08.setData(android.net.Uri.parse("mailto:"));
            A08.putExtra("android.intent.extra.SUBJECT", str);
            A08.putExtra("android.intent.extra.TEXT", str2);
            C12260kU.A0E(context, A08);
            return;
        }
        Intent A04 = AbstractC31171DnF.A04();
        A04.setAction("android.intent.action.SEND");
        A04.putExtra("android.intent.extra.SUBJECT", str);
        A04.putExtra("android.intent.extra.TEXT", str2);
        A04.setType("text/plain");
        if (num == C05F.A1F) {
            A04.setPackage("com.whatsapp");
        }
        C12260kU.A00(context, Intent.createChooser(A04, null));
    }
}
