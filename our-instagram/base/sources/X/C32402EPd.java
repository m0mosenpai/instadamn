package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.EPd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32402EPd extends C7E1 {
    public final ER0 A00;
    public final ER1 A01;
    public final List A02;
    public final Map A03;
    public final java.util.Set A04;

    public final void A0C(String str, boolean z) {
        FID fid = (FID) this.A03.get(str);
        if (fid != null) {
            fid.A00 = z;
            java.util.Set set = this.A04;
            if (z) {
                set.add(str);
            } else {
                set.remove(str);
            }
            FAg();
        }
    }

    public final void A0D(List list) {
        List list2 = this.A02;
        list2.clear();
        Map map = this.A03;
        map.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                User A15 = AbstractC25226BEj.A15(it);
                FID fid = new FID(A15);
                list2.add(fid);
                map.put(A15.getId(), fid);
            }
            A06();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A08(this.A00, it2.next());
            }
            A07();
        }
    }

    public C32402EPd(FragmentActivity fragmentActivity, ELI eli, ELI eli2, InterfaceC11380iw interfaceC11380iw) {
        ER1 er1 = new ER1(fragmentActivity, eli2);
        this.A01 = er1;
        ER0 er0 = new ER0(eli, interfaceC11380iw);
        this.A00 = er0;
        this.A02 = AbstractC166987dD.A1E();
        this.A04 = AbstractC166987dD.A1H();
        this.A03 = AbstractC166987dD.A1G();
        A0B(er0, er1);
    }
}
