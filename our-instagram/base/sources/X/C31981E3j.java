package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.E3j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31981E3j extends C3OO {
    public View A00;
    public View A01;
    public CheckBox A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public IgdsSwitch A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31981E3j(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = AbstractC167007dF.A0N(view, R.id.row_simple_text_textview);
        this.A06 = (IgdsSwitch) AbstractC166997dE.A0R(view, R.id.row_menu_item_switch);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_simple_text_description);
        this.A04 = AbstractC167007dF.A0N(view, R.id.row_simple_text_detail);
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_divider);
        this.A02 = (CheckBox) AbstractC166997dE.A0R(view, R.id.checkbox);
        this.A01 = AbstractC166997dE.A0S(view, R.id.row_switch_item_view);
    }
}
