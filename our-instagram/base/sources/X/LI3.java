package X;

import android.content.ContentResolver;
import android.os.Bundle;

/* loaded from: classes8.dex */
public final class LI3 {
    public final ContentResolver A00;
    public final android.net.Uri A01;
    public final C62538SFp A02;
    public final C1Tc A03;
    public final InterfaceC27041Tb A04;

    public LI3(ContentResolver contentResolver, C62538SFp c62538SFp, C1Tc c1Tc, InterfaceC27041Tb interfaceC27041Tb) {
        android.net.Uri uri = C47894LDo.A00;
        this.A02 = c62538SFp;
        this.A00 = contentResolver;
        this.A03 = c1Tc;
        this.A04 = interfaceC27041Tb;
        this.A01 = uri;
    }

    public static Bundle A00(Bundle bundle, LI3 li3) {
        Bundle A00 = AbstractC62785SRd.A00(li3.A00, li3.A01, bundle.deepCopy(), li3.A02, "authenticate");
        C47894LDo c47894LDo = C47894LDo.A01;
        AbstractC62785SRd.A01(A00, li3.A03, "authenticate");
        return A00;
    }

    public static Bundle A01(Bundle bundle, LI3 li3) {
        Bundle A00 = AbstractC62785SRd.A00(li3.A00, li3.A01, bundle.deepCopy(), li3.A02, "start");
        C47894LDo c47894LDo = C47894LDo.A01;
        AbstractC62785SRd.A01(A00, li3.A03, "start");
        return A00;
    }
}
