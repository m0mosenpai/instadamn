package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MIW extends C0YY implements InterfaceC16660sJ {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIW(EnumC72407Xcu enumC72407Xcu, LoggingContext loggingContext, String str, List list, List list2, Map map, long j) {
        super(1);
        this.A05 = loggingContext;
        this.A00 = j;
        this.A03 = enumC72407Xcu;
        this.A02 = list;
        this.A06 = str;
        this.A01 = list2;
        this.A04 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ?? r1;
        C25531Mh c25531Mh = (C25531Mh) obj;
        ?? c0Zx = new C0Zx();
        LoggingContext loggingContext = (LoggingContext) this.A05;
        AbstractC43594JPz.A1E(c0Zx, loggingContext);
        C0Zx c0Zx2 = new C0Zx();
        c0Zx2.A05("credential_id", Long.valueOf(this.A00));
        JQ1.A0e(c0Zx2, c0Zx, this.A03);
        List list = (List) this.A02;
        if (list != null) {
            r1 = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), r1);
            }
        } else {
            r1 = C16930sl.A00;
        }
        c0Zx.A07("container_ids", r1);
        AbstractC43593JPy.A1L(c0Zx, loggingContext);
        AbstractC43592JPx.A1N(c0Zx, this.A06);
        c0Zx.A07("applied_discounts", (List) this.A01);
        AbstractC43592JPx.A1M(c25531Mh, c0Zx);
        AbstractC43593JPy.A1M(c25531Mh, this.A04);
        return c25531Mh;
    }
}
