package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class P6G implements InterfaceC58123Ppm {
    public final int A00;
    public final long A01;
    public final List A02;
    public final List A03;
    public final InterfaceC09390do A04;
    public final int A05;

    public P6G(UserSession userSession, int i, int i2, long j) {
        C14360o3.A0B(userSession, 1);
        this.A01 = j;
        this.A05 = i;
        this.A00 = i2;
        this.A04 = C57510Pfk.A00(userSession, 34);
        this.A02 = new CopyOnWriteArrayList();
        this.A03 = new CopyOnWriteArrayList();
    }

    @Override // X.InterfaceC58123Ppm
    public final List E8R(Integer num) {
        C14360o3.A0B(num, 0);
        if (num == C05F.A00) {
            return this.A02;
        }
        return this.A03;
    }

    @Override // X.InterfaceC58123Ppm
    public final void FEm(long j, Integer num) {
        C14360o3.A0B(num, 0);
        AbstractC24641Ih.A02.Ep8(new NH3(this, num, j));
    }

    @Override // X.InterfaceC58123Ppm
    public final int Chj() {
        List list = this.A02;
        InterfaceC09390do interfaceC09390do = this.A04;
        C3SZ c3sz = (C3SZ) interfaceC09390do.getValue();
        int i = this.A05;
        list.addAll((Collection) c3sz.E8D("iab_reel_swipes", i).A00);
        List list2 = this.A03;
        list2.addAll((Collection) ((C3SZ) interfaceC09390do.getValue()).E8D("profile_reel_swipes", i).A00);
        return AbstractC31172DnG.A02(list2, list.size());
    }
}
