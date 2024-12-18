package X;

import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: X.LQr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC48091LQr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ AnonymousClass983 A01;

    public ViewTreeObserverOnGlobalLayoutListenerC48091LQr(Window window, AnonymousClass983 anonymousClass983) {
        this.A01 = anonymousClass983;
        this.A00 = window;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r3 = this;
            X.983 r2 = r3.A01
            android.app.Activity r0 = X.AnonymousClass983.A00(r2)
            boolean r0 = X.C43687JTw.A02(r0)
            if (r0 == 0) goto L25
            android.app.Activity r1 = X.AnonymousClass983.A00(r2)
            r0 = 2131435262(0x7f0b1efe, float:1.8492361E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.slidingpanelayout.widget.SlidingPaneLayout r0 = (androidx.slidingpanelayout.widget.SlidingPaneLayout) r0
            if (r0 == 0) goto L21
            boolean r1 = r0.A08
            r0 = 8
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            X.AnonymousClass983.A0B(r2, r0)
        L25:
            android.view.Window r0 = r3.A00
            android.view.View r0 = r0.getDecorView()
            X.AbstractC166997dE.A1K(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC48091LQr.onGlobalLayout():void");
    }
}
