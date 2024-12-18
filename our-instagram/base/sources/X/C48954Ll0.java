package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.Ll0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48954Ll0 implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        C83403nh c83403nh = A0Y.A0e;
        C14360o3.A07(c83403nh);
        Object obj = c83403nh.A1T;
        if (!(obj instanceof DirectAnimatedMedia)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("message.content required to be DirectAnimatedMedia but is ");
            throw AbstractC43594JPz.A0n(AbstractC43593JPy.A0o(obj), A1C);
        }
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Object obj2 = c83403nh.A1T;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.direct.gifs.DirectAnimatedMedia");
        return new K08(AbstractC46793Kmo.A00(context, userSession, anonymousClass988, A0Y, (DirectAnimatedMedia) obj2), C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), A0k);
    }
}
