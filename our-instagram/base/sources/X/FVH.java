package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FVH {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (X.AbstractC13620mo.A02(r6) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r6, android.text.SpannableStringBuilder r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = 0
            android.graphics.drawable.Drawable r4 = A00(r6, r10)
            r3 = 0
            if (r8 != 0) goto Lf
            boolean r0 = X.AbstractC13620mo.A02(r6)
            r2 = 1
            if (r0 != 0) goto L10
        Lf:
            r2 = 0
        L10:
            if (r9 == 0) goto L1a
            if (r2 == 0) goto L38
            r1 = 0
        L15:
            java.lang.String r0 = " "
            r7.insert(r1, r0)
        L1a:
            java.lang.String r0 = "\r"
            if (r2 == 0) goto L30
            r7.insert(r5, r0)
        L21:
            if (r4 == 0) goto L3d
            X.3sR r2 = new X.3sR
            r2.<init>(r4)
            int r1 = r3 + 1
            r0 = 33
            r7.setSpan(r2, r3, r1, r0)
            return
        L30:
            int r3 = r7.length()
            r7.append(r0)
            goto L21
        L38:
            int r1 = r7.length()
            goto L15
        L3d:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FVH.A01(android.content.Context, android.text.SpannableStringBuilder, boolean, boolean, boolean):void");
    }

    public static final Drawable A00(Context context, boolean z) {
        Drawable mutate;
        int i = R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_12;
        if (z) {
            i = R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_16;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            return mutate;
        }
        return null;
    }
}
