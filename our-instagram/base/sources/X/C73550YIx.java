package X;

import java.util.Comparator;

/* renamed from: X.YIx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73550YIx implements Comparator {
    public final int A00;

    public C73550YIx(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                Number number = (Number) obj2;
                i = ((Number) obj).intValue();
                if (i == -1) {
                    if (number.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                i2 = number.intValue();
                if (i2 == -1) {
                    return 1;
                }
                break;
            case 1:
                i = ((C72745XmL) obj).A01;
                i2 = ((C72745XmL) obj2).A01;
                break;
            default:
                return Float.compare(((C72745XmL) obj).A00, ((C72745XmL) obj2).A00);
        }
        return i - i2;
    }
}
