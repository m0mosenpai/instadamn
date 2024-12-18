package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Jkf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44428Jkf extends FrameLayout implements InterfaceC57932Pmc {
    public C55105ObK A00;
    public SpinnerImageView A01;
    public boolean A02;
    public EnumC46217Kct A03;
    public boolean A04;
    public final C44437Jky A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44428Jkf(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A03 = EnumC46217Kct.A06;
        setBackground(null);
        setClickable(true);
        setFocusable(true);
        C44437Jky c44437Jky = new C44437Jky(context, this.A03, getParent() instanceof RadioGroup);
        this.A05 = c44437Jky;
        addView(c44437Jky, new FrameLayout.LayoutParams(-2, -1));
    }

    public static final FrameLayout.LayoutParams A00(C44428Jkf c44428Jkf, int i) {
        c44428Jkf.A04 = false;
        Rect A0W = AbstractC166987dD.A0W(c44428Jkf.A05.A02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = A0W.centerY() - (i / 2);
        if (A0W.centerY() == 0 || i == 0) {
            c44428Jkf.A04 = true;
        }
        return layoutParams;
    }

    public final void A03(InterfaceC50490MQs interfaceC50490MQs, boolean z) {
        C14360o3.A0B(interfaceC50490MQs, 0);
        C44437Jky c44437Jky = this.A05;
        c44437Jky.A09 = z;
        c44437Jky.A01 = interfaceC50490MQs;
        c44437Jky.A04 = interfaceC50490MQs.getName();
        c44437Jky.A02 = interfaceC50490MQs.AWq(c44437Jky.getContext(), null, c44437Jky.A03);
        C44437Jky.A02(c44437Jky);
        A01(c44437Jky.isChecked());
    }

    public final void setConfig(EnumC46217Kct enumC46217Kct) {
        C14360o3.A0B(enumC46217Kct, 0);
        this.A03 = enumC46217Kct;
        this.A05.A03 = enumC46217Kct;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(boolean r6) {
        /*
            r5 = this;
            X.Jky r4 = r5.A05
            X.MQs r1 = r4.A01
            X.C14360o3.A07(r1)
            boolean r0 = r1 instanceof X.AbstractC48580LeI
            if (r0 == 0) goto L3a
            java.lang.Integer r0 = X.C05F.A02
            X.AbstractC56952jT.A04(r5, r0)
            if (r6 == 0) goto L3b
            r0 = r1
            X.LeI r0 = (X.AbstractC48580LeI) r0
            X.OBe r0 = r0.A00
            X.8M7 r3 = r0.A01
            int r0 = r3.A00
            if (r0 == 0) goto L3b
            android.content.Context r2 = r5.getContext()
            r1 = 2131962572(0x7f132acc, float:1.9561873E38)
            java.lang.String r0 = r3.A03
            java.lang.String r0 = X.AbstractC167007dF.A0f(r2, r0, r1)
        L2a:
            r5.setContentDescription(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L3a
            java.lang.CharSequence r0 = r4.getStateDescription()
            X.AbstractC010103p.A0G(r5, r0)
        L3a:
            return
        L3b:
            X.LeI r1 = (X.AbstractC48580LeI) r1
            X.OBe r0 = r1.A00
            X.8M7 r0 = r0.A01
            java.lang.String r0 = r0.A03
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44428Jkf.A01(boolean):void");
    }

    public final void A02() {
        Drawable drawable;
        C44437Jky c44437Jky = this.A05;
        InterfaceC50490MQs interfaceC50490MQs = c44437Jky.A01;
        Context context = c44437Jky.getContext();
        AbstractC44335Jia abstractC44335Jia = c44437Jky.A02;
        if (abstractC44335Jia != null) {
            drawable = abstractC44335Jia.A00;
        } else {
            drawable = null;
        }
        c44437Jky.A02 = interfaceC50490MQs.AWq(context, drawable, c44437Jky.A03);
        C44437Jky.A01(c44437Jky);
        c44437Jky.postInvalidate();
    }

    @Override // X.InterfaceC57932Pmc
    public final void Czq(int i, Bitmap bitmap) {
        this.A05.Czq(i, bitmap);
    }

    public final int getTileId() {
        return C44437Jky.A00(this.A05);
    }

    public final InterfaceC50490MQs getTileInfo() {
        InterfaceC50490MQs interfaceC50490MQs = this.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        return interfaceC50490MQs;
    }

    public final void setBlurIconCache(C55105ObK c55105ObK) {
        this.A00 = c55105ObK;
    }

    public final void setChecked(boolean z) {
        C44437Jky c44437Jky = this.A05;
        if (z != c44437Jky.isChecked()) {
            c44437Jky.setChecked(z);
            c44437Jky.invalidate();
            A01(z);
        }
    }

    public final void setDraggable(boolean z) {
        this.A05.A05 = z;
    }

    public final void setShouldShowSlidersIcon(boolean z) {
        this.A05.A06 = z;
    }

    public final void setShouldUseBlurIcons(boolean z) {
        this.A02 = z;
    }

    public final void setShowTextBelowPreviewThumbnail(boolean z) {
        this.A05.A08 = z;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float size = View.MeasureSpec.getSize(i2);
        int min = Math.min(LBN.A00(AbstractC166997dE.A0L(this), this.A03), AbstractC166987dD.A0A(0.85f, size));
        this.A05.A00 = min;
        int round = Math.round(size);
        setMeasuredDimension(min, round);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
        if (this.A04) {
            SpinnerImageView spinnerImageView = this.A01;
            if (spinnerImageView != null) {
                spinnerImageView.setLayoutParams(A00(this, round));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void setIsChecked(boolean z) {
        setChecked(z);
    }
}
