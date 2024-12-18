package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UAN extends View {
    public InterfaceC16660sJ A00;
    public C69629VsW A01;
    public boolean A02;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        C69629VsW c69629VsW = this.A01;
        if (c69629VsW != null) {
            C69723VuI c69723VuI = c69629VsW.A01;
            if (c69723VuI != null) {
                canvas.drawPath(c69723VuI.A00(), c69723VuI.A02);
            }
            for (C69723VuI c69723VuI2 : c69629VsW.A02) {
                canvas.drawPath(c69723VuI2.A00(), c69723VuI2.A02);
            }
        }
    }

    public final void setBarViewModel(C69629VsW c69629VsW) {
        C14360o3.A0B(c69629VsW, 0);
        this.A01 = c69629VsW;
        A00(this, getMeasuredWidth());
    }

    public final void setOnLayoutListener(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    public static final void A00(UAN uan, int i) {
        C69629VsW c69629VsW = uan.A01;
        if (c69629VsW != null) {
            c69629VsW.A00 = i;
            Context A0L = AbstractC166997dE.A0L(uan);
            float f = c69629VsW.A05;
            int applyDimension = (int) TypedValue.applyDimension(1, f, AbstractC167007dF.A0K(A0L));
            float f2 = c69629VsW.A03;
            int applyDimension2 = (int) TypedValue.applyDimension(1, f2, AbstractC167007dF.A0K(A0L));
            Paint paint = new Paint();
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setColor(c69629VsW.A04);
            int i2 = 0;
            c69629VsW.A01 = new C69723VuI(paint, applyDimension2, 0, c69629VsW.A00, applyDimension, true, true);
            int A07 = AbstractC167017dG.A07(A0L);
            int applyDimension3 = (int) TypedValue.applyDimension(1, f, AbstractC167007dF.A0K(A0L));
            int applyDimension4 = (int) TypedValue.applyDimension(1, f2, AbstractC167007dF.A0K(A0L));
            ArrayList arrayList = new ArrayList();
            List list = c69629VsW.A06;
            int i3 = 0;
            int i4 = 0;
            for (Object obj : list) {
                i2++;
                if (i3 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C69551VrG c69551VrG = (C69551VrG) obj;
                int i5 = (int) (c69551VrG.A00 * c69629VsW.A00);
                Paint paint2 = new Paint();
                paint2.setStyle(style);
                paint2.setColor(c69551VrG.A01);
                arrayList.add(new C69723VuI(paint2, applyDimension4, i4, i4 + i5, applyDimension3, AbstractC167007dF.A1N(i3), AbstractC167007dF.A1P(i3, list.size() - 1)));
                i4 += i5 + A07;
                i3 = i2;
            }
            c69629VsW.A02 = arrayList;
            uan.invalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC16660sJ interfaceC16660sJ;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A02 && (interfaceC16660sJ = this.A00) != null) {
            interfaceC16660sJ.invoke(Integer.valueOf(getWidth()));
            this.A02 = true;
        }
    }
}
