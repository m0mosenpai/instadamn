package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lll, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48997Lll implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C45222K0c A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a, boolean z) {
        AbstractC167027dH.A12(context, userSession, c18a);
        AbstractC25233BEq.A0x(3, c7im, c160787Im, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        C7QL A0Z = AbstractC43594JPz.A0Z(userSession, anonymousClass988, c160787Im, c7im, c2ey);
        C7QY A01 = new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3).A01(context, userSession, A0Z, anonymousClass988, c160787Im);
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new C45222K0c(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A01, A0k);
    }

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        return A00(context, userSession, anonymousClass988, (C160787Im) c7vc, c7im, c18a, z);
    }
}
