package X;

/* renamed from: X.0px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15420px {
    public static final String A00(C0s3 c0s3) {
        String obj = c0s3.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
