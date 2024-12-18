package X;

import java.util.List;

/* renamed from: X.1En, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23801En implements InterfaceC23811Eo {
    public final String A00;

    @Override // X.InterfaceC23811Eo
    public final boolean isStreaming() {
        return false;
    }

    @Override // X.InterfaceC23811Eo
    public final void AAc(C58613Pyh c58613Pyh, String str) {
        String str2 = this.A00;
        List list = c58613Pyh.A02;
        list.add(c58613Pyh.A01);
        list.add(new C58612Pyg("Content-Disposition: form-data; name=\"", str, "\"", "\r\n", "\r\n", str2, "\r\n"));
    }

    public C23801En(String str) {
        this.A00 = str;
    }
}
