package X;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.Jkl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44432Jkl extends LinearLayout {
    public int A00;
    public final List A01;

    public final void setViewModel(AbstractC46394KgG abstractC46394KgG) {
        C14360o3.A0B(abstractC46394KgG, 0);
        this.A01.clear();
        removeAllViews();
        throw AbstractC166987dD.A15("getVerticalBars");
    }

    public C44432Jkl(Context context) {
        super(context);
        setOrientation(0);
        this.A01 = AbstractC166987dD.A1E();
    }
}
