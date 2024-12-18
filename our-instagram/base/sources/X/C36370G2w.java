package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36370G2w implements InterfaceC37156GYt {
    public final C34424FFo A00;
    public final Context A01;
    public final UserSession A02;
    public final E70 A03;
    public final boolean A04;

    public C36370G2w(Context context, UserSession userSession, C34424FFo c34424FFo, E70 e70, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = e70;
        this.A04 = z;
        this.A00 = c34424FFo;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        Context context = this.A01;
        String A0p = AbstractC166997dE.A0p(context, 2131959453);
        return AbstractC16960so.A1Q(C31335Dq0.A01(context, 2131959448), new C54737OFo(null, null, null, new G9H(this, 18), EnumC53237Nga.A08, null, null, null, null, null, null, null, A0p, null, null, this.A04, true), C35246Fgf.A00(context, 2131959447), new C35119FeM(true));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return C98Q.A00(this.A02).A00(this.A03.A0L, 45);
    }
}
