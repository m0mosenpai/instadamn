package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class WdC implements XA1 {
    public final String A00;
    public final String A01;

    @Override // X.XA1
    public final List FDW(InterfaceC71973XDg interfaceC71973XDg, InterfaceC71973XDg interfaceC71973XDg2) {
        String A0x;
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC71973XDg.getDisplayName());
        sb.append('.');
        String str = this.A00;
        sb.append(str);
        sb.append("==");
        sb.append(interfaceC71973XDg2.getDisplayName());
        sb.append('.');
        String str2 = this.A01;
        String A0x2 = AbstractC166997dE.A0x(str2, sb);
        String stringForKey = interfaceC71973XDg.getStringForKey(str);
        String stringForKey2 = interfaceC71973XDg2.getStringForKey(str2);
        boolean A0K = C14360o3.A0K(stringForKey, stringForKey2);
        if (A0K) {
            A0x = A0x2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(interfaceC71973XDg.getDisplayName());
            sb2.append('.');
            sb2.append(str);
            sb2.append('=');
            sb2.append(stringForKey);
            sb2.append(',');
            sb2.append(interfaceC71973XDg2.getDisplayName());
            sb2.append('.');
            sb2.append(str2);
            sb2.append('=');
            A0x = AbstractC166997dE.A0x(stringForKey2, sb2);
        }
        List A1Q = AbstractC16960so.A1Q(str, str2);
        C14360o3.A0B(A0x2, 1);
        C14360o3.A0B(A0x, 2);
        return AbstractC166987dD.A1J(new WdL(A1Q, A0K, A0x2, A0x));
    }

    public WdC(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
