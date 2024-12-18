package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;

/* renamed from: X.LlL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48971LlL implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C158747Ak c158747Ak;
        String str;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, c18a);
        AbstractC25233BEq.A0x(3, c7im, c160787Im, anonymousClass988);
        C17050sx A01 = AbstractC09440dt.A01(MG1.A00);
        C83403nh c83403nh = c160787Im.A0e;
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        C7QL A04 = C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c2ey, A01);
        new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        C910143t A00 = AbstractC158887Ba.A00(c83403nh);
        C83553nw c83553nw = c83403nh.A0N;
        if (c83553nw != null) {
            c158747Ak = LBz.A01(context, userSession, c160787Im, A04.A03, c83553nw, c83403nh.A2P, c160787Im.A0G.A0x, AbstractC162597Pw.A01(c83403nh, userSession.userId), false);
        } else {
            c158747Ak = null;
        }
        DirectMessageIdentifier A0V = c83403nh.A0V();
        boolean A03 = AbstractC158887Ba.A03(userSession, c83403nh);
        String str2 = c83403nh.A1u;
        C14360o3.A07(str2);
        User user = c160787Im.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        C7QX A0d = AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh);
        C7TT c7tt = c160787Im.A0G;
        InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
        int i = c7tt.A08;
        C7QY A042 = C1583378t.A04(context, c158747Ak, A0d, A04, anonymousClass988, C1583378t.A01(A00, anonymousClass988.A19), c83403nh, A00, null, A0V, interfaceC83733oI, str2, str, c83403nh.A1V, A00.A1E, null, C1583378t.A05(A00, interfaceC83733oI, i, true), i, A03, true, false, false, false, false, false, false);
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new C45186JzS(new C1576676a(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A042, A0k));
    }
}
