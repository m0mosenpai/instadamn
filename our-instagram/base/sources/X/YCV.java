package X;

/* loaded from: classes12.dex */
public final class YCV implements YNs {
    public final int A00;
    public final Object A01;

    public YCV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [X.YRK, java.lang.Object, X.YCa] */
    @Override // X.YNs
    public final YRK ASh(YRK yrk) {
        switch (this.A00) {
            case 0:
                YRK yrk2 = yrk;
                YNs[] yNsArr = (YNs[]) this.A01;
                int length = yNsArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        return yrk2;
                    }
                    yrk2 = yNsArr[length].ASh(yrk2);
                }
            case 1:
                return new C73411YCc(yrk, (YOv[]) this.A01);
            default:
                C72695XlO c72695XlO = (C72695XlO) this.A01;
                ?? obj = new Object();
                obj.A00 = yrk;
                obj.A01 = c72695XlO;
                return obj;
        }
    }
}
