package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class JSN {
    public static final String A00(Context context, UserSession userSession, MRV mrv, InterfaceC50518MRv interfaceC50518MRv) {
        int i;
        Object[] objArr;
        EnumC101664hb enumC101664hb;
        EnumC101664hb enumC101664hb2;
        if (interfaceC50518MRv.CVQ()) {
            AbstractSet hashSet = new HashSet();
            Iterator it = mrv.BsH().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            C2EY Ar9 = mrv.Ar9();
            C2EY c2ey = C2EY.A0q;
            if (Ar9 == c2ey) {
                C101674hc Axj = mrv.Axj();
                if (Axj != null) {
                    enumC101664hb2 = Axj.A02;
                } else {
                    enumC101664hb2 = null;
                }
                if (enumC101664hb2 == EnumC101664hb.A06) {
                    hashSet = AnonymousClass090.A00(hashSet, new HashSet(mrv.CGo()));
                }
            }
            int size = hashSet.size();
            String str = userSession.userId;
            long j = 0;
            User user = null;
            for (Map.Entry entry : interfaceC50518MRv.CDv().entrySet()) {
                String str2 = (String) entry.getKey();
                C31230DoD c31230DoD = (C31230DoD) entry.getValue();
                if (!C14360o3.A0K(str, str2) && !C14360o3.A0K(mrv.BtF(), str2)) {
                    long C8g = mrv.C8g();
                    InterfaceC09390do interfaceC09390do = (InterfaceC09390do) c31230DoD.A02;
                    if (C8g <= ((Number) interfaceC09390do.getValue()).longValue()) {
                        User CDm = interfaceC50518MRv.CDm(str2, null);
                        if (((Number) interfaceC09390do.getValue()).longValue() > j && CDm != null) {
                            j = ((Number) interfaceC09390do.getValue()).longValue();
                            user = CDm;
                        }
                    }
                }
            }
            if (mrv.Ar9() == c2ey) {
                C101674hc Axj2 = mrv.Axj();
                if (Axj2 != null) {
                    enumC101664hb = Axj2.A02;
                } else {
                    enumC101664hb = null;
                }
                if (enumC101664hb == EnumC101664hb.A06) {
                    Iterator it2 = mrv.CGn().iterator();
                    while (it2.hasNext()) {
                        User CDm2 = interfaceC50518MRv.CDm((String) it2.next(), null);
                        if (CDm2 != null) {
                            user = CDm2;
                            break;
                        }
                    }
                }
            }
            if (user == null) {
                return null;
            }
            String A08 = AbstractC101904i3.A08(user);
            Object obj = null;
            if (A08 == null) {
                return null;
            }
            if (hashSet.size() >= interfaceC50518MRv.Bl6().size()) {
                return context.getString(2131958664);
            }
            if (size <= 1) {
                i = 2131958637;
                objArr = new Object[]{A08};
            } else if (size == 2) {
                Iterator it3 = hashSet.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (!C14360o3.A0K(next, A08)) {
                        obj = next;
                        break;
                    }
                }
                i = 2131958639;
                objArr = new Object[]{A08, obj};
            } else {
                i = 2131958638;
                objArr = new Object[]{A08, Integer.valueOf(size - 1)};
            }
            return context.getString(i, objArr);
        }
        if (mrv.Ar9() == C2EY.A0q) {
            C101674hc Axj3 = mrv.Axj();
            if (Axj3 == null || Axj3.A02 != EnumC101664hb.A06) {
                return null;
            }
            return context.getString(2131958633);
        }
        C14360o3.A0B(userSession.userId, 1);
        LinkedHashMap CDv = interfaceC50518MRv.CDv();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : CDv.entrySet()) {
            if (!r5.equals(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        C31230DoD c31230DoD2 = (C31230DoD) AbstractC001800i.A0A(linkedHashMap.values());
        if (c31230DoD2 != null && C14360o3.A0K(userSession.userId, mrv.BtF()) && mrv.C8g() <= ((Number) ((InterfaceC09390do) c31230DoD2.A02).getValue()).longValue()) {
            return AbstractC43644JSc.A01(context, c31230DoD2.A01);
        }
        return null;
    }
}
