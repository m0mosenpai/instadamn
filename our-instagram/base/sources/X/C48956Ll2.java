package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ll2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48956Ll2 implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im c160787Im = (C160787Im) c7vc;
        AbstractC167027dH.A12(context, userSession, c18a);
        AbstractC25233BEq.A0x(3, c7im, c160787Im, anonymousClass988);
        C17050sx A01 = AbstractC09440dt.A01(C50214MFv.A00);
        C83403nh c83403nh = c160787Im.A0e;
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        C7QL A04 = C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c2ey, A01);
        C7QY A012 = new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3).A01(context, userSession, A04, anonymousClass988, c160787Im);
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new K0B(new C1576676a(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A012, A0k));
    }
}
