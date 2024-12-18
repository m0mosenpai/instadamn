package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.Nr7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53817Nr7 {
    public static final void A00(C6FQ c6fq, C6FW c6fw) {
        Activity A01;
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null && (A01 = AbstractC68641VYw.A00.A01(c6fg.A00)) != null) {
            C55754OpN c55754OpN = new C55754OpN(c6fq, A0I);
            C12260kU.A0E(A01, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            C218914p.A04(EnumC220415e.A02, new C56056OuX(c55754OpN, 0), false, false);
            return;
        }
        C131845xK.A00(c6fq, C6FW.A01, A0I);
    }
}
