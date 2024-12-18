package X;

import android.view.View;

/* renamed from: X.Twt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65948Twt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C65934Twf A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ C57112jm A04;
    public final /* synthetic */ java.util.Set A05;

    public RunnableC65948Twt(View view, C65934Twf c65934Twf, C102884kP c102884kP, C57112jm c57112jm, java.util.Set set, int i) {
        this.A04 = c57112jm;
        this.A01 = view;
        this.A05 = set;
        this.A03 = c102884kP;
        this.A02 = c65934Twf;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A05(this.A01, C59062n7.A07);
        this.A05.remove(this.A03);
        this.A02.A01.remove(this.A00);
    }
}
