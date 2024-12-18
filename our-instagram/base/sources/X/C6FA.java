package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.6FA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FA implements InterfaceC136226Ez {
    @Override // X.InterfaceC136226Ez
    public final C6FM By5(C6FG c6fg, AnonymousClass630 anonymousClass630) {
        return null;
    }

    @Override // X.InterfaceC136226Ez
    public final C6DU BHe(C6FQ c6fq, InterfaceC102844kL interfaceC102844kL, Object obj) {
        C102834kK c102834kK = (C102834kK) interfaceC102844kL;
        final Object A00 = C6DS.A00(c6fq, c102834kK.A02);
        final String str = c102834kK.A00;
        final Map map = (Map) c102834kK.A02.get("debug_metadata");
        return new C6DU(A00, str, map) { // from class: X.6Da
            public final Object A00;
            public final Map A01;

            {
                C14360o3.A0B(str, 2);
                this.A00 = A00;
                this.A01 = map;
            }

            @Override // X.C6DU
            public final Runnable AIf(C6FG c6fg, AnonymousClass630 anonymousClass630, C63162tt c63162tt) {
                C14360o3.A0B(c63162tt, 2);
                Map map2 = this.A01;
                if (map2 != null) {
                    map2.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    return null;
                }
                return null;
            }

            @Override // X.C6DU
            public final Object BHk() {
                return this.A00;
            }
        };
    }
}
