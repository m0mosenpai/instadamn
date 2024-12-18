package X;

import java.util.List;

/* renamed from: X.6AS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6AS {
    public static String A00(Integer num, List list) {
        char c = '|';
        if (num == C05F.A00) {
            c = '/';
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            sb.append(c);
            sb.append(obj);
        }
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        if (str2 != null && !str2.equals("")) {
            return AnonymousClass001.A0g(str, "#", str2);
        }
        return str;
    }
}
