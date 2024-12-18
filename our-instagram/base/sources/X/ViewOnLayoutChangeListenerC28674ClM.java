package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ClM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC28674ClM implements View.OnLayoutChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ BOH A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;

    public ViewOnLayoutChangeListenerC28674ClM(UserSession userSession, BOH boh, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        this.A01 = boh;
        this.A00 = userSession;
        this.A03 = interfaceC41201vU;
        this.A02 = c84823qW;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A01.A00(this.A00, this.A02, this.A03);
    }
}
