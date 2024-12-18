package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ik7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLayoutChangeListenerC42038Ik7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ViewOnTouchListenerC97504Zk A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;

    public ViewOnLayoutChangeListenerC42038Ik7(UserSession userSession, ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        this.A01 = viewOnTouchListenerC97504Zk;
        this.A00 = userSession;
        this.A03 = interfaceC41201vU;
        this.A02 = c84823qW;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A01.A01(this.A00, this.A02, this.A03);
    }
}
