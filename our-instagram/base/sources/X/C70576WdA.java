package X;

import java.util.List;

/* renamed from: X.WdA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70576WdA implements XA1 {
    public final InterfaceC71974XDh A00 = new C70583WdI();

    @Override // X.XA1
    public final List FDW(InterfaceC71973XDg interfaceC71973XDg, InterfaceC71973XDg interfaceC71973XDg2) {
        Object obj;
        String BxO = interfaceC71973XDg.BxO();
        String BxO2 = interfaceC71973XDg2.BxO();
        boolean A1T = AbstractC31175DnJ.A1T(1, BxO, BxO2);
        String A00 = AbstractC68358VNs.A00(BxO);
        String A002 = AbstractC68358VNs.A00(BxO2);
        if ((C14360o3.A0K(A00, "primary") && C14360o3.A0K(A002, "secondary")) || (C14360o3.A0K(A00, "secondary") && C14360o3.A0K(A002, "primary"))) {
            String BxO3 = interfaceC71973XDg.BxO();
            C14360o3.A0B(BxO3, A1T ? 1 : 0);
            char[] cArr = new char[1];
            cArr[A1T ? 1 : 0] = ':';
            Object obj2 = AbstractC001900j.A0Q(BxO3, cArr, A1T ? 1 : 0).get(1);
            String BxO4 = interfaceC71973XDg2.BxO();
            C14360o3.A0B(BxO4, A1T ? 1 : 0);
            char[] cArr2 = new char[1];
            cArr2[A1T ? 1 : 0] = ':';
            obj = new WdJ(C14360o3.A0K(obj2, AbstractC001900j.A0Q(BxO4, cArr2, A1T ? 1 : 0).get(1)));
        } else {
            obj = this.A00;
        }
        return AbstractC166987dD.A1J(obj);
    }
}
