package X;

import java.util.Arrays;

/* renamed from: X.SNr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62727SNr {
    public SGR A00;
    public final SGR A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SGR, java.lang.Object] */
    public final void A00(Object obj, String str) {
        ?? obj2 = new Object();
        this.A00.A00 = obj2;
        this.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public final String toString() {
        StringBuilder A0q = AbstractC58318PtA.A0q(32);
        A0q.append(this.A02);
        A0q.append('{');
        SGR sgr = this.A01.A00;
        String str = "";
        while (sgr != null) {
            Object obj = sgr.A01;
            A0q.append(str);
            String str2 = sgr.A02;
            if (str2 != null) {
                AbstractC58322PtE.A1S(A0q, str2);
            }
            if (obj != null && obj.getClass().isArray()) {
                A0q.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            } else {
                A0q.append(obj);
            }
            sgr = sgr.A00;
            str = ", ";
        }
        return AbstractC167027dH.A0R(A0q);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SGR, java.lang.Object] */
    public /* synthetic */ C62727SNr(String str) {
        ?? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        str.getClass();
        this.A02 = str;
    }
}
