package X;

import java.util.List;

/* renamed from: X.ItT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42610ItT implements JG6 {
    public final /* synthetic */ HEO A00;

    @Override // X.JG6
    public final AbstractC39655Hik Bsw(C38321qM c38321qM) {
        C39131HKk c39131HKk;
        List list;
        int indexOf;
        C14360o3.A0B(c38321qM, 0);
        Object value = this.A00.A03.A0A.getValue();
        if ((value instanceof C39131HKk) && (c39131HKk = (C39131HKk) value) != null && (list = c39131HKk.A00) != null && (indexOf = list.indexOf(c38321qM.A2u())) != -1) {
            return new HLR(indexOf + 1);
        }
        return HLT.A00;
    }

    public C42610ItT(HEO heo) {
        this.A00 = heo;
    }
}
