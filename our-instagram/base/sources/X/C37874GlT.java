package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GlT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37874GlT implements InterfaceC82483mC {
    public final InterfaceC11380iw A00;
    public final C124645kS A01;
    public final WeakReference A02;

    public C37874GlT(InterfaceC11380iw interfaceC11380iw, C124645kS c124645kS, WeakReference weakReference) {
        C14360o3.A0B(weakReference, 1);
        this.A02 = weakReference;
        this.A01 = c124645kS;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC82483mC
    public final void E11(C82543mI c82543mI, Boolean bool, String str) {
        UserSession userSession;
        Integer num;
        C82753md c82753md;
        if (!C14360o3.A0K(bool, false) && (userSession = (UserSession) this.A02.get()) != null) {
            InterfaceC82423m6 interfaceC82423m6 = c82543mI.A00;
            if ((interfaceC82423m6 instanceof C82753md) && (c82753md = (C82753md) interfaceC82423m6) != null) {
                int intValue = c82753md.A00.A2z.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        num = C05F.A01;
                    }
                } else {
                    num = C05F.A00;
                }
                C124645kS.A00(EnumC63542ub.IG_GENERIC, c82543mI, this.A00, userSession, num, str);
            }
            num = C05F.A0N;
            C124645kS.A00(EnumC63542ub.IG_GENERIC, c82543mI, this.A00, userSession, num, str);
        }
    }
}
