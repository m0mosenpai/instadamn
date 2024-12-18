package X;

import java.util.Comparator;

/* renamed from: X.2EC, reason: invalid class name */
/* loaded from: classes.dex */
public interface C2EC extends C2ED, C2EE, C2EF, C2EG, C2EH {
    public static final Comparator A00 = new Comparator() { // from class: X.2EI
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C2EC c2ec = (C2EC) obj;
            C2EC c2ec2 = (C2EC) obj2;
            int i = -(c2ec.BdM() > c2ec2.BdM() ? 1 : (c2ec.BdM() == c2ec2.BdM() ? 0 : -1));
            if (i == 0) {
                int i2 = -(c2ec.BLF() > c2ec2.BLF() ? 1 : (c2ec.BLF() == c2ec2.BLF() ? 0 : -1));
                if (i2 == 0) {
                    return -C2E1.A00.A02.compare(c2ec.C7q(), c2ec2.C7q());
                }
                return i2;
            }
            return i;
        }
    };
    public static final Comparator A01 = new Comparator() { // from class: X.2EJ
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            long j;
            long j2;
            C2EC c2ec = (C2EC) obj;
            C2EC c2ec2 = (C2EC) obj2;
            C80693iy c80693iy = ((C81663kb) c2ec).A01;
            long j3 = c80693iy.A0L;
            C80693iy c80693iy2 = ((C81663kb) c2ec2).A01;
            int i = -(j3 > c80693iy2.A0L ? 1 : (j3 == c80693iy2.A0L ? 0 : -1));
            if (i == 0) {
                FGH fgh = c80693iy.A0y;
                if (fgh != null) {
                    j = fgh.A00;
                } else {
                    j = 0;
                }
                FGH fgh2 = c80693iy2.A0y;
                if (fgh2 != null) {
                    j2 = fgh2.A00;
                } else {
                    j2 = 0;
                }
                int i2 = -(j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i2 == 0) {
                    return C2EC.A00.compare(c2ec, c2ec2);
                }
                return i2;
            }
            return i;
        }
    };
    public static final Comparator A02 = new Comparator() { // from class: X.2EK
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C2EF c2ef = (C2EF) obj;
            C2EF c2ef2 = (C2EF) obj2;
            int BmF = c2ef.BmF();
            int BmF2 = c2ef2.BmF();
            if (BmF != BmF2) {
                return BmF2 - BmF;
            }
            return C2EC.A00.compare(c2ef, c2ef2);
        }
    };
}
