package X;

import java.util.List;

/* renamed from: X.BkT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26322BkT extends AbstractC51572Yf {
    public final Integer A00;
    public final List A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        List list = this.A01;
        return new C26401Blk(C51722Yv.A02, new C29462Cyc(this.A00), list);
    }

    public C26322BkT(Integer num, List list) {
        AbstractC167017dG.A1P(list, num);
        this.A01 = list;
        this.A00 = num;
    }
}
