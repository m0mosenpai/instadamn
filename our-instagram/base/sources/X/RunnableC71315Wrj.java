package X;

import android.opengl.EGL14;

/* renamed from: X.Wrj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71315Wrj implements Runnable {
    public final /* synthetic */ WEY A00;

    public RunnableC71315Wrj(WEY wey) {
        this.A00 = wey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WEY wey = this.A00;
        C178927x4 c178927x4 = new C178927x4(C178117vk.A06, 3);
        c178927x4.A09(EGL14.EGL_NO_CONTEXT, 1);
        wey.A00 = c178927x4;
        C70190WFt c70190WFt = new C70190WFt();
        c70190WFt.A00 = c70190WFt.A00;
        wey.A02 = c70190WFt;
        WEY.A02(wey);
    }
}
