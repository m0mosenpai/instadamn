package X;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;

/* renamed from: X.X2n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71767X2n extends C03E implements InterfaceC16660sJ {
    public C71767X2n(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        C14360o3.A0B(windowLayoutInfo, 0);
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        return C0eB.A00;
    }
}
