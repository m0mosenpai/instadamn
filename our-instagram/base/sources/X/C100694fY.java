package X;

import java.util.Map;
import java.util.Random;

/* renamed from: X.4fY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100694fY implements InterfaceC100654fU {
    public final Random A00 = new Random();
    public final C100684fX A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tn8, java.lang.Object] */
    @Override // X.InterfaceC100654fU
    public final InterfaceC65574Tn8 B2g(Integer num) {
        InterfaceC65574Tn8 c64117SzZ;
        C14360o3.A0B(num, 0);
        if (this.A00.nextInt(10) == 0) {
            if (num.equals(C05F.A01)) {
                c64117SzZ = new C64116SzY(this.A01, num, this.A02);
            } else {
                c64117SzZ = new C64117SzZ(this.A01, num, this.A03);
            }
            return c64117SzZ;
        }
        return new Object();
    }

    @Override // X.InterfaceC100654fU
    public final void EHZ(Integer num, String str, Map map) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(map, 2);
        InterfaceC65574Tn8 B2g = B2g(num);
        if (B2g.isSampled()) {
            for (Map.Entry entry : map.entrySet()) {
                B2g.ABZ((String) entry.getKey(), (String) entry.getValue());
            }
            B2g.A9R(str);
            B2g.report();
        }
    }

    @Override // X.InterfaceC100654fU
    public final void EIV(Integer num, String str, Map map) {
        C14360o3.A0B(num, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(map, 2);
        InterfaceC65574Tn8 B2g = B2g(num);
        if (B2g.isSampled()) {
            for (Map.Entry entry : map.entrySet()) {
                B2g.ABZ((String) entry.getKey(), (String) entry.getValue());
            }
            B2g.A8W(new Exception(str));
            B2g.report();
        }
    }

    public C100694fY(C100684fX c100684fX, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        this.A03 = interfaceC09390do;
        this.A02 = interfaceC09390do2;
        this.A01 = c100684fX;
    }
}
