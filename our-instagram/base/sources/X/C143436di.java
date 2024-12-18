package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.6di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143436di {
    public final UserSession A00;
    public final InterfaceC19630xq A01;

    public C143436di(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C1AT.A01(userSession).A04(C1AV.A3B, getClass());
    }

    public final HashMap A00() {
        String string = this.A01.getString("follow_creator_dialog_count_map", null);
        if (string != null) {
            Object A09 = new Gson().A09(string, new C60768RSd().A00);
            C14360o3.A07(A09);
            return (HashMap) A09;
        }
        return new HashMap();
    }

    public final HashMap A01() {
        String string = this.A01.getString("follow_creator_dialog_timestamp_map", null);
        if (string != null) {
            Object A09 = new Gson().A09(string, new C60769RSe().A00);
            C14360o3.A07(A09);
            return (HashMap) A09;
        }
        return new HashMap();
    }
}
