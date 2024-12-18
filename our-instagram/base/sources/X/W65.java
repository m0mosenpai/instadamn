package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes11.dex */
public final class W65 {
    public View A00;
    public VG4 A01;
    public IgdsBottomButtonLayout A02;

    public W65(View view, VG4 vg4) {
        C14360o3.A0B(view, 1);
        this.A01 = vg4;
        this.A00 = vg4.ordinal() == 40 ? AbstractC166987dD.A0c(view, R.id.connect_button_container) : view;
    }

    public final void A01() {
        this.A02 = (IgdsBottomButtonLayout) this.A00.requireViewById(R.id.action_bottom_button);
    }

    public final void A02(int i) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(igdsBottomButtonLayout.getResources().getString(i));
        }
    }

    public final void A03(XA8 xa8) {
        WNV wnv = new WNV(58, xa8, this);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(wnv);
        }
    }

    public final void A04(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }

    public final void A05(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, FragmentActivity fragmentActivity, W65 w65, UserSession userSession, String str, String str2, String str3, int i) {
        AnonymousClass773.A05(spannableStringBuilder, new C33251Ell(fragmentActivity, w65, userSession, str3, str2, context.getColor(i)), str);
    }
}
