package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FV9 {
    public static SpannableStringBuilder A00(Context context, SpannableStringBuilder spannableStringBuilder, TextView textView, String str, int i, int i2) {
        if (spannableStringBuilder != null && str != null) {
            TextPaint paint = textView.getPaint();
            float f = i;
            if (paint.measureText(spannableStringBuilder.toString()) > f) {
                int i3 = i2 - 1;
                Resources resources = context.getResources();
                Integer valueOf = Integer.valueOf(i3);
                String quantityString = resources.getQuantityString(R.plurals.thread_title_x_and_n_others, i3, str, valueOf);
                if (paint.measureText(quantityString) > f) {
                    String A0W = AbstractC31175DnJ.A0W(context.getResources(), valueOf, R.plurals.thread_title_suffix_n_others, i3);
                    return AbstractC25225BEi.A0H(AbstractC85253rG.A03(paint, A0W, quantityString, i)).append((CharSequence) A0W);
                }
                return AbstractC25225BEi.A0H(quantityString);
            }
            return spannableStringBuilder;
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r25, 36318209095505946L) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r25, 36318209095440409L) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r10 = (int) java.util.concurrent.TimeUnit.MINUTES.toHours(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (r11 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        if (r13 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x020a, code lost:
    
        r1 = 2131960253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        r0 = new X.U8R(X.AbstractC31177DnL.A0a(r23, r22, r1), X.AbstractC31174DnI.A01(r23), r23.getColor(com.facebook.R.color.green_0), r23.getColor(X.AbstractC53242c7.A0D(r23)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018f, code lost:
    
        if (r37 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0196, code lost:
    
        if (r36 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0198, code lost:
    
        if (r35 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        r10.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ec, code lost:
    
        if (r12 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cd, code lost:
    
        r1 = 2131960252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d0, code lost:
    
        if (r11 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d2, code lost:
    
        if (r13 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d4, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c0, code lost:
    
        if (r13 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Context r23, X.InterfaceC11380iw r24, com.instagram.common.session.UserSession r25, X.InterfaceC37224GaZ r26, X.E40 r27, com.instagram.model.direct.DirectShareTarget r28, int r29, int r30, int r31, int r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FV9.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.GaZ, X.E40, com.instagram.model.direct.DirectShareTarget, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
