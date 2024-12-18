package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.JjM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44383JjM extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C44383JjM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.A00 != 0) {
            AbstractC166987dD.A1Y(this.A01);
        } else {
            KBR kbr = (KBR) this.A01;
            AbstractC31177DnL.A0u(kbr.requireContext(), AbstractC166987dD.A0r(kbr.A07), C2Fb.A2R, "https://help.instagram.com/878719630376843");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.A00 != 0) {
            C14360o3.A0B(textPaint, 0);
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        } else {
            AbstractC25229BEm.A13(textPaint);
            textPaint.setColor(AbstractC25233BEq.A04((Fragment) this.A01));
        }
    }
}
