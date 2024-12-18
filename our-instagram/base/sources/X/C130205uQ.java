package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.5uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130205uQ extends AbstractC130215uR implements C5RR {
    public Integer A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final OMP A04;
    public final UpcomingEvent A05;
    public final Integer A06;
    public final List A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Drawable A0D;
    public final C5RN A0E;
    public final C13920nI A0F;
    public final C6RB A0G;
    public final C6RB A0H;
    public final C124385ju A0I;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b2, code lost:
    
        if (new X.C146066i4(r14).A01(r1) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r23 == X.C05F.A0C) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C130205uQ(android.content.Context r19, com.instagram.common.session.UserSession r20, com.instagram.user.model.UpcomingEvent r21, java.lang.Integer r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130205uQ.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.user.model.UpcomingEvent, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A0E.draw(canvas);
        this.A0G.draw(canvas);
        this.A0H.draw(canvas);
        this.A0I.draw(canvas);
        this.A0D.draw(canvas);
    }

    public static final void A00(C130205uQ c130205uQ) {
        C6RB c6rb;
        Drawable drawable = c130205uQ.A0D;
        if ((drawable instanceof C6RB) && (c6rb = (C6RB) drawable) != null) {
            Integer num = c130205uQ.A00;
            Context context = c6rb.A0Z;
            C14360o3.A07(context);
            c6rb.A0M(AEQ.A01(context, num));
            c6rb.A0F(AEQ.A00(context, c130205uQ.A00));
        }
    }

    public final String A0B() {
        C216159hY c216159hY;
        C6RB c6rb;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Spannable spannable = this.A0G.A0F;
        C14360o3.A0A(spannable);
        String str = null;
        if (!(!AbstractC001900j.A0T(spannable))) {
            spannable = null;
        }
        spannableStringBuilder.append((CharSequence) spannable);
        Spannable spannable2 = this.A0H.A0F;
        C14360o3.A0A(spannable2);
        if (!(!AbstractC001900j.A0T(spannable2))) {
            spannable2 = null;
        }
        boolean z = false;
        if (spannableStringBuilder.length() > 0) {
            z = true;
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) spannable2);
        Drawable drawable = this.A0D;
        if ((drawable instanceof C6RB) && (c6rb = (C6RB) drawable) != null) {
            Spannable spannable3 = c6rb.A0F;
            C14360o3.A0A(spannable3);
            if (!(!AbstractC001900j.A0T(spannable3))) {
                spannable3 = null;
            }
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) spannable3);
        } else if ((drawable instanceof C216159hY) && (c216159hY = (C216159hY) drawable) != null) {
            String obj = c216159hY.A02.A0F.toString();
            if (!AbstractC001900j.A0T(obj)) {
                str = obj;
            }
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        String obj2 = spannableStringBuilder.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return new C24013Akr(this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A0A + this.A0G.A06;
        int i2 = this.A0H.A06;
        int i3 = this.A0B;
        return this.A08 + i + i2 + i3 + this.A0D.getIntrinsicHeight() + (i3 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float f3 = this.A01 / 2.0f;
        float intrinsicHeight = getIntrinsicHeight() / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = f2 + intrinsicHeight;
        int i5 = this.A08;
        C6RB c6rb = this.A0G;
        int i6 = c6rb.A0A;
        int i7 = c6rb.A06;
        int i8 = c6rb.A08;
        int i9 = this.A0A;
        int i10 = this.A0C;
        int i11 = ((i7 + i9) - i8) - i10;
        float f6 = i6 / 2.0f;
        float f7 = i5 + f4;
        float f8 = i8;
        float f9 = f7 + i11 + f8;
        C6RB c6rb2 = this.A0H;
        float f10 = c6rb2.A0A / 2.0f;
        float f11 = i10 + f9;
        float f12 = c6rb2.A06 + f11;
        float f13 = this.A0B + f12;
        Drawable drawable = this.A0D;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float f14 = intrinsicWidth / 2.0f;
        float f15 = (this.A09 / 2.0f) + f13;
        float intrinsicHeight2 = drawable.getIntrinsicHeight() / 2.0f;
        float f16 = f15 - intrinsicHeight2;
        float f17 = f15 + intrinsicHeight2;
        int i12 = (int) (f - f3);
        int i13 = (int) (f3 + f);
        this.A0E.setBounds(i12, (int) f4, i13, (int) f5);
        c6rb.setBounds((int) (f - f6), (int) ((i9 + f7) - f8), (int) (f6 + f), (int) f9);
        c6rb2.setBounds((int) (f - f10), (int) f11, (int) (f10 + f), (int) f12);
        int i14 = (int) f13;
        this.A0I.setBounds(i12, i14, i13, i14);
        drawable.setBounds((int) (f - f14), (int) f16, (int) (f + f14), (int) f17);
    }
}
