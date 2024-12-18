package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;

/* renamed from: X.JjN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44384JjN extends ClickableSpan {
    public final Context A00;
    public final C47288Kuz A01;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Context context = this.A00;
        AbstractC43594JPz.A14(context, textPaint, R.attr.igds_color_creation_tools_blue);
        textPaint.setUnderlineText(false);
        textPaint.setTextSize(AbstractC166987dD.A04(context.getResources(), R.dimen.add_payment_bottom_sheet_row_subtitle_size));
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C48592LeU c48592LeU = this.A01.A00;
        if (!c48592LeU.A02) {
            String A00 = C48592LeU.A00(c48592LeU);
            if (A00 != null && A00.length() != 0) {
                String A01 = AbstractC47839LBc.A01(A00);
                C14360o3.A07(A01);
                C1OK c1ok = c48592LeU.A00;
                if (c1ok != null) {
                    c1ok.A00();
                }
                C1OK c1ok2 = new C1OK();
                c48592LeU.A00 = c1ok2;
                C1ON A002 = C25401Lu.A00(c1ok2.A00, c48592LeU.A06, A01);
                A002.A00 = new C45551KEq(A01, c48592LeU, 0);
                C1GJ.A03(A002);
                return;
            }
            Context context = c48592LeU.A04;
            C9GR.A09(context, context.getString(2131965242));
        }
    }

    public C44384JjN(Context context, C47288Kuz c47288Kuz) {
        this.A00 = context;
        this.A01 = c47288Kuz;
    }
}
