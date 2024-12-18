package X;

import android.os.Bundle;

/* renamed from: X.AwM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24681AwM implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ KCD A01;

    public RunnableC24681AwM(Bundle bundle, KCD kcd) {
        this.A01 = kcd;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C81Y c81y = this.A01.A00;
        if (c81y != null) {
            c81y.A00.A0w.onSaveInstanceState(this.A00);
        }
    }
}
