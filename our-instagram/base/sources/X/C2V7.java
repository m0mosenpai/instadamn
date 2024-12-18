package X;

/* renamed from: X.2V7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2V7 extends C2V8 {
    public static final C2V7 A00 = new C2V8();

    @Override // X.C2V8
    public final AbstractC50812Vc A02(C2XE c2xe, Exception exc) {
        String str;
        String A0R = AnonymousClass001.A0R("DefaultErrorEventHandler:", c2xe.A02.A01.A07);
        if ((exc instanceof AnonymousClass412) && (str = (String) AbstractC001800i.A0J(((AnonymousClass412) exc).A01)) != null) {
            A0R = AnonymousClass001.A0T(A0R, str, ':');
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        C2YE.A01(A0R, C05F.A01, message);
        if (exc instanceof RuntimeException) {
            throw exc;
        }
        throw new RuntimeException(exc);
    }
}
