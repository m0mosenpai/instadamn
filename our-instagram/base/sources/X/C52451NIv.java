package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.NIv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52451NIv extends AbstractC50810Mcb {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsSwitch A03;
    public final GradientSpinnerAvatarView A04;

    @Override // X.AbstractC50810Mcb
    public IgdsSwitch getShareSwitch() {
        return this.A03;
    }

    public final void setChecked(boolean z) {
        this.A03.setChecked(z);
    }

    @Override // X.AbstractC50810Mcb
    public void setEnabledState(boolean z) {
        IgdsSwitch igdsSwitch;
        boolean z2;
        if (z) {
            setAlpha(1.0f);
            igdsSwitch = this.A03;
            z2 = true;
        } else {
            setAlpha(0.3f);
            igdsSwitch = this.A03;
            z2 = false;
            igdsSwitch.setChecked(false);
        }
        igdsSwitch.setClickable(z2);
    }

    public C52451NIv(Context context) {
        super(context);
        View.inflate(context, R.layout.share_to_threads_section, this);
        this.A04 = (GradientSpinnerAvatarView) requireViewById(R.id.share_table_profile_picture);
        this.A01 = AbstractC166997dE.A0T(this, R.id.row_text);
        this.A02 = AbstractC166997dE.A0T(this, R.id.share_table_button);
        this.A00 = requireViewById(R.id.app_share_new_tag_section);
        this.A03 = (IgdsSwitch) requireViewById(R.id.share_switch);
    }
}
