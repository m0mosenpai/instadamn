package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UDz extends ConstraintLayout {
    public int A00;
    public final List A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.UAN, android.view.View] */
    public static final C66372UDy A00(UDz uDz, C69281Vkp c69281Vkp, int i) {
        C66372UDy c66372UDy = new C66372UDy(AbstractC166997dE.A0L(uDz));
        c66372UDy.setId(View.generateViewId());
        c66372UDy.setOnBarLayoutListener(new C50259MHo(uDz, 40));
        int i2 = uDz.A00;
        C14360o3.A0B(c69281Vkp, 0);
        Context context = c66372UDy.A02;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setText(c69281Vkp.A03);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        c66372UDy.addView(textView, new ViewGroup.LayoutParams(0, -2));
        C69629VsW c69629VsW = new C69629VsW(c69281Vkp.A04, c69281Vkp.A00, c69281Vkp.A01, i);
        c69629VsW.A00 = i2;
        C14360o3.A0B(context, 1);
        ?? view = new View(context);
        view.setId(View.generateViewId());
        view.setBarViewModel(c69629VsW);
        InterfaceC16660sJ interfaceC16660sJ = c66372UDy.A01;
        if (interfaceC16660sJ != null) {
            view.A00 = interfaceC16660sJ;
        }
        c66372UDy.A00 = view;
        c66372UDy.addView((View) view, new ViewGroup.LayoutParams(0, (int) TypedValue.applyDimension(1, i, AbstractC167007dF.A0K(context))));
        String str = c69281Vkp.A02;
        TextView textView2 = new TextView(context);
        textView2.setId(View.generateViewId());
        textView2.setText(str);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        c66372UDy.addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(c66372UDy);
        c110964z8.A0E(textView.getId(), 3, 0, 3, AbstractC167017dG.A0E(context));
        c110964z8.A0C(textView.getId(), 6, 0, 6);
        c110964z8.A0C(textView.getId(), 7, 0, 7);
        c110964z8.A0E(view.getId(), 3, textView.getId(), 4, AbstractC167017dG.A06(context));
        c110964z8.A0C(view.getId(), 6, 0, 6);
        c110964z8.A0E(view.getId(), 7, textView2.getId(), 6, AbstractC167017dG.A03(context));
        c110964z8.A0C(textView2.getId(), 7, 0, 7);
        c110964z8.A0C(textView2.getId(), 3, view.getId(), 3);
        c110964z8.A0C(textView2.getId(), 4, view.getId(), 4);
        c110964z8.A0G(c66372UDy);
        return c66372UDy;
    }

    public static final void A01(UDz uDz, List list) {
        int id;
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(uDz);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            View view = (View) obj;
            c110964z8.A0C(view.getId(), 6, 0, 6);
            c110964z8.A0C(view.getId(), 7, 0, 7);
            int id2 = view.getId();
            if (i == 0) {
                id = 0;
            } else {
                id = ((View) list.get(i - 1)).getId();
            }
            int i3 = 4;
            if (i == 0) {
                i3 = 3;
            }
            c110964z8.A0C(id2, 3, id, i3);
            i = i2;
        }
        c110964z8.A0G(uDz);
    }

    public UDz(Context context) {
        super(context);
        this.A00 = Integer.MAX_VALUE;
        this.A01 = new ArrayList();
        setId(View.generateViewId());
    }
}
