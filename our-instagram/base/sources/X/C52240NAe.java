package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.facebook.R;

/* renamed from: X.NAe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52240NAe extends AbstractC65806TuP {
    public final C6FG A00;
    public final C102884kP A01;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        C102884kP c102884kP = this.A01;
        C6FG c6fg = this.A00;
        AbstractC167007dF.A1D(c102884kP, 0, c6fg);
        C102884kP A08 = c102884kP.A08(41);
        C102884kP A082 = c102884kP.A08(35);
        C102884kP A083 = c102884kP.A08(43);
        int color = context.getColor(R.color.body_parametric_default_progress_color);
        if (A08 != null) {
            color = C6BK.A00(c6fg, A08, color);
        }
        int color2 = context.getColor(R.color.body_parametric_default_progress_color);
        if (A082 != null) {
            color2 = C6BK.A00(c6fg, A082, color2);
        }
        int color3 = context.getColor(R.color.black_10_transparent);
        if (A083 != null) {
            color3 = C6BK.A00(c6fg, A083, color3);
        }
        return new BZ9(context, new C27999CVw(c102884kP.A02(46, 0.0f), color, color2, color3));
    }

    public static final void A00(SeekBar seekBar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = seekBar.getContext().getSystemService((Class<Object>) Vibrator.class);
            C14360o3.A0C(systemService, AbstractC111324zv.A00(1134));
            ((Vibrator) systemService).vibrate(VibrationEffect.createPredefined(2));
            return;
        }
        seekBar.performHapticFeedback(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (X.C14360o3.A0I(r0, r6) == false) goto L15;
     */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r9, X.C6FG r10, X.C102884kP r11, java.lang.Object r12) {
        /*
            r8 = this;
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r1 = 0
            X.C14360o3.A0B(r9, r1)
            X.AbstractC167017dG.A1P(r10, r11)
            int r0 = r9.getChildCount()
            r7 = 0
            if (r0 <= 0) goto L8c
            r3 = 0
            android.view.View r0 = X.AnonymousClass040.A00(r9, r1)
            boolean r0 = r0 instanceof android.widget.SeekBar
            if (r0 == 0) goto L8c
            android.view.View r2 = X.AnonymousClass040.A00(r9, r1)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.SeekBar"
            X.C14360o3.A0C(r2, r0)
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            java.lang.Object r1 = X.AnonymousClass634.A06(r10, r11)
            X.O6Z r1 = (X.O6Z) r1
            r0 = 46
            r5 = 0
            float r4 = r11.A02(r0, r5)
            r0 = 44
            float r6 = r11.A02(r0, r5)
            if (r1 == 0) goto L95
            java.lang.Float r0 = r1.A01
        L3b:
            boolean r0 = X.C14360o3.A0I(r0, r4)
            if (r0 == 0) goto L4b
            if (r1 == 0) goto L93
            java.lang.Float r0 = r1.A00
        L45:
            boolean r0 = X.C14360o3.A0I(r0, r6)
            if (r0 != 0) goto L73
        L4b:
            if (r1 == 0) goto L59
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r1.A01 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r1.A00 = r0
        L59:
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L90
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r4
            int r0 = (int) r0
        L61:
            r2.setMax(r0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r4
        L6b:
            r1 = r2
            X.BZI r1 = (X.BZI) r1
            float r6 = r6 * r0
            int r0 = (int) r6
            r1.setInitialProgress(r0)
        L73:
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "android.permission.VIBRATE"
            int r0 = X.C02G.A00(r1, r0)
            if (r0 != 0) goto L84
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L84
            r3 = 1
        L84:
            X.OlQ r0 = new X.OlQ
            r0.<init>(r8, r10, r11, r3)
            r2.setOnSeekBarChangeListener(r0)
        L8c:
            return r7
        L8d:
            r0 = 1120403456(0x42c80000, float:100.0)
            goto L6b
        L90:
            r0 = 100
            goto L61
        L93:
            r0 = r7
            goto L45
        L95:
            r0 = r7
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52240NAe.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C14360o3.A0B(viewGroup, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        if (viewGroup.getChildCount() > 0 && (AnonymousClass040.A00(viewGroup, 0) instanceof SeekBar)) {
            View A00 = AnonymousClass040.A00(viewGroup, 0);
            C14360o3.A0C(A00, "null cannot be cast to non-null type android.widget.SeekBar");
            ((SeekBar) A00).setOnSeekBarChangeListener(null);
            viewGroup.setTag(R.id.IS_INITIAL_PROGRESS_SET, false);
        }
    }

    public C52240NAe(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A01 = c102884kP;
        this.A00 = c6fg;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        AbstractC167017dG.A1P(c6fg, c102884kP);
        O6Z o6z = (O6Z) AnonymousClass634.A06(c6fg, c102884kP);
        if (o6z != null) {
            o6z.A01 = null;
            o6z.A00 = null;
        }
    }
}
