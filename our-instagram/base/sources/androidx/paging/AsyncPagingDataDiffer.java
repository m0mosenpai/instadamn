package androidx.paging;

import X.AbstractC53592Nmz;
import X.AbstractC65412xd;
import X.C12W;
import X.C15430py;
import X.C55577OmF;
import X.C55580OmI;
import X.InterfaceC19390xP;
import X.InterfaceC57786PkD;
import X.InterfaceC57789PkG;
import X.InterfaceC65452xh;
import X.MSW;
import X.MSX;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class AsyncPagingDataDiffer {
    public static final AsyncPagingDataDiffer $redex_init_class = null;
    public boolean A00;
    public final AsyncPagingDataDiffer$differBase$1 A01;
    public final InterfaceC57786PkD A02;
    public final AbstractC65412xd A03;
    public final InterfaceC65452xh A04;
    public final AtomicInteger A05;
    public final C12W A06;
    public final InterfaceC19390xP A07;
    public final InterfaceC19390xP A08;
    public final C12W A09;

    static {
        InterfaceC57789PkG interfaceC57789PkG = AbstractC53592Nmz.A00;
        if (interfaceC57789PkG == null) {
            interfaceC57789PkG = new C55580OmI();
        }
        AbstractC53592Nmz.A00 = interfaceC57789PkG;
    }

    public AsyncPagingDataDiffer(AbstractC65412xd abstractC65412xd, InterfaceC65452xh interfaceC65452xh, C12W c12w, C12W c12w2) {
        this.A03 = abstractC65412xd;
        this.A04 = interfaceC65452xh;
        this.A09 = c12w;
        this.A06 = c12w2;
        C55577OmF c55577OmF = new C55577OmF(this);
        this.A02 = c55577OmF;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, c55577OmF, c12w);
        this.A01 = asyncPagingDataDiffer$differBase$1;
        this.A05 = MSW.A1C(0);
        this.A07 = new C15430py(asyncPagingDataDiffer$differBase$1.A0A);
        this.A08 = MSX.A0r(asyncPagingDataDiffer$differBase$1.A09);
    }
}
