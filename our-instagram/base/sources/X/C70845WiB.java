package X;

import java.util.HashSet;

/* renamed from: X.WiB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70845WiB implements InterfaceC43071ya {
    public final C69711Vu6 A00;
    public final java.util.Set A01 = new HashSet();

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            java.util.Set set = this.A01;
            C41136IJb c41136IJb = (C41136IJb) c59062n7.A03;
            String str = c41136IJb.A05;
            C14360o3.A07(str);
            if (set.add(str)) {
                C69711Vu6 c69711Vu6 = this.A00;
                String A0R = AnonymousClass001.A0R(c41136IJb.A05, "_component");
                C14360o3.A0B(A0R, 0);
                c69711Vu6.A01(A0R, A1R);
            }
        }
    }

    public C70845WiB(C69711Vu6 c69711Vu6) {
        this.A00 = c69711Vu6;
    }
}
