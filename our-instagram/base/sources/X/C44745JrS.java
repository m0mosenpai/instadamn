package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.JrS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44745JrS extends C3OO {
    public final View A00;
    public final IgLinearLayout A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgdsRadioButton A05;
    public final /* synthetic */ KIU A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44745JrS(View view, KIU kiu) {
        super(view);
        this.A06 = kiu;
        this.A00 = view;
        this.A01 = (IgLinearLayout) AbstractC166987dD.A0c(view, R.id.notes_audience_item_root);
        this.A02 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.notes_audience_icon);
        this.A04 = AbstractC31175DnJ.A0L(view, R.id.notes_audience_title);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.notes_audience_subtitle);
        this.A05 = (IgdsRadioButton) AbstractC166987dD.A0c(view, R.id.notes_audience_radio_button);
    }
}
