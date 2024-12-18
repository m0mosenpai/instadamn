package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3J implements InterfaceC37156GYt {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC018607g A02;
    public final InterfaceC11380iw A03;
    public final C18920wW A04;
    public final UserSession A05;
    public final C31539DtP A06;
    public final E70 A07;
    public final InterfaceC37213GaO A08;
    public final Capabilities A09;

    public G3J(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, Capabilities capabilities, C31539DtP c31539DtP, E70 e70, InterfaceC37213GaO interfaceC37213GaO) {
        C14360o3.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A05 = userSession;
        this.A07 = e70;
        this.A09 = capabilities;
        this.A04 = c18920wW;
        this.A02 = abstractC018607g;
        this.A08 = interfaceC37213GaO;
        this.A06 = c31539DtP;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A00;
        C32107E9f c32107E9f = (C32107E9f) AbstractC166987dD.A16(AbstractC31171DnF.A0n(this.A07.A0c));
        C14360o3.A0B(c32107E9f, 1);
        GHY ghy = new GHY(context, new ViewOnClickListenerC35680FpF(this, 35), AbstractC166997dE.A0p(context, AbstractC31178DnM.A02(c32107E9f.A00)));
        ghy.A03 = R.drawable.instagram_restrict_pano_outline_24;
        return AbstractC166987dD.A1J(ghy);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        C32107E9f c32107E9f;
        E70 e70 = this.A07;
        if (E70.A04(e70) || (c32107E9f = (C32107E9f) AbstractC001800i.A0N(AbstractC31171DnF.A0n(e70.A0c))) == null || !F32.A00(this.A05, this.A09, e70, c32107E9f)) {
            return false;
        }
        return true;
    }
}
