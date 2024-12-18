package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class SW7 {
    public final C62466SCt A00;
    public final String A01;

    public SW7(C62466SCt c62466SCt, java.util.Set set) {
        this.A01 = A00(set);
        this.A00 = c62466SCt;
    }

    public static String A00(java.util.Set set) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            RVX rvx = (RVX) ((S3Y) it.next());
            A1C.append(rvx.A00);
            A1C.append('/');
            A1C.append(rvx.A01);
            if (it.hasNext()) {
                A1C.append(' ');
            }
        }
        return A1C.toString();
    }
}
