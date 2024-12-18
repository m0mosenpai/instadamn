package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.Wua, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71474Wua implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C66359UCf A01;

    public RunnableC71474Wua(Context context, C66359UCf c66359UCf) {
        this.A00 = context;
        this.A01 = c66359UCf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        C5SU A0U = AbstractC167007dF.A0U((Activity) context, 2131970469);
        A0U.A03(this.A01);
        A0U.A02();
        A0U.A0B = false;
        A0U.A0A = true;
        AbstractC166997dE.A1P(A0U);
    }
}
