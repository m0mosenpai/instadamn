package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GS6 extends HashMap {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GS6(android.net.Uri uri, W55 w55, String str) {
        this.A00 = 0;
        this.A01 = w55;
        this.A02 = uri;
        put("action", str);
        put("map_uri", uri.toString());
    }

    public GS6(C54s c54s, Ef2 ef2) {
        this.A00 = 1;
        this.A01 = ef2;
        this.A02 = c54s;
        put("params", c54s.toString());
    }

    public GS6(C32183ECe c32183ECe, C33117EjL c33117EjL) {
        this.A00 = 2;
        this.A01 = c33117EjL;
        this.A02 = c32183ECe;
        put("url", c32183ECe.A00);
        put("contentType", "INVITE_CONTACT");
        put("inviteLocation", c33117EjL.A01.A00);
        put("isContactSynced", String.valueOf(C54P.A01(c33117EjL.A00.getContext(), c33117EjL.A03)));
    }

    public GS6(C33121EjQ c33121EjQ, C32183ECe c32183ECe, int i) {
        this.A00 = i;
        this.A01 = c33121EjQ;
        this.A02 = c32183ECe;
        put("url", c32183ECe.A00);
    }

    public GS6(C32183ECe c32183ECe, C33122EjR c33122EjR) {
        this.A00 = 3;
        this.A01 = c33122EjR;
        this.A02 = c32183ECe;
        put("url", c32183ECe.A00);
    }
}
