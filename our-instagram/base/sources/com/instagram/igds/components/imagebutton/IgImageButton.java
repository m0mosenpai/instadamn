package com.instagram.igds.components.imagebutton;

import X.AbstractC002300n;
import X.AbstractC09440dt;
import X.AbstractC13880nE;
import X.AbstractC53242c7;
import X.C0f9;
import X.C1342264k;
import X.C14360o3;
import X.C64n;
import X.C64t;
import X.C64u;
import X.C89533yt;
import X.C9EM;
import X.EnumC153466vG;
import X.EnumC153476vH;
import X.InterfaceC09390do;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class IgImageButton extends ConstrainedImageView implements Drawable.Callback {
    public Drawable A00;
    public EnumC153476vH A01;
    public String A02;
    public String A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public Drawable A09;
    public C64n A0A;
    public C64n A0B;
    public EnumC153466vG A0C;
    public EnumC153466vG A0D;
    public boolean A0E;
    public final C1342264k A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgImageButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static /* synthetic */ void setIconDrawable$default(IgImageButton igImageButton, Drawable drawable, C64n c64n, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i9 = -1;
            }
            if ((i5 & 8) != 0) {
                i8 = -1;
            }
            if ((i5 & 16) != 0) {
                i7 = -1;
            }
            if ((i5 & 32) != 0) {
                i6 = -1;
            }
            C14360o3.A0B(drawable, 0);
            C14360o3.A0B(c64n, 1);
            A05(drawable, c64n, null, igImageButton, i8, i7, i9, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconDrawable");
    }

    public static /* synthetic */ void setIconDrawableInternal$default(IgImageButton igImageButton, EnumC153466vG enumC153466vG, Drawable drawable, C64n c64n, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 8) != 0) {
                i9 = -1;
            }
            if ((i5 & 16) != 0) {
                i8 = -1;
            }
            if ((i5 & 32) != 0) {
                i7 = -1;
            }
            if ((i5 & 64) != 0) {
                i6 = -1;
            }
            A05(drawable, c64n, enumC153466vG, igImageButton, i9, i8, i7, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconDrawableInternal");
    }

    public static /* synthetic */ void setIconDrawableResource$default(IgImageButton igImageButton, int i, C64n c64n, int i2, int i3, int i4, int i5, int i6, Object obj) {
        int i7 = i5;
        int i8 = i4;
        int i9 = i3;
        int i10 = i2;
        if (obj == null) {
            if ((i6 & 4) != 0) {
                i10 = -1;
            }
            if ((i6 & 8) != 0) {
                i9 = -1;
            }
            if ((i6 & 16) != 0) {
                i8 = -1;
            }
            if ((i6 & 32) != 0) {
                i7 = -1;
            }
            C14360o3.A0B(c64n, 1);
            Drawable drawable = igImageButton.getContext().getDrawable(i);
            if (drawable != null) {
                A05(drawable, c64n, null, igImageButton, i9, i8, i10, i7);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconDrawableResource");
    }

    public static /* synthetic */ void setSecondaryIconDrawable$default(IgImageButton igImageButton, Drawable drawable, C64n c64n, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i9 = -1;
            }
            if ((i5 & 8) != 0) {
                i8 = -1;
            }
            if ((i5 & 16) != 0) {
                i7 = -1;
            }
            if ((i5 & 32) != 0) {
                i6 = -1;
            }
            C14360o3.A0B(drawable, 0);
            C14360o3.A0B(c64n, 1);
            A06(drawable, c64n, null, igImageButton, i8, i7, i9, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSecondaryIconDrawable");
    }

    public static /* synthetic */ void setSecondaryIconDrawableInternal$default(IgImageButton igImageButton, EnumC153466vG enumC153466vG, Drawable drawable, C64n c64n, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 8) != 0) {
                i9 = -1;
            }
            if ((i5 & 16) != 0) {
                i8 = -1;
            }
            if ((i5 & 32) != 0) {
                i7 = -1;
            }
            if ((i5 & 64) != 0) {
                i6 = -1;
            }
            A06(drawable, c64n, enumC153466vG, igImageButton, i9, i8, i7, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSecondaryIconDrawableInternal");
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A0F.A00(canvas);
        EnumC153476vH enumC153476vH = this.A01;
        if (enumC153476vH != null) {
            Context context = getContext();
            canvas.drawColor(context.getColor(AbstractC53242c7.A0H(context, enumC153476vH.A00)));
        }
        EnumC153476vH enumC153476vH2 = this.A01;
        if (enumC153476vH2 != null && enumC153476vH2 == EnumC153476vH.A03) {
            canvas.drawColor(getContext().getColor(R.color.black));
        }
        if (this.A0E) {
            canvas.drawRect(getTopLegibilityRect(), getTopLegibilityGradientPaint());
        }
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A09;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Context context2 = getContext();
        C14360o3.A07(context2);
        int A04 = (int) AbstractC13880nE.A04(context2, 8);
        int A042 = (int) AbstractC13880nE.A04(context2, 14);
        Drawable drawable3 = this.A00;
        if (drawable3 != null) {
            float intrinsicWidth = drawable3.getIntrinsicWidth() + (A04 * 2);
            String str = this.A03;
            if (str != null) {
                canvas.drawText(TextUtils.ellipsize(str, getTextPaint(), (canvas.getWidth() - intrinsicWidth) - A04, TextUtils.TruncateAt.END).toString(), intrinsicWidth, getHeight() - A042, getTextPaint());
            }
            drawable3.draw(canvas);
        }
        float A043 = AbstractC13880nE.A04(context2, 8);
        int A044 = (int) AbstractC13880nE.A04(context2, 10);
        String str2 = this.A02;
        if (str2 != null) {
            canvas.drawText(TextUtils.ellipsize(str2, getTextPaint(), canvas.getWidth() - A043, TextUtils.TruncateAt.END).toString(), A043, getHeight() - A044, getTextPaint());
        }
        EnumC153476vH enumC153476vH3 = this.A01;
        if (enumC153476vH3 != null && enumC153476vH3 == EnumC153476vH.A05) {
            String string = context2.getString(2131964698);
            C14360o3.A07(string);
            canvas.drawText(string, (canvas.getWidth() - getTextPaint().measureText(string)) / 2.0f, getHeight() / 2.0f, getTextPaint());
        }
    }

    public final void setIcon(EnumC153466vG enumC153466vG) {
        Drawable drawable;
        C14360o3.A0B(enumC153466vG, 0);
        if (this.A0C != enumC153466vG && (drawable = getContext().getDrawable(enumC153466vG.A03)) != null) {
            A05(drawable, enumC153466vG.A05, enumC153466vG, this, enumC153466vG.A04, enumC153466vG.A02, enumC153466vG.A01, enumC153466vG.A00);
        }
    }

    public final void setIconDrawable(Drawable drawable, C64n c64n) {
        C14360o3.A0B(drawable, 0);
        C14360o3.A0B(c64n, 1);
        A05(drawable, c64n, null, this, -1, -1, -1, -1);
    }

    public final void setSecondaryIcon(EnumC153466vG enumC153466vG) {
        Drawable drawable;
        C14360o3.A0B(enumC153466vG, 0);
        if (this.A0C != enumC153466vG && this.A0D != enumC153466vG && (drawable = getContext().getDrawable(enumC153466vG.A03)) != null) {
            A06(drawable, enumC153466vG.A05, enumC153466vG, this, enumC153466vG.A04, enumC153466vG.A02, enumC153466vG.A01, enumC153466vG.A00);
        }
    }

    public final void setSecondaryIconDrawable(Drawable drawable, C64n c64n) {
        C14360o3.A0B(drawable, 0);
        C14360o3.A0B(c64n, 1);
        A06(drawable, c64n, null, this, -1, -1, -1, -1);
    }

    public final void setUserInfo(ImageUrl imageUrl, String str) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(str, 1);
        String str2 = this.A03;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        Context context = getContext();
        C14360o3.A07(context);
        C89533yt c89533yt = new C89533yt(imageUrl, "ig_image_button", (int) AbstractC13880nE.A04(context, 20), 0, 0, context.getColor(R.color.fds_transparent));
        c89533yt.setCallback(this);
        setUserInfoInternal(c89533yt, str);
    }

    public static final void A05(Drawable drawable, C64n c64n, EnumC153466vG enumC153466vG, IgImageButton igImageButton, int i, int i2, int i3, int i4) {
        igImageButton.A0C = enumC153466vG;
        igImageButton.A08 = drawable;
        if (i3 != -1) {
            if (drawable != null) {
                drawable.mutate();
            }
            Drawable drawable2 = igImageButton.A08;
            if (drawable2 != null) {
                drawable2.setColorFilter(igImageButton.getContext().getColor(i3), PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (i4 != -1) {
            Drawable drawable3 = igImageButton.A08;
            if (drawable3 != null) {
                drawable3.mutate();
            }
            Drawable drawable4 = igImageButton.A08;
            if (drawable4 != null) {
                drawable4.setAlpha(i4);
            }
        }
        igImageButton.A0A = c64n;
        igImageButton.A05 = i;
        igImageButton.A04 = i2;
        Drawable drawable5 = igImageButton.A08;
        if (drawable5 != null) {
            c64n.A00(drawable5, i, i2, igImageButton.getWidth(), igImageButton.getHeight());
        }
        igImageButton.invalidate();
    }

    public static final void A06(Drawable drawable, C64n c64n, EnumC153466vG enumC153466vG, IgImageButton igImageButton, int i, int i2, int i3, int i4) {
        igImageButton.A0D = enumC153466vG;
        igImageButton.A09 = drawable;
        if (i3 != -1) {
            if (drawable != null) {
                drawable.mutate();
            }
            Drawable drawable2 = igImageButton.A09;
            if (drawable2 != null) {
                drawable2.setColorFilter(igImageButton.getContext().getColor(i3), PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (i4 != -1) {
            Drawable drawable3 = igImageButton.A09;
            if (drawable3 != null) {
                drawable3.mutate();
            }
            Drawable drawable4 = igImageButton.A09;
            if (drawable4 != null) {
                drawable4.setAlpha(i4);
            }
        }
        igImageButton.A0B = c64n;
        igImageButton.A07 = i;
        igImageButton.A06 = i2;
        Drawable drawable5 = igImageButton.A09;
        if (drawable5 != null) {
            c64n.A00(drawable5, i, i2, igImageButton.getWidth(), igImageButton.getHeight());
        }
        igImageButton.invalidate();
    }

    private final Paint getTopLegibilityGradientPaint() {
        return (Paint) this.A0H.getValue();
    }

    private final Rect getTopLegibilityRect() {
        return (Rect) this.A0I.getValue();
    }

    public final void A0H() {
        A05(null, C64n.A06, null, this, -1, -1, -1, -1);
    }

    public final boolean getShouldDrawLegibilityBackground() {
        return this.A0E;
    }

    public final TextPaint getTextPaint() {
        return (TextPaint) this.A0G.getValue();
    }

    public final void setEnableTouchOverlay(boolean z) {
        this.A0F.A00 = z;
    }

    public final void setHighlightName(String str) {
        this.A02 = str;
        invalidate();
    }

    public final void setMediaOverlay(EnumC153476vH enumC153476vH) {
        this.A01 = enumC153476vH;
        invalidate();
    }

    public final void setUserInfoInternal(C89533yt c89533yt, String str) {
        if (!AbstractC002300n.A0g(this.A03, str, false)) {
            this.A00 = c89533yt;
            this.A03 = str;
            getWidth();
            A04(getHeight());
            invalidate();
        }
    }

    private final void A04(int i) {
        Context context = getContext();
        C14360o3.A07(context);
        int A04 = (int) AbstractC13880nE.A04(context, 8);
        int A042 = (int) AbstractC13880nE.A04(context, 8);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(A04, (i - drawable.getIntrinsicHeight()) - A042, drawable.getIntrinsicWidth() + A04, i - A042);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-531236997);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A08;
        if (drawable != null) {
            this.A0A.A00(drawable, this.A05, this.A04, i, i2);
            getTopLegibilityGradientPaint().setShader(new LinearGradient(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, drawable.getIntrinsicHeight(), new int[]{getContext().getColor(R.color.black_50_transparent), 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            getTopLegibilityRect().set(0, 0, getWidth(), drawable.getIntrinsicHeight());
        }
        Drawable drawable2 = this.A09;
        if (drawable2 != null) {
            this.A0B.A00(drawable2, this.A07, this.A06, i, i2);
        }
        A04(i2);
        C0f9.A0D(-1156262012, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = -1722906845(0xffffffff994e8723, float:-1.0677241E-23)
            int r2 = X.C0f9.A05(r0)
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.64k r1 = r3.A0F
            boolean r0 = r1.A00
            if (r0 == 0) goto L16
            X.64l r0 = r1.A02
            r0.A02(r4)
        L16:
            boolean r0 = super.onTouchEvent(r4)
            if (r0 != 0) goto L21
            boolean r0 = r1.A00
            r1 = 0
            if (r0 == 0) goto L22
        L21:
            r1 = 1
        L22:
            r0 = 1126293271(0x4321df17, float:161.87144)
            X.C0f9.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.imagebutton.IgImageButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    public final void setShouldDrawLegibilityBackground(boolean z) {
        this.A0E = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C1342264k c1342264k = new C1342264k(this);
        this.A0F = c1342264k;
        this.A0A = C64n.A06;
        this.A05 = -1;
        this.A04 = -1;
        this.A0B = C64n.A05;
        this.A07 = -1;
        this.A06 = -1;
        this.A0H = AbstractC09440dt.A01(C64t.A00);
        this.A0I = AbstractC09440dt.A01(C64u.A00);
        this.A0G = AbstractC09440dt.A01(new C9EM(context, 28));
        setAdjustViewBounds(false);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setPlaceHolderColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_highlight_background)));
        c1342264k.A00 = true;
    }

    public /* synthetic */ IgImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
