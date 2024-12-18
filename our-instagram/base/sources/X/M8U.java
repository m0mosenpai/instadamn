package X;

import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class M8U implements InterfaceC08830cm {
    public final /* synthetic */ C83403nh A00;
    public final /* synthetic */ C31481er A01;
    public final /* synthetic */ C83693oE A02;
    public final /* synthetic */ C2EY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC08830cm A05;

    public M8U(C83403nh c83403nh, C31481er c31481er, C83693oE c83693oE, C2EY c2ey, String str, InterfaceC08830cm interfaceC08830cm) {
        this.A05 = interfaceC08830cm;
        this.A03 = c2ey;
        this.A00 = c83403nh;
        this.A01 = c31481er;
        this.A04 = str;
        this.A02 = c83693oE;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        Long l;
        Long l2;
        String str;
        Long l3;
        User user = (User) this.A05.get();
        C2EY c2ey = this.A03;
        C83403nh c83403nh = this.A00;
        Object obj = c83403nh.A1T;
        C31481er c31481er = this.A01;
        Long l4 = c31481er.A04;
        long j = c31481er.A00;
        String str2 = this.A04;
        JTa jTa = ((C1OW) c31481er).A02;
        boolean z = jTa.A07;
        L1W l1w = jTa.A00;
        if (l1w != null && (l3 = l1w.A01) != null) {
            l = AbstractC43594JPz.A0q(l3);
        } else {
            l = null;
        }
        L1W l1w2 = ((C1OW) c31481er).A02.A00;
        if (l1w2 != null) {
            l2 = l1w2.A02;
        } else {
            l2 = null;
        }
        if (c83403nh.A1R()) {
            str = c83403nh.A1V;
        } else {
            str = null;
        }
        return C83403nh.A01(null, null, null, this.A02, c2ey, null, user, ((C1OW) c31481er).A02.A01, l4, l, l2, null, obj, null, str2, str, null, null, j, z, true, false);
    }
}
