package X;

import android.view.View;

/* renamed from: X.04R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04R implements View.OnApplyWindowInsetsListener {
    public C011504d A00;
    public final C04N A01;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(final android.view.View r22, android.view.WindowInsets r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04R.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }

    public C04R(View view, C04N c04n) {
        C011504d c011504d;
        this.A01 = c04n;
        C011504d A00 = AbstractC009003e.A00(view);
        if (A00 != null) {
            c011504d = new C04Z(A00).A00.A00();
        } else {
            c011504d = null;
        }
        this.A00 = c011504d;
    }
}
