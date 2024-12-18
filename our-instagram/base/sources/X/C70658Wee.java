package X;

import com.facebook.react.bridge.Callback;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.Wee, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70658Wee implements XCQ {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ IgReactBoostPostModule A02;

    public C70658Wee(Callback callback, Callback callback2, IgReactBoostPostModule igReactBoostPostModule) {
        this.A02 = igReactBoostPostModule;
        this.A01 = callback;
        this.A00 = callback2;
    }

    @Override // X.XCQ
    public final void Dwe() {
        this.A00.invoke(new Object[0]);
    }

    @Override // X.XCQ
    public final void E65(String str) {
        this.A01.invoke(str);
    }
}
