package X;

/* renamed from: X.6Ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139796Ui {
    public static final int A00(String str) {
        int i;
        float A01;
        String obj = AbstractC001900j.A0B(str).toString();
        try {
            try {
            } catch (C41M unused) {
                if (obj != null) {
                    i = obj.length();
                } else {
                    i = 0;
                }
                StringBuilder sb = new StringBuilder(obj);
                if (Character.isDigit((char) obj.codePointAt(i - 1))) {
                    sb.append("dp");
                }
                A01 = C6BE.A01(sb.toString());
            }
            if (obj.length() == 0) {
                return 0;
            }
            A01 = C6BE.A02(obj);
            return (int) A01;
        } catch (C41M unused2) {
            return 0;
        }
    }
}
