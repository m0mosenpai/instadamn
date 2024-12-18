package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JXZ {
    public static final JXZ A00 = new Object();

    public static final void A01(TextView textView, TextView textView2, UserSession userSession, C43641JRz c43641JRz) {
        AbstractC167017dG.A1P(textView, textView2);
        if (c43641JRz == null) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        MVC mvc = c43641JRz.A08;
        JXZ jxz = A00;
        int i = c43641JRz.A04;
        int i2 = c43641JRz.A03;
        jxz.A00(c43641JRz.A06, textView, mvc, c43641JRz.A0A, userSession, i, i2);
        jxz.A00(null, textView2, c43641JRz.A09, null, userSession, 0, 0);
        boolean z = c43641JRz.A0D;
        Drawable drawable = c43641JRz.A05;
        Drawable drawable2 = c43641JRz.A07;
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        } else {
            textView.setCompoundDrawables(drawable, null, drawable2, null);
        }
        textView.setCompoundDrawablePadding(c43641JRz.A00);
        textView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.graphics.drawable.Drawable r30, android.widget.TextView r31, X.MVC r32, X.C99E r33, com.instagram.common.session.UserSession r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXZ.A00(android.graphics.drawable.Drawable, android.widget.TextView, X.MVC, X.99E, com.instagram.common.session.UserSession, int, int):void");
    }
}
