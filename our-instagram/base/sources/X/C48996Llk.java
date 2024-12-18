package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Llk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48996Llk implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C48326LZz A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        AbstractC167027dH.A12(context, userSession, c18a);
        AbstractC25233BEq.A0x(3, c7im, c160787Im, anonymousClass988);
        C2EY c2ey = c160787Im.A0e.A10;
        C14360o3.A07(c2ey);
        C7QL A0Z = AbstractC43594JPz.A0Z(userSession, anonymousClass988, c160787Im, c7im, c2ey);
        return new C48326LZz(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3).A01(context, userSession, A0Z, anonymousClass988, c160787Im));
    }

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        return A00(context, userSession, anonymousClass988, (C160787Im) c7vc, c7im, c18a);
    }
}
