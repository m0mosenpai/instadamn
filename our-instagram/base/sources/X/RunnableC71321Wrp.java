package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* renamed from: X.Wrp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71321Wrp implements Runnable {
    public final /* synthetic */ WFJ A00;

    public RunnableC71321Wrp(WFJ wfj) {
        this.A00 = wfj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WFJ wfj = this.A00;
        int i = WFJ.A0A;
        ColorDrawable colorDrawable = wfj.A05;
        View view = wfj.A06;
        colorDrawable.setBounds(new Rect(0, 0, view.getWidth(), view.getHeight()));
        view.getOverlay().add(colorDrawable);
        wfj.A02 = true;
        wfj.A00 = true;
        view.postDelayed(wfj.A07, 1500L);
    }
}
