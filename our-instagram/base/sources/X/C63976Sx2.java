package X;

import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.react.bridge.Callback;

/* renamed from: X.Sx2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63976Sx2 implements InterfaceC65484Tl1 {
    public final Callback A00;

    @Override // X.InterfaceC65484Tl1
    public final void DqC(String str) {
        this.A00.invoke(null, str);
    }

    @Override // X.InterfaceC65484Tl1
    public final void onFailure(Throwable th) {
        AbstractC58321PtD.A1K(this.A00, JsSegmentFetcherModule.createJsErrorObject(th));
    }

    public C63976Sx2(Callback callback) {
        this.A00 = callback;
    }
}
