package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KM6 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C4El A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM6(C4El c4El, String str) {
        super(454693070, 3, false, false);
        this.A00 = c4El;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4El c4El = this.A00;
        String str = this.A01;
        synchronized (c4El) {
            UserSession userSession = c4El.A07;
            C47909LEd c47909LEd = AbstractC46874KoH.A00(userSession).A00;
            if (c47909LEd != null) {
                MH2 mh2 = MH2.A00;
                C14360o3.A0B(mh2, 1);
                C47909LEd.A00(c47909LEd, new DSZ(mh2, c47909LEd, str, 4));
                ((C9Q0) userSession.A01(C9Q0.class, new C209889Pz(userSession))).A00.add(str);
            }
        }
    }
}
