package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Lqt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49299Lqt implements C7Ef {
    public final UserSession A00;
    public final C7FF A01;
    public final C40121td A02;
    public final InterfaceC16660sJ A03;
    public final Context A04;

    @Override // X.C7Ef
    public final void AGg(AbstractC46459KhJ abstractC46459KhJ) {
        if (abstractC46459KhJ instanceof C45975KWl) {
            this.A02.A0K(((C45975KWl) abstractC46459KhJ).A01.A35, null, false, true, true);
        }
    }

    @Override // X.C7Ef
    public final void FDE(AbstractC46459KhJ abstractC46459KhJ, DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 1);
        if (abstractC46459KhJ instanceof C45975KWl) {
            C45975KWl c45975KWl = (C45975KWl) abstractC46459KhJ;
            Medium medium = c45975KWl.A00;
            C47Z c47z = c45975KWl.A01;
            ((C7FG) this.A03.invoke(new C47663L2w(medium, this, directThreadKey, c47z))).A05(null, null, null, null, AbstractC166987dD.A1J(new C45029JwK(medium, c47z)), false, c45975KWl.A02);
        }
    }

    public C49299Lqt(Context context, UserSession userSession, C7FF c7ff, C40121td c40121td, InterfaceC16660sJ interfaceC16660sJ) {
        JQ0.A1O(context, userSession, c40121td, c7ff, interfaceC16660sJ);
        this.A04 = context;
        this.A00 = userSession;
        this.A02 = c40121td;
        this.A01 = c7ff;
        this.A03 = interfaceC16660sJ;
    }
}
