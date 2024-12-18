package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bdc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25935Bdc extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final RecyclerView A02;
    public final IgImageView A03;

    public C25935Bdc(View view) {
        super(view);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.section_title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.section_description);
        this.A03 = (IgImageView) AbstractC166987dD.A0c(view, R.id.image);
        this.A02 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.value_props_list_recycle_view);
    }
}
