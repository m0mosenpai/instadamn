package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UCZ extends LinearLayout implements X9f {
    public UvD A00;

    @Override // X.X9f
    public void setViewModel(UvD uvD) {
        C14360o3.A0B(uvD, 0);
        this.A00 = uvD;
        View A0S = AbstractC166997dE.A0S(this, R.id.card_scan_container);
        A0S.setOnClickListener(new WNN(this, 17));
        Context A0L = AbstractC166997dE.A0L(this);
        int A00 = WFM.A00(A0L, R.attr.fbpay_ui_card_scan_cell_padding);
        int A002 = WFM.A00(A0L, R.attr.fbpay_ui_card_scan_cell_padding_top);
        int A003 = WFM.A00(A0L, R.attr.fbpay_ui_card_scan_cell_padding_left);
        UvD uvD2 = this.A00;
        if (uvD2 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (uvD2.A00) {
            A003 = 0;
        } else {
            A002 = A00;
        }
        Integer valueOf = Integer.valueOf(A003);
        Integer valueOf2 = Integer.valueOf(A00);
        WFM.A02(A0S, valueOf, valueOf2, Integer.valueOf(A002), valueOf2);
    }
}
