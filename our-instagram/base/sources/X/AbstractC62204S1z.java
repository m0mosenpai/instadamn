package X;

import android.widget.ImageView;
import java.util.List;

/* renamed from: X.S1z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62204S1z {
    public static void A00(ImageView imageView, List list, int i) {
        String str = (String) list.get(i);
        imageView.setVisibility(0);
        C2FP.A0G().A00(str, "ContentValues").A02(imageView);
    }
}
