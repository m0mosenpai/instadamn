package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2sA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62092sA extends AbstractC62022s3 {
    public final Context A00;
    public final UserSession A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328057458277482L)) {
            if (C18U.A06(c06090Tz, userSession, 36328057458474093L) && !this.A02.compareAndSet(false, true)) {
                return;
            }
            if (C18U.A06(c06090Tz, userSession, 36328057458211945L)) {
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new NGF(this));
                return;
            }
            AbstractC2044993i.A00(userSession).A09(this.A00, userSession.userId, false, true);
        }
    }

    public C62092sA(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
