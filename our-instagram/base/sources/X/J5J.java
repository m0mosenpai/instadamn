package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes7.dex */
public final class J5J implements Runnable {
    public final /* synthetic */ C64052vQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public J5J(C64052vQ c64052vQ, String str, String str2) {
        this.A00 = c64052vQ;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64052vQ c64052vQ = this.A00;
        if (c64052vQ.A02 == null) {
            String str = this.A02;
            String str2 = this.A01;
            c64052vQ.A02 = C05F.A00;
            c64052vQ.A05 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("trigger_type", "dwell", AbstractC166987dD.A1L("multi_ads_unit_id", str), AbstractC166987dD.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c64052vQ.A09.userId)));
            c64052vQ.A01 = C05F.A01;
            c64052vQ.A04 = str2;
        }
    }
}
