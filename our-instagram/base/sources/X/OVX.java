package X;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
public final class OVX {
    public static final OVX A01 = new OVX();
    public final ConcurrentMap A00;

    public final OLJ A00(String str) {
        C14360o3.A0B(str, 0);
        return (OLJ) this.A00.get(str);
    }

    public OVX() {
        C18B c18b = new C18B();
        c18b.A03(16);
        this.A00 = c18b.A00();
    }
}
