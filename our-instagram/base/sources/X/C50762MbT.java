package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;

/* renamed from: X.MbT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50762MbT extends ClickableSpan {
    public final /* synthetic */ ReelMoreOptionsFragment A00;

    public C50762MbT(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        this.A00 = reelMoreOptionsFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Integer num = C05F.A00;
        ReelMoreOptionsFragment reelMoreOptionsFragment = this.A00;
        Integer num2 = reelMoreOptionsFragment.A0C;
        if (num.equals(num2)) {
            String str = reelMoreOptionsFragment.A07.A00;
            if (TextUtils.isEmpty(str.trim())) {
                C9GR.A03(reelMoreOptionsFragment.getContext(), reelMoreOptionsFragment.requireContext().getString(2131977037), "weblink_empty_link_error", 0);
                return;
            }
            C63397SjR c63397SjR = new C63397SjR(reelMoreOptionsFragment.requireActivity(), reelMoreOptionsFragment.A02, C2Fb.A3C, AbstractC47839LBc.A01(str));
            c63397SjR.A0S = "reel_more_options";
            c63397SjR.A0A();
            return;
        }
        if (!C05F.A01.equals(num2)) {
            return;
        }
        Context requireContext = reelMoreOptionsFragment.requireContext();
        FragmentActivity requireActivity = reelMoreOptionsFragment.requireActivity();
        UserSession userSession = reelMoreOptionsFragment.A02;
        C08730cb c08730cb = C17060sy.A01;
        User A01 = c08730cb.A01(userSession);
        UserSession userSession2 = reelMoreOptionsFragment.A02;
        String B4t = AbstractC31171DnF.A0T(userSession2, c08730cb).B4t();
        B4t.getClass();
        AbstractC62255S4a.A00(requireActivity, requireContext, userSession2, C2Fb.A39, A01, AbstractC47839LBc.A01(B4t), "reel_more_options");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
