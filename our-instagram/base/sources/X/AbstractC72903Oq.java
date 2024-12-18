package X;

import android.graphics.Color;
import com.instagram.api.schemas.RingSpec;

/* renamed from: X.3Oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72903Oq {
    public static final int[] A00(RingSpec ringSpec) {
        String A0D;
        C14360o3.A0B(ringSpec, 0);
        int[] iArr = new int[ringSpec.ApQ().size()];
        int size = ringSpec.ApQ().size();
        for (int i = 0; i < size; i++) {
            if (AbstractC002300n.A0h((String) ringSpec.ApQ().get(i), "#", false)) {
                A0D = (String) ringSpec.ApQ().get(i);
            } else {
                A0D = AnonymousClass001.A0D((String) ringSpec.ApQ().get(i), '#');
            }
            iArr[i] = Color.parseColor(A0D);
        }
        return iArr;
    }
}
