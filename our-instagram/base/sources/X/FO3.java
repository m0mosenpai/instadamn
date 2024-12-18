package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes6.dex */
public final class FO3 {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final C35469Fl4 A03;
    public final InterfaceC60152ox A04;
    public final C3I9 A05;
    public final C45510KCz A06;
    public final ComposerAutoCompleteTextView A07;

    public FO3(View view, C3I9 c3i9, C45510KCz c45510KCz) {
        C14360o3.A0B(c3i9, 3);
        this.A01 = view;
        this.A06 = c45510KCz;
        this.A05 = c3i9;
        this.A07 = (ComposerAutoCompleteTextView) AbstractC166997dE.A0R(view, R.id.reply_bar_edit_text);
        View A0S = AbstractC166997dE.A0S(view, R.id.reply_bar_send_button);
        this.A02 = A0S;
        this.A04 = new G0M(this, 7);
        this.A03 = new C35469Fl4(this, 27);
        ViewOnClickListenerC31723DwS.A01(A0S, 57, this);
    }
}
