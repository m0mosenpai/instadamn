package X;

import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.M3d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49936M3d implements Runnable {
    public final /* synthetic */ InterfaceC135846Cm A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public RunnableC49936M3d(InterfaceC135846Cm interfaceC135846Cm, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = interfaceC135846Cm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.invoke(new MailboxFeature(this.A00));
    }
}
