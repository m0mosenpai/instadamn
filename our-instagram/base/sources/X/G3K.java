package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3K implements InterfaceC37156GYt {
    public static final C34653FOm A05 = new Object();
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final E70 A04;

    public G3K(Context context, FragmentActivity fragmentActivity, UserSession userSession, E70 e70, String str) {
        C14360o3.A0B(userSession, 4);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A04 = e70;
        this.A02 = userSession;
        this.A03 = str;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        int i;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        GHY ghy = new GHY(fragmentActivity, new ViewOnClickListenerC35680FpF(this, 31), context.getString(2131951995));
        ghy.A03 = R.drawable.instagram_info_pano_outline_24;
        ArrayList A1N = AbstractC16960so.A1N(ghy);
        E70 e70 = this.A04;
        UserSession userSession = this.A02;
        if (!E70.A04(e70) && (i = e70.A09) != 1012 && i != 1014 && !C32107E9f.A00(e70).CQw() && e70.A0M == null && E70.A00(e70) == 1 && C32107E9f.A00(e70).A2O() && C18U.A06(C06090Tz.A05, userSession, 36316392324796776L)) {
            A1N.add(C35246Fgf.A00(context, 2131959727));
        }
        return A1N;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return A05.A00(this.A02, this.A04, true);
    }
}
