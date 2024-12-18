package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3C implements InterfaceC37156GYt {
    public final FragmentActivity A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C32056E6i A03;
    public final Context A04;
    public final Capabilities A05;
    public final boolean A06;

    public G3C(Context context, FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, E70 e70, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A04 = context;
        this.A02 = userSession;
        this.A05 = capabilities;
        this.A00 = fragmentActivity;
        this.A06 = z;
        this.A03 = C35252Fgl.A01(userSession, e70);
        this.A01 = AbstractC31176DnK.A0O(userSession, "MemberAddModeSection");
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        int i;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (this.A06) {
            C31335Dq0.A03(A1E, 2131963327);
        }
        Context context = this.A04;
        String A0p = AbstractC166997dE.A0p(context, 2131958679);
        int A05 = AbstractC25227BEk.A05(this.A03.A05, 0);
        if (A05 != 2 && A05 != 0) {
            if (A05 == 1) {
                i = 2131958678;
            } else {
                throw B4Z.A00();
            }
        } else {
            i = 2131958677;
        }
        String string = context.getString(i);
        A1E.add(new C54737OFo(new ViewOnClickListenerC35680FpF(this, 30), null, null, null, EnumC53237Nga.A04, null, null, null, null, null, null, null, A0p, string, null, true, true));
        return A1E;
    }
}
