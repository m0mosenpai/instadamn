package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* renamed from: X.G2s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36366G2s implements InterfaceC37156GYt {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final E70 A02;
    public final Context A03;

    public C36366G2s(Context context, FragmentActivity fragmentActivity, UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = e70;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A03;
        C31335Dq0 A01 = C31335Dq0.A01(context, 2131959031);
        if (!(!C18U.A06(C06090Tz.A06, this.A01, 36318363714066546L))) {
            A01 = null;
        }
        Object[] objArr = {A01, GHY.A00(context, new ViewOnClickListenerC35680FpF(this, 26), 2131959091)};
        C14360o3.A0B(objArr, 0);
        return AbstractC009903n.A0I(objArr);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A02;
        InterfaceC83733oI interfaceC83733oI = e70.A0L;
        C14360o3.A0B(interfaceC83733oI, 0);
        if (!(interfaceC83733oI instanceof MsysThreadId) && !e70.A0m) {
            return false;
        }
        return true;
    }
}
