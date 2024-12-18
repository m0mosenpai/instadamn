package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class LKZ {
    public static final String A01(UserSession userSession, String str, Map map) {
        C14360o3.A0B(str, 2);
        User A10 = AbstractC166987dD.A10(userSession);
        if (!C14360o3.A0K(A10.getId(), str) && (A10 = (User) map.get(str)) == null) {
            return null;
        }
        return A10.getUsername();
    }

    public static final boolean A04(UserSession userSession, L8R l8r, Map map) {
        Integer nullableInteger = l8r.A00.mResultSet.getNullableInteger(0, 11);
        if (nullableInteger == null || nullableInteger.intValue() != 1) {
            User A10 = AbstractC166987dD.A10(userSession);
            Collection values = map.values();
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC43594JPz.A1Z((User) next, A10)) {
                    if (next != null) {
                        if (!LCG.A01(l8r)) {
                            Iterator it2 = values.iterator();
                            while (it2.hasNext()) {
                                User A15 = AbstractC25226BEj.A15(it2);
                                if (!AbstractC43594JPz.A1Z(A10, A15) && (A15.CYY() || A15.isRestricted())) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final EnumC162657Qc A00(InterfaceC50520MRx interfaceC50520MRx, int i) {
        int BtB = interfaceC50520MRx.BtB(i);
        if (BtB != 0) {
            if (BtB != 1) {
                if (BtB != 2) {
                    if (BtB != 4) {
                        if (BtB == 5) {
                            return EnumC162657Qc.A02;
                        }
                    } else {
                        return EnumC162657Qc.A04;
                    }
                }
                return EnumC162657Qc.A06;
            }
            return EnumC162657Qc.A05;
        }
        return EnumC162657Qc.A03;
    }

    public static final String A02(InterfaceC50520MRx interfaceC50520MRx, int i) {
        String obj;
        Long BOG = interfaceC50520MRx.BOG(i);
        if (BOG == null || (obj = BOG.toString()) == null) {
            return interfaceC50520MRx.BSx(i);
        }
        return obj;
    }

    public static final ArrayList A03(C47384KwZ c47384KwZ, long j) {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c47384KwZ != null) {
            List list = c47384KwZ.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String valueOf = String.valueOf(j);
                String str2 = ((L4F) list.get(i)).A02;
                if (((L4F) list.get(i)).A05) {
                    str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                } else {
                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                }
                A1E.add(new AnonymousClass441(null, ((L4F) list.get(i)).A00, valueOf, str2, str));
            }
        }
        return A1E;
    }
}
