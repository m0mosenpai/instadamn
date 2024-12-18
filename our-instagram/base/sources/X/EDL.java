package X;

/* loaded from: classes6.dex */
public final class EDL extends C40781ul {
    public int A00 = -2;

    public final Integer A00() {
        int i;
        int i2 = this.A00;
        for (Integer num : C05F.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    i = -2;
                    break;
                case 2:
                    i = 0;
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                    i = 2;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i == i2) {
                return num;
            }
        }
        return C05F.A01;
    }
}
