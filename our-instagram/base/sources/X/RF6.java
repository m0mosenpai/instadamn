package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.List;

@Deprecated
/* loaded from: classes10.dex */
public abstract class RF6 extends RF7 {
    public static List A00(Context context, C4B6 c4b6, C4BL c4bl, boolean z, boolean z2) {
        List Aw3;
        String str = c4b6.A0W;
        if (str == null) {
            return ImmutableList.of();
        }
        if (AbstractC111324zv.A00(3287).equals(str) && !S2J.A00(context)) {
            String A03 = C46762Co.A03(c4b6);
            if (A03 == null) {
                Aw3 = ImmutableList.of();
            } else {
                Aw3 = c4bl.Aw3(A03, z, z2);
            }
            if (!Aw3.isEmpty()) {
                return Aw3;
            }
        }
        return C46762Co.A02(c4b6, c4bl, z, z2);
    }
}
