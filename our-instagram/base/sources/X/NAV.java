package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

/* loaded from: classes9.dex */
public final class NAV extends AbstractC65806TuP {
    public SeekBar.OnSeekBarChangeListener A00;
    public C50815Mcp A01;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        AbstractC43593JPy.A1B(frameLayout, -1);
        frameLayout.addView(new AppCompatSeekBar(context));
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Nnm, java.lang.Object] */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r11, X.C6FG r12, X.C102884kP r13, java.lang.Object r14) {
        /*
            r10 = this;
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r5 = 0
            X.C14360o3.A0B(r11, r5)
            X.AbstractC167017dG.A1P(r12, r13)
            java.lang.Object r4 = X.AnonymousClass634.A06(r12, r13)
            X.O9c r4 = (X.C54575O9c) r4
            r1 = 43
            r0 = 0
            float r0 = r13.A02(r1, r0)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            r0 = 40
            java.util.List r8 = r13.A0O(r0)
            r0 = 46
            java.util.List r7 = r13.A0O(r0)
            X.C14360o3.A07(r7)
            r0 = 45
            boolean r2 = r13.A0S(r0, r5)
            r1 = 48
            r0 = 8
            int r1 = r13.A03(r1, r0)
            r6 = 0
            r0 = 50
            X.Nnm r3 = new X.Nnm
            r3.<init>()
            r3.A02 = r9
            r3.A04 = r8
            r3.A03 = r7
            r3.A05 = r2
            r3.A00 = r0
            r3.A01 = r1
            if (r4 == 0) goto L58
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r4.A01
            if (r0 != 0) goto L63
            X.Okt r0 = new X.Okt
            r0.<init>(r5, r11, r10, r4)
            r4.A01 = r0
        L58:
            android.view.ViewTreeObserver r1 = r11.getViewTreeObserver()
            if (r4 == 0) goto Lbf
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r4.A01
        L60:
            r1.addOnGlobalLayoutListener(r0)
        L63:
            int r0 = r11.getChildCount()
            if (r0 <= 0) goto Lc8
            android.view.View r1 = X.AnonymousClass040.A00(r11, r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider"
            X.C14360o3.A0C(r1, r0)
            X.Mcp r1 = (X.C50815Mcp) r1
            r10.A01 = r1
            java.util.List r1 = r3.A04
            if (r4 == 0) goto Lbd
            X.Nnm r0 = r4.A02
            if (r0 == 0) goto Lbd
            java.util.List r0 = r0.A04
        L80:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto La8
            java.lang.String r2 = "parametricSlider"
            if (r4 == 0) goto L95
            X.Mcp r1 = r10.A01
            if (r1 == 0) goto Lb5
            int r0 = r11.getHeight()
            r1.A02(r4, r0)
        L95:
            java.lang.Float r0 = r3.A02
            if (r0 == 0) goto La8
            float r1 = r0.floatValue()
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            X.Mcp r0 = r10.A01
            if (r0 == 0) goto Lb5
            r0.setProgress(r1)
        La8:
            X.OlR r1 = new X.OlR
            r1.<init>(r5, r12, r13, r10)
            r10.A00 = r1
            X.Mcp r0 = r10.A01
            if (r0 != 0) goto Lc1
            java.lang.String r2 = "parametricSlider"
        Lb5:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lbd:
            r0 = r6
            goto L80
        Lbf:
            r0 = r6
            goto L60
        Lc1:
            r0.setOnSeekBarChangeListener(r1)
            if (r4 == 0) goto Lc8
            r4.A02 = r3
        Lc8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NAV.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        if (viewGroup.getChildCount() > 0) {
            View A00 = AnonymousClass040.A00(viewGroup, 0);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
            ((SeekBar) A00).setOnSeekBarChangeListener(null);
        }
        C54575O9c c54575O9c = (C54575O9c) AnonymousClass634.A06(c6fg, c102884kP);
        if (c54575O9c != null) {
            c54575O9c.A02 = null;
            c54575O9c.A01 = null;
            c54575O9c.A00 = null;
        }
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        if (viewGroup.getChildCount() > 0) {
            View A00 = AnonymousClass040.A00(viewGroup, 0);
            C14360o3.A0C(A00, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
            ((SeekBar) A00).setOnSeekBarChangeListener(null);
        }
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
