package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ff4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35162Ff4 {
    public final Map A00 = AbstractC166987dD.A1G();
    public final Map A01 = AbstractC166987dD.A1G();

    public final void A03(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        Map map = this.A01;
        List list = (List) map.get(str);
        if (list == null) {
            list = new LinkedList();
            map.put(str, list);
        }
        if (list.size() >= 10) {
            list.remove(0);
        }
        list.add(str2);
    }

    public static final void A01(C35162Ff4 c35162Ff4) {
        ArrayList A0n = AbstractC31180DnO.A0n(c35162Ff4.A00);
        C19740y2 A0Q = AbstractC31171DnF.A0Q();
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        C16V.A03(A0S, "nonce_list");
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            C34557FKr c34557FKr = (C34557FKr) it.next();
            if (c34557FKr != null) {
                A0S.A0d();
                String str = c34557FKr.A02;
                if (str != null) {
                    A0S.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                }
                String str2 = c34557FKr.A01;
                if (str2 != null) {
                    A0S.A0S("nonce", str2);
                }
                A0S.A0R("last_updated_at", c34557FKr.A00);
                A0S.A0a();
            }
        }
        A0S.A0Z();
        String A0l = AbstractC167017dG.A0l(A0S, stringWriter);
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A0Q);
        A0P.E7K("two_fac_trusted_device_nonce_user_map", A0l);
        A0P.apply();
    }

    public C35162Ff4() {
        A00(this);
    }

    public static final void A00(C35162Ff4 c35162Ff4) {
        String string = AbstractC31174DnI.A0f().getString("two_fac_trusted_device_nonce_user_map", null);
        if (string != null && string.length() != 0) {
            try {
                List<C34557FKr> list = AbstractC34236F8i.parseFromJson(C16V.A00(string)).A00;
                if (list != null) {
                    for (C34557FKr c34557FKr : list) {
                        c35162Ff4.A00.put(c34557FKr.A02, c34557FKr);
                    }
                }
            } catch (IOException e) {
                C0w9.A07("Two fac secure nonce manager", e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.FKr, java.lang.Object] */
    public final void A02(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        Map map = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        ?? obj = new Object();
        obj.A02 = str;
        obj.A01 = str2;
        obj.A00 = currentTimeMillis;
        map.put(str, obj);
        try {
            A01(this);
        } catch (IOException e) {
            C0w9.A07("Two fac secure nonce manager", e);
        }
    }
}
