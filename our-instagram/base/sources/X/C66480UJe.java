package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.UJe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66480UJe extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final CircularImageView A08;
    public final IgBouncyUfiButtonImageView A09;
    public final C131325wL A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66480UJe(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = view;
        this.A08 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.question_avatar);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.question_body);
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.question_like_count);
        this.A05 = AbstractC25230BEn.A0Q(view, R.id.question_delete_button);
        this.A07 = AbstractC25230BEn.A0Q(view, R.id.question_report_button);
        this.A09 = (IgBouncyUfiButtonImageView) AbstractC166987dD.A0c(view, R.id.question_like_button);
        this.A03 = AbstractC166987dD.A0c(view, R.id.question_sub_items);
        this.A00 = AbstractC166987dD.A0c(view, R.id.question_like_button_click_area);
        this.A01 = AbstractC166987dD.A0c(view, R.id.question_like_indication);
        this.A0A = new C131325wL();
    }
}
