package X;

import android.app.Activity;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Vxo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69923Vxo {
    public static final void A00(Activity activity, PromoteData promoteData, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BitSet bitSet = new BitSet(5);
        linkedHashMap.put("flow_id", str);
        bitSet.set(2);
        String str2 = promoteData.A1S;
        C14360o3.A06(str2);
        linkedHashMap.put("media_id", str2);
        bitSet.set(3);
        String str3 = promoteData.A1d;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("current_beneficiary_id", str3);
        bitSet.set(0);
        String str5 = promoteData.A1g;
        if (str5 != null) {
            str4 = str5;
        }
        linkedHashMap.put("current_payer_id", str4);
        bitSet.set(1);
        linkedHashMap.put("on_save_beneficiary_payer", new C66237U5h(new C57560PgY(new X6E(promoteData), 38)));
        bitSet.set(4);
        if (bitSet.nextClearBit(0) >= 5) {
            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.ig.boost.beneficiary_payer_screen_query", null, null, AbstractC06930Yk.A0B(linkedHashMap), AbstractC06930Yk.A0E(), 719983200, 30L, true);
            UserSession userSession = promoteData.A0y;
            C14360o3.A06(userSession);
            AnonymousClass637 A00 = VRA.A00(userSession, false);
            WTY wty = new WTY(null, null, null, null);
            C14360o3.A0B(A00, 1);
            c63719SsZ.E2V(activity, wty, A00);
            return;
        }
        throw new IllegalStateException("Missing required params");
    }

    public static final boolean A01(PromoteAudience promoteAudience) {
        AudienceValidationResponse audienceValidationResponse;
        String str;
        List list;
        return (promoteAudience == null || (audienceValidationResponse = (AudienceValidationResponse) AbstractC001800i.A0O(promoteAudience.A0B, 0)) == null || (str = audienceValidationResponse.A03) == null || str.length() <= 0 || (list = audienceValidationResponse.A05) == null || !(list.isEmpty() ^ true)) ? false : true;
    }
}
