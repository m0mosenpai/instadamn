package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

/* loaded from: classes6.dex */
public final class G1e implements C7E7 {
    public MessagingUser A00;
    public final int A01;
    public final Activity A02;
    public final UserSession A03;
    public final GXP A04;
    public final C7YI A05;
    public final String A06;
    public final List A07;
    public final int A08;
    public final Capabilities A09;

    public G1e(Activity activity, UserSession userSession, Capabilities capabilities, GXP gxp, C7YI c7yi, String str, List list, int i, int i2) {
        AbstractC167007dF.A1J(userSession, 1, list);
        this.A03 = userSession;
        this.A01 = i;
        this.A02 = activity;
        this.A09 = capabilities;
        this.A06 = str;
        this.A05 = c7yi;
        this.A08 = i2;
        this.A04 = gxp;
        this.A07 = list;
    }

    @Override // X.C7E7
    public final void DDK(String str, String str2, String str3) {
        if (str != null && str3 != null) {
            UserSession userSession = this.A03;
            String str4 = this.A06;
            int i = this.A08;
            Bundle A0C = AbstractC31177DnL.A0C(userSession);
            AbstractC03240Dh.A00(A0C, userSession);
            A0C.putString(AbstractC111324zv.A00(387), str);
            A0C.putString(AbstractC111324zv.A00(388), str3);
            A0C.putString(AbstractC43591JPw.A00(76), str4);
            A0C.putString(AbstractC111324zv.A00(389), str2);
            A0C.putInt(AbstractC111324zv.A00(18), i);
            A0C.putBoolean(AbstractC111324zv.A00(153), true);
            KDH kdh = new KDH();
            kdh.setArguments(A0C);
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
            A0X.A0T = kdh;
            A0X.A03 = 0.6f;
            Activity activity = this.A02;
            A0X.A06 = AbstractC53242c7.A0F(new ContextThemeWrapper(activity, i), R.attr.igds_color_elevated_background);
            C189478aR A02 = GH5.A00(A0X, this, 14).A02(activity, kdh);
            if (A02 != null) {
                kdh.A01 = new C36434G5j(this, A02);
            }
        }
    }
}
