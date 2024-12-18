package com.instagram.quicksnap.emitter;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AnonymousClass194;
import X.C0eB;
import X.C0f9;
import X.C14360o3;
import X.C1JX;
import X.C51976MyK;
import X.C54604OAf;
import X.C54992OUb;
import X.C57169PZn;
import X.C7LH;
import X.C9IR;
import X.InterfaceC23621Ds;
import X.InterfaceC57845PlB;
import X.JQ0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class QuickSnapReactionEmitterView extends View {
    public long A00;
    public long A01;
    public final AccelerateInterpolator A02;
    public final C7LH A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Matrix A07;
    public final Paint A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickSnapReactionEmitterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        setFocusableInTouchMode(false);
        this.A06 = AbstractC25225BEi.A17(20);
        this.A05 = AbstractC25225BEi.A17(20);
        this.A04 = AbstractC25225BEi.A17(20);
        this.A08 = AbstractC166987dD.A0R();
        this.A07 = new Matrix();
        this.A02 = new AccelerateInterpolator(2.0f);
        this.A03 = new C51976MyK(this);
    }

    public final Object A00(C54604OAf c54604OAf, InterfaceC57845PlB interfaceC57845PlB, InterfaceC23621Ds interfaceC23621Ds) {
        if (AbstractC166987dD.A1b(c54604OAf.A02)) {
            setVisibility(0);
            Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C57169PZn((InterfaceC23621Ds) null, this, c54604OAf, interfaceC57845PlB, 19));
            if (A00 == C1JX.A02) {
                return A00;
            }
        }
        return C0eB.A00;
    }

    public final void A01() {
        C9IR.A01.A01(this.A03);
        this.A00 = 0L;
        this.A06.clear();
        List list = this.A05;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C54992OUb) it.next()).A09 = null;
        }
        setVisibility(8);
        list.clear();
        this.A04.clear();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int A0N = AbstractC167017dG.A0N(canvas, 1553989786);
        if (canvas.getDensity() != 0) {
            i = canvas.getDensity();
        } else {
            i = getResources().getDisplayMetrics().densityDpi;
        }
        for (C54992OUb c54992OUb : this.A05) {
            Bitmap bitmap = c54992OUb.A09;
            if (bitmap != null) {
                Matrix matrix = this.A07;
                PointF pointF = c54992OUb.A0B;
                matrix.setTranslate(pointF.x, pointF.y);
                float f = c54992OUb.A02;
                matrix.preScale(f, f);
                matrix.preRotate((float) ((c54992OUb.A05 / 3.141592653589793d) * 180.0d));
                matrix.preTranslate((-bitmap.getScaledWidth(i)) * 0.5f, (-bitmap.getScaledHeight(i)) * 0.5f);
                Paint paint = this.A08;
                paint.setAlpha((int) (c54992OUb.A01 * 255.0f));
                canvas.drawBitmap(bitmap, matrix, paint);
            }
        }
        C0f9.A0A(-2063641073, A0N);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickSnapReactionEmitterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickSnapReactionEmitterView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ QuickSnapReactionEmitterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
