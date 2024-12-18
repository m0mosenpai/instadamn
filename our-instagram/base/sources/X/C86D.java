package X;

/* renamed from: X.86D, reason: invalid class name */
/* loaded from: classes4.dex */
public class C86D {
    public final C86E[] A00;

    public C86D(String str) {
        C86E[] c86eArr;
        int i;
        C86F c86f;
        if (str.equals("pre_capture")) {
            c86eArr = new C86E[5];
            i = Integer.MAX_VALUE;
            c86eArr[0] = new C86E(3, Integer.MAX_VALUE, true);
            c86eArr[1] = new C86E(2, Integer.MAX_VALUE, true);
            c86f = new C86F(0);
        } else {
            if (str.equals("post_capture")) {
                c86eArr = new C86E[]{new C86E(0, Integer.MAX_VALUE, false), new C86E(4, Integer.MAX_VALUE, false), new C86E(2, Integer.MAX_VALUE, false), new C86E(3, Integer.MAX_VALUE, false), new C86E(1, 4, false), new C86E(1, Integer.MAX_VALUE, false)};
                this.A00 = c86eArr;
            }
            c86eArr = new C86E[5];
            i = Integer.MAX_VALUE;
            c86eArr[0] = new C86E(0, Integer.MAX_VALUE, false);
            c86eArr[1] = new C86E(2, Integer.MAX_VALUE, true);
            c86f = new C86F(3);
            c86f.A00 = true;
        }
        c86eArr[2] = new C86E(c86f);
        c86eArr[3] = new C86E(1, 4, false);
        c86eArr[4] = new C86E(1, i, false);
        this.A00 = c86eArr;
    }
}
