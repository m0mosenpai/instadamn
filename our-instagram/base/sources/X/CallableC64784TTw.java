package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.TTw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC64784TTw implements Callable {
    public final /* synthetic */ Context A00;

    public CallableC64784TTw(Context context) {
        this.A00 = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return AbstractC58318PtA.A0F(this.A00, "google_sdk_flags");
    }
}
