package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.FfI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35167FfI {
    public final FLF A01 = new FLF();
    public final C34521FJh A02 = new C34521FJh();
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public java.util.Set A00 = AbstractC31171DnF.A0l();

    public final void A06(List list) {
        java.util.Set A0k = AbstractC001800i.A0k(list);
        java.util.Set set = this.A03;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C32069E6v.A01(A0q, it);
        }
        Iterator it2 = AbstractC001800i.A0m(A0k, AbstractC001800i.A0k(A0q)).iterator();
        while (it2.hasNext()) {
            this.A00.add(new C32069E6v((User) it2.next(), false, true));
        }
    }

    public final void A07(List list) {
        C14360o3.A0B(list, 0);
        java.util.Set set = this.A03;
        set.clear();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C32069E6v((User) it.next(), true, true));
        }
        set.addAll(A0q);
    }

    public final void A08(List list) {
        C14360o3.A0B(list, 0);
        java.util.Set A0k = AbstractC001800i.A0k(list);
        java.util.Set set = this.A03;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C32069E6v.A01(A0q, it);
        }
        java.util.Set A0m = AbstractC001800i.A0m(A0k, AbstractC001800i.A0k(A0q));
        this.A00.clear();
        Iterator it2 = A0m.iterator();
        while (it2.hasNext()) {
            this.A00.add(new C32069E6v((User) it2.next(), false, true));
        }
    }

    public static void A01(ELn eLn, C35167FfI c35167FfI) {
        eLn.A0A().A02(c35167FfI.A03.size());
    }

    public final ImmutableList A02() {
        return AbstractC31173DnH.A0L(this.A03);
    }

    public final ImmutableList A03() {
        return AbstractC31173DnH.A0L(this.A00);
    }

    public final void A04() {
        java.util.Set<C32069E6v> set = this.A03;
        ArrayList A0q = AbstractC167017dG.A0q(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C32069E6v) it.next()).A01 = false;
            A0q.add(C0eB.A00);
        }
        for (C32069E6v c32069E6v : set) {
            FLF flf = this.A01;
            User user = c32069E6v.A02;
            C14360o3.A0B(user, 0);
            flf.A02.add(user);
            flf.A00.remove(user);
            flf.A01.remove(user);
            C34521FJh c34521FJh = this.A02;
            C47780L8g c47780L8g = new C47780L8g(user, C05F.A0C);
            java.util.Set set2 = c34521FJh.A00;
            if (set2.contains(c47780L8g)) {
                set2.remove(c47780L8g);
            } else {
                c34521FJh.A01.add(c47780L8g);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.A00);
        this.A00.clear();
        this.A00.addAll(set);
        this.A00.addAll(linkedHashSet);
        set.clear();
    }

    public final void A05(C32069E6v c32069E6v, Integer num, boolean z, boolean z2) {
        C32069E6v c32069E6v2;
        C47780L8g c47780L8g;
        java.util.Set set;
        java.util.Set set2;
        C32069E6v c32069E6v3;
        java.util.Set set3;
        if (z) {
            c32069E6v.A01 = true;
            this.A03.add(c32069E6v);
            Iterator it = this.A00.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C14360o3.A0K(it.next(), c32069E6v)) {
                        c32069E6v3 = c32069E6v;
                        break;
                    }
                } else {
                    c32069E6v3 = null;
                    break;
                }
            }
            C15500q5.A00(this.A00).remove(c32069E6v3);
            FLF flf = this.A01;
            User user = c32069E6v.A02;
            C14360o3.A0B(user, 0);
            flf.A02.remove(user);
            if (z2) {
                set3 = flf.A01;
            } else {
                set3 = flf.A00;
            }
            set3.add(user);
            C34521FJh c34521FJh = this.A02;
            c47780L8g = new C47780L8g(user, num);
            set = c34521FJh.A01;
            if (!set.contains(c47780L8g)) {
                set2 = c34521FJh.A00;
                set2.add(c47780L8g);
                return;
            }
            set.remove(c47780L8g);
        }
        c32069E6v.A01 = false;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        A0l.add(c32069E6v);
        A0l.addAll(this.A00);
        this.A00 = A0l;
        java.util.Set set4 = this.A03;
        Iterator it2 = set4.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C14360o3.A0K(it2.next(), c32069E6v)) {
                    c32069E6v2 = c32069E6v;
                    break;
                }
            } else {
                c32069E6v2 = null;
                break;
            }
        }
        C15500q5.A00(set4).remove(c32069E6v2);
        FLF flf2 = this.A01;
        User user2 = c32069E6v.A02;
        C14360o3.A0B(user2, 0);
        flf2.A02.add(user2);
        flf2.A00.remove(user2);
        flf2.A01.remove(user2);
        C34521FJh c34521FJh2 = this.A02;
        c47780L8g = new C47780L8g(user2, num);
        set = c34521FJh2.A00;
        if (!set.contains(c47780L8g)) {
            set2 = c34521FJh2.A01;
            set2.add(c47780L8g);
            return;
        }
        set.remove(c47780L8g);
    }

    public static void A00(ELn eLn, C35167FfI c35167FfI) {
        eLn.A0A().A04(c35167FfI.A02(), c35167FfI.A03());
        eLn.A0A().A01();
    }
}
