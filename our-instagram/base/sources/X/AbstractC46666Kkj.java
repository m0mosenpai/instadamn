package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.Kkj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46666Kkj {
    public static final void A00(Context context, InterfaceC168057f0 interfaceC168057f0, IgLinearLayout igLinearLayout, CharSequence charSequence, Integer num) {
        ComposerAutoCompleteTextView AeD;
        boolean A1U = AbstractC167007dF.A1U(igLinearLayout);
        igLinearLayout.setVisibility(8);
        igLinearLayout.setOnTouchListener(ViewOnTouchListenerC48082LQh.A00);
        View A0S = AbstractC166997dE.A0S(igLinearLayout, R.id.carousel_comment_tooltip_banner);
        ImageView A0D = AbstractC31176DnK.A0D(A0S, R.id.banner_icon);
        if (num == null) {
            A0D.setVisibility(8);
        } else {
            A0D.setVisibility(A1U ? 1 : 0);
            AbstractC166997dE.A19(context, A0D, num.intValue());
        }
        AbstractC167007dF.A0N(A0S, R.id.banner_body).setText(charSequence);
        C0fQ.A00(new ViewOnClickListenerC35683FpI(23, igLinearLayout, context), AbstractC166997dE.A0S(A0S, R.id.banner_close));
        if (interfaceC168057f0 != null && (AeD = interfaceC168057f0.AeD()) != null) {
            ((IgAutoCompleteTextView) AeD).A04 = new C49666Lwx(igLinearLayout);
        }
    }
}
