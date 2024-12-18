package com.instagram.ui.widget.nametag;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC50102Ry;
import X.AnonymousClass001;
import X.C05F;
import X.C0f9;
import X.C13680mu;
import X.C3DY;
import X.C44355Jiu;
import X.C44359Jiy;
import X.C9GS;
import X.InterfaceC50409MNl;
import X.M2U;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes8.dex */
public class NametagCardView extends View {
    public static final int[][] A0F = {new int[]{-10752, -65175}, new int[]{-65175, -9029382}, new int[]{-16738826, -9029382}, new int[]{-14888625, -16738826}, new int[]{-14342618, -14342618}};
    public float A00;
    public String A01;
    public int A02;
    public int A03;
    public ColorFilter A04;
    public C44355Jiu A05;
    public InterfaceC50409MNl A06;
    public final Rect A07;
    public final TextPaint A08;
    public final C44359Jiy A09;
    public final Runnable A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final Drawable.Callback A0E;

    public NametagCardView(Context context) {
        this(context, null);
    }

    public void setUser(User user) {
        A01(user, 0);
    }

    private void A00() {
        RectF rectF = this.A0D;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, rectF.width(), rectF.height(), this.A03, this.A02, Shader.TileMode.CLAMP);
        Paint paint = this.A0B;
        paint.setShader(linearGradient);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_IN);
        C44359Jiy c44359Jiy = this.A09;
        c44359Jiy.A07.setShader(linearGradient);
        c44359Jiy.invalidateSelf();
        this.A08.setShader(linearGradient);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.A07;
        canvas.getClipBounds(rect);
        float width = rect.width();
        float f = 0.032f * width;
        float f2 = 0.6f * width;
        Context context = getContext();
        float A04 = AbstractC13880nE.A04(context, 12);
        float f3 = 0.1f * width;
        String str = this.A01;
        String str2 = "";
        String str3 = "";
        if (str != null) {
            str3 = str;
        }
        TextPaint textPaint = this.A08;
        float A00 = C13680mu.A00(Layout.Alignment.ALIGN_CENTER, textPaint, str3, Math.round(width - AbstractC13880nE.A04(context, 48)), 1, 0, Math.round(f3));
        float abs = Math.abs(textPaint.getFontMetrics().ascent) / 2.0f;
        int round = Math.round((width / 2.0f) - (f2 / 2.0f));
        int round2 = Math.round((width - ((A04 + f2) + abs)) / 2.0f);
        int round3 = Math.round(round + f2);
        int round4 = Math.round(round2 + f2);
        C44359Jiy c44359Jiy = this.A09;
        c44359Jiy.setBounds(round, round2, round3, round4);
        c44359Jiy.draw(canvas);
        textPaint.setTextSize(A00);
        textPaint.setTextAlign(Paint.Align.CENTER);
        float f4 = round4;
        float height = f4 + (((rect.height() - (f * 2.0f)) - f4) / 2.0f) + abs;
        String str4 = this.A01;
        if (str4 != null) {
            str2 = str4;
        }
        canvas.drawText(str2, rect.width() / 2.0f, height, textPaint);
    }

    public void setGradientTintColors(int i) {
        int[][] iArr = A0F;
        if (i >= 5) {
            i = 0;
        }
        int[] iArr2 = iArr[i];
        this.A03 = iArr2[0];
        this.A02 = iArr2[iArr2.length - 1];
        A00();
        this.A09.setColorFilter(null);
        this.A08.setColorFilter(null);
        if (this.A00 > 0.0f) {
            invalidate();
        }
    }

    public void setName(String str, String str2) {
        this.A01 = AnonymousClass001.A0R("@", str.toUpperCase(Locale.US));
        C44359Jiy c44359Jiy = this.A09;
        if (!AbstractC50102Ry.A00(c44359Jiy.A03, str)) {
            c44359Jiy.A02 = AnonymousClass001.A0g("http://instagram.com/", str, "?utm_source=qr");
            c44359Jiy.A03 = str;
            C44359Jiy.A00(c44359Jiy);
        }
    }

    public void setOnSizeChangedListener(InterfaceC50409MNl interfaceC50409MNl) {
        this.A06 = interfaceC50409MNl;
    }

    public void setUrl(String str) {
        C44359Jiy c44359Jiy = this.A09;
        c44359Jiy.A02 = str;
        C44359Jiy.A00(c44359Jiy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r3 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.user.model.User r8, int r9) {
        /*
            r7 = this;
            java.lang.String r1 = r8.getUsername()
            java.lang.String r0 = r8.getFullName()
            r7.setName(r1, r0)
            X.Kcp r3 = X.EnumC46213Kcp.A07
            X.17P r0 = r8.A03
            X.16m r6 = r0.BW9()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 0
            if (r6 == 0) goto L7d
            java.lang.Integer r0 = r6.BUH()
            if (r0 == 0) goto L7b
            java.lang.Integer r0 = r6.BUH()
            int r2 = r0.intValue()
        L26:
            android.util.SparseArray r1 = X.EnumC46213Kcp.A04
            android.util.SparseArray r0 = X.EnumC46213Kcp.A03
            int r0 = r0.size()
            if (r2 < r0) goto L31
            r2 = 0
        L31:
            java.lang.Object r3 = r1.get(r2)
            X.Kcp r3 = (X.EnumC46213Kcp) r3
            java.lang.Integer r0 = r6.BAD()
            if (r0 == 0) goto L79
            java.lang.Integer r0 = r6.BAD()
            int r1 = r0.intValue()
        L45:
            java.lang.Integer r0 = r6.B1G()
            if (r0 == 0) goto L53
            java.lang.Integer r0 = r6.B1G()
            int r5 = r0.intValue()
        L53:
            r2 = r5
            r5 = r1
            if (r3 == 0) goto L67
        L57:
            int r1 = r3.ordinal()
            r0 = 0
            if (r1 == r0) goto L75
            r0 = 1
            if (r1 == r0) goto L71
            r0 = 2
            if (r1 != r0) goto L67
            r7.setTintColor(r4)
        L67:
            if (r9 <= 0) goto L70
            X.Jiu r0 = new X.Jiu
            r0.<init>(r9)
            r7.A05 = r0
        L70:
            return
        L71:
            r7.setTintColor(r2)
            goto L67
        L75:
            r7.setGradientTintColors(r5)
            goto L67
        L79:
            r1 = 0
            goto L45
        L7b:
            r2 = 0
            goto L26
        L7d:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nametag.NametagCardView.A01(com.instagram.user.model.User, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1687045333);
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        this.A00 = f;
        float f2 = i2;
        this.A0D.set(f * 0.085f, 0.085f * f2, f * 0.915f, 0.915f * f2);
        C44355Jiu c44355Jiu = this.A05;
        if (c44355Jiu != null) {
            float f3 = f2 * 0.015f;
            c44355Jiu.A02 = f3;
            int[] iArr = C44355Jiu.A08;
            float f4 = f3 / iArr[0];
            c44355Jiu.A00 = f4;
            c44355Jiu.A01 = 4.0f * f4;
            c44355Jiu.A03 = f4 * 1.0f;
            c44355Jiu.A04 = 0.0f;
            Iterator it = c44355Jiu.A05.iterator();
            while (it.hasNext()) {
                c44355Jiu.A04 += iArr[AbstractC167007dF.A0B(it) - 1] * c44355Jiu.A00;
            }
            c44355Jiu.A04 += (r7.size() - 1) * c44355Jiu.A01;
        }
        if (getBackground() == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(0.06f * f);
            gradientDrawable.setColor(-1);
            setBackground(new InsetDrawable((Drawable) gradientDrawable, (int) (f * 0.032f)));
        }
        A00();
        if (this.A00 > 0.0f) {
            invalidate();
        }
        C0f9.A0D(-1271930356, A06);
    }

    public void setTintColor(int i) {
        ColorFilter A00 = C3DY.A00(i);
        this.A04 = A00;
        this.A0C.setColorFilter(A00);
        this.A03 = i;
        this.A02 = i;
        A00();
        this.A09.setColorFilter(null);
        this.A08.setColorFilter(null);
        if (this.A00 > 0.0f) {
            invalidate();
        }
    }

    public NametagCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = AbstractC166987dD.A0X();
        this.A07 = AbstractC166987dD.A0U();
        this.A0B = AbstractC166987dD.A0R();
        this.A0C = AbstractC166987dD.A0R();
        this.A0A = new M2U(this);
        Integer num = C05F.A01;
        C44359Jiy c44359Jiy = new C44359Jiy();
        c44359Jiy.invalidateSelf();
        c44359Jiy.A01 = num;
        C44359Jiy.A00(c44359Jiy);
        c44359Jiy.A07.setShader(null);
        c44359Jiy.invalidateSelf();
        c44359Jiy.A02 = null;
        C44359Jiy.A00(c44359Jiy);
        this.A09 = c44359Jiy;
        C9GS c9gs = new C9GS(this, 3);
        this.A0E = c9gs;
        c44359Jiy.setCallback(c9gs);
        TextPaint textPaint = new TextPaint(1);
        this.A08 = textPaint;
        textPaint.setTypeface(AbstractC167017dG.A0S(context));
        textPaint.setLetterSpacing(0.03f);
    }

    public NametagCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
