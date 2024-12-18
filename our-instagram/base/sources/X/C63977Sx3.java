package X;

import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.react.bridge.Callback;

/* renamed from: X.Sx3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63977Sx3 implements InterfaceC65484Tl1 {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ JsSegmentFetcherModule A02;

    public C63977Sx3(JsSegmentFetcherModule jsSegmentFetcherModule, Callback callback, int i) {
        this.A02 = jsSegmentFetcherModule;
        this.A00 = i;
        this.A01 = callback;
    }

    @Override // X.InterfaceC65484Tl1
    public final void DqC(String str) {
        this.A02.registerSegmentInReactContext(this.A00, str, this.A01);
    }

    @Override // X.InterfaceC65484Tl1
    public final void onFailure(Throwable th) {
        AbstractC58321PtD.A1K(this.A01, JsSegmentFetcherModule.createJsErrorObject(th));
    }
}
