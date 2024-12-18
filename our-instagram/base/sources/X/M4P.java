package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes8.dex */
public final class M4P implements Runnable {
    public final /* synthetic */ C48525LdN A00;
    public final /* synthetic */ String A01;

    public M4P(C48525LdN c48525LdN, String str) {
        this.A00 = c48525LdN;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        C48525LdN c48525LdN = this.A00;
        C116155Nu A00 = C48525LdN.A00(c48525LdN, this.A01);
        if (A00 != null) {
            String str3 = A00.A0j;
            String str4 = A00.A0r;
            String str5 = A00.A1I;
            UserSession userSession = c48525LdN.A04;
            List A03 = AbstractC03270Dk.A03(userSession);
            String str6 = A00.A12;
            if (A03.isEmpty()) {
                if (str5 == null) {
                    C0w9.A03("StellaMessageNotificationHandler", "Null title on direct message notification");
                    return;
                }
            } else if (!AbstractC31171DnF.A1W(userSession, str3) || (str = A00.A1I) == null || AbstractC001900j.A08(str, "] ", 0, false) == -1) {
                return;
            } else {
                str5 = AbstractC43592JPx.A0z(str, AbstractC001900j.A08(str, "] ", 0, false) + 2);
            }
            C55053Oa4 c55053Oa4 = C55053Oa4.A01;
            Context context = c48525LdN.A01;
            String str7 = A00.A1G;
            if (str7 == null) {
                str7 = A00.A1F;
            }
            String str8 = A00.A1E;
            ImageUrl imageUrl = A00.A0D;
            if (imageUrl != null) {
                str2 = imageUrl.getUrl();
            } else {
                str2 = null;
            }
            c55053Oa4.A01(context, c48525LdN.A02, null, str3, str5, str4, str4, str7, str8, null, null, null, str6, null, str2, null, null, false);
        }
    }
}
