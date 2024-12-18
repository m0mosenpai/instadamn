package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;

/* renamed from: X.Hz7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40587Hz7 {
    public static final C114485Es A00(Context context, UserSession userSession, EnumC40111tc enumC40111tc, Integer num, String str, String str2, String str3) {
        boolean z;
        AbstractC167007dF.A1F(userSession, 1, str2);
        EnumC39592He2 enumC39592He2 = EnumC39592He2.A08;
        int i = enumC40111tc.A00;
        int A00 = AbstractC37302Gc3.A00();
        if (A00 != 0) {
            if (A00 == 3) {
                z = true;
            } else {
                throw AbstractC166987dD.A12("All channel-related arguments must be provided");
            }
        } else {
            z = false;
        }
        DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, null, null, num, str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, i, z);
        String A0p = AbstractC166997dE.A0p(context, 2131972463);
        String A0j = AbstractC167017dG.A0j();
        return AbstractC40602HzM.A00(new DiscoveryChainingConfig(null, discoveryChainingItem, null, null, null, A0p, AbstractC111324zv.A00(2259), A0j, "", str3, null, null, null, context.getString(2131972464), null, null, C16910sj.A00, true, false, false, false, false, false, false, false, false, false, false));
    }
}
