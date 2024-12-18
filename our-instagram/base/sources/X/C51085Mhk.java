package X;

import com.facebook.rtc.views.omnigrid.GridItemType;
import java.util.List;

/* renamed from: X.Mhk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51085Mhk extends AbstractC66542zW {
    public final List A00;
    public final List A01;

    public C51085Mhk(List list, List list2) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        List list = this.A01;
        if (((C51681MsC) list.get(i)).A03 != GridItemType.SELF_VIEW && !C14360o3.A0K(list.get(i), this.A00.get(i2))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return AbstractC167007dF.A1N((((C51681MsC) this.A01.get(i)).A02 > ((C51681MsC) this.A00.get(i2)).A02 ? 1 : (((C51681MsC) this.A01.get(i)).A02 == ((C51681MsC) this.A00.get(i2)).A02 ? 0 : -1)));
    }
}
