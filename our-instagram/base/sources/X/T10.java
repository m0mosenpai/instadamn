package X;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class T10 implements InterfaceC127765q1 {
    public final Intent A00;
    public final C3VA A01;
    public final String A02;

    @Override // X.InterfaceC127765q1
    public final boolean Cfc() {
        C08600cO c08600cO = new C08600cO();
        c08600cO.A01 = AbstractC08590cN.A02(((C74123Uq) C3UY.A00).A07);
        c08600cO.A04(this.A02);
        c08600cO.A01();
        return c08600cO.A00().A03(this.A01.A00, this.A00, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0bW, java.lang.Object, X.T1e] */
    @Override // X.InterfaceC127765q1
    public final void FDb() {
        C42X c42x;
        C08600cO c08600cO = new C08600cO();
        c08600cO.A01 = AbstractC08590cN.A02(((C74123Uq) C3UY.A00).A07);
        c08600cO.A04(this.A02);
        c08600cO.A01();
        C08610cP A00 = c08600cO.A00();
        ?? obj = new Object();
        if (!A00.A03(this.A01.A00, this.A00, obj) && (c42x = obj.A00) != null) {
            throw c42x;
        }
    }

    public T10(Intent intent, C3VA c3va, String str) {
        this.A01 = c3va;
        this.A00 = intent;
        this.A02 = str == null ? "FBNS_DEFAULT_DOMAIN" : str;
    }

    @Override // X.InterfaceC127765q1
    public final boolean Cfa() {
        try {
            FDb();
            return true;
        } catch (C42X e) {
            C0K8.A0H("FBNS_DEFAULT_DOMAIN", "Error verifying signature", e);
            return false;
        }
    }
}
