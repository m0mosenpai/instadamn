package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LlK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48970LlK implements InterfaceC162527Pp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C7SZ A03;
        C158737Aj c158737Aj;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, c18a);
        int i = 3;
        AbstractC167007dF.A1F(c7im, 3, c160787Im);
        C14360o3.A0B(anonymousClass988, 5);
        C1583378t c1583378t = null;
        C7SV c7sv = C7SV.A00;
        C17050sx A01 = AbstractC09440dt.A01(c7sv);
        C83403nh c83403nh = c160787Im.A0e;
        C7QL A032 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, A01);
        Object obj = c83403nh.A1T;
        if (obj instanceof C7Q4) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.DirectPendingMedia");
            ArrayList A1E = AbstractC166987dD.A1E();
            C47Z A033 = C25A.A00(userSession).A03(((C7Q4) obj).A06);
            C76T A00 = C76S.A00(context, userSession);
            C7QL A034 = C7QK.A03(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, AbstractC09440dt.A01(c7sv));
            String str = null;
            if (A033 != null) {
                Iterator it = A033.A0K().iterator();
                while (it.hasNext()) {
                    C7Q4 A002 = AbstractC47064KrL.A00(AbstractC43592JPx.A0l(it));
                    String str2 = A002.A08;
                    DirectThreadAnalyticsParams A0V = JQ0.A0V(c160787Im, c83403nh, c83403nh.A1c() ? 1 : 0);
                    boolean A05 = A002.A05();
                    C7TT c7tt = c160787Im.A0G;
                    C158797Aq A04 = A00.A04(c83403nh, null, A002, AbstractC160897Ix.A00(c7tt), false, c7tt.A0N.A08);
                    DirectMessageIdentifier A0V2 = c83403nh.A0V();
                    String str3 = c83403nh.A1u;
                    C14360o3.A07(str3);
                    C9C9 c9c9 = new C9C9("", str3, 5);
                    EnumC910243u enumC910243u = EnumC910243u.SINGLE;
                    if (!A002.A05()) {
                        c158737Aj = new C158737Aj(AbstractC43593JPy.A0Q(A002.A03()), false, AbstractC25227BEk.A0m(), null, null, null, null, null, null, null);
                    } else if (str2 != null) {
                        c158737Aj = new C158737Aj(AbstractC43593JPy.A0Q(str2), false, AbstractC25227BEk.A0m(), null, null, null, null, null, null, null);
                    } else {
                        c158737Aj = null;
                    }
                    A1E.add(new KTK(A04, new C7QY(null, null, null, c9c9, null, null, null, null, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), A034, null, null, c158737Aj, null, null, null, enumC910243u, null, A0V2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), A0V, null, 2, A05, false, false, false));
                }
            }
            DirectMessageIdentifier A0V3 = c83403nh.A0V();
            InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
            if (interfaceC83733oI != null) {
                str = AbstractC1345466e.A07(interfaceC83733oI);
            }
            A03 = new C7SZ(null, null, A0V3, str, A1E, MHU.A00(context, A034, 3), c160787Im.A0G.A08, 2, false, false, true);
        } else {
            A03 = new C1582378i(c1583378t, null == true ? 1 : 0, null == true ? 1 : 0, i).A03(context, userSession, A032, anonymousClass988, c160787Im, false);
        }
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new KVF(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A03, A0k);
    }
}
