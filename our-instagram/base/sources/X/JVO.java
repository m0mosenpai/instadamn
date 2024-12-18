package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JVO implements InterfaceC162527Pp {
    public final String A00;

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        C7M5 c7m5 = new C7M5(userSession);
        InterfaceC83733oI interfaceC83733oI = A0Y.A0G.A0P;
        if (interfaceC83733oI != null) {
            C83403nh c83403nh = A0Y.A0e;
            C14360o3.A07(c83403nh);
            c7m5.A02(c83403nh, interfaceC83733oI, A0Y.A0G.A08);
        }
        String A0j = JQ0.A0j(userSession, A0Y, z);
        C14360o3.A0A(A0j);
        return new JVQ(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), JVP.A05.A00(context, userSession, anonymousClass988, A0Y, c7im, this.A00), A0j);
    }

    public JVO(String str) {
        this.A00 = str;
    }
}
