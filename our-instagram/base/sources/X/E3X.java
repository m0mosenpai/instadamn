package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;

/* loaded from: classes6.dex */
public final class E3X extends C3OO {
    public final View A00;
    public final IgLinearLayout A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsRadioButton A04;
    public final IgdsFaceSwarm A05;

    public E3X(View view) {
        super(view);
        this.A00 = view;
        this.A05 = (IgdsFaceSwarm) AbstractC166997dE.A0R(view, R.id.campfire_list_item_photo);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.campfire_list_item_name);
        this.A01 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.campfire_list_item_member_count_container);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.campfire_list_item_member_count);
        this.A04 = (IgdsRadioButton) AbstractC166997dE.A0R(view, R.id.campfire_list_item_radio_button);
    }
}
