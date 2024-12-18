package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AT4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C23090AFy A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;

    public AT4(UserSession userSession, C23090AFy c23090AFy, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        this.A01 = c23090AFy;
        this.A00 = userSession;
        this.A03 = interfaceC41201vU;
        this.A02 = c84823qW;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C23090AFy c23090AFy = this.A01;
        UserSession userSession = this.A00;
        InterfaceC41201vU interfaceC41201vU = this.A03;
        C84823qW c84823qW = this.A02;
        C14360o3.A0A(view);
        C23090AFy.A00(view, userSession, c23090AFy, c84823qW, interfaceC41201vU);
    }
}
