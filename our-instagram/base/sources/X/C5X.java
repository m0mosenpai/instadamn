package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes5.dex */
public final class C5X extends AbstractC25917BdK {
    public final Drawable A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgCheckBox A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final RoundedCornerImageView A09;
    public final /* synthetic */ C25898Bcz A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5X(View view, C25898Bcz c25898Bcz, int i) {
        super(view);
        RoundedCornerImageView roundedCornerImageView;
        C14360o3.A0B(view, 2);
        this.A0A = c25898Bcz;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.primary_text);
        this.A02 = A0N;
        this.A03 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.tertiary_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.dot);
        this.A07 = AbstractC167007dF.A0T(view, R.id.image);
        if (i == 1) {
            roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.square_image);
        } else {
            roundedCornerImageView = null;
        }
        this.A09 = roundedCornerImageView;
        this.A05 = (IgCheckBox) AbstractC166997dE.A0R(view, R.id.save_button);
        this.A06 = c25898Bcz.A0B ? (IgImageView) view.requireViewById(R.id.chevron_button) : null;
        this.A08 = AbstractC167007dF.A0T(view, R.id.trending_arrow);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = AbstractC85953sP.A01(A0L, R.drawable.music_explicit, AbstractC53242c7.A0B(A0L));
        AbstractC85953sP.A04(A0N);
    }
}
