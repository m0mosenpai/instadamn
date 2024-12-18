package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import java.util.Map;

/* renamed from: X.FDf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34363FDf {
    public static final UserAccountInfo A00(Map map) {
        C14360o3.A0B(map, 0);
        Object obj = map.get("USER_ID");
        if (obj != null) {
            String str = (String) obj;
            String str2 = (String) map.get("OBFUSCATED_ACCOUNT_ID");
            Object obj2 = map.get(AbstractC111324zv.A00(582));
            if (obj2 != null) {
                return new UserAccountInfo(str, str2, (String) obj2, (String) map.get(AbstractC111324zv.A00(1483)), (String) map.get("USERNAME"), (String) map.get("NAME"), (String) map.get(AbstractC111324zv.A00(664)), (String) map.get(AbstractC111324zv.A00(1502)), (String) map.get(AbstractC111324zv.A00(591)), (String) map.get("UNPACKED_NOTIFICATIONS"), AbstractC166987dD.A1A(AbstractC58317Pt9.A00(447), map), null);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
