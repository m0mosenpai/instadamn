package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.NIu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52450NIu extends AbstractC50810Mcb {
    public final View A00;
    public final IgdsSwitch A01;

    @Override // X.AbstractC50810Mcb
    public IgdsSwitch getShareSwitch() {
        return this.A01;
    }

    @Override // X.AbstractC50810Mcb
    public void setEnabledState(boolean z) {
        IgdsSwitch igdsSwitch;
        boolean z2;
        if (z) {
            setAlpha(1.0f);
            igdsSwitch = this.A01;
            z2 = true;
        } else {
            setAlpha(0.3f);
            igdsSwitch = this.A01;
            z2 = false;
            igdsSwitch.setChecked(false);
        }
        igdsSwitch.setClickable(z2);
    }

    public C52450NIu(Context context) {
        super(context);
        View.inflate(context, R.layout.share_to_threads_section, this);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(this, R.id.share_table_profile_picture);
        gradientSpinnerAvatarView.A05();
        Drawable drawable = context.getDrawable(R.drawable.unlinked_threads_icon);
        if (drawable != null) {
            gradientSpinnerAvatarView.A0D(drawable);
        }
        AbstractC31176DnK.A1D(this, R.id.row_text);
        MSZ.A14(this, R.id.share_table_button);
        AbstractC166997dE.A0T(this, R.id.share_table_button).setText(2131975517);
        this.A00 = requireViewById(R.id.app_share_new_tag_section);
        this.A01 = (IgdsSwitch) requireViewById(R.id.share_switch);
    }
}
