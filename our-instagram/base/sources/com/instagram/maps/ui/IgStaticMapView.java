package com.instagram.maps.ui;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC43594JPz;
import X.AbstractC65702TsY;
import X.AbstractC81033jX;
import X.AnonymousClass001;
import X.C19270xB;
import X.C2TD;
import X.C42961yO;
import X.EnumC68127VCl;
import X.InterfaceC11380iw;
import X.U8I;
import X.ULZ;
import X.VGB;
import X.W55;
import X.WO5;
import X.X24;
import X.X7G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.EnumSet;

/* loaded from: classes11.dex */
public class IgStaticMapView extends FrameLayout {
    public static String A0K = "jpg";
    public static float[] A0L;
    public static final InterfaceC11380iw A0M = new C19270xB("ig_static_map_view");
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Uri A05;
    public View A06;
    public VGB A07;
    public W55 A08;
    public String A09;
    public EnumSet A0A;
    public int A0B;
    public int A0C;
    public View A0D;
    public X7G A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Rect A0H;
    public final StaticMapView$StaticMapOptions A0I;
    public final float[] A0J;

    private void A03(AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.A07 = VGB.A00(attributeSet.getAttributeValue("http://schemas.android.com/apk/facebook", "infoButtonPosition"));
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/facebook", "centeredMapPinDrawable", 0);
            float attributeFloatValue = attributeSet.getAttributeFloatValue("http://schemas.android.com/apk/facebook", "centeredMapPinDrawableAnchorU", 0.5f);
            float attributeFloatValue2 = attributeSet.getAttributeFloatValue("http://schemas.android.com/apk/facebook", "centeredMapPinDrawableAnchorV", 0.5f);
            if (attributeResourceValue != 0) {
                Drawable drawable = getResources().getDrawable(attributeResourceValue);
                float[] fArr = this.A0J;
                fArr[0] = attributeFloatValue;
                fArr[1] = attributeFloatValue2;
                this.A02 = drawable;
                A01();
                invalidate();
            }
        }
        setWillNotDraw(false);
        Resources resources = getResources();
        float f = resources.getDisplayMetrics().density;
        this.A0B = (int) (16.0f * f);
        int max = Math.max(1, (int) (f * 1.0f));
        this.A0C = max;
        Paint paint = this.A0G;
        paint.setStrokeWidth(max);
        paint.setColor(-1842984);
        Context context = getContext();
        IgImageView igImageView = new IgImageView(context);
        AbstractC166997dE.A18(context, igImageView, 2131966031);
        this.A0D = igImageView;
        addView(igImageView, -1, -1);
        Paint paint2 = this.A0F;
        paint2.setColor(-1);
        paint2.setAlpha(178);
        float f2 = resources.getDisplayMetrics().density;
        this.A06 = new View(context);
        U8I u8i = new U8I(this);
        this.A03 = u8i;
        this.A06.setBackground(u8i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = (int) (f2 * 8.0f);
        layoutParams.setMargins(0, 0, i, i);
        layoutParams.gravity = 85;
        this.A06.setLayoutParams(layoutParams);
        WO5.A00(this.A06, 1, this);
        View view = this.A06;
        this.A06 = view;
        addView(view);
        if (isEnabled()) {
            this.A06.setVisibility(0);
        }
    }

