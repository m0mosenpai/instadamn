package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Fg2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35210Fg2 {
    public String A00;
    public final AbstractC018607g A01;
    public final C34720FRh A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final WeakReference A05;
    public final java.util.Set A06 = new CopyOnWriteArraySet();
    public final InterfaceC37192Ga3 A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.1vN] */
    public final void A04(C3OO c3oo, C34710FQv c34710FQv, int i) {
        List list;
        Collection collection;
        View view;
        int i2;
        InterfaceC37192Ga3 interfaceC37192Ga3 = this.A07;
        interfaceC37192Ga3.DsF();
        WeakReference weakReference = this.A05;
        Context context = (Context) weakReference.get();
        if (!interfaceC37192Ga3.AFn()) {
            if (context != null) {
                C9GR.A08(context, 2131965257, 0);
                return;
            }
            return;
        }
        User user = c34710FQv.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC31173DnH.A1X(user, A1E);
        C34720FRh c34720FRh = this.A02;
        List list2 = c34720FRh.A01;
        boolean z = !list2.contains(new C34710FQv(user, true));
        c34710FQv.A00 = z;
        A02(this, i);
        if (context != null) {
            C31972E3a c31972E3a = (C31972E3a) c3oo;
            if (z) {
                view = c31972E3a.A02;
                i2 = 2131952463;
            } else {
                view = c31972E3a.A00;
                i2 = 2131972337;
            }
            AbstractC56932jR.A07(view, AbstractC31178DnM.A0c(context, user, i2));
        }
        if (interfaceC37192Ga3.CZb()) {
            if (z) {
                if (AbstractC31178DnM.A01(C06090Tz.A06, this.A04, 36595350450735234L) > list2.size()) {
                    c34720FRh.A02(user);
                } else {
                    c34710FQv.A00 = false;
                    if (context != null) {
                        String string = context.getString(2131962466);
                        String string2 = context.getString(2131962465);
                        if (string2 != null && !AbstractC001900j.A0T(string2)) {
                            C146106i8 A0j = AbstractC25229BEm.A0j();
                            A0j.A0H = "feed_favorites_max_limit";
                            A0j.A0D = string;
                            A0j.A0I = string2;
                            AbstractC25233BEq.A1F(A0j);
                        } else {
                            C9GR.A07(context, 2131961880);
                        }
                    }
                }
            } else {
                c34720FRh.A03(user);
            }
            A01(this);
            return;
        }
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        if (z) {
            list = A1E;
            collection = Collections.EMPTY_LIST;
        } else {
            list = Collections.EMPTY_LIST;
            collection = A1E;
        }
        C1ON A00 = AbstractC34038F0r.A00(interfaceC11380iw, userSession, list, collection);
        A00.A00 = new ETQ(c34710FQv, this, user, i, 0, z);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            C1GJ.A00(context2, this.A01, A00);
        }
        String A002 = AbstractC34040F0t.A00(A03(user, c34720FRh.A00(), AbstractC31173DnH.A0L(AbstractC92144Au.A02(new C31354DqJ(1), c34720FRh.A00))));
        C127085om A003 = AbstractC127075ol.A00(userSession);
        String moduleName = interfaceC11380iw.getModuleName();
        String str = this.A00;
        if (z) {
            A003.A00(user, moduleName, str, A002, null);
        } else {
            A003.A01(user, moduleName, str, A002, null);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36318286404655190L)) {
            return;
        }
        AbstractC25651Mw.A00(userSession).E4s(new Object());
    }

    public static void A00(C35210Fg2 c35210Fg2) {
        java.util.Set<Reference> set = c35210Fg2.A06;
        for (Reference reference : set) {
            InterfaceC37163GZa interfaceC37163GZa = (InterfaceC37163GZa) reference.get();
            if (interfaceC37163GZa == null) {
                set.remove(reference);
            } else {
                interfaceC37163GZa.CzA();
            }
        }
    }

    public static void A01(C35210Fg2 c35210Fg2) {
        java.util.Set<Reference> set = c35210Fg2.A06;
        for (Reference reference : set) {
            InterfaceC37163GZa interfaceC37163GZa = (InterfaceC37163GZa) reference.get();
            if (interfaceC37163GZa == null) {
                set.remove(reference);
            } else {
                interfaceC37163GZa.DPD();
            }
        }
    }

    public static void A02(C35210Fg2 c35210Fg2, int i) {
        java.util.Set<Reference> set = c35210Fg2.A06;
        for (Reference reference : set) {
            InterfaceC37163GZa interfaceC37163GZa = (InterfaceC37163GZa) reference.get();
            if (interfaceC37163GZa == null) {
                set.remove(reference);
            } else {
                interfaceC37163GZa.DPE(i);
            }
        }
    }

    public final void A05(InterfaceC37163GZa interfaceC37163GZa) {
        java.util.Set<Reference> set = this.A06;
        for (Reference reference : set) {
            Object obj = reference.get();
            if (obj == null || obj == interfaceC37163GZa) {
                set.remove(reference);
            }
        }
    }

    public void A06(User user) {
        this.A07.DsM();
        Context context = (Context) this.A05.get();
        if (context != null) {
            UserSession userSession = this.A04;
            Fragment A01 = AbstractC31364DqT.A01(userSession, AbstractC31402Dr6.A01(userSession, user.getId(), "feed_favorites_home_user_row", this.A03.getModuleName()));
            C140966Yy A0P = AbstractC31173DnH.A0P((FragmentActivity) context, userSession);
            A0P.A0E(A01);
            A0P.A04();
        }
    }

    public final void A07(List list) {
        C35132FeZ c35132FeZ = C34932FaI.A01;
        UserSession userSession = this.A04;
        c35132FeZ.A02(userSession);
        C1ON A00 = AbstractC34038F0r.A00(this.A03, userSession, AbstractC92144Au.A02(new C31354DqJ(2), list), Collections.EMPTY_LIST);
        C32548EUy.A01(A00, this, 39);
        Context context = (Context) this.A05.get();
        if (context != null) {
            C1GJ.A00(context, this.A01, A00);
        }
    }

    public C35210Fg2(Context context, AbstractC018607g abstractC018607g, C34720FRh c34720FRh, InterfaceC37192Ga3 interfaceC37192Ga3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A05 = AbstractC25225BEi.A16(context);
        this.A04 = userSession;
        this.A01 = abstractC018607g;
        this.A02 = c34720FRh;
        this.A07 = interfaceC37192Ga3;
        this.A03 = interfaceC11380iw;
        this.A00 = str;
    }

    public final Integer A03(User user, List list, List list2) {
        if (list2.contains(user)) {
            return C05F.A0C;
        }
        if (list.contains(user)) {
            if (this.A07.CZb()) {
                return C05F.A01;
            }
            return C05F.A0N;
        }
        return C05F.A00;
    }
}
