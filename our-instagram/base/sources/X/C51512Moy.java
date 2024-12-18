package X;

import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.Moy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51512Moy extends AbstractC53638Nnj {
    public final int A00;
    public final InterfaceC58135Ppy A01;
    public final java.net.URI A02;
    public final JSONObject A03;
    public final UserSession A04;

    public C51512Moy(InterfaceC58135Ppy interfaceC58135Ppy, UserSession userSession, java.net.URI uri, JSONObject jSONObject, int i) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = interfaceC58135Ppy;
        this.A02 = uri;
        this.A03 = jSONObject;
        this.A00 = i;
    }
}
