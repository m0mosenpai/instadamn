package X;

import java.util.Collection;

/* renamed from: X.5oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126965oa {
    public static void A01(InterfaceC65205Tfo interfaceC65205Tfo, String str, StringBuilder sb, Object... objArr) {
        String obj;
        Object[] objArr2;
        boolean z = true;
        for (Object obj2 : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            if (obj2 instanceof Collection) {
                objArr2 = ((Collection) obj2).toArray();
            } else if (obj2 instanceof Object[]) {
                objArr2 = (Object[]) obj2;
            } else {
                if (interfaceC65205Tfo != null && obj2 == null) {
                    obj = "n/a";
                } else {
                    obj = obj2.toString();
                }
                sb.append(obj);
            }
            A01(interfaceC65205Tfo, str, sb, objArr2);
        }
    }

    public static String A00(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        String[] split = str.split("\\s");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (split[i].length() != 0) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(Character.toUpperCase(split[i].charAt(0)));
                sb.append(split[i].substring(1));
            }
        }
        return sb.toString();
    }

    public static boolean A03(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean A04(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                return false;
            }
            return true;
        }
        return str.equals(str2);
    }

    public static boolean A02(CharSequence charSequence) {
        if (!A03(charSequence)) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
