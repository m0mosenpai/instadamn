package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ONz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54864ONz {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C18950wb c18950wb;
        int i;
        StringBuilder A1C;
        String str;
        C6BQ.A0B(c6fq);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        String A0s2 = AbstractC31173DnH.A0s(list, 1);
        Object A00 = c6fw.A00();
        AbstractC25225BEi.A1S(A00);
        String str2 = (String) A00;
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC54289Nz9.A00(A1G);
        if (A0s != null && A0s.length() != 0 && A0s2 != null && A0s2.length() != 0) {
            C14360o3.A0B(str2, 0);
            A1G.put(str2, new LiveChatNonce(str2, A0s, A0s2));
            try {
                A01(A1G);
                return null;
            } catch (IOException e) {
                e = e;
                c18950wb = C18950wb.A01;
                i = 817898180;
                A1C = AbstractC166987dD.A1C();
                str = "error saving live chat nonce: ";
            }
        } else {
            C14360o3.A0B(str2, 0);
            A1G.remove(str2);
            try {
                A01(A1G);
                return null;
            } catch (IOException e2) {
                e = e2;
                c18950wb = C18950wb.A01;
                i = 817898180;
                A1C = AbstractC166987dD.A1C();
                str = "error removing live chat nonce: ";
            }
        }
        AbstractC166987dD.A1T(c18950wb, AbstractC167017dG.A0n(e, str, A1C), i);
        return null;
    }

    public static void A01(AbstractMap abstractMap) {
        ArrayList arrayList = new ArrayList(abstractMap.values());
        C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
        String A02 = AbstractC73763Sg.A03.A02(new LiveChatNonceList(arrayList), C57121PVk.A00);
        InterfaceC19610xo ARD = A00.A00.ARD();
        ARD.E7K("live_chat_nonce", A02);
        ARD.apply();
    }
}
