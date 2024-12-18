package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GGW implements GYK {
    public final AbstractC59962oe A00;
    public final InterfaceC11380iw A01;

    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        AbstractC59962oe abstractC59962oe = this.A00;
        C35272Fh7 c35272Fh7 = new C35272Fh7(abstractC59962oe, fragmentActivity, abstractC59962oe.getParentFragmentManager(), AbstractC018607g.A00(fragmentActivity), this.A01, userSession);
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = EnumC33353Eom.A05;
        if (C1AD.A06(C06090Tz.A05, 18308917301882009L)) {
            AnonymousClass253 A00 = AnonymousClass252.A00(userSession);
            CallerContext.A01("NativeScreenNavigatorFactory");
            A00.A00(new C36778GJb(userSession, c35272Fh7, A1F));
            return;
        }
        c35272Fh7.A0C((EnumC33353Eom) A1F.A00);
    }

    public GGW(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = abstractC59962oe;
        this.A01 = interfaceC11380iw;
    }
}
