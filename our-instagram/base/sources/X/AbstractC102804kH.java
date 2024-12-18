package X;

/* renamed from: X.4kH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102804kH {
    public static int A00(String str) {
        int length;
        if (str != null && (length = str.length()) != 0 && str.offsetByCodePoints(0, 1) == length) {
            return str.codePointAt(0);
        }
        return -1;
    }
}
