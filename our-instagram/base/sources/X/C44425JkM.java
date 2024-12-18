package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.JkM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44425JkM extends FrameLayout {
    public final C44432Jkl A00;

    public final void setChartData(AbstractC46394KgG abstractC46394KgG) {
        C14360o3.A0B(abstractC46394KgG, 0);
        this.A00.setViewModel(abstractC46394KgG);
        throw C00O.createAndThrow();
    }

    public C44425JkM(Context context) {
        super(context);
        C44432Jkl c44432Jkl = new C44432Jkl(context);
        this.A00 = c44432Jkl;
        addView(c44432Jkl);
    }
}
