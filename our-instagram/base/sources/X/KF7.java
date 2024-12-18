package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class KF7 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new C44425JkM(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.widget.LinearLayout, android.view.View, X.Jkk, java.lang.Object] */
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        int A00;
        int A002;
        C44425JkM c44425JkM = (C44425JkM) view;
        C14360o3.A0B(c44425JkM, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        List<C102884kP> A0N = c102884kP.A0N(35);
        C14360o3.A07(A0N);
        ArrayList<L3C> A0q = AbstractC167017dG.A0q(A0N);
        for (C102884kP c102884kP2 : A0N) {
            float A02 = c102884kP2.A02(38, 0.0f);
            String A0G = c102884kP2.A0G();
            String str = "";
            if (A0G == null) {
                A0G = "";
            }
            String A0J = c102884kP2.A0J();
            if (A0J != null) {
                str = A0J;
            }
            C102884kP A08 = c102884kP2.A08(35);
            if (A08 == null) {
                A00 = -1;
            } else {
                A00 = C6BK.A00(c6fg, A08, 0);
            }
            C102884kP A082 = c102884kP2.A08(42);
            if (A082 == null) {
                A002 = -1;
            } else {
                A002 = C6BK.A00(c6fg, A082, 0);
            }
            A0q.add(new L3C(A0G, str, A02, A00, A002));
        }
        C44432Jkl c44432Jkl = c44425JkM.A00;
        List list = c44432Jkl.A01;
        list.clear();
        c44432Jkl.removeAllViews();
        for (L3C l3c : A0q) {
            Context A0L = AbstractC166997dE.A0L(c44432Jkl);
            ?? linearLayout = new LinearLayout(A0L);
            linearLayout.setGravity(80);
            linearLayout.setId(View.generateViewId());
            linearLayout.setOrientation(1);
            int A07 = AbstractC167017dG.A07(A0L);
            linearLayout.setPadding(A07, linearLayout.getPaddingTop(), A07, linearLayout.getPaddingBottom());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            ViewParent parent = c44432Jkl.getParent();
            C14360o3.A07(parent);
            linearLayout.setViewModel(l3c, parent);
            linearLayout.setOnClickListener(new ViewOnClickListenerC48066LPr(14, linearLayout, c44432Jkl));
            c44432Jkl.addView(linearLayout);
            list.add(linearLayout);
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public KF7(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
