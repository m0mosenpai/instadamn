package X;

import java.util.List;

/* renamed from: X.WdE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70579WdE implements XA2 {
    public final String A00;

    @Override // X.XA2
    public final List FDV(InterfaceC71973XDg interfaceC71973XDg) {
        String str = this.A00;
        boolean z = !AbstractC167007dF.A1N(interfaceC71973XDg.getStringForKey(str).length());
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC71973XDg.getDisplayName());
        sb.append('.');
        sb.append(str);
        String A0x = AbstractC166997dE.A0x(" is not null", sb);
        String valueOf = String.valueOf(z);
        List A1J = AbstractC166987dD.A1J(str);
        AbstractC167017dG.A1P(A0x, valueOf);
        return AbstractC166987dD.A1J(new WdL(A1J, z, A0x, valueOf));
    }

    public C70579WdE(String str) {
        this.A00 = str;
    }
}
