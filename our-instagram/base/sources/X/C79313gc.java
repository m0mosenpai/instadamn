package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79313gc {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final InterfaceC16820sZ A05 = new C9E0(this, 24);
    public final boolean A06;
    public final boolean A07;

    public C79313gc(C38321qM c38321qM, C75113Zb c75113Zb) {
        boolean z;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A07 = c38321qM.CdW();
        this.A06 = c38321qM.A5M();
        this.A04 = c38321qM.A0C.ByK();
        this.A02 = c38321qM.A2f();
        List list = c38321qM.A1Z().A00;
        ArrayList<C84923qg> arrayList = new ArrayList();
        for (Object obj : list) {
            C84923qg c84923qg = (C84923qg) obj;
            if (c84923qg.A08 != null && !c84923qg.A02()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (C84923qg c84923qg2 : arrayList) {
            String str = c84923qg2.A0e;
            String str2 = c84923qg2.A0G;
            User user = c84923qg2.A08;
            if (user != null) {
                List list2 = c84923qg2.A0I;
                list2 = list2 == null ? C16930sl.A00 : list2;
                boolean z2 = c84923qg2.A0k;
                C75113Zb c75113Zb2 = this.A01;
                if (c75113Zb2 != null) {
                    z = true;
                    if (c75113Zb2.A3b.A00 == EnumC75183Zl.A06) {
                        arrayList2.add(new C51Z(user, str, str2, list2, z2, z, c84923qg2.A0O));
                    }
                }
                z = false;
                arrayList2.add(new C51Z(user, str, str2, list2, z2, z, c84923qg2.A0O));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A03 = arrayList2;
    }
}
