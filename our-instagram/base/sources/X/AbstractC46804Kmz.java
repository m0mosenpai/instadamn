package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Kmz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46804Kmz {
    public static void A00(C7Ze c7Ze, C7QY c7qy, int i) {
        LinkedHashMap A0u;
        C14360o3.A0B(c7qy, 0);
        List list = c7qy.A0b;
        if (list != null && list.size() > i) {
            C9CP c9cp = (C9CP) list.get(i);
            String str = c9cp.A04;
            String str2 = c9cp.A05;
            String str3 = c9cp.A06;
            String str4 = c9cp.A02;
            String str5 = c9cp.A03;
            if (str2 == null) {
                C0w9.A03("GenericXmaCtaClickDelegate", "Null XMA CTA Type");
                return;
            }
            if (((InterfaceC165507ad) c7Ze).CQu()) {
                return;
            }
            String str6 = c7qy.A08.A00;
            DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
            String C7d = ((InterfaceC164917Zg) c7Ze).C7d();
            Integer valueOf = Integer.valueOf(i);
            C2EY c2ey = c7qy.A0B.A04;
            String str7 = c7qy.A0Y;
            if (!c7qy.A0e && c7qy.A0V == null) {
                A0u = null;
            } else {
                C09530e4 A1L = AbstractC166987dD.A1L(TraceFieldType.ContentType, AbstractC111324zv.A00(724));
                C09530e4 A1L2 = AbstractC166987dD.A1L("agent_id", str6);
                String str8 = c7qy.A0V;
                if (str8 == null) {
                    str8 = "";
                }
                A0u = AbstractC167017dG.A0u(AbstractC111324zv.A00(1378), "4", A1L, A1L2, AbstractC166987dD.A1L("bot_response_id", str8));
            }
            c7Ze.CKa(null, c2ey, directMessageIdentifier, null, valueOf, str, str2, str3, str4, str5, str6, C7d, null, str7, A0u);
        }
    }
}
