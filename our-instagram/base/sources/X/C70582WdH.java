package X;

import java.util.List;

/* renamed from: X.WdH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70582WdH implements XA2 {
    public final String A00;
    public final String A01;

    @Override // X.XA2
    public final List FDV(InterfaceC71973XDg interfaceC71973XDg) {
        String str = this.A01;
        String stringForKey = interfaceC71973XDg.getStringForKey(str);
        String str2 = this.A00;
        return AbstractC166987dD.A1J(new C70585WdM(this, AnonymousClass001.A0T(str, str2, '='), AnonymousClass001.A0T(str, stringForKey, '='), AbstractC166987dD.A1J(str), C14360o3.A0K(str2, stringForKey)));
    }

    public C70582WdH(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
