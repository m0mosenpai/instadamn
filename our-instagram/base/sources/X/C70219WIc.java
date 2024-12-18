package X;

import android.os.OutcomeReceiver;

/* renamed from: X.WIc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70219WIc implements OutcomeReceiver {
    public final /* synthetic */ long A00;
    public final /* synthetic */ W4R A01;

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A01.A00.flowEndFail(this.A00, "REGISTRATION_ERROR", th.getMessage());
    }

    public C70219WIc(W4R w4r, long j) {
        this.A01 = w4r;
        this.A00 = j;
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        this.A01.A00.flowEndSuccess(this.A00);
    }
}
