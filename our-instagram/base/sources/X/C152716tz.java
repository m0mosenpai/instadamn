package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.6tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152716tz {
    public static final C152716tz A00 = new Object();

    public static final void A00(View view) {
        C14360o3.A0B(view, 0);
        C110964z8 c110964z8 = new C110964z8();
        ViewParent parent = view.getParent();
        C14360o3.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        c110964z8.A0I((ConstraintLayout) parent);
        c110964z8.A0C(view.getId(), 3, 0, 3);
        c110964z8.A0C(view.getId(), 6, 0, 6);
        c110964z8.A09(view.getId(), 7);
        c110964z8.A09(view.getId(), 4);
        ViewParent parent2 = view.getParent();
        C14360o3.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        c110964z8.A0G((ConstraintLayout) parent2);
    }

    public static final void A01(View view, View view2) {
        if (view2 != null) {
            C110964z8 c110964z8 = new C110964z8();
            ViewParent parent = view.getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            c110964z8.A0I((ConstraintLayout) parent);
            c110964z8.A09(view.getId(), 6);
            c110964z8.A09(view.getId(), 7);
            c110964z8.A0C(view.getId(), 6, view2.getId(), 6);
            c110964z8.A0C(view.getId(), 7, view2.getId(), 7);
            ViewParent parent2 = view.getParent();
            C14360o3.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            c110964z8.A0G((ConstraintLayout) parent2);
        }
    }

    public static final void A02(View view, View view2) {
        if (view2 != null) {
            C110964z8 c110964z8 = new C110964z8();
            ViewParent parent = view.getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            c110964z8.A0I((ConstraintLayout) parent);
            c110964z8.A09(view.getId(), 6);
            c110964z8.A09(view.getId(), 7);
            c110964z8.A0C(view.getId(), 6, view2.getId(), 6);
            ViewParent parent2 = view.getParent();
            C14360o3.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            c110964z8.A0G((ConstraintLayout) parent2);
        }
    }

    public static final void A03(View view, View view2, int i, boolean z) {
        view.post(new JY0(view, view2, i, z));
    }

    public final void A04(TextView textView, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        if (z) {
            textView.setTextSize(18.0f);
            interfaceC16820sZ.invoke();
        }
        TextPaint paint = textView.getPaint();
        float f = 14.0f;
        if (z2) {
            f = 14.0f / 0.75f;
        }
        Context context = textView.getContext();
        C14360o3.A07(context);
        paint.setTextSize(AbstractC13690mv.A00(context, f));
        if (paint.measureText(textView.getText().toString()) > textView.getMaxWidth() - (textView.getPaddingStart() + textView.getPaddingEnd())) {
            f = 11.0f;
            if (z2) {
                f = 11.0f / 0.75f;
            }
        }
        textView.setTextSize(f);
        interfaceC16820sZ.invoke();
    }
}
