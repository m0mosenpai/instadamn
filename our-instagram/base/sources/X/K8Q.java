package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K8Q extends C40781ul {
    public C47462Kxr A00;
    public List A01 = C16930sl.A00;

    @Override // X.C40781ul, X.InterfaceC40821up
    public final String getStatus() {
        C47462Kxr c47462Kxr = this.A00;
        if (c47462Kxr != null) {
            return c47462Kxr.A00;
        }
        return "";
    }

    @Override // X.C40781ul, X.C40791um, X.InterfaceC40801un
    public final boolean isOk() {
        return "OK".equals(getStatus());
    }
}