    private void A01() {
        Drawable drawable = this.A02;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.A02.getIntrinsicHeight();
            int paddingLeft = getPaddingLeft() + (AbstractC43594JPz.A08(this, getWidth()) / 2);
            float[] fArr = this.A0J;
            int i = paddingLeft - ((int) (intrinsicWidth * fArr[0]));
            int paddingTop = (getPaddingTop() + (AbstractC65702TsY.A0A(this, getHeight()) / 2)) - ((int) (intrinsicHeight * fArr[1]));
            this.A02.setBounds(i, paddingTop, intrinsicWidth + i, intrinsicHeight + paddingTop);
        }
    }

    private void A02() {
        String queryParameter;
        if (this.A01 != 0 && this.A00 != 0) {
            StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = this.A0I;
            if (((staticMapView$StaticMapOptions.A0B != null && staticMapView$StaticMapOptions.A02 != null) || staticMapView$StaticMapOptions.A03 != null || staticMapView$StaticMapOptions.A0A != null || staticMapView$StaticMapOptions.A06 != null || !staticMapView$StaticMapOptions.A0C.isEmpty() || staticMapView$StaticMapOptions.A07 != null) && this.A0D.getVisibility() == 0) {
                Uri A00 = A00(getResources(), staticMapView$StaticMapOptions, C2TD.A03, (int) (staticMapView$StaticMapOptions.A00 * this.A01), (int) (staticMapView$StaticMapOptions.A01 * this.A00));
                if (!A00.equals(this.A05)) {
                    this.A05 = A00;
                    if (this.A09 == null && (queryParameter = A00.getQueryParameter("v")) != null) {
                        this.A09 = queryParameter;
                    }
                    C42961yO c42961yO = C42961yO.A0Q;
                    if (C42961yO.A07 != null) {
                        c42961yO.A05(new X24(this));
                    }
                    ((IgImageView) this.A0D).setUrl(AbstractC81033jX.A00(A00, -1, -1), A0M);
                }
            }
        }
    }

    public static Uri getStaticMapBaseUrl() {
        C2TD.A01(C2TD.A05);
        return Uri.parse(C2TD.A0B.A03);
    }

    public float[] getAnchors() {
        return this.A0J;
    }

    public Drawable getCenteredMapPinDrawable() {
        return this.A02;
    }

    public String getLanguageCode() {
        return C2TD.A03;
    }

    public X7G getMapLoadCallback() {
        return null;
    }

    public StaticMapView$StaticMapOptions getStaticMapOptions() {
        return this.A0I;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return AbstractC167007dF.A1N(this.A0D.getVisibility());
    }

    public void setCenteredMapPinDrawable(Drawable drawable) {
        float[] fArr = this.A0J;
        fArr[0] = 0.5f;
        fArr[1] = 0.5f;
        this.A02 = drawable;
        A01();
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        View view = this.A0D;
        if (z) {
            view.setVisibility(0);
            this.A06.setVisibility(0);
            A02();
        } else {
            view.setVisibility(8);
            this.A06.setVisibility(8);
        }
    }

    public final void setMapOptions(StaticMapView$StaticMapOptions staticMapView$StaticMapOptions) {
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions2 = this.A0I;
        if (!staticMapView$StaticMapOptions2.equals(staticMapView$StaticMapOptions)) {
            staticMapView$StaticMapOptions2.A04 = staticMapView$StaticMapOptions.A04;
            staticMapView$StaticMapOptions2.A08 = staticMapView$StaticMapOptions.A08;
            staticMapView$StaticMapOptions2.A0B = staticMapView$StaticMapOptions.A0B;
            staticMapView$StaticMapOptions2.A02 = staticMapView$StaticMapOptions.A02;
            staticMapView$StaticMapOptions2.A0A = staticMapView$StaticMapOptions.A0A;
            staticMapView$StaticMapOptions2.A03 = staticMapView$StaticMapOptions.A03;
            staticMapView$StaticMapOptions2.A05 = staticMapView$StaticMapOptions.A05;
            staticMapView$StaticMapOptions2.A06 = staticMapView$StaticMapOptions.A06;
            staticMapView$StaticMapOptions2.A07 = staticMapView$StaticMapOptions.A07;
            staticMapView$StaticMapOptions2.A00 = staticMapView$StaticMapOptions.A00;
            staticMapView$StaticMapOptions2.A01 = staticMapView$StaticMapOptions.A01;
            staticMapView$StaticMapOptions2.A0C = staticMapView$StaticMapOptions.A0C;
            staticMapView$StaticMapOptions2.A09 = staticMapView$StaticMapOptions.A09;
            A02();
        }
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = new StaticMapView$StaticMapOptions("");
        this.A0F = new Paint(2);
        this.A0H = new Rect();
        this.A07 = VGB.BOTTOM_RIGHT;
        this.A0A = EnumSet.of(EnumC68127VCl.A00);
        this.A0G = new Paint();
        this.A0J = new float[2];
        A03(attributeSet);
        this.A08 = new ULZ(getContext());
    }

    public static Uri A00(Resources resources, StaticMapView$StaticMapOptions staticMapView$StaticMapOptions, String str, int i, int i2) {
        int i3;
        int i4 = 2;
        if (resources.getDisplayMetrics().density < 1.5f) {
            i4 = 1;
        }
        float f = resources.getDisplayMetrics().density;
        if (f < 1.5f) {
            i3 = 1;
        } else {
            i3 = 3;
            if (f < 2.5f) {
                i3 = 2;
            }
        }
        C2TD.A01(C2TD.A05);
        Uri.Builder appendQueryParameter = Uri.parse(C2TD.A0B.A03).buildUpon().appendQueryParameter("size", AnonymousClass001.A0P("x", i / i4, i2 / i4)).appendQueryParameter("scale", String.valueOf(i4)).appendQueryParameter("marker_scale", String.valueOf(i3)).appendQueryParameter("language", str);
        String str2 = staticMapView$StaticMapOptions.A05;
        if (str2 == null) {
            str2 = A0K;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("format", str2);
        String str3 = staticMapView$StaticMapOptions.A0A;
        if (str3 != null) {
            appendQueryParameter2.appendQueryParameter("visible", str3);
        }
        String str4 = staticMapView$StaticMapOptions.A03;
        if (str4 != null) {
            appendQueryParameter2.appendQueryParameter("circle", str4);
        }
        String str5 = staticMapView$StaticMapOptions.A06;
        if (str5 != null) {
            appendQueryParameter2.appendQueryParameter("markers", str5);
        }
        String str6 = staticMapView$StaticMapOptions.A07;
        if (str6 != null) {
            appendQueryParameter2.appendQueryParameter("path", str6);
        }
        String str7 = staticMapView$StaticMapOptions.A02;
        if (str7 != null) {
            appendQueryParameter2.appendQueryParameter("center", str7);
        }
        String str8 = staticMapView$StaticMapOptions.A0B;
        if (str8 != null) {
            appendQueryParameter2.appendQueryParameter("zoom", str8);
        }
        int size = staticMapView$StaticMapOptions.A0C.size();
        for (int i5 = 0; i5 < size; i5++) {
            String A0c = AnonymousClass001.A0c("marker_list[", "]", i5);
            String str9 = (String) staticMapView$StaticMapOptions.A0C.get(i5);
            if (str9 != null) {
                appendQueryParameter2.appendQueryParameter(A0c, str9);
            }
        }
        String str10 = staticMapView$StaticMapOptions.A09;
        if (str10 != null) {
            appendQueryParameter2.appendQueryParameter("theme", str10);
        }
        String str11 = staticMapView$StaticMapOptions.A04;
        if (str11 == null) {
            str11 = "StaticMapView.java";
        }
        if (str11 != null) {
            appendQueryParameter2.appendQueryParameter("_nc_client_caller", str11);
        }
        String str12 = staticMapView$StaticMapOptions.A08;
        if (str12 != null) {
            appendQueryParameter2.appendQueryParameter("_nc_client_id", str12);
        }
        return appendQueryParameter2.build();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        super.dispatchDraw(canvas);
        if (this.A0D.getVisibility() == 0 && (drawable = this.A02) != null) {
            drawable.draw(canvas);
        }
    }

    public Drawable getInfoGlyph() {
        return getContext().getDrawable(R.drawable.instagram_info_filled_16);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0D.getVisibility() == 0) {
            int save = canvas.save();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A08 = AbstractC65702TsY.A08(this);
            int A07 = AbstractC65702TsY.A07(this);
            canvas.clipRect(paddingLeft, paddingTop, A08, A07);
            canvas.drawColor(-987675);
            int i = A08 - paddingLeft;
            int i2 = A07 - paddingTop;
            canvas.translate(paddingLeft, paddingTop);
            int i3 = this.A0B;
            int i4 = ((((i + i3) - 1) / i3) + (((i2 + i3) - 1) / i3)) << 2;
            float[] fArr = A0L;
            if (fArr == null || fArr.length < i4) {
                fArr = new float[i4];
                A0L = fArr;
            }
            int i5 = i3 - ((this.A0C + 1) / 2);
            int i6 = 0;
            for (int i7 = i5; i7 < i; i7 += i3) {
                int i8 = i6 + 1;
                float f = i7;
                fArr[i6] = f;
                int i9 = i8 + 1;
                fArr[i8] = 0.0f;
                int i10 = i9 + 1;
                fArr[i9] = f;
                i6 = i10 + 1;
                fArr[i10] = i2;
            }
            while (i5 < i2) {
                int i11 = i6 + 1;
                fArr[i6] = 0.0f;
                int i12 = i11 + 1;
                float f2 = i5;
                fArr[i11] = f2;
                int i13 = i12 + 1;
                fArr[i12] = i;
                i6 = i13 + 1;
                fArr[i13] = f2;
                i5 += i3;
            }
            canvas.drawLines(fArr, 0, i6, this.A0G);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int width;
        super.onLayout(z, i, i2, i3, i4);
        int i8 = this.A01;
        int i9 = this.A00;
        this.A01 = this.A0D.getWidth();
        this.A00 = this.A0D.getHeight();
        Drawable drawable = this.A04;
        if (drawable == null) {
            drawable = getInfoGlyph();
            this.A04 = drawable;
        }
        Rect rect = this.A0H;
        if (drawable != null) {
            i5 = drawable.getIntrinsicWidth();
        } else {
            i5 = 0;
        }
        Drawable drawable2 = this.A04;
        if (drawable2 != null) {
            i6 = drawable2.getIntrinsicHeight();
        } else {
            i6 = 0;
        }
        rect.set(0, 0, i5, i6);
        int i10 = (int) (getResources().getDisplayMetrics().density * 8.0f);
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    width = (this.A01 - rect.width()) - i10;
                    i10 = (this.A00 - rect.height()) - i10;
                } else {
                    i7 = (this.A00 - rect.height()) - i10;
                }
            } else {
                width = (this.A01 - rect.width()) - i10;
            }
            i7 = i10;
            i10 = width;
        } else {
            i7 = i10;
        }
        rect.offsetTo(i10, i7);
        if (i8 != this.A01 || i9 != this.A00) {
            A02();
        }
        A01();
    }

    public void setImageDrawable(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    public void setImageFormat(String str) {
        A0K = str;
    }

    public void setInfoButtonPosition(VGB vgb) {
        this.A07 = vgb;
    }

    public void setMapLoadCallback(X7G x7g) {
        this.A0E = x7g;
    }

    public void setMapReporterLauncher(W55 w55) {
        this.A08 = w55;
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = new StaticMapView$StaticMapOptions("");
        this.A0F = new Paint(2);
        this.A0H = new Rect();
        this.A07 = VGB.BOTTOM_RIGHT;
        this.A0A = EnumSet.of(EnumC68127VCl.A00);
        this.A0G = new Paint();
        this.A0J = new float[2];
        A03(attributeSet);
        this.A08 = new ULZ(getContext());
    }

    public IgStaticMapView(Context context) {
        super(context);
        this.A0I = new StaticMapView$StaticMapOptions("");
        this.A0F = new Paint(2);
        this.A0H = new Rect();
        this.A07 = VGB.BOTTOM_RIGHT;
        this.A0A = EnumSet.of(EnumC68127VCl.A00);
        this.A0G = new Paint();
        this.A0J = new float[2];
        A03(null);
        this.A08 = new ULZ(getContext());
    }
}
