package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W8b {
    public static final List A00 = new ArrayList();
    public static final Map A01 = new HashMap();

    public static View A00(View view, String str) {
        String str2;
        Object tag = view.getTag(R.id.view_tag_native_id);
        if ((tag instanceof String) && (str2 = (String) tag) != null && str2.equals(str)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View A002 = A00(viewGroup.getChildAt(i), str);
                if (A002 != null) {
                    return A002;
                }
            }
            return null;
        }
        return null;
    }
}
