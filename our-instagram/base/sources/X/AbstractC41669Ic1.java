package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Ic1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41669Ic1 {
    public static final void A00(Context context, UserSession userSession, IDX idx, String str, String str2, String str3) {
        C14360o3.A0B(str3, 4);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(context, A0C, 2131976951);
        A0C.A0l = false;
        String A00 = MSV.A00(1038);
        A0C.A0R = A00;
        A0C.A03 = new HDT(idx, 2);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A1G3 = AbstractC166987dD.A1G();
        BitSet bitSet = new BitSet(1);
        if (str != null) {
            A1G.put("ad_id", str);
            bitSet.set(0);
            if (str2 != null) {
                A1G.put("ad_client_token", str2);
                A1G.put("source_surface", str3);
                if (bitSet.nextClearBit(0) >= 1) {
                    C66277U6x A02 = C66277U6x.A02(A00, AbstractC191768eY.A01(A1G), A1G2);
                    AbstractC31178DnM.A1M(A02, -1);
                    A02.A03 = null;
                    A02.A02 = null;
                    A02.A04 = null;
                    A02.A08(A1G3);
                    A02.A05(context, A0C);
                    return;
                }
                throw AbstractC31173DnH.A0f();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C62862tP A04 = C62862tP.A04(fragmentActivity, AbstractC31171DnF.A0D("ad_preferences"), userSession);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        BitSet bitSet = new BitSet(2);
        A1G.put("entrypoint", "afs_kitkat_three_dot_menu");
        bitSet.set(0);
        A1G.put(AbstractC111324zv.A00(4957), str);
        bitSet.set(1);
        C36026FvO c36026FvO = new C36026FvO(9);
        if (bitSet.nextClearBit(0) >= 2) {
            FTe.A00(c36026FvO, AbstractC111324zv.A00(101), A1G, A1G2).A00(fragmentActivity, A04);
            return;
        }
        throw AbstractC31173DnH.A0f();
    }

    public static final void A01(Context context, UserSession userSession, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("target_user_id", str);
        if (str2 == null) {
            str2 = "FeedAds";
        }
        A1G.put(MSV.A00(256), str2);
        C66277U6x A01 = C66277U6x.A01(MSV.A00(20), A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(context, A0C, 2131951994);
        A0C.A0R = MSV.A00(892);
        A0C.A0P = C05F.A01;
        A01.A04(context, A0C);
    }
}
