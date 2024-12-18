package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.09Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09Y {
    public final C07270a1 A02(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        String A01 = AbstractC153636vY.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        C14360o3.A0B(A01, 0);
        if (A01.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
            C023409i A00 = A00();
            C07270a1 c07270a1 = A00.A08;
            if (c07270a1 != null) {
                if (!A01.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
                    C0w9.A03("logged_out_session_token_mismatch", AnonymousClass001.A13("requested logged out session (", A01, ") does not match current user session (", "IgSessionManager.LOGGED_OUT_TOKEN", ") which was last set by ", C023409i.A09));
                }
                return c07270a1;
            }
            C023309h c023309h = A00.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(" - thread: ");
            sb.append(Thread.currentThread());
            throw new IllegalStateException(AnonymousClass001.A0R("mCurrentLoggedOutSession is null", sb.toString()), c023309h);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final C07270a1 A03(C08V c08v) {
        C07270a1 c07270a1;
        C14360o3.A0B(c08v, 0);
        Class<?> cls = c08v.getClass();
        C14360o3.A0B(cls, 0);
        String name = cls.getName();
        StringBuilder sb = new StringBuilder(name.length() + 11);
        sb.append("<cls>");
        sb.append(name);
        sb.append("</cls>");
        String obj = sb.toString();
        C14360o3.A07(obj);
        C023409i.A09 = obj;
        C023409i A00 = A00();
        synchronized (A00) {
            C07270a1 c07270a12 = A00.A08;
            if (c07270a12 != null && !c07270a12.A01) {
                c07270a12.A06();
            }
            c07270a1 = new C07270a1(A00.A01);
            A00.A08 = c07270a1;
        }
        return c07270a1;
    }

    @Deprecated(message = "getSession is unsafe and can crash when concurrent logout occurs", replaceWith = @ReplaceWith(expression = "requireSession()", imports = {"com.instagram.base.fragment.extensions.requireSession"}))
    public final AbstractC18680vv A04(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        String A01 = AbstractC153636vY.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        C14360o3.A0B(A01, 0);
        if (A01.equals("IgSessionManager.LOGGED_OUT_TOKEN")) {
            C07270a1 c07270a1 = A00().A08;
            if (c07270a1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            return c07270a1;
        }
        return A00().A03(A01);
    }

    public final AbstractC18680vv A05(Object obj) {
        C14360o3.A0B(obj, 0);
        C023409i A00 = A00();
        AbstractC18680vv abstractC18680vv = A00.A05.A00;
        if (abstractC18680vv == null && (abstractC18680vv = A00.A08) == null) {
            throw new IllegalStateException("Both UserSession and LoggedOutSession are null");
        }
        return abstractC18680vv;
    }

    @Deprecated(message = "getUserSession is unsafe and can crash when concurrent logout occurs", replaceWith = @ReplaceWith(expression = "requireUserSession()", imports = {"com.instagram.base.fragment.extensions.requireUserSession"}))
    public final UserSession A06(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        return A00().A03(bundle.getString("IgSessionManager.SESSION_TOKEN_KEY"));
    }

    public final UserSession A08(Object obj) {
        C14360o3.A0B(obj, 0);
        UserSession A00 = A00().A00();
        if (A00 != null) {
            return A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C023409i A00() {
        InterfaceC09390do interfaceC09390do = C09Z.A00;
        if (interfaceC09390do != null) {
            return (C023409i) interfaceC09390do.getValue();
        }
        throw new RuntimeException("IgSessionManager not initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1vw, java.lang.Object] */
    public static final void A01(boolean z) {
        C1KM.A09.A0M(z);
        C41451vu.A01.A01(new Object());
    }

    public final UserSession A07(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        UserSession userSession = A00().A05.A00;
        if (userSession == null || !AbstractC03260Dj.A00(str, userSession.token)) {
            return null;
        }
        return userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1.equals(r0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(com.instagram.common.session.UserSession r3) {
        /*
            r2 = this;
            X.0do r0 = X.C09Z.A00
            r1 = 1
            if (r0 == 0) goto L21
            boolean r0 = r0.CWa()
            if (r0 != r1) goto L21
            X.09i r0 = A00()
            X.0Gq r0 = r0.A05
            java.lang.String r1 = r3.userId
            if (r1 == 0) goto L25
            com.instagram.common.session.UserSession r0 = r0.A00
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.userId
        L1b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
        L21:
            r1 = 1
        L22:
            return r1
        L23:
            r0 = 0
            goto L1b
        L25:
            boolean r0 = r3.isStopped()
            r1 = 0
            if (r0 != 0) goto L22
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09Y.A09(com.instagram.common.session.UserSession):boolean");
    }

    public final boolean A0A(final InterfaceC03950Jk interfaceC03950Jk, final InterfaceC03960Jm interfaceC03960Jm, Object obj, final String str) {
        final C03390Gq c03390Gq = A00().A05;
        if (str != null) {
            InterfaceC02900Bo interfaceC02900Bo = c03390Gq.A01;
            if (interfaceC02900Bo.CPH(str)) {
                synchronized (c03390Gq) {
                    User BOa = interfaceC02900Bo.BOa(str);
                    if (BOa != null) {
                        UserSession A00 = C03390Gq.A00(c03390Gq, BOa, false);
                        ((C0Gp) A00.A01(C0Gp.class, C01V.A00)).A00.add(interfaceC03950Jk);
                        interfaceC03950Jk.ATX(A00, new InterfaceC03960Jm() { // from class: X.0t3
                            @Override // X.InterfaceC03960Jm
                            public final void AIn(Object obj2) {
                                C03390Gq.A02(C03390Gq.this, interfaceC03950Jk, str);
                                InterfaceC03960Jm interfaceC03960Jm2 = interfaceC03960Jm;
                                if (interfaceC03960Jm2 != null) {
                                    interfaceC03960Jm2.AIn(obj2);
                                }
                            }
                        }, obj);
                        return true;
                    }
                    return true;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("UserId(");
            sb.append(str);
            sb.append(") requesting operation(");
            sb.append(interfaceC03950Jk.getClass());
            sb.append(") is not an authenticated user.");
            C0w9.A03("user_not_authenticated", sb.toString());
            return false;
        }
        return false;
    }
}
