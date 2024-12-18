package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FAM {
    public static void A00(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        AbstractC167027dH.A13(userSession, fragmentActivity, abstractC59962oe);
        C116215Oa c116215Oa = C5OZ.A01;
        if (C116215Oa.A00(userSession)) {
            C18720vz c18720vz = AbstractC12960li.A00;
            C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
            if (!AbstractC19730y1.A00(c18720vz).A00.getBoolean("preference_has_denied_push_system_dialog", false)) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36319540535107057L)) {
                    long A01 = C18U.A01(c06090Tz, userSession, 36601015511879774L);
                    if (c116215Oa.A01(userSession, A01)) {
                        AbstractC70003Ck.A01(fragmentActivity, abstractC59962oe, userSession, new C57257Pbf(23, context, userSession));
                        A00.A04(false);
                        C19740y2 A002 = AbstractC19730y1.A00(c18720vz);
                        A002.A01(A002.A00.getInt(AbstractC111324zv.A00(498), 0) + 1);
                        if (A00.A00.getInt(r3, 0) >= A01) {
                            C19740y2 A003 = AbstractC19730y1.A00(c18720vz);
                            A003.A01(0);
                            A003.A04(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A003);
                            A0P.E7G(AbstractC111324zv.A00(1178), currentTimeMillis);
                            A0P.apply();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            InterfaceC19630xq interfaceC19630xq = A00.A00;
            if (interfaceC19630xq.getBoolean(AbstractC111324zv.A00(1177), false)) {
                return;
            }
            String A004 = AbstractC111324zv.A00(498);
            if (interfaceC19630xq.getInt(A004, 0) != 0) {
                return;
            }
            AbstractC70003Ck.A01(fragmentActivity, abstractC59962oe, userSession, new C57257Pbf(23, context, userSession));
            C19740y2 A005 = AbstractC19730y1.A00(c18720vz);
            A005.A01(A005.A00.getInt(A004, 0) + 1);
        }
    }
}
