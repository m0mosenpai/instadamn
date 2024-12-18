package X;

import android.view.View;

/* renamed from: X.WxA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71604WxA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C65934Twf A02;
    public final /* synthetic */ C6FG A03;
    public final /* synthetic */ C57112jm A04;

    public RunnableC71604WxA(View view, C65934Twf c65934Twf, C6FG c6fg, C57112jm c57112jm, int i) {
        this.A04 = c57112jm;
        this.A01 = view;
        this.A02 = c65934Twf;
        this.A03 = c6fg;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A05(this.A01, C65934Twf.A00(this.A02, this.A03, this.A00));
    }
}
