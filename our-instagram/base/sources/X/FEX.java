package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FEX {
    public static String A00;
    public static String A01;
    public static String A02;
    public static String A03;

    public static void A00(Context context, C1P1 c1p1, AbstractC12990ll abstractC12990ll, Integer num, String str, Map map) {
        C222015v c222015v;
        String str2 = A01;
        if (str2 != null) {
            str = AnonymousClass001.A0S(str, str2, '/');
        }
        String str3 = A00;
        if (str3 != null) {
            str = AnonymousClass001.A0S(str, str3, '/');
        }
        if (abstractC12990ll instanceof UserSession) {
            c222015v = new C07510aQ((UserSession) abstractC12990ll);
        } else {
            c222015v = C07340a8.A00;
        }
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
        c25621Ms.A0B(str);
        c25621Ms.A0H("challenge_node_id", A03);
        c25621Ms.A09(num);
        c25621Ms.A0P(c222015v, EfR.class, FX1.class, false);
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                c25621Ms.A9s(AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
            }
        }
        String str4 = A02;
        if (str4 != null) {
            c25621Ms.A9s("challenge_context", str4);
        }
        AbstractC31178DnM.A0n(context, c25621Ms, AbstractC31190DnZ.A01(0, 9, 31), C16030qx.A00(context));
        if (num == C05F.A01) {
            c25621Ms.A0R = true;
        }
        AbstractC31175DnJ.A1K(c25621Ms, c1p1);
    }
}
