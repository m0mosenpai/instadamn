package X;

import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.1mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC36091mT {
    public static final C0KV A00 = new C25951Oc(new InterfaceC25941Ob() { // from class: X.1mU
        @Override // X.InterfaceC25941Ob
        public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
            JSONObject jSONObject;
            boolean z;
            C36071mR c36071mR = (C36071mR) c1ow;
            C35199Ffr c35199Ffr = c36071mR.A01;
            String str = c35199Ffr.A09;
            String str2 = c36071mR.A03;
            String str3 = c35199Ffr.A0A;
            int i = c36071mR.A00;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return AbstractC35097Fd8.A02(userSession, str3, null);
                        }
                        throw new IllegalArgumentException(AnonymousClass001.A0O("Unrecognized block operation type: ", i));
                    }
                    jSONObject = null;
                    C14360o3.A0B(userSession, 0);
                    z = true;
                    C14360o3.A0B(str, 1);
                } else {
                    return AbstractC35097Fd8.A00(userSession, str, str2, str3);
                }
            } else {
                jSONObject = null;
                z = false;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(str, 1);
            }
            C14360o3.A0B(str2, 3);
            return AbstractC35097Fd8.A01(userSession, str, str2, str3, jSONObject, z);
        }
    });
}
