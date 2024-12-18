package X;

import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49I {
    public final long A00;
    public final C49K A01;
    public final C49L A02;
    public final C49G A03;
    public final ImmutableSet A04;
    public final C49H A05;
    public final C55512gr A06;
    public final C55472gn A07;
    public final C55492gp A08;
    public final C55482go A09;
    public final C55502gq A0A;
    public final C55522gs A0B;
    public final String A0C;
    public final boolean A0D;

    public C49I(InterfaceC02550Ad interfaceC02550Ad, C49G c49g, C49H c49h, C55512gr c55512gr, C55472gn c55472gn, C55492gp c55492gp, C55482go c55482go, C55502gq c55502gq, C55522gs c55522gs, String str, final List list, java.util.Set set, long j, boolean z) {
        C14360o3.A0B(c49g, 3);
        C14360o3.A0B(c55472gn, 4);
        C14360o3.A0B(c55482go, 6);
        C14360o3.A0B(c55492gp, 8);
        C14360o3.A0B(c55502gq, 9);
        C14360o3.A0B(c55512gr, 10);
        C14360o3.A0B(c55522gs, 11);
        ImmutableSet A03 = ImmutableSet.A03(set);
        C14360o3.A07(A03);
        C49K c49k = new C49K(list) { // from class: X.49J
            public final List A00;

            @Override // X.C49K
            public final /* bridge */ /* synthetic */ C5OL AT5(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    C5OL AT5 = ((C49K) it.next()).AT5(interfaceC94534Ng, c49i);
                    if (!AT5.A07) {
                        return AT5;
                    }
                }
                return C5OK.A00();
            }

            {
                this.A00 = list;
            }
        };
        C49L c49l = new C49L(interfaceC02550Ad);
        this.A04 = A03;
        this.A0C = str;
        this.A03 = c49g;
        this.A07 = c55472gn;
        this.A09 = c55482go;
        this.A05 = c49h;
        this.A08 = c55492gp;
        this.A0A = c55502gq;
        this.A06 = c55512gr;
        this.A0B = c55522gs;
        this.A01 = c49k;
        this.A00 = j;
        this.A0D = z;
        this.A02 = c49l;
    }
}
