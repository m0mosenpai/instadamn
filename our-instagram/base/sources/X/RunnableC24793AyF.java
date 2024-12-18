package X;

import android.app.Activity;

/* renamed from: X.AyF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24793AyF implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C189478aR A02;

    public RunnableC24793AyF(Activity activity, AbstractC59962oe abstractC59962oe, C189478aR c189478aR) {
        this.A02 = c189478aR;
        this.A00 = activity;
        this.A01 = abstractC59962oe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189478aR c189478aR = this.A02;
        Activity activity = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        C14360o3.A0A(abstractC59962oe);
        c189478aR.A02(activity, abstractC59962oe);
        c189478aR.A09(4);
    }
}
