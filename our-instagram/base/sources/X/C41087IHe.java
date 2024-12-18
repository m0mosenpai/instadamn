package X;

/* renamed from: X.IHe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41087IHe {
    public static int A03;
    public static int A04;
    public final IJT A00;
    public final Integer A01;
    public final String A02;

    public C41087IHe(IJT ijt, Integer num) {
        StringBuilder A1C;
        int i;
        String obj;
        this.A00 = ijt;
        this.A01 = num;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                ijt.getClass();
                ijt.A02.getClass();
                obj = ijt.A02.A0X;
                obj.getClass();
                this.A02 = obj;
            }
            A1C = AbstractC166987dD.A1C();
            A1C.append("media_placeholder_");
            i = A03;
            A03 = i + 1;
        } else {
            A1C = AbstractC166987dD.A1C();
            A1C.append("empty_space_");
            i = A04;
            A04 = i + 1;
        }
        A1C.append(i);
        obj = A1C.toString();
        this.A02 = obj;
    }
}
