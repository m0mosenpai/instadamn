package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Doi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31260Doi implements Runnable {
    public final /* synthetic */ C31255Dod A00;

    public RunnableC31260Doi(C31255Dod c31255Dod) {
        this.A00 = c31255Dod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!C31518Dt2.A05()) {
            C31255Dod c31255Dod = this.A00;
            Fragment fragment = c31255Dod.A02;
            C31518Dt2.A01(fragment.requireContext(), fragment, EnumC31512Dsw.A04, c31255Dod.A03, C05F.A0C);
        }
    }
}
