package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.GQt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36976GQt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ C23031Ai A05;

    public RunnableC36976GQt(Activity activity, View view, View view2, C23031Ai c23031Ai, int i, int i2) {
        this.A04 = view;
        this.A02 = activity;
        this.A01 = i;
        this.A03 = view2;
        this.A05 = c23031Ai;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.A02;
        C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(this.A01));
        A0f.A01();
        A0f.A03(this.A03);
        AbstractC166997dE.A1P(A0f);
        this.A05.A0z(AbstractC111324zv.A00(5076), this.A00 + 1);
    }
}
