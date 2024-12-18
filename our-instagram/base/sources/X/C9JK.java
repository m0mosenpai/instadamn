package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9JK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9JK {
    public static final C9JK A00 = new Object();

    public final void A01(ViewGroup viewGroup, List list) {
        C14360o3.A0B(viewGroup, 0);
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C206429Bz c206429Bz = (C206429Bz) it.next();
            Context context = viewGroup.getContext();
            C14360o3.A07(context);
            View A002 = C9JJ.A00(context, c206429Bz);
            Space space = new Space(context);
            space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            viewGroup.addView(space);
            viewGroup.addView(A002);
        }
        Space space2 = new Space(AbstractC166997dE.A0L(viewGroup));
        space2.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        viewGroup.addView(space2);
    }

    public static final void A00(ViewGroup viewGroup, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C206429Bz c206429Bz = (C206429Bz) it.next();
            Context A0L = AbstractC166997dE.A0L(viewGroup);
            viewGroup.addView(C9JJ.A00(A0L, c206429Bz));
            Space space = new Space(A0L);
            space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            viewGroup.addView(space);
        }
    }
}
