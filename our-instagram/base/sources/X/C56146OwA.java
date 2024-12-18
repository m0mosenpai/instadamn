package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OwA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56146OwA implements InterfaceC13050lr {
    public C5QG A00;
    public C47Z A01;
    public final UserSession A02;
    public final Map A03;

    public C56146OwA(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = AbstractC166987dD.A1I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.47Z] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.47Z] */
    public final void A00(Context context, C47Z c47z) {
        C5QG c5qg;
        ArrayList arrayList;
        Object obj;
        if (this.A01 == null) {
            this.A01 = AbstractC209399Nx.A00(c47z, AbstractC43593JPy.A0x());
        }
        Map map = this.A03;
        C47Z c47z2 = map.get(c47z.A35);
        List list = c47z.A4o;
        ArrayList arrayList2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C5QG) obj).A0O) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c5qg = (C5QG) obj;
        } else {
            c5qg = null;
        }
        C5QG c5qg2 = this.A00;
        boolean z = c5qg2 != null ? !c5qg2.equals(c5qg) : true;
        if (c47z2 == 0) {
            c47z2 = AbstractC209399Nx.A00(c47z, AbstractC43593JPy.A0x());
            c47z2.A5J = true;
            c47z2.A0N = 17;
            c47z2.A0c(ShareType.A0B);
            c47z2.A1K = c47z.A1K;
        } else if (z) {
            C40121td.A0G.A01(context, this.A02).A0J(((C47Z) c47z2).A35);
            C47Z c47z3 = this.A01;
            if (c47z3 != null) {
                c47z2 = AbstractC209399Nx.A00(c47z3, AbstractC43593JPy.A0x());
                c47z2.A5J = true;
                c47z2.A0N = 17;
                c47z2.A0c(ShareType.A0B);
                c47z2.A1K = c47z.A1K;
            } else {
                return;
            }
        }
        C47Z c47z4 = c47z2;
        List list2 = c47z.A4o;
        if (list2 != null) {
            arrayList = AbstractC166987dD.A1E();
            for (Object obj2 : list2) {
                AbstractC25228BEl.A1Q(obj2, arrayList, ((C5QG) obj2).A0O ? 1 : 0);
            }
        } else {
            arrayList = null;
        }
        c47z4.A4o = arrayList;
        if (c5qg != null) {
            List list3 = c47z.A4a;
            if (list3 != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (Object obj3 : list3) {
                    List list4 = c47z.A4a;
                    C93094Fl c93094Fl = c5qg.A02;
                    Object obj4 = null;
                    if (c93094Fl != null && list4 != null) {
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            java.util.Set set = ((C5NJ) next).A07;
                            C14360o3.A07(set);
                            Iterator it3 = set.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    C5NO c5no = (C5NO) next2;
                                    if (AbstractC31175DnJ.A1S((AbstractC166987dD.A01(c5no.A04, c93094Fl.A03) > 0.01f ? 1 : (AbstractC166987dD.A01(c5no.A04, c93094Fl.A03) == 0.01f ? 0 : -1))) && AbstractC31175DnJ.A1S((AbstractC166987dD.A01(c5no.A06, c93094Fl.A04) > 0.01f ? 1 : (AbstractC166987dD.A01(c5no.A06, c93094Fl.A04) == 0.01f ? 0 : -1)))) {
                                        float f = c5no.A08;
                                        float f2 = c93094Fl.A08;
                                        float f3 = c93094Fl.A06;
                                        if (AbstractC31175DnJ.A1S((AbstractC166987dD.A01(f, f2 * f3) > 0.01f ? 1 : (AbstractC166987dD.A01(f, f2 * f3) == 0.01f ? 0 : -1))) && AbstractC31175DnJ.A1S((AbstractC166987dD.A01(c5no.A07, c93094Fl.A02 * f3) > 0.01f ? 1 : (AbstractC166987dD.A01(c5no.A07, c93094Fl.A02 * f3) == 0.01f ? 0 : -1))) && AbstractC31175DnJ.A1S((AbstractC166987dD.A01(c5no.A09, c93094Fl.A05) > 0.01f ? 1 : (AbstractC166987dD.A01(c5no.A09, c93094Fl.A05) == 0.01f ? 0 : -1)))) {
                                            if (next2 != null) {
                                                obj4 = next;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!C14360o3.A0K(obj3, obj4)) {
                        arrayList2.add(obj3);
                    }
                }
            }
            c47z4.A4a = arrayList2;
            c47z.A0j(AbstractC166987dD.A1J(c47z2));
            c47z.A0T(EnumC40111tc.A0W);
        } else {
            c47z.A0j(C16930sl.A00);
            c47z.A0T(EnumC40111tc.A0a);
        }
        this.A00 = c5qg;
        map.put(c47z.A35, c47z2);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = null;
        this.A01 = null;
        this.A03.clear();
    }
}
