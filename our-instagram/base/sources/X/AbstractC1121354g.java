package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import kotlin.Deprecated;

/* renamed from: X.54g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1121354g {
    public static final HashSet A01(C2EC c2ec, java.util.Set set, boolean z) {
        C81543kP c81543kP;
        C14360o3.A0B(set, 0);
        C14360o3.A0B(c2ec, 1);
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            if (C14360o3.A0K(obj, C47092Dx.A00)) {
                C31200Dnj BhT = c2ec.BhT();
                if (BhT != null && BhT.A00 != null) {
                    hashSet.add(obj);
                }
            } else {
                boolean A0K = C14360o3.A0K(obj, C47062Du.A00);
                EnumC46982Dm C4i = c2ec.C4i();
                C14360o3.A07(C4i);
                boolean A0K2 = C14360o3.A0K(obj, A00(C4i, c2ec.C7C()));
                if (A0K) {
                    if (A0K2) {
                        if (c2ec.C7g() == 29 && (((c81543kP = ((C81663kb) c2ec).A01.A0t) == null || !c81543kP.A0I) && z)) {
                        }
                        hashSet.add(obj);
                    }
                } else if (A0K2) {
                    hashSet.add(obj);
                }
            }
        }
        return hashSet;
    }

    public static final boolean A02(UserSession userSession, C2EC c2ec, int i) {
        C81543kP c81543kP;
        C14360o3.A0B(c2ec, 2);
        if ((i != -1 && i != 0) || c2ec.B7A() != 3 || !C18U.A06(C06090Tz.A05, userSession, 36317908448384680L) || (c81543kP = ((C81663kb) c2ec).A01.A0t) == null) {
            return false;
        }
        return c81543kP.A0L;
    }

    @Deprecated(message = "Please refactor your code to get DirectInboxMode directly instead of calling this\n        method. This only exists to support legacy implementations that will be removed.")
    public static final AbstractC46972Dl A00(EnumC46982Dm enumC46982Dm, int i) {
        if (enumC46982Dm == EnumC46982Dm.A04) {
            return C4I2.A00;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 1000) {
                                return C47072Dv.A00;
                            }
                        } else {
                            return C47092Dx.A00;
                        }
                    } else {
                        return C47062Du.A00;
                    }
                } else {
                    return C46962Dk.A00;
                }
            } else {
                return C47032Dr.A00;
            }
        }
        return C4I1.A00;
    }
}
