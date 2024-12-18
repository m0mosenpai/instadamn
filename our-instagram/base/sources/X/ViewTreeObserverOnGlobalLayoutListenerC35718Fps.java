package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Fps, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35718Fps implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C51758Mth A01;
    public final /* synthetic */ InterfaceC1569372x A02;
    public final /* synthetic */ E30 A03;
    public final /* synthetic */ C32077E8b A04;

    public ViewTreeObserverOnGlobalLayoutListenerC35718Fps(View view, C51758Mth c51758Mth, InterfaceC1569372x interfaceC1569372x, E30 e30, C32077E8b c32077E8b) {
        this.A02 = interfaceC1569372x;
        this.A03 = e30;
        this.A04 = c32077E8b;
        this.A01 = c51758Mth;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A02.DMe(this.A03.A00, this.A01, this.A04.A01);
        AbstractC166997dE.A1K(this.A00, this);
    }
}
