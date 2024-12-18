package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.OCv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54669OCv {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsRadioButton A04;

    public C54669OCv(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.label);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.description);
        this.A04 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.recipient_picker_radio_button);
    }
}
