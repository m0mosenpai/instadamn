package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BbD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25796BbD extends C04N {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L2S A01;
    public final /* synthetic */ Float A02;
    public final /* synthetic */ Float A03;
    public final /* synthetic */ InterfaceC24901Jp A04;

    @Override // X.C04N
    public final void A04(C04U c04u) {
        Float f;
        C14360o3.A0B(c04u, 0);
        L2S l2s = this.A01;
        CT8 ct8 = l2s.A02;
        View view = ct8.A02;
        C04U.A01(view, null);
        ct8.A04.setAlpha(0.0f);
        View view2 = ct8.A01;
        view2.setAlpha(0.0f);
        View view3 = ct8.A03;
        view3.setAlpha(0.0f);
        View view4 = ct8.A06;
        view4.setAlpha(0.0f);
        View view5 = ct8.A07;
        view5.setAlpha(0.0f);
        View view6 = ct8.A05;
        if (view6 == null) {
            view6 = view;
        }
        Drawable background = view6.getBackground();
        if (background != null) {
            background.setAlpha(0);
        }
        Float f2 = this.A02;
        if (f2 != null && (f = this.A03) != null) {
            view5.setTranslationX(f2.floatValue());
            view5.setTranslationY(f.floatValue());
            view5.setScaleX(0.5f);
            view5.setScaleY(0.5f);
        }
        float f3 = this.A00;
        view2.setTranslationY(f3);
        view3.setTranslationY(f3);
        view4.setTranslationY(f3);
        C28213CcB c28213CcB = l2s.A03;
        if (C28213CcB.A00(c28213CcB)) {
            Activity activity = c28213CcB.A01;
            activity.getWindow().setStatusBarColor(-1);
            if (!c28213CcB.A00) {
                AbstractC56402iY.A06(activity, true);
                c28213CcB.A00 = true;
            }
        }
        AbstractC25231BEo.A1G(null, this.A04);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25796BbD(L2S l2s, Float f, Float f2, InterfaceC24901Jp interfaceC24901Jp, int i) {
        super(0);
        this.A01 = l2s;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = i;
        this.A04 = interfaceC24901Jp;
    }

    @Override // X.C04N
    public final C04M A01(C04M c04m, C04U c04u) {
        AbstractC167017dG.A1N(c04u, c04m);
        L2S l2s = this.A01;
        CT8 ct8 = l2s.A02;
        View view = ct8.A07;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        View view2 = ct8.A05;
        if (view2 == null) {
            view2 = ct8.A02;
        }
        Drawable background = view2.getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        C47527Kyu c47527Kyu = l2s.A01;
        c47527Kyu.A00.A01(c47527Kyu.A01, null);
        return c04m;
    }

    @Override // X.C04N
    public final C011504d A02(C011504d c011504d, List list) {
        Object obj;
        Float f;
        AbstractC167017dG.A1N(c011504d, list);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if ((((C04U) obj).A00.A06() & 8) != 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C04U c04u = (C04U) obj;
        if (c04u != null) {
            float A05 = 1.0f - c04u.A00.A05();
            L2S l2s = this.A01;
            CT8 ct8 = l2s.A02;
            ct8.A04.setAlpha(A05);
            View view = ct8.A01;
            view.setAlpha(A05);
            View view2 = ct8.A03;
            view2.setAlpha(A05);
            View view3 = ct8.A06;
            view3.setAlpha(A05);
            View view4 = ct8.A05;
            if (view4 == null) {
                view4 = ct8.A02;
            }
            Drawable background = view4.getBackground();
            if (background != null) {
                background.setAlpha((int) (255.0f * A05));
            }
            View view5 = ct8.A07;
            view5.setAlpha(A05);
            Float f2 = this.A02;
            if (f2 != null && (f = this.A03) != null) {
                view5.setTranslationX(f2.floatValue() * c04u.A00.A05());
                view5.setTranslationY(f.floatValue() * c04u.A00.A05());
                view5.setScaleX(1.0f - (c04u.A00.A05() * 0.5f));
                view5.setScaleY(1.0f - (c04u.A00.A05() * 0.5f));
            }
            float A052 = this.A00 * c04u.A00.A05();
            view.setTranslationY(A052);
            view2.setTranslationY(A052);
            view3.setTranslationY(A052);
            l2s.A03.A01(c04u.A00.A05());
        }
        return c011504d;
    }
}
