package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes4.dex */
public final class AT3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IgTextView A01;
    public final /* synthetic */ CharSequence A02;

    public AT3(IgTextView igTextView, CharSequence charSequence, int i) {
        this.A01 = igTextView;
        this.A02 = charSequence;
        this.A00 = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        IgTextView igTextView = this.A01;
        igTextView.setText(this.A02);
        int i9 = this.A00;
        float A08 = AbstractC166987dD.A08(view);
        float f = 1.3f;
        if (i9 == R.layout.layout_superlative_conclusion_card_item_top_post) {
            f = 2.5f;
        }
        igTextView.setTextSize(0, A08 / f);
    }
}
