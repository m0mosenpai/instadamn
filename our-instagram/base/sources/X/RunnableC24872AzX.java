package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AzX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24872AzX implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C84823qW A03;
    public final /* synthetic */ C97564Zr A04;

    public RunnableC24872AzX(View view, ViewGroup viewGroup, UserSession userSession, C84823qW c84823qW, C97564Zr c97564Zr) {
        this.A03 = c84823qW;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A04 = c97564Zr;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        C84823qW c84823qW = this.A03;
        View view = this.A00;
        ViewGroup viewGroup = this.A01;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        InterfaceC41201vU interfaceC41201vU = this.A04.A03;
        if (interfaceC41201vU != null) {
            f = interfaceC41201vU.Ack(this.A02);
        } else {
            f = 0.0f;
        }
        C138436Oz.A04(view, c84823qW, f, width, height, false);
    }
}
