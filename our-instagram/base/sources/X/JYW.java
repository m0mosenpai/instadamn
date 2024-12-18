package X;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* loaded from: classes8.dex */
public final class JYW extends C3OO {
    public final View A00;
    public final View A01;
    public final EditText A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final AnimatedHintsTextLayout A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JYW(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = AbstractC166997dE.A0S(view, R.id.search_row);
        this.A03 = AbstractC31176DnK.A0D(view, R.id.action_button);
        this.A05 = AbstractC31176DnK.A0D(view, R.id.search_bar_glyph);
        this.A04 = AbstractC31176DnK.A0D(view, R.id.custom_action_button_v2);
        this.A07 = (AnimatedHintsTextLayout) AbstractC166997dE.A0R(view, R.id.animated_hints_text_layout);
        EditText editText = (EditText) AbstractC166997dE.A0R(view, R.id.search_edit_text);
        this.A02 = editText;
        this.A06 = AbstractC167007dF.A0N(view, R.id.action_text);
        editText.setTextIsSelectable(false);
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
        editText.setEnabled(false);
        editText.setClickable(false);
        editText.setLongClickable(false);
        editText.clearFocus();
    }
}
