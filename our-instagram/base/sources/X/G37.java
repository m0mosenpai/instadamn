package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G37 implements InterfaceC37156GYt {
    public final Context A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final E70 A04;
    public final Capabilities A05;

    public G37(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, E70 e70) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = e70;
        this.A05 = capabilities;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        String str;
        String str2;
        E70 e70 = this.A04;
        boolean z = e70.A0j;
        ArrayList A1E = AbstractC166987dD.A1E();
        C31335Dq0.A03(A1E, 2131963327);
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131963328);
        UserSession userSession = this.A03;
        if (!AbstractC35058FcV.A02(userSession, e70)) {
            int i = 2131963338;
            if (z) {
                i = 2131963339;
            }
            str = context.getString(i);
        } else {
            str = null;
        }
        if (AbstractC35058FcV.A02(userSession, e70)) {
            if (z) {
                str2 = e70.A0O;
            } else {
                str2 = context.getString(2131963338);
            }
        } else {
            str2 = null;
        }
        A1E.add(new C54737OFo(new ViewOnClickListenerC35680FpF(this, 36), null, null, null, EnumC53237Nga.A09, null, null, null, null, null, null, null, A0p, str, str2, true, true));
        return A1E;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        C34654FOn c34654FOn = AbstractC36357G2j.A00;
        UserSession userSession = this.A03;
        E70 e70 = this.A04;
        if (c34654FOn.A00(userSession, this.A05, e70) && AbstractC35058FcV.A01(userSession, e70)) {
            return true;
        }
        return false;
    }
}
