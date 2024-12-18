package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LlH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48967LlH implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C162777Qo A03;
        C160787Im c160787Im = (C160787Im) c7vc;
        C129535tI A04 = C158727Ai.A04(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
        boolean z2 = A04.A04 instanceof C158807As;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        if (z2) {
            A03 = C7QZ.A04(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
        } else {
            A03 = C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
        }
        return new C76J(A03, A04, AbstractC43594JPz.A0u(c160787Im.A0e, C7Q1.A00(userSession, z) ? 1 : 0));
    }
}
