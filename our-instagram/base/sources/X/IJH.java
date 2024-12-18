package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class IJH {
    public final int A00;
    public final UserSession A01;
    public final IFN A02;
    public final IDL A03;
    public final JSONObject A04;

    public IJH(Context context, UserSession userSession, C1GL c1gl) {
        IFN ifn = (IFN) userSession.A01(IFN.class, new J8X(userSession, 14));
        IDL idl = new IDL(c1gl);
        int A0A = AbstractC13880nE.A0A(context);
        JSONObject A04 = AnonymousClass566.A04(userSession);
        C14360o3.A0B(ifn, 2);
        this.A01 = userSession;
        this.A02 = ifn;
        this.A03 = idl;
        this.A00 = A0A;
        this.A04 = A04;
    }
}
