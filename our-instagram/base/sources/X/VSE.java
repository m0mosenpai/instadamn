package X;

/* loaded from: classes11.dex */
public abstract class VSE {
    public static final float A00(C102884kP c102884kP, int i) {
        String A0L = c102884kP.A0L(i);
        if (A0L == null) {
            return 0.0f;
        }
        try {
            return C6BE.A01(A0L);
        } catch (C41M unused) {
            AbstractC25241Le.A02("BloksModelUtils", AnonymousClass001.A0R("Error parsing pixel value ", A0L));
            return 0.0f;
        }
    }
}
