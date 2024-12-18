package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.NZf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52822NZf extends C51362MmN {
    public C3PX A00;
    public C3PX A01;
    public C3PX A02;

    @Override // X.C51362MmN
    public final void A00() {
        super.A00();
        C3PX c3px = this.A00;
        if (c3px.A01()) {
            c3px.A00().setOnClickListener(null);
            c3px.A00().setVisibility(8);
        }
        C3PX c3px2 = this.A02;
        if (c3px2.A01()) {
            c3px2.A00().setVisibility(8);
        }
        C3PX c3px3 = this.A01;
        if (c3px3.A01()) {
            c3px3.A00().setVisibility(8);
        }
        TextView textView = this.A07;
        textView.setEllipsize(null);
        textView.setSingleLine(false);
        LinearLayout linearLayout = this.A06;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(35));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2.weight == 1.0f && ((ViewGroup.LayoutParams) layoutParams2).width == 0) {
            layoutParams2.weight = 0.0f;
            ((ViewGroup.LayoutParams) layoutParams2).width = -2;
            linearLayout.setLayoutParams(layoutParams2);
        }
    }
}
