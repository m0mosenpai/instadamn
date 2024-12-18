package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.UDi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66365UDi extends C3WF implements InterfaceC65359Tin {
    public static final ViewGroup.LayoutParams A0C = new ViewGroup.LayoutParams(0, 0);
    public int A00;
    public int A01;
    public Spannable A02;
    public TextUtils.TruncateAt A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public boolean A0B;

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setBorderRadius(float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, WF1.A00(f));
        }
        C63403SjY.A08(this, c63011Saa, VDC.values()[0]);
    }

    private void A00() {
        float f = this.A07;
        if (!Float.isNaN(f)) {
            setTextSize(0, f);
        }
        float f2 = this.A08;
        if (!Float.isNaN(f2)) {
            super.setLetterSpacing(f2);
        }
    }

    public Spannable getSpanned() {
        return this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Spannable spannable;
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactTextView.onDraw", 1653250206);
        try {
            if (this.A05 && (spannable = this.A02) != null && this.A0A) {
                this.A0A = false;
                float width = getWidth();
                EnumC78643fW enumC78643fW = EnumC78643fW.EXACTLY;
                WGL.A04(Layout.Alignment.ALIGN_NORMAL, spannable, getPaint(), enumC78643fW, enumC78643fW, this.A09, width, getHeight(), this.A01, getBreakStrategy(), getHyphenationFrequency(), getIncludeFontPadding());
                setText(this.A02);
            }
            if (this.A04 != C05F.A00) {
                C63403SjY.A03(canvas, this);
            }
            super.onDraw(canvas);
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
        } catch (Throwable th) {
            try {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (r20 <= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0153, code lost:
    
        if (r3 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[SYNTHETIC] */
    @Override // X.C3WF, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66365UDi.onLayout(boolean, int, int, int, int):void");
    }

    public void setBorderStyle(String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(this, A00);
    }

    public void setFontSize(float f) {
        this.A07 = (float) Math.ceil(WF1.A03(this.A05 ? 1 : 0, f));
        A00();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = 8388611;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = 48;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setMinimumFontSize(float f) {
        this.A09 = f;
        this.A0A = true;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.A01 = i;
        setMaxLines(i);
        this.A0A = true;
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C69830VwG.A00(str)) == null) {
            num = C05F.A00;
        }
        this.A04 = num;
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.A02 = spannable;
        this.A0A = true;
    }

    public void setText(C69418Vn3 c69418Vn3) {
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactTextView.setText(ReactTextUpdate)", 1653250206);
        try {
            if (getLayoutParams() == null) {
                setLayoutParams(A0C);
            }
            Spannable spannable = c69418Vn3.A08;
            int i = this.A00;
            if (i > 0) {
                Linkify.addLinks(spannable, i);
                AbstractC25227BEk.A11(this);
            }
            setText(spannable);
            float f = c69418Vn3.A01;
            float f2 = c69418Vn3.A03;
            float f3 = c69418Vn3.A02;
            float f4 = c69418Vn3.A00;
            if (f != -1.0f && f2 != -1.0f && f3 != -1.0f && f4 != -1.0f) {
                setPadding((int) Math.floor(f), (int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4));
            }
            int i2 = c69418Vn3.A06;
            if (i2 != getGravityHorizontal()) {
                setGravityHorizontal(i2);
            }
            int breakStrategy = getBreakStrategy();
            int i3 = c69418Vn3.A07;
            if (breakStrategy != i3) {
                setBreakStrategy(i3);
            }
            int justificationMode = getJustificationMode();
            int i4 = c69418Vn3.A05;
            if (justificationMode != i4) {
                setJustificationMode(i4);
            }
            requestLayout();
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
        } catch (Throwable th) {
            try {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        this.A0B = z;
        super.setTextIsSelectable(z);
    }

    public static void A02(C66365UDi c66365UDi) {
        c66365UDi.A01 = Integer.MAX_VALUE;
        c66365UDi.A05 = false;
        c66365UDi.A00 = 0;
        c66365UDi.A06 = false;
        c66365UDi.A0B = false;
        c66365UDi.A0A = false;
        c66365UDi.A03 = TextUtils.TruncateAt.END;
        c66365UDi.A07 = Float.NaN;
        c66365UDi.A09 = Float.NaN;
        c66365UDi.A08 = 0.0f;
        c66365UDi.A04 = C05F.A00;
        c66365UDi.A02 = null;
    }

    private Q21 getReactContext() {
        return (Q21) getContext();
    }

    public final void A03() {
        TextUtils.TruncateAt truncateAt;
        A02(this);
        if (getBackground() instanceof Q2R) {
            Drawable background = getBackground();
            C14360o3.A0C(background, AbstractC58317Pt9.A00(885));
            setBackground(((Q2R) background).A02);
        }
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        setJustificationMode(0);
        setLayoutParams(A0C);
        super.setText((CharSequence) null);
        A00();
        setGravity(8388659);
        setNumberOfLines(this.A01);
        this.A05 = this.A05;
        this.A00 = this.A00;
        setTextIsSelectable(this.A0B);
        setIncludeFontPadding(true);
        setEnabled(true);
        this.A00 = 0;
        this.A03 = this.A03;
        setEnabled(true);
        setFocusable(16);
        setHyphenationFrequency(0);
        if (this.A01 != Integer.MAX_VALUE && !this.A05) {
            truncateAt = this.A03;
        } else {
            truncateAt = null;
        }
        setEllipsize(truncateAt);
    }

    @Override // X.InterfaceC65359Tin
    public final int E7k(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i3);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                    WXU[] wxuArr = (WXU[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, WXU.class);
                    if (wxuArr != null) {
                        int length = text.length();
                        for (int i4 = 0; i4 < wxuArr.length; i4++) {
                            int spanStart = spanned.getSpanStart(wxuArr[i4]);
                            int spanEnd = spanned.getSpanEnd(wxuArr[i4]);
                            if (spanEnd >= offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                                id = wxuArr[i4].A00;
                                length = i;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    C0I2.A03("ReactNative", AnonymousClass001.A0R("Crash in HorizontalMeasurementProvider: ", e.getMessage()));
                }
            }
        }
        return id;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (AbstractC010103p.A00(this) != null) {
            C02V A01 = AbstractC010103p.A01(this);
            if (A01 instanceof C2Y4) {
                if (!((C2Y4) A01).A0o(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1808876537);
        super.onAttachedToWindow();
        setTextIsSelectable(this.A0B);
        C0f9.A0D(29603842, A06);
    }

    @Override // X.C3WF, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(425109165);
        super.onDetachedFromWindow();
        C0f9.A0D(1565659421, A06);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // X.C3WF, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(-1108141289);
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactTextView.onMeasure", 1653250206);
        try {
            super.onMeasure(i, i2);
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
            C0f9.A0D(-1403801646, A06);
        } catch (Throwable th) {
            try {
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 341821114);
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            C0f9.A0D(732660987, A06);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.A05 = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        C63403SjY.A0B(this, Integer.valueOf(i));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i) {
        super.setBreakStrategy(i);
        this.A0A = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.A03 = truncateAt;
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i) {
        super.setHyphenationFrequency(i);
        this.A0A = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        super.setIncludeFontPadding(z);
        this.A0A = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) {
        if (!Float.isNaN(f)) {
            this.A08 = WF1.A01(f) / this.A07;
            A00();
        }
    }

    public void setLinkifyMask(int i) {
        this.A00 = i;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.A06 = z;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable);
    }
}
