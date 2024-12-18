package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.shopping.widget.pdp.cta.CustomCTAButton;

/* renamed from: X.Gvu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38473Gvu extends C3OO {
    public final View A00;
    public final TextView A01;
    public final CustomCTAButton A02;
    public final CustomCTAButton A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38473Gvu(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = (CustomCTAButton) view.requireViewById(R.id.button);
        this.A03 = (CustomCTAButton) view.requireViewById(R.id.secondary_button);
        this.A01 = AbstractC166997dE.A0T(view, R.id.message);
    }
}
