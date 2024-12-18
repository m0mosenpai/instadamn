package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class L5B {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgImageView A07;
    public final ComposerAutoCompleteTextView A08;
    public final View A09;

    public L5B(View view, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        View A0U = AbstractC167017dG.A0U(view, R.id.clips_reply_bar_stub);
        C14360o3.A07(A0U);
        this.A03 = A0U;
        this.A06 = AbstractC25231BEo.A0d(A0U, R.id.reply_bar_title);
        this.A02 = AbstractC166997dE.A0S(A0U, R.id.reply_bar_container);
        this.A00 = AbstractC166997dE.A0S(A0U, R.id.reel_viewer_message_composer);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) AbstractC166997dE.A0R(A0U, R.id.reply_bar_edittext);
        this.A08 = composerAutoCompleteTextView;
        this.A05 = AbstractC25231BEo.A0d(A0U, R.id.reply_bar_send_button);
        this.A07 = AbstractC167007dF.A0T(A0U, R.id.reply_bar_emoji_button);
        this.A04 = AbstractC25231BEo.A0d(A0U, R.id.reply_bar_action_pill);
        View A0U2 = AbstractC167017dG.A0U(view, R.id.clips_background_dimmer_stub);
        this.A09 = A0U2;
        View A0S = AbstractC166997dE.A0S(A0U2, R.id.background_dimmer);
        this.A01 = A0S;
        LO2.A00(composerAutoCompleteTextView, interfaceC16820sZ, 18);
        ViewOnTouchListenerC48084LQj.A01(A0S, 27, interfaceC16660sJ);
    }
}
