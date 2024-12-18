package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class OZJ {
    public static final OZJ A00 = new Object();

    public static final void A00(Drawable drawable, View.OnClickListener onClickListener, O9K o9k, Integer num, Integer num2, Integer num3, String str) {
        View view = o9k.A00;
        if (view != null) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.self_remediation_action_title);
            View A0S = AbstractC166997dE.A0S(view, R.id.self_remediation_action_subtitle);
            view.setVisibility(0);
            C0fQ.A00(onClickListener, view);
            A0N.setText(str);
            if (num != null) {
                A0N.setTextColor(num.intValue());
            }
            A0S.setVisibility(8);
        }
        IgdsListCell igdsListCell = o9k.A01;
        if (igdsListCell != null) {
            igdsListCell.setVisibility(0);
            igdsListCell.setTextCellType(EnumC53237Nga.A04);
            igdsListCell.A0I(str);
            if (num2 != null) {
                igdsListCell.setTitleTextColorContrib(num2.intValue());
            }
            if (drawable != null) {
                igdsListCell.A09(drawable);
                if (num3 != null) {
                    igdsListCell.setIconColorContrib(num3.intValue());
                }
            }
            C0fQ.A00(onClickListener, igdsListCell);
        }
    }
}
