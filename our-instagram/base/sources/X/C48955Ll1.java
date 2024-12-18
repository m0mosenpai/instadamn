package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ll1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48955Ll1 implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C62519SEv c62519SEv;
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = A0Y.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        synchronized (c83403nh) {
            c62519SEv = c83403nh.A0O;
        }
        return new K0A(new C66641URf(c62519SEv, A0v), C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), A0v);
    }
}
