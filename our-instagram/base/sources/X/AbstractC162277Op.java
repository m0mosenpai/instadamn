package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.store.ReplaceDirectMessageLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162277Op {
    public static final void A00(UserSession userSession, C2EC c2ec, C2DS c2ds, Collection collection) {
        C14360o3.A0B(collection, 3);
        if (!collection.isEmpty()) {
            final ME7 me7 = new ME7(49, c2ec, userSession, c2ds, collection);
            if (C18U.A06(C06090Tz.A05, userSession, 36327907131603909L)) {
                C14120nc.A00().ATO(new C18320vJ(657395099, new Runnable() { // from class: X.Asg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterfaceC16820sZ.this.invoke();
                    }
                }));
            } else {
                C4HC.A00.A00(userSession).A01().post(new Runnable() { // from class: X.Asg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterfaceC16820sZ.this.invoke();
                    }
                });
            }
        }
    }

    public static final void A01(UserSession userSession, String str, Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            String A0h = c83403nh.A0h();
            if (!c83403nh.A1S() && A0h != null && A0h.length() != 0) {
                String A0g = c83403nh.A0g();
                arrayList.add(A0h);
                if (A0g == null) {
                    A0g = "";
                }
                arrayList2.add(A0g);
            }
        }
        if (!arrayList.isEmpty()) {
            ReplaceDirectMessageLoader.A02(userSession, new C7B7(), str, arrayList, arrayList2);
        }
    }

    public static final void A02(UserSession userSession, String str, List list) {
        java.util.Set<C83403nh> A0k = AbstractC001800i.A0k(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C83403nh c83403nh : A0k) {
            String A0h = c83403nh.A0h();
            if (!c83403nh.A1S()) {
                C28541Zp A00 = C7P5.A00();
                C2EY c2ey = c83403nh.A10;
                C14360o3.A07(c2ey);
                if (A00.A01(c2ey).AFT(userSession, c83403nh) && A0h != null && A0h.length() != 0) {
                    String A0g = c83403nh.A0g();
                    arrayList.add(A0h);
                    if (A0g == null) {
                        A0g = "";
                    }
                    arrayList2.add(A0g);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ReplaceDirectMessageLoader.A02(userSession, new C7B7(), str, arrayList, arrayList2);
        }
    }
}
