package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes11.dex */
public final class UJH extends C3OO {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundedCornerImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJH(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A02 = AbstractC167007dF.A0N(viewGroup, R.id.row_section_title);
        this.A01 = AbstractC167007dF.A0N(viewGroup, R.id.row_section_subtitle);
        this.A03 = (RoundedCornerImageView) AbstractC166997dE.A0R(viewGroup, R.id.row_section_thumbnail);
    }
}
