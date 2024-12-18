package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import java.util.Map;

/* renamed from: X.Hxm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40504Hxm {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Number A0Q;
        boolean z;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC58317Pt9.A00(1));
        Map map = (Map) A03;
        String A1A = AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map);
        if (A1A != null && (A0Q = AbstractC37300Gc1.A0Q("media_type", map)) != null) {
            int intValue = A0Q.intValue();
            Object A032 = c6fw.A03(1);
            C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
            String str = (String) A032;
            String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 2);
            int A0D = AbstractC25230BEn.A0D(c6fw.A03(3), "null cannot be cast to non-null type kotlin.Number");
            FragmentActivity A04 = C6BQ.A04(c6fq);
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            String A02 = C3YV.A02(A1A);
            String A033 = C3YV.A03(A1A);
            if (A033 == null) {
                A033 = "";
            }
            EnumC39592He2 enumC39592He2 = EnumC39592He2.A07;
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
            DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, null, null, null, A02, A033, null, null, null, null, null, null, null, null, null, null, null, null, null, intValue, z);
            C14360o3.A0B(str, 2);
            DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig(null, discoveryChainingItem, null, null, Integer.valueOf(A0D), str, "nudge_chaining", "", "", null, null, null, null, null, A0o, null, C16910sj.A00, true, true, false, false, false, false, true, true, false, false, false);
            C140966Yy A002 = AbstractC40628Hzm.A00(A04, A0W);
            A002.A0B(null, AbstractC40602HzM.A00(discoveryChainingConfig));
            A002.A04();
        }
        return null;
    }
}
