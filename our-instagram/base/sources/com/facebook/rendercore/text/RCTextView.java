package com.facebook.rendercore.text;

import X.AbstractC010103p;
import X.C02V;
import X.C0f9;
import X.C131725x8;
import X.C6BM;
import X.C93F;
import X.InterfaceC131865xM;
import X.WXr;
import X.WXs;
import X.X9N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.common.dextricks.DexStore;

/* loaded from: classes2.dex */
public class RCTextView extends View {
    public float A00;
    public float A01;
    public Layout A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public ClickableSpan[] A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public ColorStateList A0C;
    public Paint A0D;
    public Path A0E;
    public boolean A0F;
    public ImageSpan[] A0G;
    public final C131725x8 A0H;

    public static int A00(RCTextView rCTextView, int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int i3 = (int) (i2 - rCTextView.A01);
        int i4 = (int) (i - rCTextView.A00);
        int lineForVertical = rCTextView.A02.getLineForVertical(i3);
        Layout.Alignment alignment = rCTextView.A02.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = rCTextView.A02;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = rCTextView.A02.getLineRight(lineForVertical);
        } else {
            boolean z = false;
            if (layout.getParagraphDirection(lineForVertical) == -1) {
                z = true;
            }
            Layout layout2 = rCTextView.A02;
            if (z) {
                paragraphLeft = layout2.getWidth() - rCTextView.A02.getLineMax(lineForVertical);
                lineMax = rCTextView.A02.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = layout2.getParagraphLeft(lineForVertical);
                lineMax = rCTextView.A02.getLineMax(lineForVertical);
            }
        }
        float f = i4;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return rCTextView.A02.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public final void A04() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A07 = 0;
        this.A08 = 0;
        this.A0C = null;
        this.A09 = 0;
        ImageSpan[] imageSpanArr = this.A0G;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = this.A0G[i].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            this.A0G = null;
        }
        this.A06 = null;
        setContentDescription("");
        C131725x8 c131725x8 = this.A0H;
        if (c131725x8 != null) {
            c131725x8.A0c();
        }
    }

    private void A02(int i, int i2) {
        CornerPathEffect cornerPathEffect;
        if (Color.alpha(this.A07) != 0) {
            if (this.A0B == i && this.A0A == i2) {
                return;
            }
            this.A0B = i;
            this.A0A = i2;
            Paint paint = this.A0D;
            if (paint == null) {
                paint = new Paint();
                this.A0D = paint;
            }
            paint.setColor(this.A07);
            int i3 = this.A08;
            Paint paint2 = this.A0D;
            if (i3 != 0) {
                cornerPathEffect = new CornerPathEffect(i3);
            } else {
                cornerPathEffect = null;
            }
            paint2.setPathEffect(cornerPathEffect);
            this.A0F = true;
            invalidate();
        }
    }

    public static void A03(Canvas canvas, RCTextView rCTextView) {
        rCTextView.A02.draw(canvas, rCTextView.getSelectionPath(), rCTextView.A0D, 0);
    }

    private InterfaceC131865xM[] getOnPrePostDrawableSpans() {
        CharSequence charSequence = this.A03;
        if (!(charSequence instanceof Spanned)) {
            return new InterfaceC131865xM[0];
        }
        return (InterfaceC131865xM[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), InterfaceC131865xM.class);
    }

    private Path getSelectionPath() {
        if (this.A0B == this.A0A || Color.alpha(this.A07) == 0) {
            return null;
        }
        if (this.A0F) {
            Path path = this.A0E;
            if (path == null) {
                path = new Path();
                this.A0E = path;
            }
            this.A02.getSelectionPath(this.A0B, this.A0A, path);
            this.A0F = false;
        }
        return this.A0E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A03;
        if (charSequence != null && charSequence.length() >= 1000000) {
            if (Character.isHighSurrogate(this.A03.charAt(999999)) && Character.isLowSurrogate(this.A03.charAt(DexStore.MS_IN_NS))) {
                return this.A03.subSequence(0, 999999);
            }
            return this.A03.subSequence(0, DexStore.MS_IN_NS);
        }
        return this.A03;
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A03;
        A02(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    public final void A05(C6BM c6bm) {
        C93F c93f = c6bm.A03;
        ColorStateList colorStateList = c93f.A0R;
        this.A03 = c6bm.A04;
        this.A02 = c6bm.A02;
        this.A00 = c6bm.A00;
        this.A01 = c6bm.A01;
        this.A07 = c93f.A0A;
        this.A08 = c93f.A0B;
        this.A04 = c6bm.A05;
        int i = c93f.A0O;
        if (i != 0) {
            this.A0C = null;
            this.A09 = i;
        } else {
            this.A0C = colorStateList;
            this.A09 = colorStateList.getDefaultColor();
            Layout layout = this.A02;
            if (layout != null) {
                layout.getPaint().setColor(this.A0C.getColorForState(getDrawableState(), this.A09));
            }
        }
        A02(0, 0);
        ImageSpan[] imageSpanArr = c6bm.A07;
        if (imageSpanArr != null) {
            this.A0G = imageSpanArr;
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = this.A0G[i2].getDrawable();
                drawable.setCallback(this);
                drawable.setVisible(true, false);
            }
        }
        this.A06 = c6bm.A06;
        String str = c6bm.A03.A0Z;
        if (str != null) {
            setContentDescription(str);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C131725x8 c131725x8 = this.A0H;
        if ((c131725x8 == null || !c131725x8.A0o(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C131725x8 c131725x8 = this.A0H;
        if ((c131725x8 == null || this.A06.length <= 0 || !c131725x8.A0n(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public Layout getLayout() {
        return this.A02;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public CharSequence getText() {
        return this.A03;
    }

    public RCTextView(Context context) {
        super(context);
        this.A05 = false;
        if (getImportantForAccessibility() == 0) {
            C131725x8 c131725x8 = new C131725x8(this);
            this.A0H = c131725x8;
            this.A05 = true;
            AbstractC010103p.A0B(this, c131725x8);
            this.A05 = false;
            return;
        }
        this.A0H = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int save;
        int i;
        int A03 = C0f9.A03(-35733133);
        super.draw(canvas);
        if (this.A02 == null) {
            i = 612983937;
        } else {
            boolean z = false;
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                z = true;
            }
            InterfaceC131865xM[] onPrePostDrawableSpans = getOnPrePostDrawableSpans();
            int length = onPrePostDrawableSpans.length;
            if (length == 0) {
                A03(canvas, this);
            } else {
                X9N wXr = new WXr(this);
                Spanned spanned = (Spanned) this.A03;
                while (true) {
                    length--;
                    X9N x9n = wXr;
                    if (length < 0) {
                        break;
                    }
                    InterfaceC131865xM interfaceC131865xM = onPrePostDrawableSpans[length];
                    spanned.getSpanStart(interfaceC131865xM);
                    spanned.getSpanEnd(interfaceC131865xM);
                    wXr = new WXs(x9n, interfaceC131865xM, this);
                }
                wXr.AQP(canvas);
            }
            if (z) {
                canvas.restoreToCount(save);
            }
            i = -509071747;
        }
        C0f9.A0A(i, A03);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(-510871704);
        super.onFocusChanged(z, i, rect);
        C131725x8 c131725x8 = this.A0H;
        if (c131725x8 != null && this.A06.length > 0) {
            c131725x8.A0j(z, i, rect);
        }
        C0f9.A0D(1223856925, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int A05 = C0f9.A05(-1766223610);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A02(0, 0);
            onTouchEvent = false;
            i = -819567802;
        } else {
            int A00 = A00(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            CharSequence charSequence = this.A03;
            if ((charSequence instanceof Spanned) && A00 >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A00, A00, ClickableSpan.class)) != null && clickableSpanArr.length > 0 && (clickableSpan = clickableSpanArr[0]) != null) {
                onTouchEvent = true;
                if (actionMasked == 1) {
                    A02(0, 0);
                    clickableSpan.onClick(this);
                } else if (actionMasked == 0) {
                    setSelection(clickableSpan);
                }
                i = -418670402;
            } else {
                A02(0, 0);
                onTouchEvent = super.onTouchEvent(motionEvent);
                i = 1041940516;
            }
        }
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        C02V A01;
        super.setAccessibilityDelegate(accessibilityDelegate);
        C131725x8 c131725x8 = this.A0H;
        if (c131725x8 != null && !this.A05 && (A01 = AbstractC010103p.A01(this)) != c131725x8) {
            c131725x8.A00 = A01;
            this.A05 = true;
            AbstractC010103p.A0B(this, c131725x8);
            this.A05 = false;
        }
    }
}
