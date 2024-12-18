package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3E implements InterfaceC37156GYt {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final E70 A05;
    public final Context A06;

    public G3E(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, Capabilities capabilities, E70 e70) {
        C14360o3.A0B(userSession, 3);
        this.A06 = context;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A05 = e70;
        this.A04 = capabilities;
        this.A01 = interfaceC11380iw;
        this.A02 = c18920wW;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        GHY ghy = new GHY(this.A06, new ViewOnClickListenerC35680FpF(this, 33), 2131972368, AbstractC53242c7.A03(this.A00));
        ghy.A0B = true;
        ghy.A03 = R.drawable.instagram_report_pano_outline_24;
        return AbstractC166987dD.A1J(ghy);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A05;
        if (e70.A0v && E70.A04(e70) && this.A04.A00(EnumC2054697t.A04)) {
            return true;
        }
        return false;
    }
}
