package X;

import android.view.ContextThemeWrapper;

/* renamed from: X.WrE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71284WrE implements Runnable {
    public final /* synthetic */ C67726Uws A00;

    public RunnableC71284WrE(C67726Uws c67726Uws) {
        this.A00 = c67726Uws;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SNQ A0H = C2FP.A0H();
        C67726Uws c67726Uws = this.A00;
        ContextThemeWrapper contextThemeWrapper = c67726Uws.A00;
        if (contextThemeWrapper == null) {
            C14360o3.A0F("wrapperContext");
            throw C00O.createAndThrow();
        }
        AbstractC65702TsY.A0v(contextThemeWrapper, C67726Uws.A01(c67726Uws), A0H);
    }
}
