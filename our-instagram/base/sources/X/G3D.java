package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3D implements InterfaceC37156GYt {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final E70 A05;
    public final C41761wQ A06;

    public G3D(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C41761wQ c41761wQ, UserSession userSession, Capabilities capabilities, E70 e70) {
        AbstractC25229BEm.A1I(userSession, 3, c41761wQ);
        this.A01 = fragmentActivity;
        this.A00 = fragment;
        this.A03 = userSession;
        this.A05 = e70;
        this.A04 = capabilities;
        this.A06 = c41761wQ;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        FragmentActivity fragmentActivity = this.A01;
        C32107E9f c32107E9f = (C32107E9f) AbstractC166987dD.A16(AbstractC31171DnF.A0n(this.A05.A0c));
        C14360o3.A0B(c32107E9f, 0);
        int i = 2131953914;
        if (c32107E9f.A00.CYY()) {
            i = 2131976058;
        }
        GHY ghy = new GHY(fragmentActivity, new ViewOnClickListenerC35680FpF(this, 32), i, AbstractC53242c7.A03(fragmentActivity));
        ghy.A0B = true;
        ghy.A03 = R.drawable.instagram_block_pano_outline_24;
        return AbstractC166987dD.A1J(ghy);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return F30.A00(this.A04, this.A05);
    }
}
