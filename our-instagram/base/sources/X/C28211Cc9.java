package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Cc9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28211Cc9 {
    public final C5DD A00;
    public final InterfaceC1128957x A01;
    public final AnonymousClass583 A02;
    public final C28161Cb8 A03 = new C28161Cb8(8);

    public static C127055oj A00(C28211Cc9 c28211Cc9, C118125Vw c118125Vw, String str) {
        long A05 = C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        AnonymousClass583 anonymousClass583 = c28211Cc9.A02;
        InterfaceC1128957x interfaceC1128957x = c28211Cc9.A01;
        C5DD c5dd = c28211Cc9.A00;
        C16930sl c16930sl = C16930sl.A00;
        return c28211Cc9.A01(new C5C8(c16930sl, c16930sl, str), c118125Vw, c5dd, interfaceC1128957x, anonymousClass583, c16930sl, A05);
    }

    public C28211Cc9(C5DD c5dd, InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        this.A00 = c5dd;
        this.A01 = interfaceC1128957x;
        this.A02 = anonymousClass583;
    }

    public final C127055oj A01(C5C8 c5c8, C118125Vw c118125Vw, C5DD c5dd, InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, List list, long j) {
        int i;
        C126985oc c126985oc = new C126985oc(c5c8, c118125Vw, c5dd, interfaceC1128957x, anonymousClass583, list, Integer.MAX_VALUE, 1, j, true);
        C5DH c5dh = this.A03.A00;
        C127055oj c127055oj = (C127055oj) c5dh.A01(new CUX(c126985oc));
        if (c127055oj != null) {
            C127035oh c127035oh = c127055oj.A03;
            if (!c127035oh.A03.BCg()) {
                return new C127055oj(c127035oh, c126985oc, C5AU.A07(j, AbstractC119215ad.A00((int) Math.ceil(c127035oh.A01), (int) Math.ceil(c127035oh.A00))));
            }
        }
        C126995od c126995od = new C126995od(c126985oc.A03, AbstractC122525gn.A00(c126985oc.A04, c126985oc.A07), c126985oc.A05, c126985oc.A06, c126985oc.A08);
        long j2 = c126985oc.A02;
        int A03 = Constraints.A03(j2);
        if (Constraints.A07(j2)) {
            i = Constraints.A01(j2);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (A03 != i) {
            i = C17s.A03((int) Math.ceil(c126995od.BPq()), A03, i);
        }
        C127055oj c127055oj2 = new C127055oj(new C127035oh(c126995od, Integer.MAX_VALUE, AbstractC119035aK.A04(0, i, 0, Constraints.A00(j2)), false), c126985oc, C5AU.A07(j2, AbstractC119215ad.A00((int) Math.ceil(r5.A01), (int) Math.ceil(r5.A00))));
        c5dh.A02(new CUX(c126985oc), c127055oj2);
        return c127055oj2;
    }
}
