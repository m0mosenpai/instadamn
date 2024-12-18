package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lla, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48986Lla implements InterfaceC162527Pp {
    public final Map A00;

    public C48986Lla(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        String A0j = JQ0.A0j(userSession, A0Y, z);
        C14360o3.A0A(A0j);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C48324LZx(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), AbstractC46797Kms.A00(context, userSession, anonymousClass988, A0Y, c7im, this.A00), A0j);
    }
}
