package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class P6F implements InterfaceC58123Ppm {
    public final int A00;
    public final int A01;
    public final long A02;
    public final List A03;
    public final InterfaceC09390do A04;

    public P6F(UserSession userSession, int i, int i2, long j) {
        C14360o3.A0B(userSession, 1);
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = C57510Pfk.A00(userSession, 35);
        this.A03 = new CopyOnWriteArrayList();
    }

    @Override // X.InterfaceC58123Ppm
    public final List E8R(Integer num) {
        C14360o3.A0B(num, 0);
        if (num == C05F.A00) {
            return this.A03;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC58123Ppm
    public final int Chj() {
        List list = this.A03;
        list.addAll((Collection) ((C3SZ) this.A04.getValue()).E8D("reels_swipe_history", this.A01).A00);
        return list.size();
    }

    @Override // X.InterfaceC58123Ppm
    public final void FEm(long j, Integer num) {
        AbstractC24641Ih.A02.Ep8(new NH2(this, j));
    }
}
