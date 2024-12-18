package X;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Mm6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51345Mm6 extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final EditText A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final C51374MmZ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51345Mm6(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC166997dE.A0S(view, R.id.highlight_cover_container);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.highlight_cover_image);
        this.A00 = AbstractC166997dE.A0S(view, R.id.highlight_card_cover_image);
        this.A06 = new C51374MmZ(view);
        this.A02 = AbstractC166997dE.A0S(view, R.id.highlight_title_container);
        this.A03 = (EditText) AbstractC166997dE.A0R(view, R.id.highlight_title);
        this.A04 = AbstractC167007dF.A0N(view, R.id.edit_cover_link);
    }
}
