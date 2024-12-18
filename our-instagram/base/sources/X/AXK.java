package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AXK implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(AXK.class);
    public static final String __redex_internal_original_name = "BKBloksFxActionUpdateClientLinkageCacheImpl";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1vw, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int i;
        int i2;
        List list = c6fw.A00;
        Object obj = list.get(0);
        C14360o3.A0C(obj, AbstractC111324zv.A00(4997));
        ArrayList A1E = AbstractC166987dD.A1E();
        InterfaceC103384lE A002 = C1344465q.A00(list.get(1));
        for (Object obj2 : (List) obj) {
            C14360o3.A0C(obj2, MSV.A00(21));
            A1E.add(obj2);
        }
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        C40921uz A003 = AbstractC40751ui.A00(userSession);
        CallerContext callerContext = A00;
        Integer num = C05F.A15;
        A003.A0A(callerContext, AbstractC126955oZ.A00(num, A1E));
        C41451vu.A01.E4s(new Object());
        AbstractC54332en.A00(userSession).A04(EnumC54222eY.A0Z);
        if (AbstractC54472f1.A01() && AbstractC41611wB.A02(userSession)) {
            C40921uz A004 = AbstractC40751ui.A00(userSession);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                String str = (String) map.get(AbstractC111324zv.A00(1876));
                String str2 = (String) map.get(AbstractC111324zv.A00(1020));
                String str3 = (String) map.get("account_type");
                String str4 = (String) map.get("account_name");
                String str5 = (String) map.get(AbstractC111324zv.A00(74));
                String str6 = (String) map.get(AbstractC31581Du9.A01());
                String str7 = (String) map.get("obfuscated_id");
                String A1A = AbstractC166987dD.A1A("badge_count", map);
                int i3 = 0;
                if (A1A != null) {
                    try {
                        i = Integer.parseInt(A1A);
                    } catch (NumberFormatException unused) {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                String A1A2 = AbstractC166987dD.A1A("unfiltered_badge_count", map);
                if (A1A2 != null) {
                    try {
                        i2 = Integer.parseInt(A1A2);
                    } catch (NumberFormatException unused2) {
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                String A1A3 = AbstractC166987dD.A1A("ig_l28", map);
                if (A1A3 != null) {
                    try {
                        i3 = Integer.parseInt(A1A3);
                    } catch (NumberFormatException unused3) {
                    }
                }
                String str8 = (String) map.get("unpacked_notifications");
                if (!AbstractC126965oa.A02(str) && !AbstractC126965oa.A02(str3)) {
                    if (str != null) {
                        if (str3 != null) {
                            A1E2.add(new FxCalAccountWithSwitcherInfo(str, str2, str3, str4, str5, str6, str7, str8, "", i, i2, i3, false));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            A004.A0B(callerContext, new FxCalAccountLinkageInfoForSwitcher(num, A1E2, System.currentTimeMillis()));
        }
        if (A002 != null) {
            C131845xK.A00(c6fq, C6FW.A01, A002);
            return null;
        }
        return null;
    }
}
