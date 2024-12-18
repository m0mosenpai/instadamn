package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.GwH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38496GwH extends C3OO {
    public final View A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgView A05;
    public final IgView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38496GwH(View view, View view2, IgTextView igTextView, IgTextView igTextView2) {
        super(view);
        AbstractC25233BEq.A0w(2, view2, igTextView, igTextView2);
        this.A01 = view2;
        this.A04 = igTextView;
        this.A02 = igTextView2;
        this.A06 = (IgView) AbstractC166997dE.A0R(view, R.id.top_divider);
        this.A05 = (IgView) AbstractC166997dE.A0R(view, R.id.bottom_divider);
        this.A00 = AbstractC166997dE.A0S(view, R.id.fundraiser_banner_chevron);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.fundraiser_owner_attribution_text);
    }
}
