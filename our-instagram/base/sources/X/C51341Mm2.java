package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mm2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51341Mm2 extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51341Mm2(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A05 = AbstractC37302Gc3.A0K(view, R.id.icon);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.title);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.message);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.primary_button);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.dismiss_button);
    }
}
