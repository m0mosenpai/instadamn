package X;

import android.view.View;

/* renamed from: X.Sq1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63594Sq1 implements C03L {
    public final int A00;
    public final Object A01;

    public C63594Sq1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C03L
    public final /* synthetic */ C011504d Cx7(View view, C011504d c011504d) {
        switch (this.A00) {
            case 0:
                return (C011504d) ((InterfaceC16620sF) this.A01).invoke(view, c011504d);
            case 1:
                C14360o3.A0B(c011504d, 1);
                C02I A05 = c011504d.A00.A05(135);
                C14360o3.A07(A05);
                Q4U q4u = (Q4U) this.A01;
                R3N r3n = q4u.A01;
                Q21.A00(r3n, new R37(A05, r3n, q4u));
                return C011504d.A01;
            default:
                Q5b q5b = (Q5b) this.A01;
                VK4 vk4 = q5b.A02;
                if (vk4 != null) {
                    q5b.A03.A0l.remove(vk4);
                }
                if (c011504d != null) {
                    C67748UxK c67748UxK = new C67748UxK(q5b.A00, c011504d);
                    q5b.A02 = c67748UxK;
                    q5b.A03.A0a(c67748UxK);
                }
                return c011504d;
        }
    }
}
