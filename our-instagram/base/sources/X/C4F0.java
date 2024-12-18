package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4F0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F0 extends C4A7 {
    public final UserSession A00;
    public final C4F2 A01;
    public final InterfaceC09390do A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;

    public static final void A00(UserSession userSession, C38321qM c38321qM, User user) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C38321qM A1g = c38321qM.A1g(userSession);
        List A3j = A1g.A3j();
        if (A3j == null) {
            A3j = C16930sl.A00;
        }
        ArrayList A0U = AbstractC001800i.A0U(A3j);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C14360o3.A0K(((InterfaceC103524lS) next).getUserId(), user.getId())) {
                arrayList.add(next);
            }
        }
        A1g.A4Q(arrayList);
        C1DW.A00(userSession).A01(A1g, true, false);
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM, User user) {
        List A3j = c38321qM.A1g(userSession).A3j();
        if (A3j == null) {
            return false;
        }
        if (!(A3j instanceof Collection) || !A3j.isEmpty()) {
            Iterator it = A3j.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((InterfaceC103524lS) it.next()).getUserId(), user.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A02(EnumC25577BSp enumC25577BSp, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str, 0);
        int i = 1;
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 3);
        boolean A06 = C18U.A06(C06090Tz.A05, this.A00, 36323586394566028L);
        C19L c19l = super.A01;
        if (!A06) {
            i = 2;
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new D4u(enumC25577BSp, this, num, num2, str, str2, str3, str4, str5, str6, (InterfaceC23621Ds) null, i), c19l);
    }

    public final void A03(EnumC25577BSp enumC25577BSp, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        int i = 3;
        C14360o3.A0B(str3, 3);
        boolean A06 = C18U.A06(C06090Tz.A05, this.A00, 36323586394828176L);
        C19L c19l = super.A01;
        if (!A06) {
            i = 4;
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new D4u(enumC25577BSp, this, num, num2, str, str2, str3, str4, str5, str6, (InterfaceC23621Ds) null, i), c19l);
    }

    public final boolean A04(String str, String str2) {
        Object obj;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C38321qM A00 = BSQ.A00(this.A00, str);
        if (A00 == null) {
            return false;
        }
        List A3j = A00.A3j();
        if (A3j == null) {
            A3j = C16930sl.A00;
        }
        Iterator it = A3j.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((InterfaceC103524lS) obj).getId(), str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC103524lS interfaceC103524lS = (InterfaceC103524lS) obj;
        if (interfaceC103524lS == null) {
            return false;
        }
        return C14360o3.A0K(interfaceC103524lS.CG8(), true);
    }

    public C4F0(UserSession userSession, C4F2 c4f2) {
        super("ContentNotes", C4A8.A01(833760202, 3));
        this.A00 = userSession;
        this.A01 = c4f2;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(this, 23));
        C008002u A00 = C10E.A00(AbstractC06930Yk.A0E());
        this.A04 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        C008002u c008002u = new C008002u(0L);
        this.A03 = c008002u;
        this.A06 = AbstractC208910l.A02(c008002u);
    }
}
