package X;

import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* renamed from: X.ATg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23271ATg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ C60662pp A01;

    public ViewTreeObserverOnGlobalLayoutListenerC23271ATg(Configuration configuration, C60662pp c60662pp) {
        this.A01 = c60662pp;
        this.A00 = configuration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r0 != null) goto L12;
     */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r3 = this;
            X.2pp r1 = r3.A01     // Catch: java.lang.IllegalStateException -> L3a
            X.1qM r0 = r1.A06()     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L44
            boolean r0 = r0.A5P()     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L44
            X.2qk r0 = r1.A0A()     // Catch: java.lang.IllegalStateException -> L3a
            X.33P r0 = r0.A0F()     // Catch: java.lang.IllegalStateException -> L3a
            X.30E r2 = r0.A0G     // Catch: java.lang.IllegalStateException -> L3a
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L35
            boolean r0 = X.C86193sq.A00(r0)     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L2e
            X.4Qe r1 = X.EnumC95184Qe.A04     // Catch: java.lang.IllegalStateException -> L3a
            X.4QW r0 = r2.A05     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L44
        L2a:
            r0.Ed6(r1)     // Catch: java.lang.IllegalStateException -> L3a
            goto L44
        L2e:
            X.4Qe r1 = X.EnumC95184Qe.A03     // Catch: java.lang.IllegalStateException -> L3a
            X.4QW r0 = r2.A05     // Catch: java.lang.IllegalStateException -> L3a
            if (r0 == 0) goto L44
            goto L2a
        L35:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()     // Catch: java.lang.IllegalStateException -> L3a
            throw r0     // Catch: java.lang.IllegalStateException -> L3a
        L3a:
            X.0wb r2 = X.C18950wb.A01
            r1 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r0 = "Failed to get media"
            r2.AEp(r0, r1)
        L44:
            X.2pp r2 = r3.A01
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L4f
            X.AbstractC31175DnJ.A0i(r0)
        L4f:
            X.2qk r0 = r2.A0A()
            X.2xH r1 = r0.A0J()
            android.content.res.Configuration r0 = r3.A00
            r1.notifyDataSetChangedSmart(r0)
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L69
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L69
            r0.removeOnGlobalLayoutListener(r3)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC23271ATg.onGlobalLayout():void");
    }
}
