package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.JrN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44740JrN extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgdsRadioButton A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44740JrN(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0T(this.itemView, R.id.theme_icon);
        this.A01 = AbstractC167007dF.A0N(this.itemView, R.id.theme_name);
        this.A05 = (IgdsRadioButton) AbstractC166997dE.A0R(this.itemView, R.id.theme_toggle);
        this.A04 = AbstractC31172DnG.A0a(this.itemView, R.id.theme_selected_overlay);
        this.A02 = AbstractC167007dF.A0N(this.itemView, R.id.theme_subtitle);
    }
}
