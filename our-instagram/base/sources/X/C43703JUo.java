package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.JUo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43703JUo implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = A0Y.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C43705JUq(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), AbstractC43698JUi.A00(context, userSession, AbstractC43594JPz.A0Y(userSession, anonymousClass988, A0Y, c7im, c83403nh), anonymousClass988, A0Y), A0v);
    }
}
