package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.9Te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210649Te extends FrameLayout {
    public int A00;
    public boolean A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public final Paint A05;

    public C210649Te(Context context) {
        super(context, null, 0);
        Paint A0P = AbstractC166997dE.A0P();
        this.A05 = A0P;
        this.A02 = -1;
        setWillNotDraw(false);
        A0P.setStyle(Paint.Style.FILL_AND_STROKE);
        AbstractC166987dD.A1N(getContext(), A0P, R.color.design_dark_default_color_on_background);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            super.onDraw(r5)
            int r0 = r4.A00
            float r3 = X.AbstractC166987dD.A02(r0)
            boolean r0 = r4.isSelected()
            if (r0 == 0) goto L22
            android.graphics.Paint r2 = r4.A05
        L15:
            r5.drawCircle(r3, r3, r3, r2)
        L18:
            android.graphics.drawable.Drawable r0 = r4.getItemDrawable()
            if (r0 == 0) goto L21
            r0.draw(r5)
        L21:
            return
        L22:
            boolean r0 = r4.A01
            if (r0 == 0) goto L18
            android.graphics.Paint r2 = X.AbstractC166997dE.A0P()
            android.content.Context r1 = r4.getContext()
            r0 = 2131099834(0x7f0600ba, float:1.7812032E38)
            X.AbstractC166987dD.A1N(r1, r2, r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210649Te.onDraw(android.graphics.Canvas):void");
    }

    public final void setIcon(int i) {
        this.A02 = i;
        this.A04 = null;
        this.A03 = null;
    }

    private final Drawable getItemDrawable() {
        if (isSelected()) {
            Drawable drawable = this.A03;
            if (drawable == null) {
                Drawable A00 = AbstractC172817mt.A00(AbstractC166997dE.A0L(this), this.A02, this.A00, isSelected());
                this.A03 = A00;
                return A00;
            }
            return drawable;
        }
        Drawable drawable2 = this.A04;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable A002 = AbstractC172817mt.A00(AbstractC166997dE.A0L(this), this.A02, this.A00, isSelected());
        this.A04 = A002;
        return A002;
    }

    public final void setItemViewState(boolean z) {
        if (z != isSelected()) {
            setSelected(z);
            invalidate();
        }
    }

    public final void setUtilityToolBarItem(boolean z) {
        this.A01 = z;
    }
}
