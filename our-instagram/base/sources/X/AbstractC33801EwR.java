package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.EwR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33801EwR {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        String A0f = AbstractC31171DnF.A0f(A02);
        String str = (String) A02;
        String A0n = AbstractC31176DnK.A0n(c6fw, A0f);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        C17280tP A0y = AbstractC166987dD.A0y();
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C83743oJ A01 = C83743oJ.A01(A0B);
        C14360o3.A07(A01);
        ArrayList A06 = A01.A06(A0B);
        if (!(A06 instanceof Collection) || !A06.isEmpty()) {
            Iterator it = A06.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC002300n.A0g(((C83803oP) it.next()).A06, str, false)) {
                    A01.A0A(C6BQ.A08(c6fq), A0B, C05F.A0C, str);
                    break;
                }
            }
        }
        ArrayList A00 = LHJ.A00();
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            Iterator it2 = A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (AbstractC002300n.A0g(((L8l) it2.next()).A00(), str, false)) {
                    ArrayList A002 = LHJ.A00();
                    Iterator it3 = A002.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        L8l l8l = (L8l) it3.next();
                        if (l8l.A00() != null && l8l.A00().equals(str)) {
                            it3.remove();
                            break;
                        }
                    }
                    LHJ.A02(A002);
                }
            }
        }
        if (!A0y.A09().contains(str)) {
            A0y.A0H(AnonymousClass090.A01(str, A0y.A09()));
        }
        if (A0n.equals("local_auth")) {
            InterfaceC16530ry interfaceC16530ry = A0y.A04;
            C0YR[] c0yrArr = C17280tP.A4G;
            if (!((java.util.Set) AbstractC31171DnF.A0Y(A0y, interfaceC16530ry, c0yrArr, 184)).contains(str)) {
                AbstractC31171DnF.A1S(A0y, AnonymousClass090.A01(str, (java.util.Set) AbstractC31171DnF.A0Y(A0y, interfaceC16530ry, c0yrArr, 184)), interfaceC16530ry, c0yrArr, 184);
            }
        }
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A03(A03, 0);
        AbstractC25227BEk.A1M(c6fq, A0s, A0I);
        return null;
    }
}
