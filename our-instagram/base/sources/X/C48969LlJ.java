package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LlJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48969LlJ implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        C83403nh c83403nh = A0Y.A0e;
        C38321qM A0T = c83403nh.A0T();
        if (A0T != null) {
            String A0k = JQ0.A0k(userSession, c83403nh, z);
            C14360o3.A0A(A0k);
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new K0N(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), AbstractC46798Kmt.A00(context, userSession, anonymousClass988, A0Y, c7im, A0T), A0k);
        }
        throw AbstractC166987dD.A12("Error, DirectMessage object has no media share for message rendering");
    }
}
