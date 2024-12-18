package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.D8g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29710D8g extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C57I A03;
    public final /* synthetic */ InterfaceC117845Uu A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29710D8g(Context context, View view, C57I c57i, InterfaceC117845Uu interfaceC117845Uu, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(0);
        this.A01 = context;
        this.A05 = interfaceC16660sJ;
        this.A03 = c57i;
        this.A04 = interfaceC117845Uu;
        this.A00 = i;
        this.A02 = view;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        C57I c57i = this.A03;
        InterfaceC117845Uu interfaceC117845Uu = this.A04;
        int i = this.A00;
        KeyEvent.Callback callback = this.A02;
        C14360o3.A0C(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new BT9(context, c57i, interfaceC117845Uu, (InterfaceC1128457r) callback, interfaceC16660sJ, i).A0N;
    }
}
