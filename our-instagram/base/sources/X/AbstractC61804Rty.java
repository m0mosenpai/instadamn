package X;

/* renamed from: X.Rty, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61804Rty {
    public static void A00(int i) {
        int i2;
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        for (int i3 = 0; i3 < length; i3++) {
            switch (MSW.A07(A00, i3)) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        C0K8.A0O("PendingUserActionHandlingType", "Update Ownership handling type: %d", AbstractC25228BEl.A1Y(i));
    }
}
