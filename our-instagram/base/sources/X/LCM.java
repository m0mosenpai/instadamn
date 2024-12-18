package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LCM {
    public static final void A00(JZK jzk, UserSession userSession, EnumC46242KdI enumC46242KdI, String str, String str2) {
        LJd lJd;
        java.util.Set set;
        C14360o3.A0B(userSession, 1);
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(enumC46242KdI, EnumC46242KdI.A05);
        boolean A1X2 = AbstractC167007dF.A1X(enumC46242KdI, EnumC46242KdI.A04);
        if (!A1X && !A1X2) {
            z = false;
        }
        String str3 = userSession.userId;
        C14360o3.A0B(str3, 0);
        LJd lJd2 = jzk.A01;
        if (lJd2 != null && C14360o3.A0K(lJd2.A0D, str3) && (lJd = jzk.A01) != null && lJd.A05 != null) {
            if (z) {
                set = lJd.A0H;
            } else {
                set = lJd.A0G;
            }
            set.add(str2);
            if (str != null) {
                lJd.A0I.add(str);
            }
            Runnable runnable = lJd.A05;
            if (runnable != null) {
                LJd.A01(lJd, runnable, "SyncCompletion");
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A01(UserSession userSession, EnumC46242KdI enumC46242KdI, C91Y c91y, String str, String str2) {
        String str3;
        C49593Lvm c49593Lvm;
        java.util.Set set;
        C14360o3.A0B(userSession, 1);
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(enumC46242KdI, EnumC46242KdI.A05);
        boolean A1X2 = AbstractC167007dF.A1X(enumC46242KdI, EnumC46242KdI.A04);
        if (!A1X && !A1X2) {
            z = false;
        }
        String str4 = userSession.userId;
        C14360o3.A0B(str4, 0);
        C49593Lvm c49593Lvm2 = c91y.A02;
        if (c49593Lvm2 != null) {
            UserSession userSession2 = c49593Lvm2.A03;
            if (userSession2 != null) {
                str3 = userSession2.userId;
            } else {
                str3 = null;
            }
            if (C14360o3.A0K(str3, str4) && (c49593Lvm = c91y.A02) != null) {
                if (z) {
                    set = c49593Lvm.A08;
                } else {
                    set = c49593Lvm.A07;
                }
                set.add(str2);
                if (str != null) {
                    c49593Lvm.A09.add(str);
                }
                boolean z2 = c49593Lvm.A0A;
                InterfaceC03960Jm interfaceC03960Jm = c49593Lvm.A05;
                if (z2) {
                    if (interfaceC03960Jm != null) {
                        C49593Lvm.A03(c49593Lvm, interfaceC03960Jm, "SyncCompletion");
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                if (interfaceC03960Jm != null) {
                    C49593Lvm.A02(c49593Lvm, interfaceC03960Jm, "SyncCompletion");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }
}
