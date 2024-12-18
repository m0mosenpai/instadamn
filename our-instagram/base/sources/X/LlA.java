package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LlA implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C51761Mtk c51761Mtk;
        boolean z2;
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        C83403nh c83403nh = A0Y.A0e;
        C51753Mtc c51753Mtc = c83403nh.A0C;
        if (c51753Mtc != null) {
            boolean z3 = c83403nh.A2P;
            boolean z4 = A0Y.A0G.A0x;
            boolean A01 = AbstractC162597Pw.A01(c83403nh, userSession.userId);
            InterfaceC50431MOl interfaceC50431MOl = (InterfaceC50431MOl) AbstractC166997dE.A0m(AbstractC47162Ksx.A00, c51753Mtc.A01);
            if (interfaceC50431MOl != null) {
                c51761Mtk = interfaceC50431MOl.AWo(context, c51753Mtc, A0Y, c7im.A00, c7im.A04.A04, A01);
            } else {
                c51761Mtk = new C51761Mtk(AbstractC43592JPx.A07(""), (List) C16930sl.A00);
            }
            String A0k = JQ0.A0k(userSession, c83403nh, z);
            List list = (List) c51761Mtk.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (A1B != null && A1B.length() != 0) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            return new KSE(LBz.A00(userSession, A0Y, c7im, z3, z4), (SpannableString) c51761Mtk.A02, A0k, list, c7im.A00, z2, A01, c7im.A00());
        }
        throw AbstractC166997dE.A0g();
    }
}
