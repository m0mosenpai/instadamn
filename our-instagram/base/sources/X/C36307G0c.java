package X;

import java.util.HashSet;

/* renamed from: X.G0c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36307G0c implements InterfaceC43071ya {
    public final /* synthetic */ C34609FMs A00;

    public C36307G0c(C34609FMs c34609FMs) {
        this.A00 = c34609FMs;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        if (c59062n7 != null) {
            C34609FMs c34609FMs = this.A00;
            if (interfaceC57162jr != null) {
                num = interfaceC57162jr.CFq(c59062n7);
            } else {
                num = null;
            }
            if (num == C05F.A00) {
                C09530e4 c09530e4 = (C09530e4) c59062n7.A03;
                C32061E6n c32061E6n = (C32061E6n) c59062n7.A04;
                HashSet hashSet = c34609FMs.A04;
                Object obj = c09530e4.A00;
                if (hashSet.add(((C17D) obj).getId())) {
                    c34609FMs.A02.A00((C47P) obj, c32061E6n.A02, c32061E6n.A01);
                }
                C47P c47p = (C47P) c09530e4.A01;
                if (c47p != null && hashSet.add(c47p.getId())) {
                    c34609FMs.A02.A00(c47p, c32061E6n.A02, c32061E6n.A01 + 1);
                }
            }
        }
    }
}
