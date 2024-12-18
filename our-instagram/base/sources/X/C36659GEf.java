package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.GEf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36659GEf implements GYB {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C14360o3.A0B(uri, 0);
        String path = uri.getPath();
        if (path != null) {
            if (AbstractC002300n.A0h(path, "/", false)) {
                path = path.substring(1);
                C14360o3.A07(path);
            }
            if (!AbstractC002300n.A0f(path, "/", false)) {
                path = AnonymousClass001.A0C(path, '/');
            }
            C16030qx c16030qx = C16030qx.A02;
            C14360o3.A07(c16030qx);
            C11820jg c11820jg = C11830jh.A04;
            UserSession userSession = this.A02;
            C19U A01 = c11820jg.A01(userSession).A01(C19T.A2H);
            C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
            A0q.A0B(path);
            ((AbstractC23721Ec) A0q).A06 = EnumC23341Bw.API;
            A0q.A05();
            Context context = this.A00;
            A0q.A9s("device", C16030qx.A00(context));
            AbstractC31175DnJ.A0k(context, A0q, c16030qx);
            AbstractC31173DnH.A1N(A0q);
            if (A01 != null) {
                str = A01.A01;
            } else {
                str = "";
            }
            A0q.A9s("phone_id", str);
            Iterator<String> it = uri.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B != null) {
                    A0q.A9s(A1B, uri.getQueryParameter(A1B));
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            C1ON A0P = AbstractC31176DnK.A0P(A0q);
            C31702Dw7.A01(A0P, this, 26);
            C1GJ.A00(context, this.A01, A0P);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C36659GEf(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A02 = userSession;
    }
}
