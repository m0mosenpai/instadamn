package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WEa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70161WEa {
    public static final void A00(Context context, View view, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, f, AbstractC167007dF.A0K(context));
        if (applyDimension < 1) {
            applyDimension = 1;
        }
        layoutParams.height = applyDimension;
        view.setLayoutParams(layoutParams);
        AbstractC70177WFc.A01(view, i);
        if (z) {
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r6, android.view.View r7, X.VD0 r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            r5 = 0
            boolean r0 = X.AbstractC167007dF.A1R(r5, r6, r7)
            r4 = 2
            int r3 = r8.ordinal()
            java.lang.String r2 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"
            if (r3 == r5) goto L62
            if (r3 == r0) goto L66
            r0 = 28
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            if (r3 == r4) goto L5e
            r0 = 3
            if (r3 != r0) goto L71
            r0 = 2131237299(0x7f0819b3, float:1.8090845E38)
        L1e:
            r7.setBackgroundResource(r0)
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            X.C14360o3.A0C(r0, r1)
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r5)
        L2e:
            X.C14360o3.A0C(r3, r2)
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            int r1 = r9.intValue()
            X.W5t r0 = X.C2FP.A0A()
            int r0 = r0.A02(r6, r1)
            r3.setColor(r0)
            if (r10 == 0) goto L5d
            int r2 = r10.intValue()
            r0 = 2130969526(0x7f0403b6, float:1.7547736E38)
            int r1 = X.WFM.A00(r6, r0)
            r3.mutate()
            X.W5t r0 = X.C2FP.A0A()
            int r0 = r0.A02(r6, r2)
            r3.setStroke(r1, r0)
        L5d:
            return
        L5e:
            r0 = 2131237300(0x7f0819b4, float:1.8090847E38)
            goto L1e
        L62:
            r0 = 2131237297(0x7f0819b1, float:1.809084E38)
            goto L69
        L66:
            r0 = 2131237298(0x7f0819b2, float:1.8090843E38)
        L69:
            r7.setBackgroundResource(r0)
            android.graphics.drawable.Drawable r3 = r7.getBackground()
            goto L2e
        L71:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70161WEa.A02(android.content.Context, android.view.View, X.VD0, java.lang.Integer, java.lang.Integer):void");
    }

    public final void A03(Context context, View view, VD0 vd0, int i) {
        C14360o3.A0B(view, 1);
        A01(context, view, vd0);
        AbstractC70177WFc.A05(view, C2FP.A0A().A01(i), false);
    }

    public static void A01(Context context, View view, VD0 vd0) {
        A02(context, view, vd0, 59, 60);
    }
}
