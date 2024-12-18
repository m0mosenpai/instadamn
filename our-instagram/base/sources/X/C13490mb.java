package X;

import android.view.View;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.0mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13490mb {
    public static final C13490mb A00 = new Object();

    public final void A01(View view, int i, int i2) {
        CharSequence contentDescription;
        String str;
        C14360o3.A0B(view, 1);
        if (EndToEnd.isRunningEndToEndTest()) {
            if (EndToEnd.isRunningEndToEndTest()) {
                if (i2 == i - 1) {
                    str = "_page_last_item";
                } else {
                    str = "";
                }
                String A0c = AnonymousClass001.A0c("scrollable_view_child_", str, i2);
                if (A0c != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0c);
                    sb.append(" - ");
                    sb.append((Object) view.getContentDescription());
                    contentDescription = sb.toString();
                    view.setContentDescription(contentDescription);
                }
            }
            contentDescription = view.getContentDescription();
            view.setContentDescription(contentDescription);
        }
    }

    public static final void A00(View view) {
        if (view != null && EndToEnd.isRunningEndToEndTest()) {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && AbstractC001900j.A0a(contentDescription, "jest_test_", false)) {
                return;
            }
            if (view instanceof ListView) {
                view.setContentDescription("jest_test_vertically_scrollable_view");
            }
            if (!(view instanceof RecyclerView)) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            AbstractC70663Fe layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && layoutManager.A1X()) {
                recyclerView.setContentDescription("jest_test_horizontally_scrollable_view");
            } else {
                recyclerView.setContentDescription("jest_test_vertically_scrollable_view");
            }
        }
    }
}
