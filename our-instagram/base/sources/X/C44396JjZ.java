package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.JjZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44396JjZ extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ MUW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C44396JjZ(FragmentActivity fragmentActivity, MUW muw, UserSession userSession, String str) {
        this.A01 = muw;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        MUW muw = this.A01;
        AbstractC25228BEl.A1P(muw.A00);
        C63397SjR A0y = AbstractC25228BEl.A0y(this.A00, this.A02, (C2Fb) muw.A01, muw.A03);
        A0y.A0S = this.A03;
        A0y.A0A();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC166987dD.A1N(fragmentActivity, textPaint, AbstractC53242c7.A06(fragmentActivity));
    }
}
