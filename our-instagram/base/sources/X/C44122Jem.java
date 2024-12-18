package X;

import java.util.Arrays;

/* renamed from: X.Jem, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44122Jem {
    public C47591L0b A00;
    public final C47591L0b A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.L0b, java.lang.Object] */
    public static void A00(C44122Jem c44122Jem, Object obj, String str) {
        ?? obj2 = new Object();
        c44122Jem.A00.A00 = obj2;
        c44122Jem.A00 = obj2;
        obj2.A01 = obj;
        obj2.A02 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.A02);
        sb.append('{');
        String str = "";
        for (C47591L0b c47591L0b = this.A01.A00; c47591L0b != null; c47591L0b = c47591L0b.A00) {
            Object obj = c47591L0b.A01;
            sb.append(str);
            if (c47591L0b.A02 != null) {
                sb.append(c47591L0b.A02);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            str = ", ";
        }
        return AbstractC167027dH.A0R(sb);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L0b, java.lang.Object] */
    public C44122Jem(String str) {
        ?? obj = new Object();
        this.A01 = obj;
        this.A00 = obj;
        str.getClass();
        this.A02 = str;
    }
}
