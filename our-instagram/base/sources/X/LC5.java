package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public abstract class LC5 {
    /* JADX WARN: Type inference failed for: r0v36, types: [X.6ZI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.6ZI, java.lang.Object] */
    public static String A00(Context context, UserSession userSession, C7QP c7qp, String str, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        Object[] objArr;
        int i3;
        Object[] objArr2;
        String username;
        C38471qb c38471qb;
        int i4;
        Object[] objArr3;
        String username2;
        C6ZI c6zi;
        C38321qM c38321qM = c7qp.A01;
        Integer num = c7qp.A04;
        Integer num2 = C05F.A01;
        if (z) {
            if (num == num2) {
                i = 2131960500;
            } else {
                if (c38321qM != null) {
                    if (!c38321qM.A5V()) {
                        C38471qb c38471qb2 = c7qp.A00;
                        if (c38471qb2 == null) {
                            c6zi = null;
                        } else {
                            ?? obj = new Object();
                            obj.A00 = c38471qb2;
                            c6zi = obj;
                        }
                        if (c7qp.A02 == ReelType.A0S && c6zi != null) {
                            int intValue = c6zi.CBs().intValue();
                            if (intValue != 3) {
                                if (intValue == 2) {
                                    i4 = 2131959796;
                                }
                            } else {
                                i4 = 2131959551;
                            }
                            objArr3 = new Object[1];
                            username2 = c6zi.A00.A06;
                        } else {
                            i4 = 2131960554;
                            if (z2) {
                                i4 = 2131960555;
                            }
                            objArr3 = new Object[1];
                            username2 = A01(userSession, c38321qM);
                        }
                        objArr3[0] = username2;
                        return context.getString(i4, objArr3);
                    }
                    if (c7qp.A02 == ReelType.A0P) {
                        i4 = 2131960533;
                        if (z2) {
                            i4 = 2131960534;
                        }
                        objArr3 = new Object[1];
                        User A2E = c38321qM.A2E(userSession);
                        A2E.getClass();
                        username2 = A2E.getUsername();
                        objArr3[0] = username2;
                        return context.getString(i4, objArr3);
                    }
                }
                i = 2131960556;
                if (z2) {
                    i = 2131960557;
                }
            }
        } else {
            if (num == num2) {
                if (c38321qM != null) {
                    i3 = 2131960498;
                    objArr2 = new Object[1];
                    username = A01(userSession, c38321qM);
                } else {
                    return context.getString(2131960499);
                }
            } else {
                if (c38321qM != null) {
                    if (!c38321qM.A5V() && c7qp.A02 == ReelType.A0S && (c38471qb = c7qp.A00) != null) {
                        ?? obj2 = new Object();
                        obj2.A00 = c38471qb;
                        int intValue2 = obj2.CBs().intValue();
                        if (intValue2 != 3) {
                            if (intValue2 == 2) {
                                i3 = 2131959795;
                            }
                        } else {
                            i3 = 2131959550;
                        }
                        objArr2 = new Object[1];
                        username = obj2.A00.A06;
                    } else if (c7qp.A02 == ReelType.A0P) {
                        if (z3) {
                            i3 = 2131960529;
                            if (z2) {
                                i3 = 2131960526;
                            }
                            User A2E2 = c38321qM.A2E(userSession);
                            A2E2.getClass();
                            objArr2 = new Object[]{str, A2E2.getUsername()};
                            return context.getString(i3, objArr2);
                        }
                        i3 = 2131960524;
                        if (z2) {
                            i3 = 2131960525;
                        }
                        objArr2 = new Object[1];
                        User A2E3 = c38321qM.A2E(userSession);
                        A2E3.getClass();
                        username = A2E3.getUsername();
                    } else {
                        String A01 = A01(userSession, c38321qM);
                        if (A01 != null) {
                            if (z3) {
                                i2 = 2131960549;
                                if (z2) {
                                    i2 = 2131960545;
                                }
                                objArr = new Object[]{str, A01};
                            } else {
                                i2 = 2131960543;
                                if (z2) {
                                    i2 = 2131960544;
                                }
                                objArr = new Object[]{A01};
                            }
                            return context.getString(i2, objArr);
                        }
                    }
                }
                if (z3) {
                    i2 = 2131960546;
                    if (z2) {
                        i2 = 2131960547;
                    }
                    objArr = new Object[]{str};
                    return context.getString(i2, objArr);
                }
                i = 2131960551;
                if (z2) {
                    i = 2131960552;
                }
            }
            objArr2[0] = username;
            return context.getString(i3, objArr2);
        }
        return context.getString(i);
    }

    public static String A01(UserSession userSession, C38321qM c38321qM) {
        User A2E = c38321qM.A2E(userSession);
        A2E.getClass();
        if (A2E.A2N()) {
            return AbstractC41071vF.A0G(userSession, c38321qM);
        }
        User A2E2 = c38321qM.A2E(userSession);
        A2E2.getClass();
        return A2E2.getUsername();
    }
}
