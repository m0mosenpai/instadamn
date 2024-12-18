package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Llg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48992Llg implements InterfaceC162527Pp {
    public final C98K A00;

    @Override // X.InterfaceC162527Pp
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final K07 AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a, boolean z) {
        AnonymousClass544 anonymousClass544;
        C51761Mtk c51761Mtk;
        String str;
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, c18a, c7im, c160787Im, anonymousClass988);
        AnonymousClass781 A06 = C1580677q.A06(context, userSession, this.A00, anonymousClass988, c160787Im, c7im, c160787Im.A0U, c160787Im.A0V);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = c160787Im.A0e;
        String A0u = AbstractC43594JPz.A0u(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0u);
        synchronized (c83403nh) {
            anonymousClass544 = c83403nh.A0V;
        }
        if (anonymousClass544 != null && (str = anonymousClass544.A01) != null) {
            c51761Mtk = new C51761Mtk(c83403nh.A0G(), AbstractC25225BEi.A0t(str));
        } else {
            c51761Mtk = null;
        }
        return new K07(new C45894KSx(c51761Mtk, A06), C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A0u);
    }

    public C48992Llg(C98K c98k) {
        this.A00 = c98k;
    }
}
