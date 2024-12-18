package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* renamed from: X.VxM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69895VxM {
    public static final void A01(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BitSet bitSet = new BitSet(0);
        linkedHashMap.put("media_id", null);
        if (bitSet.nextClearBit(0) >= 0) {
            C16920sk A0E = AbstractC06930Yk.A0E();
            C63719SsZ c63719SsZ = new C63719SsZ(AbstractC111324zv.A00(2096), null, null, AbstractC06930Yk.A0B(linkedHashMap), A0E, 719983200, 0L, true);
            AnonymousClass637 A00 = VRA.A00(userSession, false);
            WTY wty = new WTY(null, null, null, null);
            C14360o3.A0B(A00, 1);
            c63719SsZ.E2V(context, wty, A00);
            return;
        }
        throw new IllegalStateException("Missing required params");
    }

    public static final void A00(Context context, Fragment fragment, FragmentActivity fragmentActivity, W6I w6i, VG5 vg5, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        boolean A1U = AbstractC167007dF.A1U(userSession);
        if (str != null) {
            if (AbstractC002300n.A0h(str, AbstractC111324zv.A00(1014), A1U)) {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                String queryParameter = A03.getQueryParameter("media_id");
                if (queryParameter != null) {
                    AbstractC69888VxF.A00().A06(fragment, VRF.A00().A00(context, userSession, queryParameter, "ads_manager_highlights_hub"), interfaceC11380iw);
                    return;
                }
                return;
            }
            w6i.A0A("ads_manager_highlights_hub", WGU.A01(vg5), null, null);
            C63397SjR c63397SjR = new C63397SjR(fragmentActivity, userSession, C2Fb.A35, str, A1U);
            c63397SjR.A0S = str2;
            c63397SjR.A0A();
        }
    }
}
