package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.VRu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68464VRu {
    public static final void A00(FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, String str) {
        if (str != null && xIGIGBoostDestination != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BitSet bitSet = new BitSet(3);
            String str2 = C70399WUb.A00(userSession).A03;
            C14360o3.A07(str2);
            linkedHashMap.put("flow_id", str2);
            bitSet.set(0);
            linkedHashMap.put("is_ctwa", Boolean.valueOf(AbstractC167007dF.A1X(xIGIGBoostDestination, XIGIGBoostDestination.A0G)));
            bitSet.set(1);
            linkedHashMap.put("media_igid", str);
            bitSet.set(2);
            if (bitSet.nextClearBit(0) >= 3) {
                C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.ig.boost.ctx.conversation_starters.configuration", null, null, AbstractC06930Yk.A0B(linkedHashMap), AbstractC06930Yk.A0E(), 719983200, 30L, true);
                AnonymousClass637 A00 = VRA.A00(userSession, false);
                WTY wty = new WTY(new C69421Vn6(null, null, null, null, fragmentActivity.getString(2131954008), null, null, false, true), null, null, null);
                C14360o3.A0B(A00, 1);
                c63719SsZ.E2V(fragmentActivity, wty, A00);
                return;
            }
            throw new IllegalStateException("Missing required params");
        }
    }
}
