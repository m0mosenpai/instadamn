package X;

import android.app.Activity;

/* renamed from: X.AyJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24797AyJ implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C77133cz A01;
    public final /* synthetic */ InterfaceC116795Qi A02;

    public RunnableC24797AyJ(Activity activity, C77133cz c77133cz, InterfaceC116795Qi interfaceC116795Qi) {
        this.A00 = activity;
        this.A02 = interfaceC116795Qi;
        this.A01 = c77133cz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU A0U = AbstractC167007dF.A0U(this.A00, 2131956704);
        A0U.A03 = this.A02;
        A0U.A02();
        A0U.A00 = 5000;
        A0U.A0A = true;
        AbstractC166997dE.A1P(A0U);
        InterfaceC19610xo A0w = AbstractC166987dD.A0w((C23031Ai) AbstractC84973ql.A00(this.A01.A00).A06.A07.getValue());
        A0w.E77("content_note_recycle_ufi_tooltip_shown", true);
        A0w.apply();
    }
}
