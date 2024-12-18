package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.text.fittingtextview.FittingTextView;

/* loaded from: classes4.dex */
public final class AQC implements View.OnClickListener {
    public final /* synthetic */ C23709Aei A00;

    public AQC(C23709Aei c23709Aei) {
        this.A00 = c23709Aei;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(596027802);
        C23709Aei c23709Aei = this.A00;
        c23709Aei.A0D = true;
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.before_and_after_image);
        igSimpleImageView.setImageAlpha(128);
        c23709Aei.A09 = igSimpleImageView;
        IgEditText igEditText = c23709Aei.A06;
        if (igEditText != null) {
            AbstractC13880nE.A0O(igEditText);
        }
        C23709Aei.A03(c23709Aei, (FittingTextView) AbstractC166987dD.A17(c23709Aei.A0Q));
        c23709Aei.A0K.E4u(new Object());
        C0f9.A0C(-1190937513, A05);
    }
}
