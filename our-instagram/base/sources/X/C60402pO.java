package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60402pO extends C1KC {
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60402pO(UserSession userSession) {
        super("scheduleInitLocationPlugin");
        this.A00 = userSession;
    }

    @Override // X.C1KC
    public final boolean onQueueIdle() {
        C1GJ.A03(new C11R() { // from class: X.3VG
            public C1VW A00;

            @Override // X.C11R
            public final String getName() {
                return "LocationPlugin";
            }

            @Override // X.C11R
            public final int getRunnableId() {
                return 593;
            }

            @Override // X.C11R
            public final void onCancel() {
            }

            @Override // X.C11R
            public final void onStart() {
            }

            @Override // X.C11R
            public final void onFinish() {
                C1VW c1vw = this.A00;
                c1vw.getClass();
                UserSession userSession = C60402pO.this.A00;
                c1vw.setupPlaceSignatureCollection(userSession);
                this.A00.setupForegroundCollection(userSession);
            }

            @Override // X.C11R
            public final void run() {
                this.A00 = C1VW.A00;
            }
        });
        return false;
    }
}
