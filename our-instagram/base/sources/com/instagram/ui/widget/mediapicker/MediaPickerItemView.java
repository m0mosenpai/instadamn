package com.instagram.ui.widget.mediapicker;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC43592JPx;
import X.AbstractC44294Jhk;
import X.AbstractC47116KsB;
import X.AbstractC55922hc;
import X.BCZ;
import X.C0f9;
import X.C14360o3;
import X.C153406vA;
import X.C193498hU;
import X.C1NJ;
import X.C1OG;
import X.C25821No;
import X.C48269LXs;
import X.C49660Lwr;
import X.C8IT;
import X.C8SG;
import X.C9BB;
import X.EnumC44309Ji0;
import X.EnumC44310Ji1;
import X.InterfaceC193488hT;
import X.InterfaceC50407MNj;
import X.InterfaceC50408MNk;
import X.JQ0;
import X.MQJ;
import X.UBJ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public class MediaPickerItemView extends UBJ implements InterfaceC193488hT, BCZ {
    public static final int A0X;
    public static final Paint A0Y;
    public static final Paint A0Z;
    public static final Paint A0a;
    public Bitmap A00;
    public Drawable A01;
    public C9BB A02;
    public C8IT A03;
    public GalleryItem A04;
    public InterfaceC50407MNj A05;
    public EnumC44309Ji0 A06;
    public EnumC44310Ji1 A07;
    public Float A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public Drawable A0D;
    public C193498hU A0E;
    public InterfaceC50408MNk A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final int A0J;
    public final Bitmap A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;
    public final C1NJ A0S;
    public final C1NJ A0T;
    public final C153406vA A0U;
    public final MQJ A0V;
    public final boolean A0W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, AttributeSet attributeSet, MQJ mqj, boolean z, Float f) {
        super(context, attributeSet, R.attr.mediaPickerItemStyle);
        C14360o3.A0B(context, 1);
        this.A0I = context;
        this.A0V = mqj;
        this.A0W = z;
        this.A07 = EnumC44310Ji1.A03;
        this.A06 = EnumC44309Ji0.A06;
        this.A08 = f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1k, R.attr.mediaPickerItemStyle, 0);
        C14360o3.A07(obtainStyledAttributes);
        int color = obtainStyledAttributes.getColor(0, -12303292);
        int color2 = obtainStyledAttributes.getColor(2, Color.argb(200, 0, 0, 0));
        Resources resources = getResources();
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, AbstractC166997dE.A0D(resources));
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        Paint A0R = AbstractC166987dD.A0R();
        this.A0N = A0R;
        AbstractC166987dD.A1R(A0R);
        A0R.setColor(color);
        Paint A0S = AbstractC166987dD.A0S(2);
        this.A0O = A0S;
        A0S.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_ATOP));
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A0P = A0R2;
        AbstractC43592JPx.A1E(A0R2);
        A0R2.setStrokeWidth(dimensionPixelOffset);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A0Q = A0S2;
        A0S2.setColor(-1);
        A0S2.setTextAlign(Paint.Align.RIGHT);
        A0S2.setTextSize(AbstractC166987dD.A04(resources, R.dimen.button_text_size));
        Paint A0S3 = AbstractC166987dD.A0S(1);
        this.A0M = A0S3;
        A0S3.setColor(-1);
        A0S3.setTextAlign(Paint.Align.LEFT);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.auth_edit_field_text_size);
        this.A0J = dimensionPixelSize;
        A0S3.setTextSize(dimensionPixelSize);
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.filled_grid_album_icon);
        if (decodeResource != null) {
            this.A0K = decodeResource;
            this.A0L = AbstractC166987dD.A0S(2);
            this.A0D = null;
            this.A01 = null;
            this.A0U = new C153406vA(context);
            this.A0R = AbstractC166987dD.A0X();
            this.A0F = new C49660Lwr();
            this.A0S = new C48269LXs(this, 2);
            this.A0T = new C48269LXs(this, 3);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final boolean A00(C9BB c9bb, C8IT c8it, GalleryItem galleryItem, boolean z, boolean z2, boolean z3, boolean z4) {
        setEnabled(true);
        this.A0C = z;
        this.A0H = z2;
        this.A0B = z3;
        this.A0G = z4;
        C153406vA c153406vA = this.A0U;
        c153406vA.A00(c9bb.A00 + 1);
        c153406vA.A04 = c9bb.A02;
        c153406vA.invalidateSelf();
        if (C14360o3.A0K(c8it.BK3(), this.A09) && this.A02 == c9bb) {
            return false;
        }
        this.A02 = c9bb;
        this.A04 = galleryItem;
        this.A00 = null;
        this.A09 = c8it.BK3();
        this.A03 = c8it;
        A02();
        setChecked(c9bb.A02);
        invalidate();
        return true;
    }

    private final C1NJ getBindRemoteMediaCallback() {
        return new C48269LXs(this, 2);
    }

    private final C1NJ getBindScheduledContentMediaCallback() {
        return new C48269LXs(this, 3);
    }

    public final void A03(C9BB c9bb, C8SG c8sg, GalleryItem galleryItem, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167007dF.A1G(galleryItem, 0, c8sg);
        Medium medium = galleryItem.A00;
        if (medium != null) {
            A00(c9bb, medium, galleryItem, z, z2, z3, z4);
            this.A0E = c8sg.AGR(null, this.A0E, medium, this, null, null, null);
            invalidate();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A04(C9BB c9bb, GalleryItem galleryItem, InterfaceC50407MNj interfaceC50407MNj, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str;
        C1NJ c48269LXs;
        this.A05 = interfaceC50407MNj;
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            boolean A00 = A00(c9bb, remoteMedia, galleryItem, z, false, z2, false);
            if (z6 || A00) {
                this.A0A = true;
                C1OG A0J = C25821No.A00().A0J(remoteMedia.A03, null);
                A0J.A0I = false;
                A0J.A0L = z3;
                if (z5) {
                    str = remoteMedia.A06;
                } else {
                    str = null;
                }
                A0J.A08 = str;
                if (z4) {
                    c48269LXs = this.A0S;
                } else {
                    c48269LXs = new C48269LXs(this, 2);
                }
                A0J.A02(c48269LXs);
                A0J.A01();
            }
            invalidate();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        C14360o3.A0B(medium, 0);
        C8IT c8it = this.A03;
        if (c8it != null && C14360o3.A0K(String.valueOf(medium.A05), c8it.BK3())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
        C14360o3.A0B(medium, 0);
        if (C14360o3.A0K(String.valueOf(medium.A05), this.A09)) {
            this.A00 = null;
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.mediapicker.MediaPickerItemView.onDraw(android.graphics.Canvas):void");
    }

    public final void setBottomLeftIcon(EnumC44309Ji0 enumC44309Ji0) {
        C14360o3.A0B(enumC44309Ji0, 0);
        Integer A00 = AbstractC47116KsB.A00(enumC44309Ji0);
        Drawable drawable = null;
        if (A00 != null) {
            drawable = this.A0I.getDrawable(A00.intValue());
            JQ0.A0w(drawable, this);
        }
        this.A0D = drawable;
    }

    public final void setRemoteMediaImageLoadListener(InterfaceC50408MNk interfaceC50408MNk) {
        C14360o3.A0B(interfaceC50408MNk, 0);
        this.A0F = interfaceC50408MNk;
    }

    public final void setTopLeftIcon(EnumC44309Ji0 enumC44309Ji0) {
        C14360o3.A0B(enumC44309Ji0, 0);
        this.A06 = enumC44309Ji0;
        Integer A00 = AbstractC47116KsB.A00(enumC44309Ji0);
        Drawable drawable = null;
        boolean z = true;
        if (A00 == null) {
            if (this.A01 == null) {
                z = false;
            }
        } else {
            drawable = this.A0I.getDrawable(A00.intValue());
            z = true ^ C14360o3.A0K(this.A01, drawable);
            JQ0.A0w(drawable, this);
        }
        this.A01 = drawable;
        if (z) {
            invalidate();
        }
    }

    public final void setViewRenderMode(EnumC44310Ji1 enumC44310Ji1) {
        C14360o3.A0B(enumC44310Ji1, 0);
        if (this.A07 != enumC44310Ji1) {
            this.A07 = enumC44310Ji1;
            invalidate();
        }
        if (enumC44310Ji1 == EnumC44310Ji1.A02) {
            setEnabled(false);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
    }

    static {
        int argb = Color.argb(204, 255, 255, 255);
        A0X = argb;
        Paint A0R = AbstractC166987dD.A0R();
        A0Y = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        A0Z = A0R2;
        A0a = AbstractC166987dD.A0S(2);
        Paint.Style style = Paint.Style.FILL;
        A0R2.setStyle(style);
        A0R2.setColor(argb);
        A0R.setStyle(style);
        A0R.setColor(Color.argb(180, 147, 147, 147));
    }

    public final void A01() {
        C9BB c9bb = this.A02;
        if (c9bb != null) {
            C153406vA c153406vA = this.A0U;
            c153406vA.A04 = false;
            c153406vA.invalidateSelf();
            if (c9bb.A02) {
                c9bb.A02 = false;
                c9bb.A01--;
                invalidate();
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("State is null. Make sure bind() has been called.");
    }

    public final void A02() {
        GalleryItem galleryItem = this.A04;
        if (galleryItem != null) {
            C9BB c9bb = this.A02;
            if (c9bb != null) {
                setContentDescription(AbstractC44294Jhk.A00(AbstractC166997dE.A0L(this), galleryItem.A00, c9bb.A00, c9bb.A01, galleryItem.A01(), galleryItem.A06(), this.A0C));
                return;
            }
            throw AbstractC166987dD.A14("State is null. Make sure bind() has been called.");
        }
    }

    @Override // X.BCZ
    public final boolean CXY(Draft draft) {
        C8IT c8it = this.A03;
        if (c8it != null && C14360o3.A0K(draft.A04, c8it.BK3())) {
            return true;
        }
        return false;
    }

    @Override // X.BCZ
    public final void Dt2(Bitmap bitmap, Draft draft) {
        if (C14360o3.A0K(draft.A04, this.A09)) {
            this.A00 = bitmap;
            invalidate();
        }
    }

    public final void setSelectedIndex(int i) {
        C9BB c9bb = this.A02;
        if (c9bb != null) {
            C153406vA c153406vA = this.A0U;
            c153406vA.A04 = true;
            c153406vA.invalidateSelf();
            c153406vA.A00(i + 1);
            if (!c9bb.A02 || c9bb.A00 != i) {
                c9bb.A02 = true;
                c9bb.A00 = i;
                c9bb.A01++;
                invalidate();
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("State is null. Make sure bind() has been called.");
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167017dG.A1O(medium, bitmap);
        if (C14360o3.A0K(String.valueOf(medium.A05), this.A09)) {
            this.A00 = bitmap;
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(1222199543);
        Float f = this.A08;
        if (f == null) {
            if (this.A0W) {
                i2 = i;
            }
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i);
            View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, (int) (size2 / f.floatValue()));
        }
        C0f9.A0D(-556041658, A06);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, MQJ mqj, boolean z) {
        this(context, (AttributeSet) null, mqj, z, (Float) null);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ MediaPickerItemView(Context context, MQJ mqj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : mqj, (i & 4) != 0 ? true : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, MQJ mqj) {
        this(context, mqj, true);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (MQJ) null, true, (Float) null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context, MQJ mqj, float f) {
        this(context, (AttributeSet) null, mqj, false, Float.valueOf(f));
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaPickerItemView(Context context) {
        this(context, (MQJ) null, true);
        C14360o3.A0B(context, 1);
    }
}
