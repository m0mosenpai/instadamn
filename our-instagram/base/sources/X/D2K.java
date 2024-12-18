package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes5.dex */
public final class D2K implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C7Uo A02;
    public final /* synthetic */ String A03;

    public D2K(Activity activity, View view, C7Uo c7Uo, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = str;
        this.A02 = c7Uo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        C03O.A00(view, new D2R(this.A00, view, view, this.A02, this.A03));
    }
}
