package X;

import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: X.TKh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64570TKh implements Runnable {
    public final /* synthetic */ LogBoxModule A00;

    public RunnableC64570TKh(LogBoxModule logBoxModule) {
        this.A00 = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0I2.A03("ReactNative", "Unable to launch logbox because react was unable to create the root view");
    }
}
