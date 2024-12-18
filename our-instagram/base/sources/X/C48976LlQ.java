package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LlQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48976LlQ implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = A0Y.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Object obj = c83403nh.A1T;
        if (!(obj instanceof C46852Knl)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("message.content required to be DirectVotingShare but is");
            throw AbstractC43594JPz.A0n(AbstractC43593JPy.A0o(obj), A1C);
        }
        return new K0X(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), new KTG(AbstractC43592JPx.A0d(context, userSession, anonymousClass988, A0Y, c83403nh), AbstractC43594JPz.A0Y(userSession, anonymousClass988, A0Y, c7im, c83403nh)), A0v);
    }
}
