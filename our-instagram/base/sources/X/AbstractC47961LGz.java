package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.LGz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47961LGz {
    public static final View A00(View view, int i) {
        C14360o3.A0B(view, 0);
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AbstractC166987dD.A14(AbstractC58317Pt9.A00(616));
    }

    public static ImageView A01(View view, int i) {
        return (ImageView) A00(view, i);
    }

    public static TextView A02(View view, int i) {
        return (TextView) A00(view, i);
    }
}
