package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes11.dex */
public final class WO6 implements View.OnTouchListener {
    public Integer A00 = C05F.A0N;
    public final View A01;
    public final C0SG A02;
    public final GestureDetector A03;
    public final C55982hj A04;

    public static void A00(WO6 wo6, double d) {
        double d2;
        int i;
        View view = wo6.A01;
        float translationY = view.getTranslationY();
        C55982hj c55982hj = wo6.A04;
        c55982hj.A08(translationY, true);
        if (wo6.A00 == C05F.A00) {
            c55982hj.A0A(new Ut2(wo6, 1));
            c55982hj.A07(d);
            Resources resources = wo6.A02.requireActivity().getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 150;
            }
            d2 = i + view.getHeight();
        } else {
            c55982hj.A07(d);
            d2 = 0.0d;
        }
        c55982hj.A06(d2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        double d;
        if (!this.A03.onTouchEvent(motionEvent)) {
            if (motionEvent.getAction() == 1 && (num = this.A00) != C05F.A0N) {
                if (num == C05F.A0C) {
                    d = -2000.0d;
                } else {
                    d = 2000.0d;
                }
                A00(this, d);
            } else {
                return false;
            }
        }
        return true;
    }

    public WO6(Context context, View view, C0SG c0sg) {
        this.A02 = c0sg;
        this.A01 = view;
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        this.A04 = A02;
        A02.A0A(new Ut2(this, 0));
        this.A03 = new GestureDetector(context, new UA5(this));
    }
}
