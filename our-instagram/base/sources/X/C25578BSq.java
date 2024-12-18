package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.BSq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25578BSq {
    public static final /* synthetic */ C25578BSq A00 = new Object();

    public static final void A00(C2XR c2xr, C2XR c2xr2) {
        List<Pair> B2j;
        if (c2xr2 != null && c2xr != null && (B2j = c2xr.B2j()) != null) {
            for (Pair pair : B2j) {
                Object obj = pair.first;
                C14360o3.A06(obj);
                Object obj2 = pair.second;
                C14360o3.A06(obj2);
                c2xr2.ECR((C2V9) obj2, (String) obj);
            }
        }
    }
}
