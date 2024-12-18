package X;

import android.content.Context;

/* renamed from: X.Rby, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60944Rby extends AbstractRunnableC14200nk {
    public final /* synthetic */ C1HA A00;

    @Override // java.lang.Runnable
    public final void run() {
        Context context = AbstractC12290kX.A00;
        if (context != null) {
            context.getSharedPreferences("ig_connection_type", 0).edit().putString("last_type", this.A00.A01).commit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60944Rby(C1HA c1ha) {
        super(1521204412);
        this.A00 = c1ha;
    }
}
