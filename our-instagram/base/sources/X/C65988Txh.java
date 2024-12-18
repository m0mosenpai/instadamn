package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Txh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65988Txh extends C2UU {
    public boolean A02;
    public final UserSession A04;
    public final XAM A05;
    public int A00 = R.drawable.floating_button_background;
    public final View.OnClickListener A03 = new WNO(this, 39);
    public Integer A01 = C05F.A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        IgTextView igTextView;
        C65989Txi c65989Txi = (C65989Txi) c3oo;
        C0fQ.A00(this.A03, c65989Txi.A01);
        IgImageView igImageView = c65989Txi.A03;
        Resources resources = igImageView.getResources();
        int intValue = this.A01.intValue();
        int i2 = 8;
        if (intValue != 1) {
            if (intValue == 0) {
                igImageView.setImageResource(R.drawable.instagram_x_filled_small);
                igImageView.setContentDescription(resources.getString(2131954754));
                c65989Txi.A00.setBackgroundResource(this.A00);
                igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                igTextView = c65989Txi.A02;
            } else {
                return;
            }
        } else {
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            boolean booleanValue = C6PY.A00(userSession).booleanValue();
            int i3 = R.drawable.instagram_sparkles_outline_16;
            if (booleanValue) {
                i3 = R.drawable.instagram_effects_pano_outline_16;
            }
            igImageView.setImageResource(i3);
            igImageView.setContentDescription(resources.getString(2131961688));
            c65989Txi.A00.setBackgroundResource(R.drawable.floating_button_black_background);
            igImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            igTextView = c65989Txi.A02;
            if (this.A02) {
                i2 = 0;
            }
        }
        igTextView.setVisibility(i2);
    }

    public C65988Txh(UserSession userSession, XAM xam) {
        this.A04 = userSession;
        this.A05 = xam;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        C0f9.A0A(843534127, C0f9.A03(584279080));
        return 1;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C65989Txi(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.floating_button_layout));
    }
}
