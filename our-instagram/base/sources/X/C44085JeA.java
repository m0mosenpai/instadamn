package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JeA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44085JeA extends C0YY implements InterfaceC16620sF {
    public static final C44085JeA A00 = new C44085JeA();

    public C44085JeA() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UserSession userSession = (UserSession) obj;
        String str = (String) obj2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        return ((C2DU) AbstractC28761aE.A00(userSession)).A0N(str);
    }
}
