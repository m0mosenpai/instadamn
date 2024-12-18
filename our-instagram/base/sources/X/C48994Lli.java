package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lli, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48994Lli implements InterfaceC162527Pp {
    public final C98K A00;

    @Override // X.InterfaceC162527Pp
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final K0L AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a, boolean z) {
        AnonymousClass781 A06 = C1580677q.A06(context, userSession, this.A00, anonymousClass988, c160787Im, c7im, c160787Im.A0U, c160787Im.A0V);
        String A0u = AbstractC43594JPz.A0u(c160787Im.A0e, C7Q1.A00(userSession, z) ? 1 : 0);
        return new K0L(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), new C45893KSw(A06, A06.CCL()), A0u);
    }

    public C48994Lli(C98K c98k) {
        this.A00 = c98k;
    }
}
