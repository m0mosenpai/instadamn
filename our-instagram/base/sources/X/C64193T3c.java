package X;

import java.security.Signature;

/* renamed from: X.T3c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64193T3c implements InterfaceC65391TjO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64193T3c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65391TjO
    public final void Elx(C63152Se0 c63152Se0, C62693SMh c62693SMh, byte[] bArr) {
        String str;
        C63152Se0 c63152Se02;
        String str2;
        C62435SBn c62435SBn;
        if (this.A00 != 0) {
            boolean A1a = AbstractC167017dG.A1a(c63152Se0, bArr);
            C64860TXl c64860TXl = null;
            try {
                long j = c63152Se0.A01;
                if (j > System.currentTimeMillis() && c63152Se0.A04.equalsIgnoreCase("VALID")) {
                    String str3 = ((C64190T2z) this.A02).A06;
                    if (j > System.currentTimeMillis()) {
                        String str4 = c63152Se0.A03;
                        if (str4.equalsIgnoreCase("BIO") || ((c62435SBn = (C62435SBn) c63152Se0.A08.get(str3)) != null && c62435SBn.A00 > System.currentTimeMillis())) {
                            if (str4.equals("BIO")) {
                                SGB sgb = (SGB) this.A01;
                                if (sgb == null || (c63152Se02 = sgb.A01) == null) {
                                    str2 = null;
                                } else {
                                    str2 = c63152Se02.A03;
                                }
                                if (C14360o3.A0K(str2, "BIO")) {
                                    Signature signature = sgb.A02;
                                    if (signature != null) {
                                        str = SSF.A00(signature, bArr, A1a);
                                        c62693SMh.A00(str, c64860TXl);
                                        return;
                                    }
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                            str = C63174SeZ.A01().A08(c63152Se0, bArr);
                            c62693SMh.A00(str, c64860TXl);
                            return;
                        }
                    }
                }
                str = null;
                c64860TXl = new C64860TXl(c63152Se0, new RuntimeException());
                c62693SMh.A00(str, c64860TXl);
                return;
            } catch (Exception e) {
                c62693SMh.A00(null, new C64860TXl(c63152Se0, e));
                return;
            } catch (Throwable th) {
                c62693SMh.A00(null, null);
                throw th;
            }
        }
        try {
            C58770Q8c c58770Q8c = (C58770Q8c) this.A01;
            Signature A00 = C58770Q8c.A00(c58770Q8c, c63152Se0);
            if (c63152Se0.A03.equalsIgnoreCase("BIO")) {
                c58770Q8c.A03(new T2w(this, c63152Se0, c62693SMh, bArr), (SE2) this.A02, c63152Se0, A00);
            } else {
                A00.getClass();
                c62693SMh.A00(SSF.A00(A00, bArr, true), null);
            }
        } catch (Exception e2) {
            c62693SMh.A00(null, e2);
        }
    }
}
