package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ll6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48959Ll6 implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C162777Qo A04;
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C83403nh c83403nh = A0Y.A0e;
        boolean z2 = !C9C9.A00(c83403nh.A1T, 6);
        C18A A00 = AnonymousClass189.A00(userSession);
        if (z2) {
            C14360o3.A0B(A00, 2);
            A04 = C7QZ.A00(context, null, userSession, anonymousClass988, null, A0Y, c7im, A00, true, false);
        } else {
            A04 = C7QZ.A04(context, userSession, anonymousClass988, A0Y, c7im, A00);
        }
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new K0C(A04, JVG.A00(context, userSession, anonymousClass988, A0Y, c7im), A0k);
    }
}
