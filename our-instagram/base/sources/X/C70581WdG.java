package X;

import java.util.List;

/* renamed from: X.WdG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70581WdG implements XA2 {
    public final String A00;
    public final String A01;

    @Override // X.XA2
    public final List FDV(InterfaceC71973XDg interfaceC71973XDg) {
        String str = this.A01;
        C11L c11l = new C11L(str);
        String str2 = this.A00;
        boolean A08 = c11l.A08(interfaceC71973XDg.getStringForKey(str2));
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC71973XDg.getDisplayName());
        sb.append('.');
        sb.append(str2);
        String A0u = MSZ.A0u(" matches ", str, sb);
        String valueOf = String.valueOf(A08);
        List A1J = AbstractC166987dD.A1J(str2);
        AbstractC167017dG.A1P(A0u, valueOf);
        return AbstractC166987dD.A1J(new WdL(A1J, A08, A0u, valueOf));
    }

    public C70581WdG(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
