package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.Mlo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51327Mlo extends C3OO {
    public final View A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgAutoCompleteTextView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51327Mlo(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = (IgAutoCompleteTextView) AbstractC166987dD.A0c(view, R.id.caption_text_view);
        this.A01 = (FrameLayout) AbstractC166987dD.A0c(view, R.id.preview_container);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.preview);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.preview_text_overlay);
        this.A00 = AbstractC166987dD.A0c(view, R.id.preview_legibility_gradient);
    }
}
