package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gw5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38484Gw5 extends C3OO {
    public TextView A00;
    public TextView A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC09390do A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38484Gw5(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = J8X.A00(view, 7);
        InterfaceC56392iX A0M = AbstractC31179DnN.A0M(view, R.id.attribution_stub);
        this.A02 = A0M;
        this.A03 = AbstractC31179DnN.A0M(view, R.id.featured_product_permission_overlay);
        A0M.EZv(new C42365IpS(this, 1));
    }
}
