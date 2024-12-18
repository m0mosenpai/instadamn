package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.0bF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07950bF extends AbstractC23551Cr {
    public static final C07880b8 A04 = new Object();
    public boolean A00;
    public final UserSession A01;
    public final C1Do A02;
    public final C0KX A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.0KX] */
    public /* synthetic */ C07950bF(C16L c16l, UserSession userSession, C1Do c1Do) {
        ?? obj = new Object();
        ((AbstractC23551Cr) this).A00 = c16l;
        this.A01 = userSession;
        this.A02 = c1Do;
        this.A03 = obj;
    }

    public final User A1U(User user, boolean z) {
        C1Do c1Do;
        try {
            if (user != null) {
                UserSession userSession = this.A01;
                if (!C18U.A06(C06090Tz.A05, userSession, 36327164104161621L) && (c1Do = this.A02) != null) {
                    c1Do.A01(user);
                }
                return AnonymousClass189.A00(userSession).A01(user, z, false);
            }
            throw new IOException("User must not be null");
        } catch (C90093zq unused) {
            throw new IOException("User ID does not exist in the user object.");
        }
    }

    @Override // X.AbstractC23551Cr, X.C16L, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1Do c1Do = this.A02;
        if (c1Do != null) {
            c1Do.A00();
        }
        super.close();
    }
}
