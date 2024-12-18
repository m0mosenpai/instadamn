package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes11.dex */
public final class UDx extends ConstraintLayout {
    public final View A00;
    public final View A01;

    public final View getMainView() {
        return this.A00;
    }

    public UDx(Context context, View view, View view2) {
        super(context);
        this.A00 = view;
        this.A01 = view2;
        view2.setId(View.generateViewId());
        view.setId(View.generateViewId());
        C56302iJ c56302iJ = new C56302iJ(-1, -2);
        c56302iJ.A0u = view.getId();
        c56302iJ.A0F = view.getId();
        view2.setLayoutParams(c56302iJ);
        addView(view2);
        addView(view);
    }
}
