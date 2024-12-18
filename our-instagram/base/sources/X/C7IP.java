package X;

import android.os.Bundle;

/* renamed from: X.7IP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IP {
    public boolean A00;
    public final String A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    public C7IP(Bundle bundle, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 2);
        this.A02 = str2;
        this.A03 = interfaceC16820sZ;
        this.A01 = C7IQ.A00(str);
        this.A00 = bundle == null;
    }

    public final String A00() {
        String str;
        C2ED c2ed;
        if (!this.A00) {
            str = this.A02;
            if (str == null) {
                InterfaceC16820sZ interfaceC16820sZ = this.A03;
                if (interfaceC16820sZ != null && (c2ed = (C2ED) interfaceC16820sZ.invoke()) != null && c2ed.CPl()) {
                    str = AnonymousClass001.A0R(this.A01, ":subsequent_sends");
                }
            }
            this.A00 = false;
            return str;
        }
        str = this.A01;
        this.A00 = false;
        return str;
    }
}
