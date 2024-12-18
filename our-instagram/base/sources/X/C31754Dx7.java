package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dx7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31754Dx7 extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C35774FrC A01;
    public final /* synthetic */ C62862tP A02;
    public final /* synthetic */ UserSession A03;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        this.A01.E2V(this.A02.A03, new WTZ(null, null, null, null, 1.0f, false, false, false, true), VRA.A00(this.A03, false));
        C6WI.A01().A0G = true;
    }

    public C31754Dx7(FragmentActivity fragmentActivity, C35774FrC c35774FrC, C62862tP c62862tP, UserSession userSession) {
        this.A01 = c35774FrC;
        this.A02 = c62862tP;
        this.A03 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC166987dD.A1N(fragmentActivity, textPaint, AbstractC53242c7.A06(fragmentActivity));
    }
}
