package X;

import com.instagram.common.session.UserSession;
import java.util.EnumSet;

/* renamed from: X.5iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123595iY extends AbstractRunnableC14200nk {
    public final /* synthetic */ C4QT A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C123595iY(C4QT c4qt, String str) {
        super(698);
        this.A00 = c4qt;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4QT c4qt = this.A00;
        EnumSet enumSet = C4QT.A1M;
        UserSession userSession = c4qt.A0m;
        if (C18U.A06(C06090Tz.A05, userSession, 36320756010853235L)) {
            AbstractC46782Cq.A00(userSession).A00(this.A01);
        } else {
            AbstractC54278Nyy.A00(userSession).A00(this.A01);
        }
    }
}
