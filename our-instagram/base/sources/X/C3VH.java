package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import com.facebook.R;

/* renamed from: X.3VH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3VH {
    public static final View A00(Context context) {
        C14360o3.A0B(context, 0);
        View view = new View(context);
        view.setId(R.id.gap_view);
        view.setImportantForAccessibility(2);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        return view;
    }
}
