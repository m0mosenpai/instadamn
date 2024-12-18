package X;

import java.io.IOException;

/* renamed from: X.TWf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64839TWf implements InterfaceC65677Tr7 {
    public boolean A00;
    public final C65170Tej A01;
    public final /* synthetic */ TWR A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Tej] */
    public AbstractC64839TWf(TWR twr) {
        this.A02 = twr;
        C63030Sb2 c63030Sb2 = C63030Sb2.A03;
        C63030Sb2 Eq9 = twr.A06.Eq9();
        ?? obj = new Object();
        if (Eq9 != null) {
            obj.A00 = Eq9;
            this.A01 = obj;
            return;
        }
        throw AbstractC166987dD.A12("delegate == null");
    }

    public final void A00() {
        TWR twr = this.A02;
        int i = twr.A00;
        if (i != 6) {
            if (i == 5) {
                C65170Tej c65170Tej = this.A01;
                C63030Sb2 c63030Sb2 = c65170Tej.A00;
                c65170Tej.A00 = C63030Sb2.A03;
                c63030Sb2.A02();
                c63030Sb2.A03();
                twr.A00 = 6;
                return;
            }
            throw AbstractC31175DnJ.A0U("state: ", i);
        }
    }

    @Override // X.InterfaceC65677Tr7
    public long E7q(TWX twx, long j) {
        try {
            return this.A02.A06.E7q(twx, j);
        } catch (IOException e) {
            this.A02.A04.A01();
            A00();
            throw e;
        }
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A01;
    }
}
