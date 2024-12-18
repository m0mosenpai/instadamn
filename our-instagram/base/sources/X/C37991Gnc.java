package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gnc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37991Gnc {
    public static final C37992Gnd A0A = new Object();
    public String A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final IgImageView A08;
    public final IgImageView A09;

    public C37991Gnc(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A03 = AbstractC166997dE.A0S(view, R.id.universal_cta_description_layout);
        this.A05 = AbstractC167007dF.A0N(view, R.id.universal_cta_text);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.universal_cta_subtitle);
        this.A07 = A0N;
        this.A08 = AbstractC167007dF.A0T(view, R.id.universal_cta_icon_rounded);
        this.A04 = AbstractC31176DnK.A0D(view, R.id.universal_cta_chevron);
        this.A02 = AbstractC166997dE.A0S(view, R.id.universal_cta_button_overlay);
        this.A06 = AbstractC167007dF.A0N(view, R.id.universal_cta_follow_cta_text);
        this.A09 = AbstractC167007dF.A0T(view, R.id.universal_cta_profile_pic);
        AbstractC37300Gc1.A0d(A0N, true);
    }
}
