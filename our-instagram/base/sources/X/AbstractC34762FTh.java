package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FTh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34762FTh {
    public static final String A01(Resources resources, List list) {
        C14360o3.A0B(list, 0);
        try {
            Object A0O = AbstractC001800i.A0O(list, 0);
            Object A0O2 = AbstractC001800i.A0O(list, 1);
            if (A0O != null && A0O2 != null) {
                String string = resources.getString(2131963097, A0O, A0O2);
                C14360o3.A07(string);
                return string;
            }
            Object A0J = AbstractC001800i.A0J(list);
            if (A0J == null) {
                A0J = AbstractC166997dE.A0q(resources, 2131963090);
            }
            String string2 = resources.getString(2131963102, A0J);
            C14360o3.A07(string2);
            return string2;
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public static final C5SW A00(Activity activity, View view, UserSession userSession, EnumC58132lV enumC58132lV, String str) {
        C5SU A0Q = AbstractC31178DnM.A0Q(activity, view, str);
        A0Q.A05 = enumC58132lV;
        A0Q.A07(C5SV.A0A);
        A0Q.A08(C5SV.A09);
        return EfP.A00(A0Q, userSession, 0);
    }
}
