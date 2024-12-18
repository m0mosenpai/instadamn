package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.APj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23187APj implements InputFilter {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Context A03;
    public final TextPaint A04;
    public final View A05;
    public final TextView A06;
    public final IgSimpleImageView A07;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
    
        if (r25 != 0) goto L14;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r23, int r24, int r25, android.text.Spanned r26, int r27, int r28) {
        /*
            r22 = this;
            r0 = 3
            r8 = r26
            X.C14360o3.A0B(r8, r0)
            r9 = r25
            r11 = r23
            r10 = r24
            if (r23 == 0) goto L14
            java.lang.CharSequence r0 = r11.subSequence(r10, r9)
            if (r0 != 0) goto L16
        L14:
            java.lang.String r0 = ""
        L16:
            r7 = r27
            r6 = r28
            java.lang.StringBuilder r0 = X.AbstractC001900j.A0N(r8, r0, r7, r6)
            java.lang.String r14 = r0.toString()
            r12 = r22
            android.widget.TextView r5 = r12.A06
            float r4 = r5.getTextSize()
            int r3 = r12.A02
            com.instagram.common.ui.base.IgSimpleImageView r0 = r12.A07
            int r0 = r0.getMeasuredWidth()
            int r3 = r3 - r0
            X.ALl r16 = X.ALl.A00
            android.content.Context r13 = r12.A03
            X.C14360o3.A06(r13)
            android.text.TextPaint r2 = r12.A04
            r0 = 1
            X.C14360o3.A0B(r14, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165580(0x7f07018c, float:1.7945381E38)
            float r19 = r1.getDimension(r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165527(0x7f070157, float:1.7945274E38)
            float r1 = r1.getDimension(r0)
            android.content.res.Resources r13 = r13.getResources()
            r0 = 2131165579(0x7f07018b, float:1.794538E38)
            float r0 = r13.getDimension(r0)
            android.text.TextPaint r15 = new android.text.TextPaint
            r15.<init>(r2)
            r15.setTextSize(r0)
            r20 = r0
            r21 = r3
            r17 = r14
            r18 = r0
            float r0 = X.ALl.A00(r15, r16, r17, r18, r19, r20, r21)
            float r3 = java.lang.Math.max(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r14 = 0
            if (r0 < 0) goto L7f
            r14 = 1
        L7f:
            r13 = 1
            r2 = 0
            if (r24 != 0) goto L86
            r1 = 1
            if (r25 == 0) goto L87
        L86:
            r1 = 0
        L87:
            int r0 = r8.length()
            if (r0 != 0) goto Lab
            if (r23 == 0) goto Lab
            int r0 = r11.length()
            if (r0 <= 0) goto Lab
        L95:
            if (r1 != 0) goto Lb2
            if (r13 != 0) goto Lb2
            if (r14 != 0) goto Lb2
            r5.setTextSize(r2, r4)
            int r1 = r28 - r27
            int r0 = r25 - r24
            if (r1 < r0) goto Lad
            if (r23 == 0) goto Lad
            java.lang.CharSequence r0 = r11.subSequence(r10, r9)
            return r0
        Lab:
            r13 = 0
            goto L95
        Lad:
            java.lang.CharSequence r0 = r8.subSequence(r7, r6)
            return r0
        Lb2:
            float r0 = r12.A01
            float r1 = java.lang.Math.min(r3, r0)
            float r0 = r12.A00
            float r0 = java.lang.Math.max(r1, r0)
            r5.setTextSize(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23187APj.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }

    public C23187APj(View view, TextView textView, IgSimpleImageView igSimpleImageView) {
        AbstractC167017dG.A1R(igSimpleImageView, view);
        this.A06 = textView;
        this.A07 = igSimpleImageView;
        this.A05 = view;
        Context context = textView.getContext();
        this.A03 = context;
        this.A00 = context.getResources().getDimension(R.dimen.direct_emoji_quick_reply_emoji_item_size);
        this.A01 = textView.getTextSize();
        TextPaint paint = textView.getPaint();
        C14360o3.A07(paint);
        this.A04 = paint;
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width) - (view.getPaddingStart() + view.getPaddingEnd());
    }
}
