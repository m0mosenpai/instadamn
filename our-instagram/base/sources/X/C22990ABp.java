package X;

import android.content.Context;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.ABp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22990ABp {
    public C150486px A00;
    public CameraAREffect A01;
    public AKM A02;
    public final Context A03;
    public final InterfaceC150356pk A04;
    public final C22911A8h A05;
    public final UserSession A06;
    public final String A07;
    public final List A08;

    public C22990ABp(Context context, InterfaceC150356pk interfaceC150356pk, C22911A8h c22911A8h, UserSession userSession, String str, List list) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A06 = userSession;
        this.A04 = interfaceC150356pk;
        this.A05 = c22911A8h;
        this.A07 = str;
        this.A08 = list;
        C150486px A00 = C150476pw.A00(context, interfaceC150356pk, userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    public final void A00(JSONObject jSONObject) {
        AKM akm = this.A02;
        if (akm == null) {
            C14360o3.A0F("renderProvider");
            throw C00O.createAndThrow();
        }
        C1814883b c1814883b = akm.A06;
        C14360o3.A07(c1814883b);
        c1814883b.A00(jSONObject);
    }
}
