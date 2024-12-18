package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.GwJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38498GwJ extends C3OO {
    public C38509GwU A00;
    public C66479UJd A01;
    public C38487Gw8 A02;
    public final View A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38498GwJ(View view) {
        super(view);
        InterfaceC56392iX A0M = AbstractC31179DnN.A0M(view, R.id.product_card_stub);
        InterfaceC56392iX A0M2 = AbstractC31179DnN.A0M(view, R.id.unavailable_product_tile_stub);
        InterfaceC56392iX A0M3 = AbstractC31179DnN.A0M(view, R.id.checker_tile_stub);
        AbstractC25233BEq.A0x(3, A0M, A0M2, A0M3);
        this.A03 = view;
        this.A05 = A0M;
        this.A06 = A0M2;
        this.A04 = A0M3;
    }
}
