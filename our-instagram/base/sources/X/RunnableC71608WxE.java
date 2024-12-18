package X;

import java.util.Map;

/* renamed from: X.WxE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71608WxE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70498WZf A01;
    public final /* synthetic */ Exception A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public RunnableC71608WxE(C70498WZf c70498WZf, Exception exc, Map map, int i, boolean z) {
        this.A01 = c70498WZf;
        this.A02 = exc;
        this.A04 = z;
        this.A00 = i;
        this.A03 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XCB xcb = this.A01.A00;
        Exception exc = this.A02;
        boolean z = this.A04;
        xcb.DGA(exc, this.A03, this.A00, z);
    }
}
