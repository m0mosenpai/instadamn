package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GGV implements GYK {
    public final AbstractC59962oe A00;
    public final InterfaceC11380iw A01;

    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        AbstractC59962oe abstractC59962oe = this.A00;
        new C35272Fh7(abstractC59962oe, fragmentActivity, abstractC59962oe.getParentFragmentManager(), AbstractC018607g.A00(fragmentActivity), this.A01, userSession).A0C(EnumC33353Eom.A02);
    }

    public GGV(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = abstractC59962oe;
        this.A01 = interfaceC11380iw;
    }
}
