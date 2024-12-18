package X;

import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;

/* renamed from: X.0ZS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZS {
    public final C0ZN A00;
    public final InterfaceC08830cm A01;

    public C0ZS(C0R9 c0r9, InterfaceC08830cm interfaceC08830cm) {
        this.A00 = new C0ZN(c0r9);
        this.A01 = interfaceC08830cm;
    }

    public static Checksum A00(SetQPLConfigDirective setQPLConfigDirective) {
        Checksum A03 = setQPLConfigDirective.A03();
        if (A03 == null) {
            return null;
        }
        return A03;
    }
}
