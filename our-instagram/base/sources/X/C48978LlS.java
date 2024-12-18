package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.LlS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48978LlS implements InterfaceC162527Pp {
    public final /* synthetic */ C7IM A00;

    public C48978LlS(C7IM c7im) {
        this.A00 = c7im;
    }

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, c18a, c7im, c160787Im, anonymousClass988);
        C1ZX A01 = C1ZV.A00(userSession).A01(C05F.A0N, C05F.A1F, false);
        A01.A01("view_type", c160787Im.getType());
        A01.A00();
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = c160787Im.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        C7IM c7im2 = this.A00;
        C2EY c2ey = C2EY.A1O;
        boolean z2 = false;
        C7QL A0Z = AbstractC43594JPz.A0Z(userSession, anonymousClass988, c160787Im, c7im2, c2ey);
        C7QX A002 = C7QM.A00(context, userSession, anonymousClass988, c160787Im, c2ey);
        if (c83403nh.A10 == C2EY.A0n) {
            z2 = true;
        }
        return new KV2(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im2, c18a), new KTE(A002, A0Z, false, "Message type not supported yet.", null, null, z2), A0v);
    }
}
