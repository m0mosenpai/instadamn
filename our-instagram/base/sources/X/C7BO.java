package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7BO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BO implements InterfaceC162527Pp {
    public final C98K A00;

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        String A0j;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c18a, 2);
        C14360o3.A0B(c7im, 3);
        C14360o3.A0B(c160787Im, 4);
        C14360o3.A0B(anonymousClass988, 5);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = c160787Im.A0e;
        if (!A00) {
            A0j = c83403nh.A0i();
        } else {
            A0j = c83403nh.A0j();
        }
        C14360o3.A0A(A0j);
        return new AnonymousClass784(C7QZ.A05(context, userSession, anonymousClass988, c160787Im, c7im, c18a, false), C1580677q.A06(context, userSession, this.A00, anonymousClass988, c160787Im, c7im, c160787Im.A0U, c160787Im.A0V), A0j);
    }

    public C7BO(C98K c98k) {
        this.A00 = c98k;
    }
}
