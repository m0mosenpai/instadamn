package X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* renamed from: X.5LJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LJ extends C40781ul {
    public final C3JY A00;

    public final String A00() {
        InterfaceC26481Qd A00 = this.A00.A00();
        if (A00 != null) {
            InputStream AjT = A00.AjT();
            try {
                StringBuilder sb = new StringBuilder();
                AbstractC38581qm.A01(new BufferedReader(new InputStreamReader(AjT, StandardCharsets.UTF_8)), new C5LK(sb));
                String obj = sb.toString();
                C14360o3.A07(obj);
                return obj;
            } catch (IOException unused) {
            }
        }
        return "";
    }

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        if (this.A00.A02 != 200) {
            return false;
        }
        return true;
    }

    public C5LJ(C3JY c3jy) {
        this.A00 = c3jy;
    }
}
