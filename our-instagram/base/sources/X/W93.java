package X;

import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes11.dex */
public final class W93 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final int A03;
    public final C1UM A04;

    public static final C69622VsP A00(String str) {
        List A0R = AbstractC001900j.A0R(str, new String[]{"/"}, 0);
        if (A0R.size() != 6) {
            return null;
        }
        return new C69622VsP((String) A0R.get(0), (String) A0R.get(1), Long.parseLong((String) A0R.get(2)), Long.parseLong((String) A0R.get(3)), Boolean.parseBoolean((String) A0R.get(4)), Boolean.parseBoolean((String) A0R.get(5)));
    }

    public W93(C1UI c1ui, double d, double d2, double d3, int i) {
        this.A03 = i;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        C1UM A00 = c1ui.A00("ig_video_cache_store");
        C14360o3.A07(A00);
        this.A04 = A00;
    }

    public static final void A01(C1ZT c1zt, List list, int i) {
        if (list.size() >= i) {
            PriorityQueue priorityQueue = new PriorityQueue(list.size(), new C65903Tw9(14));
            priorityQueue.addAll(list);
            int size = list.size() - i;
            for (int i2 = 0; i2 < size; i2++) {
                C69622VsP c69622VsP = (C69622VsP) priorityQueue.remove();
                if (c69622VsP != null) {
                    c1zt.A06(c69622VsP.A03);
                }
            }
        }
    }
}
