package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.MbW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50765MbW extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C50765MbW(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC06180Ui interfaceC06180Ui;
        Object c56542P8o;
        switch (this.A00) {
            case 0:
                N5G n5g = (N5G) this.A01;
                C63397SjR A0y = AbstractC25228BEl.A0y(n5g.requireActivity(), AbstractC166987dD.A0r(n5g.A04), C2Fb.A2l, this.A02);
                A0y.A0S = N5G.__redex_internal_original_name;
                A0y.A0A();
                return;
            case 1:
                interfaceC06180Ui = ((C50906Meb) this.A01).A02;
                c56542P8o = new C56542P8o(this.A02);
                interfaceC06180Ui.F8m(c56542P8o);
                return;
            default:
                interfaceC06180Ui = ((C50906Meb) this.A01).A02;
                c56542P8o = new C56543P8p(this.A02);
                interfaceC06180Ui.F8m(c56542P8o);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.A00 != 0) {
            C14360o3.A0B(textPaint, 0);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            return;
        }
        C14360o3.A0B(textPaint, 0);
        Context A06 = AbstractC31172DnG.A06(this.A01);
        if (A06 == null) {
            return;
        }
        textPaint.setUnderlineText(false);
        AbstractC166987dD.A1N(A06, textPaint, AbstractC53242c7.A06(A06));
    }
}
