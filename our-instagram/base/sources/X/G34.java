package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G34 implements InterfaceC37156GYt {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Context A02;
    public final E70 A03;
    public final boolean A04;

    public G34(Context context, FragmentActivity fragmentActivity, UserSession userSession, E70 e70, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = e70;
        this.A04 = z;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        boolean z = this.A04;
        Context context = this.A02;
        return AbstractC166987dD.A1J(new MUG(13, new C31749Dx2(AbstractC166997dE.A0p(context, 2131963705), this, 0), new C31749Dx2(AbstractC166997dE.A0p(context, 2131963889), this, 0), z));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A03;
        if (e70.A0v && E70.A04(e70)) {
            return true;
        }
        return false;
    }
}
