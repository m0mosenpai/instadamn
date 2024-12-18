package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AzZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24874AzZ implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;
    public final /* synthetic */ C144546fa A04;

    public RunnableC24874AzZ(ViewGroup viewGroup, UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, C144546fa c144546fa) {
        this.A04 = c144546fa;
        this.A02 = c84823qW;
        this.A00 = viewGroup;
        this.A03 = interfaceC41201vU;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A04.A00;
        C84823qW c84823qW = this.A02;
        ViewGroup viewGroup = this.A00;
        C138436Oz.A04(view, c84823qW, this.A03.Ack(this.A01), viewGroup.getWidth(), viewGroup.getHeight(), true);
    }
}
