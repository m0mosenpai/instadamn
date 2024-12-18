package X;

import android.content.Context;
import android.widget.TextSwitcher;

/* renamed from: X.GPx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36954GPx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ TextSwitcher A02;

    public RunnableC36954GPx(Context context, TextSwitcher textSwitcher, int i) {
        this.A02 = textSwitcher;
        this.A01 = context;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.setCurrentText(AnonymousClass001.A0T(this.A01.getResources().getString(2131971750), AbstractC140936Yv.A00[this.A00], ' '));
    }
}
