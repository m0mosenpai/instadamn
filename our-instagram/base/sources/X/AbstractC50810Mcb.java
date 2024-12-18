package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Mcb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50810Mcb extends LinearLayout {
    public abstract IgdsSwitch getShareSwitch();

    public abstract void setEnabledState(boolean z);

    public final void A00(AbstractC59962oe abstractC59962oe, SimpleImageUrl simpleImageUrl, String str, String str2, boolean z) {
        if (this instanceof C52450NIu) {
            ((C52450NIu) this).A00.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            return;
        }
        C52451NIv c52451NIv = (C52451NIv) this;
        c52451NIv.A00.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c52451NIv.A04;
        gradientSpinnerAvatarView.A0F(null, abstractC59962oe, new SimpleImageUrl(simpleImageUrl));
        Context context = c52451NIv.getContext();
        gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(R.drawable.avatar_bottom_badge_threads));
        gradientSpinnerAvatarView.A05();
        gradientSpinnerAvatarView.A01 = AbstractC13880nE.A04(context, 3);
        TextView textView = c52451NIv.A01;
        MSZ.A10(context, textView, context.getString(2131975517), str2, 2131954399);
        textView.setVisibility(0);
        TextView textView2 = c52451NIv.A02;
        textView2.setText(str);
        textView2.setVisibility(0);
    }

    public final InterfaceC190658cN getListener() {
        return getShareSwitch().A07;
    }

    public final void setListener(InterfaceC190658cN interfaceC190658cN) {
        getShareSwitch().A07 = interfaceC190658cN;
    }
}
