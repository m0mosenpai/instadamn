package X;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.WZf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70498WZf implements XCB {
    public final XCB A00;
    public final ExecutorService A01;

    @Override // X.XCB
    public final void D6j(String str, int i, Map map) {
        this.A01.execute(new RunnableC71598Wwu(this, str, map, i));
    }

    @Override // X.XCB
    public final void DGA(Exception exc, Map map, int i, boolean z) {
        this.A01.execute(new RunnableC71608WxE(this, exc, map, i, z));
    }

    public C70498WZf(XCB xcb, ExecutorService executorService) {
        this.A00 = xcb;
        this.A01 = executorService;
    }
}
