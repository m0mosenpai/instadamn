package X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.4tQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107814tQ extends AbstractC85213rC {
    public final /* synthetic */ C84923qg A00;
    public final /* synthetic */ C57352kA A01;

    public C107814tQ(C84923qg c84923qg, C57352kA c57352kA) {
        this.A01 = c57352kA;
        this.A00 = c84923qg;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C25671My c25671My = this.A01.A07;
        C84923qg c84923qg = this.A00;
        C38321qM c38321qM = c84923qg.A07;
        c38321qM.getClass();
        c25671My.E4s(new C72333Mg(null, c38321qM, c84923qg.A0a, c84923qg.A0G));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.A00.A06 != EnumC84933qh.A09) {
            textPaint.setAlpha(64);
        }
        ((AbstractC85213rC) this).A00 = textPaint.getColor();
    }
}
