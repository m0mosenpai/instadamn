package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NGd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52382NGd extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C23591Acl A01;
    public final /* synthetic */ InterfaceC57948Pmu A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52382NGd(UserSession userSession, C23591Acl c23591Acl, InterfaceC57948Pmu interfaceC57948Pmu) {
        super(426, 4, false, false);
        this.A01 = c23591Acl;
        this.A00 = userSession;
        this.A02 = interfaceC57948Pmu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A01.A03();
        } finally {
            if (C18U.A06(C06090Tz.A05, this.A00, 36320103175823424L)) {
                this.A02.DO5();
            }
        }
    }
}
