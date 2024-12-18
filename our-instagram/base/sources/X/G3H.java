package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3H implements InterfaceC37156GYt {
    public final Context A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final E70 A04;
    public final boolean A05;
    public final C41761wQ A06;
    public final Capabilities A07;

    public G3H(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C41761wQ c41761wQ, UserSession userSession, Capabilities capabilities, E70 e70, boolean z) {
        AbstractC167007dF.A1J(userSession, 3, c41761wQ);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = e70;
        this.A07 = capabilities;
        this.A05 = z;
        this.A02 = interfaceC11380iw;
        this.A06 = c41761wQ;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        GHY ghy = new GHY(this.A00, new ViewOnClickListenerC35680FpF(this, 34), 2131972368, AbstractC53242c7.A03(this.A01));
        ghy.A0B = true;
        ghy.A03 = R.drawable.instagram_report_pano_outline_24;
        return AbstractC166987dD.A1J(ghy);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return F31.A00(this.A03, this.A07, this.A04);
    }
}
