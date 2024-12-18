package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.4t3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107584t3 extends AbstractC107474ss {
    public C42Q A01;
    public final int A05;
    public final C42N A06;
    public final List A07;
    public final AbstractC107524sx A08;
    public final HashSet A09 = new HashSet();
    public int A00 = 0;
    public int A04 = 0;
    public boolean A02 = false;
    public boolean A03 = false;

    public static void A00(AbstractC107474ss abstractC107474ss, C107584t3 c107584t3) {
        HashSet hashSet = c107584t3.A09;
        if (!hashSet.contains(abstractC107474ss)) {
            hashSet.add(abstractC107474ss);
            c107584t3.A04++;
            abstractC107474ss.A01.remove(c107584t3.A06);
            if (c107584t3.A04 >= c107584t3.A07.size()) {
                c107584t3.A03 = false;
                c107584t3.A03();
                return;
            }
            return;
        }
        throw new RuntimeException("Binding unexpectedly completed twice");
    }

    public static void A01(C107584t3 c107584t3) {
        List list = c107584t3.A07;
        ((AbstractC107474ss) list.get(c107584t3.A00)).A09(c107584t3.A01);
        int i = c107584t3.A00 + 1;
        c107584t3.A00 = i;
        if (i < list.size()) {
            C107504sv.A02.A02(c107584t3.A08, c107584t3.A05);
        }
    }

    public C107584t3(int i, List list) {
        AbstractC107524sx abstractC107524sx;
        this.A05 = i;
        this.A07 = list;
        if (!list.isEmpty()) {
            this.A06 = new C42N() { // from class: X.4t4
                @Override // X.C42N
                public final void DiR(AbstractC107474ss abstractC107474ss) {
                }

                @Override // X.C42N
                public final void E24(AbstractC107474ss abstractC107474ss) {
                }

                @Override // X.C42N
                public final boolean Ejs(AbstractC107474ss abstractC107474ss) {
                    return true;
                }

                @Override // X.C42N
                public final void D1y(AbstractC107474ss abstractC107474ss) {
                    C107584t3.A00(abstractC107474ss, C107584t3.this);
                }

                @Override // X.C42N
                public final void DH4(AbstractC107474ss abstractC107474ss) {
                    C107584t3.A00(abstractC107474ss, C107584t3.this);
                }
            };
            if (i == 0) {
                abstractC107524sx = null;
            } else {
                abstractC107524sx = new AbstractC107524sx() { // from class: X.9ah
                    @Override // X.AbstractC107524sx
                    public final void A01(long j) {
                        C107584t3 c107584t3 = C107584t3.this;
                        if (c107584t3.A03) {
                            C107584t3.A01(c107584t3);
                        }
                    }
                };
            }
            this.A08 = abstractC107524sx;
            return;
        }
        throw new IllegalArgumentException("Empty binding parallel");
    }
}
