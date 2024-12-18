package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Mba, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50769Mba extends ClickableSpan {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C07X A02;
    public final /* synthetic */ C51029Mgc A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C50769Mba(Context context, C07X c07x, C51029Mgc c51029Mgc, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        this.A03 = c51029Mgc;
        this.A01 = context;
        this.A00 = j;
        this.A02 = c07x;
        this.A04 = interfaceC16660sJ;
        this.A05 = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C51029Mgc c51029Mgc = this.A03;
        Context context = this.A01;
        long j = this.A00;
        c51029Mgc.A02(context, this.A02, AbstractC166997dE.A0o(), null, this.A04, j, this.A05, false);
    }
}
