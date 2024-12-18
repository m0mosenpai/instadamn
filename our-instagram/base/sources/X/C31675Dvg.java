package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dvg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31675Dvg {
    public static final C2n2 A0J = C31679Dvk.A00;
    public int A00;
    public int A01;
    public int A02;
    public final Comparator A03;
    public final Comparator A04;
    public final HashSet A05;
    public final InterfaceC08830cm A06;
    public final Context A07;
    public final UserSession A08;
    public final C195218kN A09;
    public final String A0A;
    public final ArrayList A0B;
    public final HashMap A0C;
    public final HashMap A0D;
    public final HashSet A0E;
    public final HashSet A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final ArrayList A03(List list) {
        C14360o3.A0B(list, 0);
        if (!list.isEmpty()) {
            ArrayList arrayList = this.A0B;
            ArrayList A17 = AbstractC25225BEi.A17(AbstractC31172DnG.A02(list, arrayList.size()));
            A17.addAll(arrayList);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
                Object obj = this.A0D.get(A0J.apply(directShareTarget));
                HashMap hashMap = this.A0C;
                InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
                interfaceC83713oG.getClass();
                Object obj2 = hashMap.get(JRE.A01(AbstractC140946Yw.A06(interfaceC83713oG)));
                if (obj == null && obj2 == null) {
                    A17.add(directShareTarget);
                }
            }
            return A17;
        }
        return AbstractC166987dD.A1F(this.A0B);
    }

    public final void A04(String str) {
        HashSet hashSet = this.A0F;
        hashSet.clear();
        HashSet hashSet2 = this.A05;
        hashSet2.clear();
        HashSet hashSet3 = this.A0E;
        hashSet3.clear();
        HashMap hashMap = this.A0D;
        hashMap.clear();
        HashMap hashMap2 = this.A0C;
        hashMap2.clear();
        this.A0B.clear();
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        if (!this.A0G && str.length() == 0) {
            return;
        }
        boolean z = this.A0H;
        if (z) {
            ((C2DS) this.A06.get()).AVL(str, hashSet2, hashSet3);
            Iterator A13 = AbstractC166997dE.A13(hashSet2);
            while (A13.hasNext()) {
                Object next = A13.next();
                C14360o3.A07(next);
                C2EC c2ec = (C2EC) next;
                hashMap2.put(c2ec.BKb(), AbstractC31677Dvi.A00(this.A07, this.A08, c2ec));
            }
            hashSet3.removeAll(hashSet2);
            Iterator A132 = AbstractC166997dE.A13(hashSet3);
            while (A132.hasNext()) {
                Object next2 = A132.next();
                C14360o3.A07(next2);
                C2EC c2ec2 = (C2EC) next2;
                if (!c2ec2.CZH() && c2ec2.BSH().size() == 1) {
                    hashMap.put(((User) c2ec2.BSH().get(0)).getId(), AbstractC31677Dvi.A00(this.A07, this.A08, c2ec2));
                } else {
                    hashMap2.put(c2ec2.BKb(), AbstractC31677Dvi.A00(this.A07, this.A08, c2ec2));
                }
            }
        }
        this.A09.A08(null, this.A0A, str, hashSet);
        Iterator A133 = AbstractC166997dE.A13(hashSet);
        while (A133.hasNext()) {
            Object next3 = A133.next();
            C14360o3.A07(next3);
            User user = (User) next3;
            String id = user.getId();
            if (!hashMap.containsKey(id)) {
                List singletonList = Collections.singletonList(new PendingRecipient(user));
                C14360o3.A07(singletonList);
                hashMap.put(id, new DirectShareTarget(new C122145g6(singletonList), AbstractC101904i3.A07(user), singletonList, true));
            }
        }
        if (z) {
            if (this.A0I) {
                A00(true);
                A01(false);
                return;
            } else {
                A01(true);
                A00(false);
                return;
            }
        }
        A01(true);
    }

    private final void A00(boolean z) {
        ArrayList arrayList = this.A0B;
        this.A00 = arrayList.size();
        if (z) {
            for (Object obj : this.A0D.values()) {
                C14360o3.A07(obj);
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                if (directShareTarget.A08() != null) {
                    arrayList.add(directShareTarget);
                }
            }
        }
        arrayList.addAll(this.A0C.values());
        List subList = arrayList.subList(this.A00, arrayList.size());
        C14360o3.A07(subList);
        C01T.A1D(subList, this.A03);
    }

    private final void A01(boolean z) {
        ArrayList arrayList = this.A0B;
        this.A02 = arrayList.size();
        Collection values = this.A0D.values();
        if (!z) {
            for (Object obj : values) {
                C14360o3.A07(obj);
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                if (directShareTarget.A08() == null) {
                    arrayList.add(directShareTarget);
                }
            }
        } else {
            arrayList.addAll(values);
        }
        int size = arrayList.size();
        this.A01 = size;
        this.A09.A07(A0J, this.A0A, this.A04, arrayList.subList(this.A02, size));
    }

    public C31675Dvg(Context context, UserSession userSession, String str, InterfaceC08830cm interfaceC08830cm, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1P(context, userSession);
        this.A07 = context;
        this.A08 = userSession;
        this.A06 = interfaceC08830cm;
        this.A0A = str;
        this.A0G = z;
        this.A0H = z2;
        this.A0I = z3;
        C195218kN A00 = C195218kN.A00(userSession);
        C14360o3.A07(A00);
        this.A09 = A00;
        this.A0F = AbstractC166987dD.A1H();
        this.A05 = AbstractC166987dD.A1H();
        this.A0E = AbstractC166987dD.A1H();
        this.A0D = AbstractC166987dD.A1G();
        this.A0C = AbstractC166987dD.A1G();
        this.A0B = AbstractC166987dD.A1E();
        this.A03 = new C31460Ds4(this, 8);
        this.A04 = new C31460Ds4(this, 9);
    }

    public final C31671Dvc A02(List list) {
        ArrayList A03 = A03(list);
        return new C31671Dvc(A03.subList(this.A02, this.A01), A03);
    }
}
