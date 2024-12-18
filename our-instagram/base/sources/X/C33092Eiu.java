package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Eiu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33092Eiu extends C4A7 {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public C33092Eiu(UserSession userSession) {
        super("DirectTranslationService", C4A8.A00(1790817603));
        this.A00 = userSession;
        this.A01 = C37058GUs.A01(this, 11);
    }

    public static final String A00(List list) {
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            String A00 = C1580877s.A00(c83403nh);
            if (A00 != null) {
                LinkedHashMap A0p2 = AbstractC25233BEq.A0p("content", A00, AbstractC166987dD.A1L("item_id", c83403nh.A0i()));
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator A14 = AbstractC166997dE.A14(A0p2);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (A1K.getValue() != null) {
                        AbstractC31177DnL.A1S(A1K, A1I);
                    }
                }
                A0p.put(new JSONObject(A1I));
            }
        }
        return AbstractC166987dD.A19(A0p);
    }
}
