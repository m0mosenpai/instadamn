package X;

/* renamed from: X.CoD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28843CoD implements InterfaceC30987Djj {
    public String A00;
    public final int[] A01 = new int[2];

    public final String A02() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("text");
        throw C00O.createAndThrow();
    }

    public final int[] A03(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = this.A01;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }

    public static int A01(AbstractC28843CoD abstractC28843CoD) {
        return abstractC28843CoD.A02().length();
    }
}
