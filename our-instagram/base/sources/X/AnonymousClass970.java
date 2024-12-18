package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.970, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass970 {
    public final Context A00;

    public AnonymousClass970(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    public final void A00(UserSession userSession, InterfaceC37137GXy interfaceC37137GXy) {
        C14360o3.A0B(userSession, 0);
        C54702fS c54702fS = (C54702fS) AbstractC54332en.A00(userSession);
        A94 a94 = new A94(EnumC54222eY.A09, c54702fS.A00, c54702fS.A01);
        FM9 fm9 = new FM9(userSession, a94, interfaceC37137GXy, this);
        HashMap hashMap = a94.A02;
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) hashMap.get(fm9);
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C19L c19l = a94.A03;
        PZX pzx = new PZX(a94, fm9, (InterfaceC23621Ds) null, 8);
        hashMap.put(fm9, AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, pzx, c19l));
    }
}
