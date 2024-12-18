package X;

import android.content.Context;
import java.util.PriorityQueue;

/* loaded from: classes9.dex */
public final class NU1 extends AbstractC54988OTw {
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public final Context A03;
    public final InterfaceC06180Ui A04;
    public final PriorityQueue A05;

    public static void A01(NU1 nu1, Integer num, long j) {
        nu1.A02(new C51874MwI(num, C05F.A00, new String[0], j, false));
    }

    public static final void A00(NU1 nu1) {
        Integer num;
        C51874MwI c51874MwI;
        PriorityQueue priorityQueue = nu1.A05;
        C51874MwI c51874MwI2 = (C51874MwI) priorityQueue.peek();
        if (c51874MwI2 != null && (num = c51874MwI2.A02) != null) {
            if (num != C05F.A0C || nu1.A00 == C05F.A00) {
                if ((!nu1.A02 || AbstractC54170Nx6.A00(nu1.A01) < AbstractC54170Nx6.A00(num)) && (c51874MwI = (C51874MwI) priorityQueue.poll()) != null) {
                    InterfaceC06180Ui interfaceC06180Ui = nu1.A04;
                    C19L c19l = ((AbstractC54988OTw) nu1).A01;
                    long currentTimeMillis = System.currentTimeMillis();
                    Integer num2 = c51874MwI.A01;
                    String[] strArr = c51874MwI.A04;
                    Integer num3 = c51874MwI.A02;
                    boolean z = c51874MwI.A03;
                    AbstractC25233BEq.A0v(0, num2, strArr, num3);
                    AbstractC54157Nwt.A00(new C51874MwI(num2, num3, strArr, currentTimeMillis, z), c19l, interfaceC06180Ui);
                }
            }
        }
    }

    public final void A02(C51874MwI c51874MwI) {
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(c51874MwI.A02, C05F.A0C);
        if (this.A00 != C05F.A00) {
            z = false;
        }
        if (A1X || z) {
            this.A05.add(c51874MwI);
        }
        A00(this);
    }

    public NU1(Context context, C54446O4a c54446O4a) {
        super(c54446O4a);
        this.A03 = context;
        this.A00 = C05F.A0C;
        Integer num = C05F.A00;
        this.A01 = num;
        this.A05 = new PriorityQueue(10, new C50583MUt(18));
        this.A04 = C10M.A00(num, 0, 0);
    }
}
