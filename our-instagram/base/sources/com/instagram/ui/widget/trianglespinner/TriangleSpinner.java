package com.instagram.ui.widget.trianglespinner;

import X.AbstractC12990ll;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC55922hc;
import X.C189448aO;
import X.C189478aR;
import X.C31727DwY;
import X.C43848JaC;
import X.C43873Jad;
import X.C45508KCx;
import X.C50674MYs;
import X.C65990Txj;
import X.C65i;
import X.InterfaceC50410MNm;
import X.InterfaceC57884Plo;
import X.PIL;
import X.ViewOnClickListenerC48047LOt;
import X.YN8;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.ui.widget.mediapicker.Folder;

/* loaded from: classes3.dex */
public class TriangleSpinner extends Spinner {
    public InterfaceC57884Plo A00;
    public InterfaceC50410MNm A01;
    public int A02;
    public int A03;
    public Activity A04;
    public Path A05;
    public Fragment A06;
    public YN8 A07;
    public C65i A08;
    public boolean A09;
    public boolean A0A;
    public final Paint A0B;

    public int getPaddedTriangleSize() {
        return this.A03 + (this.A02 * 2);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC57884Plo interfaceC57884Plo = this.A00;
        if (interfaceC57884Plo != null) {
            C45508KCx c45508KCx = ((PIL) interfaceC57884Plo).A00;
            C50674MYs c50674MYs = new C50674MYs(c45508KCx.requireContext(), (AbstractC12990ll) c45508KCx.A0F.getValue());
            for (Folder folder : c45508KCx.getFolders()) {
                c50674MYs.A0B(folder.getName(), new ViewOnClickListenerC48047LOt(c45508KCx, folder));
            }
            new C31727DwY(c50674MYs).A07(getContext());
            return true;
        }
        InterfaceC50410MNm interfaceC50410MNm = this.A01;
        if (interfaceC50410MNm != null && this.A06 != null && this.A04 != null) {
            C43873Jad c43873Jad = (C43873Jad) interfaceC50410MNm;
            C43848JaC c43848JaC = c43873Jad.A00;
            C189448aO c189448aO = new C189448aO(c43848JaC.A03);
            c43873Jad.A01.invoke();
            C189478aR A00 = c189448aO.A00();
            c43848JaC.A00 = A00;
            A00.A02(this.A04, this.A06);
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(SpinnerAdapter spinnerAdapter) {
        C65990Txj c65990Txj;
        if (spinnerAdapter != null) {
            c65990Txj = new C65990Txj(spinnerAdapter, this);
        } else {
            c65990Txj = null;
        }
        super.setAdapter((SpinnerAdapter) c65990Txj);
    }

    public void setAlignToEdge(boolean z) {
        this.A09 = z;
        invalidate();
    }

    public void setBottomSheetBuilder(Fragment fragment, Activity activity, InterfaceC50410MNm interfaceC50410MNm) {
        this.A01 = interfaceC50410MNm;
        this.A06 = fragment;
        this.A04 = activity;
    }

    public void setTriangleAlpha(int i) {
        this.A0B.setAlpha(i);
        invalidate();
    }

    public void setTriangleColor(int i) {
        this.A0B.setColor(i);
        invalidate();
    }

    public void setTriangleSize(int i) {
        this.A03 = i;
        setTriangleStyle(this.A08);
        AbstractC13880nE.A0c(this, this.A02 + this.A03);
    }

    public void setTriangleStyle(C65i c65i) {
        this.A08 = c65i;
        Path path = new Path();
        this.A05 = path;
        if (c65i == C65i.CORNER) {
            path.moveTo(0.0f, this.A03);
            Path path2 = this.A05;
            float f = this.A03;
            path2.lineTo(f, f);
            this.A05.lineTo(this.A03, 0.0f);
            this.A05.lineTo(0.0f, this.A03);
        } else {
            path.moveTo(0.0f, 0.0f);
            this.A05.lineTo(this.A03, 0.0f);
            Path path3 = this.A05;
            float f2 = this.A03 / 2;
            path3.lineTo(f2, f2);
            this.A05.lineTo(0.0f, 0.0f);
        }
        this.A05.close();
        invalidate();
    }

    public TriangleSpinner(Context context) {
        super(context);
        this.A0B = new Paint(1);
        this.A08 = C65i.CORNER;
        this.A05 = new Path();
        A00(null, 0);
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        this.A0A = AbstractC13620mo.A02(context);
        int A04 = (int) AbstractC13880nE.A04(context, 12);
        C65i c65i = C65i.CORNER;
        int i2 = -16777216;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A2P, i, 0);
            try {
                i2 = obtainStyledAttributes.getColor(0, -16777216);
                A04 = obtainStyledAttributes.getDimensionPixelSize(2, A04);
                int i3 = obtainStyledAttributes.getInt(3, 0);
                if (i3 != 0) {
                    c65i = C65i.DOWNWARD_ARROW;
                    if (i3 != 2) {
                        c65i = C65i.DOWNWARD;
                    }
                }
                this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint = this.A0B;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
        setTriangleSize(A04);
        setTriangleStyle(c65i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            super.onDraw(r7)
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L6f
            r7.save()
            boolean r0 = r6.A09
            r3 = 0
            if (r0 == 0) goto L78
            int r2 = r6.getScrollX()
            int r0 = r7.getWidth()
            int r2 = r2 + r0
            int r0 = r6.A03
            int r2 = r2 - r0
            X.65i r1 = r6.A08
            X.65i r0 = X.C65i.CORNER
            if (r1 != r0) goto Lb2
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r1 = r1 + r0
            double r4 = (double) r1
            int r0 = r6.A03
            float r1 = (float) r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            double r4 = r4 - r0
            int r1 = (int) r4
        L3a:
            float r2 = (float) r2
            float r0 = (float) r1
            r7.translate(r2, r0)
            X.65i r1 = r6.A08
            X.65i r0 = X.C65i.DOWNWARD_ARROW
            if (r1 != r0) goto L70
            android.content.Context r1 = r6.getContext()
            r0 = 2131238131(0x7f081cf3, float:1.8092532E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.graphics.Paint r1 = r6.A0B
            int r0 = r1.getColor()
            android.graphics.ColorFilter r0 = X.C3DY.A00(r0)
            r2.setColorFilter(r0)
            int r0 = r1.getAlpha()
            r2.setAlpha(r0)
            int r0 = r6.A03
            r2.setBounds(r3, r3, r0, r0)
            r2.draw(r7)
        L6c:
            r7.restore()
        L6f:
            return
        L70:
            android.graphics.Path r1 = r6.A05
            android.graphics.Paint r0 = r6.A0B
            r7.drawPath(r1, r0)
            goto L6c
        L78:
            boolean r0 = r6.A0A
            if (r0 == 0) goto La1
            android.view.View r0 = r6.getChildAt(r3)
            int r2 = r0.getLeft()
            int r0 = r6.A02
            int r2 = r2 - r0
            int r0 = r6.A03
            int r2 = r2 - r0
        L8a:
            X.65i r1 = r6.A08
            X.65i r0 = X.C65i.CORNER
            if (r1 != r0) goto Lb2
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r6.A03
            int r0 = r0 / 2
            int r1 = r1 + r0
            goto L3a
        La1:
            int r2 = r6.getScrollX()
            android.view.View r0 = r6.getChildAt(r3)
            int r0 = r0.getRight()
            int r2 = r2 + r0
            int r0 = r6.A02
            int r2 = r2 + r0
            goto L8a
        Lb2:
            X.65i r0 = X.C65i.DOWNWARD_ARROW
            if (r1 != r0) goto Lc8
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r6.A03
            int r0 = r0 / 2
        Lc5:
            int r1 = r1 - r0
            goto L3a
        Lc8:
            int r1 = r6.getScrollY()
            int r0 = r7.getHeight()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r6.A03
            int r0 = r0 / 4
            goto Lc5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.trianglespinner.TriangleSpinner.onDraw(android.graphics.Canvas):void");
    }

    public void setActionSheetBuilder(InterfaceC57884Plo interfaceC57884Plo) {
        this.A00 = interfaceC57884Plo;
    }

    public void setClickInterceptedListener(YN8 yn8) {
        this.A07 = yn8;
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0B = new Paint(1);
        this.A08 = C65i.CORNER;
        this.A05 = new Path();
        A00(attributeSet, i);
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(SpinnerAdapter spinnerAdapter) {
        setAdapter(spinnerAdapter);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0B = new Paint(1);
        this.A08 = C65i.CORNER;
        this.A05 = new Path();
        A00(attributeSet, i);
    }

    public TriangleSpinner(Context context, int i) {
        super(context, i);
        this.A0B = new Paint(1);
        this.A08 = C65i.CORNER;
        this.A05 = new Path();
        A00(null, 0);
    }

    public TriangleSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.triangleSpinnerStyle);
        this.A0B = new Paint(1);
        this.A08 = C65i.CORNER;
        this.A05 = new Path();
        A00(attributeSet, R.attr.triangleSpinnerStyle);
    }
}
